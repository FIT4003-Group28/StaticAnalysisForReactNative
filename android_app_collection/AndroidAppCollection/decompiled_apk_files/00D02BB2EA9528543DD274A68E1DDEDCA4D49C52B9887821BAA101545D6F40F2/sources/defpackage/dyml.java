package defpackage;
/* compiled from: PG */
/* renamed from: dyml  reason: default package */
/* loaded from: classes6.dex */
final class dyml implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ dymv b;

    public dyml(dymv dymvVar, Object obj) {
        this.b = dymvVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.f(this.a);
    }
}
