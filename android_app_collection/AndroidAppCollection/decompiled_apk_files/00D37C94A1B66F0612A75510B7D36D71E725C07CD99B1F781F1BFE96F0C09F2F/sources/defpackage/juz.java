package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: juz  reason: default package */
/* loaded from: classes3.dex */
public final class juz implements jut {
    private final Map a;
    private final aagi b;
    private final faw c;
    private final fcl d;
    private final fcj e;
    private final fbu f;

    public juz(Map map, aagi aagiVar, faw fawVar, fcl fclVar, fcj fcjVar, fbu fbuVar) {
        this.a = map;
        this.b = aagiVar;
        this.c = fawVar;
        this.d = fclVar;
        this.e = fcjVar;
        this.f = fbuVar;
    }

    private final ampq b(jtv jtvVar, Class cls, ampq ampqVar, Object obj) {
        jus jusVar = (jus) this.a.get(jtvVar);
        jusVar.getClass();
        amuk a = jusVar.a(ampqVar).a((jnb) obj);
        return a.isEmpty() ? amon.a : ampq.j((aoqu) cls.cast(((jur) a.get(0)).a));
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        aqpa aqpaVar;
        aqot aqotVar;
        aqqc aqqcVar;
        asxj asxjVar = this.f.a.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        int i = -1;
        int a = ((asxjVar.cc && (aqqcVar = (aqqc) this.b.c().f(emn.j()).W()) != null && aqqcVar.getShouldPersistDownloadsSectionExpandedState().booleanValue()) || !this.e.b() || !this.d.e()) ? -1 : this.f.a();
        if (!jnbVar.b.h()) {
            aqpa b = aqpa.b(((aqpb) jnbVar.c.instance).c);
            if (b == null) {
                b = aqpa.FILTER_TYPE_UNSPECIFIED;
            }
            aqpaVar = b;
        } else {
            aqoy aqoyVar = (aqoy) jnbVar.b.c();
            if (aqoyVar.b == 2) {
                aqotVar = (aqot) aqoyVar.c;
            } else {
                aqotVar = aqot.a;
            }
            aqpaVar = aqpa.b(aqotVar.d);
            if (aqpaVar == null) {
                aqpaVar = aqpa.FILTER_TYPE_UNSPECIFIED;
            }
            if (a != -1) {
                i = aqotVar.e;
            }
            a = i;
        }
        aopa createBuilder = asls.a.createBuilder();
        aumx m = llm.m(aqos.REQUEST_TYPE_UNSPECIFIED, aqpaVar, a);
        createBuilder.copyOnWrite();
        asls aslsVar = (asls) createBuilder.instance;
        m.getClass();
        aslsVar.e = m;
        aslsVar.b |= 4;
        aopc aopcVar = (aopc) aslq.a.createBuilder();
        aopcVar.ct(createBuilder);
        aopcVar.copyOnWrite();
        aslq aslqVar = (aslq) aopcVar.instance;
        aslqVar.c |= 8;
        aslqVar.h = "downloads_page_downloads_item_section_identifier";
        ampq b2 = b(jtv.SECTION_HEADER, aslo.class, amon.a, jnbVar);
        if (b2.h()) {
            aopcVar.copyOnWrite();
            aslq aslqVar2 = (aslq) aopcVar.instance;
            aslqVar2.d = (aslo) b2.c();
            aslqVar2.c |= 1;
        }
        ArrayList arrayList = new ArrayList();
        faw fawVar = this.c;
        fas a2 = fau.a();
        a2.b(aqpaVar);
        a2.c(a);
        a2.d(fat.TIME_DESCENDING);
        fav favVar = (fav) fawVar.b(a2.a()).U();
        amuk amukVar = favVar.b;
        int size = amukVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            aajj aajjVar = (aajj) amukVar.get(i2);
            ampq b3 = b(aajjVar instanceof awjr ? jtv.VIDEO : jtv.PLAYLIST, aslt.class, ampq.i(aajjVar), jnbVar);
            if (b3.h()) {
                arrayList.add((aslt) b3.c());
            }
        }
        int size2 = favVar.a - favVar.b.size();
        if (size2 > 0) {
            ampq b4 = b(jtv.EXPAND_BUTTON, aslt.class, ampq.j(Integer.valueOf(size2)), jnbVar);
            if (b4.h()) {
                arrayList.add((aslt) b4.c());
            }
        }
        if (arrayList.isEmpty()) {
            ampq b5 = b(jtv.ZERO_STATE, aslt.class, amon.a, jnbVar);
            if (b5.h()) {
                aopcVar.ck((aslt) b5.c());
            }
        } else {
            aopcVar.cj(arrayList);
        }
        aopa createBuilder2 = auqk.a.createBuilder();
        createBuilder2.copyOnWrite();
        auqk auqkVar = (auqk) createBuilder2.instance;
        aslq aslqVar3 = (aslq) aopcVar.mo39build();
        aslqVar3.getClass();
        auqkVar.j = aslqVar3;
        auqkVar.b |= 16;
        return amuk.r(new jur((auqk) createBuilder2.mo39build()));
    }
}
