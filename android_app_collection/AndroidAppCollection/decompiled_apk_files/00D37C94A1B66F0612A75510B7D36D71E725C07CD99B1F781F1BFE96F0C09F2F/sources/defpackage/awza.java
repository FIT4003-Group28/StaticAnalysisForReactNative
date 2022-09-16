package defpackage;
/* compiled from: PG */
/* renamed from: awza  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class awza implements Runnable {
    public final /* synthetic */ awzc a;
    private final /* synthetic */ int b;

    public /* synthetic */ awza(awzc awzcVar, int i) {
        this.b = i;
        this.a = awzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.c.start();
        } else {
            this.a.c.cancel();
        }
    }
}
