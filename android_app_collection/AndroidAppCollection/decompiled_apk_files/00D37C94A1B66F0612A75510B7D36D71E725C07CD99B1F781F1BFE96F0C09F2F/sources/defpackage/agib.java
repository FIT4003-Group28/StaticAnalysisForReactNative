package defpackage;

import android.database.Cursor;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agib  reason: default package */
/* loaded from: classes.dex */
public final class agib implements agvv {
    public static final long a = TimeUnit.HOURS.toMillis(1);
    public final snc b;
    public final String c;
    public final azqb d;
    public final agyr e;
    public final azqb f;
    public final azqb g;
    public final agis h;
    public final Executor i;
    public final azqb j;
    public final azqb k;
    public final azqb l;
    public final azqb m;
    public final azqb n;
    public final azqb o;
    public final azqb p;
    public final azqb q;
    final azqb r;
    public final aadd u;
    public final aacz w;
    private final Executor x;
    private final azqb y;
    private final ahdn z;
    public volatile long v = 0;
    public final agia s = new agia(this);
    public final Map t = new HashMap();

    public agib(snc sncVar, String str, azqb azqbVar, agyr agyrVar, azqb azqbVar2, azqb azqbVar3, agis agisVar, Executor executor, Executor executor2, agmk agmkVar, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, ahdn ahdnVar, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, aacz aaczVar, aadd aaddVar, byte[] bArr) {
        this.b = sncVar;
        this.c = str;
        this.d = azqbVar;
        this.e = agyrVar;
        this.f = azqbVar2;
        this.g = azqbVar3;
        this.h = agisVar;
        this.x = executor;
        this.i = executor2;
        this.j = azqbVar4;
        this.k = azqbVar5;
        this.l = azqbVar6;
        this.m = azqbVar7;
        this.n = azqbVar8;
        this.o = azqbVar9;
        this.y = azqbVar10;
        this.z = ahdnVar;
        this.p = azqbVar11;
        this.q = azqbVar12;
        this.r = azqbVar13;
        this.w = aaczVar;
        this.u = aaddVar;
        agmkVar.x(new aghx(this));
    }

    @Override // defpackage.agvv
    public final boolean A(String str, long j) {
        if (!this.h.z()) {
            return false;
        }
        return z(Collections.singletonList(str), amup.k(str, Integer.MAX_VALUE), amup.k(str, 0), 0, j);
    }

    @Override // defpackage.agvv
    public final int B(final String str, final attl attlVar, final agqn agqnVar, final byte[] bArr, final int i, final int i2) {
        zgh.m(str);
        if (this.h.z()) {
            zgh.m(str);
            this.z.b(true);
            if (((aglj) this.j.get()).n(str) != null) {
                return 1;
            }
            this.h.s(new Runnable() { // from class: aghu
                @Override // java.lang.Runnable
                public final void run() {
                    aghk aghkVar;
                    List list;
                    String str2;
                    agib agibVar = agib.this;
                    String str3 = str;
                    attl attlVar2 = attlVar;
                    agqn agqnVar2 = agqnVar;
                    byte[] bArr2 = bArr;
                    int i3 = i;
                    int i4 = i2;
                    long c = agibVar.b.c();
                    ylr.b();
                    if (!((aghc) agibVar.k.get()).i()) {
                        agibVar.p(str3, 0);
                        return;
                    }
                    aglj agljVar = (aglj) agibVar.j.get();
                    if (agljVar.n(str3) != null) {
                        String.valueOf(str3).length();
                        agibVar.h.v(new agnm(str3));
                        return;
                    }
                    try {
                        agqx b = ((agux) agibVar.g.get()).b(str3, Integer.MAX_VALUE);
                        if (b == null) {
                            String valueOf = String.valueOf(str3);
                            if (valueOf.length() != 0) {
                                "[Offline] Not adding null playlist ".concat(valueOf);
                            }
                            agibVar.p(str3, 3);
                            return;
                        }
                        int U = ((agvq) agibVar.d.get()).U(attlVar2);
                        agqf agqfVar = b.a;
                        agqn agqnVar3 = agqnVar2;
                        if (!agljVar.ab(agqfVar, attlVar2, U, i3, bArr2, c, i4)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 48);
                            sb.append("[Offline] Failed inserting playlist ");
                            sb.append(str3);
                            sb.append(" to database");
                            zep.b(sb.toString());
                            agibVar.p(str3, 2);
                            return;
                        }
                        aghk aghkVar2 = (aghk) agibVar.n.get();
                        agqa agqaVar = agqfVar.c;
                        if (agqaVar != null) {
                            aghkVar2.a(agqaVar);
                        }
                        String.valueOf(str3).length();
                        agibVar.h.v(new agnk(str3));
                        List list2 = b.b;
                        Set m = ((agjz) agibVar.o.get()).m(list2);
                        Set set = m;
                        if (agljVar.ae(agqfVar, list2, attlVar2, U, m, agqnVar3, i3, bArr2)) {
                            ylr.b();
                            try {
                                agpj agpjVar = (agpj) agibVar.l.get();
                                agpj.w(agpjVar.h(agqfVar.a));
                                agpjVar.r(agqfVar);
                                agqa agqaVar2 = agqfVar.c;
                                if (agqaVar2 != null) {
                                    agpjVar.t(agqaVar2);
                                }
                            } catch (IOException | ExecutionException e) {
                                String str4 = agqfVar.a;
                                zep.n(str4.length() != 0 ? "[Offline] Failed saving playlist thumbnail for ".concat(str4) : new String("[Offline] Failed saving playlist thumbnail for "), e);
                            }
                            aglj agljVar2 = (aglj) agibVar.j.get();
                            String str5 = agqfVar.a;
                            agmv o = agljVar2.l.o(str5);
                            if (o != null) {
                                agqf a2 = o.a();
                                str2 = str3;
                                aghkVar = aghkVar2;
                                list = list2;
                                agqf agqfVar2 = new agqf(a2.a, a2.b, a2.c, a2.d, agljVar2.a.c(str5, o.a().e), a2.f, a2.h, a2.i, a2.j, a2.l, a2.m, a2.n);
                                synchronized (o.c.k) {
                                    aqxo.p(o.a.a.equals(agqfVar2.a));
                                    o.a = agqfVar2;
                                    o.b = null;
                                }
                            } else {
                                aghkVar = aghkVar2;
                                list = list2;
                                str2 = str3;
                            }
                            agwj b2 = ((agwi) agibVar.r.get()).b(agqfVar, set);
                            agjz agjzVar = (agjz) agibVar.o.get();
                            agwk agwkVar = (agwk) agibVar.q.get();
                            agwkVar.f(agjzVar.j().size());
                            agwkVar.b().d(set);
                            agqfVar.a.length();
                            agibVar.h.v(new agnp(b2.c()));
                            agjzVar.v(agwkVar.b().b());
                            List<agqo> list3 = list;
                            aghkVar.c(list3);
                            agkg agkgVar = (agkg) agibVar.m.get();
                            for (agqo agqoVar : list3) {
                                if (set.remove(agqoVar.f())) {
                                    agkgVar.h(agqoVar.f(), str2, null, attlVar2, null, U, agqnVar3, 0, false, false, false);
                                    set = set;
                                    agqnVar3 = agqnVar3;
                                }
                            }
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 48);
                        sb2.append("[Offline] Failed inserting playlist ");
                        sb2.append(str3);
                        sb2.append(" to database");
                        zep.b(sb2.toString());
                        agibVar.t(str3);
                        agljVar.C(str3);
                        agibVar.q(str3);
                    } catch (ExecutionException e2) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 49);
                        sb3.append("[Offline] Failed requesting playlist ");
                        sb3.append(str3);
                        sb3.append(" for offline");
                        zep.d(sb3.toString(), e2);
                        agibVar.p(str3, 1);
                    }
                }
            });
            return 0;
        }
        return 2;
    }

    @Override // defpackage.agvv
    public final int a(String str) {
        if (!this.h.z()) {
            return 0;
        }
        return ((aglj) this.j.get()).j(str);
    }

    @Override // defpackage.agvv
    public final int b(final String str, final String str2) {
        Set L;
        zgh.m(str);
        zgh.m(str2);
        if (this.h.z()) {
            zgh.m(str);
            zgh.m(str2);
            aglj agljVar = (aglj) this.j.get();
            agqh n = agljVar.n(str);
            if (n == null) {
                return 2;
            }
            zgh.m(str2);
            zgh.m(str);
            agmz c = agljVar.l.c();
            synchronized (c.k) {
                L = zew.L(c.g, str);
            }
            if (!L.contains(str2)) {
                return 2;
            }
            agjz agjzVar = (agjz) this.o.get();
            agqv e = agjzVar.e(str2);
            if (e != null && (!e.u() || (e.a() && !e.y() && !e.t() && !e.r()))) {
                return 1;
            }
            this.h.s(new Runnable() { // from class: aghv
                @Override // java.lang.Runnable
                public final void run() {
                    agib agibVar = agib.this;
                    ((agjz) agibVar.o.get()).B(str2, str, agqn.OFFLINE_IMMEDIATELY, agqe.ACTIVE);
                }
            });
            agwj a2 = ((agwi) this.r.get()).a(str);
            if (a2 == null) {
                a2 = ((agwi) this.r.get()).b(n.a, amuk.r(str2));
            } else {
                a2.e(str2);
            }
            a2.f();
            r(a2.c());
            agwk agwkVar = (agwk) this.q.get();
            agwkVar.f(agjzVar.j().size());
            agwkVar.b().c(str2);
            agjzVar.v(agwkVar.b().b());
            return 0;
        }
        return 2;
    }

    @Override // defpackage.agvv
    public final Pair c(String str) {
        zgh.m(str);
        ylr.b();
        if (!this.h.z()) {
            return null;
        }
        return ((aglj) this.j.get()).l(str);
    }

    @Override // defpackage.agvv
    public final agqg d(String str) {
        agqh n;
        if (this.h.z()) {
            agwj a2 = ((agwi) this.r.get()).a(str);
            if (a2 == null && (n = ((aglj) this.j.get()).n(str)) != null) {
                a2 = ((agwi) this.r.get()).b(n.a, null);
            }
            if (a2 != null) {
                return a2.c();
            }
        }
        return null;
    }

    @Override // defpackage.agvv
    public final agqh e(String str) {
        if (!this.h.z()) {
            return null;
        }
        return ((aglj) this.j.get()).n(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final agqn f(String str) {
        HashSet hashSet;
        Set<agqv> set;
        zgh.m(str);
        if (this.h.z()) {
            agmz c = ((agmr) this.y.get()).c();
            synchronized (c.k) {
                zgh.m(str);
                hashSet = new HashSet();
                Set<String> L = zew.L(c.g, str);
                if (L != null && !L.isEmpty()) {
                    for (String str2 : L) {
                        agmx agmxVar = (agmx) c.b.get(str2);
                        if (agmxVar != null && agmxVar.e() != null) {
                            hashSet.add(agmxVar.e());
                        }
                    }
                }
            }
            set = hashSet;
        } else {
            set = amyg.a;
        }
        for (agqv agqvVar : set) {
            if (agqvVar.m == agqn.DEFER_FOR_DISCOUNTED_DATA) {
                return agqn.DEFER_FOR_DISCOUNTED_DATA;
            }
        }
        return agqn.OFFLINE_IMMEDIATELY;
    }

    public final amuk g(String str) {
        agqh e = e(str);
        if (e == null) {
            return amuk.q();
        }
        ArrayList arrayList = new ArrayList();
        agjz agjzVar = (agjz) this.o.get();
        for (String str2 : e.b) {
            agqv e2 = agjzVar.e(str2);
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return amuk.o(arrayList);
    }

    @Override // defpackage.agvv
    public final ankt h(final String str) {
        return aglp.b(this.h.o(), new Callable() { // from class: aghp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return agib.this.g(str);
            }
        }, amuk.q(), this.x);
    }

    @Override // defpackage.agvv
    public final ankt i() {
        return aglp.b(this.h.o(), new Callable() { // from class: agho
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return agib.this.k();
            }
        }, amuk.q(), this.x);
    }

    @Override // defpackage.agvv
    public final Collection j() {
        if (!this.h.z()) {
            return amuk.q();
        }
        return k();
    }

    public final Collection k() {
        LinkedList linkedList;
        agmz c = ((aglj) this.j.get()).l.c();
        synchronized (c.k) {
            linkedList = new LinkedList();
            for (agmv agmvVar : c.c.values()) {
                linkedList.add(agmvVar.b());
            }
        }
        return linkedList;
    }

    @Override // defpackage.agvv
    public final List l(String str) {
        if (!this.h.z()) {
            return amuk.q();
        }
        return g(str);
    }

    @Override // defpackage.agvv
    public final List m() {
        ylr.b();
        if (!this.h.z()) {
            return amuk.q();
        }
        return ((aglj) this.j.get()).f();
    }

    @Override // defpackage.agvv
    public final Set n(String str) {
        zgh.m(str);
        if (this.h.z()) {
            return ((aglj) this.j.get()).t(str);
        }
        return amyg.a;
    }

    @Override // defpackage.agvv
    public final void o(String str) {
        if (!this.h.z()) {
            return;
        }
        this.h.s(new aght(this, str, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(String str, int i) {
        String.valueOf(str).length();
        this.h.v(new agnl(str, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(String str) {
        String.valueOf(str).length();
        this.h.v(new agnn(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(agqg agqgVar) {
        String d = agqgVar.d();
        agqgVar.a();
        agqgVar.c();
        d.length();
        this.h.v(new agnp(agqgVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(String str) {
        String.valueOf(str).length();
        this.h.v(new agns(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(String str) {
        String.valueOf(str).length();
        this.h.v(new agno(str));
    }

    @Override // defpackage.agvv
    public final void u(String str) {
        this.h.s(new aght(this, str));
    }

    @Override // defpackage.agvv
    public final void v(final String str, final yiw yiwVar) {
        zgh.m(str);
        this.i.execute(new Runnable() { // from class: aghs
            @Override // java.lang.Runnable
            public final void run() {
                agib agibVar = agib.this;
                yiw yiwVar2 = yiwVar;
                String str2 = str;
                if (!agibVar.h.z()) {
                    return;
                }
                yiwVar2.b(null, agibVar.c(str2));
            }
        });
    }

    @Override // defpackage.agvv
    public final void w(String str) {
        this.h.s(new aght(this, str, 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(String str) {
        ylr.b();
        t(str);
        if (((aglj) this.j.get()).C(str)) {
            q(str);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("[Offline] Failed removing playlist ");
        sb.append(str);
        sb.append(" from database");
        zep.b(sb.toString());
    }

    @Override // defpackage.agvv
    public final void y() {
        this.i.execute(new Runnable() { // from class: aghq
            @Override // java.lang.Runnable
            public final void run() {
                long j;
                final agib agibVar = agib.this;
                if (!agibVar.h.z()) {
                    return;
                }
                long d = agibVar.b.d();
                if (agibVar.v != 0 && d - agibVar.v < agib.a) {
                    return;
                }
                agibVar.v = d;
                long q = ((agvq) agibVar.d.get()).q(agibVar.c);
                if (q <= 0) {
                    final aghw aghwVar = new aghw(agibVar);
                    if (!agibVar.h.z()) {
                        return;
                    }
                    agibVar.i.execute(new Runnable() { // from class: aghr
                        @Override // java.lang.Runnable
                        public final void run() {
                            aghwVar.b(null, agib.this.m());
                        }
                    });
                    return;
                }
                atqk n = ahdf.n(agibVar.w);
                if (n != null && n.g) {
                    return;
                }
                Cursor rawQuery = ((aglj) agibVar.j.get()).m.a.a().rawQuery("SELECT min(saved_timestamp) FROM playlistsV13", null);
                try {
                    if (rawQuery.moveToFirst()) {
                        j = rawQuery.getLong(0);
                    } else {
                        rawQuery.close();
                        j = Long.MAX_VALUE;
                    }
                    if (agibVar.b.c() <= j + TimeUnit.SECONDS.toMillis(q)) {
                        return;
                    }
                    ((agxc) agibVar.f.get()).e(agibVar.c);
                } finally {
                    rawQuery.close();
                }
            }
        });
    }

    @Override // defpackage.agvv
    public final boolean z(final List list, final Map map, final Map map2, final int i, final long j) {
        if (this.h.z()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (d((String) it.next()) == null) {
                    return false;
                }
            }
            this.h.s(new Runnable() { // from class: aghn
                /* JADX WARN: Code restructure failed: missing block: B:77:0x028e, code lost:
                    if (r1.intValue() == 2) goto L94;
                 */
                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0174  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0176  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 1516
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.aghn.run():void");
                }
            });
            return true;
        }
        return false;
    }
}
