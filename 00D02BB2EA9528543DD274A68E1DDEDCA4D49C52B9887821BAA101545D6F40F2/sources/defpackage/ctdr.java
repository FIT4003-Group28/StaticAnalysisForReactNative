package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import com.google.android.filament.R;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ctdr  reason: default package */
/* loaded from: classes5.dex */
public final class ctdr implements csuu, ctec {
    public final Context a;
    public final cusx b;
    public final csuo c;
    public final csun d;
    public final ctog e;
    public final List<csuv> f;
    public csuk h;
    public csue k;
    public final Map<String, ctuk> n;
    public final ctud p;
    public final Object i = new Object();
    public final Object j = new Object();
    final Map<Long, dbsg<ctzp>> l = new HashMap();
    final Map<ctyy, dehn<ctft>> m = new HashMap();
    public final dehp o = cstu.b().a;
    private final Map<ContactId, deia> q = new HashMap();
    public final Random g = new Random();

    public ctdr(Context context, Map map, ctud ctudVar, cusx cusxVar, csuo csuoVar, csun csunVar, ctog ctogVar, csuv csuvVar) {
        this.a = context;
        this.n = map;
        this.p = ctudVar;
        this.b = cusxVar;
        this.c = csuoVar;
        this.d = csunVar;
        this.e = ctogVar;
        this.f = dchl.b(csuvVar);
    }

    private final dehn<ctft> i(final ctyy ctyyVar, final ctzp ctzpVar, final int i) {
        dehn j;
        Object obj;
        Object obj2 = this.j;
        synchronized (obj2) {
            try {
                try {
                    dehn<ctft> dehnVar = this.m.get(ctyyVar);
                    if (dehnVar != null && !dehnVar.isDone()) {
                        cstl.a("TyRegController");
                        obj = obj2;
                        return dehnVar;
                    }
                    ctog ctogVar = this.e;
                    ctxm r = ctxn.r();
                    r.g(12);
                    r.f(i);
                    r.n(ctyyVar.b().e());
                    r.o(ctyyVar.c().J());
                    ctogVar.b(r.a());
                    if (ctzpVar.h() == 1) {
                        cstl.a("TyRegController");
                        ctog ctogVar2 = this.e;
                        ctxm r2 = ctxn.r();
                        r2.g(14);
                        r2.f(i);
                        r2.n(ctyyVar.b().e());
                        r2.o(ctyyVar.c().J());
                        ctogVar2.b(r2.a());
                        ctog ctogVar3 = this.e;
                        ctxm r3 = ctxn.r();
                        r3.g(10016);
                        r3.n(ctyyVar.b().e());
                        r3.o(ctyyVar.c().J());
                        ctogVar3.b(r3.a());
                        f(ctyyVar.b().e());
                        synchronized (this.i) {
                            this.l.remove(Long.valueOf(ctyyVar.a()));
                        }
                        ctfs e = ctft.e();
                        ((cteu) e).d = 3;
                        dehnVar = deha.a(e.a());
                        obj = obj2;
                    } else {
                        ctmm c = ctmn.c();
                        ((ctmh) c).a = "register refresh";
                        c.b(ctmr.c);
                        final ctmn a = c.a();
                        final ctud ctudVar = this.p;
                        final csuo csuoVar = this.c;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        cstd.a();
                        long micros = timeUnit.toMicros(System.currentTimeMillis());
                        ContactId e2 = ctyyVar.b().e();
                        if (ctzpVar.h() != 2) {
                            ctfs e3 = ctft.e();
                            ((cteu) e3).d = 3;
                            j = deha.a(e3.a());
                        } else {
                            final dehn i2 = ctudVar.b.i(UUID.randomUUID(), new ctws(ctyyVar, ctudVar.c, csuoVar, ctudVar.a.getPackageName(), ctzpVar.d(), micros), ctudVar.b.d.a(), ctyyVar, ctzpVar, a);
                            j = ctudVar.b.j(deha.m(i2).a(new deff(ctudVar, i2, ctyyVar, csuoVar, ctzpVar, a) { // from class: ctua
                                private final ctud a;
                                private final dehn b;
                                private final ctyy c;
                                private final csuo d;
                                private final ctzp e;
                                private final ctmn f;

                                {
                                    this.a = ctudVar;
                                    this.b = i2;
                                    this.c = ctyyVar;
                                    this.d = csuoVar;
                                    this.e = ctzpVar;
                                    this.f = a;
                                }

                                @Override // defpackage.deff
                                public final dehn a() {
                                    ctud ctudVar2 = this.a;
                                    dehn dehnVar2 = this.b;
                                    ctyy ctyyVar2 = this.c;
                                    csuo csuoVar2 = this.d;
                                    ctzp ctzpVar2 = this.e;
                                    ctmn ctmnVar = this.f;
                                    ctft ctftVar = (ctft) deha.r(dehnVar2);
                                    if (ctftVar.d() != 4) {
                                        return dehnVar2;
                                    }
                                    final dehn i3 = ctudVar2.b.i(UUID.randomUUID(), new ctws(ctyyVar2, ctudVar2.c, csuoVar2, ctudVar2.a.getPackageName(), ctzpVar2.d(), ctftVar.c().b().longValue()), ctudVar2.b.d.a(), ctyyVar2, ctzpVar2, ctmnVar);
                                    return deha.m(i3).a(new deff(i3) { // from class: ctuc
                                        private final dehn a;

                                        {
                                            this.a = i3;
                                        }

                                        @Override // defpackage.deff
                                        public final dehn a() {
                                            dehn dehnVar3 = this.a;
                                            if (((ctft) deha.r(dehnVar3)).d() == 4) {
                                                ctfs e4 = ctft.e();
                                                ((cteu) e4).d = 3;
                                                return deha.a(e4.a());
                                            }
                                            return dehnVar3;
                                        }
                                    }, dege.a);
                                }
                            }, dege.a), e2, 7);
                        }
                        final dehn dehnVar2 = j;
                        final dehn h = deew.h(dehnVar2, new dbrn(this, i, ctyyVar) { // from class: ctdo
                            private final ctdr a;
                            private final int b;
                            private final ctyy c;

                            {
                                this.a = this;
                                this.b = i;
                                this.c = ctyyVar;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj3) {
                                ctdr ctdrVar = this.a;
                                int i3 = this.b;
                                ctyy ctyyVar2 = this.c;
                                ctft ctftVar = (ctft) obj3;
                                if (ctftVar.d() != 2 || !ctftVar.a().a() || !ctftVar.b().a()) {
                                    return null;
                                }
                                ctdrVar.h(ctftVar.a().b(), ctftVar.b().b());
                                ctog ctogVar4 = ctdrVar.e;
                                ctxm r4 = ctxn.r();
                                r4.g(13);
                                r4.f(i3);
                                r4.n(ctyyVar2.b().e());
                                r4.o(ctyyVar2.c().J());
                                ctogVar4.b(r4.a());
                                return null;
                            }
                        }, dege.a);
                        obj = obj2;
                        dehnVar = deha.k(h).b(new Callable(this, dehnVar2, i, ctyyVar, h) { // from class: ctdp
                            private final ctdr a;
                            private final dehn b;
                            private final int c;
                            private final ctyy d;
                            private final dehn e;

                            {
                                this.a = this;
                                this.b = dehnVar2;
                                this.c = i;
                                this.d = ctyyVar;
                                this.e = h;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ctdr ctdrVar = this.a;
                                dehn dehnVar3 = this.b;
                                int i3 = this.c;
                                ctyy ctyyVar2 = this.d;
                                dehn dehnVar4 = this.e;
                                try {
                                    deha.r(dehnVar3);
                                    try {
                                        deha.r(dehnVar4);
                                        return (ctft) deha.r(dehnVar3);
                                    } catch (ExecutionException unused) {
                                        cstl.a("TyRegController");
                                        ctog ctogVar4 = ctdrVar.e;
                                        ctxm r4 = ctxn.r();
                                        r4.g(14);
                                        r4.f(i3);
                                        r4.n(ctyyVar2.b().e());
                                        r4.o(ctyyVar2.c().J());
                                        ctogVar4.b(r4.a());
                                        ctfs e4 = ctft.e();
                                        ((cteu) e4).d = 3;
                                        return e4.a();
                                    }
                                } catch (ExecutionException unused2) {
                                    cstl.a("TyRegController");
                                    ctog ctogVar5 = ctdrVar.e;
                                    ctxm r5 = ctxn.r();
                                    r5.g(14);
                                    r5.f(i3);
                                    r5.n(ctyyVar2.b().e());
                                    r5.o(ctyyVar2.c().J());
                                    ctogVar5.b(r5.a());
                                    ctfs e5 = ctft.e();
                                    ((cteu) e5).d = 3;
                                    return e5.a();
                                }
                            }
                        }, dege.a);
                    }
                    this.m.put(ctyyVar, dehnVar);
                    return dehnVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
        throw th;
    }

    @Override // defpackage.csuu
    public final dehn<csur> a(final ContactId contactId) {
        dbsg<ctyy> b = this.b.b(contactId);
        if (!b.a() || b.b().d() != ctyx.VALID) {
            ctog ctogVar = this.e;
            ctxm r = ctxn.r();
            r.g(7);
            r.n(contactId);
            ctogVar.b(r.a());
            ctmm c = ctmn.c();
            ((ctmh) c).a = "register";
            c.b(ctmr.c);
            final ctmn a = c.a();
            final dehn f = deha.f(new deff(this, contactId, a) { // from class: ctdb
                private final ctdr a;
                private final ContactId b;
                private final ctmn c;

                {
                    this.a = this;
                    this.b = contactId;
                    this.c = a;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    ctdr ctdrVar = this.a;
                    ContactId contactId2 = this.b;
                    ctmn ctmnVar = this.c;
                    ctud ctudVar = ctdrVar.p;
                    csuo csuoVar = ctdrVar.c;
                    csun csunVar = ctdrVar.d;
                    if (contactId2.c() == ContactId.ContactType.EMAIL) {
                        return ctudVar.b.b(UUID.randomUUID(), new ctxc(contactId2, ctudVar.c, csuoVar, ctudVar.a.getPackageName(), csunVar, ctud.a()), ctudVar.b.d.a(), contactId2, ctmnVar, true);
                    }
                    return ctudVar.b.b(UUID.randomUUID(), new ctwu(contactId2, ctudVar.c, csuoVar, ctudVar.a.getPackageName(), csunVar, ctud.a()), ctudVar.b.d.a(), contactId2, ctmnVar, false);
                }
            }, this.o);
            final dehn h = deew.h(f, new dbrn(this) { // from class: ctdk
                private final ctdr a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    ctdr ctdrVar = this.a;
                    ctfv ctfvVar = (ctfv) obj;
                    if (!ctfvVar.b().a() || !ctfvVar.c().a()) {
                        return null;
                    }
                    if (ctfvVar.a() == 0) {
                        ctyy b2 = ctfvVar.b().b();
                        ctdrVar.h(b2, ctfvVar.c().b());
                        for (csuv csuvVar : ctdrVar.f) {
                            b2.b();
                            csuvVar.d();
                        }
                        ctog ctogVar2 = ctdrVar.e;
                        ctxm r2 = ctxn.r();
                        r2.g(1);
                        r2.n(b2.b().e());
                        r2.o(b2.c().J());
                        ctogVar2.b(r2.a());
                        return null;
                    } else if (ctfvVar.a() != 2) {
                        return null;
                    } else {
                        ctdrVar.h(ctfvVar.b().b(), ctfvVar.c().b());
                        return null;
                    }
                }
            }, dege.a);
            return deha.k(h).b(new Callable(this, f, contactId, h) { // from class: ctdm
                private final ctdr a;
                private final dehn b;
                private final ContactId c;
                private final dehn d;

                {
                    this.a = this;
                    this.b = f;
                    this.c = contactId;
                    this.d = h;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ctdr ctdrVar = this.a;
                    dehn dehnVar = this.b;
                    ContactId contactId2 = this.c;
                    dehn dehnVar2 = this.d;
                    try {
                        deha.r(dehnVar);
                        try {
                            deha.r(dehnVar2);
                            csuq b2 = csur.b();
                            int a2 = ((ctfv) dehnVar.get()).a();
                            if (a2 == 0) {
                                b2.b(2);
                            } else if (a2 == 1) {
                                b2.b(3);
                            } else if (a2 == 2) {
                                b2.b(4);
                            }
                            return b2.a();
                        } catch (ExecutionException unused) {
                            cstl.a("TyRegController");
                            ctog ctogVar2 = ctdrVar.e;
                            ctxm r2 = ctxn.r();
                            r2.g(8);
                            r2.n(contactId2);
                            ctogVar2.b(r2.a());
                            csuq b3 = csur.b();
                            b3.b(3);
                            return b3.a();
                        }
                    } catch (ExecutionException unused2) {
                        cstl.a("TyRegController");
                        ctog ctogVar3 = ctdrVar.e;
                        ctxm r3 = ctxn.r();
                        r3.g(8);
                        r3.n(contactId2);
                        ctogVar3.b(r3.a());
                        csuq b4 = csur.b();
                        b4.b(3);
                        return b4.a();
                    }
                }
            }, dege.a);
        }
        csuq b2 = csur.b();
        b2.b(2);
        return deha.a(b2.a());
    }

    @Override // defpackage.csuu
    public final dehn<dbsg<ctyy>> b(final ContactId contactId) {
        return deha.f(new deff(this, contactId) { // from class: ctde
            private final ctdr a;
            private final ContactId b;

            {
                this.a = this;
                this.b = contactId;
            }

            /* JADX WARN: Code restructure failed: missing block: B:47:0x01b3, code lost:
                if (r7 != null) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x01b5, code lost:
                r7.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x01d1, code lost:
                if (r7 != null) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0213, code lost:
                if (r7 != null) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x02c9, code lost:
                if (r6.containsAll(r2) != false) goto L52;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x02d7, code lost:
                if (r12 <= (r0.a().longValue() + r8)) goto L52;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
            @Override // defpackage.deff
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final defpackage.dehn a() {
                /*
                    Method dump skipped, instructions count: 803
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ctde.a():dehn");
            }
        }, this.o);
    }

    @Override // defpackage.csuu
    public final dehn<dcdc<ctyy>> c() {
        return this.o.c(new Callable(this) { // from class: ctdi
            private final ctdr a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctdr ctdrVar = this.a;
                dccx dccxVar = new dccx();
                cusx cusxVar = ctdrVar.b;
                dccx dccxVar2 = new dccx();
                ctip ctipVar = (ctip) cusxVar;
                ctipVar.a.e();
                try {
                    try {
                        Cursor a = ((ctip) cusxVar).a.a(((ctip) cusxVar).i("registration"), new String[]{"registration_id"}, null, null, null, null);
                        while (a != null) {
                            try {
                                if (!a.moveToNext()) {
                                    break;
                                }
                                dbsg<ctyy> d = ((ctip) cusxVar).d(a.getLong(0));
                                if (d.a()) {
                                    dccxVar2.g(d.b());
                                }
                            } catch (Throwable th) {
                                try {
                                    a.close();
                                } catch (Throwable th2) {
                                    deki.a(th, th2);
                                }
                                throw th;
                            }
                        }
                        if (a != null) {
                            a.close();
                        }
                        ((ctip) cusxVar).a.h();
                        ctipVar.a.f();
                        dcdc f = dccxVar2.f();
                        dccxVar.i(f);
                        int size = f.size();
                        for (int i = 0; i < size; i++) {
                            ctyy ctyyVar = (ctyy) f.get(i);
                            if (ctyyVar.d() == ctyx.INVALID) {
                                ctdrVar.g(ctyyVar.b().e());
                            }
                        }
                        return dccxVar.f();
                    } catch (Throwable th3) {
                        ctipVar.a.f();
                        throw th3;
                    }
                } catch (Exception e) {
                    throw new SQLException("Error when executing transaction!!", e);
                }
            }
        });
    }

    @Override // defpackage.ctec
    public final dehn<ctzp> d(final ctyy ctyyVar, boolean z) {
        dbsg<ctzp> dbsgVar;
        synchronized (this.i) {
            dbsgVar = this.l.get(Long.valueOf(ctyyVar.a()));
            if (dbsgVar == null || !dbsgVar.a()) {
                dbsgVar = this.b.c(ctyyVar);
                this.l.put(Long.valueOf(ctyyVar.a()), dbsgVar);
            }
        }
        if (!dbsgVar.a()) {
            return deha.b(new RuntimeException("Missing Auth Token"));
        }
        ctzp b = dbsgVar.b();
        if (!z && b.h() != 1) {
            long longValue = b.b().longValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cstd.a();
            if (longValue > timeUnit.toMicros(System.currentTimeMillis() + cswe.a(this.a).i.f().longValue())) {
                if (e(b)) {
                    i(ctyyVar, b, R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
                    return deha.a(b);
                }
                return deha.a(b);
            }
        }
        return deew.h(i(ctyyVar, b, R.styleable.AppCompatTheme_textColorAlertDialogListItem), new dbrn(this, ctyyVar) { // from class: ctdn
            private final ctdr a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ctdr ctdrVar = this.a;
                ctyy ctyyVar2 = this.b;
                ctft ctftVar = (ctft) obj;
                if (ctftVar.d() != 2 || !ctftVar.b().a()) {
                    synchronized (ctdrVar.j) {
                        ctdrVar.m.remove(ctyyVar2);
                    }
                    return null;
                }
                return ctftVar.b().b();
            }
        }, dege.a);
    }

    public final boolean e(ctzp ctzpVar) {
        long longValue = ctzpVar.c().longValue();
        cstd.a();
        return longValue <= System.currentTimeMillis() - cswe.a(this.a).j.f().longValue();
    }

    @Override // defpackage.ctec
    public final void f(final ContactId contactId) {
        this.o.a(new Runnable(this, contactId) { // from class: ctdq
            private final ctdr a;
            private final ContactId b;

            {
                this.a = this;
                this.b = contactId;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctdr ctdrVar = this.a;
                ContactId contactId2 = this.b;
                cusx cusxVar = ctdrVar.b;
                ContentValues contentValues = new ContentValues();
                contentValues.put("server_registration_status", Integer.valueOf(ctyx.INVALID.c));
                if (((ctip) cusxVar).h(contactId2, contentValues)) {
                    ctdrVar.g(contactId2);
                }
            }
        });
    }

    public final void g(ContactId contactId) {
        if (!this.q.containsKey(contactId)) {
            this.q.put(contactId, deia.a(0.01d));
        }
        if (this.q.get(contactId).c()) {
            for (csuv csuvVar : this.f) {
                csuvVar.b(contactId);
            }
        }
    }

    public final void h(final ctyy ctyyVar, final ctzp ctzpVar) {
        final ctip ctipVar = (ctip) this.b;
        long longValue = ((Long) ctiv.b(ctipVar.a, new Callable(ctipVar, ctyyVar, ctzpVar) { // from class: ctin
            private final ctip a;
            private final ctyy b;
            private final ctzp c;

            {
                this.a = ctipVar;
                this.b = ctyyVar;
                this.c = ctzpVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                long b;
                ctip ctipVar2 = this.a;
                ctyy ctyyVar2 = this.b;
                ctzp ctzpVar2 = this.c;
                Cursor e = ctipVar2.e(ctyyVar2.b());
                try {
                    if (e.moveToFirst()) {
                        b = e.getInt(ctmf.a(1));
                        ctir ctirVar = ctipVar2.a;
                        dbsk.l(ctirVar.g());
                        ctirVar.c(ctipVar2.i("registration"), ctkg.b(ctyyVar2, ctzpVar2), "registration_id =? AND tachyon_app_name =?", new String[]{Long.toString(b), ctyyVar2.e()});
                        ctipVar2.a(b, ctyyVar2.b());
                    } else {
                        ctir ctirVar2 = ctipVar2.a;
                        dbsk.l(ctirVar2.g());
                        b = ctirVar2.b(ctipVar2.i("registration"), ctkg.b(ctyyVar2, ctzpVar2), 0);
                        ctipVar2.a(b, ctyyVar2.b());
                    }
                    if (e != null) {
                        e.close();
                    }
                    return Long.valueOf(b);
                } catch (Throwable th) {
                    if (e != null) {
                        try {
                            e.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
        })).longValue();
        synchronized (this.i) {
            this.l.put(Long.valueOf(longValue), dbsg.i(ctzpVar));
        }
    }
}
