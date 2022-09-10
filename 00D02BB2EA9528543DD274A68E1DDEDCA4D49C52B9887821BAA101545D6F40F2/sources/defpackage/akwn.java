package defpackage;
/* compiled from: PG */
/* renamed from: akwn  reason: default package */
/* loaded from: classes.dex */
final class akwn extends akwx {
    private final boolean a;
    private final float b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final dwkm f;
    private final int g;
    private final int h;
    private final int i;

    public akwn(boolean z, float f, int i, boolean z2, boolean z3, dwkm dwkmVar, int i2, int i3, int i4) {
        this.a = z;
        this.b = f;
        this.c = i;
        this.d = z2;
        this.e = z3;
        this.f = dwkmVar;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    @Override // defpackage.akwx
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.akwx
    public final float b() {
        return this.b;
    }

    @Override // defpackage.akwx
    public final int c() {
        return this.c;
    }

    @Override // defpackage.akwx
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.akwx
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akwx) {
            akwx akwxVar = (akwx) obj;
            if (this.a == akwxVar.a() && Float.floatToIntBits(this.b) == Float.floatToIntBits(akwxVar.b()) && this.c == akwxVar.c() && this.d == akwxVar.d() && this.e == akwxVar.e() && this.f.equals(akwxVar.f()) && this.g == akwxVar.g() && this.h == akwxVar.h() && this.i == akwxVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akwx
    public final dwkm f() {
        return this.f;
    }

    @Override // defpackage.akwx
    public final int g() {
        return this.g;
    }

    @Override // defpackage.akwx
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int floatToIntBits = ((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        int i2 = (floatToIntBits ^ i) * 1000003;
        dwkm dwkmVar = this.f;
        int i3 = dwkmVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dwkmVar).c(dwkmVar);
            dwkmVar.bC = i3;
        }
        return ((((((i2 ^ i3) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }

    @Override // defpackage.akwx
    public final int i() {
        return this.i;
    }

    public final String toString() {
        boolean z = this.a;
        float f = this.b;
        int i = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        String valueOf = String.valueOf(this.f);
        int i2 = this.g;
        int i3 = this.h;
        int i4 = this.i;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 371);
        sb.append("TileFetchingConfigSettings{renderBuildingsWithoutClippingEnabled=");
        sb.append(z);
        sb.append(", imageMagnificationRatio=");
        sb.append(f);
        sb.append(", trafficTileRefreshPeriodSec=");
        sb.append(i);
        sb.append(", offlineBorderTiles=");
        sb.append(z2);
        sb.append(", disableBaseTileMemoryCache=");
        sb.append(z3);
        sb.append(", tileTypeExpirationParametersProto=");
        sb.append(valueOf);
        sb.append(", psmPertileDurationInMinutes=");
        sb.append(i2);
        sb.append(", pertileDurationInMinutes=");
        sb.append(i3);
        sb.append(", staleOffroadDurationInMinutes=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
