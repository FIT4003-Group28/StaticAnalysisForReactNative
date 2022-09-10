package defpackage;
/* renamed from: cvdz  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cvdz implements cvea {
    static final cvea a = new cvdz();

    private cvdz() {
    }

    @Override // defpackage.cvea
    public final boolean a(cugu cuguVar, cugu cuguVar2) {
        int i = cveb.c;
        if (cuguVar.b().equals(cuguVar2.b())) {
            return (cuguVar.o() == 1 || cuguVar.g().equals(cuguVar2.g())) && cuguVar.k().a() == cuguVar2.k().a() && !cveb.a(cuguVar, cuguVar2);
        }
        return false;
    }
}
