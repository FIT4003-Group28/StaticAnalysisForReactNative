package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cytm  reason: default package */
/* loaded from: classes5.dex */
public final class cytm implements cyti {
    public final dcdc<cyuc> a;
    public final cyph b;
    public final Executor c;
    private final dehp d;
    private final czct e;

    public cytm(List<cyuc> list, cyph cyphVar, dehp dehpVar, czct czctVar) {
        this.b = cyphVar;
        this.d = dehpVar;
        this.e = czctVar;
        this.a = dcdc.r(list);
        this.c = dehx.b(dehpVar);
    }

    @Override // defpackage.cyti
    public final void a(@dzsi final cytq cytqVar) {
        if (cytqVar == null) {
            return;
        }
        cyvg cyvgVar = new cyvg();
        for (final int i = 0; i < this.a.size(); i++) {
            cyuc cyucVar = this.a.get(i);
            cyem a = cyvgVar.a(new cyem(this, cytqVar, i) { // from class: cytj
                private final cytm a;
                private final cytq b;
                private final int c;

                {
                    this.a = this;
                    this.b = cytqVar;
                    this.c = i;
                }

                @Override // defpackage.cyem
                public final void a(Object obj) {
                    cytm cytmVar = this.a;
                    final cytq cytqVar2 = this.b;
                    final cyts cytsVar = (cyts) obj;
                    final boolean z = this.c == cytmVar.a.size() + (-1);
                    cytmVar.c.execute(new Runnable(cytqVar2, cytsVar, z) { // from class: cytk
                        private final cytq a;
                        private final cyts b;
                        private final boolean c;

                        {
                            this.a = cytqVar2;
                            this.b = cytsVar;
                            this.c = z;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            dcdc<cywm> dcdcVar;
                            int i2;
                            int i3;
                            String trim;
                            cytq cytqVar3 = this.a;
                            cyts cytsVar2 = this.b;
                            boolean z2 = this.c;
                            if (cytqVar3.p.b()) {
                                return;
                            }
                            dcdc e = dcdc.e();
                            int c = cytqVar3.f.c() - cytqVar3.n;
                            if (!cytsVar2.b.isEmpty() && c > 0) {
                                dbtp b = cytqVar3.j.b();
                                dccx F = dcdc.F();
                                dcdc<cywm> dcdcVar2 = cytsVar2.b;
                                int size = dcdcVar2.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    cywm cywmVar = dcdcVar2.get(i4);
                                    int a2 = dsgj.a(cywmVar.a.a);
                                    int i5 = a2 - 1;
                                    if (a2 == 0) {
                                        throw null;
                                    }
                                    if (i5 != 0) {
                                        if (i5 == 1 && cytqVar3.f.l.contains(cydt.GROUP)) {
                                            HashSet<String> hashSet = cytqVar3.o;
                                            dsgk dsgkVar = cywmVar.a;
                                            if (hashSet.add((dsgkVar.a == 2 ? (dshf) dsgkVar.b : dshf.e).d)) {
                                                F.g(cywmVar);
                                            }
                                        }
                                        dcdcVar = dcdcVar2;
                                        i2 = size;
                                    } else {
                                        dcdc<dsgt> d = cywmVar.d(cytqVar3.f.l);
                                        int size2 = d.size();
                                        int i6 = 0;
                                        boolean z3 = false;
                                        while (i6 < size2) {
                                            dsgt dsgtVar = d.get(i6);
                                            HashSet<String> hashSet2 = cytqVar3.o;
                                            int a3 = dsgs.a(dsgtVar.b);
                                            dcdc<cywm> dcdcVar3 = dcdcVar2;
                                            int i7 = a3 - 1;
                                            if (a3 == 0) {
                                                throw null;
                                            }
                                            if (i7 == 0) {
                                                i3 = size;
                                                trim = (dsgtVar.b == 2 ? (dshb) dsgtVar.c : dshb.f).b.toLowerCase(Locale.ROOT).trim();
                                            } else if (i7 == 1) {
                                                i3 = size;
                                                trim = ((dsgtVar.b == 3 ? (dsic) dsgtVar.c : dsic.d).a & 2) != 0 ? (dsgtVar.b == 3 ? (dsic) dsgtVar.c : dsic.d).c : (dsgtVar.b == 3 ? (dsic) dsgtVar.c : dsic.d).b;
                                            } else if (i7 != 2) {
                                                i3 = size;
                                                trim = "";
                                            } else if (((dsgtVar.b == 4 ? (dshi) dsgtVar.c : dshi.e).a & 1) != 0) {
                                                trim = (dsgtVar.b == 4 ? (dshi) dsgtVar.c : dshi.e).d;
                                                i3 = size;
                                            } else {
                                                i3 = size;
                                                if ((dsgtVar.b == 4 ? (dshi) dsgtVar.c : dshi.e).b == 2) {
                                                    dshi dshiVar = dsgtVar.b == 4 ? (dshi) dsgtVar.c : dshi.e;
                                                    String valueOf = String.valueOf(dshiVar.b == 2 ? (String) dshiVar.c : "");
                                                    trim = valueOf.length() != 0 ? "iant:".concat(valueOf) : new String("iant:");
                                                } else if ((dsgtVar.b == 4 ? (dshi) dsgtVar.c : dshi.e).b == 3) {
                                                    dshi dshiVar2 = dsgtVar.b == 4 ? (dshi) dsgtVar.c : dshi.e;
                                                    String valueOf2 = String.valueOf(dshiVar2.b == 3 ? (String) dshiVar2.c : "");
                                                    trim = valueOf2.length() != 0 ? "iant:".concat(valueOf2) : new String("iant:");
                                                } else {
                                                    trim = "";
                                                }
                                            }
                                            z3 |= hashSet2.add(trim);
                                            i6++;
                                            dcdcVar2 = dcdcVar3;
                                            size = i3;
                                        }
                                        dcdcVar = dcdcVar2;
                                        i2 = size;
                                        if (z3) {
                                            F.g(cywmVar);
                                        }
                                    }
                                    i4++;
                                    dcdcVar2 = dcdcVar;
                                    size = i2;
                                }
                                dcdc f = F.f();
                                cypg.a(cytqVar3.j, 5, b, cytqVar3.k);
                                e = f.subList(0, Math.min(c, f.size()));
                                for (int i8 = 0; i8 < e.size(); i8++) {
                                    e.get(i8).c = cytqVar3.n + i8;
                                }
                                cytqVar3.n += e.size();
                            }
                            cydx c2 = cydx.c(cytsVar2.e, cytsVar2.d);
                            cytg m = cyth.m();
                            m.h(dcdc.e());
                            cytr b2 = cytsVar2.b();
                            b2.b(e);
                            cytc cytcVar = (cytc) m;
                            cytcVar.a = dbsg.j(b2.a());
                            cytcVar.b = c2;
                            m.d(z2);
                            int i9 = cytqVar3.r;
                            cytqVar3.r = i9 + 1;
                            m.b(i9);
                            m.f(cytqVar3.q);
                            m.g(cytqVar3);
                            m.i(cyfa.c(cytsVar2.e));
                            cytcVar.d = cytsVar2.a.f();
                            cytcVar.c = cytsVar2.c.f();
                            if (cytsVar2.a().a()) {
                                m.e(cytsVar2.a().b());
                            }
                            cytqVar3.e.a(m.a());
                            cytqVar3.q += e.size();
                        }
                    });
                }
            });
            dbtp b = this.b.b();
            dehn<cyts> a2 = cyucVar.a(cytqVar);
            cytqVar.p.c(a2);
            deha.q(a2, new cytl(this, cyucVar, cytqVar, b, a, a2), this.d);
        }
    }

    @Override // defpackage.cyti
    public final void b(cydz cydzVar) {
        dcdc<cyuc> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).d(cydzVar);
        }
    }

    @Override // defpackage.cyti
    public final dehn<Void> c() {
        ArrayList arrayList = new ArrayList();
        dcdc<cyuc> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(dcdcVar.get(i).c());
        }
        return deha.l(arrayList).b(defi.a(), dege.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01aa, code lost:
        if (defpackage.dbqa.e(r5, r4.c) != false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e1 A[LOOP:2: B:17:0x0074->B:93:0x01e1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cyts d(defpackage.cyts r27, defpackage.cytq r28) {
        /*
            Method dump skipped, instructions count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cytm.d(cyts, cytq):cyts");
    }
}
