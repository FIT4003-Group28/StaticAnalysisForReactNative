package defpackage;
/* compiled from: PG */
/* renamed from: cpjq  reason: default package */
/* loaded from: classes5.dex */
class cpjq<T> extends cphh {
    private cnph<T> a;

    public cpjq(cnph<T> cnphVar) {
        this.a = cnphVar;
    }

    public final void C(T t) {
        cnph<T> cnphVar = this.a;
        if (cnphVar != null) {
            cnphVar.c(t);
            this.a = null;
        }
    }
}
