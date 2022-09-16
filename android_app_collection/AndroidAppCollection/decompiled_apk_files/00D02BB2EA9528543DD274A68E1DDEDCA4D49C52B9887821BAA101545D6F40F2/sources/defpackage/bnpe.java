package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnpe  reason: default package */
/* loaded from: classes3.dex */
public final class bnpe implements bnph {
    private final bwqv a;

    public bnpe(bwqv bwqvVar) {
        this.a = bwqvVar;
    }

    @Override // defpackage.bnph
    public final void a(dbsg<Integer> dbsgVar, dpjn dpjnVar, List<dpca> list, String str, gfw gfwVar) {
        bwqv bwqvVar = this.a;
        bnpb bnpbVar = new bnpb();
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        bvrt.h(list, arrayList);
        bwqvVar.c(bundle, "REFINEMENT_REF_KEY", arrayList);
        bwqvVar.c(bundle, "WAYPOINT_REF_KEY", bvrt.b(dpjnVar));
        bundle.putString("SERVER_EI_REF_KEY", str);
        if (dbsgVar.a()) {
            bundle.putInt("WAYPOINT_INDEX_REF_KEY", dbsgVar.b().intValue());
        }
        bnpbVar.B(bundle);
        gfwVar.aZ(bnpbVar);
    }

    @Override // defpackage.bnph
    public final void b(dbsg<Integer> dbsgVar, bxmh bxmhVar, List<dwjj> list, gfw gfwVar) {
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        dpjx dpjxVar = dwjjVar.h;
        if (dpjxVar == null) {
            dpjxVar = dpjx.n;
        }
        dpjq ca = dpjx.n.ca(dpjxVar);
        String str = dxbpVar.c;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dpjx dpjxVar2 = (dpjx) ca.b;
        str.getClass();
        dpjxVar2.a |= 128;
        dpjxVar2.e = str;
        dpjm bZ = dpjn.m.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpjn dpjnVar = (dpjn) bZ.b;
        dpjx bK = ca.bK();
        bK.getClass();
        dpjnVar.b = bK;
        dpjnVar.a |= 1;
        dhjx dhjxVar = dwjjVar.i;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpjn dpjnVar2 = (dpjn) bZ.b;
        dhjxVar.getClass();
        dpjnVar2.f = dhjxVar;
        dpjnVar2.a |= 512;
        dpjn bK2 = bZ.bK();
        ArrayList arrayList = new ArrayList();
        for (dwjj dwjjVar2 : list) {
            dpbx bZ2 = dpca.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpca dpcaVar = (dpca) bZ2.b;
            dpcaVar.b = 3;
            dpcaVar.a |= 1;
            dpjx dpjxVar3 = dwjjVar2.h;
            if (dpjxVar3 == null) {
                dpjxVar3 = dpjx.n;
            }
            dpjq ca2 = dpjx.n.ca(dpjxVar3);
            dxbp dxbpVar2 = dwjjVar2.b;
            if (dxbpVar2 == null) {
                dxbpVar2 = dxbp.x;
            }
            String str2 = dxbpVar2.c;
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            dpjx dpjxVar4 = (dpjx) ca2.b;
            str2.getClass();
            dpjxVar4.a |= 128;
            dpjxVar4.e = str2;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpca dpcaVar2 = (dpca) bZ2.b;
            dpjx bK3 = ca2.bK();
            bK3.getClass();
            dpcaVar2.c = bK3;
            dpcaVar2.a |= 2;
            arrayList.add(bZ2.bK());
        }
        a(dbsgVar, bK2, arrayList, "", gfwVar);
    }
}
