package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyrj  reason: default package */
/* loaded from: classes6.dex */
public final class dyrj implements Runnable {
    final /* synthetic */ dyrp a;

    public dyrj(dyrp dyrpVar) {
        this.a = dyrpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        if (this.a.a.get() == dyrz.g) {
            this.a.a.set(null);
        }
        Collection<dyro<?, ?>> collection = this.a.b.w;
        if (collection != null) {
            for (dyro<?, ?> dyroVar : collection) {
                dyroVar.d("Channel is forcefully shutdown", null);
            }
        }
        dyry dyryVar = this.a.b.z;
        dyjb dyjbVar = dyrz.c;
        dyryVar.a(dyjbVar);
        synchronized (dyryVar.a) {
            arrayList = new ArrayList(dyryVar.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dyls) arrayList.get(i)).e(dyjbVar);
        }
        dyryVar.d.y.f(dyjbVar);
    }
}
