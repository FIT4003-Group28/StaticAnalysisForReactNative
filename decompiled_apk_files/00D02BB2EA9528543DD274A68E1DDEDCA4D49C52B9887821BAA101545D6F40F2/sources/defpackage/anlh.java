package defpackage;
/* compiled from: PG */
/* renamed from: anlh  reason: default package */
/* loaded from: classes2.dex */
final class anlh extends annc {
    private final int a;
    private final long b;
    private final long c;
    private final dbsg<Long> d;
    private final boolean e;
    private final boolean f;

    public anlh(int i, long j, long j2, dbsg<Long> dbsgVar, boolean z, boolean z2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = dbsgVar;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.annc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.annc
    public final long b() {
        return this.b;
    }

    @Override // defpackage.annc
    public final long c() {
        return this.c;
    }

    @Override // defpackage.annc
    public final dbsg<Long> d() {
        return this.d;
    }

    @Override // defpackage.annc
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof annc) {
            annc anncVar = (annc) obj;
            if (this.a == anncVar.a() && this.b == anncVar.b() && this.c == anncVar.c() && this.d.equals(anncVar.d()) && this.e == anncVar.e() && this.f == anncVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.annc
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        int i2 = 1237;
        int hashCode = (((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i2 = 1231;
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        String valueOf = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 146);
        sb.append("Item{id=");
        sb.append(i);
        sb.append(", startTimeMillis=");
        sb.append(j);
        sb.append(", endTimeMillis=");
        sb.append(j2);
        sb.append(", checkinTimeMillis=");
        sb.append(valueOf);
        sb.append(", confirmed=");
        sb.append(z);
        sb.append(", ongoing=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
