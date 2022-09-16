package defpackage;
/* compiled from: PG */
/* renamed from: accl  reason: default package */
/* loaded from: classes.dex */
final class accl implements Runnable {
    final /* synthetic */ accp a;
    private final /* synthetic */ int b;

    public accl(accp accpVar) {
        this.a = accpVar;
    }

    public accl(accp accpVar, int i) {
        this.b = i;
        this.a = accpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            accp accpVar = this.a;
            accpVar.onFrameAvailable(accpVar.a);
            return;
        }
        accp accpVar2 = this.a;
        accf accfVar = accpVar2.e;
        if (accfVar == null) {
            return;
        }
        accfVar.f(accpVar2);
    }
}
