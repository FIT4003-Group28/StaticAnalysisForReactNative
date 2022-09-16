package defpackage;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
/* compiled from: PG */
/* renamed from: fsw  reason: default package */
/* loaded from: classes3.dex */
public final class fsw {
    public fsh a;
    public fsk b;
    public fsp c;
    public fsr d;
    public Object e;
    private fsa f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private ActionBarColor j;
    private ActionBarColor k;
    private Integer l;
    private ActionBarColor m;
    private Integer n;
    private ActionBarColor o;
    private ActionBarColor p;

    public fsw() {
    }

    public fsw(fsx fsxVar) {
        this.f = fsxVar.a;
        this.a = fsxVar.b;
        this.b = fsxVar.c;
        this.c = fsxVar.d;
        this.d = fsxVar.e;
        this.g = Boolean.valueOf(fsxVar.f);
        this.h = Boolean.valueOf(fsxVar.g);
        this.e = fsxVar.h;
        this.i = Boolean.valueOf(fsxVar.i);
        this.j = fsxVar.j;
        this.k = fsxVar.k;
        this.l = Integer.valueOf(fsxVar.l);
        this.m = fsxVar.m;
        this.n = Integer.valueOf(fsxVar.n);
        this.o = fsxVar.o;
        this.p = fsxVar.p;
    }

    public final void b(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.j = actionBarColor;
            return;
        }
        throw new NullPointerException("Null backgroundColor");
    }

    public final void c(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void e(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.p = actionBarColor;
            return;
        }
        throw new NullPointerException("Null indicatorColor");
    }

    public final void f(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final void g(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.m = actionBarColor;
            return;
        }
        throw new NullPointerException("Null primaryTextColor");
    }

    public final void h(int i) {
        this.l = Integer.valueOf(i);
    }

    public final void i(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.o = actionBarColor;
            return;
        }
        throw new NullPointerException("Null secondaryTextColor");
    }

    public final void j(int i) {
        this.n = Integer.valueOf(i);
    }

    public final void k(ActionBarColor actionBarColor) {
        if (actionBarColor != null) {
            this.k = actionBarColor;
            return;
        }
        throw new NullPointerException("Null statusBarColor");
    }

    public final void l(fsa fsaVar) {
        if (fsaVar != null) {
            this.f = fsaVar;
            return;
        }
        throw new NullPointerException("Null actionBarModel");
    }

    public final void m(ampg ampgVar) {
        fsa fsaVar = this.f;
        if (fsaVar == null) {
            throw new IllegalStateException("Property \"actionBarModel\" has not been set");
        }
        l(((frz) ampgVar.apply(new frz(fsaVar))).a());
    }

    public final fsx a() {
        Boolean bool;
        fsa fsaVar = this.f;
        if (fsaVar == null || (bool = this.g) == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null || this.n == null || this.o == null || this.p == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" actionBarModel");
            }
            if (this.g == null) {
                sb.append(" enableTranslucentActionBar");
            }
            if (this.h == null) {
                sb.append(" hideTitleOnTranslucentActionBar");
            }
            if (this.i == null) {
                sb.append(" isHeaderRendererCollapsible");
            }
            if (this.j == null) {
                sb.append(" backgroundColor");
            }
            if (this.k == null) {
                sb.append(" statusBarColor");
            }
            if (this.l == null) {
                sb.append(" primaryTextStyleResId");
            }
            if (this.m == null) {
                sb.append(" primaryTextColor");
            }
            if (this.n == null) {
                sb.append(" secondaryTextStyleResId");
            }
            if (this.o == null) {
                sb.append(" secondaryTextColor");
            }
            if (this.p == null) {
                sb.append(" indicatorColor");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new fsx(fsaVar, this.a, this.b, this.c, this.d, bool.booleanValue(), this.h.booleanValue(), this.e, this.i.booleanValue(), this.j, this.k, this.l.intValue(), this.m, this.n.intValue(), this.o, this.p);
    }
}
