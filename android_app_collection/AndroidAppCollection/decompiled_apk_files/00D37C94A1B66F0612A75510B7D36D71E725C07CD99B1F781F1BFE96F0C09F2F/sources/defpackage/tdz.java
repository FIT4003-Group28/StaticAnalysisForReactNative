package defpackage;
/* compiled from: PG */
/* renamed from: tdz  reason: default package */
/* loaded from: classes4.dex */
public final class tdz {
    public final azqb a;
    public final String b;
    public final tdu c;
    public final tee d;
    public final boolean e;
    public final Object f;
    public final ten g;
    public final boolean h;

    public tdz() {
    }

    public tdz(azqb azqbVar, String str, tdu tduVar, tee teeVar, boolean z, Object obj, ten tenVar, boolean z2) {
        this.a = azqbVar;
        this.b = str;
        this.c = tduVar;
        this.d = teeVar;
        this.e = z;
        this.f = obj;
        this.g = tenVar;
        this.h = z2;
    }

    public static tdy a(tdr tdrVar) {
        tdx tdxVar = new tdx(tdrVar);
        tdy tdyVar = new tdy();
        tdyVar.a = tdxVar;
        tdyVar.b(true);
        tdyVar.c = tdu.a;
        tdyVar.g = true;
        tdyVar.b = "Elements";
        return tdyVar;
    }

    public final boolean equals(Object obj) {
        tee teeVar;
        Object obj2;
        ten tenVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tdz) {
            tdz tdzVar = (tdz) obj;
            if (this.a.equals(tdzVar.a) && this.b.equals(tdzVar.b) && this.c.equals(tdzVar.c) && ((teeVar = this.d) != null ? teeVar.equals(tdzVar.d) : tdzVar.d == null) && this.e == tdzVar.e && ((obj2 = this.f) != null ? obj2.equals(tdzVar.f) : tdzVar.f == null) && ((tenVar = this.g) != null ? tenVar.equals(tdzVar.g) : tdzVar.g == null) && this.h == tdzVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        tee teeVar = this.d;
        int i = 0;
        int i2 = 1237;
        int hashCode2 = (((hashCode ^ (teeVar == null ? 0 : teeVar.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        Object obj = this.f;
        int hashCode3 = (hashCode2 ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        ten tenVar = this.g;
        if (tenVar != null) {
            i = tenVar.hashCode();
        }
        int i3 = (hashCode3 ^ i) * 1000003;
        if (true == this.h) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        boolean z2 = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = "null".length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 193 + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ElementsConfig{converterProvider=");
        sb.append(valueOf);
        sb.append(", layoutExecutor=");
        sb.append("null");
        sb.append(", logTag=");
        sb.append(str);
        sb.append(", perfLoggerFactory=");
        sb.append(valueOf2);
        sb.append(", elementsInteractionLogger=");
        sb.append(valueOf3);
        sb.append(", useIncrementalMount=");
        sb.append(z);
        sb.append(", userData=");
        sb.append(valueOf4);
        sb.append(", recyclerConfig=");
        sb.append(valueOf5);
        sb.append(", nestedScrollingEnabled=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
