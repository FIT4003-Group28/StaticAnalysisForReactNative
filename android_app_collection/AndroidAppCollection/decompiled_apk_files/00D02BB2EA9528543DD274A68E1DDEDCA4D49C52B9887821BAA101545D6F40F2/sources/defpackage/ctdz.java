package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ctdz  reason: default package */
/* loaded from: classes5.dex */
public final class ctdz implements csuy {
    public final cted a;
    private final Context g;
    private final ctgc h;
    public final Handler e = new Handler(Looper.getMainLooper());
    private final Map<ConversationId, cusy<dcdc<ContactId>>> f = new HashMap();
    private final Map<ConversationId, Map<ContactId, Pair<Boolean, Long>>> i = new HashMap();
    public final Map<ConversationId, Long> c = new HashMap();
    public final Map<ConversationId, Long> d = new HashMap();
    public final dehp b = cstu.b().a;

    public ctdz(Context context, cted ctedVar, ctgc ctgcVar) {
        this.g = context;
        this.a = ctedVar;
        this.h = ctgcVar;
    }

    private final synchronized dcdc<ContactId> j(ConversationId conversationId) {
        if (!this.i.containsKey(conversationId)) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        for (Map.Entry<ContactId, Pair<Boolean, Long>> entry : this.i.get(conversationId).entrySet()) {
            if (((Boolean) entry.getValue().first).booleanValue()) {
                F.g(entry.getKey());
            }
        }
        return F.f();
    }

    @Override // defpackage.csuy
    public final synchronized cuss<dcdc<ContactId>> a(ConversationId conversationId) {
        if (!this.f.containsKey(conversationId)) {
            cusy<dcdc<ContactId>> cusyVar = new cusy<>(j(conversationId));
            this.f.put(conversationId, cusyVar);
            return cusyVar;
        }
        return this.f.get(conversationId);
    }

    @Override // defpackage.csuy
    public final synchronized void b(ConversationId conversationId, ContactId contactId, long j) {
        if (!this.i.containsKey(conversationId)) {
            this.i.put(conversationId, new LinkedHashMap());
        }
        if (!this.i.get(conversationId).containsKey(contactId) || ((Long) this.i.get(conversationId).get(contactId).second).longValue() <= j) {
            this.i.get(conversationId).put(contactId, Pair.create(true, Long.valueOf(j)));
            if (!this.f.containsKey(conversationId)) {
                return;
            }
            this.f.get(conversationId).a(j(conversationId));
        }
    }

    @Override // defpackage.csuy
    public final synchronized void c(ConversationId conversationId, ContactId contactId, long j) {
        if (!this.i.containsKey(conversationId)) {
            this.i.put(conversationId, new LinkedHashMap());
        }
        if (!this.i.get(conversationId).containsKey(contactId) || ((Long) this.i.get(conversationId).get(contactId).second).longValue() <= j) {
            this.i.get(conversationId).put(contactId, Pair.create(false, Long.valueOf(j)));
            if (!this.f.containsKey(conversationId)) {
                return;
            }
            this.f.get(conversationId).a(j(conversationId));
        }
    }

    @Override // defpackage.csuy
    public final synchronized void d(ConversationId conversationId) {
        this.i.put(conversationId, new LinkedHashMap());
        if (this.f.containsKey(conversationId)) {
            this.f.get(conversationId).a(j(conversationId));
        }
    }

    @Override // defpackage.csuy
    public final synchronized void e(ConversationId conversationId) {
        this.c.remove(conversationId);
    }

    @Override // defpackage.csuy
    public final synchronized void f(final ctyy ctyyVar, final ConversationId conversationId) {
        this.b.a(new Runnable(this, ctyyVar, conversationId) { // from class: ctdu
            private final ctdz a;
            private final ctyy b;
            private final ConversationId c;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = conversationId;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                final ctdz ctdzVar = this.a;
                final ctyy ctyyVar2 = this.b;
                final ConversationId conversationId2 = this.c;
                if (!ctdzVar.h()) {
                    return;
                }
                long c = dxzv.c();
                long micros = TimeUnit.MILLISECONDS.toMicros(dxzv.b());
                synchronized (ctdzVar) {
                    z = false;
                    if (!ctdzVar.c.containsKey(conversationId2)) {
                        ctdzVar.e.postDelayed(new Runnable(ctdzVar, ctyyVar2, conversationId2) { // from class: ctdv
                            private final ctdz a;
                            private final ctyy b;
                            private final ConversationId c;

                            {
                                this.a = ctdzVar;
                                this.b = ctyyVar2;
                                this.c = conversationId2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.i(this.b, this.c);
                            }
                        }, c);
                    } else {
                        if (ctdzVar.d.containsKey(conversationId2)) {
                            cstd.a();
                            if (System.currentTimeMillis() - ctdzVar.d.get(conversationId2).longValue() > TimeUnit.MICROSECONDS.toMillis(micros) - 2000) {
                            }
                        }
                        Map<ConversationId, Long> map = ctdzVar.c;
                        cstd.a();
                        map.put(conversationId2, Long.valueOf(System.currentTimeMillis()));
                    }
                    z = true;
                    Map<ConversationId, Long> map2 = ctdzVar.c;
                    cstd.a();
                    map2.put(conversationId2, Long.valueOf(System.currentTimeMillis()));
                }
                if (!z) {
                    return;
                }
                ctdzVar.g(ctyyVar2, conversationId2, true, 342);
            }
        });
    }

    public final void g(final ctyy ctyyVar, final ConversationId conversationId, final boolean z, final int i) {
        final long micros = TimeUnit.MILLISECONDS.toMicros(dxzv.b());
        this.h.a(ctyyVar).r(conversationId).k(new cusr(this, ctyyVar, conversationId, z, micros, i) { // from class: ctdx
            private final ctdz a;
            private final ctyy b;
            private final ConversationId c;
            private final boolean d;
            private final long e;
            private final int f;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = conversationId;
                this.d = z;
                this.e = micros;
                this.f = i;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                final ctdz ctdzVar = this.a;
                final ctyy ctyyVar2 = this.b;
                final ConversationId conversationId2 = this.c;
                final boolean z2 = this.d;
                final long j = this.e;
                final int i2 = this.f;
                if (((dbsg) obj).a()) {
                    ctdzVar.b.a(new Runnable(ctdzVar, ctyyVar2, conversationId2, z2, j, i2) { // from class: ctdy
                        private final ctdz a;
                        private final ctyy b;
                        private final ConversationId c;
                        private final boolean d;
                        private final long e;
                        private final int f;

                        {
                            this.a = ctdzVar;
                            this.b = ctyyVar2;
                            this.c = conversationId2;
                            this.d = z2;
                            this.e = j;
                            this.f = i2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ctdz ctdzVar2 = this.a;
                            ctyy ctyyVar3 = this.b;
                            ConversationId conversationId3 = this.c;
                            boolean z3 = this.d;
                            long j2 = this.e;
                            int i3 = this.f;
                            if (!ctdzVar2.h()) {
                                return;
                            }
                            synchronized (ctdzVar2) {
                                Map<ConversationId, Long> map = ctdzVar2.d;
                                cstd.a();
                                map.put(conversationId3, Long.valueOf(System.currentTimeMillis()));
                            }
                            ctmm c = ctmn.c();
                            ((ctmh) c).a = "send typing indicator";
                            c.b(ctmr.c);
                            ctmn a = c.a();
                            cted ctedVar = ctdzVar2.a;
                            cttz cttzVar = (cttz) ctedVar;
                            ctxe ctxeVar = new ctxe(cttzVar.b, ctyyVar3, conversationId3, z3, j2, cttz.d(conversationId3));
                            ctog ctogVar = cttzVar.c;
                            ctxm r = ctxn.r();
                            r.g(18);
                            r.n(ctyyVar3.b().e());
                            r.o(ctyyVar3.c().J());
                            r.p(ctxeVar.a);
                            r.d(conversationId3);
                            ctogVar.b(r.a());
                            ctog ctogVar2 = cttzVar.c;
                            ctxm r2 = ctxn.r();
                            r2.g(46);
                            r2.f(i3);
                            r2.n(ctyyVar3.b().e());
                            r2.o(ctyyVar3.c().J());
                            r2.p(ctxeVar.a);
                            r2.d(conversationId3);
                            ctogVar2.b(r2.a());
                            deha.q(cttzVar.a.a(UUID.randomUUID(), ctxeVar, cttzVar.a.d.d(), ctyyVar3, a, true), new cttw(cttzVar, ctyyVar3, ctxeVar, conversationId3), dege.a);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return dxzy.a.a().M() || (csvo.a(this.g).q() && dxzy.a.a().w());
    }

    public final void i(final ctyy ctyyVar, final ConversationId conversationId) {
        long j;
        boolean z;
        long c = dxzv.c();
        synchronized (this) {
            if (this.c.containsKey(conversationId)) {
                long longValue = this.c.get(conversationId).longValue();
                cstd.a();
                if (longValue <= System.currentTimeMillis() - c) {
                    this.c.remove(conversationId);
                    z = true;
                } else {
                    z = false;
                }
                cstd.a();
                j = (longValue + c) - System.currentTimeMillis();
            } else {
                j = -1;
                z = false;
            }
        }
        if (z) {
            g(ctyyVar, conversationId, false, 344);
        } else if (j <= 0) {
        } else {
            this.e.postDelayed(new Runnable(this, ctyyVar, conversationId) { // from class: ctdw
                private final ctdz a;
                private final ctyy b;
                private final ConversationId c;

                {
                    this.a = this;
                    this.b = ctyyVar;
                    this.c = conversationId;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.i(this.b, this.c);
                }
            }, j);
        }
    }
}
