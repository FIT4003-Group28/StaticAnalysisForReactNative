package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azya  reason: default package */
/* loaded from: classes.dex */
public final class azya extends azxm<azxk> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.STARRED_PLACE;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ azwh<azxk> c(byte[] bArr) {
        try {
            return new azxj((dolq) dsqw.cq(dolq.e, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        domb dombVar;
        if (doizVar.b == 11) {
            dombVar = (domb) doizVar.c;
        } else {
            dombVar = domb.b;
        }
        ArrayList arrayList = new ArrayList();
        for (doma domaVar : dombVar.a) {
            int a = doly.a(domaVar.a);
            if (a != 0 && a == 3) {
                azxm<azxk> azxmVar = azxm.e;
                dolq dolqVar = domaVar.b;
                if (dolqVar == null) {
                    dolqVar = dolq.e;
                }
                arrayList.add(azwj.a(azxmVar, dolqVar.b));
            }
        }
        for (dojx dojxVar : doizVar.f) {
            int a2 = dojw.a(dojxVar.c);
            if (a2 != 0 && a2 == 1) {
                arrayList.add(azwj.c(azxm.e, dojxVar.b));
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final List<azxk> e(doiz doizVar) {
        domb dombVar;
        if (doizVar.b == 11) {
            dombVar = (domb) doizVar.c;
        } else {
            dombVar = domb.b;
        }
        ArrayList arrayList = new ArrayList();
        for (doma domaVar : dombVar.a) {
            int a = doly.a(domaVar.a);
            if (a != 0 && a == 2) {
                dolq dolqVar = domaVar.b;
                if (dolqVar == null) {
                    dolqVar = dolq.e;
                }
                arrayList.add(new azxj(dolqVar).b());
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azxk azxkVar) {
        return azxkVar.g().bS();
    }

    @Override // defpackage.azxm
    public final ckhg g() {
        return ckkf.i;
    }
}
