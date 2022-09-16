package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: apih  reason: default package */
/* loaded from: classes2.dex */
public class apih extends apik {
    public final List<aoxt> a;
    public final aphj b;
    public final aoyk c;
    public final Resources d;
    private final apim i;
    private final bwrs<aoyg> j;

    public apih(Resources resources, apim apimVar, cjqy cjqyVar, aphj aphjVar, bwrs<aoyg> bwrsVar, List<aoxt> list, cjtd cjtdVar, aoyk aoykVar) {
        super(cjqyVar, cjtdVar);
        this.i = apimVar;
        this.b = aphjVar;
        this.j = bwrsVar;
        this.a = list;
        this.c = aoykVar;
        this.d = resources;
    }

    @Override // defpackage.aphq
    public aphw a() {
        return new apig(this);
    }

    @Override // defpackage.aphq
    public List<aphr> b() {
        ArrayList arrayList = new ArrayList();
        aoyg c = this.j.c();
        dbsk.s(c);
        dcde e = dckz.e(c.c(), apif.a);
        dcdc<aoxt> a = aphm.a(this.a, this.c.aT());
        for (int i = 0; i < a.size(); i++) {
            int size = e.h(bkkc.c(a.get(i).a().ai())).size();
            apim apimVar = this.i;
            aoxt aoxtVar = a.get(i);
            bwqv a2 = apimVar.a.a();
            apim.a(a2, 1);
            aoxv a3 = apimVar.b.a();
            apim.a(a3, 2);
            gga a4 = apimVar.c.a();
            apim.a(a4, 3);
            bmdv a5 = apimVar.d.a();
            apim.a(a5, 4);
            aphj a6 = apimVar.e.a();
            apim.a(a6, 5);
            apim.a(aoxtVar, 6);
            arrayList.add(new apil(a2, a3, a4, a5, a6, aoxtVar, size, i));
        }
        return arrayList;
    }

    @Override // defpackage.apik, defpackage.aphq
    public cqqw c() {
        return super.c();
    }
}
