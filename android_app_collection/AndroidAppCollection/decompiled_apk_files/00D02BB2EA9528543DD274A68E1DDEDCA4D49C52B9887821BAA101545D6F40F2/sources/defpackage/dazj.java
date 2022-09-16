package defpackage;
/* renamed from: dazj  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class dazj implements Runnable {
    static final Runnable a = new dazj();

    private dazj() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
    }
}
