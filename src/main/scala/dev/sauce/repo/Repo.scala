package dev.sauce.repo

import java.util.UUID
import dev.sauce.fs.FSRoot

case class Repo(
    id: UUID,
    name: String,
    root: FSRoot
)
