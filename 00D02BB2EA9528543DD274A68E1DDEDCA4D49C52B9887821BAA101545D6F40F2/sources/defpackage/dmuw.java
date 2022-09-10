package defpackage;
/* compiled from: PG */
/* renamed from: dmuw  reason: default package */
/* loaded from: classes.dex */
public final class dmuw extends dmvw {
    private final dmvm b = new dmvm(2);
    public final dmvq a = new dmvq();
    private dmvh c = null;
    private final dmvr d = new dmvr();
    private final dmvs e = new dmvs(0);
    private final dmvs f = new dmvs(0);
    private final dmvs g = new dmvs(0);
    private final dmvs h = new dmvs(0);
    private String i = null;
    private final dmvs j = new dmvs(0);
    private String k = null;
    private final dmvs l = new dmvs(0);
    private final dmvs m = new dmvs(0);
    private final dmvs s = new dmvs(0);
    private final dmvs t = new dmvs(0);

    public dmuw() {
        new dmuv(this);
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
        this.i = null;
        this.j.b();
        this.k = null;
        this.l.b();
        this.m.b();
        this.s.b();
        this.t.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        switch (i) {
            case 2:
                this.e.a(i2);
                return true;
            case 3:
                this.f.a(i2);
                return true;
            case 4:
                this.g.a(i2);
                return true;
            case 5:
                this.h.a(i2);
                return true;
            case 6:
            case 7:
            case 9:
            default:
                return false;
            case 8:
                this.j.a(i2);
                return true;
            case 10:
                this.l.a(i2);
                return true;
            case 11:
                this.m.a(i2);
                return true;
            case 12:
                this.t.a(i2);
                return true;
            case 13:
                this.s.a(i2);
                return true;
        }
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i == 1) {
            this.a.f(i2, i3);
        } else if (i == 9) {
            this.b.e(1, i2, i3);
        } else if (i == 6) {
            P(this.p, i2, i3, this.d);
        } else if (i != 7) {
        } else {
            this.b.e(0, i2, i3);
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
        return this.g.a;
    }

    public final boolean k() {
        return this.h.a != 0;
    }

    public final String l() {
        if (this.i == null) {
            this.i = this.b.b(0) ? new String(this.p, this.b.c(0), this.b.d(0), n) : "";
        }
        return this.i;
    }

    public final boolean m() {
        return this.b.b(0);
    }

    public final String n() {
        if (this.k == null) {
            this.k = this.b.b(1) ? new String(this.p, this.b.c(1), this.b.d(1), n) : "";
        }
        return this.k;
    }

    public final boolean o() {
        return this.b.b(1);
    }

    public final float p() {
        return Float.intBitsToFloat(this.m.a);
    }

    public final boolean q() {
        return this.m.b;
    }

    public final float r() {
        return Float.intBitsToFloat(this.s.a);
    }

    public final boolean s() {
        return this.s.b;
    }

    public final int t() {
        return this.t.a;
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
        dmvs dmvsVar = this.e;
        if (dmvsVar.b) {
            String hexString = Long.toHexString(dmvsVar.a & 4294967295L);
            StringBuilder sb4 = new StringBuilder(String.valueOf(hexString).length() + 21);
            sb4.append("arrow_color_argb: 0x");
            sb4.append(hexString);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        dmvs dmvsVar2 = this.f;
        if (dmvsVar2.b) {
            int i3 = dmvsVar2.a;
            StringBuilder sb5 = new StringBuilder(25);
            sb5.append("arrow_width: ");
            sb5.append(i3);
            sb5.append("\n");
            sb.append(sb5.toString());
        }
        if (this.g.b) {
            int h = h();
            StringBuilder sb6 = new StringBuilder(21);
            sb6.append("z_plane: ");
            sb6.append(h);
            sb6.append("\n");
            sb.append(sb6.toString());
        }
        if (this.h.b) {
            boolean k = k();
            StringBuilder sb7 = new StringBuilder(11);
            sb7.append("off: ");
            sb7.append(k);
            sb7.append("\n");
            sb.append(sb7.toString());
        }
        if (m()) {
            String l = l();
            StringBuilder sb8 = new StringBuilder(String.valueOf(l).length() + 26);
            sb8.append("start_cap_texture_url: \"");
            sb8.append(l);
            sb8.append("\"\n");
            sb.append(sb8.toString());
        }
        dmvs dmvsVar3 = this.j;
        if (dmvsVar3.b) {
            int i4 = dmvsVar3.a;
            StringBuilder sb9 = new StringBuilder(48);
            sb9.append("start_cap_texture_url_prefix_index: ");
            sb9.append(i4);
            sb9.append("\n");
            sb.append(sb9.toString());
        }
        if (o()) {
            String n = n();
            StringBuilder sb10 = new StringBuilder(String.valueOf(n).length() + 24);
            sb10.append("end_cap_texture_url: \"");
            sb10.append(n);
            sb10.append("\"\n");
            sb.append(sb10.toString());
        }
        dmvs dmvsVar4 = this.l;
        if (dmvsVar4.b) {
            int i5 = dmvsVar4.a;
            StringBuilder sb11 = new StringBuilder(46);
            sb11.append("end_cap_texture_url_prefix_index: ");
            sb11.append(i5);
            sb11.append("\n");
            sb.append(sb11.toString());
        }
        if (q()) {
            float p = p();
            StringBuilder sb12 = new StringBuilder(33);
            sb12.append("cap_width_ratio: ");
            sb12.append(p);
            sb12.append("\n");
            sb.append(sb12.toString());
        }
        if (s()) {
            float r = r();
            StringBuilder sb13 = new StringBuilder(34);
            sb13.append("cap_height_ratio: ");
            sb13.append(r);
            sb13.append("\n");
            sb.append(sb13.toString());
        }
        if (this.t.b) {
            int t = t();
            StringBuilder sb14 = new StringBuilder(41);
            sb14.append("stroke_rendering_attributes: ");
            sb14.append(t);
            sb14.append("\n");
            sb.append(sb14.toString());
        }
        return sb.toString();
    }
}
