package defpackage;
/* compiled from: PG */
/* renamed from: dmtn  reason: default package */
/* loaded from: classes.dex */
public final class dmtn extends dmvw {
    private final dmvm b = new dmvm(2);
    public final dmvq a = new dmvq();
    private dmvh c = null;
    private final dmvr d = new dmvr();
    private final dmvs e = new dmvs(0);
    private final dmvs f = new dmvs(0);
    private final dmvs g = new dmvs(0);
    private final dmvs h = new dmvs(0);
    private final dmvs i = new dmvs(0);
    private String j = null;
    private final dmvs k = new dmvs(0);
    private String l = null;
    private final dmvs m = new dmvs(0);
    private final dmvs s = new dmvs(0);
    private final dmvs t = new dmvs(0);
    private final dmvs u = new dmvs(0);
    private final dmvs v = new dmvs(0);

    public dmtn() {
        new dmtm(this);
    }

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.b.a();
        this.a.a();
        dmvh dmvhVar = this.c;
        if (dmvhVar != null) {
            dmvhVar.a();
        }
        this.d.c();
        this.e.b();
        this.f.b();
        this.g.b();
        this.h.b();
        this.i.b();
        this.j = null;
        this.k.b();
        this.l = null;
        this.m.b();
        this.s.b();
        this.t.b();
        this.u.b();
        this.v.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        switch (i) {
            case 2:
                this.f.a(i2);
                return true;
            case 3:
                this.g.a(i2);
                return true;
            case 4:
                this.h.a(i2);
                return true;
            case 5:
                this.i.a(i2);
                return true;
            case 6:
                this.d.a(i2);
                return true;
            case 7:
            case 10:
            default:
                return false;
            case 8:
                this.k.a(i2);
                return true;
            case 9:
                this.e.a(i2);
                return true;
            case 11:
                this.m.a(i2);
                return true;
            case 12:
                this.s.a(i2);
                return true;
            case 13:
                this.t.a(i2);
                return true;
            case 14:
                this.u.a(i2);
                return true;
            case 15:
                this.v.a(i2);
                return true;
        }
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i == 1) {
            this.a.f(i2, i3);
        } else if (i == 7) {
            this.b.e(0, i2, i3);
        } else if (i != 10) {
        } else {
            this.b.e(1, i2, i3);
        }
    }

    public final int d() {
        return this.a.b;
    }

    public final dmvh e(int i) {
        if (this.c == null) {
            this.c = new dmvh();
        }
        this.c.R(this.p, this.a.c(i), this.a.d(i));
        return this.c;
    }

    public final int f() {
        return this.d.b;
    }

    public final int g(int i) {
        return this.d.b(i);
    }

    public final int h() {
        return this.e.a;
    }

    public final int i() {
        return this.f.a;
    }

    public final boolean j() {
        return this.f.b;
    }

    public final int k() {
        return this.g.a;
    }

    public final boolean l() {
        return this.h.a != 0;
    }

    public final boolean m() {
        return this.i.a != 0;
    }

    public final String n() {
        if (this.j == null) {
            this.j = this.b.b(0) ? new String(this.p, this.b.c(0), this.b.d(0), n) : "";
        }
        return this.j;
    }

    public final int o() {
        return this.k.a;
    }

    public final boolean p() {
        return this.k.b;
    }

    public final String q() {
        if (this.l == null) {
            this.l = this.b.b(1) ? new String(this.p, this.b.c(1), this.b.d(1), n) : "";
        }
        return this.l;
    }

    public final int r() {
        return this.m.a;
    }

    public final boolean s() {
        return this.m.b;
    }

    public final int t() {
        return this.s.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            String replace = e(i).toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 19);
            sb2.append("stroke_style {\n  ");
            sb2.append(replace);
            sb2.append("}\n");
            sb.append(sb2.toString());
        }
        for (int i2 = 0; i2 < f(); i2++) {
            int g = g(i2);
            StringBuilder sb3 = new StringBuilder(32);
            sb3.append("stroke_style_index: ");
            sb3.append(g);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        if (this.e.b) {
            int h = h();
            StringBuilder sb4 = new StringBuilder(41);
            sb4.append("stroke_rendering_attributes: ");
            sb4.append(h);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        if (j()) {
            String hexString = Long.toHexString(i() & 4294967295L);
            StringBuilder sb5 = new StringBuilder(String.valueOf(hexString).length() + 20);
            sb5.append("fill_color_argb: 0x");
            sb5.append(hexString);
            sb5.append("\n");
            sb.append(sb5.toString());
        }
        if (this.g.b) {
            int k = k();
            StringBuilder sb6 = new StringBuilder(21);
            sb6.append("z_plane: ");
            sb6.append(k);
            sb6.append("\n");
            sb.append(sb6.toString());
        }
        if (this.h.b) {
            boolean l = l();
            StringBuilder sb7 = new StringBuilder(18);
            sb7.append("stroke_off: ");
            sb7.append(l);
            sb7.append("\n");
            sb.append(sb7.toString());
        }
        if (this.i.b) {
            boolean m = m();
            StringBuilder sb8 = new StringBuilder(16);
            sb8.append("fill_off: ");
            sb8.append(m);
            sb8.append("\n");
            sb.append(sb8.toString());
        }
        if (this.b.b(0)) {
            String n = n();
            StringBuilder sb9 = new StringBuilder(String.valueOf(n).length() + 16);
            sb9.append("texture_url: \"");
            sb9.append(n);
            sb9.append("\"\n");
            sb.append(sb9.toString());
        }
        if (p()) {
            int o = o();
            StringBuilder sb10 = new StringBuilder(38);
            sb10.append("texture_url_prefix_index: ");
            sb10.append(o);
            sb10.append("\n");
            sb.append(sb10.toString());
        }
        if (this.b.b(1)) {
            String q = q();
            StringBuilder sb11 = new StringBuilder(String.valueOf(q).length() + 29);
            sb11.append("configurable_texture_url: \"");
            sb11.append(q);
            sb11.append("\"\n");
            sb.append(sb11.toString());
        }
        if (s()) {
            int r = r();
            StringBuilder sb12 = new StringBuilder(51);
            sb12.append("configurable_texture_url_prefix_index: ");
            sb12.append(r);
            sb12.append("\n");
            sb.append(sb12.toString());
        }
        if (this.s.b) {
            int t = t();
            StringBuilder sb13 = new StringBuilder(26);
            sb13.append("texture_type: ");
            sb13.append(t);
            sb13.append("\n");
            sb.append(sb13.toString());
        }
        if (this.t.b) {
            int u = u();
            StringBuilder sb14 = new StringBuilder(32);
            sb14.append("texture_blend_mode: ");
            sb14.append(u);
            sb14.append("\n");
            sb.append(sb14.toString());
        }
        if (this.u.b) {
            int v = v();
            StringBuilder sb15 = new StringBuilder(33);
            sb15.append("texture_offset_mode: ");
            sb15.append(v);
            sb15.append("\n");
            sb.append(sb15.toString());
        }
        dmvs dmvsVar = this.v;
        if (dmvsVar.b) {
            int i3 = dmvsVar.a;
            StringBuilder sb16 = new StringBuilder(37);
            sb16.append("texture_minimum_version: ");
            sb16.append(i3);
            sb16.append("\n");
            sb.append(sb16.toString());
        }
        return sb.toString();
    }

    public final int u() {
        return this.t.a;
    }

    public final int v() {
        return this.u.a;
    }
}
