package defpackage;
/* compiled from: PG */
/* renamed from: ackx  reason: default package */
/* loaded from: classes2.dex */
final class ackx implements Runnable {
    final /* synthetic */ bwrs a;
    final /* synthetic */ acky b;

    public ackx(acky ackyVar, bwrs bwrsVar) {
        this.b = ackyVar;
        this.a = bwrsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acky ackyVar = this.b;
        gga ggaVar = ackyVar.a;
        bwqv bwqvVar = ackyVar.b;
        bwrs bwrsVar = this.a;
        ackv ackvVar = new ackv();
        ackvVar.B(ackv.w(bwqvVar, bwrsVar));
        ggaVar.D(ackvVar);
    }
}
