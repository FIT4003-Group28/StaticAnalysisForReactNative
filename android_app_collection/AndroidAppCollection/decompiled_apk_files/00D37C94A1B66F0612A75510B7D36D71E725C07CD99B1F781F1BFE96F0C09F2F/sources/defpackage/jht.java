package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
/* compiled from: PG */
/* renamed from: jht  reason: default package */
/* loaded from: classes3.dex */
public final class jht implements agry {
    private final aahf a;
    private final azqb b;
    private final azqb c;

    public jht(aahf aahfVar, azqb azqbVar, azqb azqbVar2) {
        this.a = aahfVar;
        this.b = azqbVar;
        this.c = azqbVar2;
    }

    @Override // defpackage.agry
    public final agrx a(atrf atrfVar) {
        return agrx.a;
    }

    @Override // defpackage.agry
    public final ankt c(afvm afvmVar, amuk amukVar) {
        return anlz.q(amuk.q());
    }

    @Override // defpackage.agry
    public final ankt b(afvm afvmVar, atrf atrfVar) {
        agru agruVar;
        agpz b;
        int aq = akel.aq(atrfVar.c);
        if (aq == 0) {
            aq = 1;
        }
        int i = aq - 1;
        if (i != 2) {
            if (i == 3) {
                jfr jfrVar = (jfr) this.b.get();
                jnd jndVar = (jnd) jfrVar.b.get();
                jnc jncVar = new jnc(jndVar.e, jndVar.a.c());
                jncVar.i();
                aopa createBuilder = atqj.a.createBuilder();
                long d = ((agvw) jfrVar.a.get()).d();
                createBuilder.copyOnWrite();
                atqj atqjVar = (atqj) createBuilder.instance;
                atqjVar.b = 2 | atqjVar.b;
                atqjVar.d = d;
                aghe b2 = ((agrf) ((agvw) jfrVar.a.get()).c.get()).a().b();
                long j = 0;
                if (b2 != null && (b = b2.b()) != null) {
                    j = b.a();
                }
                createBuilder.copyOnWrite();
                atqj atqjVar2 = (atqj) createBuilder.instance;
                atqjVar2.b = 1 | atqjVar2.b;
                atqjVar2.c = j;
                if (jfrVar.d.b()) {
                    long j2 = ((fda) jfrVar.c.a.c()).m;
                    createBuilder.copyOnWrite();
                    atqj atqjVar3 = (atqj) createBuilder.instance;
                    atqjVar3.b |= 4;
                    atqjVar3.e = j2;
                }
                jncVar.a = (atqj) createBuilder.mo39build();
                return anii.i(anko.q(((jnd) jfrVar.b.get()).b.b(jncVar, jfrVar.e)), g.b, anjk.a);
            }
            Object[] objArr = new Object[2];
            int aq2 = akel.aq(atrfVar.c);
            if (aq2 == 0) {
                aq2 = 1;
            }
            objArr[0] = Integer.valueOf(aq2 - 1);
            objArr[1] = 136;
            zep.e("Could not handle action: %s for type %s", objArr);
            return anlz.q(agru.c);
        }
        aahe c = this.a.c();
        asyv asyvVar = (asyv) c.f(emn.d()).g(asyv.class).W();
        if (asyvVar == null || asyvVar.getItems() == null) {
            agruVar = agru.a;
        } else {
            aahy c2 = ((aaik) c).c();
            amuf f = amuk.f();
            fbw fbwVar = (fbw) this.c.get();
            for (asyw asywVar : asyvVar.getItems()) {
                if (asywVar.b == 1) {
                    aopa createBuilder2 = atrf.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    atrf atrfVar2 = (atrf) createBuilder2.instance;
                    atrfVar2.c = 2;
                    atrfVar2.b |= 1;
                    String d2 = aakj.d(197, aakj.g((String) asywVar.c));
                    createBuilder2.copyOnWrite();
                    atrf atrfVar3 = (atrf) createBuilder2.instance;
                    d2.getClass();
                    atrfVar3.b |= 2;
                    atrfVar3.d = d2;
                    f.h((atrf) createBuilder2.mo39build());
                }
            }
            asxj asxjVar = fbwVar.b.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (asxjVar.ca) {
                c2.a(emn.d());
                jjd.m(c2, "Error deleting list entity and associated sub entities");
            } else {
                c2.a(emn.d());
                jjd.l(c2, "Error deleting list entity and associated sub entities");
            }
            agrt a = agru.a();
            a.a = 2;
            a.b(f.g());
            agruVar = a.a();
        }
        return anlz.q(agruVar);
    }
}
