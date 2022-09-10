package defpackage;
/* compiled from: PG */
/* renamed from: dynj  reason: default package */
/* loaded from: classes6.dex */
final class dynj implements Runnable {
    final /* synthetic */ dyfr a;
    final /* synthetic */ dynv b;

    public dynj(dynv dynvVar, dyfr dyfrVar) {
        this.b = dynvVar;
        this.a = dyfrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.i(this.a);
    }
}
