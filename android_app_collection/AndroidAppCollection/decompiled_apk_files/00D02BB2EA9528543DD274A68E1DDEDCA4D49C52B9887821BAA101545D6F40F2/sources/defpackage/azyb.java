package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azyb  reason: default package */
/* loaded from: classes.dex */
public final class azyb extends azxm<azyf> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.TRIP;
    }

    @Override // defpackage.azxm
    public final azwh<azyf> c(byte[] bArr) {
        try {
            return new azye((drki) dsqw.cq(drki.h, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        doiy doiyVar;
        if (doizVar.b == 20) {
            doiyVar = (doiy) doizVar.c;
        } else {
            doiyVar = doiy.b;
        }
        ArrayList arrayList = new ArrayList();
        for (doix doixVar : doiyVar.a) {
            int a = doiv.a(doixVar.a);
            if (a != 0 && a == 3) {
                azxm<azyf> azxmVar = azxm.l;
                drki drkiVar = doixVar.b;
                if (drkiVar == null) {
                    drkiVar = drki.h;
                }
                arrayList.add(azwj.a(azxmVar, drkiVar.b));
                azxm<azxe> azxmVar2 = azxm.m;
                drki drkiVar2 = doixVar.b;
                if (drkiVar2 == null) {
                    drkiVar2 = drki.h;
                }
                arrayList.add(azwj.b(azxmVar2, drkiVar2.b));
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final List<azyf> e(doiz doizVar) {
        doiy doiyVar;
        if (doizVar.b == 20) {
            doiyVar = (doiy) doizVar.c;
        } else {
            doiyVar = doiy.b;
        }
        ArrayList arrayList = new ArrayList();
        for (doix doixVar : doiyVar.a) {
            int a = doiv.a(doixVar.a);
            if (a != 0 && a == 2) {
                drki drkiVar = doixVar.b;
                if (drkiVar == null) {
                    drkiVar = drki.h;
                }
                arrayList.add(new azye(drkiVar).b());
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azyf azyfVar) {
        return azyfVar.g().bS();
    }
}
