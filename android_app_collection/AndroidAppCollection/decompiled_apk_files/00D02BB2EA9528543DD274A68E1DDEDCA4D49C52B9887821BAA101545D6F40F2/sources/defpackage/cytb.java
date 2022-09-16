package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cytb  reason: default package */
/* loaded from: classes5.dex */
public final class cytb extends cyua {
    public final String a;
    public final dehn<czfm> b;
    public final cyzm c;
    public final czcj d;
    public final dehp e;
    public czdc f;
    public final Context g;

    public cytb(ClientConfigInternal clientConfigInternal, String str, czct czctVar, cyph cyphVar, ExecutorService executorService, dehn<czfm> dehnVar, cyzm cyzmVar, czcj czcjVar, Context context) {
        super(clientConfigInternal, czctVar, cyphVar);
        this.a = str;
        dbsk.s(dehnVar);
        this.b = dehnVar;
        dbsk.s(cyzmVar);
        this.c = cyzmVar;
        this.d = czcjVar;
        this.e = dehx.c(executorService);
        this.g = context;
        if (clientConfigInternal.q) {
            czcjVar.i(clientConfigInternal);
        }
    }

    private final void h(final cytq cytqVar, final cyta cytaVar, final cywa cywaVar) {
        if (!dybc.a.a().a() || this.c.b()) {
            this.e.a(new Runnable(this, cytqVar, cywaVar, cytaVar) { // from class: cyso
                private final cytb a;
                private final cytq b;
                private final cywa c;
                private final cyta d;

                {
                    this.a = this;
                    this.b = cytqVar;
                    this.c = cywaVar;
                    this.d = cytaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cyyf cyyfVar;
                    cytb cytbVar = this.a;
                    cytq cytqVar2 = this.b;
                    cywa cywaVar2 = this.c;
                    final cyta cytaVar2 = this.d;
                    try {
                        cyzm cyzmVar = cytbVar.c;
                        String str = cytqVar2.b;
                        cytaVar2.getClass();
                        cyem cyemVar = new cyem(cytaVar2) { // from class: cysu
                            private final cyta a;

                            {
                                this.a = cytaVar2;
                            }

                            @Override // defpackage.cyem
                            public final void a(Object obj) {
                                this.a.b((cyzo) obj);
                            }
                        };
                        cyor cyorVar = cytqVar2.k;
                        dbsk.t(str, "query is a required parameter.");
                        dbsk.t(cywaVar2, "queryOptions is a required parameter.");
                        if (((cyyg) cyzmVar).b()) {
                            dcdc<cyzl> e = dcdc.e();
                            cyes cyesVar = cyes.SUCCESS;
                            try {
                                dbtp b = ((cyyg) cyzmVar).c.b();
                                if (str.isEmpty()) {
                                    int i = 7;
                                    if (!dyat.b() || (cyyfVar = ((cyyg) cyzmVar).d) == null) {
                                        e = ((cyyg) cyzmVar).a(str, cyorVar);
                                        ((cyyg) cyzmVar).c.e(7, b, cyorVar);
                                    } else {
                                        if (cyyfVar.a != null) {
                                            i = 8;
                                        }
                                        cyyf cyyfVar2 = ((cyyg) cyzmVar).d;
                                        dcdc<cyzl> dcdcVar = cyyfVar2.a;
                                        e = dcdcVar != null ? dcdcVar : cyyfVar2.a();
                                        ((cyyg) cyzmVar).c.e(i, b, cyorVar);
                                    }
                                } else {
                                    e = ((cyyg) cyzmVar).a(str, cyorVar);
                                    ((cyyg) cyzmVar).c.e(9, b, cyorVar);
                                }
                            } catch (RuntimeException unused) {
                                ((cyyg) cyzmVar).c.f(4, 2, cyorVar);
                                cyesVar = cyes.FAILED_UNKNOWN;
                            }
                            int size = e.size();
                            StringBuilder sb = new StringBuilder(28);
                            sb.append("Returning ");
                            sb.append(size);
                            sb.append(" items.");
                            sb.toString();
                            cyzn c = cyzo.c();
                            c.c(cyesVar);
                            c.b(e);
                            cyemVar.a(c.a());
                            return;
                        }
                        cyemVar.a(cyzo.d(cyes.SUCCESS));
                    } catch (Exception unused2) {
                        cypg.c(cytbVar.j, 4, 2, cytqVar2.k);
                        cytaVar2.b(cyzo.d(cyes.FAILED_UNKNOWN));
                    }
                }
            });
        } else {
            cytaVar.b(cyzo.d(cyes.SUCCESS));
        }
        if (dyaw.f()) {
            deha.q(deew.g(this.b, new defg(cytqVar, cywaVar) { // from class: cysp
                private final cytq a;
                private final cywa b;

                {
                    this.a = cytqVar;
                    this.b = cywaVar;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    cytq cytqVar2 = this.a;
                    return ((czfm) obj).d(cytqVar2.b, this.b);
                }
            }, this.e), new cysy(this, cytaVar, cytqVar), this.e);
        } else {
            this.b.Pk(new Runnable(this, cytqVar, cywaVar, cytaVar) { // from class: cysq
                private final cytb a;
                private final cytq b;
                private final cywa c;
                private final cyta d;

                {
                    this.a = this;
                    this.b = cytqVar;
                    this.c = cywaVar;
                    this.d = cytaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cytb cytbVar = this.a;
                    cytq cytqVar2 = this.b;
                    cywa cywaVar2 = this.c;
                    final cyta cytaVar2 = this.d;
                    try {
                        String str = cytqVar2.b;
                        cytaVar2.getClass();
                        ((czfm) deha.r(cytbVar.b)).c(str, cywaVar2, new cyem(cytaVar2) { // from class: cyst
                            private final cyta a;

                            {
                                this.a = cytaVar2;
                            }

                            @Override // defpackage.cyem
                            public final void a(Object obj) {
                                this.a.a((czfo) obj);
                            }
                        });
                    } catch (Exception unused) {
                        cypg.c(cytbVar.j, 3, 2, cytqVar2.k);
                        czfn i = czfo.i();
                        i.g(cyes.FAILED_UNKNOWN);
                        i.b(AffinityContext.b);
                        i.e(dcdc.e());
                        cytaVar2.a(i.a());
                    }
                }
            }, this.e);
        }
        if (cywaVar.c()) {
            if (dyaw.f()) {
                deha.q(this.d.h(this.h, cytqVar.b, cytqVar.k), new cysz(this, cytaVar, cytqVar), this.e);
                return;
            } else {
                this.e.a(new Runnable(this, cytaVar, cytqVar) { // from class: cysr
                    private final cytb a;
                    private final cyta b;
                    private final cytq c;

                    {
                        this.a = this;
                        this.b = cytaVar;
                        this.c = cytqVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cytb cytbVar = this.a;
                        final cyta cytaVar2 = this.b;
                        cytq cytqVar2 = this.c;
                        try {
                            czcj czcjVar = cytbVar.d;
                            ClientConfigInternal clientConfigInternal = cytbVar.h;
                            cytaVar2.getClass();
                            czcjVar.g(clientConfigInternal, new cyem(cytaVar2) { // from class: cyss
                                private final cyta a;

                                {
                                    this.a = cytaVar2;
                                }

                                @Override // defpackage.cyem
                                public final void a(Object obj) {
                                    this.a.c((czcl) obj);
                                }
                            }, cytqVar2.b, cytqVar2.k);
                        } catch (Exception unused) {
                            cypg.c(cytbVar.j, 6, 2, cytqVar2.k);
                            czck d = czcl.d();
                            d.d(cyes.FAILED_UNKNOWN);
                            cytaVar2.c(d.a());
                        }
                    }
                });
                return;
            }
        }
        cytaVar.c(czcl.a);
    }

    @Override // defpackage.cyua
    public final void a(cytq cytqVar) {
        boolean z;
        dbsk.t(cytqVar, "queryState is a required parameter");
        cygp cygpVar = cytqVar.b.isEmpty() ? this.h.B : this.h.C;
        cyvz e = cywa.e();
        e.e(cytqVar.d);
        e.d(cygpVar);
        e.f(this.h.y);
        e.c(this.h.z);
        cywa g = e.g();
        ClientConfigInternal clientConfigInternal = this.h;
        if (!clientConfigInternal.x) {
            if (dyat.a.a().h()) {
                z = dyat.a.a().f();
            } else {
                z = clientConfigInternal.A;
            }
            if (z) {
                h(cytqVar, new cysx(this, cytqVar, g, (!cytqVar.b.isEmpty() || !dyaq.b()) ? cytqVar.a() : cyel.a, new cysw(this, g, cytqVar, cytqVar.a())), g);
                return;
            }
        }
        h(cytqVar, new cysv(this, cytqVar, g, (!cytqVar.b.isEmpty() || !dyaq.b()) ? cytqVar.a() : cyel.a, cytqVar, cytqVar.a(), g, cytqVar.a()), g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyua
    public final dcdc<InAppNotificationTarget> b(cyvi cyviVar) {
        try {
            if (!this.b.isDone()) {
                return dcdc.e();
            }
            return ((czfm) deha.r(this.b)).f(cyviVar);
        } catch (ExecutionException e) {
            throw ((AssertionError) new AssertionError("topNPeopleCache's initialization encountered an ExecutionException.").initCause(e.getCause()));
        }
    }
}
