package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: apio  reason: default package */
/* loaded from: classes2.dex */
public class apio extends apik {
    public final List<aoxt> a;
    public final aphj b;
    public final aoyk c;
    public final Resources d;
    private final apis i;
    private final bwrs<aoyg> j;
    private final bwrs<aoyg> k;

    public apio(Resources resources, apis apisVar, cjqy cjqyVar, aphj aphjVar, bwrs<aoyg> bwrsVar, bwrs<aoyg> bwrsVar2, bwrs<aoyg> bwrsVar3, aoyk aoykVar) {
        super(cjqyVar, cjtd.a(dtyi.ah));
        this.i = apisVar;
        this.b = aphjVar;
        this.j = bwrsVar;
        this.k = bwrsVar2;
        aoyg c = bwrsVar3.c();
        dbsk.s(c);
        this.a = c.d();
        this.c = aoykVar;
        this.d = resources;
    }

    @Override // defpackage.aphq
    public aphw a() {
        return new apin(this);
    }

    @Override // defpackage.aphq
    public List<aphr> b() {
        ArrayList arrayList = new ArrayList();
        dcdc<aoxt> a = aphm.a(this.a, ((aovt) this.c).aS);
        for (int i = 0; i < a.size(); i++) {
            apis apisVar = this.i;
            aoxt aoxtVar = a.get(i);
            bwrs<aoyg> bwrsVar = this.j;
            bwrs<aoyg> bwrsVar2 = this.k;
            bwqv a2 = apisVar.a.a();
            apis.a(a2, 1);
            gga a3 = apisVar.b.a();
            apis.a(a3, 2);
            bmdv a4 = apisVar.c.a();
            apis.a(a4, 3);
            aphj a5 = apisVar.d.a();
            apis.a(a5, 4);
            apis.a(aoxtVar, 5);
            apis.a(bwrsVar, 7);
            apis.a(bwrsVar2, 8);
            arrayList.add(new apir(a2, a3, a4, a5, aoxtVar, i, bwrsVar, bwrsVar2));
        }
        return arrayList;
    }

    @Override // defpackage.apik, defpackage.aphq
    public cqqw c() {
        return super.c();
    }
}
