package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: vny  reason: default package */
/* loaded from: classes7.dex */
final class vny implements wtm {
    final /* synthetic */ vog a;

    public vny(vog vogVar) {
        this.a = vogVar;
    }

    @Override // defpackage.wtm
    public final void Rh(wtl wtlVar) {
        int i;
        vog vogVar = this.a;
        if (wtlVar == wtl.INVALIDATED || wtlVar == wtl.UPDATE_SUCCEEDED) {
            vogVar.h = null;
            ArrayList arrayList = new ArrayList();
            for (voe voeVar : vogVar.g.values()) {
                Iterator<wuv> it = voeVar.c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    wuv next = it.next();
                    if (next.r() != null) {
                        arrayList.add(next.C(1));
                    }
                    voeVar.a = false;
                }
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    voeVar.a((wuv) arrayList.get(i));
                }
            }
            vogVar.d(1);
        }
    }
}
