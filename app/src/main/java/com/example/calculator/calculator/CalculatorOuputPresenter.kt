package com.example.calculator.calculator

import bsh.Interpreter

object CalculatorOuputPresenter {

    // Current attached view
   private var mmview:CalculatorOutputInterfaceView? = null

   // Current Equation
   private var mmCurrentEquation: String = ""

   // Current outcome
   private var mmCurrentOutcome: String = ""

   //Interpreter
   private val mmInterpreter = Interpreter()

   fun attach(view: CalculatorOutputInterfaceView){
    mmview = view
   }

    fun detach(){
        mmview = null
    }

    fun add(item:String){
        mmCurrentEquation = mmCurrentEquation.plus(item)
        updateEquation()
        updateOutcome()
        calculateOutcome()
    }
    fun remove(){
    }
    fun solve(){

    }
    fun clear(){

    }

    fun calculateOutcome(){

    }

    private fun updateEquation(){
        mmview?.setEquation(mmCurrentEquation)
    }

    private fun updateOutcome(){
        mmview?.setOutcome(mmCurrentOutcome)
    }

}