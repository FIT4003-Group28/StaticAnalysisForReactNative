package defpackage;
/* compiled from: PG */
/* renamed from: bhco  reason: default package */
/* loaded from: classes3.dex */
public final class bhco {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(bhds bhdsVar, dged dgedVar, @dzsi ilo iloVar, int i) {
        bhdl bhdlVar = (bhdl) bhdsVar;
        bhdlVar.g = b(dtxv.bu, dgedVar, iloVar, i);
        bhdlVar.h = b(dtxv.bv, dgedVar, iloVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjtd b(ddho ddhoVar, dged dgedVar, @dzsi ilo iloVar, int i) {
        cjta c = cjtd.c(iloVar == null ? null : iloVar.bZ());
        c.d = ddhoVar;
        c.i(i);
        dgec dgecVar = dgedVar.b;
        if (dgecVar == null) {
            dgecVar = dgec.i;
        }
        if ((dgecVar.a & 256) != 0) {
            dgec dgecVar2 = dgedVar.b;
            if (dgecVar2 == null) {
                dgecVar2 = dgec.i;
            }
            c.g(dgecVar2.h);
        }
        return c.a();
    }
}
