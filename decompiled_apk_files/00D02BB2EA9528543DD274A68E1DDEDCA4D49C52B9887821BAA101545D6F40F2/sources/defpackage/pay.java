package defpackage;

import android.app.Application;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pay  reason: default package */
/* loaded from: classes7.dex */
public final class pay implements pag {
    static final long a = TimeUnit.DAYS.toMillis(3);
    public static final /* synthetic */ int k = 0;
    public final akfa b;
    public final Executor c;
    public final buwj d;
    public final ped e;
    public final bvjj f;
    public final btvo g;
    public final cqat h;
    public final Set<btlu> i = new HashSet();
    public final cvtp j;
    private final Application l;
    private final Executor m;

    public pay(Application application, cvtp cvtpVar, akfa akfaVar, Executor executor, Executor executor2, buwj buwjVar, ped pedVar, bvjj bvjjVar, btvo btvoVar, cqat cqatVar) {
        this.l = application;
        this.j = cvtpVar;
        this.b = akfaVar;
        this.m = executor;
        this.c = executor2;
        this.d = buwjVar;
        this.e = pedVar;
        this.f = bvjjVar;
        this.g = btvoVar;
        this.h = cqatVar;
    }

    @Override // defpackage.pag
    public final dutq a() {
        String str;
        try {
            str = this.j.a.a();
        } catch (cvml unused) {
            cvlw.f("ChimeRegistrationApiImpl", "Failed to get the registration ID", new Object[0]);
            str = null;
        }
        if (str == null) {
            return dutq.d;
        }
        dutp bZ = dutq.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dutq dutqVar = (dutq) bZ.b;
        str.getClass();
        dutqVar.a |= 1;
        dutqVar.b = str;
        String packageName = this.l.getPackageName();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dutq dutqVar2 = (dutq) bZ.b;
        packageName.getClass();
        dutqVar2.a |= 16;
        dutqVar2.c = packageName;
        return bZ.bK();
    }

    @Override // defpackage.pag
    public final void b() {
        c();
    }

    public final void c() {
        this.m.execute(new Runnable(this) { // from class: paw
            private final pay a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                pay payVar = this.a;
                List<btlu> t = payVar.b.t();
                if (payVar.b.d()) {
                    return;
                }
                for (btlu btluVar : t) {
                    if (btluVar.l()) {
                        payVar.j.a(btluVar.s().name);
                        long x = payVar.f.x(bvjk.gi, btluVar, Long.MIN_VALUE);
                        long j = pay.a;
                        if ((payVar.g.getNotificationsParameters().a & 1) != 0) {
                            j = payVar.g.getNotificationsParameters().c;
                        }
                        if (payVar.h.b() >= x + j) {
                            synchronized (payVar) {
                                if (!payVar.i.contains(btluVar)) {
                                    payVar.i.add(btluVar);
                                    dutl bZ = dutm.k.bZ();
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dutm dutmVar = (dutm) bZ.b;
                                    dutmVar.a |= 2048;
                                    dutmVar.j = true;
                                    dlgp a2 = payVar.e.a();
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dutm dutmVar2 = (dutm) bZ.b;
                                    a2.getClass();
                                    dutmVar2.h = a2;
                                    dutmVar2.a |= 64;
                                    payVar.d.a().e = btluVar;
                                    payVar.d.c().b(bZ.bK(), new pax(payVar, btluVar), payVar.c);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        });
    }
}
