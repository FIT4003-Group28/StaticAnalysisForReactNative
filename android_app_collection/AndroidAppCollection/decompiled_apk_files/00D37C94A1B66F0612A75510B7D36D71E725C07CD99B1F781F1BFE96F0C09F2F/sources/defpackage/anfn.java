package defpackage;
/* compiled from: PG */
/* renamed from: anfn  reason: default package */
/* loaded from: classes.dex */
public final class anfn implements aopn {
    private final /* synthetic */ int a;

    public anfn() {
    }

    public anfn(int i) {
        this.a = i;
    }

    @Override // defpackage.aopn
    /* renamed from: findValueByNumber */
    public final /* bridge */ /* synthetic */ aopm mo283findValueByNumber(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                return dwg.a(i);
            }
            if (i2 == 2) {
                return aspb.b(i);
            }
            if (i2 == 3) {
                return asxh.b(i);
            }
            if (i2 == 4) {
                return avdb.b(i);
            }
            if (i2 == 5) {
                return avdc.b(i);
            }
            return baau.b(i);
        }
        return anfp.a(i);
    }
}
