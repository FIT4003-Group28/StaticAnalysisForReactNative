package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: addf  reason: default package */
/* loaded from: classes.dex */
public final class addf {
    public final dp a;
    public final acti b;
    public final adnq c;
    adde d;

    public addf(dp dpVar, acti actiVar, adnq adnqVar) {
        this.a = dpVar;
        this.b = actiVar;
        this.c = adnqVar;
        dpVar.X.c(new f() { // from class: com.google.android.libraries.youtube.mdx.manualpairing.DeleteTvCodesController$1
            @Override // defpackage.f, defpackage.g
            public final void kG(apy apyVar) {
                addf.this.a();
            }

            @Override // defpackage.f, defpackage.g
            public final void lc(apy apyVar) {
                dh dhVar;
                addf addfVar = addf.this;
                dp dpVar2 = addfVar.a;
                if (dpVar2 == null || (dhVar = (dh) dpVar2.mJ().getSupportFragmentManager().f("confirmRemoveDialog")) == null) {
                    return;
                }
                dhVar.aD(addfVar.a);
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void ld(apy apyVar) {
            }

            @Override // defpackage.g
            public final /* synthetic */ void nA(apy apyVar) {
            }

            @Override // defpackage.g
            public final /* synthetic */ void nv(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void nz(apy apyVar) {
            }
        });
    }

    public final void a() {
        List e = this.c.e();
        adde addeVar = this.d;
        addeVar.d = e;
        addeVar.mr();
    }
}
