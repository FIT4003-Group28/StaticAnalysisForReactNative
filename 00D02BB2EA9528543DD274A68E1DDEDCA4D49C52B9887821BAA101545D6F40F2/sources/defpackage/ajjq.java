package defpackage;
/* renamed from: ajjq  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ajjq implements cpcf {
    static final cpcf a = new ajjq();

    private ajjq() {
    }

    @Override // defpackage.cpcf
    public final void a(cpcq cpcqVar) {
        if (!cpcqVar.a()) {
            bvoo.h("requestActivityUpdates onCompleteListener called when task is incomplete", new Object[0]);
        } else if (cpcqVar.b()) {
            cpcqVar.e();
            cpcqVar.d();
        } else {
            Exception e = cpcqVar.e();
            if (e != null) {
                bvoo.h("requestActivityUpdates failed to complete %s", e);
            } else {
                bvoo.h("requestActivityUpdates failed to complete but did not have an exception", new Object[0]);
            }
        }
    }
}
