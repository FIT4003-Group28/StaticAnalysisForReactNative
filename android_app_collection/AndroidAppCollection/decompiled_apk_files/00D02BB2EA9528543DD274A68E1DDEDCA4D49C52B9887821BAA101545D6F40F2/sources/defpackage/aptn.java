package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.merchantmode.webview.InsightsReportWebViewCallbacks;
/* compiled from: PG */
/* renamed from: aptn  reason: default package */
/* loaded from: classes2.dex */
public final class aptn extends itb implements apus {
    private static final dcqe a = dcqe.c("aptn");
    private final Context b;
    private final dxio<bvvw> c;

    public aptn(Context context, dxio<bvvw> dxioVar) {
        this.b = context;
        this.c = dxioVar;
    }

    @Override // defpackage.apus
    public final void e(bwrs<ilo> bwrsVar, boolean z) {
        dbsg dbsgVar;
        ilo c = bwrsVar.c();
        if (c == null || (c.bf().a & 16777216) == 0) {
            bvoo.h("Merchant info doesn't exist.", new Object[0]);
            dbsgVar = dbpy.a;
        } else {
            dvwi dvwiVar = c.bf().v;
            if (dvwiVar == null) {
                dvwiVar = dvwi.m;
            }
            if (z) {
                if ((dvwiVar.a & 512) != 0) {
                    dnpq dnpqVar = dvwiVar.j;
                    if (dnpqVar == null) {
                        dnpqVar = dnpq.g;
                    }
                    dbsgVar = dbsg.i(dnpqVar);
                } else {
                    dbsgVar = dbpy.a;
                }
            } else if ((dvwiVar.a & 256) != 0) {
                dnpq dnpqVar2 = dvwiVar.i;
                if (dnpqVar2 == null) {
                    dnpqVar2 = dnpq.g;
                }
                dbsgVar = dbsg.i(dnpqVar2);
            } else {
                dbsgVar = dbpy.a;
            }
        }
        if (!dbsgVar.a()) {
            return;
        }
        bvxn bZ = bvxu.A.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        bvxuVar.a |= 4;
        bvxuVar.d = true;
        bvxp f = bvoa.f(ibm.b(), this.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar2.x = f;
        bvxuVar2.a |= 4194304;
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
        bvxu bvxuVar3 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar3.j = bK;
        bvxuVar3.a |= 256;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        int i = bvxuVar4.a | 512;
        bvxuVar4.a = i;
        bvxuVar4.k = true;
        bvxuVar4.a = i | 32;
        bvxuVar4.g = true;
        bvxu.b(bvxuVar4);
        String str = ((dnpq) dbsgVar.b()).c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ.b;
        str.getClass();
        bvxuVar5.a |= 1;
        bvxuVar5.b = str;
        bvvw a2 = this.c.a();
        bvvr e = bvvs.e();
        e.b(bZ.bK());
        ((bvvn) e).b = new InsightsReportWebViewCallbacks(bwrsVar);
        a2.r(e.a(), z ? dtxv.ct : dtxv.cu);
    }
}
