package defpackage;
/* compiled from: PG */
/* renamed from: bhrr  reason: default package */
/* loaded from: classes3.dex */
final class bhrr extends bhrt {
    private final dgfb a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public bhrr(dgfb dgfbVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = dgfbVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // defpackage.bhrt
    public final dgfb a() {
        return this.a;
    }

    @Override // defpackage.bhrt
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bhrt
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bhrt
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bhrt
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bhrt) {
            bhrt bhrtVar = (bhrt) obj;
            if (this.a.equals(bhrtVar.a()) && this.b == bhrtVar.b() && this.c == bhrtVar.c() && this.d == bhrtVar.d() && this.e == bhrtVar.e() && this.f == bhrtVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bhrt
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        boolean z5 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 168);
        sb.append("SurfaceConfiguration{offeringType=");
        sb.append(valueOf);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(", counterfactualEnabled=");
        sb.append(z2);
        sb.append(", zeroStateEnabled=");
        sb.append(z3);
        sb.append(", zeroStateCounterfactualEnabled=");
        sb.append(z4);
        sb.append(", contributionEnabled=");
        sb.append(z5);
        sb.append("}");
        return sb.toString();
    }
}
