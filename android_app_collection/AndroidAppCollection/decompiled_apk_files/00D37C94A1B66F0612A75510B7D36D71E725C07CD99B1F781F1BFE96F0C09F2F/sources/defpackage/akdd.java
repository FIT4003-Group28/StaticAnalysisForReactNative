package defpackage;

import com.facebook.yoga.YogaEdge;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akdd  reason: default package */
/* loaded from: classes.dex */
public final class akdd extends lg {
    public final dhk a;
    public final acti b;
    public final boolean c;
    public final boolean d;
    public final ten e;
    public final tes f;
    public final tdu g;
    public aypf h;
    public final boolean i;
    public final float j;
    public final ya k;
    public final Object l;
    public final akcr m;
    public final swq n;
    private final dlc o;
    private final ajsf p;
    private final boolean q;
    private final akcp r;
    private final boolean s;

    public akdd(dhk dhkVar, dlc dlcVar, ajsf ajsfVar, swq swqVar, acti actiVar, boolean z, boolean z2, boolean z3, ten tenVar, boolean z4, tdu tduVar, boolean z5, float f, akcr akcrVar, ya yaVar, tes tesVar, Object obj) {
        this.a = dhkVar;
        this.o = dlcVar;
        this.p = ajsfVar;
        this.n = swqVar;
        this.b = actiVar;
        this.c = z;
        this.q = z2;
        this.d = z3;
        this.e = tenVar;
        this.f = tesVar;
        this.r = new akcp(swqVar, z2);
        this.s = z4;
        this.g = tduVar;
        this.i = z5;
        this.j = f;
        this.m = akcrVar;
        this.k = yaVar;
        this.l = obj;
    }

    private final dlj r(Object obj) {
        cyr a;
        acuq acuqVar = null;
        if (!(obj instanceof ajhh)) {
            boolean z = obj instanceof ajqo;
            if (z) {
                ajqo ajqoVar = (ajqo) obj;
                for (Object obj2 : new ArrayList(ajqoVar.b)) {
                    if (obj2 == null || (obj2 instanceof ajhh)) {
                    }
                }
                final akcp akcpVar = this.r;
                dhk dhkVar = this.a;
                final acti actiVar = this.b;
                aypf aypfVar = this.h;
                if (!z) {
                    return null;
                }
                final aypf aypfVar2 = new aypf();
                ddf a2 = ddg.a(dhkVar);
                a2.E(YogaEdge.LEFT, ajqoVar.e);
                a2.E(YogaEdge.RIGHT, ajqoVar.f);
                a2.E(YogaEdge.TOP, ajqoVar.c);
                a2.E(YogaEdge.BOTTOM, ajqoVar.d);
                int i = ajqoVar.a;
                int i2 = 0;
                while (i2 < i) {
                    final ajhh ajhhVar = (ajhh) ajqoVar.b(i2);
                    int i3 = i2 < i + (-1) ? ajqoVar.g : 0;
                    if (ajhhVar != null) {
                        tfm tfmVar = new tfm() { // from class: akco
                            @Override // defpackage.tfm
                            public final cyr a(cyv cyvVar, tda tdaVar) {
                                acuq acuqVar2;
                                akcp akcpVar2 = akcp.this;
                                ajhh ajhhVar2 = ajhhVar;
                                acti actiVar2 = actiVar;
                                aypf aypfVar3 = aypfVar2;
                                swq swqVar = akcpVar2.b;
                                tcz a3 = tda.a();
                                a3.l = amuk.r(ajjh.c(ajhhVar2));
                                if (akcpVar2.a) {
                                    cyvVar.a();
                                    acuqVar2 = new acuq(actiVar2);
                                } else {
                                    acuqVar2 = null;
                                }
                                a3.b(true);
                                a3.k = acuqVar2;
                                return swqVar.b(cyvVar, a3.a(), ajhhVar2, ajjk.v(actiVar2), aypfVar3);
                            }
                        };
                        tgb a3 = tgd.a(dhkVar);
                        a3.e(tfmVar);
                        a3.S(100.0f / i);
                        a3.L(YogaEdge.END, i3);
                        a2.g(a3.a().j());
                    } else {
                        cyk a4 = cyl.a(dhkVar);
                        a4.S(100.0f / i);
                        a4.L(YogaEdge.END, i3);
                        a2.g(a4.a);
                    }
                    i2++;
                }
                if (aypfVar != null) {
                    aypfVar.d(aypfVar2);
                }
                return new tfs().a(a2.a, aypfVar2);
            }
            return dkn.a;
        }
        final ajhh ajhhVar2 = (ajhh) obj;
        final aypf aypfVar3 = new aypf();
        final int a5 = this.g.a();
        tdt tdtVar = new tdt(String.valueOf(a5));
        if (this.q) {
            acti actiVar2 = this.b;
            this.a.a();
            acuqVar = new acuq(actiVar2);
        }
        final acuq acuqVar2 = acuqVar;
        tfm tfmVar2 = new tfm() { // from class: akdc
            @Override // defpackage.tfm
            public final cyr a(cyv cyvVar, tda tdaVar) {
                akdd akddVar = akdd.this;
                int i4 = a5;
                ajhh ajhhVar3 = ajhhVar2;
                tee teeVar = acuqVar2;
                aypf aypfVar4 = aypfVar3;
                swq swqVar = akddVar.n;
                dhk dhkVar2 = akddVar.a;
                tcz e = tdaVar.e();
                e.d = akddVar.g.c(i4);
                e.c(akddVar.j);
                e.r = akddVar.m;
                e.g = akddVar.k;
                boolean z2 = akddVar.i;
                e.e(z2);
                if (z2) {
                    e.f = new ConcurrentHashMap();
                }
                e.q = new AtomicReference(akddVar.f);
                e.l = amuk.r(ajjh.c(ajhhVar3));
                tdy a6 = tdz.a(akddVar.n.a);
                a6.e = akddVar.l;
                a6.b(akddVar.c);
                a6.d = teeVar;
                tem temVar = new tem(akddVar.e);
                boolean z3 = true;
                if (!akddVar.d && !ajhhVar3.b().g) {
                    z3 = false;
                }
                temVar.c(z3);
                a6.f = temVar.a();
                e.p = a6.a();
                return swqVar.b(dhkVar2, e.a(), ajhhVar3, ajjk.v(akddVar.b), aypfVar4);
            }
        };
        if (this.s) {
            dhk dhkVar2 = this.a;
            akct akctVar = new akct();
            akct.d(akctVar, dhkVar2, new akcv());
            akctVar.a.a = tfmVar2;
            akctVar.d.set(0);
            a = akctVar.a();
        } else {
            tgb a6 = tgd.a(this.a);
            a6.e(tfmVar2);
            a = a6.a();
        }
        aypf aypfVar4 = this.h;
        if (aypfVar4 != null) {
            aypfVar4.d(aypfVar3);
        }
        aflw aflwVar = new aflw();
        aflwVar.g(tdt.class, tdtVar);
        tfs tfsVar = new tfs();
        tfsVar.a = aflwVar;
        return tfsVar.a(a, aypfVar3);
    }

    @Override // defpackage.lg
    public final void c() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(this.p.b());
        int b = this.p.b();
        for (int i = 0; i < b; i++) {
            arrayList2.add(r(this.p.getItem(i)));
        }
        dlc dlcVar = this.o;
        synchronized (dlcVar) {
            if (dlcVar.z) {
                throw new RuntimeException("Trying to do a sync replaceAll when using asynchronous mutations!");
            }
            arrayList = new ArrayList();
            int size = dlcVar.b.size();
            int size2 = arrayList2.size();
            if (size > size2) {
                while (true) {
                    size--;
                    if (size < size2) {
                        break;
                    }
                    arrayList.add((diz) dlcVar.b.remove(size));
                }
            }
            for (int i2 = 0; i2 < size2; i2++) {
                dlj dljVar = (dlj) arrayList2.get(i2);
                if (i2 >= dlcVar.b.size()) {
                    dlcVar.b.add(i2, dlcVar.p(dljVar));
                } else {
                    diz dizVar = (diz) dlcVar.b.get(i2);
                    if (!dizVar.d().k() || !dljVar.k()) {
                        arrayList.add(dizVar);
                        dlcVar.b.set(i2, dlcVar.p(dljVar));
                    } else {
                        dizVar.n(dljVar);
                    }
                }
                dlcVar.F.a(dljVar);
            }
        }
        dlcVar.e.mr();
        dlcVar.D.c(true);
        dlcVar.E(arrayList);
        this.o.P(true, null);
    }

    @Override // defpackage.lg
    public final void d(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            arrayList.add(r(this.p.getItem(i4)));
        }
        this.o.M(i, arrayList);
        this.o.P(true, null);
    }

    @Override // defpackage.lg
    public final void f(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            arrayList.add(r(this.p.getItem(i4)));
        }
        this.o.w(i, arrayList);
        this.o.P(true, null);
    }

    @Override // defpackage.lg
    public final void g(int i, int i2) {
        this.o.I(i, i2);
        this.o.P(true, null);
    }

    @Override // defpackage.lg
    public final void h(int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i >= i2) {
            this.o.D(i, i2);
        } else {
            this.o.D(i, i2);
        }
        this.o.P(true, null);
    }
}
