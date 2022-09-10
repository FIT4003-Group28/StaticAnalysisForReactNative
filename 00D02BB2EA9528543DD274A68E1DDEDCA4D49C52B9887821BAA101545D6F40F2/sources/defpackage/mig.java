package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mig  reason: default package */
/* loaded from: classes7.dex */
public final class mig implements Runnable {
    final /* synthetic */ mio a;

    public mig(mio mioVar) {
        this.a = mioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mio mioVar = this.a;
        if (mioVar.s.d != null) {
            ksr ksrVar = mioVar.e;
            dccx F = dcdc.F();
            F.g(this.a.s);
            F.i(this.a.r);
            ksrVar.d(F.f(), this.a.F, null);
        }
        mio mioVar2 = this.a;
        mioVar2.p.postDelayed(mioVar2.E, 30000L);
    }
}
