package defpackage;
/* compiled from: PG */
/* renamed from: bsr  reason: default package */
/* loaded from: classes4.dex */
final class bsr implements Runnable {
    final /* synthetic */ chr a;

    public bsr(chr chrVar) {
        this.a = chrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.cancel(true);
    }
}
