package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: clds  reason: default package */
/* loaded from: classes5.dex */
public final class clds extends cled {
    private final long a;
    private final long b;
    private final cldz c;
    private final Integer d;
    private final String e;
    private final List<cleb> f;
    private final clej g;

    public clds(long j, long j2, cldz cldzVar, Integer num, String str, List<cleb> list, clej clejVar) {
        this.a = j;
        this.b = j2;
        this.c = cldzVar;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = clejVar;
    }

    @Override // defpackage.cled
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cled
    public final long b() {
        return this.b;
    }

    @Override // defpackage.cled
    public final cldz c() {
        return this.c;
    }

    @Override // defpackage.cled
    public final Integer d() {
        return this.d;
    }

    @Override // defpackage.cled
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        cldz cldzVar;
        Integer num;
        String str;
        List<cleb> list;
        clej clejVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cled) {
            cled cledVar = (cled) obj;
            if (this.a == cledVar.a() && this.b == cledVar.b() && ((cldzVar = this.c) != null ? cldzVar.equals(cledVar.c()) : cledVar.c() == null) && ((num = this.d) != null ? num.equals(cledVar.d()) : cledVar.d() == null) && ((str = this.e) != null ? str.equals(cledVar.e()) : cledVar.e() == null) && ((list = this.f) != null ? list.equals(cledVar.f()) : cledVar.f() == null) && ((clejVar = this.g) != null ? clejVar.equals(cledVar.g()) : cledVar.g() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cled
    public final List<cleb> f() {
        return this.f;
    }

    @Override // defpackage.cled
    public final clej g() {
        return this.g;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        cldz cldzVar = this.c;
        int i2 = 0;
        int hashCode = (i ^ (cldzVar == null ? 0 : cldzVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<cleb> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        clej clejVar = this.g;
        if (clejVar != null) {
            i2 = clejVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str = this.e;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 147 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("LogRequest{requestTimeMs=");
        sb.append(j);
        sb.append(", requestUptimeMs=");
        sb.append(j2);
        sb.append(", clientInfo=");
        sb.append(valueOf);
        sb.append(", logSource=");
        sb.append(valueOf2);
        sb.append(", logSourceName=");
        sb.append(str);
        sb.append(", logEvents=");
        sb.append(valueOf3);
        sb.append(", qosTier=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
