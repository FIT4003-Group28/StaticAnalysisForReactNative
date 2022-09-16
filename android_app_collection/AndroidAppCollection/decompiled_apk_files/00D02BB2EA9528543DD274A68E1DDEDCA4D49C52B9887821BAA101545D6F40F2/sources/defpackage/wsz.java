package defpackage;

import android.content.Context;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wsz  reason: default package */
/* loaded from: classes7.dex */
public final class wsz implements nxe {
    private final wte a;
    private final dbsg<Integer> b;
    private final Context c;

    public wsz(wte wteVar, dbsg<Integer> dbsgVar, Context context) {
        this.a = wteVar;
        this.b = dbsgVar;
        this.c = context;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        dtqw dtqwVar = dthbVar.r;
        if (dtqwVar == null) {
            dtqwVar = dtqw.h;
        }
        if ((dtqwVar.a & 1) != 0) {
            dtqw dtqwVar2 = dthbVar.r;
            if (dtqwVar2 == null) {
                dtqwVar2 = dtqw.h;
            }
            return !dtqwVar2.c;
        }
        return false;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        amvh M;
        dnqh dnqhVar;
        dtqw dtqwVar = nviVar.a.r;
        if (dtqwVar == null) {
            dtqwVar = dtqw.h;
        }
        dtaq dtaqVar = dtqwVar.d;
        if (dtaqVar == null) {
            dtaqVar = dtaq.m;
        }
        dtao dtaoVar = dtaqVar.l;
        if (dtaoVar == null) {
            dtaoVar = dtao.e;
        }
        if ((dtaoVar.a & 512) != 0) {
            dpjx dpjxVar = dtqwVar.b;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            String str = dpjxVar.e;
            dsrj<dpce> dsrjVar = dtqwVar.e;
            dtaq dtaqVar2 = dtqwVar.d;
            if (dtaqVar2 == null) {
                dtaqVar2 = dtaq.m;
            }
            dtao dtaoVar2 = dtaqVar2.l;
            if (dtaoVar2 == null) {
                dtaoVar2 = dtao.e;
            }
            M = amvh.j(str, dsrjVar, dtaoVar2.d).a();
        } else {
            dpjx dpjxVar2 = dtqwVar.b;
            if (dpjxVar2 == null) {
                dpjxVar2 = dpjx.n;
            }
            M = amvh.M(dpjxVar2, this.c);
            if (dtqwVar.e.size() > 0) {
                amvg amvgVar = new amvg(M);
                amvgVar.b(dtqwVar.e);
                M = amvgVar.a();
            }
        }
        if ((dtqwVar.a & 16) != 0) {
            dnqg bZ = dnqh.p.bZ();
            String str2 = dtqwVar.g;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            str2.getClass();
            int i = dnqhVar2.a | 8;
            dnqhVar2.a = i;
            dnqhVar2.e = str2;
            String str3 = nviVar.c.b;
            if (str3 != null) {
                str3.getClass();
                dnqhVar2.a = i | 4;
                dnqhVar2.d = str3;
            }
            dnqhVar = bZ.bK();
        } else {
            dnqhVar = null;
        }
        wte wteVar = this.a;
        dbsg<Integer> dbsgVar = this.b;
        dwao dwaoVar = dtqwVar.f;
        if (dwaoVar == null) {
            dwaoVar = dwao.R;
        }
        wteVar.a(wtf.j(dbsgVar, M, dwaoVar, dnqhVar));
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.UPDATE_DIRECTIONS_STATE);
    }
}
