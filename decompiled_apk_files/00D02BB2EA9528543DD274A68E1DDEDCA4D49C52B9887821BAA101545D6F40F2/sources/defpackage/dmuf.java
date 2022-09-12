package defpackage;
/* compiled from: PG */
/* renamed from: dmuf  reason: default package */
/* loaded from: classes6.dex */
public final class dmuf extends dmvw {
    private final dmvm a = new dmvm(1);
    private String b = null;
    private final dmvs c = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.a();
        this.b = null;
        this.c.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i != 3) {
            return false;
        }
        this.c.a(i2);
        return true;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a.b(0)) {
            String d = d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 19);
            sb2.append("alpha_mask_url: \"");
            sb2.append(d);
            sb2.append("\"\n");
            sb.append(sb2.toString());
        }
        if (f()) {
            int e = e();
            StringBuilder sb3 = new StringBuilder(41);
            sb3.append("alpha_mask_url_prefix_index: ");
            sb3.append(e);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        return sb.toString();
    }
}
