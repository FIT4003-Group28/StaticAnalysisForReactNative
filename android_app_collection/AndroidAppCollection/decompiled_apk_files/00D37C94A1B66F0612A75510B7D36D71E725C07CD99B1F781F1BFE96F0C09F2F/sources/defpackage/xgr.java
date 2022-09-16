package defpackage;
/* compiled from: PG */
/* renamed from: xgr  reason: default package */
/* loaded from: classes4.dex */
public final class xgr {
    public static final xgr a = b().a();
    public final ampq b;
    public final ampq c;
    public final aoob d;
    public final amuk e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public xgr() {
    }

    public xgr(ampq ampqVar, ampq ampqVar2, aoob aoobVar, amuk amukVar, int i, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = ampqVar;
        this.c = ampqVar2;
        this.d = aoobVar;
        this.e = amukVar;
        this.k = i;
        this.f = j;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public static xgq b() {
        xgq xgqVar = new xgq(null);
        xgqVar.f(amon.a);
        xgqVar.e(amon.a);
        xgqVar.h(aoob.b);
        xgqVar.j(amuk.q());
        xgqVar.k(1);
        xgqVar.c(-1L);
        xgqVar.b(false);
        xgqVar.d(false);
        xgqVar.g(false);
        xgqVar.i(false);
        return xgqVar;
    }

    public final xgq a() {
        xgq b = b();
        b.f(this.b);
        b.e(this.c);
        b.h(this.d);
        b.j(this.e);
        b.k(this.k);
        b.c(this.f);
        b.b(this.g);
        b.d(this.h);
        b.g(this.i);
        b.i(this.j);
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgr) {
            xgr xgrVar = (xgr) obj;
            if (this.b.equals(xgrVar.b) && this.c.equals(xgrVar.c) && this.d.equals(xgrVar.d) && amxp.v(this.e, xgrVar.e)) {
                int i = this.k;
                int i2 = xgrVar.k;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.f == xgrVar.f && this.g == xgrVar.g && this.h == xgrVar.h && this.i == xgrVar.i && this.j == xgrVar.j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = this.k;
        if (i != 0) {
            long j = this.f;
            int i2 = (((hashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
            int i3 = 1237;
            int i4 = (((((i2 ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
            if (true == this.j) {
                i3 = 1231;
            }
            return i4 ^ i3;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int i = this.k;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        long j = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        boolean z3 = this.i;
        boolean z4 = this.j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 224 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(num).length());
        sb.append("AdCtaOverlayState{renderer=");
        sb.append(valueOf);
        sb.append(", onClickedRenderer=");
        sb.append(valueOf2);
        sb.append(", trackingParams=");
        sb.append(valueOf3);
        sb.append(", visualStateChangeTriggers=");
        sb.append(valueOf4);
        sb.append(", visualState=");
        sb.append(num);
        sb.append(", currentPositionMillis=");
        sb.append(j);
        sb.append(", animate=");
        sb.append(z);
        sb.append(", fullscreen=");
        sb.append(z2);
        sb.append(", shownLogged=");
        sb.append(z3);
        sb.append(", visualChanged=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
