package defpackage;
/* compiled from: PG */
/* renamed from: dmuu  reason: default package */
/* loaded from: classes6.dex */
public final class dmuu extends dmvw {
    private final dmvs a = new dmvs(0);
    private final dmvs b = new dmvs(0);

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.b();
        this.b.b();
    }

    @Override // defpackage.dmvw
    protected final boolean b(int i, int i2) {
        if (i == 1) {
            this.a.a(i2);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.b.a(i2);
            return true;
        }
    }

    public final int d() {
        return this.a.a;
    }

    public final int e() {
        return this.b.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a.b) {
            int d = d();
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("named_style_id: ");
            sb2.append(d);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        if (this.b.b) {
            int e = e();
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("global_style_id: ");
            sb3.append(e);
            sb3.append("\n");
            sb.append(sb3.toString());
        }
        return sb.toString();
    }
}
