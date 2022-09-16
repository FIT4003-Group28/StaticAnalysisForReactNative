package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: adpr  reason: default package */
/* loaded from: classes.dex */
final class adpr implements yiw {
    final /* synthetic */ adpt a;

    public adpr(adpt adptVar) {
        this.a = adptVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r2 = (Void) obj;
        zep.f(adpt.a, "Error loading available screens", exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Void r4 = (Void) obj;
        List<adif> list = (List) obj2;
        CopyOnWriteArrayList copyOnWriteArrayList = this.a.b;
        if (copyOnWriteArrayList.size() == list.size()) {
            for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                if (((adif) copyOnWriteArrayList.get(i)).equals(list.get(i))) {
                }
            }
            return;
        }
        synchronized (this.a) {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                adif adifVar = (adif) it.next();
                if (!list.contains(adifVar)) {
                    this.a.r(adifVar);
                }
            }
            for (adif adifVar2 : list) {
                this.a.p(adifVar2);
            }
        }
    }
}
