package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: hay  reason: default package */
/* loaded from: classes3.dex */
public final class hay implements zph, hba {
    public zqw a;
    public hax b;
    public File c;
    private final Context d;
    private final Executor e;
    private final ankw f;
    private final azpx g = azpm.aI(true).aO();

    public hay(Context context, Executor executor, ankw ankwVar) {
        this.d = context;
        this.e = executor;
        this.f = ankwVar;
    }

    private final void r(final zdt zdtVar) {
        this.e.execute(new Runnable() { // from class: hav
            @Override // java.lang.Runnable
            public final void run() {
                hay hayVar = hay.this;
                zdt zdtVar2 = zdtVar;
                hax haxVar = hayVar.b;
                if (haxVar != null) {
                    zdtVar2.a(haxVar);
                }
            }
        });
    }

    public final zqv a() {
        zqw zqwVar = this.a;
        if (zqwVar != null) {
            return zqwVar.q();
        }
        return null;
    }

    @Override // defpackage.hba
    public final ayoi b() {
        return this.g.R();
    }

    @Override // defpackage.hba
    public final void c(axbm axbmVar) {
        axbk i = axbmVar.i();
        if (i.c == 1) {
            awzs awzsVar = ((axca) i.d).g;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
            zqv a = a();
            if (a == null) {
                return;
            }
            long e = axbmVar.e();
            zpa zpaVar = a.b;
            axaf a2 = axag.a();
            a2.copyOnWrite();
            ((axag) a2.instance).d(e);
            axao a3 = axat.a();
            a3.copyOnWrite();
            ((axat) a3.instance).s((axag) a2.mo39build());
            zpaVar.a.add((axat) a3.mo39build());
            zoz zozVar = zpaVar.c;
            if (zozVar != null) {
                zozVar.b();
            }
            String str = "";
            if ((awzsVar.b == 1 ? (String) awzsVar.c : str).isEmpty()) {
                return;
            }
            if (awzsVar.b == 1) {
                str = (String) awzsVar.c;
            }
            final File file = new File(new File(this.d.getFilesDir(), zny.a), str);
            ylx.k(this.f.qp(new Callable() { // from class: haw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File file2 = file;
                    boolean z = false;
                    if (file2.exists() && file2.delete()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }), this.f, new hke(str, 1), new aftw(str, 1));
            return;
        }
        zep.b("SVideoEffectsController: Unknown asset content");
    }

    @Override // defpackage.zph
    public final void d(axaj axajVar) {
        zep.b("SVideoEffectsController: Received unexpected EditedPositionableLayerEvent");
        afus.b(2, 6, "[ShortsCreation][Android][Edit]Received unexpected EditedPositionableLayerEvent");
    }

    @Override // defpackage.zph
    public final void e(final axbd axbdVar) {
        r(new zdt() { // from class: har
            @Override // defpackage.zdt
            public final void a(Object obj) {
                axbd axbdVar2 = axbd.this;
                hax haxVar = (hax) obj;
                if (haxVar != null) {
                    haxVar.r(axbdVar2.a());
                }
            }
        });
    }

    @Override // defpackage.zph
    public final void f(final axbm axbmVar) {
        if (axbmVar.i().c != 1) {
            zep.b("SVideoEffectsController: Unknown asset content");
        } else {
            r(new zdt() { // from class: has
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    axbm axbmVar2 = axbm.this;
                    hax haxVar = (hax) obj;
                    if (haxVar != null) {
                        haxVar.s(axbmVar2);
                    }
                }
            });
        }
    }

    @Override // defpackage.zph
    public final void g(boolean z) {
        r(new acee(z, 1));
    }

    @Override // defpackage.zph
    public final void h(final boolean z, final boolean z2) {
        r(new zdt() { // from class: hat
            @Override // defpackage.zdt
            public final void a(Object obj) {
                boolean z3 = z;
                boolean z4 = z2;
                hax haxVar = (hax) obj;
                if (haxVar != null) {
                    haxVar.aJ(z3, z4);
                }
            }
        });
    }

    @Override // defpackage.hba
    public final void i(zqx zqxVar) {
        zqv a = a();
        if (a != null) {
            a.e(false, zqxVar);
        }
    }

    @Override // defpackage.hba
    public final void j(boolean z) {
        zqv a = a();
        if (a != null) {
            zpa zpaVar = a.b;
            axar b = axar.b();
            axao a2 = axat.a();
            a2.copyOnWrite();
            ((axat) a2.instance).w(b);
            zpaVar.a.add((axat) a2.mo39build());
            zoz zozVar = zpaVar.c;
            if (zozVar == null || !z) {
                return;
            }
            zozVar.b();
        }
    }

    @Override // defpackage.hba
    public final void k(long j, long j2) {
        zqv a = a();
        if (a != null) {
            a.b.c(j, TimeUnit.MILLISECONDS.toMicros(j2), 0.0d, axbs.KEYFRAME_LABEL_END);
        }
    }

    @Override // defpackage.hba
    public final void l(long j, long j2) {
        zqv a = a();
        if (a != null) {
            a.b.c(j, TimeUnit.MILLISECONDS.toMicros(j2), 1.0d, axbs.KEYFRAME_LABEL_START);
        }
    }

    @Override // defpackage.zph
    public final void m(boolean z) {
    }

    @Override // defpackage.zph
    public final void n(boolean z) {
        this.g.c(Boolean.valueOf(z));
    }

    @Override // defpackage.hba
    public final void o(long j, int i) {
        zqv a = a();
        if (a != null) {
            zpa zpaVar = a.b;
            axao a2 = axat.a();
            axbu a3 = axbv.a();
            a3.copyOnWrite();
            ((axbv) a3.instance).f(j);
            a3.copyOnWrite();
            ((axbv) a3.instance).e(i);
            a2.copyOnWrite();
            ((axat) a2.instance).z((axbv) a3.mo39build());
            zpaVar.a.add((axat) a2.mo39build());
            zoz zozVar = zpaVar.c;
            if (zozVar == null) {
                return;
            }
            zozVar.b();
        }
    }

    public final void p(axbo axboVar) {
        zqv a = a();
        if (a != null) {
            zpa zpaVar = a.b;
            axao a2 = axat.a();
            a2.copyOnWrite();
            ((axat) a2.instance).C(axboVar);
            zpaVar.a.add((axat) a2.mo39build());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        final zqv a = a();
        if (a == null) {
            return false;
        }
        try {
            axbw axbwVar = (axbw) aed.c(new agr() { // from class: haq
                @Override // defpackage.agr
                public final Object a(final agp agpVar) {
                    zqv zqvVar = zqv.this;
                    zqvVar.e(false, new zqx() { // from class: hau
                        @Override // defpackage.zqx
                        public final void a(File file, axbw axbwVar2) {
                            agp agpVar2 = agp.this;
                            if (axbwVar2 != null) {
                                agpVar2.c(axbwVar2);
                            }
                        }
                    });
                    return zqvVar;
                }
            }).get(250L, TimeUnit.MILLISECONDS);
            return axbwVar != null && axbwVar.a() > 0;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            zep.b(valueOf.length() != 0 ? "hasTextEdit() Exception: ".concat(valueOf) : new String("hasTextEdit() Exception: "));
            return false;
        }
    }
}
