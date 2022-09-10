package defpackage;
/* compiled from: PG */
/* renamed from: dynz  reason: default package */
/* loaded from: classes6.dex */
final class dynz implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ dyoa b;

    public dynz(dyoa dyoaVar, boolean z) {
        this.b = dyoaVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            dyod dyodVar = this.b.a;
            dyodVar.p = true;
            if (dyodVar.m > 0) {
                dbtp dbtpVar = dyodVar.o;
                dbtpVar.e();
                dbtpVar.f();
            }
        }
        this.b.a.r = false;
    }
}
