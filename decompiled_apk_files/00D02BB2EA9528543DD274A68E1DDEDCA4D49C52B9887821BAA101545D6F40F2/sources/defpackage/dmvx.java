package defpackage;
/* compiled from: PG */
/* renamed from: dmvx  reason: default package */
/* loaded from: classes6.dex */
public final class dmvx extends dmvw {
    private final dmvs a = new dmvs(0);
    private final dmvs b = new dmvs(0);
    private final dmvs c = new dmvs(0);
    private final dmvs d = new dmvs(0);
    private final dmvs e = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.b();
        this.b.b();
        this.c.b();
        this.d.b();
        this.e.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i == 1) {
            this.a.a(i2);
            return true;
        } else if (i == 2) {
            this.b.a(i2);
            return true;
        } else if (i == 3) {
            this.c.a(i2);
            return true;
        } else if (i == 4) {
            this.d.a(i2);
            return true;
        } else if (i != 5) {
            return false;
        } else {
            this.e.a(i2);
            return true;
        }
    }

    public final int d() {
        return this.a.a;
    }

    public final boolean e() {
        return this.a.b;
    }

    public final int f() {
        return this.b.a;
    }

    public final int g() {
        return this.c.a;
    }

    public final boolean h() {
        return this.c.b;
    }

    public final int k() {
        return this.d.a;
    }

    public final boolean l() {
        return this.e.a != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (e()) {
            String hexString = Long.toHexString(d() & 4294967295L);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 32);
            sb2.append("highlighted_edge_color_argb: 0x");
            sb2.append(hexString);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        if (this.b.b) {
            int f = f();
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("highlighted_edge_width: ");
            sb3.append(f);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        if (h()) {
            String hexString2 = Long.toHexString(4294967295L & g());
            StringBuilder sb4 = new StringBuilder(String.valueOf(hexString2).length() + 20);
            sb4.append("fill_color_argb: 0x");
            sb4.append(hexString2);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        if (this.d.b) {
            int k = k();
            StringBuilder sb5 = new StringBuilder(21);
            sb5.append("z_plane: ");
            sb5.append(k);
            sb5.append("\n");
            sb.append(sb5.toString());
        }
        if (this.e.b) {
            boolean l = l();
            StringBuilder sb6 = new StringBuilder(11);
            sb6.append("off: ");
            sb6.append(l);
            sb6.append("\n");
            sb.append(sb6.toString());
        }
        return sb.toString();
    }
}
