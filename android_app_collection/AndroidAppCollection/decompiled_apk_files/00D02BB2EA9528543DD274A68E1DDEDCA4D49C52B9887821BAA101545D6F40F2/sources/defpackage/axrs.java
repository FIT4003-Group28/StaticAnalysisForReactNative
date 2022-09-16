package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: axrs  reason: default package */
/* loaded from: classes.dex */
public final class axrs implements axrx {
    private static final dcqe j = dcqe.c("axrs");
    public final ff a;
    public final bvjj b;
    public final dxio<cztz> c;
    public final cjqy d;
    public final cjqq e;
    public final Runnable f;
    public final cklg g;
    public final arai h;
    public final ckcw i;
    private final Queue<axrr> k;
    private final axru l;
    private final axrf m;

    public axrs(ff ffVar, axru axruVar, bvjj bvjjVar, dxio<cztz> dxioVar, cjqy cjqyVar, cjqq cjqqVar, cklg cklgVar, Runnable runnable, Queue<axrr> queue, axrf axrfVar, arai araiVar, ckcw ckcwVar) {
        this.a = ffVar;
        this.l = axruVar;
        this.b = bvjjVar;
        this.c = dxioVar;
        this.d = cjqyVar;
        this.e = cjqqVar;
        this.g = cklgVar;
        this.f = runnable;
        this.k = queue;
        this.m = axrfVar;
        this.h = araiVar;
        this.i = ckcwVar;
    }

    public final void a(final axrw axrwVar, String str) {
        if (!this.a.shouldShowRequestPermissionRationale("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            this.i.s(ckdn.d, ckdm.a(2));
            b("android.permission.ACCESS_BACKGROUND_LOCATION", new axrw(this, axrwVar) { // from class: axrj
                private final axrs a;
                private final axrw b;

                {
                    this.a = this;
                    this.b = axrwVar;
                }

                @Override // defpackage.axrw
                public final void a(int i) {
                    int i2;
                    axrs axrsVar = this.a;
                    axrw axrwVar2 = this.b;
                    if (i == 0) {
                        i = 0;
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    axrsVar.i.s(ckdn.e, ckiz.a(i2));
                    axrwVar2.a(i);
                }
            });
            return;
        }
        this.i.s(ckdn.d, ckdm.a(1));
        ff ffVar = this.a;
        if (ffVar instanceof gga) {
            if (!((gga) ffVar).aZ) {
                return;
            }
            View.OnClickListener onClickListener = new View.OnClickListener(this, axrwVar) { // from class: axrk
                private final axrs a;
                private final axrw b;

                {
                    this.a = this;
                    this.b = axrwVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final axrs axrsVar = this.a;
                    final axrw axrwVar2 = this.b;
                    axrsVar.i.s(ckdn.f, ckdl.a(1));
                    axrsVar.b("android.permission.ACCESS_BACKGROUND_LOCATION", new axrw(axrsVar, axrwVar2) { // from class: axro
                        private final axrs a;
                        private final axrw b;

                        {
                            this.a = axrsVar;
                            this.b = axrwVar2;
                        }

                        @Override // defpackage.axrw
                        public final void a(int i) {
                            int i2;
                            axrs axrsVar2 = this.a;
                            axrw axrwVar3 = this.b;
                            if (i == 0) {
                                i = 0;
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            axrsVar2.i.s(ckdn.g, ckiz.a(i2));
                            axrwVar3.a(i);
                        }
                    });
                }
            };
            Runnable runnable = new Runnable(this, axrwVar) { // from class: axrl
                private final axrs a;
                private final axrw b;

                {
                    this.a = this;
                    this.b = axrwVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    axrs axrsVar = this.a;
                    axrw axrwVar2 = this.b;
                    axrsVar.i.s(ckdn.f, ckdl.a(2));
                    axrwVar2.a(-1);
                }
            };
            axqr axqrVar = new axqr();
            Bundle bundle = new Bundle();
            bundle.putString("JUSTIFICATION_KEY", str);
            axqrVar.B(bundle);
            axqrVar.a = onClickListener;
            axqrVar.b = runnable;
            ff ffVar2 = this.a;
            boolean a = gei.a(gga.L(ffVar2), axqrVar);
            ffVar2.g().aq();
            if (a) {
                this.i.s(ckdn.h, ckdk.a(1));
                return;
            }
            this.i.s(ckdn.h, ckdk.a(2));
            axrwVar.a(-1);
            return;
        }
        bvoo.h("Called to ask for background from outside of GmmFragmentActivity %s", ffVar.toString());
        axrwVar.a(-1);
    }

    @Override // defpackage.axrx
    public final void b(String str, final axrw axrwVar) {
        c(new String[]{str}, new axrv(axrwVar) { // from class: axrm
            private final axrw a;

            {
                this.a = axrwVar;
            }

            @Override // defpackage.axrv
            public final void a(int[] iArr) {
                this.a.a(iArr[0]);
            }
        });
    }

    @Override // defpackage.axrx
    public final void c(String[] strArr, axrv axrvVar) {
        synchronized (this.k) {
            this.k.add(new axrr(strArr, axrvVar));
            if (!this.m.a()) {
                this.m.b(true);
                this.a.requestPermissions(strArr, 1);
            }
        }
    }

    @Override // defpackage.axrx
    public final void d() {
        synchronized (this.k) {
            if (!ako.d() || this.k.peek() == null || !this.k.peek().a(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"})) {
                this.k.clear();
                this.m.b(false);
            }
        }
    }

    @Override // defpackage.axrx
    public final void e(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            if (strArr.length > 0) {
                bvrj.UI_THREAD.c();
                synchronized (this.k) {
                    axrr poll = this.k.poll();
                    if (poll == null) {
                        return;
                    }
                    if (!poll.a(strArr)) {
                        poll.b.a(new int[0]);
                    } else {
                        poll.b.a(iArr);
                    }
                    if (!this.k.isEmpty()) {
                        this.a.requestPermissions(this.k.peek().a, 1);
                    } else {
                        this.m.b(false);
                    }
                    return;
                }
            }
            d();
        }
    }

    @Override // defpackage.axrx
    public final void f(final axrw axrwVar) {
        if (!this.l.a("android.permission.ACCESS_FINE_LOCATION")) {
            b("android.permission.ACCESS_FINE_LOCATION", new axrp(this, new axrw(this, axrwVar) { // from class: axrn
                private final axrs a;
                private final axrw b;

                {
                    this.a = this;
                    this.b = axrwVar;
                }

                @Override // defpackage.axrw
                public final void a(int i) {
                    axrs axrsVar = this.a;
                    axrw axrwVar2 = this.b;
                    if (i == -100) {
                        axrsVar.d.i(cjtd.a(dtxu.cN));
                        axrsVar.f(axrwVar2);
                    } else if (i != -1) {
                    } else {
                        axrsVar.d.i(cjtd.a(dtxu.cO));
                        axrwVar2.a(-1);
                    }
                }
            }, axrwVar));
            this.e.g().d(cjtd.a(dtxu.da));
            return;
        }
        axrwVar.a(0);
        if (!this.b.m(bvjk.h, false)) {
            return;
        }
        this.b.S(bvjk.h, false);
    }

    @Override // defpackage.axrx
    public final void g(final axrw axrwVar) {
        if (!ako.d()) {
            b("android.permission.ACCESS_BACKGROUND_LOCATION", axrwVar);
            return;
        }
        ((ckcn) this.i.a(ckdn.a)).a();
        final String string = this.a.getResources().getString(R.string.BACKGROUND_LOCATION_JUSTIFICATION);
        if (this.l.a("android.permission.ACCESS_FINE_LOCATION")) {
            this.i.s(ckdn.b, ckdj.a(1));
            a(axrwVar, string);
            return;
        }
        this.i.s(ckdn.b, ckdj.a(2));
        b("android.permission.ACCESS_FINE_LOCATION", new axrw(this, axrwVar, string) { // from class: axri
            private final axrs a;
            private final axrw b;
            private final String c;

            {
                this.a = this;
                this.b = axrwVar;
                this.c = string;
            }

            @Override // defpackage.axrw
            public final void a(int i) {
                axrs axrsVar = this.a;
                axrw axrwVar2 = this.b;
                String str = this.c;
                if (i == 0) {
                    axrsVar.i.s(ckdn.c, ckiz.a(1));
                    axrsVar.a(axrwVar2, str);
                    return;
                }
                axrsVar.i.s(ckdn.c, ckiz.a(2));
                axrwVar2.a(i);
            }
        });
    }
}
