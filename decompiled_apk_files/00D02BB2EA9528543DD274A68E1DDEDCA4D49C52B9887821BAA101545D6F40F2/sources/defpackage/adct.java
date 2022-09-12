package defpackage;
/* compiled from: PG */
/* renamed from: adct  reason: default package */
/* loaded from: classes2.dex */
final class adct extends cqiw<cqkp> {
    private final dcdc<adfr> a;

    public adct(dcdc<adfr> dcdcVar) {
        super(dcdcVar);
        this.a = dcdcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cqkp> a() {
        cqmj<cqkp> gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0));
        dcpe<adfr> listIterator = this.a.listIterator();
        int i = 0;
        while (i < 3) {
            if (listIterator.hasNext()) {
                adfr next = listIterator.next();
                String f = next.f();
                gd.f(cqgr.fP(new adcy(!f.contains(" ") && !f.contains("-")), cqkz.a(next), cqgr.ca(Float.valueOf(1.0f))));
            } else {
                gd.f(cqgr.gm(cqgr.cd(-1), cqgr.ca(Float.valueOf(1.0f))));
            }
            i++;
            if (i < 3) {
                gd.f(iuh.c(new cqmp[0]));
            }
        }
        return gd;
    }
}
