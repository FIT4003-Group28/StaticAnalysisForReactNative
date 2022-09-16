package defpackage;
/* compiled from: PG */
/* renamed from: xgu  reason: default package */
/* loaded from: classes4.dex */
public final class xgu {
    public final boolean a;
    public final boolean b;
    public final xhi c;
    public final xhg d;
    public final xgw e;
    public final xhe f;
    public final xha g;
    public final xgy h;
    public final xhc i;
    public final aoob j;
    public final asjj k;
    private final int l;
    private final int m;
    private final int n;

    public xgu() {
    }

    public xgu(boolean z, boolean z2, int i, int i2, int i3, xhi xhiVar, xhg xhgVar, xgw xgwVar, xhe xheVar, xha xhaVar, xgy xgyVar, xhc xhcVar, aoob aoobVar, asjj asjjVar) {
        this.a = z;
        this.b = z2;
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.c = xhiVar;
        this.d = xhgVar;
        this.e = xgwVar;
        this.f = xheVar;
        this.g = xhaVar;
        this.h = xgyVar;
        this.i = xhcVar;
        this.j = aoobVar;
        this.k = asjjVar;
    }

    public static xgt a() {
        xgt xgtVar = new xgt();
        xgtVar.g(false);
        xgtVar.m(false);
        xgtVar.i(-1);
        xgtVar.h(-1);
        xgtVar.j(-1);
        xgtVar.a = xhi.b().a();
        xgtVar.b = xhg.a().a();
        xgtVar.c = xgw.b().a();
        xgtVar.d = xhe.a().a();
        xgtVar.e = xha.a().a();
        xgtVar.f = xgy.b().a();
        xgtVar.g = xhc.b().a();
        xgtVar.n(aoob.b);
        xgtVar.l(asjj.a);
        return xgtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgu) {
            xgu xguVar = (xgu) obj;
            if (this.a == xguVar.a && this.b == xguVar.b && this.l == xguVar.l && this.m == xguVar.m && this.n == xguVar.n && this.c.equals(xguVar.c) && this.d.equals(xguVar.d) && this.e.equals(xguVar.e) && this.f.equals(xguVar.f) && this.g.equals(xguVar.g) && this.h.equals(xguVar.h) && this.i.equals(xguVar.i) && this.j.equals(xguVar.j) && this.k.equals(xguVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return ((((((((((((((((((((((((i2 ^ i) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        int i = this.l;
        int i2 = this.m;
        int i3 = this.n;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 367 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("AdOverlayState{adOverlayShown=");
        sb.append(z);
        sb.append(", overflowMenuShown=");
        sb.append(z2);
        sb.append(", currentPositionMillis=");
        sb.append(i);
        sb.append(", bufferedPositionMillis=");
        sb.append(i2);
        sb.append(", durationMillis=");
        sb.append(i3);
        sb.append(", skipButtonState=");
        sb.append(valueOf);
        sb.append(", mdxAdOverlayState=");
        sb.append(valueOf2);
        sb.append(", adProgressTextState=");
        sb.append(valueOf3);
        sb.append(", learnMoreOverlayState=");
        sb.append(valueOf4);
        sb.append(", adTitleOverlayState=");
        sb.append(valueOf5);
        sb.append(", adReEngagementState=");
        sb.append(valueOf6);
        sb.append(", brandInteractionState=");
        sb.append(valueOf7);
        sb.append(", overlayTrackingParams=");
        sb.append(valueOf8);
        sb.append(", interactionLoggingClientData=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }
}
