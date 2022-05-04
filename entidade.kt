package turnos

//constantes
const val HP_MAX = 100
const val HP_MIN = 0
const val ATCK_BASE_HEROI = 5
const val ATCK_BASE_MONSTRO = 6

//Entidade de jogo vai servir tanto pro monstro quanto pro heroi
data class Entidade(var hp: Int, val ataqueBase:Int, val defesaBase:Int)


fun testeEntidade() {
    val ent1 = Entidade(HP_MAX, 10, 5)
    assert(ent1.hp == HP_MAX && ent1.ataqueBase == 10 && ent1.defesaBase == 5, fun (){println("As entidades não estão funcionando")})
}