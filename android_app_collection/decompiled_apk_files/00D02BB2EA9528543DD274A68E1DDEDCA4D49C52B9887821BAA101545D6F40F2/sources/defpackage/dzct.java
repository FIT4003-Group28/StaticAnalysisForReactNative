package defpackage;
/* compiled from: PG */
/* renamed from: dzct  reason: default package */
/* loaded from: classes6.dex */
final class dzct implements Runnable {
    private final eavm a;
    private final long b;

    public dzct(eavm eavmVar, long j) {
        this.a = eavmVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
