package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cszw  reason: default package */
/* loaded from: classes5.dex */
public final class cszw {
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    private static final Map<ctyy, cszw> w = new HashMap();
    private final Map<String, ctuk> A;
    public final ctyy b;
    public final Context c;
    public final cted d;
    public final cusm e;
    public final csud f;
    public final csuy g;
    public final csul i;
    public final csux j;
    public final ctog k;
    public final cswk l;
    public cszv r;
    private final csyc x;
    private final cswh y;
    private final cswi z;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public final Handler s = new Handler(Looper.getMainLooper());
    public final Object t = new Object();
    public final dehp h = cstu.b().a;
    public final ConcurrentMap<String, cuib> m = new ConcurrentHashMap();
    public final Timer v = new Timer("TypingIndicatorTimer", true);
    final Map<ConversationId, Map<ContactId, Long>> u = new HashMap();
    public final Set<String> n = new HashSet();
    private final Map<ConversationId, Set<String>> B = new HashMap();

    public cszw(Context context, ctyy ctyyVar, cted ctedVar, csul csulVar, csux csuxVar, cusm cusmVar, csud csudVar, csuy csuyVar, csyc csycVar, cswi cswiVar, cswh cswhVar, cswk cswkVar, Map<String, ctuk> map) {
        this.c = context;
        this.b = ctyyVar;
        this.d = ctedVar;
        this.e = cusmVar;
        this.f = csudVar;
        this.g = csuyVar;
        this.x = csycVar;
        this.z = cswiVar;
        this.y = cswhVar;
        this.A = map;
        this.l = cswkVar;
        this.i = csulVar;
        this.j = csuxVar;
        this.k = ctog.a(context);
    }

    public static synchronized cszw c(Context context, ctyy ctyyVar, cted ctedVar, csul csulVar, csux csuxVar, cusm cusmVar, csud csudVar, csuy csuyVar, csyc csycVar, cswi cswiVar, cswh cswhVar, Map<String, ctuk> map) {
        ctyy ctyyVar2;
        Map<ctyy, cszw> map2;
        cszw cszwVar;
        synchronized (cszw.class) {
            Map<ctyy, cszw> map3 = w;
            if (!map3.containsKey(ctyyVar)) {
                map2 = map3;
                ctyyVar2 = ctyyVar;
                map2.put(ctyyVar2, new cszw(context, ctyyVar, ctedVar, csulVar, csuxVar, cusmVar, csudVar, csuyVar, csycVar, cswiVar, cswhVar, new cswk(), map));
            } else {
                ctyyVar2 = ctyyVar;
                map2 = map3;
            }
            cszwVar = map2.get(ctyyVar2);
        }
        return cszwVar;
    }

    private final void r(final Map<ConversationId, Set<String>> map) {
        ctmm c = ctmn.c();
        ((ctmh) c).a = "delivery receipt";
        c.b(ctmr.c);
        final ctmn a2 = c.a();
        for (final ConversationId conversationId : map.keySet()) {
            this.e.L(cute.b(conversationId)).k(new cusr(this, conversationId, map, a2) { // from class: csyv
                private final cszw a;
                private final ConversationId b;
                private final Map c;
                private final ctmn d;

                {
                    this.a = this;
                    this.b = conversationId;
                    this.c = map;
                    this.d = a2;
                }

                @Override // defpackage.cusr
                public final void a(Object obj) {
                    final cszw cszwVar = this.a;
                    final ConversationId conversationId2 = this.b;
                    final Map map2 = this.c;
                    final ctmn ctmnVar = this.d;
                    if (!((cuey) obj).a()) {
                        cszwVar.h.a(new Runnable(cszwVar, conversationId2, map2, ctmnVar) { // from class: cszj
                            private final cszw a;
                            private final ConversationId b;
                            private final Map c;
                            private final ctmn d;

                            {
                                this.a = cszwVar;
                                this.b = conversationId2;
                                this.c = map2;
                                this.d = ctmnVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                final cszw cszwVar2 = this.a;
                                final ConversationId conversationId3 = this.b;
                                final Map map3 = this.c;
                                deha.m(cszwVar2.d.a(cszwVar2.b, conversationId3, dcdc.r((Collection) map3.get(conversationId3)), this.d)).b(new Callable(cszwVar2, map3, conversationId3) { // from class: cszk
                                    private final cszw a;
                                    private final Map b;
                                    private final ConversationId c;

                                    {
                                        this.a = cszwVar2;
                                        this.b = map3;
                                        this.c = conversationId3;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        this.a.e.I(dcdc.r((Collection) this.b.get(this.c)));
                                        return null;
                                    }
                                }, cszwVar2.h);
                            }
                        });
                    }
                }
            });
        }
    }

    private final boolean s(ConversationId conversationId, final long j) {
        final deig d = deig.d();
        this.e.r(conversationId).k(new cusr(j, d) { // from class: csyx
            private final long a;
            private final deig b;

            {
                this.a = j;
                this.b = d;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                long j2 = this.a;
                deig deigVar = this.b;
                dbsg dbsgVar = (dbsg) obj;
                long j3 = cszw.a;
                boolean z = false;
                if (dbsgVar.a() && ((cufp) dbsgVar.b()).g().longValue() >= j2) {
                    z = true;
                }
                deigVar.j(Boolean.valueOf(z));
            }
        });
        try {
            return ((Boolean) d.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            cstl.a("MsgReceiver");
            return false;
        }
    }

    private final boolean t(ctra ctraVar) {
        final deig d = deig.d();
        this.e.r(ctraVar.e()).k(new cusr(d) { // from class: cszb
            private final deig a;

            {
                this.a = d;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                long j = cszw.a;
                this.a.j((dbsg) obj);
            }
        });
        try {
            dbsg dbsgVar = (dbsg) d.get();
            if (dbsgVar.a()) {
                cufp cufpVar = (cufp) dbsgVar.b();
                if (cufpVar.a().c().equals(ConversationId.IdType.ONE_TO_ONE)) {
                    return true;
                }
                dbsg<ctqs> a2 = ctul.a(cufpVar.i());
                return !a2.a() || a2.b().d().contains(ctraVar.d());
            }
            String valueOf = String.valueOf(ctraVar.e());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("Received receipt for unknown conversation ");
            sb.append(valueOf);
            sb.toString();
            cstl.a("MsgReceiver");
            return false;
        } catch (Exception unused) {
            cstl.a("MsgReceiver");
            return false;
        }
    }

    public final synchronized void a() {
        h(dcdc.r(this.n));
        this.n.clear();
    }

    public final synchronized void b() {
        r(dcdn.r(this.B));
        this.B.clear();
    }

    public final synchronized dehn<Void> d() {
        if (this.o) {
            if (!cswe.a(this.c).b.f().booleanValue()) {
                return deha.a(null);
            }
            return csvs.a(cswe.a(this.c).f.f().longValue(), new dbty(this) { // from class: csys
                private final cszw a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return this.a.e();
                }
            }, this.h);
        }
        if (cswe.a(this.c).c.f().booleanValue()) {
            csvs.a(cswe.a(this.c).e.f().longValue(), new dbty(this) { // from class: cszd
                private final cszw a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return this.a.f();
                }
            }, this.h);
        }
        return e();
    }

    public final dehn<Void> e() {
        ctmm c = ctmn.c();
        ((ctmh) c).a = "pull once";
        c.b(ctmr.c);
        final ctmn a2 = c.a();
        final dehn f = deha.f(new deff(this, a2) { // from class: cszl
            private final cszw a;
            private final ctmn b;

            {
                this.a = this;
                this.b = a2;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cszw cszwVar = this.a;
                ctmn ctmnVar = this.b;
                cted ctedVar = cszwVar.d;
                ctyy ctyyVar = cszwVar.b;
                cttz cttzVar = (cttz) ctedVar;
                return cttzVar.a.a(UUID.randomUUID(), new ctwk(ctyyVar, cttzVar.b, cttzVar.f), cttzVar.a.d.b(), ctyyVar, ctmnVar, true);
            }
        }, this.h);
        return deha.k(deee.g(deew.g(f, new defg(this) { // from class: cszm
            private final cszw a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                return this.a.h(((ctfp) obj).b());
            }
        }, this.h), Exception.class, cszn.a, dege.a), deee.g(deew.h(f, new dbrn(this) { // from class: cszo
            private final cszw a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cszw cszwVar = this.a;
                List<ctrg> a3 = ((ctfp) obj).a();
                for (ctrg ctrgVar : a3) {
                    cszwVar.j(ctrgVar);
                }
                cszwVar.i(a3);
                return null;
            }
        }, this.h), Exception.class, cszp.a, dege.a)).a(new deff(this, f) { // from class: cszq
            private final cszw a;
            private final dehn b;

            {
                this.a = this;
                this.b = f;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cszw cszwVar = this.a;
                try {
                    if (!((ctfp) this.b.get()).c()) {
                        return cszwVar.d();
                    }
                } catch (ExecutionException unused) {
                    cstl.a("MsgReceiver");
                }
                return deha.a(null);
            }
        }, dege.a);
    }

    public final synchronized dehn<Void> f() {
        if (!this.q && !this.o) {
            this.q = true;
            this.p = false;
            this.j.L(1);
            final cszv cszvVar = new cszv(this);
            ctmm c = ctmn.c();
            ((ctmh) c).a = "stream open";
            c.b(ctmr.c);
            final ctmn a2 = c.a();
            return deha.k(deha.m(deha.f(new deff(this, cszvVar, a2) { // from class: cszr
                private final cszw a;
                private final cszv b;
                private final ctmn c;

                {
                    this.a = this;
                    this.b = cszvVar;
                    this.c = a2;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    cszw cszwVar = this.a;
                    final cszv cszvVar2 = this.b;
                    ctmn ctmnVar = this.c;
                    cted ctedVar = cszwVar.d;
                    final ctyy ctyyVar = cszwVar.b;
                    cttz cttzVar = (cttz) ctedVar;
                    final ctss ctssVar = cttzVar.a;
                    final UUID randomUUID = UUID.randomUUID();
                    final ctwo ctwoVar = new ctwo(ctyyVar, cttzVar.b, cttzVar.f);
                    final dehn a3 = deha.a(new ctst((dxtj) dxtj.b(new dxtg(), cttzVar.a.d.c)));
                    if (cswe.a(ctssVar.a).aq.f().booleanValue()) {
                        final ContactId e = ctyyVar.b().e();
                        return ctssVar.c(ctyyVar, e, new defg(ctssVar, randomUUID, cszvVar2, ctwoVar, a3, e, ctyyVar) { // from class: ctsg
                            private final ctss a;
                            private final UUID b;
                            private final ctfw c;
                            private final dehn d;
                            private final ContactId e;
                            private final ctyy f;
                            private final ctwo g;

                            {
                                this.a = ctssVar;
                                this.b = randomUUID;
                                this.c = cszvVar2;
                                this.g = ctwoVar;
                                this.d = a3;
                                this.e = e;
                                this.f = ctyyVar;
                            }

                            @Override // defpackage.defg
                            public final dehn a(Object obj) {
                                ctss ctssVar2 = this.a;
                                UUID uuid = this.b;
                                ctfw ctfwVar = this.c;
                                ctwo ctwoVar2 = this.g;
                                dehn dehnVar = this.d;
                                ContactId contactId = this.e;
                                Void r8 = (Void) obj;
                                return ctssVar2.k(uuid, ctfwVar, ctwoVar2, ctssVar2.e(dehnVar, contactId), this.f);
                            }
                        }, 0, ctmnVar, true);
                    } else if (ctssVar.e == null) {
                        return deha.b(new RuntimeException("tachyonRegistrationHandler is null"));
                    } else {
                        if (ctssVar.f == null) {
                            return deha.b(new RuntimeException("oAuthTokenProvider is null"));
                        }
                        final ContactId e2 = ctyyVar.b().e();
                        final dehn j = ctssVar.j(ctssVar.k(randomUUID, cszvVar2, ctwoVar, ctssVar.e(a3, e2), ctyyVar), e2, 6);
                        final dehn<Boolean> f = ctssVar.f(j, ctyyVar, true);
                        dehn a4 = deha.k(f).a(new deff(ctssVar, f, randomUUID, cszvVar2, ctwoVar, a3, e2, ctyyVar, j) { // from class: ctru
                            private final ctss a;
                            private final dehn b;
                            private final UUID c;
                            private final ctfw d;
                            private final dehn e;
                            private final ContactId f;
                            private final ctyy g;
                            private final dehn h;
                            private final ctwo i;

                            {
                                this.a = ctssVar;
                                this.b = f;
                                this.c = randomUUID;
                                this.d = cszvVar2;
                                this.i = ctwoVar;
                                this.e = a3;
                                this.f = e2;
                                this.g = ctyyVar;
                                this.h = j;
                            }

                            @Override // defpackage.deff
                            public final dehn a() {
                                ctss ctssVar2 = this.a;
                                dehn dehnVar = this.b;
                                UUID uuid = this.c;
                                ctfw ctfwVar = this.d;
                                ctwo ctwoVar2 = this.i;
                                dehn dehnVar2 = this.e;
                                ContactId contactId = this.f;
                                return ((Boolean) deha.r(dehnVar)).booleanValue() ? ctssVar2.k(uuid, ctfwVar, ctwoVar2, ctssVar2.e(dehnVar2, contactId), this.g) : this.h;
                            }
                        }, dege.a);
                        return ctmnVar.b().a() == 0 ? a4 : ctssVar.g(a4, new ctsn(ctssVar, ctmnVar, randomUUID, cszvVar2, ctwoVar, a3, e2, ctyyVar));
                    }
                }
            }, this.h)).b(new Callable(this, cszvVar) { // from class: cszs
                private final cszw a;
                private final cszv b;

                {
                    this.a = this;
                    this.b = cszvVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cszw cszwVar = this.a;
                    cszv cszvVar2 = this.b;
                    synchronized (cszwVar) {
                        if (cszwVar.p) {
                            cstl.a("MsgReceiver");
                            return null;
                        }
                        cszwVar.r = cszvVar2;
                        cszwVar.o = true;
                        cszwVar.p = false;
                        cszwVar.j.L(2);
                        if (String.valueOf(cszwVar.b.b().e().a()).length() == 0) {
                            new String("BindV2 stream opened for ");
                        }
                        cstl.a("MsgReceiver");
                        return null;
                    }
                }
            }, dege.a)).b(new Callable(this) { // from class: csyt
                private final cszw a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cszw cszwVar = this.a;
                    synchronized (cszwVar) {
                        cszwVar.q = false;
                    }
                    return null;
                }
            }, dege.a);
        }
        return deha.a(null);
    }

    public final synchronized void g() {
        ctsq ctsqVar;
        dyyx dyyxVar;
        if (!this.o) {
            return;
        }
        cszv cszvVar = this.r;
        if (cszvVar != null && (ctsqVar = cszvVar.b) != null && (dyyxVar = ctsqVar.a.a) != null) {
            ((dyyy) dyyxVar).a.d("", dyjb.c.l());
        }
        p();
    }

    public final dehn<Void> h(final List<String> list) {
        if (list.isEmpty()) {
            return deha.a(null);
        }
        ctmm c = ctmn.c();
        ((ctmh) c).a = "ack messages";
        c.b(ctmr.c);
        final ctmn a2 = c.a();
        return deha.f(new deff(this, list, a2) { // from class: csyu
            private final cszw a;
            private final List b;
            private final ctmn c;

            {
                this.a = this;
                this.b = list;
                this.c = a2;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cszw cszwVar = this.a;
                List list2 = this.b;
                ctmn ctmnVar = this.c;
                cted ctedVar = cszwVar.d;
                ctyy ctyyVar = cszwVar.b;
                cttz cttzVar = (cttz) ctedVar;
                return cttzVar.a.a(UUID.randomUUID(), new ctvl(ctyyVar, list2), cttzVar.a.d.b(), ctyyVar, ctmnVar, true);
            }
        }, this.h);
    }

    public final void i(List<ctrg> list) {
        if (!cswe.a(this.c).G.f().booleanValue()) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (ctrg ctrgVar : list) {
            int m = ctrgVar.m();
            int i = m - 1;
            if (m == 0) {
                throw null;
            }
            if (i == 0) {
                ConversationId c = ctrgVar.e().c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, new HashSet());
                }
                int o = ctrgVar.e().o();
                if (o == 0) {
                    throw null;
                }
                if (o == 1) {
                    hashMap.get(c).add(ctrgVar.e().a());
                }
            }
        }
        if (cswe.a(this.c).w.f().longValue() > 0) {
            synchronized (this) {
                if (this.B.isEmpty() && !hashMap.isEmpty()) {
                    this.s.postDelayed(new Runnable(this) { // from class: csyw
                        private final cszw a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.b();
                        }
                    }, cswe.a(this.c).w.f().longValue());
                }
                for (ConversationId conversationId : hashMap.keySet()) {
                    if (!this.B.containsKey(conversationId)) {
                        this.B.put(conversationId, hashMap.get(conversationId));
                    } else {
                        this.B.get(conversationId).addAll(hashMap.get(conversationId));
                    }
                }
            }
            return;
        }
        r(hashMap);
    }

    public final void j(ctrg ctrgVar) {
        boolean s;
        if (csvo.a(this.c).c()) {
            int m = ctrgVar.m();
            int i = m - 1;
            if (m == 0) {
                throw null;
            }
            if (i != 0) {
                if (i == 4 && ctrgVar.i().c() == 1) {
                    s = s(ctrgVar.i().b().a(), ctrgVar.i().b().b());
                }
            } else {
                s = s(ctrgVar.e().c(), ctrgVar.e().d().longValue());
            }
            if (s) {
                int m2 = ctrgVar.m();
                String a2 = ctre.a(m2);
                if (m2 == 0) {
                    throw null;
                }
                if (a2.length() == 0) {
                    new String("dropping message of type ");
                }
                cstl.a("MsgReceiver");
                ctxm r = ctxn.r();
                r.g(15);
                r.n(this.b.b().e());
                r.o(this.b.c().J());
                r.f(58);
                if (ctrgVar.k() != null) {
                    r.d(ctrgVar.k());
                }
                this.k.b(r.a());
                return;
            }
        }
        int m3 = ctrgVar.m();
        int i2 = m3 - 1;
        if (m3 != 0) {
            if (i2 == 0) {
                k(ctrgVar, true);
                return;
            } else if (i2 == 1) {
                ctqy f = ctrgVar.f();
                int b = f.b().b();
                int i3 = b - 1;
                if (b == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    if (f.c().b()) {
                        this.f.a(this.b);
                    }
                    if (!f.c().a().a() || !f.c().c().a()) {
                        return;
                    }
                    this.z.v(this.b, f.c().a().b(), f.c().c().b());
                    return;
                } else if (i3 == 1) {
                    if (!f.b().c().a()) {
                        return;
                    }
                    this.f.a(this.b);
                    return;
                } else if (i3 == 2) {
                    this.e.M(f.d().a(), f.d().b().a());
                    return;
                } else if (i3 == 3) {
                    this.e.O(f.e().a(), f.e().b().a());
                    return;
                } else if (i3 != 4) {
                    return;
                } else {
                    this.e.at(f.f().a());
                    if (f.f().b().a()) {
                        this.e.M(f.f().a().a(), f.f().b().b().a());
                    }
                    this.f.a(this.b);
                    return;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    final ctri h = ctrgVar.h();
                    if (!o()) {
                        return;
                    }
                    cusl.d(this.e.L(cute.b(h.b())), csze.a).k(new cusr(this, h) { // from class: cszf
                        private final cszw a;
                        private final ctri b;

                        {
                            this.a = this;
                            this.b = h;
                        }

                        @Override // defpackage.cusr
                        public final void a(Object obj) {
                            final cszw cszwVar = this.a;
                            final ctri ctriVar = this.b;
                            if (((Boolean) obj).booleanValue()) {
                                return;
                            }
                            ConversationId b2 = ctriVar.b();
                            ContactId c = ctriVar.c();
                            cstd.a();
                            long currentTimeMillis = System.currentTimeMillis();
                            synchronized (cszwVar.t) {
                                if (ctriVar.d() == 1) {
                                    long millis = TimeUnit.MICROSECONDS.toMillis(ctriVar.e());
                                    cszwVar.g.b(b2, c, ctriVar.f());
                                    long j = currentTimeMillis + millis;
                                    if (!cszwVar.u.containsKey(b2)) {
                                        cszwVar.u.put(b2, new HashMap());
                                    }
                                    cszwVar.u.get(b2).put(c, Long.valueOf(j));
                                    if (millis > 0) {
                                        cszwVar.v.schedule(new cszt(cszwVar, b2, c), millis);
                                    }
                                    ctog ctogVar = cszwVar.k;
                                    ctxm r2 = ctxn.r();
                                    r2.g(47);
                                    r2.f(347);
                                    r2.n(cszwVar.b.b().e());
                                    r2.o(cszwVar.b.c().J());
                                    r2.p(ctriVar.a());
                                    r2.d(ctriVar.b());
                                    ctogVar.b(r2.a());
                                } else if (ctriVar.d() == 2) {
                                    cszwVar.g.c(b2, c, ctriVar.f());
                                    cszwVar.n(b2, c);
                                    ctog ctogVar2 = cszwVar.k;
                                    ctxm r3 = ctxn.r();
                                    r3.g(47);
                                    r3.f(348);
                                    r3.n(cszwVar.b.b().e());
                                    r3.o(cszwVar.b.c().J());
                                    r3.p(ctriVar.a());
                                    r3.d(ctriVar.b());
                                    ctogVar2.b(r3.a());
                                } else {
                                    ctog ctogVar3 = cszwVar.k;
                                    ctxm r4 = ctxn.r();
                                    r4.g(47);
                                    r4.f(341);
                                    r4.n(cszwVar.b.b().e());
                                    r4.o(cszwVar.b.c().J());
                                    r4.p(ctriVar.a());
                                    r4.d(ctriVar.b());
                                    ctogVar3.b(r4.a());
                                }
                                cszwVar.s.post(new Runnable(cszwVar, ctriVar) { // from class: cszg
                                    private final cszw a;
                                    private final ctri b;

                                    {
                                        this.a = cszwVar;
                                        this.b = ctriVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        cszw cszwVar2 = this.a;
                                        ctri ctriVar2 = this.b;
                                        csul csulVar = cszwVar2.i;
                                        ctriVar2.b();
                                        ((ctct) csulVar).o.post(new Runnable() { // from class: ctbi
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                            }
                                        });
                                    }
                                });
                            }
                        }
                    });
                    return;
                } else if (i2 != 4) {
                    if (i2 != 5) {
                        return;
                    }
                    ctrc j = ctrgVar.j();
                    if (ConversationId.IdType.GROUP.equals(j.a().c())) {
                        this.z.v(this.b, j.a(), j.b());
                        return;
                    }
                    final ContactId e = j.a().e();
                    cswh cswhVar = this.y;
                    final ctyy ctyyVar = this.b;
                    final ctqu b2 = j.b();
                    final ctct ctctVar = (ctct) cswhVar;
                    ctctVar.e.a(ctyyVar).u(e).k(new cusr(ctctVar, ctyyVar, e, b2) { // from class: ctbu
                        private final ctct a;
                        private final ctyy b;
                        private final ContactId c;
                        private final ctqu d;

                        {
                            this.a = ctctVar;
                            this.b = ctyyVar;
                            this.c = e;
                            this.d = b2;
                        }

                        @Override // defpackage.cusr
                        public final void a(Object obj) {
                            final ctct ctctVar2 = this.a;
                            final ctyy ctyyVar2 = this.b;
                            ContactId contactId = this.c;
                            final ctqu ctquVar = this.d;
                            dbsg dbsgVar = (dbsg) obj;
                            if (!dbsgVar.a()) {
                                String valueOf = String.valueOf(contactId);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                                sb.append("Profile changes received for non-existent contactId: ");
                                sb.append(valueOf);
                                sb.toString();
                                cstl.a("LiMsgController");
                                return;
                            }
                            final cufj cufjVar = (cufj) dbsgVar.b();
                            if (!ctquVar.l().a() || cufjVar.l().longValue() <= ctquVar.l().b().longValue()) {
                                String valueOf2 = String.valueOf(ctquVar);
                                String valueOf3 = String.valueOf(contactId);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31 + String.valueOf(valueOf3).length());
                                sb2.append("Profile changes: ");
                                sb2.append(valueOf2);
                                sb2.append(" for contact: ");
                                sb2.append(valueOf3);
                                sb2.toString();
                                cstl.a("LiMsgController");
                                ctctVar2.d.a(new Runnable(ctctVar2, ctyyVar2, cufjVar, ctquVar) { // from class: ctbv
                                    private final ctct a;
                                    private final ctyy b;
                                    private final cufj c;
                                    private final ctqu d;

                                    {
                                        this.a = ctctVar2;
                                        this.b = ctyyVar2;
                                        this.c = cufjVar;
                                        this.d = ctquVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte[] b3;
                                        int length;
                                        ctct ctctVar3 = this.a;
                                        ctyy ctyyVar3 = this.b;
                                        cufj cufjVar2 = this.c;
                                        ctqu ctquVar2 = this.d;
                                        int nextInt = ctctVar3.j.nextInt((int) dxzy.w());
                                        long v = dxzy.v();
                                        cufi m4 = cufjVar2.m();
                                        cstd.a();
                                        m4.e(Long.valueOf(System.currentTimeMillis() + nextInt + v));
                                        if (!TextUtils.isEmpty(ctquVar2.a())) {
                                            m4.k(ctquVar2.a());
                                        }
                                        dbsg<String> b4 = ctquVar2.b();
                                        if (b4.a() && !TextUtils.isEmpty(b4.b())) {
                                            m4.b(b4.b());
                                        }
                                        if (ctct.F(cufjVar2.d(), ctquVar2)) {
                                            m4.g(ctquVar2.c().b());
                                            m4.h(true);
                                        } else if (ctquVar2.d().a() && (length = (b3 = ctquVar2.d().b()).length) > 0) {
                                            m4.f(BitmapFactory.decodeByteArray(b3, 0, length));
                                        }
                                        if (ctquVar2.j().a()) {
                                            m4.i(ctquVar2.j().b());
                                        }
                                        if (ctquVar2.k().a()) {
                                            m4.d(ctquVar2.k().b());
                                        }
                                        if (ctquVar2.l().a()) {
                                            m4.l(ctquVar2.l().b().longValue());
                                        }
                                        m4.j(ctquVar2.h());
                                        m4.m(ctquVar2.i());
                                        cufj a3 = m4.a();
                                        ctctVar3.H(ctyyVar3).ar(a3);
                                        if (!cufjVar2.d().equals(a3.d()) || !a3.e().a()) {
                                            ctctVar3.p.d(ctyyVar3, a3);
                                        }
                                    }
                                });
                                return;
                            }
                            cstl.a("LiMsgController");
                        }
                    });
                    return;
                } else {
                    ctql i4 = ctrgVar.i();
                    if (i4.c() == 1) {
                        csyc csycVar = this.x;
                        ctyy ctyyVar2 = this.b;
                        ctqo b3 = i4.b();
                        csycVar.a.a(ctyyVar2).j(b3.a(), b3.b());
                        return;
                    }
                    int c = i4.c();
                    String str = c != 1 ? "null" : "DELETE_CONVERSATION";
                    if (c == 0) {
                        throw null;
                    }
                    if (str.length() == 0) {
                        new String("Unsupported cloudUpdate type : ");
                    }
                    cstl.a("MsgReceiver");
                    return;
                }
            } else {
                final ctra g = ctrgVar.g();
                if (g.a() == 0) {
                    if (t(g)) {
                        this.e.A(g.e(), g.c(), Arrays.asList(cugo.OUTGOING_SENT, cugo.OUTGOING_SENDING), cugo.OUTGOING_DELIVERED);
                        for (String str2 : g.c()) {
                            ctog ctogVar = this.k;
                            ctxm r2 = ctxn.r();
                            r2.g(22);
                            r2.n(this.b.b().e());
                            r2.o(this.b.c().J());
                            r2.p(str2);
                            r2.d(g.e());
                            ctogVar.b(r2.a());
                        }
                    }
                    ctog ctogVar2 = this.k;
                    ctxm r3 = ctxn.r();
                    r3.g(16);
                    r3.n(this.b.b().e());
                    r3.o(this.b.c().J());
                    r3.p(g.b());
                    r3.d(g.e());
                    ctogVar2.b(r3.a());
                } else if (g.a() != 1 || !csvo.a(this.c).s()) {
                    if (g.a() == 2 && cswe.a(this.c).E.f().booleanValue()) {
                        this.e.A(g.e(), g.c(), Arrays.asList(cugo.OUTGOING_DELIVERED, cugo.OUTGOING_SENT, cugo.OUTGOING_SENDING), cugo.OUTGOING_FAILED_TO_DELIVER);
                        for (String str3 : g.c()) {
                            ctog ctogVar3 = this.k;
                            ctxm r4 = ctxn.r();
                            r4.g(45);
                            r4.n(this.b.b().e());
                            r4.o(this.b.c().J());
                            r4.p(str3);
                            r4.d(g.e());
                            ctogVar3.b(r4.a());
                        }
                        ctog ctogVar4 = this.k;
                        ctxm r5 = ctxn.r();
                        r5.g(21);
                        r5.n(this.b.b().e());
                        r5.o(this.b.c().J());
                        r5.p(g.b());
                        r5.d(g.e());
                        ctogVar4.b(r5.a());
                    }
                } else {
                    if (t(g)) {
                        this.e.A(g.e(), g.c(), Arrays.asList(cugo.OUTGOING_DELIVERED, cugo.OUTGOING_SENT, cugo.OUTGOING_SENDING), cugo.OUTGOING_READ);
                        this.e.A(g.e(), g.c(), Arrays.asList(cugo.INCOMING_READ, cugo.INCOMING_RECEIVED), cugo.INCOMING_READ_RECEIPT_SENT);
                        for (String str4 : g.c()) {
                            ctog ctogVar5 = this.k;
                            ctxm r6 = ctxn.r();
                            r6.g(44);
                            r6.n(this.b.b().e());
                            r6.o(this.b.c().J());
                            r6.p(str4);
                            r6.d(g.e());
                            ctogVar5.b(r6.a());
                        }
                    }
                    ctog ctogVar6 = this.k;
                    ctxm r7 = ctxn.r();
                    r7.g(17);
                    r7.n(this.b.b().e());
                    r7.o(this.b.c().J());
                    r7.p(g.b());
                    r7.d(g.e());
                    ctogVar6.b(r7.a());
                }
                this.s.post(new Runnable(this, g) { // from class: cszc
                    private final cszw a;
                    private final ctra b;

                    {
                        this.a = this;
                        this.b = g;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cszw cszwVar = this.a;
                        ctra ctraVar = this.b;
                        csul csulVar = cszwVar.i;
                        ctraVar.e();
                        ((ctct) csulVar).o.post(new Runnable() { // from class: ctbh
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                });
                return;
            }
        }
        throw null;
    }

    public final void k(final ctrg ctrgVar, final boolean z) {
        final cugu e = ctrgVar.e();
        ctog ctogVar = this.k;
        ctxm r = ctxn.r();
        r.g(3);
        r.n(this.b.b().e());
        r.o(this.b.c().J());
        r.p(e.a());
        r.d(e.c());
        ctyi c = ctyj.c();
        c.c(e.l());
        c.b(e.k().a().h);
        r.i(c.a());
        ctogVar.b(r.a());
        int a2 = e.f().a();
        if (a2 == 0) {
            throw null;
        }
        if (a2 == 3 && this.A.containsKey(e.f().b().a())) {
            this.A.get(e.f().b().a()).d(this.b, e, this.k);
        }
        if (this.e.a(e.a())) {
            cstl.a("MsgReceiver");
        } else {
            new cusd(cswe.b(cswe.a(this.c).C, this.h), new dbrn(this, z, e) { // from class: csyy
                private final cszw a;
                private final boolean b;
                private final cugu c;

                {
                    this.a = this;
                    this.b = z;
                    this.c = e;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    cszw cszwVar = this.a;
                    boolean z2 = this.b;
                    cugu cuguVar = this.c;
                    if (!((Boolean) obj).booleanValue() || !z2) {
                        return cusl.d(cszwVar.e.L(cute.b(cuguVar.c())), cszi.a);
                    }
                    csud csudVar = cszwVar.f;
                    ctyy ctyyVar = cszwVar.b;
                    csxc csxcVar = (csxc) csudVar;
                    return new cusd(deew.h(cswe.b(cswe.a(csxcVar.b).r, csxcVar.c), new dbrn(csxcVar, ctyyVar) { // from class: cswz
                        private final csxc a;
                        private final ctyy b;

                        {
                            this.a = csxcVar;
                            this.b = ctyyVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            csxc csxcVar2 = this.a;
                            return Long.valueOf(((Long) obj2).longValue() + Long.valueOf(csxcVar2.d.a(this.b).getLong("BLOCK_LAST_SYNC_KEY", 0L)).longValue());
                        }
                    }, csxcVar.c), new dbrn(csxcVar, ctyyVar, cuguVar.c()) { // from class: csxa
                        private final csxc a;
                        private final ctyy b;
                        private final ConversationId c;

                        {
                            this.a = csxcVar;
                            this.b = ctyyVar;
                            this.c = r3;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            return this.a.c(this.b, this.c, new dbsl((Long) obj2) { // from class: csws
                                private final Long a;

                                {
                                    this.a = r1;
                                }

                                @Override // defpackage.dbsl
                                public final boolean a(Object obj3) {
                                    Long l = this.a;
                                    cuey cueyVar = (cuey) obj3;
                                    cstd.a();
                                    return System.currentTimeMillis() > l.longValue();
                                }
                            });
                        }
                    }, csxcVar.c);
                }
            }, this.h).k(new cusr(this, ctrgVar, e) { // from class: csyz
                private final cszw a;
                private final ctrg b;
                private final cugu c;

                {
                    this.a = this;
                    this.b = ctrgVar;
                    this.c = e;
                }

                @Override // defpackage.cusr
                public final void a(Object obj) {
                    final cszw cszwVar = this.a;
                    final ctrg ctrgVar2 = this.b;
                    final cugu cuguVar = this.c;
                    if (!((Boolean) obj).booleanValue()) {
                        cszwVar.h.a(new Runnable(cszwVar, cuguVar, ctrgVar2) { // from class: csza
                            private final cszw a;
                            private final cugu b;
                            private final ctrg c;

                            {
                                this.a = cszwVar;
                                this.b = cuguVar;
                                this.c = ctrgVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                final cszw cszwVar2 = this.a;
                                final cugu cuguVar2 = this.b;
                                final ctrg ctrgVar3 = this.c;
                                if (cszwVar2.o()) {
                                    cszwVar2.g.c(cuguVar2.c(), cuguVar2.b(), cuguVar2.d().longValue());
                                }
                                if (csvo.a(cszwVar2.c).e()) {
                                    cuib a3 = ctrgVar3.a();
                                    if (cuguVar2.f().a() != 5) {
                                        cszwVar2.l(cuguVar2);
                                        String a4 = cuguVar2.a();
                                        if (a3 != null) {
                                            cszwVar2.e.d(a3);
                                        } else {
                                            cuib cuibVar = cszwVar2.m.get(a4);
                                            if (cuibVar != null) {
                                                cszwVar2.m(cuibVar);
                                            }
                                        }
                                    } else {
                                        cszwVar2.m.put(a3.b(), a3);
                                        cszwVar2.m(a3);
                                        ctog ctogVar2 = cszwVar2.k;
                                        ctxm r2 = ctxn.r();
                                        r2.g(10020);
                                        r2.n(cszwVar2.b.b().e());
                                        r2.o(cszwVar2.b.c().J());
                                        r2.p(a3.b());
                                        ctogVar2.b(r2.a());
                                    }
                                } else {
                                    cszwVar2.l(cuguVar2);
                                }
                                cszwVar2.s.post(new Runnable(cszwVar2, cuguVar2, ctrgVar3) { // from class: cszh
                                    private final cszw a;
                                    private final cugu b;
                                    private final ctrg c;

                                    {
                                        this.a = cszwVar2;
                                        this.b = cuguVar2;
                                        this.c = ctrgVar3;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        cszw cszwVar3 = this.a;
                                        final cugu cuguVar3 = this.b;
                                        ctrg ctrgVar4 = this.c;
                                        csul csulVar = cszwVar3.i;
                                        final ctyy ctyyVar = cszwVar3.b;
                                        ctrgVar4.b();
                                        final ctct ctctVar = (ctct) csulVar;
                                        ctctVar.d.a(new Runnable(ctctVar, ctyyVar, cuguVar3) { // from class: ctbf
                                            private final ctct a;
                                            private final ctyy b;
                                            private final cugu c;

                                            {
                                                this.a = ctctVar;
                                                this.b = ctyyVar;
                                                this.c = cuguVar3;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ctct ctctVar2 = this.a;
                                                ctyy ctyyVar2 = this.b;
                                                cugu cuguVar4 = this.c;
                                                ctctVar2.a(ctyyVar2, cuguVar4.c()).l();
                                                ctctVar2.p.a(ctyyVar2, cuguVar4.b()).l();
                                            }
                                        });
                                        ctctVar.o.post(new Runnable(ctctVar, ctyyVar, cuguVar3) { // from class: ctbg
                                            private final ctct a;
                                            private final ctyy b;
                                            private final cugu c;

                                            {
                                                this.a = ctctVar;
                                                this.b = ctyyVar;
                                                this.c = cuguVar3;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ctct ctctVar2 = this.a;
                                                ctyy ctyyVar2 = this.b;
                                                cugu cuguVar4 = this.c;
                                                aqak aqakVar = (aqak) ctctVar2.c;
                                                aqakVar.c(ctyyVar2, new Runnable(aqakVar, ctyyVar2, cuguVar4) { // from class: aqab
                                                    private final aqak a;
                                                    private final ctyy b;
                                                    private final cugu c;

                                                    {
                                                        this.a = aqakVar;
                                                        this.b = ctyyVar2;
                                                        this.c = cuguVar4;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        final aqak aqakVar2 = this.a;
                                                        ctyy ctyyVar3 = this.b;
                                                        if (!this.c.c().equals(aqakVar2.e.a().b())) {
                                                            if (!aqda.a(ctyyVar3, aqakVar2.o.a().j())) {
                                                                if (!aqakVar2.d.a()) {
                                                                    return;
                                                                }
                                                                bvqj.e(aqakVar2.g.a().a(ctyyVar3), new bvqg(aqakVar2) { // from class: aqac
                                                                    private final aqak a;

                                                                    {
                                                                        this.a = aqakVar2;
                                                                    }

                                                                    @Override // defpackage.bvqg
                                                                    public final void NU(Object obj2) {
                                                                        aqak aqakVar3 = this.a;
                                                                        dbsg dbsgVar = (dbsg) obj2;
                                                                        if (dbsgVar == null || !dbsgVar.a()) {
                                                                            return;
                                                                        }
                                                                        aqakVar3.a((btlu) dbsgVar.b());
                                                                    }
                                                                }, dege.a);
                                                                return;
                                                            }
                                                            btlu j = aqakVar2.o.a().j();
                                                            dbsk.s(j);
                                                            aqakVar2.a(j);
                                                            aqakVar2.f.a().a(ctyyVar3);
                                                        }
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        return;
                    }
                    ctog ctogVar2 = cszwVar.k;
                    ctxm r2 = ctxn.r();
                    r2.g(15);
                    r2.n(cszwVar.b.b().e());
                    r2.o(cszwVar.b.c().J());
                    r2.p(cuguVar.a());
                    r2.d(cuguVar.c());
                    r2.f(51);
                    ctogVar2.b(r2.a());
                }
            });
        }
    }

    public final void l(cugu cuguVar) {
        if (cuguVar.k().a() == cugt.TOMBSTONE) {
            this.e.e(cuguVar);
        } else {
            this.e.f(cuguVar);
        }
    }

    public final void m(cuib cuibVar) {
        if (((Boolean) this.e.d(cuibVar).second).booleanValue()) {
            this.m.remove(cuibVar.b());
            ctog ctogVar = this.k;
            ctxm r = ctxn.r();
            r.g(10021);
            r.n(this.b.b().e());
            r.o(this.b.c().J());
            r.p(cuibVar.b());
            ctogVar.b(r.a());
        }
    }

    public final void n(ConversationId conversationId, ContactId contactId) {
        if (!this.u.containsKey(conversationId)) {
            return;
        }
        this.u.get(conversationId).remove(contactId);
        if (!this.u.get(conversationId).isEmpty()) {
            return;
        }
        this.u.remove(conversationId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        return dxzy.a.a().L() || (csvo.a(this.c).q() && dxzy.a.a().n());
    }

    public final synchronized void p() {
        this.r = null;
        this.o = false;
        this.p = true;
        if (String.valueOf(this.b.b().e().a()).length() == 0) {
            new String("BindV2 stream closed for ");
        }
        cstl.a("MsgReceiver");
    }

    public final synchronized void q() {
        this.l.a();
        f();
    }
}
