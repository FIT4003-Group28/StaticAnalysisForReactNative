package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deih  reason: default package */
/* loaded from: classes6.dex */
public final class deih extends deii {
    public deih(dehz dehzVar) {
        super(dehzVar);
    }

    @Override // defpackage.deii
    public final double f() {
        return this.c;
    }

    @Override // defpackage.deii
    public final void g(double d) {
        double d2 = this.b;
        this.b = d;
        if (d2 == Double.POSITIVE_INFINITY) {
            this.a = d;
            return;
        }
        double d3 = dcyn.a;
        if (d2 != dcyn.a) {
            d3 = (this.a * d) / d2;
        }
        this.a = d3;
    }

    @Override // defpackage.deii
    public final long h() {
        return 0L;
    }
}
