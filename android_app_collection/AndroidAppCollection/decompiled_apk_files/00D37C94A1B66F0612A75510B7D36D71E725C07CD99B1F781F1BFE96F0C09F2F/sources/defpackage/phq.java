package defpackage;
/* compiled from: PG */
/* renamed from: phq  reason: default package */
/* loaded from: classes4.dex */
public final class phq {
    public final int a = 0;
    public final int b;
    public final int c;

    static {
        new phq(0, 0);
    }

    public phq(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phq)) {
            return false;
        }
        phq phqVar = (phq) obj;
        int i = phqVar.a;
        return this.b == phqVar.b && this.c == phqVar.c;
    }

    public final int hashCode() {
        return ((this.b + 16337) * 31) + this.c;
    }
}
