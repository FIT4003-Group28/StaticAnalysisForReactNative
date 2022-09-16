package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: tnx  reason: default package */
/* loaded from: classes4.dex */
public final class tnx implements tlo {
    public final tnl a;
    public final tlu b;
    private final toh c;

    public tnx(tnl tnlVar, tlu tluVar, toh tohVar) {
        this.a = tnlVar;
        this.b = tluVar;
        this.c = tohVar;
    }

    @Override // defpackage.tlo
    public final ankt a(final tlr tlrVar) {
        final tnj tnjVar = (tnj) tlrVar.a;
        final String e = this.a.e(tnjVar);
        if (e.isEmpty()) {
            return anlz.q(null);
        }
        final ankt c = this.a.c(tnjVar, tlrVar.b);
        tnl tnlVar = this.a;
        ankt anktVar = tlrVar.b;
        final ankt f = tnlVar.f();
        final ankt d = this.a.d(tnjVar, tlrVar.b);
        toh tohVar = this.c;
        tnjVar.b();
        final ankt q = anlz.q(null);
        final tmf tmfVar = tnjVar.d().a;
        final ArrayList arrayList = new ArrayList();
        tohVar.a.a(tmfVar, tmfVar.d, null, arrayList);
        final ArrayList arrayList2 = new ArrayList();
        tohVar.b.a(tmfVar, tmfVar.d, null, arrayList2);
        final ankt a = anlz.l(amtf.b(arrayList, arrayList2)).a(new Callable() { // from class: tog
            @Override // java.util.concurrent.Callable
            public final Object call() {
                tnj tnjVar2 = tnj.this;
                tmf tmfVar2 = tmfVar;
                List<ankt> list = arrayList;
                List<ankt> list2 = arrayList2;
                ankt anktVar2 = q;
                aopa createBuilder = anew.a.createBuilder();
                angg f2 = tnjVar2.f();
                createBuilder.copyOnWrite();
                anew anewVar = (anew) createBuilder.instance;
                f2.getClass();
                anewVar.c = f2;
                anewVar.b |= 1;
                if (!tnjVar2.g()) {
                    angg l = tqj.l(tnjVar2, true);
                    aqxo.z(l != null, "No Parent Event");
                    createBuilder.copyOnWrite();
                    anew anewVar2 = (anew) createBuilder.instance;
                    l.getClass();
                    anewVar2.e = l;
                    anewVar2.b |= 2;
                }
                angf angfVar = tnjVar2.e().d;
                if (angfVar == null) {
                    angfVar = angf.a;
                }
                aopc aopcVar = (aopc) anfh.a.createBuilder();
                aopcVar.copyOnWrite();
                anfh anfhVar = (anfh) aopcVar.instance;
                angfVar.getClass();
                anfhVar.c = angfVar;
                anfhVar.b |= 1;
                int d2 = anhe.d(tmfVar2.c);
                if (d2 == 0) {
                    d2 = 1;
                }
                aopcVar.copyOnWrite();
                anfh anfhVar2 = (anfh) aopcVar.instance;
                anfhVar2.b |= 16;
                anfhVar2.e = d2 - 1;
                int d3 = anhe.d(tmfVar2.c);
                if (d3 == 0) {
                    d3 = 1;
                }
                aopcVar.copyOnWrite();
                anfh anfhVar3 = (anfh) aopcVar.instance;
                anfhVar3.b |= 16;
                anfhVar3.e = d3 - 1;
                for (Integer num : tmfVar2.d) {
                    switch (num.intValue()) {
                        case 100000001:
                            int b = anhc.b(((tne) tmfVar2.qm(tnd.a)).b);
                            if (b == 0) {
                                b = 1;
                            }
                            aopcVar.copyOnWrite();
                            anfh anfhVar4 = (anfh) aopcVar.instance;
                            anfhVar4.b |= 32;
                            anfhVar4.f = b - 1;
                            break;
                        case 100000002:
                            int c2 = anhc.c(((anhb) tmfVar2.qm(tnd.b)).b);
                            if (c2 == 0) {
                                c2 = 1;
                            }
                            aopcVar.copyOnWrite();
                            anfh anfhVar5 = (anfh) aopcVar.instance;
                            anfhVar5.b |= 64;
                            anfhVar5.g = c2 - 1;
                            break;
                        case 100000003:
                            int i = ((tnv) tmfVar2.qm(toi.b)).b;
                            aopcVar.copyOnWrite();
                            anfh anfhVar6 = (anfh) aopcVar.instance;
                            anfhVar6.b |= 128;
                            anfhVar6.h = i;
                            break;
                    }
                }
                aopc aopcVar2 = (aopc) anev.a.createBuilder();
                aopg aopgVar = anez.b;
                aopa createBuilder2 = anex.a.createBuilder();
                aopa createBuilder3 = aney.a.createBuilder();
                long c3 = tnjVar2.c();
                createBuilder3.copyOnWrite();
                aney aneyVar = (aney) createBuilder3.instance;
                aneyVar.b |= 1;
                aneyVar.c = c3;
                aney aneyVar2 = (aney) createBuilder3.mo39build();
                createBuilder2.copyOnWrite();
                anex anexVar = (anex) createBuilder2.instance;
                aneyVar2.getClass();
                anexVar.c = aneyVar2;
                anexVar.b |= 1;
                aopcVar2.e(aopgVar, (anex) createBuilder2.mo39build());
                if (!list.isEmpty()) {
                    for (ankt anktVar3 : list) {
                        ((tno) anlz.y(anktVar3)).a(aopcVar2);
                    }
                }
                aopcVar.copyOnWrite();
                anfh anfhVar7 = (anfh) aopcVar.instance;
                anev anevVar = (anev) aopcVar2.mo39build();
                anevVar.getClass();
                anfhVar7.j = anevVar;
                anfhVar7.b |= 16384;
                if (!list2.isEmpty()) {
                    for (ankt anktVar4 : list2) {
                        ((tno) anlz.y(anktVar4)).a(aopcVar);
                    }
                }
                aopc[] aopcVarArr = (aopc[]) anlz.y(anktVar2);
                if (aopcVarArr != null) {
                    for (aopc aopcVar3 : aopcVarArr) {
                        aopcVar.copyOnWrite();
                        anfh anfhVar8 = (anfh) aopcVar.instance;
                        anfi anfiVar = (anfi) aopcVar3.mo39build();
                        anfiVar.getClass();
                        aopu aopuVar = anfhVar8.i;
                        if (!aopuVar.c()) {
                            anfhVar8.i = aopi.mutableCopy(aopuVar);
                        }
                        anfhVar8.i.add(anfiVar);
                    }
                }
                anfh anfhVar9 = (anfh) aopcVar.mo39build();
                createBuilder.copyOnWrite();
                anew anewVar3 = (anew) createBuilder.instance;
                anfhVar9.getClass();
                anewVar3.f = anfhVar9;
                anewVar3.b |= 16;
                return (anew) createBuilder.mo39build();
            }
        }, anjk.a);
        return anlz.m(c, a, f, d).b(ammo.b(new aniq() { // from class: tnw
            @Override // defpackage.aniq
            public final ankt a() {
                tnx tnxVar = tnx.this;
                tnj tnjVar2 = tnjVar;
                String str = e;
                ankt anktVar2 = c;
                ankt anktVar3 = a;
                ankt anktVar4 = d;
                ankt anktVar5 = f;
                tlr tlrVar2 = tlrVar;
                tnxVar.a.a(tnjVar2);
                tlu tluVar = tnxVar.b;
                tls a2 = tlt.a();
                a2.a = str;
                a2.b((aoqu) anlz.y(anktVar2));
                a2.b = (anew) anlz.y(anktVar3);
                a2.d = (int[]) anlz.y(anktVar4);
                a2.c = (int[]) anlz.y(anktVar5);
                tnxVar.a.g(tnjVar2);
                a2.c();
                tnxVar.a.b(tnjVar2);
                return tluVar.b(a2.a(), tlrVar2.b);
            }
        }), anjk.a);
    }

    @Override // defpackage.tlo
    public final Set b() {
        return amvn.r(tnj.class);
    }
}
