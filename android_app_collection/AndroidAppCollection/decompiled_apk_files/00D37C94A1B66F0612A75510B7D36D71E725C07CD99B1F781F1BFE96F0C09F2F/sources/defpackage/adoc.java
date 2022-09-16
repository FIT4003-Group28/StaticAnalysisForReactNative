package defpackage;
/* compiled from: PG */
/* renamed from: adoc  reason: default package */
/* loaded from: classes.dex */
final class adoc implements Runnable {
    final /* synthetic */ adod a;
    private final adnt b;

    public adoc(adod adodVar, adnt adntVar) {
        this.a = adodVar;
        this.b = adntVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long a = this.a.a.a();
        if (a == -1 || a > 300000) {
            return;
        }
        this.b.I();
    }
}
