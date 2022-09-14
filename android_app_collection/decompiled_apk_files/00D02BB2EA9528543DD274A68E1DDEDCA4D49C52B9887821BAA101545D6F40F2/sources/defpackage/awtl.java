package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awtl  reason: default package */
/* loaded from: classes3.dex */
public final class awtl extends awtn {
    public final long a;
    public final long b;
    public final akqq c;
    public final long d;
    public final String e;
    public final String f;
    public final dcdc<String> g;
    public final boolean h;
    public final int i;

    public awtl(long j, long j2, akqq akqqVar, long j3, @dzsi String str, @dzsi String str2, dcdc<String> dcdcVar, int i, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = akqqVar;
        this.d = j3;
        this.e = str;
        this.f = str2;
        this.g = dcdcVar;
        this.i = i;
        this.h = z;
    }

    @Override // defpackage.awtn
    public final long a() {
        return this.a;
    }

    @Override // defpackage.awtn
    public final long b() {
        return this.b;
    }

    @Override // defpackage.awtn
    public final akqq c() {
        return this.c;
    }

    @Override // defpackage.awtn
    public final long d() {
        return this.d;
    }

    @Override // defpackage.awtn
    @dzsi
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof awtn) {
            awtn awtnVar = (awtn) obj;
            if (this.a == awtnVar.a() && this.b == awtnVar.b() && this.c.equals(awtnVar.c()) && this.d == awtnVar.d() && ((str = this.e) != null ? str.equals(awtnVar.e()) : awtnVar.e() == null) && ((str2 = this.f) != null ? str2.equals(awtnVar.f()) : awtnVar.f() == null) && dchl.m(this.g, awtnVar.g())) {
                int i = this.i;
                int j = awtnVar.j();
                if (i == 0) {
                    throw null;
                }
                if (i == j && this.h == awtnVar.h()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.awtn
    @dzsi
    public final String f() {
        return this.f;
    }

    @Override // defpackage.awtn
    public final dcdc<String> g() {
        return this.g;
    }

    @Override // defpackage.awtn
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = this.c.hashCode();
        long j3 = this.d;
        int i = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ hashCode) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        String str = this.e;
        int i2 = 0;
        int hashCode2 = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ i2) * 1000003) ^ this.g.hashCode()) * 1000003;
        int i3 = this.i;
        if (i3 != 0) {
            return (true != this.h ? 1237 : 1231) ^ ((hashCode3 ^ i3) * 1000003);
        }
        throw null;
    }

    @Override // defpackage.awtn
    public final awtm i() {
        return new awtk(this);
    }

    @Override // defpackage.awtn
    public final int j() {
        return this.i;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String valueOf = String.valueOf(this.c);
        long j3 = this.d;
        String str = this.e;
        String str2 = this.f;
        String valueOf2 = String.valueOf(this.g);
        int i = this.i;
        String valueOf3 = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        boolean z = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 238 + length2 + String.valueOf(str2).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("UserParkingLocation{saveTimestampMicros=");
        sb.append(j);
        sb.append(", expirationTimestampMillis=");
        sb.append(j2);
        sb.append(", position=");
        sb.append(valueOf);
        sb.append(", editTimestampMillis=");
        sb.append(j3);
        sb.append(", locationText=");
        sb.append(str);
        sb.append(", notes=");
        sb.append(str2);
        sb.append(", photoUris=");
        sb.append(valueOf2);
        sb.append(", provenance=");
        sb.append(valueOf3);
        sb.append(", hasBeenWrittenToSync=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
