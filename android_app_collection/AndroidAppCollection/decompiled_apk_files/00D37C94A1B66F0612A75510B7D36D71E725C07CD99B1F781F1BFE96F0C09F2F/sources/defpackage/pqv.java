package defpackage;
/* compiled from: PG */
/* renamed from: pqv  reason: default package */
/* loaded from: classes4.dex */
final class pqv {
    public final int a;
    public final boolean b;

    public pqv(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pqv pqvVar = (pqv) obj;
            if (this.a == pqvVar.a && this.b == pqvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
