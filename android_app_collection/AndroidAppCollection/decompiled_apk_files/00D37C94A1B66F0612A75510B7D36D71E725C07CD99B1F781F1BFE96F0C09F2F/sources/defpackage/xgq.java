package defpackage;
/* compiled from: PG */
/* renamed from: xgq  reason: default package */
/* loaded from: classes4.dex */
public final class xgq {
    private ampq a;
    private ampq b;
    private aoob c;
    private amuk d;
    private Long e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private int j;

    public xgq() {
    }

    public xgq(byte[] bArr) {
        this.a = amon.a;
        this.b = amon.a;
    }

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void c(long j) {
        this.e = Long.valueOf(j);
    }

    public final void d(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void e(ampq ampqVar) {
        if (ampqVar != null) {
            this.b = ampqVar;
            return;
        }
        throw new NullPointerException("Null onClickedRenderer");
    }

    public final void f(ampq ampqVar) {
        if (ampqVar != null) {
            this.a = ampqVar;
            return;
        }
        throw new NullPointerException("Null renderer");
    }

    public final void g(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void h(aoob aoobVar) {
        if (aoobVar != null) {
            this.c = aoobVar;
            return;
        }
        throw new NullPointerException("Null trackingParams");
    }

    public final void i(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void j(amuk amukVar) {
        if (amukVar != null) {
            this.d = amukVar;
            return;
        }
        throw new NullPointerException("Null visualStateChangeTriggers");
    }

    public final void k(int i) {
        if (i != 0) {
            this.j = i;
            return;
        }
        throw new NullPointerException("Null visualState");
    }

    public final xgr a() {
        amuk amukVar;
        int i;
        Long l;
        aoob aoobVar = this.c;
        if (aoobVar == null || (amukVar = this.d) == null || (i = this.j) == 0 || (l = this.e) == null || this.f == null || this.g == null || this.h == null || this.i == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" trackingParams");
            }
            if (this.d == null) {
                sb.append(" visualStateChangeTriggers");
            }
            if (this.j == 0) {
                sb.append(" visualState");
            }
            if (this.e == null) {
                sb.append(" currentPositionMillis");
            }
            if (this.f == null) {
                sb.append(" animate");
            }
            if (this.g == null) {
                sb.append(" fullscreen");
            }
            if (this.h == null) {
                sb.append(" shownLogged");
            }
            if (this.i == null) {
                sb.append(" visualChanged");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xgr(this.a, this.b, aoobVar, amukVar, i, l.longValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue());
    }
}
