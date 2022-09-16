package defpackage;
/* compiled from: PG */
/* renamed from: jti  reason: default package */
/* loaded from: classes3.dex */
public final class jti implements jut {
    private final jus a;
    private final joc b;
    private final /* synthetic */ int c;

    public jti(jus jusVar, joc jocVar) {
        this.a = jusVar;
        this.b = jocVar;
    }

    public jti(jus jusVar, joc jocVar, int i) {
        this.c = i;
        this.a = jusVar;
        this.b = jocVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        if (this.c == 0) {
            amuk a = ((jtf) this.a).a(this.b.a()).a(jnbVar);
            if (a.isEmpty()) {
                return amuk.q();
            }
            aopa createBuilder = auqk.a.createBuilder();
            aopc aopcVar = (aopc) aslq.a.createBuilder();
            aopcVar.copyOnWrite();
            aslq aslqVar = (aslq) aopcVar.instance;
            aslqVar.c |= 8;
            aslqVar.h = "downloads_page_disclaimer_item_section_identifier";
            aopcVar.ck((aslt) ((jur) a.get(0)).a);
            aslq aslqVar2 = (aslq) aopcVar.mo39build();
            createBuilder.copyOnWrite();
            auqk auqkVar = (auqk) createBuilder.instance;
            aslqVar2.getClass();
            auqkVar.j = aslqVar2;
            auqkVar.b |= 16;
            return amuk.r(new jur((auqk) createBuilder.mo39build()));
        }
        jus jusVar = this.a;
        this.b.a();
        amuk a2 = ((jtc) jusVar).b().a(jnbVar);
        if (!a2.isEmpty()) {
            aopa createBuilder2 = auqk.a.createBuilder();
            aopc aopcVar2 = (aopc) aslq.a.createBuilder();
            aopcVar2.copyOnWrite();
            aslq aslqVar3 = (aslq) aopcVar2.instance;
            aslqVar3.c |= 8;
            aslqVar3.h = "downloads_page_banner_item_section_identifier";
            aopcVar2.ck((aslt) ((jur) a2.get(0)).a);
            aslq aslqVar4 = (aslq) aopcVar2.mo39build();
            createBuilder2.copyOnWrite();
            auqk auqkVar2 = (auqk) createBuilder2.instance;
            aslqVar4.getClass();
            auqkVar2.j = aslqVar4;
            auqkVar2.b |= 16;
            return amuk.r(new jur((auqk) createBuilder2.mo39build()));
        }
        return amuk.q();
    }
}
