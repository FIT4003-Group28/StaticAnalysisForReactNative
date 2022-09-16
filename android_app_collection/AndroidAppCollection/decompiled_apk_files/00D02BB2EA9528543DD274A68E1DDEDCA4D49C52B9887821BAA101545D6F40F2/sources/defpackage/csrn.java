package defpackage;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: csrn  reason: default package */
/* loaded from: classes5.dex */
public final class csrn implements csqn, cssc, cssd {
    public final csrz a;
    public final cssb b;
    public final cspr c;
    private final Map<cwnm, Executor> d = Collections.synchronizedMap(new HashMap());
    private final csse e;

    public csrn(csse csseVar, cssb cssbVar, cspr csprVar, csrz csrzVar) {
        this.e = csseVar;
        this.b = cssbVar;
        this.c = csprVar;
        this.a = csrzVar;
    }

    public static boolean l(csry csryVar) {
        return !csry.c.equals(csryVar);
    }

    public static boolean m(csry csryVar) {
        csrx csrxVar = csryVar.b;
        if (csrxVar == null) {
            csrxVar = csrx.e;
        }
        return !csrxVar.equals(csrx.e);
    }

    public static boolean n(csry csryVar) {
        dhdi dhdiVar = csryVar.a;
        if (dhdiVar == null) {
            dhdiVar = dhdi.b;
        }
        dayi a = cssk.a(dhdiVar);
        return a != null && !a.d;
    }

    @Override // defpackage.csqn
    public final dehn<dhdi> a() {
        return dbac.b(dbac.b(this.c.a()).e(new defg(this) { // from class: csqv
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                csrn csrnVar = this.a;
                csry csryVar = (csry) obj;
                if (csrn.l(csryVar)) {
                    return deha.a(csryVar);
                }
                return csrnVar.i();
            }
        }, dege.a).f(csqw.a, dege.a)).d(Exception.class, new defg(this) { // from class: csqq
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                Exception exc = (Exception) obj;
                this.a.a.a(false);
                throw exc;
            }
        }, dege.a).f(new dbrn(this) { // from class: csqs
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dhdi dhdiVar = (dhdi) obj;
                this.a.a.a(true);
                return dhdiVar;
            }
        }, dege.a);
    }

    @Override // defpackage.csqn
    public final dehn<dbsg<dhdi>> b() {
        return dbac.b(dbac.b(this.c.a()).f(new dbrn(this) { // from class: csqz
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                csrn csrnVar = this.a;
                csry csryVar = (csry) obj;
                if (csrn.l(csryVar)) {
                    dhdi dhdiVar = csryVar.a;
                    if (dhdiVar == null) {
                        dhdiVar = dhdi.b;
                    }
                    return dbsg.i(dhdiVar);
                }
                return csrnVar.j();
            }
        }, dege.a)).d(Exception.class, new defg(this) { // from class: csrg
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                Exception exc = (Exception) obj;
                this.a.a.c(1006, false);
                throw exc;
            }
        }, dege.a).f(new dbrn(this) { // from class: csrh
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dbsg dbsgVar = (dbsg) obj;
                this.a.a.d(1006, dbsgVar.a());
                return dbsgVar;
            }
        }, dege.a);
    }

    @Override // defpackage.csqn
    public final dehn<InputStream> c(final csqm csqmVar, final int i) {
        return dbac.b(this.c.a()).e(new defg(this, csqmVar, i) { // from class: csri
            private final csrn a;
            private final csqm b;
            private final int c;

            {
                this.a = this;
                this.b = csqmVar;
                this.c = i;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                csrn csrnVar = this.a;
                csqm csqmVar2 = this.b;
                int i2 = this.c;
                csry csryVar = (csry) obj;
                if (!csrn.l(csryVar) || !csrn.m(csryVar)) {
                    return csrnVar.k(csqmVar2, i2);
                }
                cssb cssbVar = csrnVar.b;
                csrx csrxVar = csryVar.b;
                if (csrxVar == null) {
                    csrxVar = csrx.e;
                }
                return dbac.b(cssbVar.a(csrxVar, i2)).f(csqx.a, dege.a).c(Exception.class, csqy.a, dege.a).e(new defg(csrnVar, csryVar, csqmVar2, i2) { // from class: csra
                    private final csrn a;
                    private final csry b;
                    private final csqm c;
                    private final int d;

                    {
                        this.a = csrnVar;
                        this.b = csryVar;
                        this.c = csqmVar2;
                        this.d = i2;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        csrn csrnVar2 = this.a;
                        csry csryVar2 = this.b;
                        csqm csqmVar3 = this.c;
                        int i3 = this.d;
                        dbsg dbsgVar = (dbsg) obj2;
                        if (dbsgVar.a()) {
                            if (!csrn.n(csryVar2)) {
                                cssj.a((InputStream) dbsgVar.b());
                                return deha.b(new csqp());
                            }
                            return deha.a((InputStream) dbsgVar.b());
                        }
                        return csrnVar2.k(csqmVar3, i3);
                    }
                }, dege.a);
            }
        }, dege.a).d(Exception.class, new defg(this) { // from class: csrj
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                Exception exc = (Exception) obj;
                this.a.a.b(false);
                throw exc;
            }
        }, dege.a).f(new dbrn(this) { // from class: csrk
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                InputStream inputStream = (InputStream) obj;
                this.a.a.b(true);
                return inputStream;
            }
        }, dege.a);
    }

    @Override // defpackage.csqn
    public final dehn<dbsg<InputStream>> d(final csqm csqmVar, final int i) {
        return dbac.b(this.c.a()).e(new defg(this, csqmVar, i) { // from class: csrl
            private final csrn a;
            private final csqm b;
            private final int c;

            {
                this.a = this;
                this.b = csqmVar;
                this.c = i;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                csrn csrnVar = this.a;
                int i2 = this.c;
                csry csryVar = (csry) obj;
                if (!csrn.l(csryVar) || !csrn.m(csryVar)) {
                    return deha.a(csrnVar.j());
                }
                cssb cssbVar = csrnVar.b;
                csrx csrxVar = csryVar.b;
                if (csrxVar == null) {
                    csrxVar = csrx.e;
                }
                return dbac.b(cssbVar.a(csrxVar, i2)).f(csrb.a, dege.a).c(Exception.class, csrc.a, dege.a).e(new defg(csrnVar, csryVar) { // from class: csrd
                    private final csrn a;
                    private final csry b;

                    {
                        this.a = csrnVar;
                        this.b = csryVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        csrn csrnVar2 = this.a;
                        csry csryVar2 = this.b;
                        dbsg dbsgVar = (dbsg) obj2;
                        if (dbsgVar.a()) {
                            if (!csrn.n(csryVar2)) {
                                cssj.a((InputStream) dbsgVar.b());
                                return deha.b(new csqp());
                            }
                            return deha.a(dbsgVar);
                        }
                        return deha.a(csrnVar2.j());
                    }
                }, dege.a);
            }
        }, dege.a).d(Exception.class, new defg(this) { // from class: csrm
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                Exception exc = (Exception) obj;
                this.a.a.c(1007, false);
                throw exc;
            }
        }, dege.a).f(new dbrn(this) { // from class: csqr
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dbsg dbsgVar = (dbsg) obj;
                this.a.a.d(1007, dbsgVar.a());
                return dbsgVar;
            }
        }, dege.a);
    }

    @Override // defpackage.csqn
    public final void e(cwnm cwnmVar, Executor executor) {
        dbsk.s(executor);
        this.d.put(cwnmVar, executor);
    }

    @Override // defpackage.csqn
    public final void f(cwnm cwnmVar) {
        this.d.remove(cwnmVar);
    }

    @Override // defpackage.cssc
    public final void g() {
        dcdn r;
        synchronized (this.d) {
            r = dcdn.r(this.d);
        }
        dcpd it = r.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            final cwnm cwnmVar = (cwnm) entry.getKey();
            cwnmVar.getClass();
            ((Executor) entry.getValue()).execute(dazv.b(new Runnable(cwnmVar) { // from class: csqt
                private final cwnm a;

                {
                    this.a = cwnmVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.g();
                }
            }));
        }
    }

    @Override // defpackage.cssd
    public final void h() {
        dcdn r;
        synchronized (this.d) {
            r = dcdn.r(this.d);
        }
        dcpd it = r.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            final cwnm cwnmVar = (cwnm) entry.getKey();
            cwnmVar.getClass();
            ((Executor) entry.getValue()).execute(dazv.b(new Runnable(cwnmVar) { // from class: csqu
                private final cwnm a;

                {
                    this.a = cwnmVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.g();
                }
            }));
        }
    }

    public final dehn<csry> i() {
        return dbae.a(this.e.a(), new defg(this) { // from class: csre
            private final csrn a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dhdi dhdiVar = (dhdi) obj;
                return this.a.c.a();
            }
        }, dege.a);
    }

    public final <T> dbsg<T> j() {
        this.e.a();
        return dbpy.a;
    }

    public final dehn<InputStream> k(csqm csqmVar, final int i) {
        return dbae.a(i(), new defg(this, i) { // from class: csrf
            private final csrn a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                csrn csrnVar = this.a;
                int i2 = this.b;
                csry csryVar = (csry) obj;
                if (!csrn.n(csryVar)) {
                    return deha.b(new csqp());
                }
                cssb cssbVar = csrnVar.b;
                csrx csrxVar = csryVar.b;
                if (csrxVar == null) {
                    csrxVar = csrx.e;
                }
                return cssbVar.a(csrxVar, i2);
            }
        }, dege.a);
    }
}
