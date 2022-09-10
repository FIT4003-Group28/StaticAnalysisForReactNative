package defpackage;

import android.accounts.Account;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: pgl  reason: default package */
/* loaded from: classes7.dex */
public final class pgl {
    public final dxio<cqxt> a;
    public final dxio<akfa> b;
    private final dehp c;
    private final pfc d;

    public pgl(dehp dehpVar, pfc pfcVar, dxio<cqxt> dxioVar, dxio<akfa> dxioVar2) {
        this.c = dehpVar;
        this.d = pfcVar;
        this.a = dxioVar;
        this.b = dxioVar2;
    }

    public final dehn<Boolean> a(final dcep<dsyl> dcepVar, final int i) {
        final dbsg dbsgVar;
        if (!this.d.b()) {
            return deha.c();
        }
        btlu j = this.b.a().j();
        if (!j.l() || j.h) {
            dbsgVar = dbpy.a;
        } else {
            dbsgVar = dbsg.i(j.s());
        }
        if (!dbsgVar.a()) {
            return deha.c();
        }
        dbsgVar.b();
        return deee.g(deew.h(deew.g(degp.q(this.c.c(new Callable(this) { // from class: pgk
            private final pgl a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                btue y = this.a.b.a().y("oauth2:https://www.googleapis.com/auth/webhistory");
                dbsk.t(y, "Failed to initiate auth token provider.");
                String e = y.e();
                dbsk.t(e, "Failed to get auth token.");
                return e;
            }
        })), new defg(this, dbsgVar, dcepVar, i) { // from class: pgh
            private final pgl a;
            private final dbsg b;
            private final dcep c;
            private final int d;

            {
                this.a = this;
                this.b = dbsgVar;
                this.c = dcepVar;
                this.d = i;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dehn h;
                pgl pglVar = this.a;
                dbsg dbsgVar2 = this.b;
                dcep dcepVar2 = this.c;
                int i2 = this.d;
                String str = (String) obj;
                cqxt a = pglVar.a.a();
                try {
                    cqyt f = a.a.f((Account) dbsgVar2.b());
                    if (!dbsj.d(str)) {
                        dcen N = dcep.N();
                        dcpd it = dcepVar2.iterator();
                        while (it.hasNext()) {
                            cqwq cqwqVar = f.q;
                            N.b((dsyl) it.next());
                        }
                        dcep f2 = N.f();
                        if (f2.isEmpty()) {
                            return deha.a(dcmn.a);
                        }
                        HashSet hashSet = new HashSet();
                        synchronized (f.j) {
                            f.o = str;
                            TreeSet treeSet = new TreeSet();
                            dcpd it2 = f2.iterator();
                            while (it2.hasNext()) {
                                dsyl dsylVar = (dsyl) it2.next();
                                if (f.l.containsKey(dsylVar)) {
                                    dsylVar.name();
                                    hashSet.add(f.l.get(dsylVar));
                                } else if (f.k.containsKey(dsylVar)) {
                                    dsylVar.name();
                                    dehn<Map<dsyl, cqyw>> a2 = deha.l(dcep.B(f.k.get(dsylVar))).a(dazv.f(new deff(f, dsylVar, i2) { // from class: cqxu
                                        private final cqyt a;
                                        private final dsyl b;
                                        private final int c;

                                        {
                                            this.a = f;
                                            this.b = dsylVar;
                                            this.c = i2;
                                        }

                                        @Override // defpackage.deff
                                        public final dehn a() {
                                            dehn<Map<dsyl, cqyw>> d;
                                            cqyt cqytVar = this.a;
                                            dsyl dsylVar2 = this.b;
                                            int i3 = this.c;
                                            synchronized (cqytVar.j) {
                                                cqytVar.l.remove(dsylVar2);
                                                d = cqytVar.d(dcep.B(dsylVar2), i3);
                                            }
                                            return d;
                                        }
                                    }), f.d);
                                    f.l.put(dsylVar, a2);
                                    hashSet.add(a2);
                                } else {
                                    treeSet.add(dsylVar);
                                }
                            }
                            if (!treeSet.isEmpty()) {
                                hashSet.add(f.d(treeSet, i2));
                            }
                            h = deew.h(deha.j(hashSet), dazv.g(new dbrn(f2) { // from class: cqyf
                                private final dcep a;

                                {
                                    this.a = f2;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    dcep dcepVar3 = this.a;
                                    dcdg p = dcdn.p();
                                    for (Map map : (List) obj2) {
                                        for (dsyl dsylVar2 : map.keySet()) {
                                            if (dcepVar3.contains(dsylVar2)) {
                                                p.f(dsylVar2, (cqyw) map.get(dsylVar2));
                                            }
                                        }
                                    }
                                    return p.b();
                                }
                            }), f.d);
                        }
                        return h;
                    }
                    return deha.b(new IllegalArgumentException("Empty auth token"));
                } catch (deiw | ExecutionException e) {
                    return deha.b(new cqxo(e));
                }
            }
        }, this.c), pgi.a, this.c), Throwable.class, new dbrn(dcepVar, dbsgVar) { // from class: pgj
            private final dcep a;
            private final dbsg b;

            {
                this.a = dcepVar;
                this.b = dbsgVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                this.b.b();
                return false;
            }
        }, this.c);
    }
}
