package defpackage;
/* compiled from: PG */
/* renamed from: dymh  reason: default package */
/* loaded from: classes6.dex */
final class dymh implements Runnable {
    final /* synthetic */ dyew a;
    final /* synthetic */ dyhw b;
    final /* synthetic */ dymv c;

    public dymh(dymv dymvVar, dyew dyewVar, dyhw dyhwVar) {
        this.c = dymvVar;
        this.a = dyewVar;
        this.b = dyhwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.a(this.a, this.b);
    }
}
