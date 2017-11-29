// see https://jetbrains.quip.com/dc5aABhZoaQY

abstract class <!CYCLIC_SCOPES!>DerivedAbstract<!> : C.Base() {
    open class Data
}

public class C {

    open class <!CYCLIC_SCOPES!>Base<!> ()

    class Foo : Data()

    companion <!CYCLIC_SCOPES!>object<!> : DerivedAbstract()
}