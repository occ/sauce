package dev.sauce.fs

case class Blob(data: Array[Byte])

sealed trait FSObject

case class FSRoot(
    version: BigInt,
    rootDirectory: FSDirectory
) extends FSObject

case class FSDirectory(
    name: String,
    parent: FSRoot | FSDirectory,
    children: FSDirectory | FSFile
) extends FSObject

case class FSFile(
    name: String,
    parent: FSDirectory,
    content: Blob
) extends FSObject
