package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: ckqe  reason: default package */
/* loaded from: classes.dex */
public final class ckqe extends ckqk {
    public final ckqf a;
    public final /* synthetic */ ckqg b;

    public ckqe(ckqg ckqgVar, ckqf ckqfVar) {
        this.b = ckqgVar;
        this.a = ckqfVar;
    }

    @Override // defpackage.ckqk
    public final void a(Bitmap bitmap) {
        this.a.d(this.b);
        this.b.setTag(ckqg.e, Boolean.FALSE);
        ckqg ckqgVar = this.b;
        ckcw rU = ((ckcu) btsr.a(ckcu.class)).rU();
        eaow eaowVar = new eaow(ckqgVar.c, eapd.a());
        if (eaowVar.p(eaow.e(10L))) {
            ((ckcp) rU.a(ckip.aa)).a(eaowVar.b);
        }
    }

    @Override // defpackage.ckqk
    public final void b() {
        this.a.c(this.b);
    }
}
