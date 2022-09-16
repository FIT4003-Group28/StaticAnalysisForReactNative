package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: csxc  reason: default package */
/* loaded from: classes5.dex */
public final class csxc implements csud {
    public static final cute a = new cute();
    public final Context b;
    public final ctiq d;
    public final csuy e;
    public final cttp g;
    private final ctgc h;
    final Set<ctyy> f = Collections.newSetFromMap(new ConcurrentHashMap());
    public final dehp c = cstu.b().a;

    public csxc(Context context, ctgc ctgcVar, cttp cttpVar, ctiq ctiqVar, csuy csuyVar) {
        this.b = context;
        this.h = ctgcVar;
        this.g = cttpVar;
        this.d = ctiqVar;
        this.e = csuyVar;
    }

    @Override // defpackage.csud
    public final void a(final ctyy ctyyVar) {
        if (!this.f.add(ctyyVar)) {
            return;
        }
        final dehn h = deew.h(e(ctyyVar, null), new dbrn(this, ctyyVar) { // from class: cswm
            private final csxc a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                csxc csxcVar = this.a;
                ctyy ctyyVar2 = this.b;
                csuc csucVar = (csuc) obj;
                if (csucVar != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    cusm d = csxcVar.d(ctyyVar2);
                    dcdc<ConversationId> b = csucVar.b();
                    csxc.a.getClass();
                    d.J(dchl.k(b, new dbrn() { // from class: cswr
                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            return cute.b((ConversationId) obj2);
                        }
                    }));
                    csxcVar.d.a(ctyyVar2).edit().putLong("BLOCK_LAST_SYNC_KEY", currentTimeMillis).commit();
                    return null;
                }
                return null;
            }
        }, dege.a);
        this.c.a(new Runnable(this, h, ctyyVar) { // from class: cswn
            private final csxc a;
            private final dehn b;
            private final ctyy c;

            {
                this.a = this;
                this.b = h;
                this.c = ctyyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                csxc csxcVar = this.a;
                final dehn dehnVar = this.b;
                ctyy ctyyVar2 = this.c;
                try {
                    deha.k(dehnVar).b(new Callable(dehnVar) { // from class: cswq
                        private final dehn a;

                        {
                            this.a = dehnVar;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return (Void) this.a.get();
                        }
                    }, dege.a).get();
                } catch (InterruptedException | ExecutionException unused) {
                    cstl.a("LitBlockController");
                }
                csxcVar.f.remove(ctyyVar2);
            }
        });
    }

    public final dehn<Void> b(dehn<Void> dehnVar, final ctyy ctyyVar, final ConversationId conversationId) {
        final dehn h = deew.h(dehnVar, new dbrn(this, ctyyVar, conversationId) { // from class: cswu
            private final csxc a;
            private final ctyy b;
            private final ConversationId c;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = conversationId;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Void r4 = (Void) obj;
                this.a.d(this.b).K(cute.b(this.c), true);
                return null;
            }
        }, dege.a);
        return deha.k(h).b(new Callable(h) { // from class: cswv
            private final dehn a;

            {
                this.a = h;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dehn dehnVar2 = this.a;
                try {
                    Void r1 = (Void) deha.r(dehnVar2);
                } catch (ExecutionException unused) {
                    cstl.a("LitBlockController");
                }
                return (Void) dehnVar2.get();
            }
        }, dege.a);
    }

    public final cuss<Boolean> c(final ctyy ctyyVar, ConversationId conversationId, final dbsl<cuey> dbslVar) {
        return cusl.d(d(ctyyVar).L(cute.b(conversationId)), new dbrn(this, dbslVar, ctyyVar) { // from class: csxb
            private final csxc a;
            private final dbsl b;
            private final ctyy c;

            {
                this.a = this;
                this.b = dbslVar;
                this.c = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                csxc csxcVar = this.a;
                dbsl dbslVar2 = this.b;
                ctyy ctyyVar2 = this.c;
                cuey cueyVar = (cuey) obj;
                if (dbslVar2.a(cueyVar)) {
                    csxcVar.a(ctyyVar2);
                }
                return Boolean.valueOf(cueyVar.a());
            }
        });
    }

    public final cusm d(ctyy ctyyVar) {
        return this.h.a(ctyyVar);
    }

    public final dehn<csuc> e(final ctyy ctyyVar, final String str) {
        ctmm c = ctmn.c();
        ((ctmh) c).a = "fetch blocked conversation";
        c.b(ctmr.c);
        final ctmn a2 = c.a();
        return deew.h(deew.g(cswe.b(cswe.a(this.b).o, this.c), new defg(this, ctyyVar, str, a2) { // from class: cswo
            private final csxc a;
            private final ctyy b;
            private final String c;
            private final ctmn d;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = str;
                this.d = a2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                csxc csxcVar = this.a;
                ctyy ctyyVar2 = this.b;
                String str2 = this.c;
                ctmn ctmnVar = this.d;
                Integer num = (Integer) obj;
                cttp cttpVar = csxcVar.g;
                dbsk.s(num);
                return cttpVar.a.a(UUID.randomUUID(), new ctvx(ctyyVar2, num.intValue(), str2), cttpVar.a.d.c(), ctyyVar2, ctmnVar, true);
            }
        }, this.c), new dbrn(this, ctyyVar) { // from class: cswp
            private final csxc a;
            private final ctyy b;

            {
                this.a = this;
                this.b = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                csxc csxcVar = this.a;
                ctyy ctyyVar2 = this.b;
                csuc csucVar = (csuc) obj;
                String a3 = csucVar.a();
                if (dbsj.d(a3)) {
                    return csucVar;
                }
                try {
                    csuc csucVar2 = csxcVar.e(ctyyVar2, a3).get();
                    csub c2 = csuc.c();
                    c2.b(dcdc.q(dcbg.d(csucVar.b(), csucVar2.b())));
                    c2.c(csucVar2.a());
                    return c2.a();
                } catch (InterruptedException | ExecutionException unused) {
                    cstl.a("LitBlockController");
                    return null;
                }
            }
        }, this.c);
    }
}
