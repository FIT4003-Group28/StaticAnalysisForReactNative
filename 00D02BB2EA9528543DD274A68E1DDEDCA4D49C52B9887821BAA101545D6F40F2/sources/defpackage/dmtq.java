package defpackage;
/* compiled from: PG */
/* renamed from: dmtq  reason: default package */
/* loaded from: classes.dex */
public final class dmtq extends dmvw {
    private final dmvt b = new dmvt();
    public final dmvq a = new dmvq();
    private dmto c = null;
    private final dmvs d = new dmvs(0);

    public dmtq() {
        new dmtp(this);
    }

    @Override // defpackage.dmvw
    protected final boolean T(int i) {
        return i == 1;
    }

    @Override // defpackage.dmvw
    protected final boolean U(int i, long j) {
        if (i != 1) {
            return false;
        }
        this.b.a(j);
        return true;
    }

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.b.b();
        this.a.a();
        dmto dmtoVar = this.c;
        if (dmtoVar != null) {
            dmtoVar.a();
        }
        this.d.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i != 3) {
            return false;
        }
        this.d.a(i2);
        return true;
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i != 2) {
            return;
        }
        this.a.f(i2, i3);
    }

    public final long d() {
        return this.b.a;
    }

    public final int e() {
        return this.a.b;
    }

    public final dmto f(int i) {
        if (this.c == null) {
            this.c = new dmto();
        }
        this.c.R(this.p, this.a.c(i), this.a.d(i));
        return this.c;
    }

    public final int g() {
        return this.d.a;
    }

    public final boolean h() {
        return this.d.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.b.b) {
            long d = d();
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("id: ");
            sb2.append(d);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        for (int i = 0; i < e(); i++) {
            String replace = f(i).toString().replace("\n", "\n  ");
            if (replace.endsWith("  ")) {
                replace = replace.substring(0, replace.length() - 2);
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(replace).length() + 15);
            sb3.append("key_zoom {\n  ");
            sb3.append(replace);
            sb3.append("}\n");
            sb.append(sb3.toString());
        }
        if (h()) {
            int g = g();
            StringBuilder sb4 = new StringBuilder(24);
            sb4.append("sub_styles: ");
            sb4.append(g);
            sb4.append("\n");
            sb.append(sb4.toString());
        }
        return sb.toString();
    }
}
