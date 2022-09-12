package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cywm  reason: default package */
/* loaded from: classes5.dex */
public final class cywm {
    public final dsgk a;
    public final Map<dssj, cyfz> b;
    public int c;

    public final dbsg<dsgt> a() {
        dsia dsiaVar;
        dsia dsiaVar2;
        dsgk dsgkVar = this.a;
        if (dsgkVar.a == 1) {
            if (((dsia) dsgkVar.b).c.size() == 1) {
                dsgk dsgkVar2 = this.a;
                if (dsgkVar2.a == 1) {
                    dsiaVar2 = (dsia) dsgkVar2.b;
                } else {
                    dsiaVar2 = dsia.e;
                }
                return dbsg.i(dsiaVar2.c.get(0));
            }
            dsgk dsgkVar3 = this.a;
            if (dsgkVar3.a == 1) {
                dsiaVar = (dsia) dsgkVar3.b;
            } else {
                dsiaVar = dsia.e;
            }
            for (dsgt dsgtVar : dsiaVar.c) {
                dsgv dsgvVar = dsgtVar.d;
                if (dsgvVar == null) {
                    dsgvVar = dsgv.f;
                }
                if (dsgvVar.e) {
                    return dbsg.i(dsgtVar);
                }
            }
        }
        return dbpy.a;
    }

    public final dcdc<dsgt> d(final Set<cydt> set) {
        return dcdc.q(dcft.i(k(), new dbsl(set) { // from class: cywj
            private final Set a;

            {
                this.a = set;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return cywm.c(this.a, (dsgt) obj);
            }
        }));
    }

    public final void e(cygl cyglVar) {
        dcdc<dsgt> k = k();
        int size = k.size();
        for (int i = 0; i < size; i++) {
            dsgt dsgtVar = k.get(i);
            cyfv j = j(dsgtVar);
            j.c().c.add(cyglVar);
            h(dsgtVar, j);
        }
    }

    public final dbsg<cyfz> f(dssj dssjVar) {
        dbsk.t(dssjVar, "Metadata key cannot be null.");
        return dbsg.j(this.b.get(dssjVar));
    }

    public final dbsg<cyfx> g(dssj dssjVar) {
        dbsg<cyfz> f = f(dssjVar);
        return f.a() ? dbsg.j(f.b().b()) : dbpy.a;
    }

    public final void h(dssj dssjVar, cyfz cyfzVar) {
        dbsk.t(dssjVar, "Metadata key cannot be null.");
        dbsk.t(cyfzVar, "Metadata cannot be null. To remove metadata for a key, call ::removeMetadata.");
        this.b.put(dssjVar, cyfzVar.a());
    }

    public final void i(dssj dssjVar, dbrn<cyfv, ? extends cyfz> dbrnVar) {
        dbsk.t(dssjVar, "Metadata key cannot be null.");
        dbsk.t(dbrnVar, "Updater function cannot be null.");
        h(dssjVar, dbrnVar.a(j(dssjVar)).a());
    }

    public final cyfv j(dssj dssjVar) {
        dbsk.t(dssjVar, "Metadata key cannot be null.");
        return (cyfv) f(dssjVar).h(cywk.a).e(cywl.a);
    }

    public static boolean c(Set<cydt> set, dsgt dsgtVar) {
        int a = dsgs.a(dsgtVar.b);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                return set.contains(cydt.EMAIL);
            }
            if (i == 1) {
                return set.contains(cydt.PHONE_NUMBER);
            }
            if (i == 2) {
                return set.contains(cydt.IN_APP_NOTIFICATION_TARGET);
            }
            return false;
        }
        throw null;
    }

    public cywm(dsgk dsgkVar) {
        dsia dsiaVar;
        int size;
        this.a = dsgkVar;
        int a = dsgj.a(dsgkVar.a);
        int i = a - 1;
        if (a == 0) {
            throw null;
        }
        if (i != 0) {
            size = 0;
        } else {
            if (dsgkVar.a == 1) {
                dsiaVar = (dsia) dsgkVar.b;
            } else {
                dsiaVar = dsia.e;
            }
            size = dsiaVar.c.size();
        }
        this.b = dcjz.f(size);
    }

    public final dbsg<dsgt> b(dshi dshiVar) {
        dsia dsiaVar;
        dsia dsiaVar2;
        dsic dsicVar;
        if (this.a.a == 1) {
            int a = dshh.a(dshiVar.b);
            int i = a - 1;
            if (a == 0) {
                throw null;
            }
            if (i == 0) {
                dsgk dsgkVar = this.a;
                if (dsgkVar.a == 1) {
                    dsiaVar = (dsia) dsgkVar.b;
                } else {
                    dsiaVar = dsia.e;
                }
                for (dsgt dsgtVar : dsiaVar.c) {
                    if (dsgtVar.b == 2) {
                        if (((dshb) dsgtVar.c).b.equals(dshiVar.b == 2 ? (String) dshiVar.c : "")) {
                            return dbsg.i(dsgtVar);
                        }
                    }
                }
            } else if (i == 1) {
                dsgk dsgkVar2 = this.a;
                if (dsgkVar2.a == 1) {
                    dsiaVar2 = (dsia) dsgkVar2.b;
                } else {
                    dsiaVar2 = dsia.e;
                }
                for (dsgt dsgtVar2 : dsiaVar2.c) {
                    if (dsgtVar2.b == 3) {
                        if (!((dsic) dsgtVar2.c).b.equals(dshiVar.b == 3 ? (String) dshiVar.c : "")) {
                            if (dsgtVar2.b == 3) {
                                dsicVar = (dsic) dsgtVar2.c;
                            } else {
                                dsicVar = dsic.d;
                            }
                            if (dsicVar.c.equals(dshiVar.b == 3 ? (String) dshiVar.c : "")) {
                            }
                        }
                        return dbsg.i(dsgtVar2);
                    }
                }
            }
        }
        return dbpy.a;
    }

    private final dcdc<dsgt> k() {
        dsia dsiaVar;
        dshf dshfVar;
        dsgq dsgqVar;
        int a = dsgj.a(this.a.a);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                dsgk dsgkVar = this.a;
                if (dsgkVar.a == 1) {
                    dsiaVar = (dsia) dsgkVar.b;
                } else {
                    dsiaVar = dsia.e;
                }
                return dcdc.r(dsiaVar.c);
            } else if (i == 1) {
                dccx F = dcdc.F();
                dsgk dsgkVar2 = this.a;
                if (dsgkVar2.a == 2) {
                    dshfVar = (dshf) dsgkVar2.b;
                } else {
                    dshfVar = dshf.e;
                }
                for (dsia dsiaVar2 : dshfVar.b) {
                    F.i(dsiaVar2.c);
                }
                return F.f();
            } else {
                if (i == 2) {
                    dsgk dsgkVar3 = this.a;
                    if (dsgkVar3.a == 3) {
                        dsgqVar = (dsgq) dsgkVar3.b;
                    } else {
                        dsgqVar = dsgq.b;
                    }
                    return dcdc.r(dsgqVar.a);
                }
                return dcdc.e();
            }
        }
        throw null;
    }
}
