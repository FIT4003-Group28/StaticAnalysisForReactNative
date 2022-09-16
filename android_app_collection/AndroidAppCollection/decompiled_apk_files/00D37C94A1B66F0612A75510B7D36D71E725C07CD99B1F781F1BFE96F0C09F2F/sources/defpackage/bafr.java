package defpackage;
/* compiled from: PG */
/* renamed from: bafr  reason: default package */
/* loaded from: classes2.dex */
final class bafr implements Runnable {
    final /* synthetic */ bafs a;

    public bafr(bafs bafsVar) {
        this.a = bafsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bagd bagdVar = this.a.b;
        baga bagaVar = bagdVar.b;
        bagaVar.a(new bafv(bagaVar, bagdVar.o, bagdVar.p));
    }
}
