package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: azwy  reason: default package */
/* loaded from: classes3.dex */
public final class azwy {
    private static final dcqe j = dcqe.c("azwy");
    @dzsi
    public azva a;
    @dzsi
    public azva b;
    public Boolean c;
    public Boolean d;
    public final List<azva> e = new ArrayList();
    public final List<azva> f = new ArrayList();
    public final List<azxk> g = new ArrayList();
    public final dcha<Long, azvo> h;
    public final List<baal> i;
    private final Context k;

    /* JADX WARN: Multi-variable type inference failed */
    public azwy(Context context, List<azxk> list, List<azva> list2, dcha<Long, azvo> dchaVar, List<baal> list3) {
        dbsg i;
        this.k = context;
        dcha<Long, azvo> a = ((dckh) dckm.b().b()).a();
        a.H(dchaVar);
        this.h = a;
        this.i = new ArrayList();
        this.c = false;
        this.d = false;
        dcwg dcwgVar = new dcwg();
        HashMap hashMap = new HashMap();
        dcwgVar.c();
        for (azva azvaVar : list2) {
            if (!akqi.d(azvaVar.c)) {
                akqq akqqVar = azvaVar.e;
                dbsk.s(akqqVar);
                dcwgVar.b(dcvs.b(akqqVar.a, akqqVar.b).k(), azvaVar);
            } else {
                akqi akqiVar = azvaVar.c;
                dbsk.s(akqiVar);
                hashMap.put(Long.valueOf(akqiVar.c), azvaVar);
            }
        }
        dcdn r = dcdn.r(hashMap);
        HashSet hashSet = new HashSet();
        for (azva azvaVar2 : list2) {
            dndr dndrVar = azvaVar2.a;
            dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
            int ordinal = dndrVar.ordinal();
            if (ordinal == 1) {
                this.a = azvaVar2;
            } else if (ordinal == 2) {
                this.b = azvaVar2;
            }
        }
        for (azxk azxkVar : list) {
            akqi b = azxkVar.b();
            akqq d = azxkVar.d();
            List<azva> list4 = this.f;
            if (!akqi.d(b)) {
                if (d == null) {
                    i = dbpy.a;
                } else {
                    dcvl dcvlVar = new dcvl(dcwgVar);
                    dcvlVar.a = dcuy.h(0.15d);
                    dcvk b2 = dcvlVar.b(dcvs.b(d.a, d.b).j().k());
                    i = b2 == null ? dbpy.a : dbsg.i((azva) b2.b.b);
                }
                azva azvaVar3 = null;
                if (i.a() && !hashSet.contains(i.b())) {
                    azvaVar3 = (azva) i.b();
                }
                if (azvaVar3 != null) {
                    dndr dndrVar3 = dndr.UNKNOWN_ALIAS_TYPE;
                    int ordinal2 = azvaVar3.a.ordinal();
                    if (ordinal2 == 1) {
                        this.c = true;
                    } else if (ordinal2 == 2) {
                        this.d = true;
                    } else if (ordinal2 == 4) {
                        list4.add(azvaVar3);
                    }
                    hashSet.add(azvaVar3);
                }
            } else {
                dbsk.s(b);
                azva azvaVar4 = (azva) r.get(Long.valueOf(b.c));
                if (azvaVar4 != null) {
                    dndr dndrVar4 = dndr.UNKNOWN_ALIAS_TYPE;
                    int ordinal3 = azvaVar4.a.ordinal();
                    if (ordinal3 == 1) {
                        this.c = true;
                    } else if (ordinal3 == 2) {
                        this.d = true;
                    } else if (ordinal3 == 4) {
                        list4.add(azvaVar4);
                    }
                    hashSet.add(azvaVar4);
                }
            }
            this.g.add(azxkVar);
        }
        for (azva azvaVar5 : list2) {
            if (!hashSet.contains(azvaVar5) && azvaVar5.a == dndr.NICKNAME) {
                this.e.add(azvaVar5);
            }
        }
        this.i.addAll(list3);
    }

    private final dbsg<azwu> e(baad baadVar) {
        try {
            return dbsg.i(azwu.j(baadVar, this.k));
        } catch (RuntimeException e) {
            bvoo.k(e);
            return dbpy.a;
        }
    }

    public final azwv a(baal baalVar, Iterable<azwu> iterable) {
        String y = baalVar.y(this.k);
        baak z = baalVar.z();
        dbsk.s(z);
        if (baalVar.x() == baaj.EXPERIENCE) {
            baai A = baalVar.A();
            dbsk.s(A);
            azwq t = azwv.t(z.a(), z.b(), A.d(), A.d());
            azwr d = azws.d();
            d.c(y);
            d.b(A.a());
            d.d(A.b());
            ((azve) t).l = d.a();
            t.j(iterable);
            return t.i();
        }
        azwq t2 = azwv.t(z.a(), z.b(), y, y);
        t2.j(iterable);
        return t2.i();
    }

    public final dcep<azwu> b(akqi akqiVar, akqq akqqVar, dcha<Long, baal> dchaVar, dcwg<baal> dcwgVar) {
        dcen N = dcep.N();
        if (akqi.d(akqiVar)) {
            N.i(c(Long.valueOf(akqiVar.c), dchaVar));
        }
        N.i(d(akqqVar, dcwgVar));
        return N.f();
    }

    public final dcep<azwu> c(Long l, dcha<Long, baal> dchaVar) {
        dcen N = dcep.N();
        for (baal baalVar : dchaVar.d(l)) {
            baad b = baalVar.b();
            if (b != null) {
                dbsg<azwu> e = e(b);
                if (e.a()) {
                    N.b(e.b());
                }
            } else {
                bvoo.h("Missing parentList on LocalListItem %s.", baalVar);
            }
        }
        return N.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dcep<azwu> d(akqq akqqVar, dcwg<baal> dcwgVar) {
        dcen N = dcep.N();
        dcvl dcvlVar = new dcvl(dcwgVar);
        dcvlVar.a = dcuy.h(0.15d);
        for (dcvk dcvkVar : dcvlVar.a(dcvs.b(akqqVar.a, akqqVar.b).k())) {
            dcwgVar.f(dcvkVar.b);
            baad b = ((baal) dcvkVar.b.b).b();
            if (b != null) {
                dbsg<azwu> e = e(b);
                if (e.a()) {
                    N.b(e.b());
                }
            } else {
                bvoo.h("Missing parentList on LocalListItem %s.", dcvkVar.b.b);
            }
        }
        return N.f();
    }
}
