package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bugg  reason: default package */
/* loaded from: classes.dex */
public final class bugg implements btze {
    public final dehq a;
    public final dxio<buie> b;
    public final bugn c;
    public final cqat d;
    final dehn<Boolean> e;
    public final Map<Class<?>, dzsj<btzh<dssj, dssj>>> f;
    public final akfa g;
    public final dbsg<bugr<buad>> h;
    private final dxio<buit> i;
    private final btuu j;
    private final ckcw k;
    private final btpc l;
    private final dzsj<dixz> m;
    private final List<String> n;

    public bugg(dxio<buit> dxioVar, dxio<buie> dxioVar2, btuu btuuVar, ckcw ckcwVar, cqat cqatVar, bugn bugnVar, bvkx bvkxVar, dehq dehqVar, btpc btpcVar, List<String> list, akfa akfaVar, dbsg<bugr<buad>> dbsgVar, dzsj<dixz> dzsjVar, Map<Class<?>, dzsj<btzh<dssj, dssj>>> map) {
        this.i = dxioVar;
        this.b = dxioVar2;
        this.j = btuuVar;
        this.k = ckcwVar;
        this.d = cqatVar;
        this.c = bugnVar;
        this.a = dehqVar;
        this.l = btpcVar;
        this.e = deha.o(bvkxVar.j.a);
        this.n = list;
        this.g = akfaVar;
        this.h = dbsgVar;
        this.m = dzsjVar;
        this.f = map;
    }

    private static <S> void g(dehn<S> dehnVar, degu<S> deguVar, @dzsi Executor executor) {
        if (executor != null) {
            deha.q(dehnVar, deguVar, executor);
        }
    }

    private static void h(Throwable th) {
        if (!(th instanceof RuntimeException) || (th instanceof CancellationException)) {
            if (th.getCause() == null) {
                return;
            }
            h(th.getCause());
        } else if (th.getCause() instanceof SecurityException) {
            bvoo.j(th);
        } else {
            throw ((RuntimeException) th);
        }
    }

    @Override // defpackage.btze
    public final <Q extends dssj, S extends dssj> btzc a(final Q q, buad buadVar, @dzsi final btzi<Q, S> btziVar, @dzsi final Executor executor) {
        if (this.m.a().f && this.g.m() != null && !buadVar.j) {
            buac buacVar = new buac();
            buacVar.a = buadVar.a;
            buacVar.c(buadVar.b);
            buacVar.d(buadVar.c);
            buacVar.d = buadVar.d;
            buacVar.e = buadVar.e;
            buacVar.f = buadVar.f;
            buacVar.g = buadVar.g;
            buacVar.h = buadVar.h;
            buacVar.i = buadVar.i;
            buacVar.k = buadVar.k;
            btyq btyqVar = buadVar.a;
            dsqp dsqpVar = (dsqp) btyqVar.cu(5);
            dsqpVar.bC(btyqVar);
            btyp btypVar = (btyp) dsqpVar;
            if (btypVar.c) {
                btypVar.bF();
                btypVar.c = false;
            }
            btyq btyqVar2 = (btyq) btypVar.b;
            btyqVar2.a |= 1;
            btyqVar2.b = true;
            buacVar.a = btypVar.bK();
            buadVar = buacVar.a();
        }
        if (this.l.j() || buadVar.b.c != 1) {
            if (this.e.isDone() || c(q)) {
                return new bufj(d(q, buadVar, btziVar, executor));
            }
            final buad buadVar2 = buadVar;
            dehn g = deew.g(deha.o(this.e), new defg(this, q, buadVar2, btziVar, executor) { // from class: bufu
                private final bugg a;
                private final dssj b;
                private final buad c;
                private final btzi d;
                private final Executor e;

                {
                    this.a = this;
                    this.b = q;
                    this.c = buadVar2;
                    this.d = btziVar;
                    this.e = executor;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    return this.a.d(this.b, this.c, this.d, this.e);
                }
            }, this.a);
            btzw btzwVar = new btzw(this.d);
            btzwVar.b();
            g(g, new bugb(this, q, buadVar2, btziVar, btzwVar), executor);
            return new bufj(g);
        }
        btzw btzwVar2 = new btzw(this.d);
        btzwVar2.b();
        dehn b = deha.b(new btzz(btzy.k));
        g(b, new buge(this, q, buadVar, btziVar, btzwVar2), executor);
        return new bufj(b);
    }

    public final <Q extends dssj, S extends dssj> dehn<S> b(final Q q, final buid buidVar, final buad buadVar, @dzsi btzi<Q, S> btziVar, @dzsi Executor executor, final btzw btzwVar) {
        buis a;
        btzwVar.b();
        buit a2 = this.i.a();
        btyk btykVar = buadVar.i;
        if (btykVar.equals(btyk.PAINT)) {
            a = a2.d;
        } else if (btykVar.equals(btyk.HTTP)) {
            a = a2.f;
        } else {
            buiq buiqVar = a2.a;
            if (btykVar.equals(btyk.CHIME)) {
                a = (buis) a2.e.a();
            } else {
                a = a2.c.a().b(q) ? a2.b.a() : buiqVar;
            }
        }
        final buir<S> a3 = a.a(q, buidVar, buadVar);
        dbty dbtyVar = new dbty(this, btzwVar, buidVar, buadVar, a3, q) { // from class: bufv
            private final bugg a;
            private final btzw b;
            private final buid c;
            private final buad d;
            private final buir e;
            private final dssj f;

            {
                this.a = this;
                this.b = btzwVar;
                this.c = buidVar;
                this.d = buadVar;
                this.e = a3;
                this.f = q;
            }

            @Override // defpackage.dbty
            public final Object a() {
                final btzu btzuVar;
                final bugg buggVar = this.a;
                btzw btzwVar2 = this.b;
                buid buidVar2 = this.c;
                final buad buadVar2 = this.d;
                final buir buirVar = this.e;
                final dssj dssjVar = this.f;
                synchronized (btzwVar2) {
                    btzwVar2.a.size();
                    btzuVar = new btzu();
                    btzwVar2.a.add(btzuVar);
                }
                btzuVar.b = Long.valueOf(buggVar.d.e());
                btzuVar.l = 2;
                btyq btyqVar = buadVar2.a;
                ArrayList arrayList = new ArrayList();
                final buhu buhuVar = buidVar2.a;
                if (!buhuVar.e.getAndSet(true)) {
                    buhuVar.b.a();
                    buhuVar.d.a();
                    ((btvg) ((dbsu) buhuVar.c).a).a();
                    deha.i(buhuVar.b.d(), ((btvg) ((dbsu) buhuVar.c).a).d(), buhuVar.d.d()).Pk(new Runnable(buhuVar) { // from class: buht
                        private final buhu a;

                        {
                            this.a = buhuVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a.j(buab.c("NetworkStackReady", Boolean.toString(true)));
                        }
                    }, dege.a);
                }
                arrayList.add(deha.o(buhuVar.a));
                arrayList.add(buidVar2.i.a());
                if (buidVar2.m == 0) {
                    arrayList.add(buidVar2.f.a());
                }
                if (!buidVar2.k) {
                    buidVar2.d.b();
                }
                if (btyqVar.g) {
                    arrayList.add(buidVar2.b.a());
                }
                arrayList.add(buidVar2.c.a());
                if (btyqVar.b) {
                    arrayList.add(buidVar2.d.a());
                }
                if (btyqVar.f) {
                    arrayList.add(buidVar2.g.a());
                }
                dehn h = deew.h(deha.j(arrayList), buhz.a, dege.a);
                if (btyqVar.d) {
                    h = deew.g(h, buidVar2.b(buidVar2.h, btzuVar), buidVar2.l);
                } else if (btyqVar.c) {
                    h = deew.g(h, buidVar2.b(buidVar2.e, btzuVar), buidVar2.l);
                }
                dehn dehnVar = h;
                buidVar2.m++;
                buidVar2.q.set(true);
                return deha.h(deew.g(dehnVar, new defg(buggVar, btzuVar, buirVar, dssjVar, buadVar2) { // from class: bufz
                    private final bugg a;
                    private final btzu b;
                    private final buir c;
                    private final dssj d;
                    private final buad e;

                    {
                        this.a = buggVar;
                        this.b = btzuVar;
                        this.c = buirVar;
                        this.d = dssjVar;
                        this.e = buadVar2;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        bugg buggVar2 = this.a;
                        btzu btzuVar2 = this.b;
                        buir buirVar2 = this.c;
                        final dssj dssjVar2 = this.d;
                        final buad buadVar3 = this.e;
                        btzuVar2.c = Long.valueOf(buggVar2.d.e());
                        btzuVar2.l = 3;
                        final dehn a4 = buirVar2.a((buic) obj, btzuVar2);
                        bvor.a(buggVar2.h, new mw(dssjVar2, a4, buadVar3) { // from class: buga
                            private final dssj a;
                            private final dehn b;
                            private final buad c;

                            {
                                this.a = dssjVar2;
                                this.b = a4;
                                this.c = buadVar3;
                            }

                            @Override // defpackage.mw
                            public final void a(Object obj2) {
                                ((bugr) obj2).a(this.a, this.b, this.c);
                            }
                        });
                        return a4;
                    }
                }, buggVar.a), buadVar2.b.d, TimeUnit.MILLISECONDS, buggVar.a);
            }
        };
        btys btysVar = buadVar.b;
        ddbb ddbbVar = new ddbb(ddbc.e(btysVar.b, btysVar.c));
        final btlu btluVar = buidVar.n;
        final String str = buidVar.o;
        ddbn d = ddbn.d(dbtyVar, ddbbVar, new dbsl(this, btluVar, str) { // from class: bufy
            private final bugg a;
            private final btlu b;
            private final String c;

            {
                this.a = this;
                this.b = btluVar;
                this.c = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bugg buggVar = this.a;
                btlu btluVar2 = this.b;
                String str2 = this.c;
                Exception exc = (Exception) obj;
                if (exc == null) {
                    return false;
                }
                if (!(exc instanceof btzz)) {
                    return true;
                }
                btzy btzyVar = ((btzz) exc).a;
                bttq bttqVar = bttq.PROTOCOL_ERROR_INVALID_CONTENT_TYPE;
                int ordinal = btzyVar.p.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    return false;
                }
                if (ordinal != 9) {
                    return (ordinal == 12 || ordinal == 15) ? false : true;
                }
                buggVar.g.A(btluVar2, str2);
                return true;
            }
        }, this.a);
        g(d, new bugd(this, q, btzwVar, buidVar, d, btziVar), executor);
        return d;
    }

    public final boolean c(dssj dssjVar) {
        return this.n.contains(dssjVar.getClass().getSimpleName());
    }

    public final <Q extends dssj, S extends dssj> dehn<S> d(final Q q, final buad buadVar, @dzsi final btzi<Q, S> btziVar, @dzsi final Executor executor) {
        this.j.a();
        final buid a = this.b.a().a(buadVar);
        final btzw btzwVar = new btzw(this.d);
        if (buadVar.c.b <= 0) {
            if (buadVar.k) {
                dehn<S> dehnVar = null;
                if (this.f.containsKey(q.getClass())) {
                    btzg<dssj> a2 = this.f.get(q.getClass()).a().a(q);
                    if (a2.a != null || a2.b != null) {
                        if (!a2.c() || btziVar == null) {
                            Throwable th = a2.b;
                            dbsk.s(th);
                            dehnVar = deha.b(th);
                        } else {
                            dehnVar = deha.a(a2.d());
                            g(dehnVar, new bugf(btziVar, a2), executor);
                        }
                    }
                }
                if (dehnVar != null) {
                    return dehnVar;
                }
            }
            return b(q, a, buadVar, btziVar, executor, btzwVar);
        }
        final deig d = deig.d();
        dehn<S> g = deew.g(d, new defg(this, q, a, buadVar, btziVar, executor, btzwVar) { // from class: bufw
            private final bugg a;
            private final dssj b;
            private final buid c;
            private final buad d;
            private final btzi e;
            private final Executor f;
            private final btzw g;

            {
                this.a = this;
                this.b = q;
                this.c = a;
                this.d = buadVar;
                this.e = btziVar;
                this.f = executor;
                this.g = btzwVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                Boolean bool = (Boolean) obj;
                return this.a.b(this.b, this.c, this.d, this.e, this.f, this.g);
            }
        }, this.a);
        g(d, new bugc(this, this.c.c(new Runnable(d) { // from class: bufx
            private final deig a;

            {
                this.a = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.j(true);
            }
        }), q, a, btziVar, btzwVar), executor);
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Q extends dssj, S extends dssj> void e(Throwable th, Q q, buid buidVar, int i, @dzsi btzi<Q, S> btziVar, btzw btzwVar) {
        String str;
        h(th);
        btzwVar.c(this.a);
        buidVar.a();
        btzy a = btzy.a(th);
        if (a.q == null) {
            synchronized (btzwVar) {
                if (!btzwVar.a.isEmpty()) {
                    int i2 = ((btza) btzv.y((btzu) dcft.s(btzwVar.a))).a;
                    switch (i2) {
                        case 1:
                            str = "INITIALIZED";
                            break;
                        case 2:
                            str = "REQUIREMENT_START";
                            break;
                        case 3:
                            str = "REQUIREMENT_SATISFIED";
                            break;
                        case 4:
                            str = "NETWORK_STACK_READY_REQUIREMENT_START";
                            break;
                        case 5:
                            str = "NETWORK_STACK_READY_REQUIREMENT_SATISFIED";
                            break;
                        case 6:
                            str = "CONNECTIVITY_REQUIREMENT_START";
                            break;
                        case 7:
                            str = "CONNECTIVITY_REQUIREMENT_SATISFIED";
                            break;
                        case 8:
                            str = "ZWIEBACK_COOKIE_REQUIREMENT_START";
                            break;
                        case 9:
                            str = "ZWIEBACK_COOKIE_REQUIREMENT_SATISFIED";
                            break;
                        case 10:
                            str = "ZWIEBACK_COOKIE_PRESENT_REQUIREMENT_START";
                            break;
                        case 11:
                            str = "ZWIEBACK_COOKIE_PRESENT_REQUIREMENT_SATISFIED";
                            break;
                        case 12:
                            str = "AUTH_REQUIREMENT_START";
                            break;
                        case 13:
                            str = "AUTH_REQUIREMENT_SATISFIED";
                            break;
                        case 14:
                            str = "API_TOKEN_REQUIREMENT_START";
                            break;
                        case 15:
                            str = "API_TOKEN_REQUIREMENT_SATISFIED";
                            break;
                        case 16:
                            str = "NON_DEFAULT_CLIENT_PARAMETERS_REQUIREMENT_START";
                            break;
                        case 17:
                            str = "NON_DEFAULT_CLIENT_PARAMETERS_REQUIREMENT_SATISFIED";
                            break;
                        case 18:
                            str = "LOCATION_REQUIREMENT_START";
                            break;
                        case 19:
                            str = "LOCATION_REQUIREMENT_SATISFIED";
                            break;
                        case 20:
                            str = "FIRST_BYTE_WRITTEN_TO_WIRE";
                            break;
                        case 21:
                            str = "LAST_BYTE_WRITTEN_TO_WIRE";
                            break;
                        case 22:
                            str = "FIRST_BYTE_READ_FROM_WIRE";
                            break;
                        default:
                            str = "LAST_BYTE_READ_FROM_WIRE";
                            break;
                    }
                } else {
                    str = "null";
                }
            }
            StringBuilder sb = new StringBuilder(str.length() + 20);
            sb.append("last attempt state: ");
            sb.append(str);
            a = a.c(sb.toString());
        }
        btzy btzyVar = a;
        if (btzyVar.p.equals(bttq.INVALID_GAIA_AUTH_TOKEN)) {
            this.g.A(buidVar.n, buidVar.o);
        }
        q.getClass();
        f(q, btzwVar.c - btzwVar.b, btzyVar.d(), i);
        if (btziVar != null) {
            btzq a2 = btzr.a();
            a2.a = q;
            btzq.b(i);
            a2.b = buidVar.o;
            a2.c = buidVar.n;
            a2.d = buidVar.p;
            a2.e = btzwVar;
            btziVar.QY(a2.a(), btzyVar);
        }
    }

    public final <Q extends dssj> void f(Q q, long j, ckjk ckjkVar, int i) {
        ckha ckhaVar;
        ckha ckhaVar2 = ckjl.b(q.getClass()).c;
        if (ckhaVar2 != null) {
            ((ckcp) this.k.a(ckhaVar2)).a(j);
        }
        if (ckjkVar.equals(ckjk.SUCCESS) && (ckhaVar = ckjl.b(q.getClass()).d) != null) {
            ((ckcp) this.k.a(ckhaVar)).a(j);
        }
        ckgz ckgzVar = ckjl.b(q.getClass()).h;
        if (ckgzVar != null) {
            ((ckco) this.k.a(ckgzVar)).a(ckjkVar.y);
        }
        ckgz ckgzVar2 = ckjl.b(q.getClass()).a;
        if (ckgzVar2 != null) {
            ((ckco) this.k.a(ckgzVar2)).a(i);
        }
        if (ckgzVar == null || ckgzVar2 == null || ckhaVar2 == null) {
            q.getClass();
        }
    }
}
