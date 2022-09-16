package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: jdl  reason: default package */
/* loaded from: classes3.dex */
public final class jdl extends aggp implements ynl {
    public final azqb a;
    public final azqb b;
    public final azqb c;
    private final aggo f;
    private final yni g;
    private final fcu h;
    private final jfu i;

    public jdl(snc sncVar, zdp zdpVar, aatb aatbVar, aggo aggoVar, agvw agvwVar, yni yniVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, fcu fcuVar, jfu jfuVar, agkn agknVar) {
        super(sncVar, zdpVar, aatbVar, aggoVar, agvwVar, agknVar);
        this.f = aggoVar;
        this.g = yniVar;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.h = fcuVar;
        this.i = jfuVar;
    }

    @Override // defpackage.aggp, defpackage.aggn
    public final synchronized int a(String str, agvx agvxVar) {
        if (!((jal) this.a.get()).b()) {
            this.f.a(str);
            return 0;
        }
        return super.a(str, agvxVar);
    }

    public final void b() {
        final jfu jfuVar = this.i;
        jfuVar.e = jfuVar.d.c().g(asyv.class).X(azpj.b(jfuVar.a)).I(jgs.b).V(iyw.h).k(asyv.class).at(new ayqb() { // from class: jfs
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                awkx b;
                jfu jfuVar2 = jfu.this;
                asyv asyvVar = (asyv) obj;
                jfuVar2.b.b(true);
                amzt listIterator = ((amuk) asyvVar.getItemsModels()).listIterator();
                while (listIterator.hasNext()) {
                    asyq a = ((asys) listIterator.next()).a();
                    if (a != null && (b = a.b()) != null) {
                        try {
                            agsd agsdVar = jfuVar2.c;
                            aopa createBuilder = atrf.a.createBuilder();
                            createBuilder.copyOnWrite();
                            atrf atrfVar = (atrf) createBuilder.instance;
                            atrfVar.c = 1;
                            atrfVar.b |= 1;
                            String d = aakj.d(197, b.getVideoId());
                            createBuilder.copyOnWrite();
                            atrf atrfVar2 = (atrf) createBuilder.instance;
                            d.getClass();
                            atrfVar2.b = 2 | atrfVar2.b;
                            atrfVar2.d = d;
                            aopc aopcVar = (aopc) atrc.b.createBuilder();
                            aopcVar.cm(atra.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                            amuk amukVar = agkt.a;
                            aopcVar.copyOnWrite();
                            atrc atrcVar = (atrc) aopcVar.instance;
                            atrcVar.e();
                            aonk.addAll((Iterable) amukVar, (List) atrcVar.f);
                            aopg aopgVar = asva.b;
                            aopa createBuilder2 = asva.a.createBuilder();
                            String d2 = b.d();
                            createBuilder2.copyOnWrite();
                            asva asvaVar = (asva) createBuilder2.instance;
                            d2.getClass();
                            asvaVar.c |= 1;
                            asvaVar.d = d2;
                            aopcVar.e(aopgVar, (asva) createBuilder2.mo39build());
                            createBuilder.copyOnWrite();
                            atrf atrfVar3 = (atrf) createBuilder.instance;
                            atrc atrcVar2 = (atrc) aopcVar.mo39build();
                            atrcVar2.getClass();
                            atrfVar3.e = atrcVar2;
                            atrfVar3.b |= 4;
                            agsdVar.d((atrf) createBuilder.mo39build());
                        } catch (agse e) {
                            String valueOf = String.valueOf(e.getMessage());
                            zep.b(valueOf.length() != 0 ? "Couldn't add: ".concat(valueOf) : new String("Couldn't add: "));
                        }
                    }
                }
                Set set = (Set) jfuVar2.d.c().j(137).E(iyw.i).U();
                HashSet e2 = amyv.e();
                for (asyw asywVar : asyvVar.getItems()) {
                    e2.add(asywVar.b == 1 ? (String) asywVar.c : "");
                }
                amys c = amyv.c(set, e2);
                aahy c2 = ((aaik) jfuVar2.d.c()).c();
                amzs it = ((amyq) c).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    asyq asyqVar = (asyq) jfuVar2.d.c().f(str).g(asyq.class).W();
                    if (asyqVar != null) {
                        aaji.b(c2, asyqVar);
                        try {
                            agsd agsdVar2 = jfuVar2.c;
                            aopa createBuilder3 = atrf.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            atrf atrfVar4 = (atrf) createBuilder3.instance;
                            atrfVar4.c = 2;
                            atrfVar4.b |= 1;
                            String d3 = aakj.d(197, aakj.g(str));
                            createBuilder3.copyOnWrite();
                            atrf atrfVar5 = (atrf) createBuilder3.instance;
                            d3.getClass();
                            atrfVar5.b |= 2;
                            atrfVar5.d = d3;
                            agsdVar2.d((atrf) createBuilder3.mo39build());
                        } catch (agse e3) {
                            String valueOf2 = String.valueOf(e3.getMessage());
                            zep.b(valueOf2.length() != 0 ? "Couldn't delete: ".concat(valueOf2) : new String("Couldn't delete: "));
                        }
                    }
                }
                jjd.m(c2, "Error deleting unreferenced entities");
            }
        }, new ayqb() { // from class: jft
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                jfu jfuVar2 = jfu.this;
                Throwable th = (Throwable) obj;
                aypg aypgVar = jfuVar2.e;
                if (aypgVar == null || aypgVar.e()) {
                    return;
                }
                ayqi.c((AtomicReference) jfuVar2.e);
            }
        });
        ((jan) this.b.get()).a();
        this.h.a.d().C(dzy.s).I().ak().n().aa(new ayqb() { // from class: jdk
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                jdl jdlVar = jdl.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                aqod a = aqoe.a();
                a.copyOnWrite();
                ((aqoe) a.instance).d(booleanValue);
                arrf a2 = arrh.a();
                a2.copyOnWrite();
                ((arrh) a2.instance).co((aqoe) a.mo39build());
                ((acrr) jdlVar.c.get()).c((arrh) a2.mo39build());
                ((jan) jdlVar.b.get()).a();
            }
        }, ick.i);
        this.e = new jdj(this);
        this.g.g(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                ((jan) this.b.get()).a();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwb.class};
    }
}
