package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: ckng  reason: default package */
/* loaded from: classes4.dex */
public final class ckng implements Serializable {
    private dbsg<dbsi<Integer, Integer>> a = dbpy.a;

    public final dwfl a(final dwfl dwflVar) {
        int a = dwfk.a(dwflVar.i);
        return (a == 0 || a == 1) ? dwflVar : (dwfl) this.a.h(new dbrn(dwflVar) { // from class: cknf
            private final dwfl a;

            {
                this.a = dwflVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dwfl dwflVar2 = this.a;
                dbsi dbsiVar = (dbsi) obj;
                dsqp dsqpVar = (dsqp) dwflVar2.cu(5);
                dsqpVar.bC(dwflVar2);
                dwfi dwfiVar = (dwfi) dsqpVar;
                String a2 = jfv.b(dwflVar2).a(dwflVar2.h, ((Integer) dbsiVar.a).intValue(), ((Integer) dbsiVar.b).intValue(), null);
                if (dwfiVar.c) {
                    dwfiVar.bF();
                    dwfiVar.c = false;
                }
                dwfl dwflVar3 = (dwfl) dwfiVar.b;
                a2.getClass();
                dwflVar3.a |= 128;
                dwflVar3.h = a2;
                return dwfiVar.bK();
            }
        }).c(dwflVar);
    }

    public final void b(int i, int i2) {
        this.a = dbsg.i(dbsi.a(Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
