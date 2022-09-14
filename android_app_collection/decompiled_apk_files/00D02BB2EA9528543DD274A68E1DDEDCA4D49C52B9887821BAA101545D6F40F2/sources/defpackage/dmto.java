package defpackage;
/* compiled from: PG */
/* renamed from: dmto  reason: default package */
/* loaded from: classes.dex */
public final class dmto extends dmvw {
    private final dmvs a = new dmvs(0);
    private final dmvs b = new dmvs(0);
    private final dmvs c = new dmvs(0);
    private final dmvs d = new dmvs(0);
    private final dmvs e = new dmvs(0);
    private final dmvs f = new dmvs(0);
    private final dmvs g = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.b();
        this.b.b();
        this.c.b();
        this.d.b();
        this.e.b();
        this.f.b();
        this.g.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        switch (i) {
            case 1:
                this.a.a(i2);
                return true;
            case 2:
                this.b.a(i2);
                return true;
            case 3:
                this.c.a(i2);
                return true;
            case 4:
                this.d.a(i2);
                return true;
            case 5:
                this.e.a(i2);
                return true;
            case 6:
                this.f.a(i2);
                return true;
            case 7:
                this.g.a(i2);
                return true;
            default:
                return false;
        }
    }

    public final int d() {
        return this.a.a;
    }

    public final int e() {
        return this.b.a;
    }

    public final boolean f() {
        return this.b.b;
    }

    public final int g() {
        return this.c.a;
    }

    public final boolean h() {
        return this.c.b;
    }

    public final int i() {
        return this.d.a;
    }

    public final boolean j() {
        return this.d.b;
    }

    public final int k() {
        return this.f.a;
    }

    public final boolean l() {
        return this.f.b;
    }

    public final int m() {
        return this.g.a;
    }

    public final boolean n() {
        return this.g.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a.b) {
            int d = d();
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("zoom: ");
            sb2.append(d);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        if (f()) {
            int e = e();
            StringBuilder sb3 = new StringBuilder(24);
            sb3.append("area_style: ");
            sb3.append(e);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        if (h()) {
            int g = g();
            StringBuilder sb4 = new StringBuilder(25);
            sb4.append("label_style: ");
            sb4.append(g);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        if (j()) {
            int i = i();
            StringBuilder sb5 = new StringBuilder(24);
            sb5.append("line_style: ");
            sb5.append(i);
            sb5.append("\n");
            sb.append(sb5.toString());
        }
        dmvs dmvsVar = this.e;
        if (dmvsVar.b) {
            int i2 = dmvsVar.a;
            StringBuilder sb6 = new StringBuilder(29);
            sb6.append("shader_op_style: ");
            sb6.append(i2);
            sb6.append("\n");
            sb.append(sb6.toString());
        }
        if (l()) {
            int k = k();
            StringBuilder sb7 = new StringBuilder(26);
            sb7.append("volume_style: ");
            sb7.append(k);
            sb7.append("\n");
            sb.append(sb7.toString());
        }
        if (n()) {
            int m = m();
            StringBuilder sb8 = new StringBuilder(26);
            sb8.append("raster_style: ");
            sb8.append(m);
            sb8.append("\n");
            sb.append(sb8.toString());
        }
        return sb.toString();
    }
}
