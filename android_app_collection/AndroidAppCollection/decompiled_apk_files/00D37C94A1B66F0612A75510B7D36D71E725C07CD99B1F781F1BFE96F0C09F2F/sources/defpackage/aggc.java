package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aggc  reason: default package */
/* loaded from: classes.dex */
public final class aggc {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final ampq d;

    public aggc(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, ampq ampqVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = ampqVar;
    }

    public final void a() {
        ((agrf) this.b.get()).e();
        final agsd agsdVar = (agsd) this.a.get();
        if (!agsdVar.i) {
            agsdVar.e.g(agsdVar);
            aynp aynpVar = aynp.DROP_OLDEST;
            ayrd.b(aynpVar, "overflowStrategy is null");
            ayxu ayxuVar = new ayxu((aynx) agsdVar.d.get(), aynpVar);
            azqc.j();
            ayxuVar.n().G(azpj.b(agsdVar.g)).Z(new ayqb() { // from class: agsb
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    agsd agsdVar2 = agsd.this;
                    Integer num = (Integer) obj;
                    agsg agsgVar = (agsg) agsdVar2.h.get();
                    if (agsgVar != null && !agsgVar.d.isEmpty() && ((yrj) agsdVar2.c.get()).p()) {
                        agsgVar.h();
                    }
                }
            });
            agsdVar.b();
            agsdVar.i = true;
        }
        final agtc agtcVar = (agtc) this.c.get();
        new aypf().d(aiwv.j(agtcVar.c, agix.g).Z(new ayqb() { // from class: agtb
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                agtc agtcVar2 = agtc.this;
                ahgd ahgdVar = (ahgd) obj;
                aopa createBuilder = aqqr.a.createBuilder();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(agtcVar2.b.c());
                createBuilder.copyOnWrite();
                aqqr aqqrVar = (aqqr) createBuilder.instance;
                aqqrVar.c |= 8;
                aqqrVar.d = seconds;
                aopc aopcVar = (aopc) atrc.b.createBuilder();
                aopcVar.e(aqqr.b, (aqqr) createBuilder.mo39build());
                atrc atrcVar = (atrc) aopcVar.mo39build();
                try {
                    agsd agsdVar2 = agtcVar2.a;
                    aopa createBuilder2 = atrf.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    atrf atrfVar = (atrf) createBuilder2.instance;
                    atrfVar.c = 4;
                    atrfVar.b |= 1;
                    String f = aakj.f(146, ahgdVar.a());
                    createBuilder2.copyOnWrite();
                    atrf atrfVar2 = (atrf) createBuilder2.instance;
                    f.getClass();
                    atrfVar2.b |= 2;
                    atrfVar2.d = f;
                    createBuilder2.copyOnWrite();
                    atrf atrfVar3 = (atrf) createBuilder2.instance;
                    atrcVar.getClass();
                    atrfVar3.e = atrcVar;
                    atrfVar3.b |= 4;
                    agsdVar2.d((atrf) createBuilder2.mo39build());
                } catch (agse e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zep.b(valueOf.length() != 0 ? "Couldn't update: ".concat(valueOf) : new String("Couldn't update: "));
                }
            }
        }));
    }

    public final void b() {
        Boolean bool;
        final agrs agrsVar = (agrs) ((agsd) this.a.get()).b.get();
        if (agrsVar.j.a().booleanValue()) {
            agrsVar.h.submit(new Runnable() { // from class: agrq
                @Override // java.lang.Runnable
                public final void run() {
                    agrs.this.b();
                }
            });
            agrsVar.d();
            agrsVar.i.g(agrsVar);
        }
        final aguo aguoVar = (aguo) ((ampv) this.d).a;
        aqxe aqxeVar = aguoVar.c.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45353564L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353564L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353564L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            aiwv.j(aguoVar.a, agix.i).G(aguoVar.b).aa(new ayqb() { // from class: agun
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    final aguo aguoVar2 = aguo.this;
                    final ahhn ahhnVar = (ahhn) obj;
                    anii.h(aguoVar2.d.a().m().h(ahhnVar.a()), new ampg() { // from class: agum
                        @Override // defpackage.ampg
                        public final Object apply(Object obj2) {
                            aguo aguoVar3 = aguo.this;
                            ahhn ahhnVar2 = ahhnVar;
                            ampq ampqVar = (ampq) obj2;
                            if (ampqVar == null || !ampqVar.h()) {
                                return null;
                            }
                            aguoVar3.d.a().l().g(ahhnVar2.a());
                            return null;
                        }
                    }, anjk.a);
                }
            }, aaga.i);
        }
    }
}
