package defpackage;
/* compiled from: PG */
/* renamed from: fpe  reason: default package */
/* loaded from: classes3.dex */
final class fpe implements Runnable {
    final /* synthetic */ fpg a;
    private final /* synthetic */ int b;

    public fpe(fpg fpgVar) {
        this.a = fpgVar;
    }

    public fpe(fpg fpgVar, int i) {
        this.b = i;
        this.a = fpgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a();
        } else {
            this.a.e();
        }
    }
}
