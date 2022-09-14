package defpackage;
/* compiled from: PG */
/* renamed from: dynk  reason: default package */
/* loaded from: classes6.dex */
final class dynk implements Runnable {
    final /* synthetic */ dylu a;
    final /* synthetic */ dynv b;

    public dynk(dynv dynvVar, dylu dyluVar) {
        this.b = dynvVar;
        this.a = dyluVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.a(this.a);
    }
}
