package defpackage;
/* compiled from: PG */
/* renamed from: batz  reason: default package */
/* loaded from: classes3.dex */
public final class batz {
    public final aymk a;

    public batz(aymk aymkVar) {
        this.a = aymkVar;
    }

    @dzsi
    public static ilo a(@dzsi String str, @dzsi akqi akqiVar, @dzsi akqq akqqVar) {
        if (akqi.d(akqiVar) || akqqVar != null) {
            ily ilyVar = new ily();
            if (!dbsj.d(str)) {
                ilyVar.u = str;
            }
            if (akqi.d(akqiVar)) {
                ilyVar.j(akqiVar);
            }
            if (akqqVar != null) {
                ilyVar.q(akqqVar);
            }
            ilyVar.f = true;
            return ilyVar.d();
        }
        return null;
    }

    public static ilo b(baal baalVar) {
        baak z = baalVar.z();
        dbsk.s(z);
        ilo a = a(z.c() ? z.d() : null, z.a(), z.b());
        dbsk.s(a);
        return a;
    }

    public final void c(String str, drcs drcsVar, int i, ilo iloVar, begg beggVar) {
        begj begjVar = new begj();
        begjVar.n = true;
        begjVar.c(false);
        begjVar.c = jjn.EXPANDED;
        begjVar.f = this.a.a(str, drcsVar, i);
        begjVar.b(iloVar);
        beggVar.o(begjVar, false, null);
    }
}
