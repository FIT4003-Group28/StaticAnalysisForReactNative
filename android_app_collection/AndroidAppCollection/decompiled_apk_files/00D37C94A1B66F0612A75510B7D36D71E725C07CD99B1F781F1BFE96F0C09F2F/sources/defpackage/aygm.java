package defpackage;
/* compiled from: PG */
/* renamed from: aygm  reason: default package */
/* loaded from: classes2.dex */
final class aygm implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ aygn b;

    public aygm(aygn aygnVar, boolean z) {
        this.b = aygnVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            aygq aygqVar = this.b.a;
            aygqVar.p = true;
            if (aygqVar.m > 0) {
                amqi amqiVar = aygqVar.o;
                amqiVar.e();
                amqiVar.f();
            }
        }
        this.b.a.r = false;
    }
}
