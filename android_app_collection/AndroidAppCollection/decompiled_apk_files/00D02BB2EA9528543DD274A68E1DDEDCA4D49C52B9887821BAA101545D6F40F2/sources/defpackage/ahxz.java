package defpackage;
/* compiled from: PG */
/* renamed from: ahxz  reason: default package */
/* loaded from: classes2.dex */
public final class ahxz {
    public final String a;
    public final double b;
    public final double c;

    public ahxz(String str, double d, double d2) {
        dzvx.c(str, "label");
        this.a = str;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ahxz)) {
                return false;
            }
            ahxz ahxzVar = (ahxz) obj;
            return dzvx.d(this.a, ahxzVar.a) && Double.compare(this.b, ahxzVar.b) == 0 && Double.compare(this.c, ahxzVar.c) == 0;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((str != null ? str.hashCode() : 0) * 31) + dekb.a(this.b)) * 31) + dekb.a(this.c);
    }

    public final String toString() {
        return "LocationAlert(label=" + this.a + ", lat=" + this.b + ", lng=" + this.c + ")";
    }
}
