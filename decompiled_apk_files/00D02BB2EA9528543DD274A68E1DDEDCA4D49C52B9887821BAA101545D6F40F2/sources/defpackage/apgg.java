package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: apgg  reason: default package */
/* loaded from: classes2.dex */
public class apgg implements bskr {
    private final apge a;
    private final apgt b;
    private final List<apgd> c;

    public apgg(cqhn cqhnVar, apge apgeVar, apgt apgtVar, apgu apguVar, dcdc<aoxp> dcdcVar) {
        this.a = apgeVar;
        this.b = apgtVar;
        ArrayList arrayList = new ArrayList();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            aoxp aoxpVar = dcdcVar.get(i);
            apge apgeVar2 = this.a;
            apgf apgfVar = new apgf(this);
            Resources a = apgeVar2.a.a();
            apge.a(a, 1);
            aoxq a2 = apgeVar2.b.a();
            apge.a(a2, 2);
            apge.a(apguVar, 3);
            apge.a(apgfVar, 4);
            apge.a(aoxpVar, 5);
            arrayList.add(new apgd(a, a2, apguVar, apgfVar, aoxpVar));
        }
        this.c = arrayList;
    }

    @Override // defpackage.bskr
    public List<apgd> a() {
        return this.c;
    }

    public cqkl b() {
        apdh apdhVar = ((apdg) this.b).a;
        apdhVar.i(apdhVar.w(apdhVar.aR()));
        cqkx.p(this);
        return cqkl.a;
    }
}
