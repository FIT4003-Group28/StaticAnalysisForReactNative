package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahiw  reason: default package */
/* loaded from: classes2.dex */
public class ahiw extends ahhv {
    private final List<agxa<?>> a;
    private final cjta b;
    private final String c;
    private final List<agwu> d;
    private final agyq e;

    public ahiw(ahbd ahbdVar, ahas ahasVar, ahht ahhtVar, dlcv dlcvVar, List<agwu> list, agyh agyhVar, cjta cjtaVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        dldh dldhVar;
        if (dlcvVar.b == 10) {
            dldhVar = (dldh) dlcvVar.c;
        } else {
            dldhVar = dldh.d;
        }
        dkzz dkzzVar = dldhVar.c.get(0).a;
        String str = (dkzzVar == null ? dkzz.b : dkzzVar).a;
        this.c = str;
        String quantityString = this.k.getResources().getQuantityString(R.plurals.LIST_COUNT_PLACES, list.size(), Integer.valueOf(list.size()));
        this.d = list;
        this.b = cjtaVar;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(agxa.a(new agve(agvd.c().a()), new ahip(new ahiq(str, quantityString, null, cjtd.b))));
        agoa h = agob.h();
        h.e(true);
        h.c(true);
        agoc agocVar = new agoc(h.a());
        ArrayList arrayList2 = new ArrayList();
        for (agwu agwuVar : list) {
            arrayList2.add(cqgr.fT(agocVar, agwuVar));
        }
        this.a.add(agxa.a(new agdh(), new ahat(ahbdVar.a(arrayList2, cjtaVar.b(dtxu.bE)).a())));
        jic jicVar = new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.localstream_weekly_trending_icon_svg), 0);
        cjtd cjtdVar = cjtd.b;
        String str2 = dldhVar.b;
        dkzz dkzzVar2 = dldhVar.c.get(0).a;
        this.e = ahasVar.a(str2, null, jicVar, null, cjtdVar, str2, (dkzzVar2 == null ? dkzz.b : dkzzVar2).a, this);
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.a;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.b.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<agyq> c() {
        return cqgr.fT(new agdv(), this.e);
    }

    @Override // defpackage.ahhv, defpackage.agxe
    @dzsi
    public CharSequence d() {
        return this.c;
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.d;
    }
}
