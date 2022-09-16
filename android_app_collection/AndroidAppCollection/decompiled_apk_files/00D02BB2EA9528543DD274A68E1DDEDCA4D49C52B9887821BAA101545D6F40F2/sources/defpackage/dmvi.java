package defpackage;
/* compiled from: PG */
/* renamed from: dmvi  reason: default package */
/* loaded from: classes.dex */
public final class dmvi extends dmvw {
    private final dmvr a = new dmvr();
    private final dmvr b = new dmvr();

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.c();
        this.b.c();
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i == 1) {
            P(this.p, i2, i3, this.a);
        } else if (i != 2) {
        } else {
            P(this.p, i2, i3, this.b);
        }
    }

    public final int d() {
        return this.a.b;
    }

    public final int e(int i) {
        return this.a.b(i);
    }

    public final int f() {
        return this.b.b;
    }

    public final int g(int i) {
        return this.b.b(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            int e = e(i);
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("sub_style_tag: ");
            sb2.append(e);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        for (int i2 = 0; i2 < f(); i2++) {
            int g = g(i2);
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("global_style_id: ");
            sb3.append(g);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        return sb.toString();
    }
}
