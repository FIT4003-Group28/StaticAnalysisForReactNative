package defpackage;
/* renamed from: cctg  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cctg implements cctm {
    static final cctm a = new cctg();

    private cctg() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        djoz djozVar = (djoz) obj;
        if (djozVar != null) {
            dqhy b = dqhy.b(djozVar.b);
            if (b == null) {
                b = dqhy.UNKNOWN_STATUS_CODE;
            }
            if (b.equals(dqhy.OK)) {
                return djozVar;
            }
        }
        throw new ccss(bttq.HTTP_SERVER_ERROR);
    }
}
