package defpackage;
/* compiled from: PG */
/* renamed from: cpsf  reason: default package */
/* loaded from: classes5.dex */
public final class cpsf<D> {
    public D a;
    public D b;

    public cpsf(D d, D d2) {
        b(d, d2);
    }

    public final cpsf<D> a() {
        return new cpsf<>(this.a, this.b);
    }

    public final void b(D d, D d2) {
        this.a = (D) cpwl.a(d);
        this.b = (D) cpwl.a(d2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cpsf) {
            cpsf cpsfVar = (cpsf) obj;
            if (this.a.equals(cpsfVar.a) && this.b.equals(cpsfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("[%s, %s]", this.a.toString(), this.b.toString());
    }
}
