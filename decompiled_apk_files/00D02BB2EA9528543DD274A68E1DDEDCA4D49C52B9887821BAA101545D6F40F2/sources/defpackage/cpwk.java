package defpackage;
/* compiled from: PG */
/* renamed from: cpwk  reason: default package */
/* loaded from: classes5.dex */
public final class cpwk<F, S> {
    public final F a;
    public final S b;

    public cpwk(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cpwk)) {
            return false;
        }
        cpwk cpwkVar = (cpwk) obj;
        F f = cpwkVar.a;
        F f2 = this.a;
        if (f == f2) {
            return true;
        }
        return (f.equals(f2) && cpwkVar.b == this.b) || cpwkVar.b.equals(this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
