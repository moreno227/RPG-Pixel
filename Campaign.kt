data class Campaign(
    val id: Int,
    val name: String,
    val description: String,
    val characters: List<String>,
    val currentScene: String,
    val notes: String
)