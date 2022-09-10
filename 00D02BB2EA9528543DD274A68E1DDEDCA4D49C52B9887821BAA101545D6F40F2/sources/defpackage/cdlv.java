package defpackage;
/* compiled from: PG */
/* renamed from: cdlv  reason: default package */
/* loaded from: classes4.dex */
public final class cdlv {
    private final bquw a;

    public cdlv(bquw bquwVar) {
        this.a = bquwVar;
    }

    public final void a(int i, bwrs<ilo> bwrsVar, Class<? extends bqld> cls, Class<?> cls2) {
        bquw bquwVar = this.a;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        bqle e = bqlf.e();
        e.c(bwrsVar);
        ((bqjb) e).b = i;
        int i2 = i - 1;
        if (i2 == 0) {
            e.b(c.bq());
        } else if (i2 != 2) {
            e.b(docg.M);
        } else {
            e.b(c.bs());
        }
        bquwVar.a(cls, e.a(), cls2);
    }
}
