package defpackage;

import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: atze  reason: default package */
/* loaded from: classes2.dex */
public final class atze implements amri {
    private final dcdc<akra> a;
    private final Map<aktc, atzd> b;
    private final amsa c;
    private final amkz d;
    private final akse e;
    private final float[] f;

    public atze(Map<aktc, atzd> map) {
        amsa amsaVar = new amsa();
        this.d = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.e = new akse();
        this.f = new float[8];
        this.c = amsaVar;
        this.b = map;
        Collection<atzd> values = map.values();
        dccx F = dcdc.F();
        for (atzd atzdVar : values) {
            F.g(atzdVar.a);
        }
        this.a = F.f();
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        amsa amsaVar = this.c;
        akzh akzhVar = amrkVar.e;
        alne alneVar = amrkVar.h;
        if (!amsaVar.c(akzhVar, aktcVar, akraVar, dmloVar, this.d)) {
            return 0.5f;
        }
        dcdc<akra> dcdcVar = this.a;
        int size = dcdcVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            akra akraVar2 = dcdcVar.get(i2);
            if (this.b.get(aktcVar) == null || !akraVar2.equals(this.b.get(aktcVar).a)) {
                if (!akyx.p(amrkVar.e, akraVar2, this.e, this.f)) {
                    return 0.5f;
                }
                if (this.d.e(this.e)) {
                    i++;
                }
            }
        }
        if (!this.a.isEmpty()) {
            return i / this.a.size();
        }
        return 0.0f;
    }
}
