package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axxn  reason: default package */
/* loaded from: classes3.dex */
public final class axxn implements Runnable {
    private final WeakReference<akzh> a;
    private final axxp<?> b;
    @dzsi
    private bnrs c = null;
    private long d = 0;

    public axxn(WeakReference<akzh> weakReference, axxp<?> axxpVar) {
        this.a = weakReference;
        this.b = axxpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        akzh akzhVar = this.a.get();
        if (akzhVar == null) {
            return;
        }
        this.b.e.b(this);
        bnrs f = akzhVar.f();
        axxp<?> axxpVar = this.b;
        axxpVar.g.c(axxpVar.c.l());
        if (f == this.c) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        long d = this.b.f.d(akzhVar, arrayList);
        boolean z = true;
        if (this.c != null && d == this.d) {
            z = false;
        }
        if (!arrayList.isEmpty() && z) {
            this.b.g.d(arrayList);
        }
        this.c = f;
        this.d = d;
    }
}
