package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ctct  reason: default package */
/* loaded from: classes5.dex */
public final class ctct implements csuk, csul, csux, cswi, cswh {
    private final Executor B;
    private final HashSet<ctyy> C;
    private BroadcastReceiver E;
    public final Context a;
    public final cted b;
    public final csuh c;
    public final dehp d;
    public final ctgc e;
    public final ctog f;
    public final csyc g;
    public final Random j;
    public final csuj k;
    public final ctdt l;
    public csuf p;
    public csud q;
    public csuy r;
    public final Map<String, ctuk> s;
    public HashSet<ctyy> t;
    public final Map<ctyy, Pair<Integer, Long>> u;
    public final Object h = new Object();
    public final Object i = new Object();
    final Map<Pair<ctyy, ConversationId>, dehn<cufp>> m = new HashMap();
    final Map<Pair<ctyy, Pair<ConversationId, String>>, dehn<cufp>> n = new HashMap();
    public final Handler o = new Handler(Looper.getMainLooper());
    private final HashMap<ctyy, Integer> D = new HashMap<>();
    public final cswc<Long> v = new ctcm(this);
    public final Runnable w = new ctcn(this);
    public final cswc<Boolean> x = new ctcp(this);
    public final Runnable y = new ctcq(this);
    public final cswc<Boolean> z = new ctcr(this);
    public final Runnable A = new ctcs(this);

    public ctct(Context context, cted ctedVar, ctgc ctgcVar, csyc csycVar, Map<String, ctuk> map, csuh csuhVar, ctog ctogVar, csuj csujVar) {
        this.a = context;
        this.b = ctedVar;
        this.e = ctgcVar;
        this.g = csycVar;
        this.c = csuhVar;
        dehp dehpVar = cstu.b().a;
        this.d = dehpVar;
        this.f = ctogVar;
        this.u = new HashMap();
        this.C = new HashSet<>();
        this.s = map;
        this.B = dehx.b(dehpVar);
        this.j = new Random();
        this.k = csujVar;
        this.l = new ctdt();
    }

    public static cufp E(cufp cufpVar, ctqu ctquVar, long j) {
        byte[] b;
        int length;
        cufo n = cufpVar.n();
        cstd.a();
        n.f(Long.valueOf(System.currentTimeMillis() + j));
        n.c(true);
        if (!TextUtils.isEmpty(ctquVar.a())) {
            n.m(ctquVar.a());
        }
        if (F(cufpVar.c(), ctquVar)) {
            n.h(ctquVar.c().b());
            n.i(true);
        } else if (ctquVar.d().a() && (length = (b = ctquVar.d().b()).length) > 0) {
            n.g(BitmapFactory.decodeByteArray(b, 0, length));
        }
        if (!ctquVar.g().isEmpty()) {
            n.b(ctquVar.g());
        }
        if (ctquVar.l().a()) {
            n.k(ctquVar.l().b().longValue());
        }
        return n.a();
    }

    public static boolean F(dbsg<String> dbsgVar, ctqu ctquVar) {
        if (!ctquVar.c().a()) {
            return false;
        }
        if (!dbsgVar.a()) {
            return true;
        }
        String b = ctquVar.c().b();
        return !TextUtils.isEmpty(b) && !b.equals(dbsgVar.b());
    }

    public final synchronized void A(List<ctyy> list) {
        HashSet<ctyy> hashSet = this.t;
        if (hashSet == null) {
            this.t = new HashSet<>(list);
        } else {
            hashSet.addAll(list);
        }
        this.o.removeCallbacks(this.w);
        this.w.run();
        if (this.E == null) {
            this.E = new ctcj(this);
            this.a.registerReceiver(this.E, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public final synchronized void B(ctyy ctyyVar) {
        int intValue = (this.D.containsKey(ctyyVar) ? this.D.get(ctyyVar).intValue() : 0) - 1;
        if (intValue <= 0) {
            if (intValue < 0) {
                cstl.a("LiMsgController");
            }
            if (String.valueOf(ctyyVar.b().e().a()).length() == 0) {
                new String("BindV2 stop for ");
            }
            cstl.a("LiMsgController");
            C(ctyyVar);
        } else {
            if (String.valueOf(ctyyVar.b().e().a()).length() == 0) {
                new String("BindV2 ignore stop for ");
            }
            cstl.a("LiMsgController");
        }
        this.D.put(ctyyVar, Integer.valueOf(intValue));
    }

    public final synchronized void C(ctyy ctyyVar) {
        if (String.valueOf(ctyyVar.b().e().a()).length() == 0) {
            new String("BindV2 stopMessaging() called manually for ");
        }
        cstl.a("LiMsgController");
        o(dcdc.f(ctyyVar));
    }

    public final dehn<cufp> D(final ctyy ctyyVar, final cufp cufpVar, final boolean z) {
        dehn<cufp> dehnVar;
        synchronized (this.h) {
            final Pair<ctyy, ConversationId> create = Pair.create(ctyyVar, cufpVar.a());
            dehnVar = this.m.get(create);
            if (dehnVar == null) {
                ctmm c = ctmn.c();
                ((ctmh) c).a = "sync conversation profile";
                c.b(ctmr.c);
                final ctmn a = c.a();
                final dehn f = deha.f(new deff(this, ctyyVar, cufpVar, a) { // from class: ctbp
                    private final ctct a;
                    private final ctyy b;
                    private final cufp c;
                    private final ctmn d;

                    {
                        this.a = this;
                        this.b = ctyyVar;
                        this.c = cufpVar;
                        this.d = a;
                    }

                    @Override // defpackage.deff
                    public final dehn a() {
                        ctct ctctVar = this.a;
                        ctyy ctyyVar2 = this.b;
                        cufp cufpVar2 = this.c;
                        ctmn ctmnVar = this.d;
                        cted ctedVar = ctctVar.b;
                        ConversationId a2 = cufpVar2.a();
                        if (a2.c() != ConversationId.IdType.GROUP) {
                            ctfg c2 = ctfh.c();
                            ((ctei) c2).b = 1;
                            return deha.a(c2.a());
                        }
                        cttz cttzVar = (cttz) ctedVar;
                        return cttzVar.a.a(UUID.randomUUID(), new ctwb(cttzVar.b, ctyyVar2, a2), cttzVar.a.d.d(), ctyyVar2, ctmnVar, true);
                    }
                }, this.d);
                dehnVar = deha.k(f).b(new Callable(this, ctyyVar, cufpVar, f) { // from class: ctbq
                    private final ctct a;
                    private final ctyy b;
                    private final cufp c;
                    private final dehn d;

                    {
                        this.a = this;
                        this.b = ctyyVar;
                        this.c = cufpVar;
                        this.d = f;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ctct ctctVar = this.a;
                        ctyy ctyyVar2 = this.b;
                        cufp cufpVar2 = this.c;
                        dehn dehnVar2 = this.d;
                        int nextInt = ctctVar.j.nextInt((int) dxzy.w());
                        long v = dxzy.v();
                        ctfh ctfhVar = (ctfh) deha.r(dehnVar2);
                        long nextInt2 = ctctVar.j.nextInt(nextInt);
                        long j = v + nextInt2;
                        int b = ctfhVar.b();
                        int i = b - 1;
                        if (b != 0) {
                            if (i == 1) {
                                if (!ctfhVar.a().a()) {
                                    cstl.a("LiMsgController");
                                    return cufpVar2;
                                }
                                cufp E = ctct.E(cufpVar2, ctfhVar.a().b(), j);
                                ctctVar.H(ctyyVar2).as(E);
                                if (!ctfhVar.a().b().f().a()) {
                                    return E;
                                }
                                ctctVar.H(ctyyVar2).M(E.a(), ctfhVar.a().b().f().b().a());
                                return E;
                            } else if (i == 2) {
                                cstl.a("LiMsgController");
                                cufo n = cufpVar2.n();
                                cstd.a();
                                n.f(Long.valueOf(System.currentTimeMillis() + nextInt2));
                                cufp a2 = n.a();
                                ctctVar.H(ctyyVar2).as(a2);
                                return a2;
                            } else {
                                cstl.a("LiMsgController");
                                cufo n2 = cufpVar2.n();
                                cstd.a();
                                n2.f(Long.valueOf(System.currentTimeMillis() + j));
                                return n2.a();
                            }
                        }
                        throw null;
                    }
                }, dege.a);
                this.m.put(create, dehnVar);
                dehnVar.Pk(new Runnable(this, create) { // from class: ctbk
                    private final ctct a;
                    private final Pair b;

                    {
                        this.a = this;
                        this.b = create;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ctct ctctVar = this.a;
                        Pair pair = this.b;
                        synchronized (ctctVar.h) {
                            ctctVar.m.remove(pair);
                        }
                    }
                }, dege.a);
            }
        }
        return deew.g(dehnVar, new defg(this, cufpVar, ctyyVar, z) { // from class: ctbl
            private final ctct a;
            private final cufp b;
            private final ctyy c;
            private final boolean d;

            {
                this.a = this;
                this.b = cufpVar;
                this.c = ctyyVar;
                this.d = z;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                ctct ctctVar = this.a;
                cufp cufpVar2 = this.b;
                ctyy ctyyVar2 = this.c;
                boolean z2 = this.d;
                cufp cufpVar3 = (cufp) obj;
                if (!cufpVar2.c().equals(cufpVar3.c()) || !cufpVar3.d().a()) {
                    dehn<cufp> G = ctctVar.G(ctyyVar2, cufpVar3);
                    if (z2) {
                        return G;
                    }
                }
                return deha.a(cufpVar3);
            }
        }, dege.a);
    }

    public final dehn<cufp> G(final ctyy ctyyVar, final cufp cufpVar) {
        dehn<cufp> dehnVar;
        dehn<cufp> h;
        if (!cufpVar.c().a()) {
            return deha.a(cufpVar);
        }
        final Pair<ctyy, Pair<ConversationId, String>> create = Pair.create(ctyyVar, Pair.create(cufpVar.a(), cufpVar.c().b()));
        synchronized (this.i) {
            dehnVar = this.n.get(create);
            if (dehnVar == null) {
                ctog ctogVar = this.f;
                ctxm r = ctxn.r();
                r.g(37);
                r.n(ctyyVar.b().e());
                r.o(ctyyVar.c().J());
                r.d(cufpVar.a());
                ctogVar.b(r.a());
                if (!cufpVar.c().a()) {
                    h = deha.a(cufpVar);
                } else {
                    dehn c = this.d.c(new csvn(this.a, cufpVar.c().b()));
                    deha.q(c, new ctcl(this, ctyyVar, cufpVar), dege.a);
                    h = deew.h(c, new dbrn(this, cufpVar, ctyyVar) { // from class: ctbs
                        private final ctct a;
                        private final cufp b;
                        private final ctyy c;

                        {
                            this.a = this;
                            this.b = cufpVar;
                            this.c = ctyyVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            cufp a;
                            ctct ctctVar = this.a;
                            cufp cufpVar2 = this.b;
                            ctyy ctyyVar2 = this.c;
                            Bitmap bitmap = (Bitmap) obj;
                            if (bitmap != null) {
                                cufo n = cufpVar2.n();
                                n.i(false);
                                n.g(bitmap);
                                a = n.a();
                                ctog ctogVar2 = ctctVar.f;
                                ctxm r2 = ctxn.r();
                                r2.g(38);
                                r2.n(ctyyVar2.b().e());
                                r2.o(ctyyVar2.c().J());
                                r2.d(cufpVar2.a());
                                ctogVar2.b(r2.a());
                            } else {
                                cufo n2 = cufpVar2.n();
                                n2.i(true);
                                a = n2.a();
                                ctog ctogVar3 = ctctVar.f;
                                ctxm r3 = ctxn.r();
                                r3.g(39);
                                r3.n(ctyyVar2.b().e());
                                r3.o(ctyyVar2.c().J());
                                r3.d(cufpVar2.a());
                                ctogVar3.b(r3.a());
                            }
                            ctctVar.H(ctyyVar2).as(a);
                            return a;
                        }
                    }, dege.a);
                }
                dehnVar = h;
                this.n.put(create, dehnVar);
                dehnVar.Pk(new Runnable(this, create) { // from class: ctbr
                    private final ctct a;
                    private final Pair b;

                    {
                        this.a = this;
                        this.b = create;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ctct ctctVar = this.a;
                        Pair pair = this.b;
                        synchronized (ctctVar.i) {
                            ctctVar.n.remove(pair);
                        }
                    }
                }, dege.a);
            } else {
                cstl.a("LiMsgController");
            }
        }
        return dehnVar;
    }

    public final cusm H(ctyy ctyyVar) {
        return this.e.a(ctyyVar);
    }

    public final synchronized void I() {
        if (this.t.isEmpty()) {
            return;
        }
        Iterator<ctyy> it = this.t.iterator();
        while (it.hasNext()) {
            K(it.next()).q();
        }
    }

    public final synchronized void J(long j) {
        cstq.a();
        ctmm c = ctmn.c();
        ((ctmh) c).a = "Resend Delivery Receipts";
        c.b(ctmr.c);
        ctmn a = c.a();
        Iterator<ctyy> it = this.C.iterator();
        while (it.hasNext()) {
            final ctyy next = it.next();
            cusm H = H(next);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cstd.a();
            final dcdn<ConversationId, dcdc<String>> H2 = H.H(timeUnit.toMicros(System.currentTimeMillis() - j));
            dcpd<ConversationId> it2 = H2.keySet().iterator();
            while (it2.hasNext()) {
                final ConversationId next2 = it2.next();
                deha.m(this.b.a(next, next2, H2.get(next2), a)).b(new Callable(this, next, H2, next2) { // from class: ctbt
                    private final ctct a;
                    private final ctyy b;
                    private final dcdn c;
                    private final ConversationId d;

                    {
                        this.a = this;
                        this.b = next;
                        this.c = H2;
                        this.d = next2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        this.a.H(this.b).I((List) this.c.get(this.d));
                        return null;
                    }
                }, this.d);
            }
        }
    }

    public final cszw K(ctyy ctyyVar) {
        return cszw.c(this.a, ctyyVar, this.b, this, this, H(ctyyVar), this.q, this.r, this.g, this, this, this.s);
    }

    @Override // defpackage.csux
    public final void L(int i) {
        ctdt ctdtVar = this.l;
        if (ctdtVar.c == i) {
            return;
        }
        ctdtVar.c = i;
        ctdtVar.a();
    }

    @Override // defpackage.csuk
    public final cuss<cufp> a(ctyy ctyyVar, ConversationId conversationId) {
        return w(ctyyVar, conversationId, ctau.a, ctbd.a);
    }

    @Override // defpackage.csuk
    public final cuss<cufp> b(ctyy ctyyVar, ConversationId conversationId) {
        return w(ctyyVar, conversationId, ctbn.a, ctbx.a);
    }

    @Override // defpackage.csuk
    public final cuss<cufp> c(ctyy ctyyVar, ConversationId conversationId) {
        return w(ctyyVar, conversationId, dbss.ALWAYS_FALSE, dbss.ALWAYS_FALSE);
    }

    @Override // defpackage.csuk
    public final cuss<dcdc<cugu>> d(ctyy ctyyVar, ConversationId conversationId, Integer num, Integer num2) {
        return e(ctyyVar, conversationId, num, num2, cugt.e);
    }

    @Override // defpackage.csuk
    public final cuss<dcdc<cugu>> e(final ctyy ctyyVar, final ConversationId conversationId, final Integer num, final Integer num2, final cugt[] cugtVarArr) {
        return new cusd(cswe.b(cswe.a(this.a).l, this.d), new dbrn(this, ctyyVar, conversationId, num, num2, cugtVarArr) { // from class: ctac
            private final ctct a;
            private final ctyy b;
            private final ConversationId c;
            private final Integer d;
            private final Integer e;
            private final cugt[] f;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = conversationId;
                this.d = num;
                this.e = num2;
                this.f = cugtVarArr;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ctct ctctVar = this.a;
                ctyy ctyyVar2 = this.b;
                ConversationId conversationId2 = this.c;
                Integer num3 = this.d;
                Integer num4 = this.e;
                cugt[] cugtVarArr2 = this.f;
                Integer num5 = (Integer) obj;
                try {
                    ctctVar.H(ctyyVar2).au(conversationId2, ((Long) cswe.b(cswe.a(ctctVar.a).s, dehx.a()).get()).longValue(), ((Long) cswe.b(cswe.a(ctctVar.a).t, dehx.a()).get()).longValue());
                } catch (InterruptedException | ExecutionException unused) {
                    cstl.a("LiMsgController");
                }
                cusm H = ctctVar.H(ctyyVar2);
                if (num3 == null) {
                    num3 = num5;
                }
                cuss<dcdc<cugu>> p = H.p(conversationId2, num3.intValue(), num4 == null ? 0 : num4.intValue(), cugtVarArr2);
                if (cswe.a(ctctVar.a).ab.f().booleanValue()) {
                    p.k(new cusr((cszz) ctctVar.k, ctyyVar2) { // from class: cszx
                        private final cszz a;
                        private final ctyy b;

                        {
                            this.a = r1;
                            this.b = ctyyVar2;
                        }

                        @Override // defpackage.cusr
                        public final void a(Object obj2) {
                            final cszz cszzVar = this.a;
                            final ctyy ctyyVar3 = this.b;
                            final dcdc dcdcVar = (dcdc) obj2;
                            cszzVar.c.a(new Runnable(cszzVar, dcdcVar, ctyyVar3) { // from class: cszy
                                private final cszz a;
                                private final dcdc b;
                                private final ctyy c;

                                {
                                    this.a = cszzVar;
                                    this.b = dcdcVar;
                                    this.c = ctyyVar3;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    dbsg dbsgVar;
                                    cugu a;
                                    cszz cszzVar2 = this.a;
                                    dcdc dcdcVar2 = this.b;
                                    ctyy ctyyVar4 = this.c;
                                    ArrayList arrayList = new ArrayList(csvf.a(cszzVar2.d).c());
                                    if (!cswe.a(cszzVar2.d).ab.f().booleanValue()) {
                                        return;
                                    }
                                    dccx dccxVar = new dccx();
                                    int size = dcdcVar2.size();
                                    for (int i = 0; i < size; i++) {
                                        cugu cuguVar = (cugu) dcdcVar2.get(i);
                                        if (cuguVar.j() != -1 && arrayList.contains(Integer.valueOf(cuguVar.j())) && cuguVar.f().a() == 1) {
                                            byte[] G = cuguVar.f().e().G();
                                            cted ctedVar = cszzVar2.b;
                                            try {
                                                dxqi dxqiVar = ((dxla) dsqw.cr(dxla.c, Base64.decode(G, 8), dsqa.c())).a;
                                                if (dxqiVar == null) {
                                                    dxqiVar = dxqi.t;
                                                }
                                                dbsg i2 = dbsg.i(dxqiVar);
                                                cttz cttzVar = (cttz) ctedVar;
                                                Context context = cttzVar.b;
                                                dbsgVar = ctuv.i(i2, ctyyVar4, context, cttzVar.f, ctog.a(context));
                                            } catch (dsrm | IllegalArgumentException unused2) {
                                                dbsgVar = dbpy.a;
                                            }
                                            if (!dbsgVar.a() || ((ctrg) dbsgVar.b()).e().k().a() == cugt.OVERLAY) {
                                                cugi n = cuguVar.n();
                                                n.b(-1);
                                                a = n.a();
                                            } else {
                                                a = ((ctrg) dbsgVar.b()).e();
                                            }
                                            dccxVar.g(a);
                                            ctog a2 = ctog.a(cszzVar2.d);
                                            ctxm r = ctxn.r();
                                            r.g(10012);
                                            r.n(ctyyVar4.b().e());
                                            r.o(ctyyVar4.c().J());
                                            r.p(cuguVar.a());
                                            r.q(cuguVar.j());
                                            a2.b(r.a());
                                        }
                                    }
                                    cszzVar2.a.a(ctyyVar4).B(dccxVar.f());
                                }
                            });
                        }
                    });
                }
                return p;
            }
        }, this.d);
    }

    @Override // defpackage.csuk
    public final dehn<Void> f(final ctyy ctyyVar, final cugu cuguVar, final int i) {
        final deig d = deig.d();
        this.B.execute(new Runnable(this, cuguVar, ctyyVar, d, i) { // from class: ctad
            private final ctct a;
            private final cugu b;
            private final ctyy c;
            private final deig d;
            private final int e;

            {
                this.a = this;
                this.b = cuguVar;
                this.c = ctyyVar;
                this.d = d;
                this.e = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctct ctctVar = this.a;
                cugu cuguVar2 = this.b;
                ctyy ctyyVar2 = this.c;
                deig deigVar = this.d;
                int i2 = this.e;
                if (!cuguVar2.g().equals(cugo.OUTGOING_FAILED_SEND) || ctctVar.H(ctyyVar2).a(cuguVar2.a())) {
                    int a = cuguVar2.f().a();
                    if (a == 0) {
                        throw null;
                    }
                    if (a == 3 && ctctVar.s.containsKey(cuguVar2.f().b().a())) {
                        ctctVar.s.get(cuguVar2.f().b().a()).e(ctyyVar2, cuguVar2, ctctVar.f);
                    }
                    ctog ctogVar = ctctVar.f;
                    ctxm r = ctxn.r();
                    r.g(9);
                    r.n(ctyyVar2.b().e());
                    r.o(ctyyVar2.c().J());
                    r.p(cuguVar2.a());
                    r.d(cuguVar2.c());
                    r.l(i2);
                    ctogVar.b(r.a());
                    deigVar.j(true);
                    return;
                }
                cstl.a("LiMsgController");
                deigVar.k(new InvalidParameterException());
            }
        });
        return deew.g(d, new defg(this, ctyyVar, cuguVar, i) { // from class: ctae
            private final ctct a;
            private final ctyy b;
            private final cugu c;
            private final int d;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = cuguVar;
                this.d = i;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final ctct ctctVar = this.a;
                final ctyy ctyyVar2 = this.b;
                final cugu cuguVar2 = this.c;
                final int i2 = this.d;
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    dehn<cugu> x = ctctVar.x(ctyyVar2, cuguVar2, false);
                    int a = cuguVar2.f().a();
                    if (a == 0) {
                        throw null;
                    }
                    dehn<cugu> g = (a != 3 || !ctctVar.s.containsKey(cuguVar2.f().b().a())) ? x : deew.g(x, new defg(ctctVar, cuguVar2, ctyyVar2) { // from class: ctaf
                        private final ctct a;
                        private final cugu b;
                        private final ctyy c;

                        {
                            this.a = ctctVar;
                            this.b = cuguVar2;
                            this.c = ctyyVar2;
                        }

                        @Override // defpackage.defg
                        public final dehn a(Object obj2) {
                            return this.a.s.get(this.b.f().b().a()).c(this.c, (cugu) obj2);
                        }
                    }, dege.a);
                    final dehn g2 = deew.g(g, new defg(ctctVar, ctyyVar2) { // from class: ctag
                        private final ctct a;
                        private final ctyy b;

                        {
                            this.a = ctctVar;
                            this.b = ctyyVar2;
                        }

                        @Override // defpackage.defg
                        public final dehn a(Object obj2) {
                            final ctct ctctVar2 = this.a;
                            final ctyy ctyyVar3 = this.b;
                            final cugu cuguVar3 = (cugu) obj2;
                            ctmm c = ctmn.c();
                            ((ctmh) c).a = "send message";
                            c.b(ctmr.c);
                            final ctmn a2 = c.a();
                            return deha.f(new deff(ctctVar2, ctyyVar3, cuguVar3, a2) { // from class: ctat
                                private final ctct a;
                                private final ctyy b;
                                private final cugu c;
                                private final ctmn d;

                                {
                                    this.a = ctctVar2;
                                    this.b = ctyyVar3;
                                    this.c = cuguVar3;
                                    this.d = a2;
                                }

                                @Override // defpackage.deff
                                public final dehn a() {
                                    ctct ctctVar3 = this.a;
                                    final ctyy ctyyVar4 = this.b;
                                    final cugu cuguVar4 = this.c;
                                    final ctmn ctmnVar = this.d;
                                    cted ctedVar = ctctVar3.b;
                                    final dxnc d2 = cttz.d(cuguVar4.c());
                                    final cttz cttzVar = (cttz) ctedVar;
                                    return deew.g(cswe.b(cswe.a(cttzVar.b).B, dehx.a()), new defg(cttzVar, ctyyVar4, cuguVar4, d2, ctmnVar) { // from class: cttr
                                        private final cttz a;
                                        private final ctyy b;
                                        private final cugu c;
                                        private final dxnc d;
                                        private final ctmn e;

                                        {
                                            this.a = cttzVar;
                                            this.b = ctyyVar4;
                                            this.c = cuguVar4;
                                            this.d = d2;
                                            this.e = ctmnVar;
                                        }

                                        @Override // defpackage.defg
                                        public final dehn a(Object obj3) {
                                            final cttz cttzVar2 = this.a;
                                            final ctyy ctyyVar5 = this.b;
                                            final cugu cuguVar5 = this.c;
                                            final dxnc dxncVar = this.d;
                                            final ctmn ctmnVar2 = this.e;
                                            if (((Boolean) obj3).booleanValue()) {
                                                return cttzVar2.e.a(new deff(cttzVar2, ctyyVar5, cuguVar5, dxncVar, ctmnVar2) { // from class: cttu
                                                    private final cttz a;
                                                    private final ctyy b;
                                                    private final cugu c;
                                                    private final dxnc d;
                                                    private final ctmn e;

                                                    {
                                                        this.a = cttzVar2;
                                                        this.b = ctyyVar5;
                                                        this.c = cuguVar5;
                                                        this.d = dxncVar;
                                                        this.e = ctmnVar2;
                                                    }

                                                    @Override // defpackage.deff
                                                    public final dehn a() {
                                                        cttz cttzVar3 = this.a;
                                                        ctyy ctyyVar6 = this.b;
                                                        cugu cuguVar6 = this.c;
                                                        dxnc dxncVar2 = this.d;
                                                        return cttzVar3.a.a(UUID.randomUUID(), new ctwy(cttzVar3.b, ctyyVar6, cuguVar6, dxncVar2, cttzVar3.f), cttzVar3.a.d.d(), ctyyVar6, this.e, true);
                                                    }
                                                });
                                            }
                                            return cttzVar2.a.a(UUID.randomUUID(), new ctwy(cttzVar2.b, ctyyVar5, cuguVar5, dxncVar, cttzVar2.f), cttzVar2.a.d.d(), ctyyVar5, ctmnVar2, true);
                                        }
                                    }, dege.a);
                                }
                            }, ctctVar2.d);
                        }
                    }, dege.a);
                    ctctVar.d.a(new Runnable(ctctVar, ctyyVar2, cuguVar2) { // from class: ctah
                        private final ctct a;
                        private final ctyy b;
                        private final cugu c;

                        {
                            this.a = ctctVar;
                            this.b = ctyyVar2;
                            this.c = cuguVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ctct ctctVar2 = this.a;
                            ctyy ctyyVar3 = this.b;
                            cugu cuguVar3 = this.c;
                            ctctVar2.p.a(ctyyVar3, cuguVar3.b()).l();
                            if (cuguVar3.c().c() == ConversationId.IdType.ONE_TO_ONE) {
                                ctctVar2.p.a(ctyyVar3, cuguVar3.c().e()).l();
                                return;
                            }
                            ctctVar2.a(ctyyVar3, cuguVar3.c()).l();
                        }
                    });
                    final dehn g3 = deee.g(g, Throwable.class, new dbrn(cuguVar2) { // from class: ctai
                        private final cugu a;

                        {
                            this.a = cuguVar2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            return this.a;
                        }
                    }, dege.a);
                    final dehn b = deha.k(x, g2, g3).b(new Callable(ctctVar, g3, g2, ctyyVar2, cuguVar2, i2) { // from class: ctaj
                        private final ctct a;
                        private final dehn b;
                        private final dehn c;
                        private final ctyy d;
                        private final cugu e;
                        private final int f;

                        {
                            this.a = ctctVar;
                            this.b = g3;
                            this.c = g2;
                            this.d = ctyyVar2;
                            this.e = cuguVar2;
                            this.f = i2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cugu a2;
                            ExecutionException executionException;
                            ctct ctctVar2 = this.a;
                            dehn dehnVar = this.b;
                            dehn dehnVar2 = this.c;
                            ctyy ctyyVar3 = this.d;
                            cugu cuguVar3 = this.e;
                            int i3 = this.f;
                            cugi n = ((cugu) dehnVar.get()).n();
                            try {
                                n.m(((ctfy) deha.r(dehnVar2)).a().b());
                                n.i(cugo.OUTGOING_SENT);
                                a2 = n.a();
                                ctog ctogVar = ctctVar2.f;
                                ctxm r = ctxn.r();
                                r.g(10);
                                r.n(ctyyVar3.b().e());
                                r.o(ctyyVar3.c().J());
                                r.p(cuguVar3.a());
                                r.d(cuguVar3.c());
                                r.l(i3);
                                ctogVar.b(r.a());
                                executionException = null;
                            } catch (ExecutionException e) {
                                cstl.a("LiMsgController");
                                ctxm r2 = ctxn.r();
                                r2.g(11);
                                r2.n(ctyyVar3.b().e());
                                r2.o(ctyyVar3.c().J());
                                r2.p(cuguVar3.a());
                                r2.d(cuguVar3.c());
                                r2.l(i3);
                                if (e.getCause() != null && (e.getCause() instanceof cttl)) {
                                    r2.f(10);
                                }
                                ctctVar2.f.b(r2.a());
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                cstd.a();
                                n.m(Long.valueOf(timeUnit.toMicros(System.currentTimeMillis())));
                                n.i(cugo.OUTGOING_FAILED_SEND);
                                a2 = n.a();
                                executionException = e;
                            }
                            ctctVar2.H(ctyyVar3).x(a2, a2.d().longValue());
                            ctctVar2.H(ctyyVar3).y(Arrays.asList(a2), cugo.OUTGOING_SENDING, a2.g());
                            ctctVar2.h(ctyyVar3, a2.c());
                            if (executionException == null) {
                                return null;
                            }
                            throw executionException;
                        }
                    }, dege.a);
                    return deha.m(b).b(new Callable(b) { // from class: ctal
                        private final dehn a;

                        {
                            this.a = b;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            try {
                                Void r0 = (Void) deha.r(this.a);
                                return null;
                            } catch (ExecutionException e) {
                                cstl.a("LiMsgController");
                                throw e;
                            }
                        }
                    }, dege.a);
                }
                return deha.a(null);
            }
        }, dege.a);
    }

    @Override // defpackage.csuk
    public final dehn<Void> g(final ctyy ctyyVar, final ConversationId conversationId, final String str) {
        csvo.a(this.a);
        if (csvo.v(dxzy.a.a().i())) {
            cstl.a("LiMsgController");
            return deew.h(y(ctyyVar, conversationId), new dbrn(this, str, conversationId, ctyyVar) { // from class: ctan
                private final ctct a;
                private final String b;
                private final ConversationId c;
                private final ctyy d;

                {
                    this.a = this;
                    this.b = str;
                    this.c = conversationId;
                    this.d = ctyyVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    ctct ctctVar = this.a;
                    String str2 = this.b;
                    ConversationId conversationId2 = this.c;
                    ctyy ctyyVar2 = this.d;
                    String bool = ((Boolean) obj).toString();
                    String valueOf = String.valueOf(cswe.a(ctctVar.a).ar.f());
                    int length = String.valueOf(str2).length();
                    StringBuilder sb = new StringBuilder(length + 74 + String.valueOf(bool).length() + String.valueOf(valueOf).length());
                    sb.append("intent: ");
                    sb.append(str2);
                    sb.append(", isEmptyDeviceConversation: ");
                    sb.append(bool);
                    sb.append(", enableLighterIntentWelcomeMessage: ");
                    sb.append(valueOf);
                    String sb2 = sb.toString();
                    cugi p = cugu.p();
                    p.h("messageID");
                    p.o(2);
                    p.i(cugo.OUTGOING_SENT);
                    p.c(conversationId2);
                    p.l(conversationId2.a());
                    p.u(sb2);
                    p.d("");
                    p.n("");
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    cstd.a();
                    p.m(Long.valueOf(timeUnit.toMicros(System.currentTimeMillis())));
                    p.j(new HashMap());
                    p.b(192);
                    p.r();
                    p.f(cugt.DEFAULT_RENDERING_TYPE.h);
                    ctctVar.H(ctyyVar2).f(p.a());
                    return null;
                }
            }, this.d);
        }
        cstl.a("LiMsgController");
        dehn<Void> g = deew.g(cswe.b(cswe.a(this.a).L, this.d), new defg(this, ctyyVar, conversationId, str) { // from class: ctao
            private final ctct a;
            private final ctyy b;
            private final ConversationId c;
            private final String d;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = conversationId;
                this.d = str;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final ctct ctctVar = this.a;
                final ctyy ctyyVar2 = this.b;
                final ConversationId conversationId2 = this.c;
                final String str2 = this.d;
                if (!((Boolean) obj).booleanValue()) {
                    return deha.a(null);
                }
                return deew.g(ctctVar.y(ctyyVar2, conversationId2), new defg(ctctVar, ctyyVar2, conversationId2, str2) { // from class: ctar
                    private final ctct a;
                    private final ctyy b;
                    private final ConversationId c;
                    private final String d;

                    {
                        this.a = ctctVar;
                        this.b = ctyyVar2;
                        this.c = conversationId2;
                        this.d = str2;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        ctct ctctVar2 = this.a;
                        ctyy ctyyVar3 = this.b;
                        ConversationId conversationId3 = this.c;
                        String str3 = this.d;
                        cted ctedVar = ctctVar2.b;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        dbpy<Object> dbpyVar = dbpy.a;
                        ctmm c = ctmn.c();
                        ((ctmh) c).a = "send conversation opened intent";
                        c.b(ctmr.c);
                        ctmn a = c.a();
                        List arrayList = new ArrayList();
                        if (str3 != null) {
                            try {
                                dxmu dxmuVar = cttz.e(str3).c;
                                if (dxmuVar != null) {
                                    arrayList = dxmuVar.a;
                                }
                            } catch (dsrm unused) {
                                cstl.a("TyMsgClient");
                            }
                        }
                        List list = arrayList;
                        dxnc d = cttz.d(conversationId3);
                        UUID randomUUID = UUID.randomUUID();
                        cttz cttzVar = (cttz) ctedVar;
                        Context context = cttzVar.b;
                        ctvr ctvrVar = new ctvr(context, ctyyVar3, conversationId3, str3, booleanValue, cswe.a(context).ar.f().booleanValue(), d, list);
                        final ctxm r = ctxn.r();
                        r.n(ctyyVar3.b().e());
                        r.o(ctyyVar3.c().J());
                        r.p(ctvrVar.a);
                        r.d(conversationId3);
                        r.h(dcdc.r(list));
                        cstn.a(dbpyVar, new mw(r) { // from class: cttt
                            private final ctxm a;

                            {
                                this.a = r;
                            }

                            @Override // defpackage.mw
                            public final void a(Object obj3) {
                                ctxm ctxmVar = this.a;
                                cuii h = cuil.h();
                                h.b((String) obj3);
                                ctxmVar.r(h.a());
                            }
                        });
                        ctog ctogVar = cttzVar.c;
                        r.g(18);
                        ctogVar.b(r.a());
                        ctss ctssVar = cttzVar.a;
                        dehn a2 = ctssVar.a(randomUUID, ctvrVar, ctssVar.d.d(), ctyyVar3, a, true);
                        deha.q(a2, new cttx(cttzVar, r), dege.a);
                        return a2;
                    }
                }, ctctVar.d);
            }
        }, dege.a);
        deha.m(g).b(new Callable(this, conversationId, ctyyVar) { // from class: ctap
            private final ctct a;
            private final ConversationId b;
            private final ctyy c;

            {
                this.a = this;
                this.b = conversationId;
                this.c = ctyyVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctct ctctVar = this.a;
                ConversationId conversationId2 = this.b;
                ctyy ctyyVar2 = this.c;
                if (!csvo.u(csvo.a(ctctVar.a).a.aB) || conversationId2.c() != ConversationId.IdType.ONE_TO_ONE) {
                    return null;
                }
                ((csxv) ctctVar.p).e(ctyyVar2, conversationId2.e(), dbss.ALWAYS_TRUE).l();
                return null;
            }
        }, dege.a);
        return g;
    }

    @Override // defpackage.csuk
    public final void h(final ctyy ctyyVar, final ConversationId conversationId) {
        this.d.a(new Runnable(this, ctyyVar, conversationId) { // from class: ctaw
            private final ctct a;
            private final ctyy b;
            private final ConversationId c;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = conversationId;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dehn c;
                ctct ctctVar = this.a;
                ctyy ctyyVar2 = this.b;
                ConversationId conversationId2 = this.c;
                dcdc<String> z = ctctVar.H(ctyyVar2).z(conversationId2, cugo.INCOMING_RECEIVED, cugo.INCOMING_READ);
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    ctog ctogVar = ctctVar.f;
                    ctxm r = ctxn.r();
                    r.g(4);
                    r.n(ctyyVar2.b().e());
                    r.o(ctyyVar2.c().J());
                    r.p(z.get(i));
                    r.d(conversationId2);
                    ctogVar.b(r.a());
                }
                if (!csvo.a(ctctVar.a).t()) {
                    return;
                }
                ctmm c2 = ctmn.c();
                ((ctmh) c2).a = "message receipt";
                c2.b(ctmr.c);
                ctmn a = c2.a();
                cusm H = ctctVar.H(ctyyVar2);
                cugo cugoVar = cugo.INCOMING_READ;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cstd.a();
                dcdc<String> C = H.C(conversationId2, cugoVar, timeUnit.toMicros(System.currentTimeMillis() - cswe.a(ctctVar.a).u.f().longValue()));
                if (C.isEmpty()) {
                    return;
                }
                cttz cttzVar = (cttz) ctctVar.b;
                if (!csvo.a(cttzVar.b).t()) {
                    c = dehk.a;
                } else {
                    c = cttzVar.c(ctyyVar2, conversationId2, C, a, true);
                }
                deha.m(c).c(new Runnable(ctctVar, ctyyVar2, conversationId2, C) { // from class: ctav
                    private final ctct a;
                    private final ctyy b;
                    private final ConversationId c;
                    private final dcdc d;

                    {
                        this.a = ctctVar;
                        this.b = ctyyVar2;
                        this.c = conversationId2;
                        this.d = C;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ctct ctctVar2 = this.a;
                        ctyy ctyyVar3 = this.b;
                        ctctVar2.H(ctyyVar3).A(this.c, this.d, Arrays.asList(cugo.INCOMING_READ), cugo.INCOMING_READ_RECEIPT_SENT);
                    }
                }, dege.a);
            }
        });
    }

    @Override // defpackage.csuk
    public final dbsg<cufp> i(ctyy ctyyVar, String str) {
        return this.b.b(ctyyVar, str);
    }

    @Override // defpackage.csuk
    public final cugu j(ConversationId conversationId, cugm cugmVar, String str, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dcdn<String, dspd> dcdnVar) {
        int i;
        cugi p = cugu.p();
        p.h(csvv.a(dbsgVar2.c("")));
        p.o(2);
        p.i(cugo.OUTGOING_PENDING_SEND);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cstd.a();
        p.m(Long.valueOf(timeUnit.toMicros(System.currentTimeMillis())));
        p.c(conversationId);
        p.g(cugmVar);
        p.d(str);
        p.l(conversationId.a());
        int a = cugmVar.a();
        int i2 = a - 1;
        cugt cugtVar = cugt.DEFAULT_RENDERING_TYPE;
        if (a == 0) {
            throw null;
        }
        if (i2 == 1) {
            i = 192;
        } else if (i2 != 2) {
            if (i2 == 3) {
                i = 194;
            }
            i = 0;
        } else {
            if (cugmVar.b().a().equals("photos")) {
                i = 195;
            }
            i = 0;
        }
        p.b(i);
        p.r();
        p.j(dcdnVar);
        p.n((String) ((dbsu) dbsgVar).a);
        return p.a();
    }

    @Override // defpackage.csuk
    public final synchronized void k(List<ctyy> list, int i) {
        new cswd(new ctck(this, i, list), cswe.a(this.a).R).execute(new Void[0]);
    }

    @Override // defpackage.csuk
    public final synchronized void l(List<ctyy> list) {
        boolean isEmpty = this.C.isEmpty();
        this.C.addAll(list);
        if (isEmpty) {
            this.o.post(this.y);
        }
    }

    @Override // defpackage.csuk
    public final synchronized void m(ctyy ctyyVar) {
        if (String.valueOf(ctyyVar.b().e().a()).length() == 0) {
            new String("BindV2 startMessaging() called manually for ");
        }
        cstl.a("LiMsgController");
        A(dcdc.f(ctyyVar));
    }

    @Override // defpackage.csuk
    public final synchronized void n(ctyy ctyyVar) {
        int intValue = (this.D.containsKey(ctyyVar) ? this.D.get(ctyyVar).intValue() : 0) + 1;
        if (intValue == 1) {
            if (String.valueOf(ctyyVar.b().e().a()).length() == 0) {
                new String("BindV2 start for ");
            }
            cstl.a("LiMsgController");
            m(ctyyVar);
        } else {
            if (String.valueOf(ctyyVar.b().e().a()).length() == 0) {
                new String("BindV2 ignore start for ");
            }
            cstl.a("LiMsgController");
        }
        this.D.put(ctyyVar, Integer.valueOf(intValue));
    }

    @Override // defpackage.csuk
    public final synchronized void o(List<ctyy> list) {
        HashSet<ctyy> hashSet = this.t;
        if (hashSet != null && !hashSet.isEmpty()) {
            this.t.removeAll(list);
            for (ctyy ctyyVar : list) {
                K(ctyyVar).g();
            }
            if (this.t.isEmpty()) {
                this.o.removeCallbacks(this.w);
                BroadcastReceiver broadcastReceiver = this.E;
                if (broadcastReceiver != null) {
                    this.a.unregisterReceiver(broadcastReceiver);
                    this.E = null;
                    return;
                }
            }
            return;
        }
        cstl.a("LiMsgController");
    }

    @Override // defpackage.csuk
    public final synchronized void p(final ctyy ctyyVar) {
        new cswd(new cswc(this, ctyyVar) { // from class: ctbc
            private final ctct a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // defpackage.cswc
            public final void a(Object obj) {
                final ctct ctctVar = this.a;
                final ctyy ctyyVar2 = this.b;
                ctctVar.o.postDelayed(new Runnable(ctctVar, ctyyVar2) { // from class: ctbw
                    private final ctct a;
                    private final ctyy b;

                    {
                        this.a = ctctVar;
                        this.b = ctyyVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.B(this.b);
                    }
                }, ((Long) obj).longValue());
            }
        }, cswe.a(this.a).h).execute(new Void[0]);
    }

    @Override // defpackage.csuk
    public final void q(csux csuxVar) {
        ctdt ctdtVar = this.l;
        if (!dyaa.c.f().booleanValue()) {
            return;
        }
        ctdtVar.a.add(csuxVar);
        csuxVar.L(ctdtVar.b());
    }

    @Override // defpackage.csuk
    public final void r(csux csuxVar) {
        this.l.a.remove(csuxVar);
    }

    @Override // defpackage.csuk
    public final cuss<dcdc<cufp>> s(final ctyy ctyyVar, int i, int i2) {
        return cusl.d(H(ctyyVar).an(i, i2), new dbrn(this, ctyyVar) { // from class: ctaa
            private final ctct a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ctct ctctVar = this.a;
                ctyy ctyyVar2 = this.b;
                dcdc dcdcVar = (dcdc) obj;
                int size = dcdcVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ctctVar.b(ctyyVar2, ((cufp) dcdcVar.get(i3)).a()).l();
                }
                return dcdcVar;
            }
        });
    }

    @Override // defpackage.csuk
    public final void t(final ctyy ctyyVar, final cugu... cuguVarArr) {
        this.d.c(new Callable(this, ctyyVar, cuguVarArr) { // from class: ctbo
            private final ctct a;
            private final ctyy b;
            private final cugu[] c;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = cuguVarArr;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctct ctctVar = this.a;
                ctyy ctyyVar2 = this.b;
                ctctVar.H(ctyyVar2).l(this.c);
                return null;
            }
        });
    }

    @Override // defpackage.csuk
    public final cuss<dcdc<cufj>> u(ctyy ctyyVar, ConversationId conversationId) {
        return H(ctyyVar).ap(conversationId);
    }

    @Override // defpackage.cswi
    public final void v(final ctyy ctyyVar, final ConversationId conversationId, final ctqu ctquVar) {
        H(ctyyVar).r(conversationId).k(new cusr(this, ctyyVar, conversationId, ctquVar) { // from class: ctci
            private final ctct a;
            private final ctyy b;
            private final ConversationId c;
            private final ctqu d;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = conversationId;
                this.d = ctquVar;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                ctct ctctVar = this.a;
                ctyy ctyyVar2 = this.b;
                ConversationId conversationId2 = this.c;
                ctqu ctquVar2 = this.d;
                dbsg dbsgVar = (dbsg) obj;
                if (!dbsgVar.a()) {
                    String valueOf = String.valueOf(conversationId2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                    sb.append("Profile changes received for non-existent conversation: ");
                    sb.append(valueOf);
                    sb.toString();
                    cstl.a("LiMsgController");
                    return;
                }
                cufp cufpVar = (cufp) dbsgVar.b();
                if (!ctquVar2.l().a() || cufpVar.m().longValue() <= ctquVar2.l().b().longValue()) {
                    String valueOf2 = String.valueOf(ctquVar2);
                    String valueOf3 = String.valueOf(conversationId2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36 + String.valueOf(valueOf3).length());
                    sb2.append("Profile changes: ");
                    sb2.append(valueOf2);
                    sb2.append(" for conversation: ");
                    sb2.append(valueOf3);
                    sb2.toString();
                    cstl.a("LiMsgController");
                    ctctVar.d.a(new Runnable(ctctVar, ctyyVar2, cufpVar, ctquVar2) { // from class: ctab
                        private final ctct a;
                        private final ctyy b;
                        private final cufp c;
                        private final ctqu d;

                        {
                            this.a = ctctVar;
                            this.b = ctyyVar2;
                            this.c = cufpVar;
                            this.d = ctquVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ctct ctctVar2 = this.a;
                            ctyy ctyyVar3 = this.b;
                            cufp cufpVar2 = this.c;
                            cufp E = ctct.E(cufpVar2, this.d, ctctVar2.j.nextInt((int) dxzy.w()) + dxzy.v());
                            ctctVar2.H(ctyyVar3).as(E);
                            if (!cufpVar2.c().equals(E.c()) || !E.d().a()) {
                                ctctVar2.G(ctyyVar3, E);
                            }
                        }
                    });
                    return;
                }
                cstl.a("LiMsgController");
            }
        });
    }

    public final cuss<cufp> w(final ctyy ctyyVar, final ConversationId conversationId, final dbsl<cufp> dbslVar, final dbsl<cufp> dbslVar2) {
        return cusl.d(H(ctyyVar).r(conversationId), new dbrn(this, conversationId, dbslVar, dbslVar2, ctyyVar) { // from class: ctch
            private final ctct a;
            private final ConversationId b;
            private final dbsl c;
            private final dbsl d;
            private final ctyy e;

            {
                this.a = this;
                this.b = conversationId;
                this.c = dbslVar;
                this.d = dbslVar2;
                this.e = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                boolean a;
                cufp cufpVar;
                ctct ctctVar = this.a;
                ConversationId conversationId2 = this.b;
                dbsl dbslVar3 = this.c;
                dbsl dbslVar4 = this.d;
                ctyy ctyyVar2 = this.e;
                dbsg dbsgVar = (dbsg) obj;
                if (!dbsgVar.a()) {
                    cufo o = cufp.o();
                    o.e(conversationId2);
                    o.f(-1L);
                    o.b(new HashMap());
                    o.c(conversationId2.c() == ConversationId.IdType.ONE_TO_ONE);
                    cufpVar = o.a();
                    a = false;
                } else {
                    cufp cufpVar2 = (cufp) dbsgVar.b();
                    a = dbslVar3.a((cufp) dbsgVar.b());
                    cufpVar = cufpVar2;
                }
                boolean a2 = dbslVar4.a(cufpVar);
                dehn<cufp> a3 = deha.a(cufpVar);
                if (a) {
                    a3 = ctctVar.D(ctyyVar2, cufpVar, false);
                } else if (cufpVar.e() && !cufpVar.d().a()) {
                    a3 = ctctVar.G(ctyyVar2, cufpVar);
                }
                if (a2) {
                    deha.k(a3).a(new deff(ctctVar, ctyyVar2, cufpVar) { // from class: ctcd
                        private final ctct a;
                        private final ctyy b;
                        private final cufp c;

                        {
                            this.a = ctctVar;
                            this.b = ctyyVar2;
                            this.c = cufpVar;
                        }

                        @Override // defpackage.deff
                        public final dehn a() {
                            ctct ctctVar2 = this.a;
                            return deew.h(cswe.b(cswe.a(ctctVar2.a).S, ctctVar2.d), new dbrn(ctctVar2, this.b, this.c) { // from class: ctbj
                                private final ctct a;
                                private final ctyy b;
                                private final cufp c;

                                {
                                    this.a = ctctVar2;
                                    this.b = r2;
                                    this.c = r3;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    ctct ctctVar3 = this.a;
                                    ctyy ctyyVar3 = this.b;
                                    cufp cufpVar3 = this.c;
                                    boolean z = false;
                                    if (!((Boolean) obj2).booleanValue()) {
                                        return z;
                                    }
                                    cted ctedVar = ctctVar3.b;
                                    ConversationId a4 = cufpVar3.a();
                                    ctmm c = ctmn.c();
                                    ((ctmh) c).a = "get conversation properties";
                                    c.b(ctmr.c);
                                    cttz cttzVar = (cttz) ctedVar;
                                    dehn a5 = cttzVar.a.a(UUID.randomUUID(), new ctvz(ctyyVar3, a4, cttzVar.d), cttzVar.a.d.e(), ctyyVar3, c.a(), true);
                                    int nextInt = ctctVar3.j.nextInt(cswe.a(ctctVar3.a).U.f().intValue());
                                    try {
                                        Long valueOf = Long.valueOf(cswe.a(ctctVar3.a).T.f().longValue() + nextInt);
                                        cusm H = ctctVar3.H(ctyyVar3);
                                        ConversationId a6 = cufpVar3.a();
                                        dcdc<Integer> a7 = ((ctff) deha.r(a5)).a();
                                        cstd.a();
                                        return Boolean.valueOf(H.c(a6, a7, System.currentTimeMillis() + valueOf.longValue()));
                                    } catch (ExecutionException unused) {
                                        cstl.a("LiMsgController");
                                        ctctVar3.H(ctyyVar3).c(cufpVar3.a(), cufpVar3.k(), cufpVar3.l().longValue() + nextInt);
                                        return z;
                                    }
                                }
                            }, ctctVar2.d);
                        }
                    }, ctctVar.d);
                }
                return cufpVar;
            }
        });
    }

    public final dehn<cugu> x(final ctyy ctyyVar, final cugu cuguVar, final boolean z) {
        final deig d = deig.d();
        this.B.execute(new Runnable(this, cuguVar, z, ctyyVar, d) { // from class: ctam
            private final ctct a;
            private final cugu b;
            private final boolean c;
            private final ctyy d;
            private final deig e;

            {
                this.a = this;
                this.b = cuguVar;
                this.c = z;
                this.d = ctyyVar;
                this.e = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctct ctctVar = this.a;
                cugu cuguVar2 = this.b;
                boolean z2 = this.c;
                ctyy ctyyVar2 = this.d;
                deig deigVar = this.e;
                cugi n = cuguVar2.n();
                n.i(z2 ? cugo.LOCAL : cugo.OUTGOING_SENDING);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cstd.a();
                n.m(Long.valueOf(timeUnit.toMicros(System.currentTimeMillis() + (z2 ? 0L : cswe.a(ctctVar.a).t.f().longValue()))));
                cugu a = n.a();
                ctctVar.H(ctyyVar2).f(a);
                deigVar.j(a);
            }
        });
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<Boolean> y(ctyy ctyyVar, ConversationId conversationId) {
        final deig d = deig.d();
        this.e.a(ctyyVar).p(conversationId, 1, 0, cugt.f).k(new cusr(d) { // from class: ctas
            private final deig a;

            {
                this.a = d;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                this.a.j(Boolean.valueOf(((dcdc) obj).isEmpty()));
            }
        });
        return d;
    }

    public final void z(final ctyy ctyyVar, final String str, cufp cufpVar) {
        d(ctyyVar, cufpVar.a(), 1, 0).k(new cusr(this, ctyyVar, str) { // from class: ctbb
            private final ctct a;
            private final ctyy b;
            private final String c;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
            /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
            @Override // defpackage.cusr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 375
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ctbb.a(java.lang.Object):void");
            }
        });
    }
}
