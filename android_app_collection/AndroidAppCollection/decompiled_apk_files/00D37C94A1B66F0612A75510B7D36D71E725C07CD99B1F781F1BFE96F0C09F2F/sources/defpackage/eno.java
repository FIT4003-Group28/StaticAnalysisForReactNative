package defpackage;
/* compiled from: PG */
/* renamed from: eno  reason: default package */
/* loaded from: classes3.dex */
public final class eno {
    final String a;
    final Class b;
    private int c;

    public eno(String str, Class cls) {
        this.a = amps.d(str);
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eno)) {
            return false;
        }
        eno enoVar = (eno) obj;
        return this.a.equals(enoVar.a) && this.b.equals(enoVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }
}
