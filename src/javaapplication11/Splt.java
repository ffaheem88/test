/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Arrays;

/**
 *
 * @author ffahe
 */
public class Splt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String content = "<html><head><meta name='viewport' content='width=device-width, initial-scale=1'></head><body onload='loadDoc()'><style>.progress_bar{height: 10px; background: orange; width: 0%; -moz-transition: all 2s ease; -moz-transition-delay: 0s; -webkit-transition: all 2s ease; -webkit-transition-delay: 0s; transition: all 2s ease; transition-delay:0s;}.switch{position: relative; display: inline-block; width: 60px; height: 34px;}.switch input{opacity: 0; width: 0; height: 0;}.slider{position: absolute; cursor: pointer; top: 0; left: 0; right: 0; bottom: 0; background-color: #ccc; -webkit-transition: .4s; transition: .4s;}.slider:before{position: absolute; content: ''; height: 26px; width: 26px; left: 4px; bottom: 4px; background-color: white; -webkit-transition: .4s; transition: .4s;}input:checked + .slider{background-color: #2196F3;}input:focus + .slider{box-shadow: 0 0 1px #2196F3;}input:checked + .slider:before{-webkit-transform: translateX(26px); -ms-transform: translateX(26px); transform: translateX(26px);}/* Rounded sliders */.slider.round{border-radius: 34px;}.slider.round:before{border-radius: 50%;}</style><h1>Top Tank Level</h1><br><h2 id='level'></h2><div id='progressBar' class='progress_bar'></div><br><h1>Bottom Tank Level</h1><br><h2 id='bottomlevel'></h2><div id='progressBar2' class='progress_bar'></div><br><h2>Override System</h2><label class='switch'> <input type='checkbox' id='override' onchange='toggleOverride(this)'> <span class='slider round'></span></label><h2>Motor Status</h2><label class='switch'> <input type='checkbox' id='motor' onchange='toggleMotor(this)'> <span class='slider round'></span></label><br><br>Top Tank Empty (cm): <input type='text' id='toptankempty'><br><button type='button' onclick='SaveTopTankEmpty()'>Save</button><br><br><br>Top Tank Full (cm): <input type='text' id='toptankfull'><br><button type='button' onclick='SaveTopTankFull()'>Save</button><br><br><br>Bottom Tank Empty (cm): <input type='text' id='bottomtankempty'><br><button type='button' onclick='SaveBottomTankEmpty()'>Save</button><br></body><script>var progress=document.getElementById('progressBar'); var progress2=document.getElementById('progressBar2'); function getBottomTankEmpty(){var xhttp=new XMLHttpRequest(); xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){var level=this.responseText; document.getElementById('bottomtankempty').value=level;}}; xhttp.open('GET', 'http://192.168.4.1/GetBottomTankEmpty', true); xhttp.send();}function getTopTankEmpty(){var xhttp=new XMLHttpRequest(); xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){var level=this.responseText; document.getElementById('toptankempty').value=level;}}; xhttp.open('GET', 'http://192.168.4.1/GetTopTankEmpty', true); xhttp.send();}function getTopTankFull(){var xhttp=new XMLHttpRequest(); xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){var level=this.responseText; document.getElementById('toptankfull').value=level;}}; xhttp.open('GET', 'http://192.168.4.1/GetTopTankFull', true); xhttp.send();}function SaveBottomTankEmpty(){var xhttp=new XMLHttpRequest();var val=document.getElementById('bottomtankempty').value; xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){}}; xhttp.open('GET', 'http://192.168.4.1/SetBottomTankEmpty?i='+val, true); xhttp.send();}function SaveTopTankEmpty(){var xhttp=new XMLHttpRequest();var val=document.getElementById('toptankempty').value; xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){}}; xhttp.open('GET', 'http://192.168.4.1/SetTopTankEmpty?i='+val, true); xhttp.send();}function SaveTopTankFull(){var xhttp=new XMLHttpRequest();var val=document.getElementById('toptankfull').value; xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){}}; xhttp.open('GET', 'http://192.168.4.1/SetTopTankFull?i='+val, true); xhttp.send();}function toggleOverride(element){if(element.checked){setOverride('1');}else{setOverride('0');}}function toggleMotor(element){if(element.checked){setMotor('ON');}else{setMotor('OFF');}}function getLevel(){var xhttp=new XMLHttpRequest(); xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){var level=parseInt(this.responseText); document.getElementById('level').innerHTML=level+' cm'; var full=30; var empty=70; level=((level - full)/(empty-full))*100; level=100 - level; progress.style.width=level + '%'; progress.style.backgroundColor='green';}}; xhttp.open('GET', 'http://192.168.4.1/level', true); xhttp.send();}function getBottomLevel(){var xhttp=new XMLHttpRequest(); xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){var level=parseInt(this.responseText); document.getElementById('bottomlevel').innerHTML=level+' cm'; var full=30; var empty=70; level=((level - full)/(empty-full))*100; level=100 - level; progress2.style.width=level + '%'; progress2.style.backgroundColor='green';}}; xhttp.open('GET', 'http://192.168.4.1/getBottomTank', true); xhttp.send();}function getOverride(){var xhttp=new XMLHttpRequest(); xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){var override=this.responseText; if(override==='1'){document.getElementById('override').checked=true;}else{document.getElementById('override').checked=false;}}}; xhttp.open('GET', 'http://192.168.4.1/getOverride', true); xhttp.send();}function getMotor(){var xhttp=new XMLHttpRequest(); xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){var motor=this.responseText; if(motor==='ON'){document.getElementById('motor').checked=true;}else{document.getElementById('motor').checked=false;}}}; xhttp.open('GET', 'http://192.168.4.1/getMotor', true); xhttp.send();}function setMotor(motor){var xhttp=new XMLHttpRequest(); xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){}}; xhttp.open('GET', 'http://192.168.4.1/setMotor?i='+motor, true); xhttp.send();}function setOverride(override){var xhttp=new XMLHttpRequest(); xhttp.onreadystatechange=function(){if (this.readyState==4 && this.status==200){}}; xhttp.open('GET', 'http://192.168.4.1/setOverride?i='+override, true); xhttp.send();}function loadDoc(){getLevel(); getBottomLevel(); getMotor(); getOverride(); getBottomTankEmpty(); getTopTankEmpty(); getTopTankFull();}</script></html>";
        String code = "server.setContentLength("+content.length()+");";
        int x= 0;
        int len = 200;
        while(content.length() > len) {
    System.out.println("static const char mnm"+x+"[] PROGMEM=\""+content.substring(0, len)+"\";");
    content = content.substring(len);
    System.out.println();
    x++;
}
        

        System.out.println("static const char mnm"+x+"[] PROGMEM=\""+content+"\";");
        System.out.println();
        System.out.println(code);
        System.out.println();
        System.out.println("server.send(200,\"text/html\",FPSTR(mnm0));");
        System.out.println();
        for(int i =1;i<x+1;i++){
            System.out.println("server.sendContent(FPSTR(mnm"+i+"));");
            System.out.println();
        }
        
    }
    
}
