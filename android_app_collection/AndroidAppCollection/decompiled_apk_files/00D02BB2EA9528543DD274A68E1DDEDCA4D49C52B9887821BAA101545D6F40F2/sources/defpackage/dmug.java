package defpackage;
/* compiled from: PG */
/* renamed from: dmug  reason: default package */
/* loaded from: classes.dex */
public final class dmug extends dmvw {
    private final dmvm a = new dmvm(1);
    private final dmvs b = new dmvs(0);
    private final dmvs c = new dmvs(0);
    private final dmvs d = new dmvs(0);
    private final dmvs e = new dmvs(0);
    private String f = null;
    private final dmvs g = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.a();
        this.b.b();
        this.c.b();
        this.d.b();
        this.e.b();
        this.f = null;
        this.g.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i == 1) {
            this.b.a(i2);
            return true;
        } else if (i == 2) {
            this.c.a(i2);
            return true;
        } else if (i == 3) {
            this.d.a(i2);
            return true;
        } else if (i == 4) {
            this.e.a(i2);
            return true;
        } else if (i != 6) {
            return false;
        } else {
            this.g.a(i2);
            return true;
        }
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i != 5) {
            return;
        }
        this.a.e(0, i2, i3);
    }

    public final int d() {
        return this.b.a;
    }

    public final int e() {
        return this.c.a;
    }

    public final int f() {
        return this.d.a;
    }

    public final int g() {
        return this.e.a;
    }

    public final int h() {
        return this.g.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.b.b) {
            int d = d();
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("text_size: ");
            sb2.append(d);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        if (this.c.b) {
            int e = e();
            StringBuilder sb3 = new StringBuilder(24);
            sb3.append("text_flags: ");
            sb3.append(e);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        if (this.d.b) {
            int f = f();
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("text_leading_percent: ");
            sb4.append(f);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        if (this.e.b) {
            int g = g();
            StringBuilder sb5 = new StringBuilder(36);
            sb5.append("text_tracking_permille: ");
            sb5.append(g);
            sb5.append("\n");
            sb.append(sb5.toString());
        }
        if (this.a.b(0)) {
            if (this.f == null) {
                if (this.a.b(0)) {
                    this.f = new String(this.p, this.a.c(0), this.a.d(0), n);
                } else {
                    this.f = "";
                }
            }
            String str = this.f;
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 14);
            sb6.append("font_name: \"");
            sb6.append(str);
            sb6.append("\"\n");
            sb.append(sb6.toString());
        }
        if (this.g.b) {
            int h = h();
            StringBuilder sb7 = new StringBuilder(27);
            sb7.append("outline_width: ");
            sb7.append(h);
            sb7.append("\n");
            sb.append(sb7.toString());
        }
        return sb.toString();
    }
}
