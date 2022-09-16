package defpackage;
/* compiled from: PG */
/* renamed from: dmuy  reason: default package */
/* loaded from: classes6.dex */
public final class dmuy extends dmvw {
    private final dmvr b = new dmvr();
    public final dmvq a = new dmvq();
    private dmun c = null;

    public dmuy() {
        new dmux(this);
    }

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.b.c();
        this.a.a();
        dmun dmunVar = this.c;
        if (dmunVar != null) {
            dmunVar.a();
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
        if (i != 2) {
            return;
        }
        this.a.f(i2, i3);
    }

    public final int d() {
        return this.b.b;
    }

    public final int e(int i) {
        return this.b.b(i);
    }

    public final int f() {
        return this.a.b;
    }

    public final dmun g(int i) {
        if (this.c == null) {
            this.c = new dmun();
        }
        this.c.R(this.p, this.a.c(i), this.a.d(i));
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            int e = e(i);
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("map_style: ");
            sb2.append(e);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        for (int i2 = 0; i2 < f(); i2++) {
            String replace = g(i2).toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(replace).length() + 15);
            sb3.append("key_zoom {\n  ");
            sb3.append(replace);
            sb3.append("}\n");
            sb.append(sb3.toString());
        }
        return sb.toString();
    }
}
