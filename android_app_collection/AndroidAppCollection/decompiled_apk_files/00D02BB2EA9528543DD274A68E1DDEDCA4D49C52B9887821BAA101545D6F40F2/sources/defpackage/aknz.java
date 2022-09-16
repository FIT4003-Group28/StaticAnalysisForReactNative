package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: aknz  reason: default package */
/* loaded from: classes2.dex */
public final class aknz {
    private static final dsqa a;

    static {
        dsqa a2 = dsqa.a();
        dmnl.a(a2);
        a = a2;
    }

    public static dmni a(dspd dspdVar) {
        try {
            dsqa dsqaVar = a;
            dmni dmniVar = dmni.f;
            try {
                dspj s = dspdVar.s();
                dsqw dsqwVar = (dsqw) dmniVar.cu(4);
                try {
                    try {
                        dstc b = dsst.a.b(dsqwVar);
                        b.f(dsqwVar, dspk.n(s), dsqaVar);
                        b.j(dsqwVar);
                        try {
                            s.b(0);
                            dsqw.cv(dsqwVar);
                            return (dmni) dsqwVar;
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
        } catch (dsrm unused) {
            dmnh dmnhVar = (dmnh) dmni.f.bZ();
            dmti dmtiVar = dmti.WORLD_ENCODING_LAT_LNG_E7;
            if (dmnhVar.c) {
                dmnhVar.bF();
                dmnhVar.c = false;
            }
            dmni dmniVar2 = (dmni) dmnhVar.b;
            dmniVar2.b = dmtiVar.f;
            dmniVar2.a |= 1;
            return (dmni) dmnhVar.bK();
        }
    }
}
