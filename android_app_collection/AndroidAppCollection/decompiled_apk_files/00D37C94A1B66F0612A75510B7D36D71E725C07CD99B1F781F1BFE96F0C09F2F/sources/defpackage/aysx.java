package defpackage;
/* compiled from: PG */
/* renamed from: aysx  reason: default package */
/* loaded from: classes2.dex */
public final class aysx extends aynr {
    final Runnable a;

    public aysx(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        aypg m = banl.m();
        aynsVar.sj(m);
        try {
            this.a.run();
            if (m.e()) {
                return;
            }
            aynsVar.sm();
        } catch (Throwable th) {
            bapv.j(th);
            if (!m.e()) {
                aynsVar.b(th);
            } else {
                azqc.d(th);
            }
        }
    }
}
