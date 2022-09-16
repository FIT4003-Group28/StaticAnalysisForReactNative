package defpackage;
/* compiled from: PG */
/* renamed from: ayii  reason: default package */
/* loaded from: classes2.dex */
public final class ayii implements Runnable {
    final /* synthetic */ ayji a;
    private final /* synthetic */ int b;

    public ayii(ayji ayjiVar) {
        this.a = ayjiVar;
    }

    public ayii(ayji ayjiVar, int i) {
        this.b = i;
        this.a = ayjiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.G.a(2, "Entering SHUTDOWN state");
            this.a.q.a(axyt.SHUTDOWN);
        } else if (i == 1) {
            this.a.e(true);
        } else if (i == 2) {
            ayji ayjiVar = this.a;
            if (ayjiVar.B) {
                return;
            }
            ayjiVar.B = true;
            ayjiVar.g();
        } else if (i == 3) {
            ayji ayjiVar2 = this.a;
            ayjiVar2.R = null;
            ayjiVar2.j();
        } else {
            ayji ayjiVar3 = this.a;
            ayjiVar3.l(true);
            ayjiVar3.y.a(null);
            ayjiVar3.G.a(2, "Entering IDLE state");
            ayjiVar3.q.a(axyt.IDLE);
            if (!ayjiVar3.Q.d()) {
                return;
            }
            ayjiVar3.f();
        }
    }
}
