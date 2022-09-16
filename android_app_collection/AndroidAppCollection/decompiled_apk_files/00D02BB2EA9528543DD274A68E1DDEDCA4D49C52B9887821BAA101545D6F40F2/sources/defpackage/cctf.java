package defpackage;
/* renamed from: cctf  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cctf implements cctm {
    static final cctm a = new cctf();

    private cctf() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dhuq dhuqVar = (dhuq) obj;
        if (dhuqVar == null || dhuqVar.a.isEmpty()) {
            throw new ccss(bttq.HTTP_SERVER_ERROR);
        }
        int a2 = drbb.a(dhuqVar.a.get(0).b);
        if (a2 != 0 && a2 == 2) {
            return dhuqVar;
        }
        int i = dhuqVar.a.get(0).b;
        throw new ccss(bttq.HTTP_SERVER_ERROR);
    }
}
