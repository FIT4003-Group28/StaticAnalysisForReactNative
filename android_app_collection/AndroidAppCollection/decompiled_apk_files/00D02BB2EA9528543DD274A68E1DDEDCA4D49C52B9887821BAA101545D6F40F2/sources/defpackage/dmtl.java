package defpackage;
/* compiled from: PG */
/* renamed from: dmtl  reason: default package */
/* loaded from: classes.dex */
public final class dmtl extends dmvw {
    private final dmvr a = new dmvr();

    @Override // defpackage.dmvw
    public final void a() {
        super.a();
        this.a.c();
    }

    @Override // defpackage.dmvw
    protected final void c(int i, int i2, int i3) {
        if (i != 1) {
            return;
        }
        P(this.p, i2, i3, this.a);
    }

    public final int d() {
        return this.a.b;
    }

    public final int e(int i) {
        return this.a.b(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            int e = e(i);
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("ordered_use_cases: ");
            sb2.append(e);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }
}
