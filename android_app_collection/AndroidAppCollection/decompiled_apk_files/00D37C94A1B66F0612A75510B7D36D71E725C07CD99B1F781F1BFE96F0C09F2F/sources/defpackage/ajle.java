package defpackage;
/* compiled from: PG */
/* renamed from: ajle  reason: default package */
/* loaded from: classes.dex */
public final class ajle implements tej {
    private static void b(ajjk ajjkVar, acum acumVar) {
        ajjkVar.j(new ajld(ajjkVar, acumVar));
    }

    private static void d(ajjk ajjkVar, acum acumVar) {
        ajjkVar.p(new ajlc(ajjkVar, acumVar));
    }

    private static boolean f(long j, int i) {
        return (j & ((long) (i + (-1)))) > 0;
    }

    @Override // defpackage.tej
    public final aooq a() {
        return asvz.b;
    }

    @Override // defpackage.tel
    public final /* bridge */ /* synthetic */ void c(cyv cyvVar, tda tdaVar, String str, Object obj, tdq tdqVar, tcr tcrVar) {
        asvv asvvVar;
        acte acteVar;
        long j;
        asvz asvzVar = (asvz) obj;
        if (!(tdqVar instanceof ajjk)) {
            zep.l("Missing YouTube element builder!");
            return;
        }
        ajjk ajjkVar = (ajjk) tdqVar;
        boolean qn = asvzVar.qn(asvy.a);
        if (qn) {
            asvvVar = (asvv) asvzVar.qm(asvy.a);
        } else {
            asvvVar = asvv.b;
        }
        if (qn) {
            acteVar = new acte(asvvVar);
        } else {
            acteVar = new acte(asvzVar.c);
        }
        if (qn) {
            if ((asvvVar.c & 2) != 0) {
                awbr awbrVar = asvvVar.e;
                if (awbrVar == null) {
                    awbrVar = awbr.a;
                }
                j = awbrVar.c;
            } else {
                j = 0;
            }
            if (j <= 0) {
                d(ajjkVar, acteVar);
                b(ajjkVar, acteVar);
                return;
            }
            if (f(j, 2)) {
                ajjkVar.i(new ajlc(ajjkVar, acteVar, 1));
            }
            if (f(j, 5)) {
                d(ajjkVar, acteVar);
            }
            if (!f(j, 9)) {
                return;
            }
            b(ajjkVar, acteVar);
            return;
        }
        d(ajjkVar, acteVar);
    }

    @Override // defpackage.tel
    public final /* synthetic */ void e(tdq tdqVar) {
        throw null;
    }
}
