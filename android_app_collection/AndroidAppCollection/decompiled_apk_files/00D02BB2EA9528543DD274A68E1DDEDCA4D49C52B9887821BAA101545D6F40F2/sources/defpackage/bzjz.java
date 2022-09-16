package defpackage;
/* compiled from: PG */
/* renamed from: bzjz  reason: default package */
/* loaded from: classes4.dex */
final class bzjz extends bzkr {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final bzlf i;
    private final int j;
    private final int k;

    public bzjz(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, bzlf bzlfVar, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.k = i;
        this.i = bzlfVar;
        this.j = i2;
    }

    @Override // defpackage.bzkr
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.bzkr
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bzkr
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bzkr
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bzkr
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzkr) {
            bzkr bzkrVar = (bzkr) obj;
            if (this.a == bzkrVar.a() && this.b == bzkrVar.b() && this.c == bzkrVar.c() && this.d == bzkrVar.d() && this.e == bzkrVar.e() && this.f == bzkrVar.f() && this.g == bzkrVar.g() && this.h == bzkrVar.h()) {
                int i = this.k;
                int k = bzkrVar.k();
                if (i == 0) {
                    throw null;
                }
                if (i == k && this.i.equals(bzkrVar.i())) {
                    int i2 = this.j;
                    int j = bzkrVar.j();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i2 == j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bzkr
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.bzkr
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.bzkr
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.h) {
            i = 1231;
        }
        int i3 = (i2 ^ i) * 1000003;
        int i4 = this.k;
        if (i4 != 0) {
            int hashCode = this.i.hashCode();
            int i5 = this.j;
            bzkh.b(i5);
            return ((((i3 ^ i4) * 1000003) ^ hashCode) * 1000003) ^ i5;
        }
        throw null;
    }

    @Override // defpackage.bzkr
    public final bzlf i() {
        return this.i;
    }

    @Override // defpackage.bzkr
    public final int j() {
        return this.j;
    }

    @Override // defpackage.bzkr
    public final int k() {
        return this.k;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        boolean z7 = this.g;
        boolean z8 = this.h;
        int i = this.k;
        String str = i != 1 ? i != 2 ? "null" : "ABSOLUTE" : "RELATIVE";
        String valueOf = String.valueOf(this.i);
        String a = bzkh.a(this.j);
        StringBuilder sb = new StringBuilder(str.length() + 306 + String.valueOf(valueOf).length() + a.length());
        sb.append("Settings{allowDoubleChip=");
        sb.append(z);
        sb.append(", allowSingleChipOnRight=");
        sb.append(z2);
        sb.append(", preferRealtimeToTwoDepartures=");
        sb.append(z3);
        sb.append(", enableExpandedView=");
        sb.append(z4);
        sb.append(", enableRealtime=");
        sb.append(z5);
        sb.append(", enableVehicleOccupancy=");
        sb.append(z6);
        sb.append(", enableAlertsSummaryIcon=");
        sb.append(z7);
        sb.append(", useDestinationSpecificHeader=");
        sb.append(z8);
        sb.append(", departureTimeFormatPolicy=");
        sb.append(str);
        sb.append(", timeFormatSpec=");
        sb.append(valueOf);
        sb.append(", hourDisplayMode=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
