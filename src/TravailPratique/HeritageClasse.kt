package TravailPratique



open class Personne_Classe(var nom:String, var postnom:String, var sexe:String, var adresse:String){
    open fun AffichePers(){

        println("1. Nom : $nom")
        println("2. Post-Nom : $postnom")
        println("3. sexe : $sese")
        println("4. Adresse : $adresse")
    }
}

class  ClasseParent(var function:String,var nombreEnfant:Int):Personne_Classe(nom="Kambale",postnom = "Luseko",sexe = "M",adresse = "Himbi"){
    override fun AffichePers() {
        super.AffichePers()
        println("Fonction= $function")
        println("NombreEnfant:=$nombreEnfant")

    }
}

class  ClasseAgent(var salaireBase:Double,var Grade:String,var Affectation:String):Personne_Classe(nom="Kam",postnom = "Lus",sexe = "M",adresse = "Kyeshero"){
    override fun AffichePers() {
        super.AffichePers()
        println("Salaire: $salaireBase")
        println("Grade : $Grade")
        println("Affectation : $Affectation")
    }
}


fun main(args:Array<String>){

    val pers=Personne_Classe("sifa","tavasimwa","F","Majengo")
    val parent=Personne_Classe("Maintenancier" )
    val agent=Personne_Classe(100.0,"Moyen","Service Informatique")
}