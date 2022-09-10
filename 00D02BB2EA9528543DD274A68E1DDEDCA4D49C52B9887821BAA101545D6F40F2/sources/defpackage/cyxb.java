package defpackage;

import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.Phone;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cyxb  reason: default package */
/* loaded from: classes5.dex */
public final class cyxb {
    public static cywn a(int i) {
        if (i != 0) {
            if (i == 1) {
                return dyaq.d() ? cywv.a : cyww.a;
            } else if (i == 2) {
                return cywx.a;
            } else {
                if (i == 3) {
                    return dyaq.c() ? cyws.a : dyaq.d() ? cywt.a : cywu.a;
                }
                StringBuilder sb = new StringBuilder(43);
                sb.append("Not a valid SessionContextRule: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return cywo.a;
    }

    public static boolean b(cywm cywmVar, cytq cytqVar) {
        dcdc<dsgt> d = cywmVar.d(cytqVar.f.l);
        int size = d.size();
        for (int i = 0; i < size; i++) {
            dbsg<cyfx> g = cywmVar.g(d.get(i));
            if (g.a() && g.b().a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcka<String, cyep> c(List<ContactMethodField> list) {
        Iterable B;
        dbyv O = dbyv.O(list.size(), 2);
        for (ContactMethodField contactMethodField : list) {
            cyep cyepVar = cyep.EMAIL;
            int ordinal = contactMethodField.SA().ordinal();
            if (ordinal == 0) {
                B = dcep.B(contactMethodField.h().a().toString());
            } else if (ordinal == 1) {
                Phone i = contactMethodField.i();
                dcen N = dcep.N();
                N.b(i.a().toString());
                CharSequence d = i.d();
                if (d != null) {
                    N.b(d.toString());
                }
                B = N.f();
            } else if (ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                B = dcmr.a;
            } else {
                B = dcep.B(contactMethodField.j().a().toString());
            }
            dcpd it = B.iterator();
            while (it.hasNext()) {
                O.n((String) it.next(), contactMethodField.SA());
            }
        }
        return O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(dsgt dsgtVar, dcka<String, cyep> dckaVar) {
        int i = dsgtVar.b;
        if (i == 2) {
            return dckaVar.F(((dshb) dsgtVar.c).b, cyep.EMAIL);
        }
        if (i == 3) {
            dsic dsicVar = (dsic) dsgtVar.c;
            return dckaVar.F(dsicVar.c, cyep.PHONE) || dckaVar.F(dsicVar.b, cyep.PHONE);
        } else if (i != 4) {
            return false;
        } else {
            dshi dshiVar = (dshi) dsgtVar.c;
            int i2 = dshiVar.b;
            if (i2 == 2) {
                return g(dckaVar, (String) dshiVar.c, dcep.C(cyep.IN_APP_EMAIL, cyep.IN_APP_NOTIFICATION_TARGET));
            }
            if (i2 == 3) {
                return g(dckaVar, (String) dshiVar.c, dcep.C(cyep.IN_APP_PHONE, cyep.IN_APP_NOTIFICATION_TARGET));
            }
            if ((dshiVar.a & 1) != 0) {
                return g(dckaVar, dshiVar.d, dcep.C(cyep.IN_APP_GAIA, cyep.IN_APP_NOTIFICATION_TARGET));
            }
            return false;
        }
    }

    public static void e(List<cywm> list, cytq cytqVar) {
        dcka<String, cyep> c = c(cytqVar.d.a());
        for (cywm cywmVar : list) {
            dcdc<dsgt> d = cywmVar.d(cytqVar.f.l);
            int size = d.size();
            for (int i = 0; i < size; i++) {
                dsgt dsgtVar = d.get(i);
                if (d(dsgtVar, c)) {
                    cywmVar.i(dsgtVar, cywz.a);
                }
            }
        }
    }

    public static void f(cyfv cyfvVar) {
        cyfvVar.c().b = true;
    }

    private static boolean g(dcka<String, cyep> dckaVar, String str, final Set<cyep> set) {
        if (dckaVar.m(str)) {
            List f = ((dbxj) dckaVar).f(str);
            set.getClass();
            return dcft.m(f, new dbsl(set) { // from class: cywr
                private final Set a;

                {
                    this.a = set;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.contains((cyep) obj);
                }
            }).a();
        }
        return false;
    }
}
