package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aanm  reason: default package */
/* loaded from: classes2.dex */
public class aanm {
    private static final dcqe a = dcqe.c("aanm");
    private final bmdq b;
    private final Activity c;
    private final dxio<afha> d;

    public aanm(bmdq bmdqVar, Activity activity, dxio<afha> dxioVar) {
        this.b = bmdqVar;
        this.c = activity;
        this.d = dxioVar;
    }

    private static cjtd b(ditx ditxVar, String str) {
        cjta b = cjtd.b();
        int i = ditxVar.a;
        int i2 = 2;
        if (i == 0) {
            i2 = 3;
        } else if (i == 2) {
            i2 = 1;
        } else if (i != 4) {
            i2 = 0;
        }
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            b.d = dtxo.aE;
        } else if (i3 == 1) {
            b.d = dtxo.aD;
        } else {
            bvoo.h("Unknown ActionListItem type, unable to create logging params, %s", ditxVar);
            return cjtd.b;
        }
        if (!dbsj.d(str)) {
            b.g(str);
        }
        return b.a();
    }

    public final aanf a(diub diubVar, String str) {
        aajc aajcVar;
        dccx F = dcdc.F();
        for (ditz ditzVar : diubVar.c) {
            dccx F2 = dcdc.F();
            for (ditx ditxVar : ditzVar.c) {
                String str2 = ditzVar.a;
                int i = ditxVar.a;
                if (i == 4) {
                    dgfy dgfyVar = (dgfy) ditxVar.b;
                    ditv b = ditv.b(ditxVar.c);
                    if (b == null) {
                        b = ditv.DEFAULT_ICON;
                    }
                    aajcVar = new aajf(dgfyVar, b, str2, b(ditxVar, str), this.b, this.c);
                } else if (i == 2) {
                    dnpq dnpqVar = (dnpq) ditxVar.b;
                    ditv b2 = ditv.b(ditxVar.c);
                    if (b2 == null) {
                        b2 = ditv.DEFAULT_ICON;
                    }
                    aajcVar = new aajh(dnpqVar, b2, b(ditxVar, str), this.d.a());
                } else {
                    aajcVar = null;
                }
                if (aajcVar != null) {
                    F2.g(aajcVar);
                }
            }
            F.g(new aanl(ditzVar, F2.f()));
        }
        return new aann(diubVar, F.f());
    }
}
