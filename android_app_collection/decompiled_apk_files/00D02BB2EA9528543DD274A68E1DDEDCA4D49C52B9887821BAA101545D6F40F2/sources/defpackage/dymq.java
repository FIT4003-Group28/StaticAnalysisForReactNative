package defpackage;
/* compiled from: PG */
/* renamed from: dymq  reason: default package */
/* loaded from: classes6.dex */
final class dymq implements Runnable {
    final /* synthetic */ dyhw a;
    final /* synthetic */ dymu b;

    public dymq(dymu dymuVar, dyhw dyhwVar) {
        this.b = dymuVar;
        this.a = dyhwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}
