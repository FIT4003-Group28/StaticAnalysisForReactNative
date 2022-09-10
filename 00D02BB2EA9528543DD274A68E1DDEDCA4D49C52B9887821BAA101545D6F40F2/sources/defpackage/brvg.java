package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brvg  reason: default package */
/* loaded from: classes4.dex */
public class brvg implements bruv {
    private final dcdc<brvb> a;
    private final bmom b;
    @dzsi
    private bwrs<ilo> c;
    @dzsi
    private cjtd d;

    public brvg(Activity activity, Map<dghs, brva> map, bmom bmomVar, jba jbaVar, dcdc<brrx> dcdcVar) {
        this.b = bmomVar;
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            brrx brrxVar = dcdcVar.get(i);
            brva brvaVar = map.get(brrxVar.a());
            if (brvaVar != null) {
                F.g(brvaVar.a(jbaVar, brrxVar));
            } else {
                bvoo.j(new bvon("Factory is not provided for PlaceActionType: %s", brrxVar.a().name()));
            }
        }
        this.a = F.f();
    }

    @Override // defpackage.bruv
    public List<brvb> a() {
        return dcbg.b(this.a).o(brvf.a).z();
    }

    @Override // defpackage.bruv
    public cjtd b() {
        cjta c = cjtd.c(this.d);
        c.d = dtxy.dd;
        return c.a();
    }

    @Override // defpackage.bruv
    public Boolean c(ckgz ckgzVar) {
        bmom bmomVar = this.b;
        bwrs<ilo> bwrsVar = this.c;
        return Boolean.valueOf(bmomVar.a(ckgzVar, bwrsVar != null ? bwrsVar.c() : null));
    }

    public void d(bwrs<ilo> bwrsVar) {
        this.c = bwrsVar;
        dcdc<brvb> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).i(bwrsVar);
        }
        ilo c = bwrsVar.c();
        this.d = c != null ? c.bZ() : null;
    }
}
