package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: ahuy  reason: default package */
/* loaded from: classes2.dex */
class ahuy extends ahwn {
    public final Profile a;
    public final doep b;
    public final long c;
    public final long d;
    public final long e;
    public final dcdc<dqzv> f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final dbsg<String> j;
    private final dbsg<ahvj> k;
    private final boolean l;
    private final boolean m;

    public ahuy(Profile profile, doep doepVar, dbsg<ahvj> dbsgVar, long j, long j2, long j3, dcdc<dqzv> dcdcVar, boolean z, boolean z2, boolean z3, long j4, boolean z4, dbsg<String> dbsgVar2) {
        if (profile != null) {
            this.a = profile;
            if (doepVar != null) {
                this.b = doepVar;
                if (dbsgVar != null) {
                    this.k = dbsgVar;
                    this.c = j;
                    this.d = j2;
                    this.e = j3;
                    if (dcdcVar != null) {
                        this.f = dcdcVar;
                        this.g = z;
                        this.l = z2;
                        this.m = z3;
                        this.h = j4;
                        this.i = z4;
                        if (dbsgVar2 != null) {
                            this.j = dbsgVar2;
                            return;
                        }
                        throw new NullPointerException("Null link");
                    }
                    throw new NullPointerException("Null shareAcls");
                }
                throw new NullPointerException("Null journey");
            }
            throw new NullPointerException("Null sharedUserLocation");
        }
        throw new NullPointerException("Null profile");
    }

    @Override // defpackage.ahwn, defpackage.ahwl
    public final Profile a() {
        return this.a;
    }

    @Override // defpackage.ahwn, defpackage.ahwl
    public final doep b() {
        return this.b;
    }

    @Override // defpackage.ahwn
    public final dbsg<ahvj> c() {
        return this.k;
    }

    @Override // defpackage.ahwn, defpackage.ahwl
    public final long d() {
        return this.c;
    }

    @Override // defpackage.ahwn, defpackage.ahwl
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahwn) {
            ahwn ahwnVar = (ahwn) obj;
            if (this.a.equals(ahwnVar.a()) && this.b.equals(ahwnVar.b()) && this.k.equals(ahwnVar.c()) && this.c == ahwnVar.d() && this.d == ahwnVar.e() && this.e == ahwnVar.f() && dchl.m(this.f, ahwnVar.g()) && this.g == ahwnVar.h() && this.l == ahwnVar.i() && this.m == ahwnVar.j() && this.h == ahwnVar.k() && this.i == ahwnVar.l() && this.j.equals(ahwnVar.m())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ahwn, defpackage.ahwl
    public final long f() {
        return this.e;
    }

    @Override // defpackage.ahwn, defpackage.ahwl
    public final dcdc<dqzv> g() {
        return this.f;
    }

    @Override // defpackage.ahwn
    public final boolean h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        doep doepVar = this.b;
        int i = doepVar.bC;
        if (i == 0) {
            i = dsst.a.b(doepVar).c(doepVar);
            doepVar.bC = i;
        }
        int hashCode2 = this.k.hashCode();
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        int hashCode3 = (((((((((((hashCode ^ i) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f.hashCode()) * 1000003;
        int i2 = 1237;
        int i3 = (((hashCode3 ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003;
        int i4 = true != this.m ? 1237 : 1231;
        long j4 = this.h;
        int i5 = (((i3 ^ i4) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        if (true == this.i) {
            i2 = 1231;
        }
        return ((i5 ^ i2) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.ahwn, defpackage.ahwl
    public final boolean i() {
        return this.l;
    }

    @Override // defpackage.ahwn
    public final boolean j() {
        return this.m;
    }

    @Override // defpackage.ahwn
    public final long k() {
        return this.h;
    }

    @Override // defpackage.ahwn, defpackage.ahwl
    public final boolean l() {
        return this.i;
    }

    @Override // defpackage.ahwn, defpackage.ahwl
    public final dbsg<String> m() {
        return this.j;
    }

    @Override // defpackage.ahwn
    public final ahwm n() {
        return new ahux(this);
    }
}
