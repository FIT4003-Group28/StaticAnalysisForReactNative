package defpackage;
/* compiled from: PG */
/* renamed from: dmvb  reason: default package */
/* loaded from: classes6.dex */
public final class dmvb extends dmvw {
    private final dmvm c = new dmvm(2);
    private final dmvt d = new dmvt();
    private final dmvs e = new dmvs(1);
    private String f = null;
    public final dmvq a = new dmvq();
    private dmun g = null;
    public final dmvq b = new dmvq();
    private dmuy h = null;
    private dmvi i = null;

    public dmvb() {
        new dmuz(this);
        new dmva(this);
    }

    @Override // defpackage.dmvw
    protected final boolean T(int i) {
        return i == 1;
    }

    @Override // defpackage.dmvw
    protected final boolean U(int i, long j) {
        if (i != 1) {
            return false;
        }
        this.d.a(j);
        return true;
    }

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.c.a();
        this.d.b();
        this.e.b();
        this.f = null;
        this.a.a();
        dmun dmunVar = this.g;
        if (dmunVar != null) {
            dmunVar.a();
        }
        this.b.a();
        dmuy dmuyVar = this.h;
        if (dmuyVar != null) {
            dmuyVar.a();
        }
        dmvi dmviVar = this.i;
        if (dmviVar != null) {
            dmviVar.a();
        }
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i != 4) {
            return false;
        }
        this.e.a(i2);
        return true;
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i == 2) {
            this.a.f(i2, i3);
        } else if (i == 3) {
            this.c.e(0, i2, i3);
        } else if (i == 5) {
            this.b.f(i2, i3);
        } else if (i != 6) {
        } else {
            this.c.e(1, i2, i3);
        }
    }

    public final long d() {
        return this.d.a;
    }

    public final int e() {
        return this.a.b;
    }

    public final dmun f(int i) {
        if (this.g == null) {
            this.g = new dmun();
        }
        this.g.R(this.p, this.a.c(i), this.a.d(i));
        return this.g;
    }

    public final int g() {
        return this.b.b;
    }

    public final dmuy h(int i) {
        if (this.h == null) {
            this.h = new dmuy();
        }
        this.h.R(this.p, this.b.c(i), this.b.d(i));
        return this.h;
    }

    public final dmvi k() {
        if (this.i == null) {
            this.i = new dmvi();
        }
        if (!this.c.b(1)) {
            this.i.a();
            return this.i;
        }
        this.i.R(this.p, this.c.c(1), this.c.d(1));
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.d.b) {
            String hexString = Long.toHexString(d());
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 7);
            sb2.append("id: 0x");
            sb2.append(hexString);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        dmvs dmvsVar = this.e;
        if (dmvsVar.b) {
            boolean z = dmvsVar.a != 0;
            StringBuilder sb3 = new StringBuilder(14);
            sb3.append("global: ");
            sb3.append(z);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        if (this.c.b(0)) {
            if (this.f == null) {
                if (this.c.b(0)) {
                    this.f = new String(this.p, this.c.c(0), this.c.d(0), n);
                } else {
                    this.f = "";
                }
            }
            String str = this.f;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 15);
            sb4.append("config_set: \"");
            sb4.append(str);
            sb4.append("\"\n");
            sb.append(sb4.toString());
        }
        for (int i = 0; i < e(); i++) {
            String replace = f(i).toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(replace).length() + 15);
            sb5.append("key_zoom {\n  ");
            sb5.append(replace);
            sb5.append("}\n");
            sb.append(sb5.toString());
        }
        for (int i2 = 0; i2 < g(); i2++) {
            String replace2 = h(i2).toString().replace("\n", "\n  ");
            if (replace2.endsWith("  ")) {
                replace2 = replace2.substring(0, replace2.length() - 2);
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(replace2).length() + 26);
            sb6.append("map_style_key_zooms {\n  ");
            sb6.append(replace2);
            sb6.append("}\n");
            sb.append(sb6.toString());
        }
        if (this.c.b(1)) {
            String replace3 = k().toString().replace("\n", "\n  ");
            if (replace3.endsWith("  ")) {
                replace3 = replace3.substring(0, replace3.length() - 2);
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(replace3).length() + 17);
            sb7.append("sub_styles {\n  ");
            sb7.append(replace3);
            sb7.append("}\n");
            sb.append(sb7.toString());
        }
        return sb.toString();
    }
}
