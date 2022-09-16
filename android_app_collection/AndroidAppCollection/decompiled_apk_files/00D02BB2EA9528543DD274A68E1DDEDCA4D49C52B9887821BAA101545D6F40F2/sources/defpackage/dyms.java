package defpackage;
/* compiled from: PG */
/* renamed from: dyms  reason: default package */
/* loaded from: classes6.dex */
final class dyms implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dyhw b;
    final /* synthetic */ dymu c;

    public dyms(dymu dymuVar, dyjb dyjbVar, dyhw dyhwVar) {
        this.c = dymuVar;
        this.a = dyjbVar;
        this.b = dyhwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.b(this.a, this.b);
    }
}
