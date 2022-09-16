package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aouy  reason: default package */
/* loaded from: classes2.dex */
public final class aouy implements btzi<duzc, duzk> {
    final /* synthetic */ aogb a;
    final /* synthetic */ aouz b;

    public aouy(aouz aouzVar, aogb aogbVar) {
        this.b = aouzVar;
        this.a = aogbVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<duzc> btzrVar, btzy btzyVar) {
        this.b.b.f(this.a);
        this.b.m();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<duzc> btzrVar, duzk duzkVar) {
        duzk duzkVar2 = duzkVar;
        aouz aouzVar = this.b;
        aogb aogbVar = this.a;
        bvrj.UI_THREAD.d();
        int a = duzj.a(duzkVar2.b);
        if (a == 0) {
            a = 5;
        }
        if ((duzkVar2.a & 2) != 0) {
            aouzVar.b.j(aogbVar);
        } else {
            if (a == 1 || a == 6) {
                dvbb dvbbVar = duzkVar2.c;
                if (dvbbVar == null) {
                    dvbbVar = dvbb.e;
                }
                if (dvbbVar.b.size() != 0) {
                    angr angrVar = a == 1 ? angr.SUCCESS : angr.ERROR;
                    dbsg dbsgVar = dbpy.a;
                    dvbb dvbbVar2 = duzkVar2.c;
                    if (dvbbVar2 == null) {
                        dvbbVar2 = dvbb.e;
                    }
                    if ((dvbbVar2.a & 1) != 0) {
                        dvbb dvbbVar3 = duzkVar2.c;
                        if (dvbbVar3 == null) {
                            dvbbVar3 = dvbb.e;
                        }
                        dbsgVar = dbsg.i(dvbbVar3.c);
                    }
                    dvbb dvbbVar4 = duzkVar2.c;
                    if (dvbbVar4 == null) {
                        dvbbVar4 = dvbb.e;
                    }
                    dqfw dqfwVar = dvbbVar4.d;
                    if (dqfwVar == null) {
                        dqfwVar = dqfw.a;
                    }
                    dqfw dqfwVar2 = dqfwVar;
                    dvbb dvbbVar5 = duzkVar2.c;
                    if (dvbbVar5 == null) {
                        dvbbVar5 = dvbb.e;
                    }
                    Iterator<duzv> it = dvbbVar5.b.iterator();
                    int i = 0;
                    boolean z = false;
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                            duzv next = it.next();
                            if (duzkVar2.f.isEmpty()) {
                                bvoo.h("No ActivityTypeSpecs found in the timeline response.", new Object[i]);
                                break;
                            }
                            aofn aofnVar = new aofn(duzkVar2.f);
                            String str = duzkVar2.g;
                            dvbd dvbdVar = duzkVar2.e;
                            if (dvbdVar == null) {
                                dvbdVar = dvbd.d;
                            }
                            aoge aogeVar = new aoge(bvrt.b(next), str, dbsgVar, bvrt.b(dqfwVar2), aofnVar, dvbdVar.c);
                            aogeVar.d();
                            aogeVar.f();
                            aogeVar.e();
                            aogeVar.g();
                            aogeVar.j();
                            aogeVar.k();
                            z2 = aogeVar.g().equals(aogbVar) | z2;
                            dvah dvahVar = aogeVar.a().j;
                            if (dvahVar == null) {
                                dvahVar = dvah.c;
                            }
                            if ((dvahVar.a & 1) != 0) {
                                dvah dvahVar2 = aogeVar.a().j;
                                if (dvahVar2 == null) {
                                    dvahVar2 = dvah.c;
                                }
                                djuz djuzVar = dvahVar2.b;
                                if (djuzVar == null) {
                                    djuzVar = djuz.a;
                                }
                                dbsg.i(djuzVar);
                            }
                            aouzVar.b.e(aogbVar, aogeVar, angrVar);
                            z = true;
                            i = 0;
                        } else if (!z2) {
                            bvoo.h("Timeline request for %s yielded a response that does not contain that day", aogbVar);
                        } else if (!z) {
                            return;
                        }
                    }
                }
            }
            aouzVar.b.f(aogbVar);
        }
        this.b.m();
    }
}
