package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bafw  reason: default package */
/* loaded from: classes2.dex */
public final class bafw implements bage {
    final /* synthetic */ baga a;

    public bafw(baga bagaVar) {
        this.a = bagaVar;
    }

    @Override // defpackage.bage
    public final void a() {
        if (this.a.d.g.compareAndSet(1, 4)) {
            baga bagaVar = this.a;
            bagx bagxVar = bagaVar.a;
            bagd bagdVar = bagaVar.d;
            bagxVar.onResponseStarted(bagdVar, bagdVar.o);
        }
    }
}
