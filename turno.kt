//resumo do turno vai ser aqui que no final de cada 
//obs:O ataque daqui é o do turno
package turnos

data class ResumoDoTurno(var numDoTurno: Int, var ataqueMonstro:Int, var ataqueHeroi:Int, var defesaMonstro:Int, var defesaHeroi:Int)


//na finalização do turno o número do turno
//deve ser incrementado por 1 e os ataques
//devem ser descontados da defesa
//e no final o ResumoDoTurno deve voltar aos
//valores padrão
fun finalizarTurno(resumo: ResumoDoTurno, heroi:Entidade, inimigo: Entidade) {
    //incrementado o turno
    resumo.numDoTurno++

    //Aplicando os danos do turno
    heroi.hp -= resumo.ataqueHeroi  - resumo.defesaMonstro
    inimigo.hp -= resumo.ataqueMonstro - resumo.defesaHeroi


    //preparando para o proximo turno
    resumo.ataqueMonstro = 0
    resumo.ataqueHeroi = 0
    resumo.defesaMonstro = 0
    resumo.defesaHeroi = 0

}