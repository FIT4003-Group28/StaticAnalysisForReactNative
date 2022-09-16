package defpackage;
/* compiled from: PG */
/* renamed from: dyre  reason: default package */
/* loaded from: classes6.dex */
final class dyre implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dyrg b;

    public dyre(dyrg dyrgVar, dyjb dyjbVar) {
        this.b = dyrgVar;
        this.a = dyjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c(this.a);
    }
}
