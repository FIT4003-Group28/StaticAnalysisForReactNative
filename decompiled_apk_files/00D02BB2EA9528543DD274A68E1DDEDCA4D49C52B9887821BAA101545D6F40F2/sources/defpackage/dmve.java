package defpackage;
/* compiled from: PG */
/* renamed from: dmve  reason: default package */
/* loaded from: classes6.dex */
public final class dmve extends dmvw {
    private final dmvm c = new dmvm(1);
    public final dmvq a = new dmvq();
    private dmvb d = null;
    public final dmvq b = new dmvq();
    private dmuu e = null;
    private final dmvs f = new dmvs(0);
    private dmvn g = null;

    public dmve() {
        new dmvc(this);
        new dmvd(this);
    }

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.c.a();
        this.a.a();
        dmvb dmvbVar = this.d;
        if (dmvbVar != null) {
            dmvbVar.a();
        }
        this.b.a();
        dmuu dmuuVar = this.e;
        if (dmuuVar != null) {
            dmuuVar.a();
        }
        this.f.b();
        dmvn dmvnVar = this.g;
        if (dmvnVar != null) {
            dmvnVar.b();
        }
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i != 3) {
            return false;
        }
        this.f.a(i2);
        return true;
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i == 1) {
            this.a.f(i2, i3);
        } else if (i == 2) {
            this.b.f(i2, i3);
        } else if (i != 4) {
        } else {
            this.c.e(0, i2, i3);
        }
    }

    public final int d() {
        return this.a.b;
    }

    public final dmvb e(int i) {
        if (this.d == null) {
            this.d = new dmvb();
        }
        this.d.R(this.p, this.a.c(i), this.a.d(i));
        return this.d;
    }

    public final int f() {
        return this.b.b;
    }

    public final dmuu g(int i) {
        if (this.e == null) {
            this.e = new dmuu();
        }
        this.e.R(this.p, this.b.c(i), this.b.d(i));
        return this.e;
    }

    public final dmvn h() {
        if (this.g == null) {
            this.g = new dmvn();
        }
        if (!this.c.b(0)) {
            this.g.a(this.p, 0, 0);
            return this.g;
        }
        this.g.a(this.p, this.c.c(0), this.c.d(0));
        return this.g;
    }

    public final long k(int i) {
        return S(this.a.c(i), this.a.d(i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            String replace = e(i).toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 23);
            sb2.append("multi_zoom_style {\n  ");
            sb2.append(replace);
            sb2.append("}\n");
            sb.append(sb2.toString());
        }
        for (int i2 = 0; i2 < f(); i2++) {
            String replace2 = g(i2).toString().replace("\n", "\n  ");
            if (replace2.endsWith("  ")) {
                replace2 = replace2.substring(0, replace2.length() - 2);
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(replace2).length() + 18);
            sb3.append("named_style {\n  ");
            sb3.append(replace2);
            sb3.append("}\n");
            sb.append(sb3.toString());
        }
        dmvs dmvsVar = this.f;
        if (dmvsVar.b) {
            int i3 = dmvsVar.a;
            StringBuilder sb4 = new StringBuilder(28);
            sb4.append("style_table_id: ");
            sb4.append(i3);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        if (this.c.b(0)) {
            String valueOf = String.valueOf(h());
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb5.append("style_table_consistency_key: \"");
            sb5.append(valueOf);
            sb5.append("\"\n");
            sb.append(sb5.toString());
        }
        return sb.toString();
    }
}
