package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: dyrn  reason: default package */
/* loaded from: classes6.dex */
final class dyrn implements Runnable {
    final /* synthetic */ dyro a;

    public dyrn(dyro dyroVar) {
        this.a = dyroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyro dyroVar = this.a;
        Collection<dyro<?, ?>> collection = dyroVar.f.b.w;
        if (collection != null) {
            collection.remove(dyroVar);
            if (!this.a.f.b.w.isEmpty()) {
                return;
            }
            dyrz dyrzVar = this.a.f.b;
            dyrzVar.R.a(dyrzVar.x, false);
            dyrz dyrzVar2 = this.a.f.b;
            dyrzVar2.w = null;
            if (!dyrzVar2.A.get()) {
                return;
            }
            this.a.f.b.z.a(dyrz.d);
        }
    }
}
