package defpackage;
/* renamed from: ajjr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ajjr implements cpcf {
    static final cpcf a = new ajjr();

    private ajjr() {
    }

    @Override // defpackage.cpcf
    public final void a(cpcq cpcqVar) {
        if (!cpcqVar.a()) {
            bvoo.h("removeActivityUpdates onCompleteListener called when task is incomplete", new Object[0]);
        } else if (cpcqVar.b()) {
            cpcqVar.e();
            cpcqVar.d();
        } else {
            Exception e = cpcqVar.e();
            if (e != null) {
                bvoo.h("removeActivityUpdates failed to complete %s", e);
            } else {
                bvoo.h("removeActivityUpdates failed to complete but did not have an exception", new Object[0]);
            }
        }
    }
}
