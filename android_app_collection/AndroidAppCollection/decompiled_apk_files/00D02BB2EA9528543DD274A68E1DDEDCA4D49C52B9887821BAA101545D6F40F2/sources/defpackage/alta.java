package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alta  reason: default package */
/* loaded from: classes.dex */
public final class alta implements amcm {
    private final alsx a;

    public alta(alsx alsxVar) {
        this.a = alsxVar;
    }

    @Override // defpackage.amcm
    public final void a(alyh alyhVar, int i, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
        altt alttVar;
        int i2 = i - 1;
        if (i != 0) {
            char c = 2;
            int i3 = 3;
            if (i2 != 0) {
                if (i2 == 1) {
                    dcqe.b.u(TimeUnit.SECONDS);
                    this.a.a(alyhVar, 1, null);
                    return;
                } else if (i2 == 3) {
                    this.a.a(alyhVar, 2, null);
                    return;
                } else {
                    this.a.a(alyhVar, 1, null);
                    return;
                }
            } else if (alygVar != null) {
                List e = dcdc.e();
                alyr i4 = ((alyt) alygVar).i();
                while (i4.hasNext()) {
                    alvz next = i4.next();
                    if (next.f() == i3) {
                        alvn alvnVar = (alvn) next;
                        if (!alww.h(alvnVar.i, 8)) {
                            alttVar = null;
                        } else {
                            alts altsVar = alvnVar.l;
                            akqe akqeVar = new akqe();
                            aksc akscVar = alvnVar.g;
                            ArrayList<akrc> a = dchl.a();
                            int i5 = 0;
                            while (i5 < akscVar.b()) {
                                akra[] akraVarArr = new akra[i3];
                                akraVarArr[0] = new akra();
                                akraVarArr[1] = new akra();
                                akra akraVar = new akra();
                                akraVarArr[c] = akraVar;
                                akscVar.d(i5, akraVarArr[0], akraVarArr[1], akraVar);
                                a.add(new akrc(akraVarArr));
                                i5++;
                                c = 2;
                                i3 = 3;
                            }
                            for (akrc akrcVar : a) {
                                akrp i6 = akrcVar.i();
                                if (i6 != akqe.c) {
                                    if (akqeVar.b == akqe.c) {
                                        akqeVar.b = new akrp(akra.s(i6.a), akra.s(i6.b));
                                    } else {
                                        akrp akrpVar = akqeVar.b;
                                        akra akraVar2 = akrpVar.a;
                                        akraVar2.a = Math.min(akraVar2.a, i6.a.a);
                                        akra akraVar3 = akrpVar.a;
                                        akraVar3.b = Math.min(akraVar3.b, i6.a.b);
                                        akra akraVar4 = akrpVar.b;
                                        akraVar4.a = Math.max(akraVar4.a, i6.b.a);
                                        akra akraVar5 = akrpVar.b;
                                        akraVar5.b = Math.max(akraVar5.b, i6.b.b);
                                        akrpVar.c = null;
                                        akrpVar.d = null;
                                    }
                                    akqeVar.a.add(akrcVar);
                                }
                            }
                            alttVar = new altt(altsVar, akqeVar);
                        }
                        if (alttVar != null) {
                            if (e.isEmpty()) {
                                e = dchl.a();
                            }
                            e.add(alttVar);
                        }
                    }
                    c = 2;
                    i3 = 3;
                }
                e.size();
                this.a.a(alyhVar, 0, e);
                return;
            } else {
                this.a.a(alyhVar, 1, null);
                return;
            }
        }
        throw null;
    }
}
