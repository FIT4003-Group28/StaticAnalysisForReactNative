package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.merchantmode.webview.DeletePostsWebViewCallbacks;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: aptg  reason: default package */
/* loaded from: classes2.dex */
public final class aptg extends itb implements apuq {
    private final Context a;
    private final dxio<bvvw> b;
    private final ckcw c;

    public aptg(Context context, dxio<bvvw> dxioVar, ckcw ckcwVar) {
        this.a = context;
        this.b = dxioVar;
        this.c = ckcwVar;
    }

    @Override // defpackage.apuq
    public final void e(ilo iloVar, dipk dipkVar) {
        if ((dipkVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) {
            iloVar.cQ();
            return;
        }
        ((ckhe) this.c.a(ckgp.k)).a();
        ((ckhe) this.c.a(ckgp.j)).a();
        bvvw a = this.b.a();
        String str = dipkVar.r;
        bvxn bZ = bvxu.A.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str.getClass();
        bvxuVar.a |= 1;
        bvxuVar.b = str;
        dkyw bZ2 = dkyx.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.b((dkyx) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar2.j = bK;
        bvxuVar2.a |= 256;
        bvxp f = bvoa.f(ibm.a(), this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar3.x = f;
        bvxuVar3.a |= 4194304;
        bvxu.b(bvxuVar3);
        a.j(bZ.bK(), new DeletePostsWebViewCallbacks(iloVar), dtxv.co);
    }
}
