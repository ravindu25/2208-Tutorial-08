object Q1 extends App{
    case class Point(x:Int,y:Int){
        def +(p:Point)=Point(this.x+p.x,this.y+p.y)
        def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
        def distance(p:Point)=math.sqrt(math.pow(this.x-p.x,2)+math.pow(this.y-p.y,2))
        def invert()=Point(this.y,this.x)
    }
    val p1=Point(1,2)
    val p2=Point(3,4)
    println(p1+p2)
    println(p1.move(2,3))
    println(p1.distance(p2))
    println(p1.invert())

}
