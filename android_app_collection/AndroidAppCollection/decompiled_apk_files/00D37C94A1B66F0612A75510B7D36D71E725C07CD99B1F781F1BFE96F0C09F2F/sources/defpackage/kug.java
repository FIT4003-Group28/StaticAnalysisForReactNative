package defpackage;
/* compiled from: PG */
/* renamed from: kug  reason: default package */
/* loaded from: classes3.dex */
public final class kug implements abcf {
    private final azqb a;
    private final azqb b;
    private final aadd c;

    public kug(azqb azqbVar, azqb azqbVar2, aadd aaddVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = aaddVar;
    }

    @Override // defpackage.abcf
    public final void b(abce abceVar) {
        asxp asxpVar = this.c.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if (asxpVar.N) {
            fyx fyxVar = (fyx) this.b.get();
            if (fyxVar == null) {
                return;
            }
            abceVar.t = fyxVar.f();
            return;
        }
        kuh kuhVar = (kuh) this.a.get();
        if (kuhVar == null) {
            return;
        }
        int a = kuhVar.a();
        yrj yrjVar = (yrj) kuhVar.a.get();
        boolean z = false;
        if (a != 2 ? !(a != 1 || !yrjVar.r()) : yrjVar.o()) {
            z = true;
        }
        abceVar.t = z;
    }
}
