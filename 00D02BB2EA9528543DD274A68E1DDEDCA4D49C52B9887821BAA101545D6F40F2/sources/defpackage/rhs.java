package defpackage;
/* compiled from: PG */
/* renamed from: rhs  reason: default package */
/* loaded from: classes7.dex */
public final class rhs {
    public dnki a;

    public rhs(dnki dnkiVar) {
        this.a = dnkiVar;
    }

    public final dnkh a() {
        dnkh b = dnkh.b(this.a.b);
        return b == null ? dnkh.UNKNOWN_SEMANTIC_TYPE : b;
    }

    public final void b(dnkh dnkhVar) {
        dnkf ca = dnki.f.ca(this.a);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dnki dnkiVar = (dnki) ca.b;
        dnkiVar.b = dnkhVar.d;
        dnkiVar.a |= 1;
        this.a = ca.bK();
    }
}
