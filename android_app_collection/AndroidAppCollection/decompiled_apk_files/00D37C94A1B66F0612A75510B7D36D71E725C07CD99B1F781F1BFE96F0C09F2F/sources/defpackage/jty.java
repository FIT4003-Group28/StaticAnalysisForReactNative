package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: jty  reason: default package */
/* loaded from: classes3.dex */
public final class jty implements jut {
    private final Map a;
    private final joc b;
    private final fcj c;
    private final aagi d;

    public jty(Map map, joc jocVar, fcj fcjVar, aagi aagiVar) {
        this.a = map;
        this.b = jocVar;
        this.c = fcjVar;
        this.d = aagiVar;
    }

    private final ampq b(jtv jtvVar, Class cls, ampq ampqVar, jnb jnbVar) {
        jus jusVar = (jus) this.a.get(jtvVar);
        jusVar.getClass();
        amuk a = jusVar.a(ampqVar).a(jnbVar);
        return a.isEmpty() ? amon.a : ampq.i((aoqu) cls.cast(((jur) a.get(0)).a));
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        ampq a = this.b.a();
        aopc aopcVar = (aopc) aslq.a.createBuilder();
        aopcVar.copyOnWrite();
        aslq aslqVar = (aslq) aopcVar.instance;
        aslqVar.c |= 8;
        aslqVar.h = "downloads_page_recommendations_item_section_identifier";
        aopa createBuilder = asls.a.createBuilder();
        aopa createBuilder2 = aqoy.a.createBuilder();
        aopa createBuilder3 = aqou.a.createBuilder();
        createBuilder3.copyOnWrite();
        aqou aqouVar = (aqou) createBuilder3.instance;
        aqouVar.b |= 1;
        aqouVar.c = true;
        aqou aqouVar2 = (aqou) createBuilder3.mo39build();
        createBuilder2.copyOnWrite();
        aqoy aqoyVar = (aqoy) createBuilder2.instance;
        aqouVar2.getClass();
        aqoyVar.c = aqouVar2;
        aqoyVar.b = 3;
        aumx o = llm.o((aqoy) createBuilder2.mo39build());
        createBuilder.copyOnWrite();
        asls aslsVar = (asls) createBuilder.instance;
        o.getClass();
        aslsVar.e = o;
        aslsVar.b |= 4;
        aopcVar.cl((asls) createBuilder.mo39build());
        ampq b = b(jtv.SECTION_HEADER, aslo.class, amon.a, jnbVar);
        if (b.h()) {
            aopcVar.copyOnWrite();
            aslq aslqVar2 = (aslq) aopcVar.instance;
            aslqVar2.d = (aslo) b.c();
            aslqVar2.c |= 1;
        }
        ampq b2 = b(jtv.HABANERO_ENTRY_POINT, aslt.class, amon.a, jnbVar);
        if (b2.h()) {
            aopcVar.ck((aslt) b2.c());
        }
        if (this.c.b() && !nni.r(a, this.d.c())) {
            try {
                final joc jocVar = this.b;
                final aahe c = jocVar.d.c();
                amzt listIterator = ((amuk) c.f(emn.d()).g(asyv.class).w(new ayqe() { // from class: joa
                    @Override // defpackage.ayqe
                    public final Object a(Object obj) {
                        joc jocVar2 = joc.this;
                        amuf f = amuk.f();
                        for (asyw asywVar : ((asyv) obj).getItems()) {
                            if (asywVar.b == 1) {
                                if (jocVar2.c.c().f(emn.h(aakj.g((String) asywVar.c))).g(awjr.class).W() == null) {
                                    f.h(asywVar.b == 1 ? (String) asywVar.c : "");
                                }
                            }
                        }
                        return f.g();
                    }
                }).N(jnx.c).u(new ayqe() { // from class: job
                    @Override // defpackage.ayqe
                    public final Object a(Object obj) {
                        return aahe.this.f((String) obj).g(asyq.class);
                    }
                }).aq().E(jnx.a).U()).listIterator();
                while (listIterator.hasNext()) {
                    ampq b3 = b(jtv.VIDEO, aslt.class, ampq.i((asyq) listIterator.next()), jnbVar);
                    if (b3.h()) {
                        aopcVar.ck((aslt) b3.c());
                    }
                }
            } catch (RuntimeException e) {
                if (e.getCause() instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                    zep.d("Failed to get rec entities.", e);
                } else {
                    throw e;
                }
            }
        }
        if (((aslq) aopcVar.instance).e.size() == 0) {
            return amuk.q();
        }
        aopa createBuilder4 = auqk.a.createBuilder();
        createBuilder4.copyOnWrite();
        auqk auqkVar = (auqk) createBuilder4.instance;
        aslq aslqVar3 = (aslq) aopcVar.mo39build();
        aslqVar3.getClass();
        auqkVar.j = aslqVar3;
        auqkVar.b |= 16;
        return amuk.r(new jur((auqk) createBuilder4.mo39build()));
    }
}
