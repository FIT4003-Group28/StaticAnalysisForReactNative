package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baft  reason: default package */
/* loaded from: classes2.dex */
public final class baft implements Runnable {
    final /* synthetic */ bage a;
    final /* synthetic */ bagd b;
    private final /* synthetic */ int c;

    public baft(bagd bagdVar, bage bageVar) {
        this.b = bagdVar;
        this.a = bageVar;
    }

    public baft(bagd bagdVar, bage bageVar, int i) {
        this.c = i;
        this.b = bagdVar;
        this.a = bageVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            try {
                this.a.a();
            } catch (Throwable th) {
                this.b.e(new baem("System error", th));
            }
        } else if (i == 1) {
            try {
                this.a.a();
            } catch (Throwable th2) {
                this.b.f(th2);
            }
        } else {
            try {
                this.a.a();
            } catch (Throwable th3) {
                this.b.e(new baeb("Exception received from UrlRequest.Callback", th3));
            }
        }
    }
}
