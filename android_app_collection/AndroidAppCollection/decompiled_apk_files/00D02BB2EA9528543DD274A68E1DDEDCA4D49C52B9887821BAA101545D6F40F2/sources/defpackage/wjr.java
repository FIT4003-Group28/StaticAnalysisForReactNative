package defpackage;

import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: wjr  reason: default package */
/* loaded from: classes7.dex */
public class wjr implements wjk {
    private static final dbsl<wjm> a = new wjp();
    private final String b;
    private final dcdc<wjm> c;
    private final dcdc<wpv> d;
    private final dcdc<wjm> e;
    private final dcdc<wpv> f;

    public wjr(vtn vtnVar, qbt qbtVar, wsm wsmVar, wjv wjvVar, zrt zrtVar, dopk dopkVar) {
        dooa dooaVar;
        wjv wjvVar2 = wjvVar;
        this.b = dopkVar.b;
        int i = 4;
        akqi b = (dopkVar.a & 4) != 0 ? akqi.b(dopkVar.d) : null;
        String str = dopkVar.b;
        dccx F = dcdc.F();
        Iterator<doom> it = dopkVar.f.iterator();
        while (true) {
            int i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            doom next = it.next();
            dooj b2 = dooj.b(next.f);
            dooj doojVar = b2 == null ? dooj.UNKNOWN : b2;
            jhk b3 = xkg.b(next);
            for (dooo doooVar : next.c) {
                if (doooVar.e.size() > 0) {
                    dool b4 = dool.b(next.d);
                    dool doolVar = b4 == null ? dool.SHORT : b4;
                    vtn a2 = wjvVar2.a.a();
                    wjv.a(a2, i2);
                    wsm a3 = wjvVar2.b.a();
                    wjv.a(a3, 2);
                    wjv.a(str, i);
                    wjv.a(doojVar, 5);
                    wjv.a(doooVar, 7);
                    wjv.a(doolVar, 8);
                    F.g(new wju(a2, a3, b, str, doojVar, b3, doooVar, doolVar));
                    wjvVar2 = wjvVar;
                    doojVar = doojVar;
                    next = next;
                    i = 4;
                    i2 = 1;
                } else {
                    wjvVar2 = wjvVar;
                }
            }
            wjvVar2 = wjvVar;
        }
        int i3 = 1;
        dcdc<wjm> f = F.f();
        this.e = f;
        dcdc<wjm> r = dcdc.r(dbze.a(f, a));
        this.c = r;
        ArrayList arrayList = new ArrayList();
        for (wjm wjmVar : r) {
            if (wjmVar.d()) {
                for (wjl wjlVar : wjmVar.b()) {
                    arrayList.addAll(wjlVar.b());
                }
            } else {
                arrayList.addAll(wjmVar.a());
            }
        }
        wso.a(arrayList);
        this.d = dcdc.r(arrayList);
        akqi f2 = akqi.f(dopkVar.d);
        String str2 = dopkVar.b;
        dnoh dnohVar = dopkVar.g;
        dnoh dnohVar2 = dnohVar == null ? dnoh.d : dnohVar;
        ArrayList a4 = dchl.a();
        Iterator<doom> it2 = dopkVar.f.iterator();
        while (it2.hasNext()) {
            doom next2 = it2.next();
            dooj b5 = dooj.b(next2.f);
            if ((b5 == null ? dooj.UNKNOWN : b5) == dooj.TIMETABLE) {
                jhk b6 = xkg.b(next2);
                dooj b7 = dooj.b(next2.f);
                dooj doojVar2 = b7 == null ? dooj.UNKNOWN : b7;
                for (dooo doooVar2 : next2.c) {
                    zsf zsfVar = new zsf(vtnVar, doooVar2.c, b6);
                    Iterator<doog> it3 = doooVar2.e.iterator();
                    while (it3.hasNext()) {
                        doog next3 = it3.next();
                        for (dood doodVar : xkg.s(next3)) {
                            if (doodVar.b == i3) {
                                dooaVar = (dooa) doodVar.c;
                            } else {
                                dooaVar = dooa.m;
                            }
                            dgaw dgawVar = dooaVar.c;
                            dgaw dgawVar2 = dgawVar == null ? dgaw.g : dgawVar;
                            dool b8 = dool.b(next2.d);
                            if (b8 == null) {
                                b8 = dool.SHORT;
                            }
                            zsf zsfVar2 = zsfVar;
                            ArrayList arrayList2 = a4;
                            arrayList2.add(dbsi.a(dgawVar2, wsmVar.a(f2, str2, dnohVar2, null, doojVar2, zsfVar2, b8, next3.b, null, wsk.ALWAYS_RELEVANT, dcdc.f(doodVar), dtyc.eO, dtyc.eQ, null, a4.size(), null, true, true, false)));
                            a4 = arrayList2;
                            next3 = next3;
                            zsfVar = zsfVar2;
                            b6 = b6;
                            next2 = next2;
                            str2 = str2;
                            i3 = 1;
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = a4;
        Collections.sort(arrayList3, new wjq());
        dccx G = dcdc.G(arrayList3.size());
        int size = arrayList3.size();
        for (int i4 = 0; i4 < size; i4++) {
            G.g((wpv) ((dbsi) arrayList3.get(i4)).b);
        }
        this.f = G.f();
        zrs.s(zrtVar, GmmNotice.g(dopkVar.l), new xdn());
        pyy.c(dopkVar.k);
    }

    @Override // defpackage.wjk
    @dzsi
    public String a() {
        return this.b;
    }

    @Override // defpackage.wjk
    public List<wjm> b() {
        return this.c;
    }

    @Override // defpackage.wjk
    public List<wpv> c() {
        return this.d;
    }

    @Override // defpackage.wjk
    public List<wjm> d() {
        return this.e;
    }

    @Override // defpackage.wjk
    public List<wpv> e() {
        return this.f;
    }
}
