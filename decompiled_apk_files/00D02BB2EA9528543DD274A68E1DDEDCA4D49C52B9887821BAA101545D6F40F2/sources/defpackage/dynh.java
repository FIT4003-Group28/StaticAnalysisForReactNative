package defpackage;
/* compiled from: PG */
/* renamed from: dynh  reason: default package */
/* loaded from: classes6.dex */
final class dynh implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dynv b;

    public dynh(dynv dynvVar, int i) {
        this.b = dynvVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.j(this.a);
    }
}
