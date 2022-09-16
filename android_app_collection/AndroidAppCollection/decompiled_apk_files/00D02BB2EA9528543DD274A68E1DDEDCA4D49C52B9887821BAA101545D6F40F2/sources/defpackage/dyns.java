package defpackage;
/* compiled from: PG */
/* renamed from: dyns  reason: default package */
/* loaded from: classes6.dex */
final class dyns implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dyhw b;
    final /* synthetic */ dynu c;

    public dyns(dynu dynuVar, dyjb dyjbVar, dyhw dyhwVar) {
        this.c = dynuVar;
        this.a = dyjbVar;
        this.b = dyhwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.d(this.a, this.b);
    }
}
