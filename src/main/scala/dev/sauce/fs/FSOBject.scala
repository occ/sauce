package dev.sauce.fs

import scala.collection.mutable.ListBuffer

// TODO - Likely source of OOMs. Blobs should support streams in the future.
case class Blob(data: Array[Byte])

sealed trait FSObject

case class FSRoot(
    version: BigInt,
    rootDirectory: FSDirectory
) extends FSObject

case class FSDirectory(
    name: String,
    parent: FSRoot | FSDirectory,
    children: ListBuffer[FSDirectory | FSFile]
) extends FSObject

case class FSFile(
    name: String,
    parent: FSDirectory,
    content: Blob
) extends FSObject
