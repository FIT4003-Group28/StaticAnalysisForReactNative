package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dymk  reason: default package */
/* loaded from: classes6.dex */
public final class dymk implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dymv b;

    public dymk(dymv dymvVar, dyjb dyjbVar) {
        this.b = dymvVar;
        this.a = dyjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyex<ReqT, RespT> dyexVar = this.b.b;
        dyjb dyjbVar = this.a;
        dyexVar.d(dyjbVar.q, dyjbVar.r);
    }
}
