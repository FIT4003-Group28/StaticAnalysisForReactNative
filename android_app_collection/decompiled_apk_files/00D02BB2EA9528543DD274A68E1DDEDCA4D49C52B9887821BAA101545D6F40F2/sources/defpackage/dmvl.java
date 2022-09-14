package defpackage;
/* compiled from: PG */
/* renamed from: dmvl  reason: default package */
/* loaded from: classes.dex */
public final class dmvl extends dmvw {
    private final dmvs d = new dmvs(0);
    private final dmvs e = new dmvs(0);
    private final dmvs f = new dmvs(0);
    private final dmvs g = new dmvs(0);
    private final dmvs h = new dmvs(0);
    private final dmvs i = new dmvs(0);
    private final dmvr j = new dmvr();
    private final dmvs k = new dmvs(0);
    private final dmvs l = new dmvs(0);
    private final dmvs m = new dmvs(0);
    private final dmvs s = new dmvs(0);
    private final dmvs t = new dmvs(0);
    private final dmvs u = new dmvs(1);
    private final dmvs v = new dmvs(0);
    public final dmvq a = new dmvq();
    private dmum w = null;
    public final dmvr b = new dmvr();
    private final dmvs x = new dmvs(0);
    private final dmvs y = new dmvs(0);
    public final dmvv<dmum> c = new dmvj(this);

    public final float A() {
        return Float.intBitsToFloat(this.y.a);
    }

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.d.b();
        this.e.b();
        this.f.b();
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.c();
        this.k.b();
        this.l.b();
        this.m.b();
        this.s.b();
        this.t.b();
        this.u.b();
        this.v.b();
        this.a.a();
        dmum dmumVar = this.w;
        if (dmumVar != null) {
            dmumVar.a();
        }
        this.b.c();
        this.x.b();
        this.y.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        switch (i) {
            case 1:
                this.d.a(i2);
                return true;
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
                this.k.a(i2);
                return true;
            case 6:
            case 9:
            default:
                return false;
            case 7:
                this.x.a(i2);
                return true;
            case 8:
                this.y.a(i2);
                return true;
            case 10:
                this.h.a(i2);
                return true;
            case 11:
                this.i.a(i2);
                return true;
            case 12:
                this.j.a(i2);
                return true;
            case 13:
                this.s.a(i2);
                return true;
            case 14:
                this.t.a(i2);
                return true;
            case 15:
                this.u.a(i2);
                return true;
            case 16:
                this.l.a(i2);
                return true;
            case 17:
                this.m.a(i2);
                return true;
            case 18:
                this.v.a(i2);
                return true;
        }
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i == 6) {
            this.a.f(i2, i3);
        } else if (i != 9) {
        } else {
            P(this.p, i2, i3, this.b);
        }
    }

    public final int d() {
        return this.d.a;
    }

    public final int e() {
        return this.e.a;
    }

    public final int f() {
        return this.f.a;
    }

    public final int g() {
        return this.g.a;
    }

    public final int h() {
        return this.h.a;
    }

    public final int k() {
        return this.i.a;
    }

    public final int l() {
        return this.j.b;
    }

    public final int m(int i) {
        return this.j.b(i);
    }

    public final int n() {
        return this.k.a;
    }

    public final int o() {
        return this.l.a;
    }

    public final boolean p() {
        return this.l.b;
    }

    public final int q() {
        return this.m.a;
    }

    public final int r() {
        return this.s.a;
    }

    public final int s() {
        return this.t.a;
    }

    public final int t() {
        return this.u.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.d.b) {
            String hexString = Long.toHexString(d() & 4294967295L);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 27);
            sb2.append("text_box_outline_color: 0x");
            sb2.append(hexString);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        if (this.e.b) {
            int e = e();
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("text_box_outline_width: ");
            sb3.append(e);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        if (this.f.b) {
            String hexString2 = Long.toHexString(f() & 4294967295L);
            StringBuilder sb4 = new StringBuilder(String.valueOf(hexString2).length() + 24);
            sb4.append("text_box_fill_color: 0x");
            sb4.append(hexString2);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        if (this.g.b) {
            int g = g();
            StringBuilder sb5 = new StringBuilder(26);
            sb5.append("caret_height: ");
            sb5.append(g);
            sb5.append("\n");
            sb.append(sb5.toString());
        }
        if (this.h.b) {
            int h = h();
            StringBuilder sb6 = new StringBuilder(42);
            sb6.append("caret_corner_offset_distance: ");
            sb6.append(h);
            sb6.append("\n");
            sb.append(sb6.toString());
        }
        if (this.i.b) {
            int k = k();
            StringBuilder sb7 = new StringBuilder(33);
            sb7.append("caret_height_corner: ");
            sb7.append(k);
            sb7.append("\n");
            sb.append(sb7.toString());
        }
        for (int i = 0; i < l(); i++) {
            int m = m(i);
            StringBuilder sb8 = new StringBuilder(37);
            sb8.append("supported_anchor_points: ");
            sb8.append(m);
            sb8.append("\n");
            sb.append(sb8.toString());
        }
        if (this.k.b) {
            int n = n();
            StringBuilder sb9 = new StringBuilder(32);
            sb9.append("drop_shadow_offset: ");
            sb9.append(n);
            sb9.append("\n");
            sb.append(sb9.toString());
        }
        if (p()) {
            int o = o();
            StringBuilder sb10 = new StringBuilder(43);
            sb10.append("drop_shadow_offset_minor_axis: ");
            sb10.append(o);
            sb10.append("\n");
            sb.append(sb10.toString());
        }
        if (this.m.b) {
            String hexString3 = Long.toHexString(4294967295L & q());
            StringBuilder sb11 = new StringBuilder(String.valueOf(hexString3).length() + 22);
            sb11.append("drop_shadow_color: 0x");
            sb11.append(hexString3);
            sb11.append("\n");
            sb.append(sb11.toString());
        }
        if (this.s.b) {
            int r = r();
            StringBuilder sb12 = new StringBuilder(37);
            sb12.append("drop_shadow_blur_radius: ");
            sb12.append(r);
            sb12.append("\n");
            sb.append(sb12.toString());
        }
        if (this.t.b) {
            int s = s();
            StringBuilder sb13 = new StringBuilder(27);
            sb13.append("corner_radius: ");
            sb13.append(s);
            sb13.append("\n");
            sb.append(sb13.toString());
        }
        if (this.u.b) {
            int t = t();
            StringBuilder sb14 = new StringBuilder(24);
            sb14.append("shape_type: ");
            sb14.append(t);
            sb14.append("\n");
            sb.append(sb14.toString());
        }
        if (this.v.b) {
            boolean u = u();
            StringBuilder sb15 = new StringBuilder(27);
            sb15.append("allow_icon_nestling: ");
            sb15.append(u);
            sb15.append("\n");
            sb.append(sb15.toString());
        }
        for (int i2 = 0; i2 < v(); i2++) {
            String replace = x(i2).toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb16 = new StringBuilder(String.valueOf(replace).length() + 23);
            sb16.append("label_box_raster {\n  ");
            sb16.append(replace);
            sb16.append("}\n");
            sb.append(sb16.toString());
        }
        for (int i3 = 0; i3 < y(); i3++) {
            int b = this.b.b(i3);
            StringBuilder sb17 = new StringBuilder(36);
            sb17.append("label_box_raster_index: ");
            sb17.append(b);
            sb17.append("\n");
            sb.append(sb17.toString());
        }
        if (this.x.b) {
            float z = z();
            StringBuilder sb18 = new StringBuilder(36);
            sb18.append("major_axis_padding: ");
            sb18.append(z);
            sb18.append("\n");
            sb.append(sb18.toString());
        }
        if (this.y.b) {
            float A = A();
            StringBuilder sb19 = new StringBuilder(36);
            sb19.append("minor_axis_padding: ");
            sb19.append(A);
            sb19.append("\n");
            sb.append(sb19.toString());
        }
        return sb.toString();
    }

    public final boolean u() {
        return this.v.a != 0;
    }

    public final int v() {
        return this.a.b;
    }

    public final Iterable<dmum> w() {
        return new dmvk(this);
    }

    public final dmum x(int i) {
        if (this.w == null) {
            this.w = new dmum();
        }
        this.w.R(this.p, this.a.c(i), this.a.d(i));
        return this.w;
    }

    public final int y() {
        return this.b.b;
    }

    public final float z() {
        return Float.intBitsToFloat(this.x.a);
    }
}
