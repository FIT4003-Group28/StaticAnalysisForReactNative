package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: clel  reason: default package */
/* loaded from: classes5.dex */
final class clel extends cles {
    private final String a;
    private final Integer b;
    private final cleq c;
    private final long d;
    private final long e;
    private final Map<String, String> f;

    public clel(String str, Integer num, cleq cleqVar, long j, long j2, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = cleqVar;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    @Override // defpackage.cles
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cles
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.cles
    public final cleq c() {
        return this.c;
    }

    @Override // defpackage.cles
    public final long d() {
        return this.d;
    }

    @Override // defpackage.cles
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cles) {
            cles clesVar = (cles) obj;
            if (this.a.equals(clesVar.a()) && ((num = this.b) != null ? num.equals(clesVar.b()) : clesVar.b() == null) && this.c.equals(clesVar.c()) && this.d == clesVar.d() && this.e == clesVar.e() && this.f.equals(clesVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cles
    public final Map<String, String> f() {
        return this.f;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        long j = this.d;
        long j2 = this.e;
        String valueOf3 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 137 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("EventInternal{transportName=");
        sb.append(str);
        sb.append(", code=");
        sb.append(valueOf);
        sb.append(", encodedPayload=");
        sb.append(valueOf2);
        sb.append(", eventMillis=");
        sb.append(j);
        sb.append(", uptimeMillis=");
        sb.append(j2);
        sb.append(", autoMetadata=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.c.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f.hashCode();
    }
}
