package defpackage;
/* compiled from: PG */
/* renamed from: kgq  reason: default package */
/* loaded from: classes3.dex */
final class kgq implements Runnable {
    final /* synthetic */ kgr a;

    public kgq(kgr kgrVar) {
        this.a = kgrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kgr kgrVar = this.a;
        kgrVar.a.removeCallbacks(kgrVar.c);
        this.a.c(true);
    }
}
