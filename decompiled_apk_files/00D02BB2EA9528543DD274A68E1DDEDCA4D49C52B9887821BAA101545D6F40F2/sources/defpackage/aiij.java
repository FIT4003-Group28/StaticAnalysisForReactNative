package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: aiij  reason: default package */
/* loaded from: classes2.dex */
public final class aiij implements aihc<aimj, aiig, aiik> {
    public static aiig f(Profile profile, eapd eapdVar) {
        return new aiie(eapdVar, profile, true);
    }

    public static aiig g(Profile profile, eapd eapdVar) {
        return new aiie(eapdVar, profile, false);
    }

    public static dbsg<Profile> h(dqzv dqzvVar) {
        PersonId b = PersonId.b(dqzvVar);
        if (b == null || !b.c.equals(ahwj.GAIA)) {
            return dbpy.a;
        }
        ahwk g = Profile.g();
        ahuw ahuwVar = (ahuw) g;
        ahuwVar.a = b;
        ahuwVar.b = aikc.h(dbpy.a, dcdc.f(dqzvVar));
        ahuwVar.c = aikc.i(dbpy.a, dcdc.f(dqzvVar));
        ahuwVar.d = aikc.j(dbpy.a, dcdc.f(dqzvVar));
        return dbsg.i(g.a());
    }

    public static Profile i(aiml aimlVar) {
        ahwk g = Profile.g();
        ajja ajjaVar = aimlVar.b;
        if (ajjaVar == null) {
            ajjaVar = ajja.d;
        }
        PersonId j = PersonId.j(ajjaVar);
        dbsk.s(j);
        ahuw ahuwVar = (ahuw) g;
        ahuwVar.a = j;
        ahuwVar.b = m(aimlVar.c);
        ahuwVar.c = m(aimlVar.d);
        ahuwVar.d = m(aimlVar.e);
        ahuwVar.e = m(aimlVar.f);
        return g.a();
    }

    public static dbsg<String> j(String str) {
        return str.isEmpty() ? dbpy.a : dbsg.i(str);
    }

    private static Profile k(aiig aiigVar, aiig aiigVar2) {
        aiml i = aiigVar.i();
        dsqp dsqpVar = (dsqp) i.cu(5);
        dsqpVar.bC(i);
        aimk aimkVar = (aimk) dsqpVar;
        aimkVar.bC(aiigVar2.i());
        return i(aimkVar.bK());
    }

    private static dcdc<Profile> l(List<aiml> list, dbsl<aiml> dbslVar) {
        return dcdc.q(dcft.o(dcft.i(list, dbslVar), aiic.a));
    }

    private static dbsg<String> m(String str) {
        return str.isEmpty() ? dbpy.a : dbsg.i(str);
    }

    @Override // defpackage.aihc
    public final dssr<aimj> a() {
        return (dssr) aimj.b.cu(7);
    }

    @Override // defpackage.aihc
    public final dcdc<aiig> b(List<aiig> list) {
        aiig aiigVar;
        dcdc w = dcdc.w(aiia.a, list);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int size = w.size();
        for (int i = 0; i < size; i++) {
            aiig aiigVar2 = (aiig) w.get(i);
            PersonId a = aiigVar2.c.a();
            if (aiigVar2 instanceof aiid) {
                if (hashMap.containsKey(a)) {
                    hashMap.put(a, new aiid(aiigVar2.b, k((aiig) hashMap.get(a), aiigVar2)));
                } else {
                    hashMap.put(a, (aiid) aiigVar2);
                }
            } else if (aiigVar2 instanceof aiie) {
                if (hashMap2.containsKey(a)) {
                    hashMap2.put(a, new aiie(aiigVar2.b, k((aiig) hashMap2.get(a), aiigVar2), ((aiie) aiigVar2).a));
                } else {
                    hashMap2.put(a, (aiie) aiigVar2);
                }
            } else if (aiigVar2 instanceof aiii) {
                if (hashMap2.containsKey(a)) {
                    aiigVar = (aiig) hashMap2.get(a);
                } else {
                    aiigVar = (aiig) hashMap.get(a);
                }
                if (aiigVar != null) {
                    hashMap2.put(a, new aiie(aiigVar2.b, aiigVar.c, false));
                }
            } else if ((aiigVar2 instanceof aiih) || (aiigVar2 instanceof aiif)) {
                arrayList.add(aiigVar2);
                hashMap.remove(a);
                hashMap2.remove(a);
            }
        }
        arrayList.addAll(hashMap.values());
        arrayList.addAll(hashMap2.values());
        return dcdc.w(aiib.a, arrayList);
    }

    @Override // defpackage.aihc
    public final dcdc<aiig> c(List<dspd> list) {
        Object c;
        dbsg i;
        dccx F = dcdc.F();
        for (dspd dspdVar : list) {
            try {
                dsqa c2 = dsqa.c();
                aimp aimpVar = aimp.f;
                try {
                    dspj s = dspdVar.s();
                    dsqw dsqwVar = (dsqw) aimpVar.cu(4);
                    try {
                        try {
                            dstc b = dsst.a.b(dsqwVar);
                            b.f(dsqwVar, dspk.n(s), c2);
                            b.j(dsqwVar);
                            try {
                                s.b(0);
                                dsqw.cv(dsqwVar);
                                aimp aimpVar2 = (aimp) dsqwVar;
                                int a = aimo.a(aimpVar2.d);
                                if (a == 0) {
                                    a = 1;
                                }
                                int i2 = a - 1;
                                if (i2 == 1) {
                                    if (!aimpVar2.e) {
                                        c = aiie.c(aimpVar2);
                                    } else {
                                        c = aiii.c(aimpVar2);
                                    }
                                    i = dbsg.i(c);
                                } else if (i2 == 2) {
                                    i = dbsg.i(aiif.c(aimpVar2));
                                } else if (i2 == 3) {
                                    i = dbsg.i(aiie.c(aimpVar2));
                                } else if (i2 == 4) {
                                    i = dbsg.i(aiih.c(aimpVar2));
                                } else {
                                    i = dbsg.i(aiid.c(aimpVar2));
                                }
                                if (i.a()) {
                                    F.g((aiig) i.b());
                                }
                            } catch (dsrm e) {
                                throw e;
                            }
                        } catch (IOException e2) {
                            if (!(e2.getCause() instanceof dsrm)) {
                                throw new dsrm(e2.getMessage());
                            }
                            throw ((dsrm) e2.getCause());
                        }
                    } catch (RuntimeException e3) {
                        if (e3.getCause() instanceof dsrm) {
                            throw ((dsrm) e3.getCause());
                        }
                        throw e3;
                    }
                } catch (dsrm e4) {
                    throw e4;
                }
            } catch (dsrm e5) {
                throw new IllegalArgumentException(e5);
            }
        }
        return F.f();
    }

    @Override // defpackage.aihc
    public final dcdc<dspd> d(List<aiig> list) {
        dccx F = dcdc.F();
        for (aiig aiigVar : list) {
            F.g(aiigVar.b().bR());
        }
        return F.f();
    }

    @Override // defpackage.aihc
    public final /* bridge */ /* synthetic */ aiik e(dbsg<aimj> dbsgVar, List<aiig> list) {
        aimj c = dbsgVar.c(aimj.b);
        for (aiig aiigVar : list) {
            c = aiigVar.a(c);
        }
        return new aiik(l(c.a, aihx.a), l(c.a, aihy.a), l(c.a, aihz.a));
    }
}
