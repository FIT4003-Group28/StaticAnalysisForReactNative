package defpackage;
/* compiled from: PG */
/* renamed from: aysv  reason: default package */
/* loaded from: classes2.dex */
public final class aysv extends aynr {
    final aypv a;

    public aysv(aypv aypvVar) {
        this.a = aypvVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        aypg m = banl.m();
        aynsVar.sj(m);
        try {
            this.a.a();
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
