package defpackage;
/* compiled from: PG */
/* renamed from: bzcr  reason: default package */
/* loaded from: classes4.dex */
public final class bzcr extends bzcz {
    private final bzdg b;
    private final String c;
    private final eaow d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final int h;
    private final double i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;
    private final int n;

    public bzcr(bzdg bzdgVar, String str, eaow eaowVar, boolean z, int i, boolean z2, int i2, double d, float f, float f2, float f3, float f4, int i3) {
        if (bzdgVar != null) {
            this.b = bzdgVar;
            if (str != null) {
                this.c = str;
                this.d = eaowVar;
                this.e = z;
                this.f = i;
                this.g = z2;
                this.h = i2;
                this.i = d;
                this.j = f;
                this.k = f2;
                this.l = f3;
                this.m = f4;
                this.n = i3;
                return;
            }
            throw new NullPointerException("Null destinationText");
        }
        throw new NullPointerException("Null stage");
    }

    @Override // defpackage.bzdh
    public final bzdg b() {
        return this.b;
    }

    @Override // defpackage.bzdh
    public final String d() {
        return this.c;
    }

    @Override // defpackage.bzdh
    public final eaow e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzcz) {
            bzcz bzczVar = (bzcz) obj;
            if (this.b.equals(bzczVar.b()) && this.c.equals(bzczVar.d()) && this.d.equals(bzczVar.e()) && this.e == bzczVar.o() && this.f == bzczVar.f() && this.g == bzczVar.g() && this.h == bzczVar.h() && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(bzczVar.i()) && Float.floatToIntBits(this.j) == Float.floatToIntBits(bzczVar.j()) && Float.floatToIntBits(this.k) == Float.floatToIntBits(bzczVar.k()) && Float.floatToIntBits(this.l) == Float.floatToIntBits(bzczVar.l()) && Float.floatToIntBits(this.m) == Float.floatToIntBits(bzczVar.m()) && this.n == bzczVar.n()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzcz
    public final int f() {
        return this.f;
    }

    @Override // defpackage.bzcz
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.bzcz
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        return ((((((((((((((hashCode ^ i) * 1000003) ^ this.h) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.i) >>> 32) ^ Double.doubleToLongBits(this.i)))) * 1000003) ^ Float.floatToIntBits(this.j)) * 1000003) ^ Float.floatToIntBits(this.k)) * 1000003) ^ Float.floatToIntBits(this.l)) * 1000003) ^ Float.floatToIntBits(this.m)) * 1000003) ^ this.n;
    }

    @Override // defpackage.bzcz
    public final double i() {
        return this.i;
    }

    @Override // defpackage.bzcz
    public final float j() {
        return this.j;
    }

    @Override // defpackage.bzcz
    public final float k() {
        return this.k;
    }

    @Override // defpackage.bzcz
    public final float l() {
        return this.l;
    }

    @Override // defpackage.bzcz
    public final float m() {
        return this.m;
    }

    @Override // defpackage.bzcz
    public final int n() {
        return this.n;
    }

    @Override // defpackage.bzdh
    public final boolean o() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        boolean z = this.e;
        int i = this.f;
        boolean z2 = this.g;
        int i2 = this.h;
        double d = this.i;
        float f = this.j;
        float f2 = this.k;
        float f3 = this.l;
        float f4 = this.m;
        int i3 = this.n;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 448 + str.length() + String.valueOf(valueOf2).length());
        sb.append("OnBoardState{stage=");
        sb.append(valueOf);
        sb.append(", destinationText=");
        sb.append(str);
        sb.append(", remainingDuration=");
        sb.append(valueOf2);
        sb.append(", toFinalDestination=");
        sb.append(z);
        sb.append(", remainingStopCount=");
        sb.append(i);
        sb.append(", atStop=");
        sb.append(z2);
        sb.append(", metersRemaining=");
        sb.append(i2);
        sb.append(", totalMetersTraveled=");
        sb.append(d);
        sb.append(", userCurrentStopProgress=");
        sb.append(f);
        sb.append(", userCurrentBlockTransferStopProgress=");
        sb.append(f2);
        sb.append(", totalUserProgressRatio=");
        sb.append(f3);
        sb.append(", currentBlockTransferUserProgressRatio=");
        sb.append(f4);
        sb.append(", currentBlockTransferLegInitialStopIndex=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
