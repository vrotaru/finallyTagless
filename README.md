## Finally Tagless for Java

A rewrite to Java of Oleg Kyseliov [Ocaml code](http://okmij.org/ftp/tagless-final/course/final_mod.ml) implementing _Finally Tagless_ idea. If you do not know what it is, you, probably, do not need this.

Not exactly practically usefull, especially, since the encoding of data should be done at _edit time_, and I'm not aware of a practical way to build the required java methods at runtime. Yes, there is the possibility to use [ASM](http://asm.ow2.org/) to build the bytecode dynamically. Doesn't pass the _practicabillity_ tests.

But, still fun.
