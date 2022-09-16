package defpackage;
/* compiled from: PG */
/* renamed from: ayds  reason: default package */
/* loaded from: classes2.dex */
final class ayds implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ aydt b;

    public ayds(aydt aydtVar, int i) {
        this.b = aydtVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = aynn.a;
        try {
            ayfc ayfcVar = this.b.a;
            int i2 = this.a;
            aqxo.q(true, "numMessages must be > 0");
            if (((ayjx) ayfcVar).b()) {
                return;
            }
            ((ayjx) ayfcVar).e += i2;
            ((ayjx) ayfcVar).a();
        } catch (Throwable th) {
            this.b.k(th);
        }
    }
}
