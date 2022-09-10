package defpackage;
/* compiled from: PG */
/* renamed from: biza  reason: default package */
/* loaded from: classes3.dex */
final class biza implements Runnable {
    final /* synthetic */ bwrs a;
    final /* synthetic */ bizd b;

    public biza(bizd bizdVar, bwrs bwrsVar) {
        this.b = bizdVar;
        this.a = bwrsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.a().Q(this.a);
    }
}
