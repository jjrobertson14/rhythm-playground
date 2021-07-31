@main def hello: Unit =
    Calc.main(new Array[String](0))

// Try Creating Calc object from (https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html)
object Calc {
    type Environment = String => Int

    abstract class Tree
    case class Derive(tree: Tree) extends Tree
    case class Sum(l: Tree, r: Tree) extends Tree
    case class Var(n: String) extends Tree
    case class Const(v: Int) extends Tree

    def main(args: Array[String]): Unit = {
        val exp: Tree = Sum(Sum(Var("x"), Var("x")), Sum(Const(7), Var("y")))
        val env: Environment = { case "x" => 5 case "y" => 7 }
        println("Expression: " + exp)
        println("Evaluation with x=5, y=7: " + eval(exp, env))
        println("Derivative relative to x:\n " + derive(exp, "x"))
        println("Derivative relative to y:\n " + derive(exp, "y"))
        
        // TODO Now I'll try having the derivation evaluated!
        val deriveExp: Tree = Sum(Sum(Var("x"), Var("x")), Sum(Const(7), Var("y")))
        val deriveEnv: Environment = { case "x" => 5 case "y" => 7 }
        println("\n\n\n\n\n")
        println("Now attempting to evaluate the derivation...")
        println("Expression: " + exp)
        println("Evaluation with x=5, y=7: " + eval(exp, env))
        println("Derivative relative to x:\n " + derive(exp, "x"))
        println("Derivative relative to y:\n " + derive(exp, "y"))
    }
    
    def eval(t: Tree, env: Environment): Int = t match {
        case Sum(l, r) => eval(l, env) + eval(r, env)
        case Var(n)    => env(n)
        case Const(v)  => v
    }

    def derive(t: Tree, v: String): Tree = t match {
        case Sum(l, r) => Sum(derive(l, v), derive(r, v))
        case Var(n) if (v == n) => Const(1)
        case _ => Const(0)
    }
}