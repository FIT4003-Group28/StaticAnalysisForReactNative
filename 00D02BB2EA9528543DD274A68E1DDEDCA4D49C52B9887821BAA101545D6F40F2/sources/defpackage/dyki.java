package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyki  reason: default package */
/* loaded from: classes6.dex */
public final class dyki implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dylt b;
    final /* synthetic */ dyhw c;
    final /* synthetic */ dykj d;

    public dyki(dykj dykjVar, dyjb dyjbVar, dylt dyltVar, dyhw dyhwVar) {
        this.d = dykjVar;
        this.a = dyjbVar;
        this.b = dyltVar;
        this.c = dyhwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.j(this.a, this.b, this.c);
    }
}
