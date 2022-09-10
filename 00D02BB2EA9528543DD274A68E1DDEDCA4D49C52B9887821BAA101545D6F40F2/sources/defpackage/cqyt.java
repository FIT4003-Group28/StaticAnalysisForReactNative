package defpackage;

import android.accounts.Account;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cqyt  reason: default package */
/* loaded from: classes5.dex */
public final class cqyt {
    public final Account a;
    public final Geller b;
    public final Set<cqyx> c;
    public final ExecutorService d;
    public final ExecutorService e;
    public final ExecutorService f;
    public final boolean g;
    public final dspt h;
    public final cqxn i;
    public final dbtp m;
    public String o;
    public final pgq p;
    public final cqwq q;
    public final Object j = new Object();
    public int n = 0;
    private final String r = "gmm";
    public final Map<dsyl, dehn<Map<dsyl, cqyw>>> k = new HashMap();
    public final Map<dsyl, dehn<Map<dsyl, cqyw>>> l = new HashMap();

    public cqyt(Account account, Geller geller, pgq pgqVar, Set set, cqwq cqwqVar, dspt dsptVar, cqxn cqxnVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, cqxq cqxqVar, dbug dbugVar) {
        this.a = account;
        this.b = geller;
        this.p = pgqVar;
        this.c = set;
        this.q = cqwqVar;
        this.h = dsptVar;
        this.i = cqxnVar;
        this.d = executorService;
        this.e = executorService2;
        this.f = executorService3;
        this.g = cqxqVar.a();
        this.m = new dbtp(dbugVar);
    }

    public final dehn<Map<dsyl, cqyw>> a(final cqxm cqxmVar, final dsyf dsyfVar, final Map<dsyl, List<dsyn>> map) {
        this.n++;
        dbtp dbtpVar = this.m;
        dbtpVar.e();
        dbtpVar.f();
        String str = this.o;
        dyhi dyhiVar = cqxmVar.a;
        dspt dsptVar = cqxmVar.b;
        dsuz.e(dsptVar);
        dsyp dsypVar = (dsyp) ((dsyp) ((dsyp) dsyp.e(new dsyo(), dyhiVar)).f(deba.a(deba.c(dsptVar.a, 1000L), dsptVar.b / 1000000), TimeUnit.MILLISECONDS)).h(dyjp.a(dbma.d(new dblw(str, null))));
        dyeu dyeuVar = dsypVar.a;
        dyib<dsyf, dsyj> dyibVar = dsyq.a;
        if (dyibVar == null) {
            synchronized (dsyq.class) {
                dyibVar = dsyq.a;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("geller.oneplatform.GellerService", "BatchSync");
                    c.e = true;
                    c.a = dyyq.b(dsyf.e);
                    c.b = dyyq.b(dsyj.b);
                    dyib<dsyf, dsyj> a = c.a();
                    dsyq.a = a;
                    dyibVar = a;
                }
            }
        }
        return deew.g(dyzf.d(dyeuVar.a(dyibVar, dsypVar.b), dsyfVar), dazv.h(new defg(this, dsyfVar, cqxmVar, map) { // from class: cqys
            private final cqyt a;
            private final dsyf b;
            private final cqxm c;
            private final Map d;

            {
                this.a = this;
                this.b = dsyfVar;
                this.c = cqxmVar;
                this.d = map;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cqyt cqytVar = this.a;
                dsyf dsyfVar2 = this.b;
                cqxm cqxmVar2 = this.c;
                Map map2 = this.d;
                dsyj dsyjVar = (dsyj) obj;
                cqxl cqxlVar = new cqxl(cqytVar.a.name, cqytVar.b, new cqwr(dsyfVar2, dsyjVar), cqytVar.f, cqytVar.d);
                HashMap hashMap = new HashMap();
                for (dsyi dsyiVar : ((cqwr) cqxlVar.a).b.a) {
                    dsyl b = dsyl.b(dsyiVar.c);
                    if (b == null) {
                        b = dsyl.UNKNOWN;
                    }
                    dsyy dsyyVar = dsyiVar.d;
                    if (dsyyVar == null) {
                        dsyyVar = dsyy.c;
                    }
                    if ((dsyyVar.a & 1) != 0) {
                        if (dsyyVar.b) {
                            hashMap.put(b, dyjb.b);
                        } else {
                            b.name();
                            cqxlVar.a(b).g(new cqxo("Failed to upload data"));
                            hashMap.put(b, dsyiVar.a == 1 ? dyjb.a(((dtyp) dsyiVar.b).a) : dyjb.d);
                        }
                    }
                    if (dsyiVar.a == 1) {
                        b.name();
                        String str2 = (dsyiVar.a == 1 ? (dtyp) dsyiVar.b : dtyp.d).b;
                        int i = (dsyiVar.a == 1 ? (dtyp) dsyiVar.b : dtyp.d).a;
                        cqxlVar.a(b).g(new cqxo((dsyiVar.a == 1 ? (dtyp) dsyiVar.b : dtyp.d).b));
                        hashMap.put(b, dyjb.a((dsyiVar.a == 1 ? (dtyp) dsyiVar.b : dtyp.d).a));
                    }
                }
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (dsyi dsyiVar2 : ((cqwr) cqxlVar.a).b.a) {
                    dsyl b2 = dsyl.b(dsyiVar2.c);
                    if (b2 == null) {
                        b2 = dsyl.UNKNOWN;
                    }
                    arrayList.add(deee.g(deew.h(degp.q(deha.d(new Callable(cqxlVar, dsyiVar2, b2) { // from class: cqxk
                        private final cqxl a;
                        private final dsyi b;
                        private final dsyl c;

                        {
                            this.a = cqxlVar;
                            this.b = dsyiVar2;
                            this.c = b2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            dsyw dsywVar;
                            Object obj2;
                            cqxl cqxlVar2 = this.a;
                            dsyi dsyiVar3 = this.b;
                            dsyl dsylVar = this.c;
                            if (dsyiVar3.a == 2) {
                                dsywVar = (dsyw) dsyiVar3.b;
                            } else {
                                dsywVar = dsyw.d;
                            }
                            String[] strArr = new String[dsywVar.b.size()];
                            for (int i2 = 0; i2 < dsywVar.b.size(); i2++) {
                                strArr[i2] = dsywVar.b.get(i2).c;
                            }
                            Geller geller = cqxlVar2.c;
                            try {
                                dswh dswhVar = (dswh) cqzo.a(geller.nativeReadAndClearUsage(geller.c, geller.b(cqxlVar2.d), dsylVar.name(), strArr), dswh.b);
                            } catch (cqzl unused) {
                                dswh dswhVar2 = dswh.b;
                            }
                            dsylVar.name();
                            dsywVar.b.size();
                            dsywVar.c.size();
                            dsywVar.getClass();
                            dcqh.a(new dcqg(dsywVar) { // from class: cqxa
                                private final dsyw a;

                                {
                                    this.a = dsywVar;
                                }

                                @Override // defpackage.dcqg
                                public final Object a() {
                                    dsyw dsywVar2 = this.a;
                                    int i3 = dsywVar2.bE;
                                    if (i3 == -1) {
                                        i3 = dsst.a.b(dsywVar2).e(dsywVar2);
                                        dsywVar2.bE = i3;
                                    }
                                    return Integer.valueOf(i3);
                                }
                            });
                            Geller geller2 = cqxlVar2.c;
                            try {
                                obj2 = dcep.M(geller2.nativeUpdate(geller2.c, geller2.b(cqxlVar2.d), dsywVar.bS()));
                            } catch (cqzl unused2) {
                                obj2 = dcmr.a;
                            }
                            dsylVar.name();
                            return obj2;
                        }
                    }, cqxlVar.e)), dazv.g(new dbrn(cqxlVar, b2, hashSet) { // from class: cqxd
                        private final cqxl a;
                        private final dsyl b;
                        private final Set c;

                        {
                            this.a = cqxlVar;
                            this.b = b2;
                            this.c = hashSet;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            cqxl cqxlVar2 = this.a;
                            dsyl dsylVar = this.b;
                            Set set = this.c;
                            cqxlVar2.a(dsylVar).e((Set) obj2);
                            set.add(dsylVar);
                            return true;
                        }
                    }), cqxlVar.f), Exception.class, dazv.g(new dbrn(cqxlVar, b2) { // from class: cqxe
                        private final cqxl a;
                        private final dsyl b;

                        {
                            this.a = cqxlVar;
                            this.b = b2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            cqyv a2 = this.a.a(this.b);
                            String valueOf = String.valueOf(((Exception) obj2).getMessage());
                            a2.g(new cqxo(valueOf.length() != 0 ? "Failed to commit downloads to the database: ".concat(valueOf) : new String("Failed to commit downloads to the database: ")));
                            return false;
                        }
                    }), cqxlVar.f));
                }
                return deew.g(degp.q(deew.h(deew.g(degp.q(deha.l(arrayList).b(dazv.d(new Callable(cqxlVar, hashSet) { // from class: cqxf
                    private final cqxl a;
                    private final Set b;

                    {
                        this.a = cqxlVar;
                        this.b = hashSet;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        this.b.size();
                        return null;
                    }
                }), cqxlVar.f)), dazv.h(new defg(cqxlVar, hashMap) { // from class: cqwx
                    private final cqxl a;
                    private final Map b;

                    {
                        this.a = cqxlVar;
                        this.b = hashMap;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        final cqxl cqxlVar2 = this.a;
                        Map map3 = this.b;
                        Void r3 = (Void) obj2;
                        if (!map3.isEmpty()) {
                            map3.size();
                            dsyf dsyfVar3 = ((cqwr) cqxlVar2.a).a;
                            ArrayList arrayList2 = new ArrayList();
                            for (final dsye dsyeVar : dsyfVar3.b) {
                                final dsyl b3 = dsyl.b(dsyeVar.b);
                                if (b3 == null) {
                                    b3 = dsyl.UNKNOWN;
                                }
                                if (map3.containsKey(b3) && ((dyjb) map3.get(b3)).equals(dyjb.b)) {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (final dsyn dsynVar : dsyeVar.f) {
                                        final Geller geller = cqxlVar2.c;
                                        final String str3 = cqxlVar2.d;
                                        dsyl b4 = dsyl.b(dsyeVar.b);
                                        if (b4 == null) {
                                            b4 = dsyl.UNKNOWN;
                                        }
                                        final dsyl dsylVar = b4;
                                        final String str4 = dsynVar.c;
                                        dsws dswsVar = dsynVar.b;
                                        if (dswsVar == null) {
                                            dswsVar = dsws.e;
                                        }
                                        final long j = dswsVar.b;
                                        boolean z = geller.d;
                                        dbsk.m(true, "remove() not allowed if Geller is read-only");
                                        Map map4 = map3;
                                        dehn f = deha.f(new deff(geller, str3, j, str4, dsylVar) { // from class: cqze
                                            private final Geller a;
                                            private final String b;
                                            private final long c;
                                            private final String d;
                                            private final dsyl e;

                                            {
                                                this.a = geller;
                                                this.b = str3;
                                                this.c = j;
                                                this.d = str4;
                                                this.e = dsylVar;
                                            }

                                            @Override // defpackage.deff
                                            public final dehn a() {
                                                Geller geller2 = this.a;
                                                String str5 = this.b;
                                                long j2 = this.c;
                                                String str6 = this.d;
                                                dsyl dsylVar2 = this.e;
                                                GellerDatabase c2 = geller2.c(str5);
                                                if (c2 == null) {
                                                    return deha.b(new cqzl(drtc.UNKNOWN, "Geller instance is null."));
                                                }
                                                return deha.a(Long.valueOf(c2.delete(dsylVar2.name(), new String[]{str6}, j2)));
                                            }
                                        }, geller.b);
                                        boolean z2 = geller.f;
                                        arrayList3.add(deew.h(f, dazv.g(new dbrn(dsynVar, dsyeVar) { // from class: cqwy
                                            private final dsyn a;
                                            private final dsye b;

                                            {
                                                this.a = dsynVar;
                                                this.b = dsyeVar;
                                            }

                                            @Override // defpackage.dbrn
                                            public final Object a(Object obj3) {
                                                dsyn dsynVar2 = this.a;
                                                dsye dsyeVar2 = this.b;
                                                if (((Long) obj3).longValue() > 0) {
                                                    String str5 = dsynVar2.c;
                                                    dsws dswsVar2 = dsynVar2.b;
                                                    if (dswsVar2 == null) {
                                                        dswsVar2 = dsws.e;
                                                    }
                                                    long j2 = dswsVar2.b;
                                                    dsyl b5 = dsyl.b(dsyeVar2.b);
                                                    if (b5 == null) {
                                                        b5 = dsyl.UNKNOWN;
                                                    }
                                                    b5.name();
                                                    String str6 = dsynVar2.c;
                                                    dsws dswsVar3 = dsynVar2.b;
                                                    if (dswsVar3 == null) {
                                                        dswsVar3 = dsws.e;
                                                    }
                                                    return cqzb.c(str6, dswsVar3.b);
                                                }
                                                String str7 = dsynVar2.c;
                                                dsws dswsVar4 = dsynVar2.b;
                                                if (dswsVar4 == null) {
                                                    dswsVar4 = dsws.e;
                                                }
                                                long j3 = dswsVar4.b;
                                                dsyl b6 = dsyl.b(dsyeVar2.b);
                                                if (b6 == null) {
                                                    b6 = dsyl.UNKNOWN;
                                                }
                                                b6.name();
                                                return null;
                                            }
                                        }), cqxlVar2.e));
                                        map3 = map4;
                                    }
                                    arrayList2.add(deee.g(deew.h(deew.h(degp.q(deew.h(degp.q(deha.p(arrayList3)), dazv.g(new dbrn(cqxlVar2, b3) { // from class: cqwz
                                        private final cqxl a;
                                        private final dsyl b;

                                        {
                                            this.a = cqxlVar2;
                                            this.b = b3;
                                        }

                                        @Override // defpackage.dbrn
                                        public final Object a(Object obj3) {
                                            cqxl cqxlVar3 = this.a;
                                            dsyl dsylVar2 = this.b;
                                            ArrayList arrayList4 = new ArrayList();
                                            for (cqzb cqzbVar : (List) obj3) {
                                                if (cqzbVar != null) {
                                                    arrayList4.add(cqzbVar);
                                                }
                                            }
                                            cqxlVar3.c.e(cqxlVar3.d, dsylVar2, cqxl.b(3, arrayList4));
                                            return null;
                                        }
                                    }), cqxlVar2.e)), dazv.g(new dbrn(cqxlVar2, b3, dsyeVar) { // from class: cqxg
                                        private final cqxl a;
                                        private final dsyl b;
                                        private final dsye c;

                                        {
                                            this.a = cqxlVar2;
                                            this.b = b3;
                                            this.c = dsyeVar;
                                        }

                                        @Override // defpackage.dbrn
                                        public final Object a(Object obj3) {
                                            cqxl cqxlVar3 = this.a;
                                            dsyl dsylVar2 = this.b;
                                            dsye dsyeVar2 = this.c;
                                            Void r10 = (Void) obj3;
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (dsyn dsynVar2 : dsyeVar2.e) {
                                                String str5 = dsynVar2.c;
                                                dsws dswsVar2 = dsynVar2.b;
                                                if (dswsVar2 == null) {
                                                    dswsVar2 = dsws.e;
                                                }
                                                arrayList4.add(cqzb.c(str5, dswsVar2.b));
                                                arrayList5.add(dsynVar2.c);
                                            }
                                            cqxlVar3.c.e(cqxlVar3.d, dsylVar2, cqxl.b(1, arrayList4));
                                            dsyl b5 = dsyl.b(dsyeVar2.b);
                                            if (b5 == null) {
                                                b5 = dsyl.UNKNOWN;
                                            }
                                            b5.name();
                                            return arrayList5;
                                        }
                                    }), cqxlVar2.e), dazv.g(new dbrn(cqxlVar2, b3) { // from class: cqxh
                                        private final cqxl a;
                                        private final dsyl b;

                                        {
                                            this.a = cqxlVar2;
                                            this.b = b3;
                                        }

                                        @Override // defpackage.dbrn
                                        public final Object a(Object obj3) {
                                            this.a.a(this.b).f((List) obj3);
                                            return true;
                                        }
                                    }), cqxlVar2.f), Exception.class, dazv.g(new dbrn(cqxlVar2, b3) { // from class: cqxi
                                        private final cqxl a;
                                        private final dsyl b;

                                        {
                                            this.a = cqxlVar2;
                                            this.b = b3;
                                        }

                                        @Override // defpackage.dbrn
                                        public final Object a(Object obj3) {
                                            cqyv a2 = this.a.a(this.b);
                                            String valueOf = String.valueOf(((Exception) obj3).getMessage());
                                            a2.g(new cqxo(valueOf.length() != 0 ? "Failed to commit uploads to the database: ".concat(valueOf) : new String("Failed to commit uploads to the database: ")));
                                            return false;
                                        }
                                    }), cqxlVar2.f));
                                    map3 = map3;
                                }
                            }
                            return deha.l(arrayList2).b(dazv.d(cqxj.a), cqxlVar2.f);
                        }
                        return dehk.a;
                    }
                }), cqxlVar.f), dazv.g(new dbrn(cqxlVar) { // from class: cqxc
                    private final cqxl a;

                    {
                        this.a = cqxlVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Void r2 = (Void) obj2;
                        return dcjz.s(this.a.b, cqxb.a);
                    }
                }), cqxlVar.f)), dazv.h(new defg(cqytVar, cqxmVar2, dsyfVar2, dsyjVar, map2) { // from class: cqyi
                    private final cqyt a;
                    private final cqxm b;
                    private final dsyf c;
                    private final dsyj d;
                    private final Map e;

                    {
                        this.a = cqytVar;
                        this.b = cqxmVar2;
                        this.c = dsyfVar2;
                        this.d = dsyjVar;
                        this.e = map2;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        dsyw dsywVar;
                        dsyw dsywVar2;
                        cqyt cqytVar2 = this.a;
                        cqxm cqxmVar3 = this.b;
                        dsyf dsyfVar3 = this.c;
                        dsyj dsyjVar2 = this.d;
                        Map map3 = this.e;
                        Map map4 = (Map) obj2;
                        cqytVar2.m.d(TimeUnit.MILLISECONDS);
                        TreeSet treeSet = new TreeSet();
                        HashMap hashMap2 = new HashMap();
                        for (dsyi dsyiVar3 : dsyjVar2.a) {
                            dsyl b3 = dsyl.b(dsyiVar3.c);
                            if (b3 == null) {
                                b3 = dsyl.UNKNOWN;
                            }
                            if (map4.containsKey(b3) && ((cqyw) map4.get(b3)).c().isEmpty()) {
                                treeSet.add(b3);
                                if (dsyiVar3.a == 2) {
                                    dsywVar = (dsyw) dsyiVar3.b;
                                } else {
                                    dsywVar = dsyw.d;
                                }
                                if (!dsywVar.a.isEmpty()) {
                                    dsyd bZ = dsye.g.bZ();
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dsye dsyeVar = (dsye) bZ.b;
                                    dsyeVar.b = b3.Y;
                                    dsyeVar.a |= 1;
                                    if (dsyiVar3.a == 2) {
                                        dsywVar2 = (dsyw) dsyiVar3.b;
                                    } else {
                                        dsywVar2 = dsyw.d;
                                    }
                                    String str3 = dsywVar2.a;
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dsye dsyeVar2 = (dsye) bZ.b;
                                    str3.getClass();
                                    dsyeVar2.a |= 4;
                                    dsyeVar2.d = str3;
                                    hashMap2.put(b3, bZ.bK());
                                }
                            }
                        }
                        return deew.g(degp.q(deew.h(degp.q(cqytVar2.c(treeSet)), new dbrn(cqytVar2, treeSet, dsyfVar3, hashMap2) { // from class: cqxx
                            private final cqyt a;
                            private final Set b;
                            private final dsyf c;
                            private final Map d;

                            {
                                this.a = cqytVar2;
                                this.b = treeSet;
                                this.c = dsyfVar3;
                                this.d = hashMap2;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj3) {
                                cqyt cqytVar3 = this.a;
                                Set<dsyl> set = this.b;
                                dsyf dsyfVar4 = this.c;
                                Map<dsyl, dsye> map5 = this.d;
                                dcdn dcdnVar = (dcdn) obj3;
                                dsys dsysVar = dsyfVar4.d;
                                if (dsysVar == null) {
                                    dsysVar = dsys.d;
                                }
                                return cqytVar3.b(set, dsysVar, map5, dcdnVar);
                            }
                        }, cqytVar2.e)), dazv.h(new defg(cqytVar2, dsyjVar2, map3, map4, cqxmVar3) { // from class: cqxv
                            private final cqyt a;
                            private final dsyj b;
                            private final Map c;
                            private final Map d;
                            private final cqxm e;

                            {
                                this.a = cqytVar2;
                                this.b = dsyjVar2;
                                this.c = map3;
                                this.d = map4;
                                this.e = cqxmVar3;
                            }

                            @Override // defpackage.defg
                            public final dehn a(Object obj3) {
                                cqyt cqytVar3 = this.a;
                                dsyj dsyjVar3 = this.b;
                                Map<dsyl, List<dsyn>> map5 = this.c;
                                final Map map6 = this.d;
                                cqxm cqxmVar4 = this.e;
                                dsyf dsyfVar4 = (dsyf) obj3;
                                Iterator<dsyi> it = dsyjVar3.a.iterator();
                                if (it.hasNext()) {
                                    int i2 = it.next().c;
                                    dsyl dsylVar = dsyl.UNKNOWN;
                                    throw null;
                                } else if (dsyfVar4.b.size() == 0) {
                                    return deha.a(map6);
                                } else {
                                    return deew.h(cqytVar3.a(cqxmVar4, dsyfVar4, map5), dazv.g(new dbrn(map6) { // from class: cqyh
                                        private final Map a;

                                        {
                                            this.a = map6;
                                        }

                                        @Override // defpackage.dbrn
                                        public final Object a(Object obj4) {
                                            cqyw cqywVar;
                                            Map map7 = this.a;
                                            Map map8 = (Map) obj4;
                                            HashMap hashMap3 = new HashMap();
                                            for (dsyl dsylVar2 : map7.keySet()) {
                                                if (map8.containsKey(dsylVar2)) {
                                                    cqyw cqywVar2 = (cqyw) map8.get(dsylVar2);
                                                    cqyv d = ((cqyw) map7.get(dsylVar2)).d();
                                                    d.e(cqywVar2.a());
                                                    d.f(cqywVar2.b());
                                                    d.c().i(cqywVar2.c());
                                                    cqywVar = d.d();
                                                } else {
                                                    cqywVar = (cqyw) map7.get(dsylVar2);
                                                }
                                                hashMap3.put(dsylVar2, cqywVar);
                                            }
                                            return hashMap3;
                                        }
                                    }), cqytVar3.e);
                                }
                            }
                        }), cqytVar2.d);
                    }
                }), cqytVar.e);
            }
        }), this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
        if ((r13 + r9) <= 3670016.0d) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dsyf b(java.util.Set<defpackage.dsyl> r21, defpackage.dsys r22, java.util.Map<defpackage.dsyl, defpackage.dsye> r23, java.util.Map<defpackage.dsyl, defpackage.dsye> r24) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqyt.b(java.util.Set, dsys, java.util.Map, java.util.Map):dsyf");
    }

    public final dehn<dcdn<dsyl, dsye>> c(Set<dsyl> set) {
        dccx F = dcdc.F();
        for (final dsyl dsylVar : set) {
            F.g(deew.h(deha.a(true), dazv.g(new dbrn(dsylVar) { // from class: cqya
                private final dsyl a;

                {
                    this.a = dsylVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    dsyl dsylVar2 = this.a;
                    if (!((Boolean) obj).booleanValue()) {
                        dsylVar2.name();
                        return null;
                    }
                    return dsylVar2;
                }
            }), this.d));
        }
        return deew.h(deew.g(degp.q(deew.h(deha.p(F.f()), dazv.g(cqyb.a), this.d)), dazv.h(new defg(this) { // from class: cqxy
            private final cqyt a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cqyt cqytVar = this.a;
                final dcep dcepVar = (dcep) obj;
                final Geller geller = cqytVar.b;
                final String str = cqytVar.a.name;
                return deha.f(new deff(geller, dcepVar, str, 2) { // from class: cqzh
                    private final Geller a;
                    private final dcep b;
                    private final String c;
                    private final int d = 2;

                    {
                        this.a = geller;
                        this.b = dcepVar;
                        this.c = str;
                    }

                    @Override // defpackage.deff
                    public final dehn a() {
                        Geller geller2 = this.a;
                        dcep dcepVar2 = this.b;
                        String str2 = this.c;
                        String[] strArr = new String[dcepVar2.size()];
                        dcpd it = dcepVar2.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            strArr[i] = ((dsyl) it.next()).name();
                            i++;
                        }
                        dswj dswjVar = (dswj) cqzo.a(geller2.nativeReadSnapshot(geller2.c, geller2.b(str2), strArr, 1), dswj.b);
                        if (dswjVar.a.size() != dcepVar2.size()) {
                            dcepVar2.size();
                            dswjVar.a.size();
                        }
                        return deha.a(dswjVar);
                    }
                }, geller.b);
            }
        }), this.d), dazv.g(new dbrn(this) { // from class: cqxz
            private final cqyt a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dsvf dsvfVar;
                dsvf dsvfVar2;
                dbsg i;
                cqyt cqytVar = this.a;
                dcdg p = dcdn.p();
                long j = 0;
                for (dsvd dsvdVar : ((dswj) obj).a) {
                    dsyl b = dsyl.b(dsvdVar.c);
                    if (b == null) {
                        b = dsyl.UNKNOWN;
                    }
                    if (dsvdVar.a == 2) {
                        dsvfVar = (dsvf) dsvdVar.b;
                    } else {
                        dsvfVar = dsvf.c;
                    }
                    final dsrj<dsyn> dsrjVar = dsvfVar.a;
                    dsrjVar.size();
                    b.name();
                    dcqh.a(new dcqg(dsrjVar) { // from class: cqyc
                        private final List a;

                        {
                            this.a = dsrjVar;
                        }

                        @Override // defpackage.dcqg
                        public final Object a() {
                            return dchl.k(this.a, cqyg.a);
                        }
                    });
                    if (dsvdVar.a == 2) {
                        dsvfVar2 = (dsvf) dsvdVar.b;
                    } else {
                        dsvfVar2 = dsvf.c;
                    }
                    final dsrj<dsyn> dsrjVar2 = dsvfVar2.b;
                    dsrjVar2.size();
                    b.name();
                    dcqh.a(new dcqg(dsrjVar2) { // from class: cqyd
                        private final List a;

                        {
                            this.a = dsrjVar2;
                        }

                        @Override // defpackage.dcqg
                        public final Object a() {
                            return dchl.k(this.a, cqye.a);
                        }
                    });
                    if (!dsrjVar2.isEmpty() || !dsrjVar.isEmpty()) {
                        dsyd bZ = dsye.g.bZ();
                        long j2 = j;
                        for (dsyn dsynVar : dsrjVar2) {
                            if (cqytVar.g) {
                                int i2 = dsynVar.bE;
                                if (i2 == -1) {
                                    i2 = dsst.a.b(dsynVar).e(dsynVar);
                                    dsynVar.bE = i2;
                                }
                                if (i2 + j2 > 3670016.0d) {
                                    if (cqytVar.g) {
                                        b.name();
                                    }
                                }
                            }
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dsye dsyeVar = (dsye) bZ.b;
                            dsynVar.getClass();
                            dsrj<dsyn> dsrjVar3 = dsyeVar.f;
                            if (!dsrjVar3.a()) {
                                dsyeVar.f = dsqw.cl(dsrjVar3);
                            }
                            dsyeVar.f.add(dsynVar);
                            int i3 = dsynVar.bE;
                            if (i3 == -1) {
                                i3 = dsst.a.b(dsynVar).e(dsynVar);
                                dsynVar.bE = i3;
                            }
                            j2 += i3;
                        }
                        for (dsyn dsynVar2 : dsrjVar) {
                            if (cqytVar.g) {
                                int i4 = dsynVar2.bE;
                                if (i4 == -1) {
                                    i4 = dsst.a.b(dsynVar2).e(dsynVar2);
                                    dsynVar2.bE = i4;
                                }
                                if (i4 + j2 > 3670016.0d) {
                                    if (cqytVar.g) {
                                        b.name();
                                    }
                                }
                            }
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dsye dsyeVar2 = (dsye) bZ.b;
                            dsynVar2.getClass();
                            dsrj<dsyn> dsrjVar4 = dsyeVar2.e;
                            if (!dsrjVar4.a()) {
                                dsyeVar2.e = dsqw.cl(dsrjVar4);
                            }
                            dsyeVar2.e.add(dsynVar2);
                            int i5 = dsynVar2.bE;
                            if (i5 == -1) {
                                i5 = dsst.a.b(dsynVar2).e(dsynVar2);
                                dsynVar2.bE = i5;
                            }
                            j2 += i5;
                        }
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dsye dsyeVar3 = (dsye) bZ.b;
                        dsyeVar3.b = b.Y;
                        dsyeVar3.a |= 1;
                        i = dbsg.i(bZ.bK());
                    } else {
                        i = dbpy.a;
                    }
                    if (i.a()) {
                        p.f(b, (dsye) i.b());
                        dsye dsyeVar4 = (dsye) i.b();
                        int i6 = dsyeVar4.bE;
                        if (i6 == -1) {
                            i6 = dsst.a.b(dsyeVar4).e(dsyeVar4);
                            dsyeVar4.bE = i6;
                        }
                        j += i6;
                    }
                }
                return p.b();
            }
        }), this.d);
    }

    public final dehn<Map<dsyl, cqyw>> d(final Set<dsyl> set, int i) {
        if (set.isEmpty()) {
            return deha.a(null);
        }
        for (cqyx cqyxVar : this.c) {
            for (dsyl dsylVar : set) {
                cqyxVar.g();
            }
        }
        this.n = 0;
        String str = this.a.name;
        dsyr dsyrVar = (dsyr) dsys.d.bZ();
        if (dsyrVar.c) {
            dsyrVar.bF();
            dsyrVar.c = false;
        }
        dsys dsysVar = (dsys) dsyrVar.b;
        dsysVar.c = i - 1;
        dsysVar.a |= 16;
        final dehn g = deew.g(deha.a((dsys) dsyrVar.bK()), dazv.h(new defg(this, set) { // from class: cqyl
            private final cqyt a;
            private final Set b;

            {
                this.a = this;
                this.b = set;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cqyt cqytVar = this.a;
                Set<dsyl> set2 = this.b;
                dsys dsysVar2 = (dsys) obj;
                dcen N = dcep.N();
                for (dsyl dsylVar2 : set2) {
                    if (dsylVar2 == dsyl.DEVICE_INSTALLED_APPS) {
                        dbko dbkoVar = dsysVar2.b;
                        if (dbkoVar == null) {
                            dbkoVar = dbko.b;
                        }
                        dble dbleVar = dbkoVar.a;
                        if (dbleVar == null) {
                            dbleVar = dble.b;
                        }
                        if (!dbleVar.a.isEmpty()) {
                        }
                    }
                    N.b(dsylVar2);
                }
                dcep f = N.f();
                return deew.h(degp.q(cqytVar.c(f)), new dbrn(cqytVar, f, dsysVar2) { // from class: cqxw
                    private final cqyt a;
                    private final dcep b;
                    private final dsys c;

                    {
                        this.a = cqytVar;
                        this.b = f;
                        this.c = dsysVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        cqyt cqytVar2 = this.a;
                        dcep dcepVar = this.b;
                        dsys dsysVar3 = this.c;
                        dcdn dcdnVar = (dcdn) obj2;
                        HashMap hashMap = new HashMap();
                        dcpd<dsyl> it = dcepVar.iterator();
                        while (it.hasNext()) {
                            dsyl next = it.next();
                            dsyd bZ = dsye.g.bZ();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dsye dsyeVar = (dsye) bZ.b;
                            dsyeVar.b = next.Y;
                            dsyeVar.a |= 1;
                            hashMap.put(next, bZ.bK());
                        }
                        return cqytVar2.b(dcepVar, dsysVar3, hashMap, dcdnVar);
                    }
                }, cqytVar.f);
            }
        }), this.e);
        final dehn h = deew.h(deee.g(deew.h(degp.q(defw.a(dazv.e(new defs(this) { // from class: cqyq
            private final cqyt a;

            {
                this.a = this;
            }

            @Override // defpackage.defs
            public final Object a(defu defuVar) {
                cqyt cqytVar = this.a;
                cqxn cqxnVar = cqytVar.i;
                dspt dsptVar = cqytVar.h;
                cqyu cqyuVar = cqxnVar.a;
                dywh a = dywh.a(cqyuVar.b, 443);
                a.d = new cqyz(cqyuVar.a);
                cqxm cqxmVar = new cqxm(a.c(), dsptVar);
                defuVar.a(cqxmVar, cqytVar.e);
                return cqxmVar;
            }
        }), this.e).e(new defq(this, g) { // from class: cqyr
            private final cqyt a;
            private final dehn b;

            {
                this.a = this;
                this.b = g;
            }

            @Override // defpackage.defq
            public final defw a(defu defuVar, Object obj) {
                cqyt cqytVar = this.a;
                return defw.b(this.b).e(new defq(cqytVar, (cqxm) obj) { // from class: cqyj
                    private final cqyt a;
                    private final cqxm b;

                    {
                        this.a = cqytVar;
                        this.b = r2;
                    }

                    @Override // defpackage.defq
                    public final defw a(defu defuVar2, Object obj2) {
                        final cqyt cqytVar2 = this.a;
                        final HashMap hashMap = new HashMap();
                        return defw.b(cqytVar2.a(this.b, (dsyf) obj2, hashMap)).d(new deft(cqytVar2, hashMap) { // from class: cqyk
                            private final cqyt a;
                            private final Map b;

                            {
                                this.a = cqytVar2;
                                this.b = hashMap;
                            }

                            @Override // defpackage.deft
                            public final Object a(defu defuVar3, Object obj3) {
                                Map map = (Map) obj3;
                                Iterator it = this.b.keySet().iterator();
                                if (!it.hasNext()) {
                                    return map;
                                }
                                dsyl dsylVar2 = (dsyl) it.next();
                                throw null;
                            }
                        }, cqytVar2.e);
                    }
                }, cqytVar.e);
            }
        }, this.e).f()), new dbrn(this) { // from class: cqym
            private final cqyt a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cqyt cqytVar = this.a;
                Map map = (Map) obj;
                for (dsyl dsylVar2 : map.keySet()) {
                    cqyw cqywVar = (cqyw) map.get(dsylVar2);
                    dsylVar2.name();
                    String str2 = cqytVar.a.name;
                    cqywVar.a().size();
                    cqywVar.b().size();
                    cqywVar.c().size();
                    cqywVar.a();
                    cqywVar.b();
                    for (cqyx cqyxVar2 : cqytVar.c) {
                        cqyxVar2.f(dsylVar2, cqytVar.a, cqywVar);
                    }
                }
                return map;
            }
        }, this.d), Exception.class, new dbrn(this, set) { // from class: cqyn
            private final cqyt a;
            private final Set b;

            {
                this.a = this;
                this.b = set;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cqyt cqytVar = this.a;
                Set<dsyl> set2 = this.b;
                Exception exc = (Exception) obj;
                dcdg p = dcdn.p();
                for (dsyl dsylVar2 : set2) {
                    cqyv e = cqyw.e();
                    e.g(exc);
                    cqyw d = e.d();
                    dsylVar2.name();
                    String str2 = cqytVar.a.name;
                    p.f(dsylVar2, d);
                    for (cqyx cqyxVar2 : cqytVar.c) {
                        cqyxVar2.f(dsylVar2, cqytVar.a, d);
                    }
                }
                return p.b();
            }
        }, this.d), new dbrn() { // from class: cqyo
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return (Map) obj;
            }
        }, this.d);
        dehn<Map<dsyl, cqyw>> b = deha.k(h).b(dazv.d(new Callable(this, set, h) { // from class: cqyp
            private final cqyt a;
            private final Set b;
            private final dehn c;

            {
                this.a = this;
                this.b = set;
                this.c = h;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqyt cqytVar = this.a;
                Set set2 = this.b;
                dehn dehnVar = this.c;
                synchronized (cqytVar.j) {
                    cqytVar.k.keySet().removeAll(set2);
                }
                return (Map) deha.r(dehnVar);
            }
        }), this.d);
        for (dsyl dsylVar2 : set) {
            dbsk.l(this.k.put(dsylVar2, b) == null);
        }
        return b;
    }
}
