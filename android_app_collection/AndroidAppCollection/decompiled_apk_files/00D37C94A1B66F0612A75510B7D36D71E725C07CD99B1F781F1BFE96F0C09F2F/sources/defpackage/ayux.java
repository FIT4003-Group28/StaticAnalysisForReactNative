package defpackage;
/* compiled from: PG */
/* renamed from: ayux  reason: default package */
/* loaded from: classes2.dex */
public final class ayux extends aynx {
    final aynz b;
    final aynq c;

    public ayux(aynz aynzVar, aynq aynqVar) {
        this.b = aynzVar;
        this.c = aynqVar;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        ayup ayuuVar;
        aynq aynqVar = aynq.MISSING;
        int ordinal = this.c.ordinal();
        if (ordinal == 0) {
            ayuuVar = new ayuu(bameVar);
        } else if (ordinal == 1) {
            ayuuVar = new ayus(bameVar);
        } else if (ordinal == 3) {
            ayuuVar = new ayur(bameVar);
        } else if (ordinal == 4) {
            ayuuVar = new ayut(bameVar);
        } else {
            ayuuVar = new ayuq(bameVar, aynx.a);
        }
        bameVar.f(ayuuVar);
        try {
            this.b.a(ayuuVar);
        } catch (Throwable th) {
            bapv.j(th);
            ayuuVar.h(th);
        }
    }
}
