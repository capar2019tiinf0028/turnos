package turnos;

//representa uma skill
//o atributo skill é uma função que faz o papel da skill
data class Skill(val nome:String, val skill: (Entidade, ResumoDoTurno) -> Unit)