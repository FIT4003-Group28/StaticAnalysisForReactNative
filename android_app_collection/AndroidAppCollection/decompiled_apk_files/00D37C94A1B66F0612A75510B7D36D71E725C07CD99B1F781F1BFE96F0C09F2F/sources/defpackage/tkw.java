package defpackage;

import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tkw  reason: default package */
/* loaded from: classes4.dex */
public final class tkw {
    public Rect a;
    public Rect b;
    public Integer c;
    private Double d;
    private Double e;
    private Double f;
    private Double g;
    private Double h;
    private Double i;
    private Double j;
    private Double k;
    private Double l;
    private amuk m;

    public final void b(double d) {
        this.d = Double.valueOf(d);
    }

    public final void c(double d) {
        this.e = Double.valueOf(d);
    }

    public final void d(double d) {
        this.k = Double.valueOf(d);
    }

    public final void e(double d) {
        this.h = Double.valueOf(d);
    }

    public final void f(double d) {
        this.f = Double.valueOf(d);
    }

    public final void g(double d) {
        this.l = Double.valueOf(d);
    }

    public final void h(double d) {
        this.i = Double.valueOf(d);
    }

    public final void i(amuk amukVar) {
        if (amukVar != null) {
            this.m = amukVar;
            return;
        }
        throw new NullPointerException("Null mtosBuckets");
    }

    public final void j(double d) {
        this.j = Double.valueOf(d);
    }

    public final void k(double d) {
        this.g = Double.valueOf(d);
    }

    public final tkx a() {
        Double d = this.d;
        if (d == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" exposure");
            }
            if (this.e == null) {
                sb.append(" maxExposure");
            }
            if (this.f == null) {
                sb.append(" minExposure");
            }
            if (this.g == null) {
                sb.append(" volume");
            }
            if (this.h == null) {
                sb.append(" maxVolume");
            }
            if (this.i == null) {
                sb.append(" minVolume");
            }
            if (this.j == null) {
                sb.append(" screenShare");
            }
            if (this.k == null) {
                sb.append(" maxScreenShare");
            }
            if (this.l == null) {
                sb.append(" minScreenShare");
            }
            if (this.m == null) {
                sb.append(" mtosBuckets");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new tkx(d.doubleValue(), this.e.doubleValue(), this.f.doubleValue(), this.g.doubleValue(), this.h.doubleValue(), this.i.doubleValue(), this.j.doubleValue(), this.k.doubleValue(), this.l.doubleValue(), this.a, this.b, this.c, this.m);
    }
}
