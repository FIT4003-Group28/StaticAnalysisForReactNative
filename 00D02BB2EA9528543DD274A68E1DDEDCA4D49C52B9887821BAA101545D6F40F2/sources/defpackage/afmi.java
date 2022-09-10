package defpackage;
/* compiled from: PG */
/* renamed from: afmi  reason: default package */
/* loaded from: classes2.dex */
final class afmi implements Runnable {
    final /* synthetic */ bwrs a;
    final /* synthetic */ afmj b;

    public afmi(afmj afmjVar, bwrs bwrsVar) {
        this.b = afmjVar;
        this.a = bwrsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bral f = bram.f(this.a);
        f.b(true);
        this.b.a.a().E(f.a());
    }
}
