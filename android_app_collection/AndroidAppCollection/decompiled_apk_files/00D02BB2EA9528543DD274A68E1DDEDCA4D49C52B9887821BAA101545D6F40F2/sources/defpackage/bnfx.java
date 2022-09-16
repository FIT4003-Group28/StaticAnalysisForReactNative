package defpackage;

import android.view.View;
import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnfx  reason: default package */
/* loaded from: classes3.dex */
public final class bnfx implements View.OnClickListener {
    final /* synthetic */ bngi a;
    final /* synthetic */ dxio b;
    final /* synthetic */ cdjd c;
    final /* synthetic */ bwrs d;

    public bnfx(bngi bngiVar, dxio dxioVar, cdjd cdjdVar, bwrs bwrsVar) {
        this.a = bngiVar;
        this.b = dxioVar;
        this.c = cdjdVar;
        this.d = bwrsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bnfy bnfyVar;
        cdjj cdjjVar = (cdjj) this.b.a();
        cdjb a = bneh.a(this.c);
        dzvx.c(a, "$this$id");
        String g = a.g();
        dzvx.b(g, "id()");
        dnqg bZ = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        bwrs<ilo> bwrsVar = this.d;
        bnfyVar = this.a.f;
        cdjjVar.b(g, bZ.bK(), bwrsVar, bnfyVar);
    }
}
