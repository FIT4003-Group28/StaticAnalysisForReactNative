package defpackage;
/* compiled from: PG */
/* renamed from: bzgn  reason: default package */
/* loaded from: classes4.dex */
public final class bzgn {
    static boolean a(dpgw dpgwVar, dpgw dpgwVar2, boolean z, boolean z2) {
        if (!dbsd.a(dpgwVar.c, dpgwVar2.c) || !dbsd.a(dpgwVar.b, dpgwVar2.b)) {
            return false;
        }
        if (z2) {
            if ((dpgwVar.a & 16) == 0 && (dpgwVar2.a & 16) == 0) {
                dgaw dgawVar = dpgwVar.h;
                if (dgawVar == null) {
                    dgawVar = dgaw.g;
                }
                dgaw dgawVar2 = dpgwVar2.h;
                if (dgawVar2 == null) {
                    dgawVar2 = dgaw.g;
                }
                return d(dgawVar, dgawVar2, z);
            }
            dgaw dgawVar3 = dpgwVar.f;
            if (dgawVar3 == null) {
                dgawVar3 = dgaw.g;
            }
            dgaw dgawVar4 = dpgwVar2.f;
            if (dgawVar4 == null) {
                dgawVar4 = dgaw.g;
            }
            return d(dgawVar3, dgawVar4, z);
        } else if ((dpgwVar.a & 8) == 0 && (dpgwVar2.a & 8) == 0) {
            dgaw dgawVar5 = dpgwVar.g;
            if (dgawVar5 == null) {
                dgawVar5 = dgaw.g;
            }
            dgaw dgawVar6 = dpgwVar2.g;
            if (dgawVar6 == null) {
                dgawVar6 = dgaw.g;
            }
            return d(dgawVar5, dgawVar6, z);
        } else {
            dgaw dgawVar7 = dpgwVar.e;
            if (dgawVar7 == null) {
                dgawVar7 = dgaw.g;
            }
            dgaw dgawVar8 = dpgwVar2.e;
            if (dgawVar8 == null) {
                dgawVar8 = dgaw.g;
            }
            return d(dgawVar7, dgawVar8, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(defpackage.amte r16, defpackage.amub r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzgn.b(amte, amub, int, boolean):int");
    }

    private static boolean c(dpbp dpbpVar, int i) {
        dpec dpecVar = dpbpVar.c.get(i).c;
        if (dpecVar == null) {
            dpecVar = dpec.o;
        }
        dqvj c = dqvj.c(dpecVar.b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        return dbsd.a(dqvj.WALK, c);
    }

    private static boolean d(dgaw dgawVar, dgaw dgawVar2, boolean z) {
        return Math.abs(dgawVar.f - dgawVar2.f) <= ((long) (true != z ? 1800 : 0));
    }

    private static final void e(dpie dpieVar) {
        for (dpbp dpbpVar : dpieVar.e) {
            for (dpdy dpdyVar : dpbpVar.c) {
                dpec dpecVar = dpdyVar.c;
                if (dpecVar == null) {
                    dpecVar = dpec.o;
                }
                dqvj c = dqvj.c(dpecVar.b);
                if (c == null) {
                    c = dqvj.DRIVE;
                }
                if (dqvj.TRANSIT.equals(c)) {
                    dphe dpheVar = dpdyVar.e;
                    if (dpheVar == null) {
                        dpheVar = dphe.x;
                    }
                    dpgw dpgwVar = dpheVar.c;
                    if (dpgwVar == null) {
                        dpgwVar = dpgw.r;
                    }
                    bzgm.a(dpgwVar);
                    dpgw dpgwVar2 = dpheVar.d;
                    if (dpgwVar2 == null) {
                        dpgwVar2 = dpgw.r;
                    }
                    bzgm.a(dpgwVar2);
                }
            }
        }
    }
}
