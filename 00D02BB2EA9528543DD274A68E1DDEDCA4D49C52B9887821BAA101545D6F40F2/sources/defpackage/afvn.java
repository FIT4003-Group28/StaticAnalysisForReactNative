package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afvn  reason: default package */
/* loaded from: classes2.dex */
public final class afvn implements btxt {
    final /* synthetic */ afvo a;

    public afvn(afvo afvoVar) {
        this.a = afvoVar;
    }

    @Override // defpackage.btxt
    public final void a(int i) {
        if (i == 1) {
            final afwg afwgVar = this.a.a;
            afwgVar.B.execute(new Runnable(afwgVar) { // from class: afvm
                private final afwg a;

                {
                    this.a = afwgVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    afwg afwgVar2 = this.a;
                    afwgVar2.i.a().r(true);
                    afwgVar2.x.a().q("mobile_gmm_side_menu_android");
                    afwgVar2.i.a().r(false);
                }
            });
            return;
        }
        this.a.a.r();
    }
}
