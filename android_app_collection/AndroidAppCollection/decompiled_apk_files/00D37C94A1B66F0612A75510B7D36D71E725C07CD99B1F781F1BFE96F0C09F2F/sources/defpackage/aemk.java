package defpackage;
/* compiled from: PG */
/* renamed from: aemk  reason: default package */
/* loaded from: classes.dex */
public final class aemk {
    public final String a;
    public final int b;
    public final String c;
    private final long d;
    private final long e;

    public aemk(String str, int i, long j, long j2, String str2) {
        afms.a(str);
        this.a = str;
        this.b = i;
        this.d = j;
        this.e = j2;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aemk) {
                aemk aemkVar = (aemk) obj;
                return this.a.equals(aemkVar.a) && this.b == aemkVar.b && this.d == aemkVar.d && this.e == aemkVar.e && this.c.equals(aemkVar.c);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.c.hashCode();
        int i = this.b;
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode + 527) * 31) + hashCode2) * 31) + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }
}
