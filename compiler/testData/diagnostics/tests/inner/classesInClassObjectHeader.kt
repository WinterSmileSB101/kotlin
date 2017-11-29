class Test {
    @`InnerAnnotation` <!REPEATED_ANNOTATION!>@InnerAnnotation<!>
    companion <!CYCLIC_SCOPES, CYCLIC_SCOPES!>object<!> : StaticClass(), <!UNRESOLVED_REFERENCE, MANY_CLASSES_IN_SUPERTYPE_LIST, DEBUG_INFO_UNRESOLVED_WITH_TARGET!>InnerClass<!>() {

    }

    annotation class InnerAnnotation
    open class <!CYCLIC_SCOPES!>StaticClass<!>

    open inner class <!CYCLIC_SCOPES!>InnerClass<!>
}