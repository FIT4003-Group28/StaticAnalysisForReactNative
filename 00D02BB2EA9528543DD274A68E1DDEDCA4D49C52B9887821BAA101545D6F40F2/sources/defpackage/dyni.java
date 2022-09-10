package defpackage;
/* compiled from: PG */
/* renamed from: dyni  reason: default package */
/* loaded from: classes6.dex */
final class dyni implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dynv b;

    public dyni(dynv dynvVar, int i) {
        this.b = dynvVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.k(this.a);
    }
}
