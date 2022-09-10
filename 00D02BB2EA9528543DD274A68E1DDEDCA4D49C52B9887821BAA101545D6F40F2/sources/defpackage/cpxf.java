package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
/* compiled from: PG */
/* renamed from: cpxf  reason: default package */
/* loaded from: classes5.dex */
public final class cpxf extends cpyp {
    public cpxe b;
    public boolean c;
    final cpxu d;
    public cpwv g;
    private KeyguardManager.KeyguardDismissCallback h;
    public final Handler a = new Handler(Looper.getMainLooper());
    public dbsg<Runnable> e = dbpy.a;
    protected deig<cpyl> f = deig.d();

    public cpxf(Context context) {
        this.d = new cpxu(context);
        this.f.j(cpyl.a);
    }

    public final dbsg<Activity> b() {
        return this.d.b;
    }

    public final void c() {
        if (!this.f.isDone()) {
            this.f.cancel(true);
        }
        this.f = deig.d();
    }

    public final void d(dbsg<Activity> dbsgVar) {
        if (this.c) {
            this.d.a();
        }
        final cpxu cpxuVar = this.d;
        cpxuVar.b = dbsgVar;
        cpxuVar.c = dbsgVar.h(new dbrn(cpxuVar) { // from class: cpxh
            private final cpxu a;

            {
                this.a = cpxuVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new cpxt(this.a, ((Activity) obj).getWindow());
            }
        });
        if (cpxuVar.c.a()) {
            Window window = cpxuVar.c.b().a;
        }
        if (this.c) {
            cpxu cpxuVar2 = this.d;
            cpxuVar2.c.a();
            if (!cpxuVar2.c.a()) {
                return;
            }
            cpxt b = cpxuVar2.c.b();
            if (cpxuVar2.c()) {
                b.e();
                if (cpxuVar2.e.a()) {
                    b.b();
                }
            }
            b.c();
            if (!cpxuVar2.f.a()) {
                return;
            }
            b.a(cpxuVar2.f.b().intValue());
        }
    }

    @Override // defpackage.cpyq
    public final void e(byte[] bArr) {
        Object b;
        Object b2;
        if (this.g instanceof cpwv) {
            try {
                cpzf cpzfVar = (cpzf) dsqw.cr(cpzf.b, bArr, dsqa.c());
                cpwv cpwvVar = this.g;
                int a = cpze.a(cpzfVar.a);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 1;
                if (i != 3) {
                    switch (i) {
                        case 6:
                            f();
                            final asak asakVar = (asak) cpwvVar;
                            if (!asakVar.b.g()) {
                                return;
                            }
                            asakVar.b.i.a();
                            asakVar.b.d.execute(new Runnable(asakVar) { // from class: asaj
                                private final asak a;

                                {
                                    this.a = asakVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    asam asamVar = this.a.b;
                                    ddda dddaVar = ddda.dy;
                                    cjqy cjqyVar = asamVar.g;
                                    cjsx i2 = cjsy.i();
                                    i2.b(dddaVar);
                                    cjqyVar.k(i2.a());
                                }
                            });
                            return;
                        case 7:
                            dsqv<cpzf, cqab> dsqvVar = cpzz.a;
                            cpzfVar.f(dsqvVar);
                            if (!cpzfVar.V.k(dsqvVar.d)) {
                                return;
                            }
                            dsqv<cpzf, cqab> dsqvVar2 = cpzz.a;
                            cpzfVar.f(dsqvVar2);
                            Object l = cpzfVar.V.l(dsqvVar2.d);
                            if (l == null) {
                                b2 = dsqvVar2.b;
                            } else {
                                b2 = dsqvVar2.b(l);
                            }
                            int i2 = ((cqab) b2).a;
                            return;
                        case 8:
                            if (!b().a() || Build.VERSION.SDK_INT < 26) {
                                return;
                            }
                            KeyguardManager keyguardManager = (KeyguardManager) b().b().getSystemService("keyguard");
                            if (this.h == null) {
                                this.h = new cpxd(this);
                            }
                            keyguardManager.requestDismissKeyguard(b().b(), this.h);
                            return;
                        case 9:
                            this.f.j(cpyl.a);
                            return;
                        default:
                            return;
                    }
                }
                dsqv<cpzf, cpyk> dsqvVar3 = cqal.a;
                cpzfVar.f(dsqvVar3);
                if (!cpzfVar.V.k(dsqvVar3.d)) {
                    return;
                }
                dsqv<cpzf, cpyk> dsqvVar4 = cqal.a;
                cpzfVar.f(dsqvVar4);
                Object l2 = cpzfVar.V.l(dsqvVar4.d);
                if (l2 == null) {
                    b = dsqvVar4.b;
                } else {
                    b = dsqvVar4.b(l2);
                }
                cpyk cpykVar = (cpyk) b;
                int a2 = cpyj.a(cpykVar.a);
                if (a2 == 0) {
                    a2 = 1;
                }
                String valueOf = String.valueOf(Integer.toString(a2 - 1));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("VOICE_PLATE_STATE ");
                sb.append(valueOf);
                sb.toString();
                cpwv cpwvVar2 = this.g;
                int a3 = cpyj.a(cpykVar.a);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i3 = cpykVar.a;
                int a4 = cpyh.a(cpykVar.d);
                if (a4 == 0 || a4 != 4) {
                    cpwvVar2.a(cpykVar);
                    return;
                }
                if (this.e.a()) {
                    this.a.removeCallbacks(this.e.b());
                    this.e = dbpy.a;
                }
                if (a3 == 2) {
                    cpxu cpxuVar = this.d;
                    boolean z = cpykVar.e;
                    if (cpxuVar.c.a()) {
                        cpxuVar.c.b().c();
                        if (cpxuVar.c()) {
                            cpxuVar.c.b().e();
                        }
                    }
                    dbsg<cpxt> dbsgVar = cpxuVar.d;
                    int d = cpxu.d(z);
                    cpxuVar.a.compareAndSet(false, z);
                    if (cpxuVar.c.a()) {
                        cpxuVar.c.b().a(d);
                    }
                    dbsg<cpxt> dbsgVar2 = cpxuVar.d;
                    cpxuVar.f = dbsg.i(Integer.valueOf(d));
                    if (!this.c) {
                        this.c = true;
                    }
                } else if (this.c) {
                    this.d.b();
                    this.c = false;
                }
                cpwvVar2.a(cpykVar);
            } catch (dsrm unused) {
            }
        }
    }

    public final void f() {
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(51);
        sb.append("#resetStates(): isMorrisVoicePlateOpened = %b ");
        sb.append(z);
        sb.toString();
        if (this.e.a()) {
            this.a.removeCallbacks(this.e.b());
            this.e = dbpy.a;
        }
        if (!this.c) {
            return;
        }
        this.d.b();
        this.c = false;
    }
}
