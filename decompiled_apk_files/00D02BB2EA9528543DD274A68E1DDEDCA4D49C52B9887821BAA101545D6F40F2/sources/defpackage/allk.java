package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: allk  reason: default package */
/* loaded from: classes.dex */
public final class allk implements Runnable {
    final /* synthetic */ allr a;

    public allk(allr allrVar) {
        this.a = allrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        allr allrVar = this.a;
        allrVar.h.b(allrVar.u);
        this.a.h.d();
    }
}
