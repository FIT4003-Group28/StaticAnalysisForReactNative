package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dxp  reason: default package */
/* loaded from: classes6.dex */
public final class dxp {
    public final List<dxo> a = new ArrayList();
    private dxn b = dxn.d;

    public dxp(List<dfnb> list) {
        for (dfnb dfnbVar : list) {
            dfmx dfmxVar = dfnbVar.a;
            dcwh c = c((dfmxVar == null ? dfmx.b : dfmxVar).a);
            if (c != null) {
                ArrayList arrayList = new ArrayList();
                for (dfmi dfmiVar : dfnbVar.c) {
                    dgrh dgrhVar = dfmiVar.b;
                    akqi k = akqi.k(dgrhVar == null ? dgrh.d : dgrhVar);
                    dcwh c2 = c(dfmiVar.a);
                    if (c2 != null) {
                        arrayList.add(new dxm(k, c2, dfmiVar.c));
                    }
                }
                dgrh dgrhVar2 = dfnbVar.b;
                this.a.add(new dxo(akqi.k(dgrhVar2 == null ? dgrh.d : dgrhVar2), c, arrayList));
            }
        }
    }

    public static boolean b(dfmh dfmhVar, dsza dszaVar) {
        if ((dszaVar.a & 4) != 0) {
            double d = dszaVar.d;
            if (dfmhVar.d <= d && d < dfmhVar.e) {
                return true;
            }
        }
        return false;
    }

    @dzsi
    private static dcwh c(dspd dspdVar) {
        if (!dspdVar.u()) {
            try {
                return dcwh.c(dspdVar.r());
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    public final dxr a(dsza dszaVar) {
        dfmh dfmhVar;
        dcwa k = dcvs.b(dszaVar.b, dszaVar.c).k();
        dxm dxmVar = this.b.b;
        if (dxmVar != null && dxmVar.b.h(k) && (((dfmhVar = this.b.c) != null && b(dfmhVar, dszaVar)) || (this.b.c == null && (dszaVar.a & 4) == 0))) {
            return this.b.a();
        }
        dxo dxoVar = this.b.a;
        dfmh dfmhVar2 = null;
        if (dxoVar == null || !dxoVar.b.h(k)) {
            this.b = dxn.d;
            for (dxo dxoVar2 : this.a) {
                if (dxoVar2.b.h(k)) {
                    dxm a = dxoVar2.a(k);
                    if (a != null) {
                        dfmhVar2 = a.a(dszaVar);
                    }
                    dxn dxnVar = new dxn(dxoVar2, a, dfmhVar2);
                    this.b = dxnVar;
                    return dxnVar.a();
                }
            }
            return this.b.a();
        }
        dxm a2 = dxoVar.a(k);
        if (a2 != null) {
            dfmhVar2 = a2.a(dszaVar);
        }
        dxn dxnVar2 = new dxn(this.b.a, a2, dfmhVar2);
        this.b = dxnVar2;
        return dxnVar2.a();
    }
}
