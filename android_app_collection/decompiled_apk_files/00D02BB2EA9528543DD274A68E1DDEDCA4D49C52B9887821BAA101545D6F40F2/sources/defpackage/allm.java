package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: allm  reason: default package */
/* loaded from: classes.dex */
public final class allm implements Runnable {
    final /* synthetic */ allr a;

    public allm(allr allrVar) {
        this.a = allrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this.a.j) {
            z = this.a.k;
        }
        dcdc<alrj> dcdcVar = this.a.t;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).e.n(z);
        }
        amxj amxjVar = this.a.f;
        if (amxjVar != null) {
            amxjVar.n(z);
        }
    }
}
