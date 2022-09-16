package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azxy  reason: default package */
/* loaded from: classes.dex */
public final class azxy extends azxm<azxg> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.SAVES_ITEM;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ azwh<azxg> c(byte[] bArr) {
        try {
            return new azxf((dolm) dsqw.cq(dolm.f, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        doik doikVar;
        if (doizVar.b == 19) {
            doikVar = (doik) doizVar.c;
        } else {
            doikVar = doik.b;
        }
        ArrayList arrayList = new ArrayList();
        for (doij doijVar : doikVar.a) {
            int a = doih.a(doijVar.a);
            if (a != 0 && a == 3) {
                azxm<azxg> azxmVar = azxm.k;
                dolm dolmVar = doijVar.b;
                if (dolmVar == null) {
                    dolmVar = dolm.f;
                }
                dppl dpplVar = dolmVar.b;
                if (dpplVar == null) {
                    dpplVar = dppl.m;
                }
                dppt dpptVar = dpplVar.d;
                if (dpptVar == null) {
                    dpptVar = dppt.e;
                }
                dolm dolmVar2 = doijVar.b;
                if (dolmVar2 == null) {
                    dolmVar2 = dolm.f;
                }
                arrayList.add(azwj.a(azxmVar, azxg.l(dpptVar, dolmVar2.c)));
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final List<azxg> e(doiz doizVar) {
        doik doikVar;
        if (doizVar.b == 19) {
            doikVar = (doik) doizVar.c;
        } else {
            doikVar = doik.b;
        }
        ArrayList arrayList = new ArrayList();
        for (doij doijVar : doikVar.a) {
            int a = doih.a(doijVar.a);
            if (a != 0 && a == 2) {
                dolm dolmVar = doijVar.b;
                if (dolmVar == null) {
                    dolmVar = dolm.f;
                }
                arrayList.add(new azxf(dolmVar).b());
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azxg azxgVar) {
        return azxgVar.g().bS();
    }

    @Override // defpackage.azxm
    public final ckhg g() {
        return ckkf.n;
    }
}
