package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: atzf  reason: default package */
/* loaded from: classes2.dex */
public final class atzf implements amrl {
    private final amsa a;
    private final amri b;
    private final amrm c;
    private final int d;
    private final Map<aktc, Boolean> e = new HashMap();
    private final Map<aktc, atzd> f;
    private int g;

    public atzf(boolean z, int i, Map<aktc, atzd> map, atze atzeVar, amrz amrzVar, amrm amrmVar, amrq amrqVar, amrt amrtVar, amsa amsaVar) {
        int size = map.size();
        amsd amsdVar = new amsd();
        if (z) {
            amsdVar.d(10, amrzVar);
            amsdVar.d(100, amrmVar);
            amsdVar.c(amrqVar);
            if (size > 1) {
                amsdVar.e(100, new amrp());
            }
        } else {
            amsdVar.c(amrzVar);
            amsdVar.d(80, atzeVar);
            amsdVar.d(80, amrtVar);
            amsdVar.b(10, amrmVar, 0.5f);
            amsdVar.b(50, amrqVar, 0.2f);
            amsdVar.e(1, new amrp());
        }
        this.b = amsdVar.a();
        this.d = i;
        this.f = map;
        this.c = amrmVar;
        this.a = amsaVar;
    }

    @Override // defpackage.amrl
    public final boolean a(aktc aktcVar, amrk amrkVar, amrj amrjVar) {
        Boolean remove = this.e.remove(aktcVar);
        if (Boolean.TRUE.equals(remove)) {
            this.g--;
        } else if (remove == null && this.g >= this.d) {
            return false;
        }
        atzd atzdVar = this.f.get(aktcVar);
        if (atzdVar == null) {
            return false;
        }
        akra akraVar = atzdVar.a;
        dcdc<dmlo> dcdcVar = amrkVar.g;
        int size = dcdcVar.size();
        dmlo dmloVar = null;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            dmlo dmloVar2 = dcdcVar.get(i);
            float a = this.b.a(aktcVar, amrkVar, akraVar, dmloVar2);
            if (a > f) {
                dmloVar = dmloVar2;
            }
            if (a > f) {
                f = a;
            }
        }
        if (f > 0.0f && dmloVar != null) {
            amkz amkzVar = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
            amsa amsaVar = this.a;
            akzh akzhVar = amrkVar.e;
            alne alneVar = amrkVar.h;
            if (amsaVar.c(akzhVar, aktcVar, akraVar, dmloVar, amkzVar)) {
                amrkVar.f.a(amrkVar.a, amkzVar);
                amrjVar.a(akraVar);
                amrjVar.b = dmloVar;
                if (this.c.a(aktcVar, amrkVar, akraVar, dmloVar) < 0.5f) {
                    if (atzdVar.c != null) {
                        atzdVar.b.g().c(atzdVar.c);
                    }
                    this.e.put(aktcVar, true);
                    this.g++;
                } else {
                    this.e.put(aktcVar, false);
                }
                return true;
            }
        }
        return false;
    }
}
