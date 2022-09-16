package defpackage;
/* compiled from: PG */
/* renamed from: juy  reason: default package */
/* loaded from: classes3.dex */
public final class juy implements jut {
    public final aagi a;
    public final jus b;
    public final afvn c;
    private final faw d;

    public juy(aagi aagiVar, jus jusVar, faw fawVar, afvn afvnVar) {
        this.a = aagiVar;
        this.b = jusVar;
        this.d = fawVar;
        this.c = afvnVar;
    }

    @Override // defpackage.jut
    public final amuk a(final jnb jnbVar) {
        amuk amukVar = (amuk) this.d.b(fau.a().a()).E(jnx.j).E(new ayqe() { // from class: juw
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                juy juyVar = juy.this;
                amuk amukVar2 = (amuk) obj;
                aagh a = juyVar.a.a(juyVar.c.c());
                ampq ampqVar = amon.a;
                int size = amukVar2.size();
                int i = 0;
                while (i < size) {
                    aajj aajjVar = (aajj) amukVar2.get(i);
                    if (aajjVar instanceof awjr) {
                        ampqVar = pku.l(ampq.j((awjr) aajjVar));
                    } else if (aajjVar instanceof awjm) {
                        awkg b = ((awjm) ((ampv) ampq.j((awjm) aajjVar)).a).b();
                        if (b != null) {
                            amuk b2 = b.b();
                            int i2 = ((amxx) b2).c;
                            int i3 = 0;
                            while (i3 < i2) {
                                awkx b3 = ((awkp) b2.get(i3)).b();
                                ampq l = b3 == null ? amon.a : pku.l(pku.k(emn.h(b3.getVideoId()), a));
                                i3++;
                                if (l.h()) {
                                    ampqVar = l;
                                    break;
                                }
                            }
                        }
                        ampqVar = amon.a;
                    }
                    i++;
                    if (ampqVar.h()) {
                        break;
                    }
                }
                return ampqVar;
            }
        }).h(jgs.o).w(jnx.k).r(jgs.p).w(new ayqe() { // from class: jux
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                juy juyVar = juy.this;
                return ((jtg) juyVar.b).a(ampq.j(new jth(((Integer) obj).intValue()))).a(jnbVar);
            }
        }).G(ayoc.v(amuk.q())).W();
        if (amukVar.isEmpty()) {
            return amuk.q();
        }
        aopa createBuilder = auqk.a.createBuilder();
        aopc aopcVar = (aopc) aslq.a.createBuilder();
        aopcVar.copyOnWrite();
        aslq aslqVar = (aslq) aopcVar.instance;
        aslqVar.c |= 8;
        aslqVar.h = "downloads_page_disclaimer_item_section_identifier";
        aopcVar.ck((aslt) ((jur) amukVar.get(0)).a);
        aslq aslqVar2 = (aslq) aopcVar.mo39build();
        createBuilder.copyOnWrite();
        auqk auqkVar = (auqk) createBuilder.instance;
        aslqVar2.getClass();
        auqkVar.j = aslqVar2;
        auqkVar.b |= 16;
        return amuk.r(new jur((auqk) createBuilder.mo39build()));
    }
}
