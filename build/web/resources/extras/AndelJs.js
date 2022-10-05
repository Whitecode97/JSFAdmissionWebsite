/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 function Tile(){
      var state ,state2,stage, stage1, stage2,focus;

       state ="none";
       state2 = "block";
//       stage = document.getElementById("st").style.display=state2;
////       truth = stage;
//        stage2= document.getElementById("st2").style.display=state;
  
           stage1 = document.getElementById("st").style.display=state2;
          
     
 }
 
 function can(){
     
     var state ,state2,stage, stage1, stage2,focus;

       state ="none";
       state2 = "block";
       
//       stage = document.getElementById("o").style.;
////       truth = stage;
//        stage2= document.getElementById("st2").style.display=state;
  
           stage1 = document.getElementById("st").style.display=state;
          
     
 }
         


 function swichTile(){
     var state ,state2,stage, stage1, stage2,focus;

       state ="none";
       state2 = "block";
//       stage = document.getElementById("st").style.display=state2;
////       truth = stage;
//        stage2= document.getElementById("st2").style.display=state;
       do{
           stage1 = document.getElementById("st").style.display=state;
           focus=stage1;
           stage2 = document.getElementById("st2").style.display=state2;
       
   }while(focus);
       
         
 }
function cancel(){
    
    
}