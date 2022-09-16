package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brv  reason: default package */
/* loaded from: classes2.dex */
public final class brv implements Runnable {
    final /* synthetic */ bum a;
    final /* synthetic */ brw b;

    public brv(brw brwVar, bum bumVar) {
        this.b = brwVar;
        this.a = bumVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bqf a = bqf.a();
        int i = brw.d;
        String.format("Scheduling work %s", this.a.c);
        a.d(new Throwable[0]);
        this.b.a.c(this.a);
    }
}
