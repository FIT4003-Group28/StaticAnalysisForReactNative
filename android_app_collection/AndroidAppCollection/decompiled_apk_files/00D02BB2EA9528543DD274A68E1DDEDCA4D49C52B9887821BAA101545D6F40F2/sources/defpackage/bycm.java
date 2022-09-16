package defpackage;
/* compiled from: PG */
/* renamed from: bycm  reason: default package */
/* loaded from: classes4.dex */
final class bycm implements crzp<btvo> {
    final /* synthetic */ bycn a;

    public bycm(bycn bycnVar) {
        this.a = bycnVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btvo> crzmVar) {
        try {
            bycn bycnVar = this.a;
            btvo l = crzmVar.l();
            dbsk.s(l);
            String str = l.getServerSettingParameters().a;
            bvrj.UI_THREAD.c();
            if (!str.isEmpty()) {
                if (bycnVar.a.J(gfu.ACTIVITY_FRAGMENT) instanceof byck) {
                    return;
                }
                bycnVar.b.execute(new bycl(bycnVar, str));
            } else if (!(bycnVar.a.J(gfu.ACTIVITY_FRAGMENT) instanceof byck)) {
            } else {
                bycnVar.a.g().e();
            }
        } catch (NullPointerException e) {
            bvoo.i(e);
        }
    }
}
