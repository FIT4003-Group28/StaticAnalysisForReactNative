package defpackage;
/* compiled from: PG */
/* renamed from: dmvf  reason: default package */
/* loaded from: classes6.dex */
public final class dmvf extends dmvw {
    private final dmvo a = new dmvo();
    private final dmvs b = new dmvs(-1);
    private final dmvs c = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.c();
        this.b.b();
        this.c.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i == 2) {
            this.b.a(i2);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            this.c.a(i2);
            return true;
        }
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i != 4) {
            return;
        }
        Q(this.p, i2, i3, this.a);
    }

    public final int d() {
        return this.a.b;
    }

    public final float e(int i) {
        return this.a.b(i);
    }

    public final int f() {
        return this.b.a;
    }

    public final boolean g() {
        return this.c.a != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            float e = e(i);
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("color_transform_matrix: ");
            sb2.append(e);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        if (this.b.b) {
            int f = f();
            StringBuilder sb3 = new StringBuilder(21);
            sb3.append("z_plane: ");
            sb3.append(f);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        if (this.c.b) {
            boolean g = g();
            StringBuilder sb4 = new StringBuilder(11);
            sb4.append("off: ");
            sb4.append(g);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        return sb.toString();
    }
}
