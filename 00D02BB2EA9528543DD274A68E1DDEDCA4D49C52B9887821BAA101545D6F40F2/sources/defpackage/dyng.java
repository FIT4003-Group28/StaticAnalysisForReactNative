package defpackage;
/* compiled from: PG */
/* renamed from: dyng  reason: default package */
/* loaded from: classes6.dex */
final class dyng implements Runnable {
    final /* synthetic */ dyfu a;
    final /* synthetic */ dynv b;

    public dyng(dynv dynvVar, dyfu dyfuVar) {
        this.b = dynvVar;
        this.a = dyfuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.m(this.a);
    }
}
