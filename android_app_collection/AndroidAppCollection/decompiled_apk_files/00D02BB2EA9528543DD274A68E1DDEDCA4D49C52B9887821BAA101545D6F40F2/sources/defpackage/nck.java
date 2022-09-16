package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nck  reason: default package */
/* loaded from: classes7.dex */
public final class nck implements begr {
    final /* synthetic */ ncm a;

    public nck(ncm ncmVar) {
        this.a = ncmVar;
    }

    private final void c(bttu bttuVar, @dzsi ilo iloVar) {
        ktg remove;
        amvh remove2 = this.a.a.remove(bttuVar);
        if (remove2 == null || (remove = this.a.b.remove(remove2)) == null) {
            return;
        }
        if (iloVar != null) {
            remove.a.p(iloVar);
        }
        ksu ksuVar = remove.b;
        if (ksuVar == null) {
            return;
        }
        ksuVar.a(remove.a);
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        c(bttuVar, iloVar);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        c(bttuVar, null);
    }
}
