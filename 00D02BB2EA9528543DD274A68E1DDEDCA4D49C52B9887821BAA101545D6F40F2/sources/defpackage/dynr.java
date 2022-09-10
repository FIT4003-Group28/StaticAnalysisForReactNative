package defpackage;
/* compiled from: PG */
/* renamed from: dynr  reason: default package */
/* loaded from: classes6.dex */
final class dynr implements Runnable {
    final /* synthetic */ dyhw a;
    final /* synthetic */ dynu b;

    public dynr(dynu dynuVar, dyhw dyhwVar) {
        this.b = dynuVar;
        this.a = dyhwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.b(this.a);
    }
}
