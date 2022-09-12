package defpackage;
/* compiled from: PG */
/* renamed from: dmum  reason: default package */
/* loaded from: classes.dex */
public final class dmum extends dmvw {
    private final dmvm a = new dmvm(1);
    private String b = null;
    private final dmvs c = new dmvs(-1);
    private final dmvs d = new dmvs(1);
    private final dmvs e = new dmvs(0);
    private final dmvs f = new dmvs(0);
    private final dmvs g = new dmvs(-16777216);
    private final dmvs h = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.a();
        this.b = null;
        this.c.b();
        this.d.b();
        this.e.b();
        this.f.b();
        this.g.b();
        this.h.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        switch (i) {
            case 2:
                this.d.a(i2);
                return true;
            case 3:
                this.e.a(i2);
                return true;
            case 4:
                this.f.a(i2);
                return true;
            case 5:
                this.c.a(i2);
                return true;
            case 6:
                this.g.a(i2);
                return true;
            case 7:
                this.h.a(i2);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i != 1) {
            return;
        }
        this.a.e(0, i2, i3);
    }

    public final String d() {
        if (this.b == null) {
            this.b = this.a.b(0) ? new String(this.p, this.a.c(0), this.a.d(0), n) : "";
        }
        return this.b;
    }

    public final int e() {
        return this.c.a;
    }

    public final boolean f() {
        return this.c.b;
    }

    public final int g() {
        return this.d.a;
    }

    public final boolean h() {
        return this.d.b;
    }

    public final int k() {
        return this.e.a;
    }

    public final boolean l() {
        return this.e.b;
    }

    public final int m() {
        return this.f.a;
    }

    public final boolean n() {
        return this.f.b;
    }

    public final int o() {
        return this.g.a;
    }

    public final boolean p() {
        return this.g.b;
    }

    public final int q() {
        return this.h.a;
    }

    public final boolean r() {
        return this.h.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a.b(0)) {
            String d = d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 13);
            sb2.append("icon_url: \"");
            sb2.append(d);
            sb2.append("\"\n");
            sb.append(sb2.toString());
        }
        if (f()) {
            int e = e();
            StringBuilder sb3 = new StringBuilder(35);
            sb3.append("icon_url_prefix_index: ");
            sb3.append(e);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        if (h()) {
            int g = g();
            StringBuilder sb4 = new StringBuilder(24);
            sb4.append("icon_scale: ");
            sb4.append(g);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        if (l()) {
            int k = k();
            StringBuilder sb5 = new StringBuilder(24);
            sb5.append("icon_width: ");
            sb5.append(k);
            sb5.append("\n");
            sb.append(sb5.toString());
        }
        if (n()) {
            int m = m();
            StringBuilder sb6 = new StringBuilder(25);
            sb6.append("icon_height: ");
            sb6.append(m);
            sb6.append("\n");
            sb.append(sb6.toString());
        }
        if (p()) {
            String hexString = Long.toHexString(o() & 4294967295L);
            StringBuilder sb7 = new StringBuilder(String.valueOf(hexString).length() + 24);
            sb7.append("highlight_color_rgb: 0x");
            sb7.append(hexString);
            sb7.append("\n");
            sb.append(sb7.toString());
        }
        if (r()) {
            String hexString2 = Long.toHexString(4294967295L & q());
            StringBuilder sb8 = new StringBuilder(String.valueOf(hexString2).length() + 22);
            sb8.append("color_filter_argb: 0x");
            sb8.append(hexString2);
            sb8.append("\n");
            sb.append(sb8.toString());
        }
        return sb.toString();
    }
}
