package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azyc  reason: default package */
/* loaded from: classes.dex */
public final class azyc extends azxm<azyh> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.TUTORIAL_HISTORY;
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        int a;
        ArrayList arrayList = new ArrayList();
        for (dojx dojxVar : doizVar.f) {
            int a2 = dojw.a(dojxVar.c);
            if ((a2 != 0 && a2 == 1) || ((a = dojw.a(dojxVar.c)) != 0 && a == 4)) {
                arrayList.add(azwj.c(azxm.f, dojxVar.b));
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final List<azyh> e(doiz doizVar) {
        domq domqVar;
        if (doizVar.b == 13) {
            domqVar = (domq) doizVar.c;
        } else {
            domqVar = domq.c;
        }
        ArrayList arrayList = new ArrayList();
        for (domp dompVar : domqVar.a) {
            int a = domn.a(dompVar.a);
            if (a != 0 && a == 2) {
                domd domdVar = dompVar.b;
                if (domdVar == null) {
                    domdVar = domd.d;
                }
                arrayList.add(new azyg(domdVar).b());
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azyh azyhVar) {
        return azyhVar.g().bS();
    }

    @Override // defpackage.azxm
    public final ckhg g() {
        return ckkf.j;
    }

    @Override // defpackage.azxm
    /* renamed from: h */
    public final azyg c(byte[] bArr) {
        try {
            return new azyg((domd) dsqw.cq(domd.d, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a SyncTutorialHistoryEntry proto.", e);
        }
    }
}
