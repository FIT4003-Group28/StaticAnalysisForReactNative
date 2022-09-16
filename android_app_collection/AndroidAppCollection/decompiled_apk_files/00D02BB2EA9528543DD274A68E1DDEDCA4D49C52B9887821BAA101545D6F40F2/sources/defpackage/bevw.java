package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bevw  reason: default package */
/* loaded from: classes3.dex */
public class bevw implements bevv {
    private final doex a;
    private final ilo b;
    private final begg c;
    private final List<bevj> d;

    public bevw(doex doexVar, begg beggVar, Activity activity, beuq beuqVar, int i, @dzsi String str) {
        bevw bevwVar = this;
        bevwVar.a = doexVar;
        bevwVar.c = beggVar;
        ily ilyVar = new ily();
        ilyVar.F(doexVar.b);
        ilyVar.k(doexVar.d);
        int i2 = 0;
        ilyVar.f = false;
        bevwVar.b = ilyVar.d();
        bevwVar.d = new ArrayList();
        while (i2 < doexVar.c.size()) {
            bevwVar.d.add(new bevm(doexVar.c.get(i2), activity, i == -1 ? i2 : i + i2, beuqVar.c(), false, null, str, dtxo.an, dtxo.ap, dtxo.ao));
            i2++;
            bevwVar = this;
        }
    }

    @Override // defpackage.bevv
    public String a() {
        return this.a.b;
    }

    @Override // defpackage.bevv
    public List<bevj> b() {
        return this.d;
    }

    @Override // defpackage.bevv
    public Boolean c() {
        return Boolean.valueOf((this.a.a & 4) != 0);
    }

    @Override // defpackage.bevv
    public cqkl d() {
        begj begjVar = new begj();
        begjVar.b(this.b);
        begjVar.n = true;
        begjVar.c = jjn.EXPANDED;
        begjVar.F = true;
        this.c.o(begjVar, false, null);
        return cqkl.a;
    }
}
