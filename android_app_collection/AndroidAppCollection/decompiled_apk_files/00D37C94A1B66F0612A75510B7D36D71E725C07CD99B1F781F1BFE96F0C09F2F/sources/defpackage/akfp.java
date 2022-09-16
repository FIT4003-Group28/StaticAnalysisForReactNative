package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akfp  reason: default package */
/* loaded from: classes.dex */
public final class akfp implements akew {
    public View a;
    public CharSequence b;
    public CharSequence c;
    public apoj d;
    public apoj e;
    public akev f;
    public View.OnClickListener g;
    public akfz h;
    private Boolean i;
    private Integer j;
    private Boolean k;
    private Integer l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Float p;
    private ampq q;
    private ampq r;

    public akfp() {
    }

    public akfp(byte[] bArr) {
        this.q = amon.a;
        this.r = amon.a;
    }

    public final void b(ampq ampqVar) {
        if (ampqVar != null) {
            this.r = ampqVar;
            return;
        }
        throw new NullPointerException("Null acceptFeedbackOnTargetTapEnabled");
    }

    public final void c(int i) {
        this.o = Integer.valueOf(i);
    }

    public final void d(ampq ampqVar) {
        if (ampqVar != null) {
            this.q = ampqVar;
            return;
        }
        throw new NullPointerException("Null backgroundColor");
    }

    public final void e(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void f(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void g(float f) {
        this.p = Float.valueOf(f);
    }

    public final void h(int i) {
        this.n = Integer.valueOf(i);
    }

    @Override // defpackage.akew
    public final /* bridge */ /* synthetic */ void i(int i) {
        throw null;
    }

    public final void j(int i) {
        this.l = Integer.valueOf(i);
    }

    public final void k(int i) {
        this.m = Integer.valueOf(i);
    }

    public final /* bridge */ /* synthetic */ void l() {
        this.k = false;
    }

    public final akfq a() {
        Boolean bool = this.i;
        if (bool == null || this.j == null || this.k == null || this.l == null || this.m == null || this.n == null || this.o == null || this.p == null) {
            StringBuilder sb = new StringBuilder();
            if (this.i == null) {
                sb.append(" counterfactual");
            }
            if (this.j == null) {
                sb.append(" duration");
            }
            if (this.k == null) {
                sb.append(" rateLimited");
            }
            if (this.l == null) {
                sb.append(" tapDismissalType");
            }
            if (this.m == null) {
                sb.append(" targetEffectType");
            }
            if (this.n == null) {
                sb.append(" placement");
            }
            if (this.o == null) {
                sb.append(" alignment");
            }
            if (this.p == null) {
                sb.append(" maxWidthPercentage");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new akfq(bool.booleanValue(), this.j.intValue(), this.k.booleanValue(), this.a, this.b, this.c, this.d, this.e, this.l.intValue(), this.m.intValue(), this.n.intValue(), this.o.intValue(), this.p.floatValue(), this.q, this.r, this.f, this.g, this.h);
    }
}
