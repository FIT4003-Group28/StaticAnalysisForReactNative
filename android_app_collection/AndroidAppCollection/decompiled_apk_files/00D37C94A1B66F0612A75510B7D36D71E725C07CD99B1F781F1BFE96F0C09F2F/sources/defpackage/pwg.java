package defpackage;
/* compiled from: PG */
/* renamed from: pwg  reason: default package */
/* loaded from: classes4.dex */
final class pwg {
    public final Object a;
    public pvy b = new pvy();
    public boolean c;
    public boolean d;

    public pwg(Object obj) {
        this.a = obj;
    }

    public final void a(pwf pwfVar) {
        this.d = true;
        if (this.c) {
            pwfVar.a(this.a, this.b.a());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((pwg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
