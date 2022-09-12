package defpackage;
/* renamed from: ccte  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ccte implements cctm {
    static final cctm a = new ccte();

    private ccte() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        djsz djszVar = (djsz) obj;
        if (djszVar == null || djszVar.a.size() <= 0) {
            throw new ccss(bttq.HTTP_SERVER_ERROR);
        }
        int a2 = drbb.a(djszVar.a.get(0).b);
        if (a2 != 0 && a2 == 2) {
            return djszVar;
        }
        int i = djszVar.a.get(0).b;
        throw new ccss(bttq.HTTP_SERVER_ERROR);
    }
}
