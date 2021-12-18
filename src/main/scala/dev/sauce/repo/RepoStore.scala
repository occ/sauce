package dev.sauce.repo

import dev.sauce.fs.Version

import scala.collection.mutable.{Map => MMap}

// TODO - At some point this should be refactored to something more scalable
case class RepoStore(
    store: MMap[Version, Repo]
)
