package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: jtd  reason: default package */
/* loaded from: classes3.dex */
public final class jtd implements jut {
    private final Map a;
    private final joc b;

    public jtd(Map map, joc jocVar) {
        this.a = map;
        this.b = jocVar;
    }

    private final void b(jtv jtvVar, jnb jnbVar, ampq ampqVar, aopc aopcVar) {
        jus jusVar = (jus) this.a.get(jtvVar);
        jusVar.getClass();
        amuk a = jusVar.a(ampqVar).a(jnbVar);
        if (a.isEmpty()) {
            return;
        }
        aopcVar.ck((aslt) ((jur) a.get(0)).a);
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        ampq a = this.b.a();
        aopc aopcVar = (aopc) aslq.a.createBuilder();
        aopcVar.copyOnWrite();
        aslq aslqVar = (aslq) aopcVar.instance;
        aslqVar.c |= 8;
        aslqVar.h = "downloads_page_banner_item_section_identifier";
        b(jtv.TRAVEL_BANNER, jnbVar, a, aopcVar);
        if (((aslq) aopcVar.instance).e.size() == 0) {
            b(jtv.TEXIT_BANNER, jnbVar, a, aopcVar);
        }
        if (((aslq) aopcVar.instance).e.size() == 1) {
            aopa createBuilder = auqk.a.createBuilder();
            createBuilder.copyOnWrite();
            auqk auqkVar = (auqk) createBuilder.instance;
            aslq aslqVar2 = (aslq) aopcVar.mo39build();
            aslqVar2.getClass();
            auqkVar.j = aslqVar2;
            auqkVar.b |= 16;
            return amuk.r(new jur((auqk) createBuilder.mo39build()));
        }
        return amuk.q();
    }
}
