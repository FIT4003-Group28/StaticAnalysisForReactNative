package defpackage;
/* compiled from: PG */
/* renamed from: xgt  reason: default package */
/* loaded from: classes4.dex */
public final class xgt {
    public xhi a;
    public xhg b;
    public xgw c;
    public xhe d;
    public xha e;
    public xgy f;
    public xhc g;
    private Boolean h;
    private Boolean i;
    private Integer j;
    private Integer k;
    private Integer l;
    private aoob m;
    private asjj n;

    public final xgw b() {
        xgw xgwVar = this.c;
        if (xgwVar != null) {
            return xgwVar;
        }
        throw new IllegalStateException("Property \"adProgressTextState\" has not been set");
    }

    public final xgy c() {
        xgy xgyVar = this.f;
        if (xgyVar != null) {
            return xgyVar;
        }
        throw new IllegalStateException("Property \"adReEngagementState\" has not been set");
    }

    public final xhc d() {
        xhc xhcVar = this.g;
        if (xhcVar != null) {
            return xhcVar;
        }
        throw new IllegalStateException("Property \"brandInteractionState\" has not been set");
    }

    public final xhe e() {
        xhe xheVar = this.d;
        if (xheVar != null) {
            return xheVar;
        }
        throw new IllegalStateException("Property \"learnMoreOverlayState\" has not been set");
    }

    public final xhi f() {
        xhi xhiVar = this.a;
        if (xhiVar != null) {
            return xhiVar;
        }
        throw new IllegalStateException("Property \"skipButtonState\" has not been set");
    }

    public final void g(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void h(int i) {
        this.k = Integer.valueOf(i);
    }

    public final void i(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void j(int i) {
        this.l = Integer.valueOf(i);
    }

    public final void k() {
        g(false);
        m(false);
        i(-1);
        h(-1);
        j(-1);
        this.a = xhi.b().a();
        this.c = xgw.b().a();
        this.d = xhe.a().a();
        this.e = xha.a().a();
        this.f = xgy.b().a();
        this.g = xhc.b().a();
        n(aoob.b);
        l(asjj.a);
    }

    public final void l(asjj asjjVar) {
        if (asjjVar != null) {
            this.n = asjjVar;
            return;
        }
        throw new NullPointerException("Null interactionLoggingClientData");
    }

    public final void m(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void n(aoob aoobVar) {
        if (aoobVar != null) {
            this.m = aoobVar;
            return;
        }
        throw new NullPointerException("Null overlayTrackingParams");
    }

    public final xgu a() {
        Boolean bool = this.h;
        if (bool == null || this.i == null || this.j == null || this.k == null || this.l == null || this.a == null || this.b == null || this.c == null || this.d == null || this.e == null || this.f == null || this.g == null || this.m == null || this.n == null) {
            StringBuilder sb = new StringBuilder();
            if (this.h == null) {
                sb.append(" adOverlayShown");
            }
            if (this.i == null) {
                sb.append(" overflowMenuShown");
            }
            if (this.j == null) {
                sb.append(" currentPositionMillis");
            }
            if (this.k == null) {
                sb.append(" bufferedPositionMillis");
            }
            if (this.l == null) {
                sb.append(" durationMillis");
            }
            if (this.a == null) {
                sb.append(" skipButtonState");
            }
            if (this.b == null) {
                sb.append(" mdxAdOverlayState");
            }
            if (this.c == null) {
                sb.append(" adProgressTextState");
            }
            if (this.d == null) {
                sb.append(" learnMoreOverlayState");
            }
            if (this.e == null) {
                sb.append(" adTitleOverlayState");
            }
            if (this.f == null) {
                sb.append(" adReEngagementState");
            }
            if (this.g == null) {
                sb.append(" brandInteractionState");
            }
            if (this.m == null) {
                sb.append(" overlayTrackingParams");
            }
            if (this.n == null) {
                sb.append(" interactionLoggingClientData");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xgu(bool.booleanValue(), this.i.booleanValue(), this.j.intValue(), this.k.intValue(), this.l.intValue(), this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.m, this.n);
    }
}
