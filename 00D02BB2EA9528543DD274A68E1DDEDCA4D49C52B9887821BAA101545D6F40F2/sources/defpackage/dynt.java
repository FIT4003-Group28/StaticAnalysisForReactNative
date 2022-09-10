package defpackage;
/* compiled from: PG */
/* renamed from: dynt  reason: default package */
/* loaded from: classes6.dex */
final class dynt implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dylt b;
    final /* synthetic */ dyhw c;
    final /* synthetic */ dynu d;

    public dynt(dynu dynuVar, dyjb dyjbVar, dylt dyltVar, dyhw dyhwVar) {
        this.d = dynuVar;
        this.a = dyjbVar;
        this.b = dyltVar;
        this.c = dyhwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.e(this.a, this.b, this.c);
    }
}
