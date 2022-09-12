package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: aqco  reason: default package */
/* loaded from: classes2.dex */
public final class aqco {
    @dzsi
    public static String a(@dzsi ilo iloVar) {
        if (iloVar == null || !iloVar.cI()) {
            return null;
        }
        dpoa cJ = iloVar.cJ();
        dbsk.s(cJ);
        if ((cJ.a & 4) == 0) {
            return null;
        }
        dpoa cJ2 = iloVar.cJ();
        dbsk.s(cJ2);
        dpnz dpnzVar = cJ2.d;
        if (dpnzVar == null) {
            dpnzVar = dpnz.d;
        }
        if ((dpnzVar.a & 1) == 0) {
            return null;
        }
        dpoa cJ3 = iloVar.cJ();
        dbsk.s(cJ3);
        dpnz dpnzVar2 = cJ3.d;
        if (dpnzVar2 == null) {
            dpnzVar2 = dpnz.d;
        }
        return dpnzVar2.b;
    }

    @dzsi
    public static String b(@dzsi byte[] bArr) {
        if (bArr != null) {
            try {
                dspd dspdVar = ((dsok) dsqw.cr(dsok.c, bArr, dsqa.c())).b;
                dsqa c = dsqa.c();
                dbog dbogVar = dbog.b;
                try {
                    dspj s = dspdVar.s();
                    dsqw dsqwVar = (dsqw) dbogVar.cu(4);
                    try {
                        try {
                            dstc b = dsst.a.b(dsqwVar);
                            b.f(dsqwVar, dspk.n(s), c);
                            b.j(dsqwVar);
                            try {
                                s.b(0);
                                dsqw.cv(dsqwVar);
                                return decu.f(((dbog) dsqwVar).a);
                            } catch (dsrm e) {
                                throw e;
                            }
                        } catch (IOException e2) {
                            if (!(e2.getCause() instanceof dsrm)) {
                                throw new dsrm(e2.getMessage());
                            }
                            throw ((dsrm) e2.getCause());
                        }
                    } catch (RuntimeException e3) {
                        if (e3.getCause() instanceof dsrm) {
                            throw ((dsrm) e3.getCause());
                        }
                        throw e3;
                    }
                } catch (dsrm e4) {
                    throw e4;
                }
            } catch (dsrm e5) {
                e5.getMessage();
            }
        }
        return null;
    }
}
