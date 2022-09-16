package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axnw  reason: default package */
/* loaded from: classes3.dex */
public final class axnw {
    @dzsi
    public dspd a;
    public final List<axnv> b = new ArrayList();
    @dzsi
    public deig<List<diyq>> c;
    @dzsi
    public final String d;
    private final axis e;
    private final Executor f;

    public axnw(axis axisVar, Executor executor, @dzsi String str, @dzsi diyr diyrVar) {
        this.e = axisVar;
        this.f = executor;
        this.d = str;
        if (diyrVar != null) {
            for (diyq diyqVar : diyrVar.b) {
                this.b.add(new axnv(diyqVar));
            }
            this.a = (diyrVar.a & 1) != 0 ? diyrVar.c : null;
        }
    }

    public static String c(diyq diyqVar) {
        dqau dqauVar = diyqVar.b;
        if (dqauVar == null) {
            dqauVar = dqau.e;
        }
        dqkn dqknVar = dqauVar.b;
        if (dqknVar == null) {
            dqknVar = dqkn.e;
        }
        return dqknVar.d;
    }

    private static List<diyq> e(List<axnv> list) {
        ArrayList arrayList = new ArrayList();
        for (axnv axnvVar : list) {
            if (!axnvVar.b) {
                arrayList.add(axnvVar.a);
            }
        }
        return arrayList;
    }

    public final List<diyq> a() {
        return e(this.b);
    }

    public final dehn<List<diyq>> b(@dzsi String str) {
        int i;
        if (str != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.b.size()) {
                    i2 = -1;
                    break;
                } else if (c(this.b.get(i2).a).equals(str)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return deha.b(new IllegalArgumentException("Continuation token not found"));
            }
            i = i2 + 1;
        } else {
            i = 0;
        }
        List<axnv> list = this.b;
        List<diyq> e = e(list.subList(i, list.size()));
        if (!e.isEmpty()) {
            return deha.a(e);
        }
        if (this.a != null || this.b.isEmpty()) {
            deig<List<diyq>> deigVar = this.c;
            if (deigVar == null) {
                deigVar = deig.d();
                this.c = deigVar;
                axis axisVar = this.e;
                dspd dspdVar = this.a;
                dicr dicrVar = (dicr) dics.d.bZ();
                if (dspdVar != null) {
                    if (dicrVar.c) {
                        dicrVar.bF();
                        dicrVar.c = false;
                    }
                    dics dicsVar = (dics) dicrVar.b;
                    dspdVar.getClass();
                    dicsVar.a |= 4;
                    dicsVar.b = dspdVar;
                }
                dnwb a = axisVar.b.a();
                if (dicrVar.c) {
                    dicrVar.bF();
                    dicrVar.c = false;
                }
                dics dicsVar2 = (dics) dicrVar.b;
                a.getClass();
                dicsVar2.c = a;
                dicsVar2.a |= 8;
                deig d = deig.d();
                buac buacVar = ((buou) axisVar.h).c;
                btlu j = axisVar.a.a().j();
                dbsk.s(j);
                buacVar.e = j;
                axisVar.b(((buou) axisVar.h).b(), (dics) dicrVar.bK(), d, axim.a);
                deha.q(d, new axnu(this), this.f);
            }
            return deigVar;
        }
        return deha.a(dcdc.e());
    }
}
