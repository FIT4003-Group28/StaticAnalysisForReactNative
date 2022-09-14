package defpackage;
/* compiled from: PG */
/* renamed from: dmun  reason: default package */
/* loaded from: classes6.dex */
public final class dmun extends dmvw {
    private final dmvm a = new dmvm(6);
    private final dmvs b = new dmvs(0);
    private dmtn c = null;
    private dmut d = null;
    private dmuw e = null;
    private dmvg f = null;
    private dmvx g = null;
    private dmvf h = null;

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.a();
        this.b.b();
        dmtn dmtnVar = this.c;
        if (dmtnVar != null) {
            dmtnVar.a();
        }
        dmut dmutVar = this.d;
        if (dmutVar != null) {
            dmutVar.a();
        }
        dmuw dmuwVar = this.e;
        if (dmuwVar != null) {
            dmuwVar.a();
        }
        dmvg dmvgVar = this.f;
        if (dmvgVar != null) {
            dmvgVar.a();
        }
        dmvx dmvxVar = this.g;
        if (dmvxVar != null) {
            dmvxVar.a();
        }
        dmvf dmvfVar = this.h;
        if (dmvfVar != null) {
            dmvfVar.a();
        }
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i != 1) {
            return false;
        }
        this.b.a(i2);
        return true;
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i == 2) {
            this.a.e(0, i2, i3);
        } else if (i == 3) {
            this.a.e(1, i2, i3);
        } else if (i == 4) {
            this.a.e(2, i2, i3);
        } else if (i == 5) {
            this.a.e(3, i2, i3);
        } else if (i == 6) {
            this.a.e(4, i2, i3);
        } else if (i != 8) {
        } else {
            this.a.e(5, i2, i3);
        }
    }

    public final int d() {
        return this.b.a;
    }

    public final dmtn e() {
        if (this.c == null) {
            this.c = new dmtn();
        }
        if (!this.a.b(0)) {
            this.c.a();
            return this.c;
        }
        this.c.R(this.p, this.a.c(0), this.a.d(0));
        return this.c;
    }

    public final boolean f() {
        return this.a.b(0);
    }

    public final dmut g() {
        if (this.d == null) {
            this.d = new dmut();
        }
        if (!this.a.b(1)) {
            this.d.a();
            return this.d;
        }
        this.d.R(this.p, this.a.c(1), this.a.d(1));
        return this.d;
    }

    public final boolean h() {
        return this.a.b(1);
    }

    public final dmuw k() {
        if (this.e == null) {
            this.e = new dmuw();
        }
        if (!this.a.b(2)) {
            this.e.a();
            return this.e;
        }
        this.e.R(this.p, this.a.c(2), this.a.d(2));
        return this.e;
    }

    public final boolean l() {
        return this.a.b(2);
    }

    public final dmvx m() {
        if (this.g == null) {
            this.g = new dmvx();
        }
        if (!this.a.b(4)) {
            this.g.a();
            return this.g;
        }
        this.g.R(this.p, this.a.c(4), this.a.d(4));
        return this.g;
    }

    public final boolean n() {
        return this.a.b(4);
    }

    public final dmvf o() {
        if (this.h == null) {
            this.h = new dmvf();
        }
        if (!this.a.b(5)) {
            this.h.a();
            return this.h;
        }
        this.h.R(this.p, this.a.c(5), this.a.d(5));
        return this.h;
    }

    public final boolean p() {
        return this.a.b(5);
    }

    public final String toString() {
        dmvg dmvgVar;
        StringBuilder sb = new StringBuilder();
        if (this.b.b) {
            int d = d();
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("zoom: ");
            sb2.append(d);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        if (f()) {
            String replace = e().toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(replace).length() + 17);
            sb3.append("area_style {\n  ");
            sb3.append(replace);
            sb3.append("}\n");
            sb.append(sb3.toString());
        }
        if (h()) {
            String replace2 = g().toString().replace("\n", "\n  ");
            if (replace2.endsWith("  ")) {
                replace2 = replace2.substring(0, replace2.length() - 2);
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(replace2).length() + 18);
            sb4.append("label_style {\n  ");
            sb4.append(replace2);
            sb4.append("}\n");
            sb.append(sb4.toString());
        }
        if (l()) {
            String replace3 = k().toString().replace("\n", "\n  ");
            if (replace3.endsWith("  ")) {
                replace3 = replace3.substring(0, replace3.length() - 2);
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(replace3).length() + 17);
            sb5.append("line_style {\n  ");
            sb5.append(replace3);
            sb5.append("}\n");
            sb.append(sb5.toString());
        }
        if (this.a.b(3)) {
            if (this.f == null) {
                this.f = new dmvg();
            }
            if (!this.a.b(3)) {
                this.f.a();
                dmvgVar = this.f;
            } else {
                this.f.R(this.p, this.a.c(3), this.a.d(3));
                dmvgVar = this.f;
            }
            String replace4 = dmvgVar.toString().replace("\n", "\n  ");
            if (replace4.endsWith("  ")) {
                replace4 = replace4.substring(0, replace4.length() - 2);
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(replace4).length() + 22);
            sb6.append("shader_op_style {\n  ");
            sb6.append(replace4);
            sb6.append("}\n");
            sb.append(sb6.toString());
        }
        if (n()) {
            String replace5 = m().toString().replace("\n", "\n  ");
            if (replace5.endsWith("  ")) {
                replace5 = replace5.substring(0, replace5.length() - 2);
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(replace5).length() + 19);
            sb7.append("volume_style {\n  ");
            sb7.append(replace5);
            sb7.append("}\n");
            sb.append(sb7.toString());
        }
        if (p()) {
            String replace6 = o().toString().replace("\n", "\n  ");
            if (replace6.endsWith("  ")) {
                replace6 = replace6.substring(0, replace6.length() - 2);
            }
            StringBuilder sb8 = new StringBuilder(String.valueOf(replace6).length() + 19);
            sb8.append("raster_style {\n  ");
            sb8.append(replace6);
            sb8.append("}\n");
            sb.append(sb8.toString());
        }
        return sb.toString();
    }
}
