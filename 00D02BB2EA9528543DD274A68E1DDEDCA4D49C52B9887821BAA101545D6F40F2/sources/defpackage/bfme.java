package defpackage;

import android.text.style.ClickableSpan;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfme  reason: default package */
/* loaded from: classes3.dex */
public final class bfme implements bflm {
    final bnhv a;

    public bfme(bnhv bnhvVar) {
        this.a = bnhvVar;
    }

    @Override // defpackage.bflm
    public final List<Pair<String, ClickableSpan>> a(ilo iloVar) {
        cjtd a;
        int a2;
        ArrayList arrayList = new ArrayList();
        Iterator<dwca> it = iloVar.h().aD.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dwca next = it.next();
            int a3 = dwck.a(next.b);
            if (a3 != 0 && a3 == 2 && next.a.size() > 0) {
                dwcg dwcgVar = next.a.get(0);
                dnjf ad = iloVar.ad();
                if (ad == null || (a2 = dnje.a(ad.a)) == 0 || a2 != 2) {
                    a = cjtd.a(dtxr.u);
                } else {
                    cjta b = cjtd.b();
                    b.d = dtxo.ax;
                    b.g(ad.c);
                    a = b.a();
                }
                String str = dwcgVar.d;
                arrayList.add(Pair.create(str, this.a.a(str, akqi.b(dwcgVar.e), a)));
            }
        }
        return arrayList;
    }
}
