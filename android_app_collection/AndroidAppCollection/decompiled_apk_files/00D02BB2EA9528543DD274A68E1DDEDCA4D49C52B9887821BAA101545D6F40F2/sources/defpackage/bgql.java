package defpackage;
/* compiled from: PG */
/* renamed from: bgql  reason: default package */
/* loaded from: classes3.dex */
public final class bgql {
    @dzsi
    public ilo a;
    private final ckcw b;

    public bgql(ckcw ckcwVar) {
        this.b = ckcwVar;
    }

    public static boolean b(ilo iloVar) {
        return iloVar.be() != iln.UNRESOLVED;
    }

    public final void a(ilo iloVar) {
        if (!b(iloVar)) {
            this.a = iloVar;
            return;
        }
        c(iloVar);
        this.a = null;
    }

    public final void c(ilo iloVar) {
        ((ckco) this.b.a(iloVar.j() ? ckjw.d : ckjw.c)).a(iloVar.be().ordinal());
    }
}
