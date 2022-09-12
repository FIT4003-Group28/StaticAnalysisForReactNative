package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ctsr  reason: default package */
/* loaded from: classes5.dex */
public final class ctsr implements dyzg {
    public dyyx a;
    final /* synthetic */ deig b;
    final /* synthetic */ ctfw c;
    final /* synthetic */ UUID d;
    final /* synthetic */ ctyy e;
    final /* synthetic */ ctss f;
    final /* synthetic */ ctwo g;

    public ctsr(ctss ctssVar, deig deigVar, ctfw ctfwVar, ctwo ctwoVar, UUID uuid, ctyy ctyyVar) {
        this.f = ctssVar;
        this.b = deigVar;
        this.c = ctfwVar;
        this.g = ctwoVar;
        this.d = uuid;
        this.e = ctyyVar;
    }

    @Override // defpackage.dyzk
    public final void a(Throwable th) {
        int i;
        long j = 0;
        try {
            if (this.b.isDone()) {
                j = TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) this.b.get()).longValue());
            }
        } catch (InterruptedException | ExecutionException unused) {
            cstl.a("Backend");
        }
        cszv cszvVar = (cszv) this.c;
        cszvVar.a.p();
        final cszw cszwVar = cszvVar.a;
        dyjb c = dyjb.c(th);
        if (c == null || !dyjb.c.p.equals(c.p)) {
            if (String.valueOf(cszwVar.b.b().e().a()).length() == 0) {
                new String("BindV2 stream error for ");
            }
            cstl.a("MsgReceiver");
            cswk cswkVar = cszwVar.l;
            Context context = cszwVar.c;
            dehp dehpVar = cszwVar.h;
            if (!dyaa.d.f().booleanValue() || !csvw.a(context) || !dyjb.m.equals(c) || cswkVar.b <= 0) {
                cszwVar.j.L(4);
            } else {
                int nextInt = cswkVar.a.nextInt(ctmr.c.e());
                if (cswkVar.b == 3) {
                    i = (int) ctmr.c.c();
                } else {
                    double d = ctmr.c.d();
                    double d2 = cswkVar.c;
                    Double.isNaN(d2);
                    i = (int) (d * d2);
                }
                int i2 = i + nextInt;
                cswkVar.c = i2;
                cswkVar.b--;
                cszwVar.getClass();
                cswkVar.d = csvs.a(i2, new dbty(cszwVar) { // from class: cswj
                    private final cszw a;

                    {
                        this.a = cszwVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return this.a.f();
                    }
                }, dehpVar);
            }
        } else {
            if (String.valueOf(cszwVar.b.b().e().a()).length() == 0) {
                new String("BindV2 stream CANCELLED for ");
            }
            cstl.a("MsgReceiver");
        }
        ctwo ctwoVar = this.g;
        UUID uuid = this.d;
        int i3 = dyjb.c(th).p.r;
        ctog ctogVar = this.f.c;
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(ctwoVar.a.b().e());
        r.o(ctwoVar.a.c().J());
        r.p(uuid.toString());
        r.j(11);
        r.m(Integer.valueOf(i3));
        r.f(5);
        r.e(j);
        ctogVar.b(r.a());
        this.a = null;
        if (cttj.a().c(th) == 6) {
            cstl.a("Backend");
            this.f.e.f(this.e.b().e());
        }
    }

    @Override // defpackage.dyzk
    public final void b() {
        cszv cszvVar = (cszv) this.c;
        if (String.valueOf(cszvVar.a.b.b().e().a()).length() == 0) {
            new String("BindV2 stream onCompleted for ");
        }
        cstl.a("MsgReceiver");
        cszvVar.a.p();
        if (cswe.a(cszvVar.a.c).d.f().booleanValue()) {
            cswg.b();
            if (cswg.a(cszvVar.a.c)) {
                cszvVar.a.f();
            }
        }
        cszvVar.a.l.a();
        this.a = null;
    }

    @Override // defpackage.dyzk
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        String a;
        ctwo ctwoVar = this.g;
        dxup dxupVar = (dxup) ((dssj) obj);
        final ctes ctesVar = new ctes();
        int i = dxupVar.a;
        if (i == 2) {
            ctyy ctyyVar = ctwoVar.a;
            Context context = ctwoVar.b;
            ctuv.a((dxtx) dxupVar.b, ctyyVar, context, ctwoVar.c, ctog.a(context)).h(new dbrn(ctesVar) { // from class: ctwm
                private final ctfq a;

                {
                    this.a = ctesVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj2) {
                    ctfq ctfqVar = this.a;
                    ((ctes) ctfqVar).a = dbsg.i((ctrg) obj2);
                    return ctfqVar;
                }
            });
            ctuv.d(dxupVar.a == 2 ? (dxtx) dxupVar.b : dxtx.e).h(new dbrn(ctesVar) { // from class: ctwn
                private final ctfq a;

                {
                    this.a = ctesVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj2) {
                    ctfq ctfqVar = this.a;
                    ((ctes) ctfqVar).b = dbsg.i((String) obj2);
                    return ctfqVar;
                }
            });
        } else if (i != 3 && i != 4 && i != 5) {
            String valueOf = String.valueOf(dxupVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("non-InboxMessage received");
            sb.append(valueOf);
            sb.toString();
            cstl.a("ReceiveMessagesHdlr");
        }
        ctfr a2 = ctesVar.a();
        ctfw ctfwVar = this.c;
        cstq.a();
        long j = 0;
        if (a2.b().a()) {
            cszv cszvVar = (cszv) ctfwVar;
            if (cswe.a(cszvVar.a.c).x.f().longValue() > 0) {
                synchronized (cszvVar.a) {
                    if (((cszv) ctfwVar).a.n.isEmpty()) {
                        final cszw cszwVar = ((cszv) ctfwVar).a;
                        cszwVar.s.postDelayed(new Runnable(cszwVar) { // from class: cszu
                            private final cszw a;

                            {
                                this.a = cszwVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.a();
                            }
                        }, cswe.a(((cszv) ctfwVar).a.c).x.f().longValue());
                    }
                    ((cszv) ctfwVar).a.n.add(a2.b().b());
                }
            } else {
                cszvVar.a.h(Collections.singletonList(a2.b().b()));
            }
        }
        if (a2.a().a()) {
            cszv cszvVar2 = (cszv) ctfwVar;
            cszvVar2.a.j(a2.a().b());
            cszvVar2.a.i(Arrays.asList(a2.a().b()));
        }
        ((cszv) ctfwVar).a.l.a();
        try {
            if (this.b.isDone()) {
                j = TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) this.b.get()).longValue());
            }
        } catch (InterruptedException | ExecutionException unused) {
            cstl.a("Backend");
        }
        ctwo ctwoVar2 = this.g;
        ctog ctogVar = this.f.c;
        if (a2.a().a()) {
            int m = a2.a().b().m();
            int i2 = m - 1;
            if (m == 0) {
                throw null;
            }
            if (i2 == 0) {
                a = a2.a().b().e().a();
            } else if (i2 == 1) {
                a = a2.a().b().f().a();
            } else if (i2 == 2) {
                a = a2.a().b().g().b();
            } else if (i2 == 3) {
                a = a2.a().b().h().a();
            } else if (i2 != 4) {
                cstl.a("ReceiveMessagesHdlr");
                return;
            } else {
                ConversationId k = a2.a().b().k();
                if (k == null) {
                    cstl.a("ReceiveMessagesHdlr");
                    return;
                }
                a = k.toString();
            }
            ctxm r = ctxn.r();
            r.g(10003);
            r.n(ctwoVar2.a.b().e());
            r.o(ctwoVar2.a.c().J());
            r.p(a);
            r.j(11);
            r.f(4);
            r.e(j);
            ctogVar.b(r.a());
        }
    }

    @Override // defpackage.dyzg
    public final void d(dyyx dyyxVar) {
        this.b.j(Long.valueOf(SystemClock.elapsedRealtime()));
        this.a = dyyxVar;
        ((cszv) this.c).b = new ctsq(this);
    }
}
