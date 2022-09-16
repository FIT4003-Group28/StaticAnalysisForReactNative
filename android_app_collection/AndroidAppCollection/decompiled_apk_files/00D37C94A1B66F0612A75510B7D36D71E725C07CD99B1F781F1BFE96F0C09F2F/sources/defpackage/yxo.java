package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: yxo  reason: default package */
/* loaded from: classes4.dex */
final class yxo implements Runnable {
    final /* synthetic */ yxp a;

    public yxo(yxp yxpVar) {
        this.a = yxpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yxp yxpVar = this.a;
        ylr.b();
        ArrayList arrayList = new ArrayList();
        for (yxn yxnVar : yxpVar.c.values()) {
            Iterator it = yxnVar.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((yxr) yxpVar.b.get((String) it.next())).c()) {
                        break;
                    }
                } else {
                    arrayList.add(yxnVar);
                    break;
                }
            }
        }
        Collections.sort(arrayList, yxp.a);
        if (arrayList.size() <= 0) {
            return;
        }
        yxn yxnVar2 = (yxn) arrayList.get(0);
        throw null;
    }
}
