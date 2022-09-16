package defpackage;
/* compiled from: PG */
/* renamed from: dmut  reason: default package */
/* loaded from: classes.dex */
public final class dmut extends dmvw {
    private final dmvm f = new dmvm(4);
    private final dmvs g = new dmvs(0);
    private final dmvs h = new dmvs(0);
    public final dmvq a = new dmvq();
    private dmum i = null;
    public final dmvr b = new dmvr();
    private dmug j = null;
    private dmvl k = null;
    private final dmvs l = new dmvs(0);
    private final dmvs m = new dmvs(0);
    private final dmvs s = new dmvs(1);
    private final dmvs t = new dmvs(0);
    private final dmvs u = new dmvs(0);
    private final dmvs v = new dmvs(0);
    private final dmvs w = new dmvs(0);
    private final dmvs x = new dmvs(0);
    private dmtl y = null;
    private final dmvs z = new dmvs(0);
    private final dmvs A = new dmvs(0);
    private dmtj B = null;
    private final dmvs C = new dmvs(0);
    private final dmvs D = new dmvs(0);
    public final dmvq c = new dmvq();
    private dmuo E = null;
    public final dmvv<dmum> d = new dmup(this);
    public final dmvv<dmuo> e = new dmur(this);

    public final int A() {
        return this.z.a;
    }

    public final int B() {
        return this.A.a;
    }

    public final boolean C() {
        return this.A.b;
    }

    public final dmtj D() {
        if (this.B == null) {
            this.B = new dmtj();
        }
        if (!this.f.b(3)) {
            this.B.a();
            return this.B;
        }
        this.B.R(this.p, this.f.c(3), this.f.d(3));
        return this.B;
    }

    public final boolean E() {
        return this.f.b(3);
    }

    public final int F() {
        return this.C.a;
    }

    public final boolean G() {
        return this.C.b;
    }

    public final int H() {
        return this.c.b;
    }

    public final dmuo I(int i) {
        if (this.E == null) {
            this.E = new dmuo();
        }
        this.E.R(this.p, this.c.c(i), this.c.d(i));
        return this.E;
    }

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.f.a();
        this.g.b();
        this.h.b();
        this.a.a();
        dmum dmumVar = this.i;
        if (dmumVar != null) {
            dmumVar.a();
        }
        this.b.c();
        dmug dmugVar = this.j;
        if (dmugVar != null) {
            dmugVar.a();
        }
        dmvl dmvlVar = this.k;
        if (dmvlVar != null) {
            dmvlVar.a();
        }
        this.l.b();
        this.m.b();
        this.s.b();
        this.t.b();
        this.u.b();
        this.v.b();
        this.w.b();
        this.x.b();
        dmtl dmtlVar = this.y;
        if (dmtlVar != null) {
            dmtlVar.a();
        }
        this.z.b();
        this.A.b();
        dmtj dmtjVar = this.B;
        if (dmtjVar != null) {
            dmtjVar.a();
        }
        this.C.b();
        this.D.b();
        this.c.a();
        dmuo dmuoVar = this.E;
        if (dmuoVar != null) {
            dmuoVar.a();
        }
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i == 3) {
            this.a.f(i2, i3);
        } else if (i == 4) {
            this.f.e(0, i2, i3);
        } else if (i == 5) {
            this.f.e(1, i2, i3);
        } else if (i == 8) {
            P(this.p, i2, i3, this.b);
        } else if (i == 15) {
            this.f.e(2, i2, i3);
        } else if (i == 18) {
            this.f.e(3, i2, i3);
        } else if (i != 20) {
        } else {
            this.c.f(i2, i3);
        }
    }

    public final int d() {
        return this.g.a;
    }

    public final int e() {
        return this.h.a;
    }

    public final int f() {
        return this.a.b;
    }

    public final Iterable<dmum> g() {
        return new dmuq(this);
    }

    public final dmum h(int i) {
        if (this.i == null) {
            this.i = new dmum();
        }
        this.i.R(this.p, this.a.c(i), this.a.d(i));
        return this.i;
    }

    public final int k() {
        return this.b.b;
    }

    public final dmug l() {
        if (this.j == null) {
            this.j = new dmug();
        }
        if (!this.f.b(0)) {
            this.j.a();
            return this.j;
        }
        this.j.R(this.p, this.f.c(0), this.f.d(0));
        return this.j;
    }

    public final dmvl m() {
        if (this.k == null) {
            this.k = new dmvl();
        }
        if (!this.f.b(1)) {
            this.k.a();
            return this.k;
        }
        this.k.R(this.p, this.f.c(1), this.f.d(1));
        return this.k;
    }

    public final boolean n() {
        return this.f.b(1);
    }

    public final int o() {
        return this.l.a;
    }

    public final int p() {
        return this.m.a;
    }

    public final boolean q() {
        return this.m.b;
    }

    public final int r() {
        return this.s.a;
    }

    public final boolean s() {
        return this.s.b;
    }

    public final boolean t() {
        return this.t.a != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.g.b) {
            String hexString = Long.toHexString(d() & 4294967295L);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 15);
            sb2.append("text_color: 0x");
            sb2.append(hexString);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        if (this.h.b) {
            String hexString2 = Long.toHexString(4294967295L & e());
            StringBuilder sb3 = new StringBuilder(String.valueOf(hexString2).length() + 23);
            sb3.append("text_outline_color: 0x");
            sb3.append(hexString2);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        for (int i = 0; i < f(); i++) {
            String replace = h(i).toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(replace).length() + 11);
            sb4.append("icon {\n  ");
            sb4.append(replace);
            sb4.append("}\n");
            sb.append(sb4.toString());
        }
        for (int i2 = 0; i2 < k(); i2++) {
            int b = this.b.b(i2);
            StringBuilder sb5 = new StringBuilder(24);
            sb5.append("icon_index: ");
            sb5.append(b);
            sb5.append("\n");
            sb.append(sb5.toString());
        }
        if (this.f.b(0)) {
            String replace2 = l().toString().replace("\n", "\n  ");
            if (replace2.endsWith("  ")) {
                replace2 = replace2.substring(0, replace2.length() - 2);
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(replace2).length() + 11);
            sb6.append("font {\n  ");
            sb6.append(replace2);
            sb6.append("}\n");
            sb.append(sb6.toString());
        }
        if (n()) {
            String replace3 = m().toString().replace("\n", "\n  ");
            if (replace3.endsWith("  ")) {
                replace3 = replace3.substring(0, replace3.length() - 2);
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(replace3).length() + 21);
            sb7.append("text_box_style {\n  ");
            sb7.append(replace3);
            sb7.append("}\n");
            sb.append(sb7.toString());
        }
        if (this.l.b) {
            int o = o();
            StringBuilder sb8 = new StringBuilder(21);
            sb8.append("z_plane: ");
            sb8.append(o);
            sb8.append("\n");
            sb.append(sb8.toString());
        }
        if (q()) {
            int p = p();
            StringBuilder sb9 = new StringBuilder(40);
            sb9.append("primary_group_anchor_point: ");
            sb9.append(p);
            sb9.append("\n");
            sb.append(sb9.toString());
        }
        if (s()) {
            int r = r();
            StringBuilder sb10 = new StringBuilder(33);
            sb10.append("projection_behavior: ");
            sb10.append(r);
            sb10.append("\n");
            sb.append(sb10.toString());
        }
        if (this.t.b) {
            boolean t = t();
            StringBuilder sb11 = new StringBuilder(11);
            sb11.append("off: ");
            sb11.append(t);
            sb11.append("\n");
            sb.append(sb11.toString());
        }
        dmvs dmvsVar = this.u;
        if (dmvsVar.b) {
            int i3 = dmvsVar.a;
            StringBuilder sb12 = new StringBuilder(29);
            sb12.append("anchor_offset_x: ");
            sb12.append(i3);
            sb12.append("\n");
            sb.append(sb12.toString());
        }
        dmvs dmvsVar2 = this.v;
        if (dmvsVar2.b) {
            int i4 = dmvsVar2.a;
            StringBuilder sb13 = new StringBuilder(29);
            sb13.append("anchor_offset_y: ");
            sb13.append(i4);
            sb13.append("\n");
            sb.append(sb13.toString());
        }
        if (v()) {
            int u = u();
            StringBuilder sb14 = new StringBuilder(33);
            sb14.append("inter_group_padding: ");
            sb14.append(u);
            sb14.append("\n");
            sb.append(sb14.toString());
        }
        if (x()) {
            int w = w();
            StringBuilder sb15 = new StringBuilder(31);
            sb15.append("subtitle_annotate: ");
            sb15.append(w);
            sb15.append("\n");
            sb.append(sb15.toString());
        }
        if (z()) {
            String replace4 = y().toString().replace("\n", "\n  ");
            if (replace4.endsWith("  ")) {
                replace4 = replace4.substring(0, replace4.length() - 2);
            }
            StringBuilder sb16 = new StringBuilder(String.valueOf(replace4).length() + 33);
            sb16.append("annotation_ranking_options {\n  ");
            sb16.append(replace4);
            sb16.append("}\n");
            sb.append(sb16.toString());
        }
        if (this.z.b) {
            int A = A();
            StringBuilder sb17 = new StringBuilder(38);
            sb17.append("num_annotation_subtitles: ");
            sb17.append(A);
            sb17.append("\n");
            sb.append(sb17.toString());
        }
        if (C()) {
            int B = B();
            StringBuilder sb18 = new StringBuilder(46);
            sb18.append("annotation_ranking_options_index: ");
            sb18.append(B);
            sb18.append("\n");
            sb.append(sb18.toString());
        }
        if (E()) {
            String replace5 = D().toString().replace("\n", "\n  ");
            if (replace5.endsWith("  ")) {
                replace5 = replace5.substring(0, replace5.length() - 2);
            }
            StringBuilder sb19 = new StringBuilder(String.valueOf(replace5).length() + 16);
            sb19.append("animation {\n  ");
            sb19.append(replace5);
            sb19.append("}\n");
            sb.append(sb19.toString());
        }
        if (G()) {
            int F = F();
            StringBuilder sb20 = new StringBuilder(29);
            sb20.append("animation_index: ");
            sb20.append(F);
            sb20.append("\n");
            sb.append(sb20.toString());
        }
        dmvs dmvsVar3 = this.D;
        if (dmvsVar3.b) {
            int i5 = dmvsVar3.a;
            StringBuilder sb21 = new StringBuilder(29);
            sb21.append("animation_class: ");
            sb21.append(i5);
            sb21.append("\n");
            sb.append(sb21.toString());
        }
        for (int i6 = 0; i6 < H(); i6++) {
            String replace6 = I(i6).toString().replace("\n", "\n  ");
            if (replace6.endsWith("  ")) {
                replace6 = replace6.substring(0, replace6.length() - 2);
            }
            StringBuilder sb22 = new StringBuilder(String.valueOf(replace6).length() + 32);
            sb22.append("secondary_group_positions {\n  ");
            sb22.append(replace6);
            sb22.append("}\n");
            sb.append(sb22.toString());
        }
        return sb.toString();
    }

    public final int u() {
        return this.w.a;
    }

    public final boolean v() {
        return this.w.b;
    }

    public final int w() {
        return this.x.a;
    }

    public final boolean x() {
        return this.x.b;
    }

    public final dmtl y() {
        if (this.y == null) {
            this.y = new dmtl();
        }
        if (!this.f.b(2)) {
            this.y.a();
            return this.y;
        }
        this.y.R(this.p, this.f.c(2), this.f.d(2));
        return this.y;
    }

    public final boolean z() {
        return this.f.b(2);
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i == 1) {
            this.g.a(i2);
            return true;
        } else if (i == 2) {
            this.h.a(i2);
            return true;
        } else if (i == 6) {
            this.l.a(i2);
            return true;
        } else if (i == 7) {
            this.t.a(i2);
            return true;
        } else if (i == 16) {
            this.A.a(i2);
            return true;
        } else if (i == 17) {
            this.z.a(i2);
            return true;
        } else if (i == 19) {
            this.C.a(i2);
            return true;
        } else if (i == 21) {
            this.D.a(i2);
            return true;
        } else {
            switch (i) {
                case 9:
                    this.m.a(i2);
                    return true;
                case 10:
                    this.s.a(i2);
                    return true;
                case 11:
                    this.u.a(O(i2));
                    return true;
                case 12:
                    this.v.a(O(i2));
                    return true;
                case 13:
                    this.w.a(O(i2));
                    return true;
                case 14:
                    this.x.a(i2);
                    return true;
                default:
                    return false;
            }
        }
    }
}
