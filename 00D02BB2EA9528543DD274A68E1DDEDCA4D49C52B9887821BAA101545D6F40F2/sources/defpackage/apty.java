package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.merchantmode.webview.ReplyToReviewsWebViewCallbacks;
/* compiled from: PG */
/* renamed from: apty  reason: default package */
/* loaded from: classes2.dex */
public final class apty extends itb implements aput {
    private final Context a;
    private final dxio<bvvw> b;
    private final ckcw c;

    public apty(Context context, dxio<bvvw> dxioVar, ckcw ckcwVar) {
        this.a = context;
        this.b = dxioVar;
        this.c = ckcwVar;
    }

    private final bvxu i(String str, boolean z, @dzsi String str2, iuv iuvVar, boolean z2, boolean z3) {
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
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx dkyxVar = (dkyx) bZ2.b;
        dkyxVar.a |= 4;
        dkyxVar.d = z3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar2.j = bK;
        bvxuVar2.a |= 256;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        bvxuVar3.a |= 512;
        bvxuVar3.k = z;
        bvxp f = bvoa.f(iuvVar, this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar4.x = f;
        int i = bvxuVar4.a | 4194304;
        bvxuVar4.a = i;
        bvxuVar4.a = i | 32;
        bvxuVar4.g = z2;
        bvxu.b(bvxuVar4);
        if (!dbsj.d(str2)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar5 = (bvxu) bZ.b;
            str2.getClass();
            bvxuVar5.a |= 8192;
            bvxuVar5.o = str2;
        }
        return bZ.bK();
    }

    @Override // defpackage.aput
    public final void e(bwrs<ilo> bwrsVar, String str, String str2, boolean z) {
        bvxu i = i(str, true, str2, ibm.b(), true, true);
        bvvr e = bvvs.e();
        e.b(i);
        ReplyToReviewsWebViewCallbacks replyToReviewsWebViewCallbacks = new ReplyToReviewsWebViewCallbacks(bwrsVar);
        bvvn bvvnVar = (bvvn) e;
        bvvnVar.b = replyToReviewsWebViewCallbacks;
        bvvnVar.a = aptv.class;
        bvvs a = e.a();
        ((ckhe) this.c.a(ckgp.b)).a();
        ((ckhe) this.c.a(ckgp.a)).a();
        this.b.a().r(a, z ? dtxv.cK : dtxv.cM);
    }

    @Override // defpackage.aput
    public final void f(bwrs<ilo> bwrsVar, String str) {
        bvxu i = i(str, false, null, ibm.a(), false, false);
        ((ckhe) this.c.a(ckgp.d)).a();
        ((ckhe) this.c.a(ckgp.c)).a();
        this.b.a().j(i, new ReplyToReviewsWebViewCallbacks(bwrsVar), dtxv.cI);
    }
}
