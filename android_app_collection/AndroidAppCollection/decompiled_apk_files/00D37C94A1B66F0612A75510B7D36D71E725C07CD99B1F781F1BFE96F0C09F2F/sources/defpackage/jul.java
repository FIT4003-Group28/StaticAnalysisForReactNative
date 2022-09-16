package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jul  reason: default package */
/* loaded from: classes3.dex */
public final class jul implements jut, jua {
    public final aahf a;
    public final faw b;
    public final afvn c;
    public final fcu d;
    public final jsf e;
    public final Executor f;
    private final Map g;

    public jul(Map map, aahf aahfVar, faw fawVar, afvn afvnVar, fcu fcuVar, jsf jsfVar, Executor executor) {
        this.g = map;
        this.a = aahfVar;
        this.b = fawVar;
        this.c = afvnVar;
        this.d = fcuVar;
        this.e = jsfVar;
        this.f = executor;
    }

    @Override // defpackage.jut
    public final amuk a(final jnb jnbVar) {
        ylr.b();
        try {
            return (amuk) ((anie) anii.i(anko.q(d()), new anir() { // from class: jui
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    jul julVar = jul.this;
                    jnb jnbVar2 = jnbVar;
                    if (((Boolean) obj).booleanValue()) {
                        aopa createBuilder = asls.a.createBuilder();
                        aumx n = llm.n(aqow.REQUEST_TYPE_UNSPECIFIED);
                        createBuilder.copyOnWrite();
                        asls aslsVar = (asls) createBuilder.instance;
                        n.getClass();
                        aslsVar.e = n;
                        aslsVar.b |= 4;
                        aopc aopcVar = (aopc) aslq.a.createBuilder();
                        aopcVar.ct(createBuilder);
                        aopcVar.copyOnWrite();
                        aslq aslqVar = (aslq) aopcVar.instance;
                        aslqVar.c |= 8;
                        aslqVar.h = "downloads_page_smart_downloads_item_section_identifier";
                        return anii.i(anko.q(julVar.d.b(julVar.c.c().b())), new juk(julVar, aopcVar, jnbVar2), julVar.f);
                    }
                    return anlz.q(amuk.q());
                }
            }, this.f)).get();
        } catch (InterruptedException | ExecutionException unused) {
            return amuk.q();
        }
    }

    public final ampq b(jtv jtvVar, Class cls, ampq ampqVar, jnb jnbVar) {
        jus jusVar = (jus) this.g.get(jtvVar);
        jusVar.getClass();
        amuk a = jusVar.a(ampqVar).a(jnbVar);
        return a.isEmpty() ? amon.a : ampq.j((aoqu) cls.cast(((jur) a.get(0)).a));
    }

    @Override // defpackage.jua
    public final synchronized ankt d() {
        return anii.i(anko.q(this.d.b(this.c.c().b())), new anir() { // from class: juh
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                final jul julVar = jul.this;
                if (((Boolean) obj).booleanValue()) {
                    return anlz.q(true);
                }
                anko q = anko.q(zna.r(julVar.e.a()));
                final anko q2 = anko.q(anii.h(((yvc) julVar.d.c.get()).a(), new fct(julVar.c.c().b(), 2), anjk.a));
                return anii.i(q, new anir() { // from class: juj
                    @Override // defpackage.anir
                    public final ankt a(Object obj2) {
                        jul julVar2 = jul.this;
                        anko ankoVar = q2;
                        if (!((Boolean) obj2).booleanValue()) {
                            return anlz.q(false);
                        }
                        return anii.h(ankoVar, jgl.r, julVar2.f);
                    }
                }, julVar.f);
            }
        }, this.f);
    }
}
