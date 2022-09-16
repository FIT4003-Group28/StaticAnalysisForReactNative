package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqgk  reason: default package */
/* loaded from: classes2.dex */
public final class aqgk {
    public final dxio<apyu> c;
    public final dehp d;
    public final btlu e;
    public final dbsl<apzn> f;
    private final dxio<aprv> i;
    @dzsi
    private crzp<apsi<Set<String>>> j;
    @dzsi
    private crzm<apsi<Set<String>>> k;
    public final Object a = new Object();
    public final Set<String> h = new HashSet();
    public final Map<String, aqgj<apsi<dbsg<apzn>>>> g = new HashMap();
    public final crzo<dcdn<String, apzn>> b = new crzo<>();

    public aqgk(dxio<aprv> dxioVar, dxio<apyu> dxioVar2, dehp dehpVar, btlu btluVar, dbsl<apzn> dbslVar) {
        this.i = dxioVar;
        this.c = dxioVar2;
        this.d = dehpVar;
        this.e = btluVar;
        this.f = dbslVar;
    }

    public final synchronized void a(crzp<dcdn<String, apzn>> crzpVar, Executor executor) {
        if (this.k == null || this.j == null) {
            this.k = this.i.a().c(this.e);
            this.j = new crzp(this) { // from class: aqgd
                private final aqgk a;

                {
                    this.a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    final aqgk aqgkVar = this.a;
                    if (crzmVar.k()) {
                        apsi apsiVar = (apsi) crzmVar.l();
                        dbsk.s(apsiVar);
                        int b = apsiVar.b();
                        if (b == 0) {
                            throw null;
                        }
                        if (b == 1) {
                            return;
                        }
                        synchronized (aqgkVar.a) {
                            for (aqgj<apsi<dbsg<apzn>>> aqgjVar : aqgkVar.g.values()) {
                                aqgjVar.c();
                            }
                            aqgkVar.g.clear();
                            aqgkVar.h.clear();
                            aqgkVar.h.addAll((Collection) apsiVar.a());
                            if (aqgkVar.h.isEmpty()) {
                                aqgkVar.b.b(dcmn.a);
                                return;
                            }
                            for (final String str : (Set) apsiVar.a()) {
                                aqga aqgaVar = new aqga();
                                crzm b2 = aqgkVar.c.a().b(str, aqgkVar.e);
                                if (b2 != null) {
                                    aqgaVar.a = b2;
                                    aqgaVar.b = new crzp(aqgkVar, str) { // from class: aqge
                                        private final aqgk a;
                                        private final String b;

                                        {
                                            this.a = aqgkVar;
                                            this.b = str;
                                        }

                                        @Override // defpackage.crzp
                                        public final void On(crzm crzmVar2) {
                                            final aqgk aqgkVar2 = this.a;
                                            String str2 = this.b;
                                            apsi apsiVar2 = (apsi) crzmVar2.l();
                                            if (apsiVar2 != null) {
                                                int b3 = apsiVar2.b();
                                                if (b3 == 0) {
                                                    throw null;
                                                }
                                                if (b3 == 1) {
                                                    return;
                                                }
                                                synchronized (aqgkVar2.a) {
                                                    if (!aqgkVar2.g.containsKey(str2)) {
                                                        return;
                                                    }
                                                    aqgkVar2.h.remove(str2);
                                                    if (aqgkVar2.h.isEmpty()) {
                                                        aqgkVar2.b.b(dcdn.r(dcjz.s(dcjz.y(aqgkVar2.g, new dbsl(aqgkVar2) { // from class: aqgf
                                                            private final aqgk a;

                                                            {
                                                                this.a = aqgkVar2;
                                                            }

                                                            @Override // defpackage.dbsl
                                                            public final boolean a(Object obj) {
                                                                aqgk aqgkVar3 = this.a;
                                                                apsi apsiVar3 = (apsi) ((aqgj) obj).a().l();
                                                                dbsk.s(apsiVar3);
                                                                final dbsl<apzn> dbslVar = aqgkVar3.f;
                                                                dbslVar.getClass();
                                                                return ((Boolean) ((dbsg) apsiVar3.a()).h(new dbrn(dbslVar) { // from class: aqgh
                                                                    private final dbsl a;

                                                                    {
                                                                        this.a = dbslVar;
                                                                    }

                                                                    @Override // defpackage.dbrn
                                                                    public final Object a(Object obj2) {
                                                                        return Boolean.valueOf(this.a.a((apzn) obj2));
                                                                    }
                                                                }).c(false)).booleanValue();
                                                            }
                                                        }), aqgg.a)));
                                                    }
                                                }
                                            }
                                        }
                                    };
                                    String str2 = "";
                                    if (aqgaVar.a == null) {
                                        str2 = " observableState";
                                    }
                                    if (aqgaVar.b == null) {
                                        str2 = str2.concat(" observer");
                                    }
                                    if (!str2.isEmpty()) {
                                        String valueOf = String.valueOf(str2);
                                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                                    }
                                    aqgb aqgbVar = new aqgb(aqgaVar.a, aqgaVar.b);
                                    aqgkVar.g.put(str, aqgbVar);
                                    aqgbVar.a.d(aqgbVar.b, aqgkVar.d);
                                } else {
                                    throw new NullPointerException("Null observableState");
                                }
                            }
                        }
                    }
                }
            };
            crzm<apsi<Set<String>>> crzmVar = this.k;
            dbsk.s(crzmVar);
            crzp<apsi<Set<String>>> crzpVar2 = this.j;
            dbsk.s(crzpVar2);
            crzmVar.d(crzpVar2, this.d);
        }
        this.b.a.d(crzpVar, executor);
    }

    public final synchronized void b(crzp<dcdn<String, apzn>> crzpVar) {
        crzp<apsi<Set<String>>> crzpVar2;
        this.b.a.c(crzpVar);
        if (this.b.a.f() == 0) {
            crzm<apsi<Set<String>>> crzmVar = this.k;
            if (crzmVar != null && (crzpVar2 = this.j) != null) {
                crzmVar.c(crzpVar2);
                this.k = null;
                this.j = null;
            }
            synchronized (this.a) {
                for (aqgj<apsi<dbsg<apzn>>> aqgjVar : this.g.values()) {
                    aqgjVar.c();
                }
                this.g.clear();
            }
        }
    }
}
