package defpackage;
/* compiled from: PG */
/* renamed from: dynd  reason: default package */
/* loaded from: classes6.dex */
final class dynd implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dynv b;

    public dynd(dynv dynvVar, int i) {
        this.b = dynvVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.b(this.a);
    }
}
