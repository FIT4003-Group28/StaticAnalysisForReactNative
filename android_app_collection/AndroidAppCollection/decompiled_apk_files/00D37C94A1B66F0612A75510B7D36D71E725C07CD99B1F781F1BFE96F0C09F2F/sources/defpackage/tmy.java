package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tmy  reason: default package */
/* loaded from: classes4.dex */
public final class tmy {
    public final tln a;
    public final snc c;
    public final tmr d = new tmx(this);
    public int e = 0;
    public Runnable f = null;
    public Runnable g = null;
    public final tnb b = new tnb();

    public tmy(tln tlnVar, snc sncVar) {
        this.a = tlnVar;
        this.c = sncVar;
    }

    public final void a() {
        this.f = null;
        tnb tnbVar = this.b;
        if (!tnbVar.c.isEmpty() || !tnbVar.a.isEmpty() || !tnbVar.b.isEmpty() || !tnbVar.e.isEmpty()) {
            amlp l = amna.l("GIL:AutoProcessBatch");
            try {
                this.a.c(new tlm() { // from class: tmu
                    /* JADX WARN: Finally extract failed */
                    @Override // defpackage.tlm
                    public final List a() {
                        int i;
                        tmy tmyVar = tmy.this;
                        tnb tnbVar2 = tmyVar.b;
                        amlp l2 = amna.l("GIL:CreateInsertGrafts");
                        try {
                            for (tmb tmbVar : tnbVar2.a) {
                                if (tmbVar.c == -1) {
                                    tnbVar2.b(tmbVar);
                                }
                            }
                            tnbVar2.a.clear();
                            for (tmb tmbVar2 : tnbVar2.d) {
                                tmbVar2.c = -1;
                            }
                            tnbVar2.d.clear();
                            l2.close();
                            amlp l3 = amna.l("GIL:CreateVisibilityGrafts");
                            try {
                                Iterator it = tnbVar2.b.iterator();
                                while (true) {
                                    i = 1;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    tmb tmbVar3 = (tmb) it.next();
                                    aqxo.B(tmbVar3.c(), "Not impressed: %s", tmbVar3);
                                    int d = tmbVar3.d();
                                    aopc aopcVar = tmbVar3.f;
                                    int f = anhg.f(((tmh) aopcVar.instance).e);
                                    if (f == 0) {
                                        f = 1;
                                    }
                                    if (f != d) {
                                        int f2 = anhg.f(((tmh) aopcVar.instance).e);
                                        if (f2 == 0) {
                                            f2 = 1;
                                        }
                                        int i2 = f2 - 1;
                                        if (i2 != 2 && i2 != 4) {
                                            i = d;
                                        } else if (d != 2) {
                                            aqxo.z(false, "Repressed VE was visible.");
                                        }
                                        aopcVar.copyOnWrite();
                                        tmh tmhVar = (tmh) aopcVar.instance;
                                        tmhVar.e = i - 1;
                                        tmhVar.b = 2 | tmhVar.b;
                                        ArrayList arrayList = new ArrayList();
                                        tnk.f(tmbVar3, arrayList);
                                        tnbVar2.a(arrayList, 0).f(tmbVar3, arrayList);
                                    }
                                }
                                tnbVar2.b.clear();
                                l3.close();
                                if (!tnbVar2.e.isEmpty()) {
                                    l3 = amna.l("GIL:CreateRemoveGrafts");
                                    try {
                                        for (Map.Entry entry : tnbVar2.e.entrySet()) {
                                            Collection<tmh> collection = (Collection) entry.getValue();
                                            for (tmh tmhVar2 : collection) {
                                                tmb tmbVar4 = (tmb) entry.getKey();
                                                int f3 = anhg.f(tmhVar2.e);
                                                if (f3 != 0 && f3 != i) {
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                aopc aopcVar2 = (aopc) tmhVar2.mo52toBuilder();
                                                aopcVar2.copyOnWrite();
                                                tmh tmhVar3 = (tmh) aopcVar2.instance;
                                                tmhVar3.e = i;
                                                tmhVar3.b |= 2;
                                                arrayList2.add((tmh) aopcVar2.mo39build());
                                                if (tmbVar4 != null) {
                                                    tnk.f(tmbVar4, arrayList2);
                                                }
                                                tnbVar2.a(arrayList2, 0).e(new tnh(3, arrayList2, -1));
                                                i = 1;
                                            }
                                            collection.clear();
                                            tnbVar2.f = collection;
                                            i = 1;
                                        }
                                        l3.close();
                                        tnbVar2.e.clear();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (tmyVar.e >= 0) {
                                    return tmyVar.b.c();
                                }
                                if (tmyVar.g != null) {
                                    return null;
                                }
                                tmyVar.g = new tmw(tmyVar, 1);
                                uwp.g(tmyVar.g, -tmyVar.e);
                                return null;
                            } finally {
                                try {
                                    l3.close();
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                l2.close();
                            } catch (Throwable unused2) {
                            }
                            throw th2;
                        }
                    }
                });
                l.close();
            } catch (Throwable th) {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }

    public final void b() {
        if (this.f != null) {
            return;
        }
        tmw tmwVar = new tmw(this);
        this.f = tmwVar;
        int i = this.e;
        if (i > 0) {
            uwp.g(tmwVar, i);
        } else {
            uwp.h(tmwVar);
        }
    }
}
