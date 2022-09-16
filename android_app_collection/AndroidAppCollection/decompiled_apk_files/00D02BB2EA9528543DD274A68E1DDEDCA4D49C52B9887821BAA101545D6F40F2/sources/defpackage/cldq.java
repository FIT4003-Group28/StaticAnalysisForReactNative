package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cldq  reason: default package */
/* loaded from: classes5.dex */
public final class cldq extends cleb {
    private final long a;
    private final Integer b;
    private final long c;
    private final byte[] d;
    private final String e;
    private final long f;
    private final clei g;

    public cldq(long j, Integer num, long j2, byte[] bArr, String str, long j3, clei cleiVar) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = cleiVar;
    }

    @Override // defpackage.cleb
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cleb
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.cleb
    public final long c() {
        return this.c;
    }

    @Override // defpackage.cleb
    public final byte[] d() {
        return this.d;
    }

    @Override // defpackage.cleb
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        clei cleiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cleb) {
            cleb clebVar = (cleb) obj;
            if (this.a == clebVar.a() && ((num = this.b) != null ? num.equals(clebVar.b()) : clebVar.b() == null) && this.c == clebVar.c()) {
                if (Arrays.equals(this.d, clebVar instanceof cldq ? ((cldq) clebVar).d : clebVar.d()) && ((str = this.e) != null ? str.equals(clebVar.e()) : clebVar.e() == null) && this.f == clebVar.f() && ((cleiVar = this.g) != null ? cleiVar.equals(clebVar.g()) : clebVar.g() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cleb
    public final long f() {
        return this.f;
    }

    @Override // defpackage.cleb
    public final clei g() {
        return this.g;
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        long j2 = this.c;
        String arrays = Arrays.toString(this.d);
        String str = this.e;
        long j3 = this.f;
        String valueOf2 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(length + 204 + length2 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("LogEvent{eventTimeMs=");
        sb.append(j);
        sb.append(", eventCode=");
        sb.append(valueOf);
        sb.append(", eventUptimeMs=");
        sb.append(j2);
        sb.append(", sourceExtension=");
        sb.append(arrays);
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(str);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(j3);
        sb.append(", networkConnectionInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        clei cleiVar = this.g;
        if (cleiVar != null) {
            i2 = cleiVar.hashCode();
        }
        return i3 ^ i2;
    }
}
