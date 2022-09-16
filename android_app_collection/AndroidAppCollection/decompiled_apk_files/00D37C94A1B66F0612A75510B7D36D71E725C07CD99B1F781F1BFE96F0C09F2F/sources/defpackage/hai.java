package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.youtube.R;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: hai  reason: default package */
/* loaded from: classes3.dex */
public final class hai implements hez, gzf, pjx, hgn {
    public final hkl A;
    public pxt B;
    public final hao C;
    public final gzv D;
    public final haj E;
    private final hki F;
    private aypg G;
    public final Executor c;
    public final apy d;
    public final snc e;
    public final hhl f;
    public final hfn g;
    public final hkg h;
    public final hef i;
    public Context j;
    public aypg k;
    public Uri l;
    public long m;
    public ShortsPlayerView n;
    public hah o;
    public hbg p;
    pkl r;
    zqq s;
    vqr u;
    public long v;
    public float w;
    public String x;
    public boolean y;
    public long a = -9223372036854775807L;
    public long b = 0;
    public boolean q = false;
    final zrp t = zsc.j();
    private final azpq H = azpq.e();
    public final azpq z = azpq.e();

    public hai(hki hkiVar, Executor executor, apy apyVar, snc sncVar, hhl hhlVar, hfn hfnVar, gzv gzvVar, hkl hklVar, hef hefVar, hkg hkgVar, haj hajVar, hao haoVar) {
        this.F = hkiVar;
        this.c = executor;
        this.d = apyVar;
        this.e = sncVar;
        this.f = hhlVar;
        this.g = hfnVar;
        this.D = gzvVar;
        this.A = hklVar;
        this.i = hefVar;
        this.h = hkgVar;
        this.E = hajVar;
        this.C = haoVar;
    }

    private final Object B(ampg ampgVar, Object obj) {
        pkl pklVar = this.r;
        return pklVar == null ? obj : ampgVar.apply(pklVar);
    }

    public final void A() {
        this.G = this.f.c().X(aypa.a()).as(new ayqb() { // from class: gzy
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                boolean z;
                final hai haiVar = hai.this;
                hhp hhpVar = (hhp) obj;
                ampq d = hhpVar.d();
                if (!d.h()) {
                    zep.b("Project unexpectedly missing ComposedVideo.");
                    afus.b(2, 6, "[ShortsCreation][Android][Edit]Null ComposedVideo on prepare video");
                    hah hahVar = haiVar.o;
                    if (hahVar == null) {
                        return;
                    }
                    ((gzt) hahVar).aH();
                    return;
                }
                haiVar.u = hhpVar.B();
                haiVar.B = new hag(haiVar.u, haiVar.E);
                pkl pklVar = haiVar.r;
                if (pklVar != null) {
                    pxt pxtVar = haiVar.B;
                    pklVar.M();
                    pklVar.o = pxtVar;
                    pkc d2 = pklVar.c.d(pklVar.d);
                    d2.f(7);
                    d2.e(pxtVar);
                    d2.d();
                }
                ShortsVideoMetadata shortsVideoMetadata = (ShortsVideoMetadata) d.c();
                zqq zqqVar = haiVar.s;
                if (zqqVar != null) {
                    double b = shortsVideoMetadata.b();
                    double a = shortsVideoMetadata.a();
                    Double.isNaN(b);
                    Double.isNaN(a);
                    double d3 = b / a;
                    double d4 = 360.0d;
                    if (b < 360.0d) {
                        a = 360.0d / d3;
                        b = 360.0d;
                    }
                    if (a < 360.0d) {
                        b = d3 * 360.0d;
                    } else {
                        d4 = a;
                    }
                    zqqVar.c(Math.min((int) Math.round(Math.max(b, d4)), 1280));
                }
                haiVar.l = shortsVideoMetadata.d();
                haiVar.h.d(haiVar.l);
                haiVar.m = shortsVideoMetadata.c();
                if (hhpVar.c().h()) {
                    haiVar.y = true;
                    haiVar.w = 0.0f;
                    z = true;
                } else {
                    haiVar.y = false;
                    z = false;
                }
                hah hahVar2 = haiVar.o;
                if (hahVar2 != null) {
                    long j = haiVar.m;
                    gzt gztVar = (gzt) hahVar2;
                    if (gztVar.c.g()) {
                        if (!z && gztVar.c.h()) {
                            hgp hgpVar = gztVar.ak;
                            View findViewById = gztVar.as.findViewById(R.id.shorts_edit_volume_button);
                            hai haiVar2 = gztVar.b;
                            actj actjVar = actj.SHORTS_CREATION_EDITOR_VOLUME_BALANCER_BUTTON;
                            findViewById.getClass();
                            haiVar2.getClass();
                            Context context = (Context) hgpVar.a.get();
                            context.getClass();
                            dt dtVar = (dt) hgpVar.b.get();
                            dtVar.getClass();
                            acti actiVar = (acti) hgpVar.c.get();
                            actiVar.getClass();
                            hfn hfnVar = (hfn) hgpVar.d.get();
                            hfnVar.getClass();
                            Executor executor = (Executor) hgpVar.e.get();
                            executor.getClass();
                            hkl hklVar = (hkl) hgpVar.f.get();
                            hklVar.getClass();
                            gztVar.ap = new hgo(findViewById, haiVar2, actjVar, context, dtVar, actiVar, hfnVar, executor, hklVar);
                        }
                        gztVar.ao = gztVar.e.a(gztVar.as.findViewById(R.id.shorts_edit_music_picker_button), gztVar.a, actj.SHORTS_CREATION_EDITOR_AUDIO_PICKER_BUTTON, !z);
                        gztVar.ao.e(true);
                        hgh hghVar = gztVar.ao;
                        hghVar.b.setVisibility(0);
                        TextView textView = hghVar.e;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                        gztVar.ao.a();
                        long min = Math.min(j, 15000L);
                        gztVar.an.a = z;
                        gztVar.af.p(gztVar.as.findViewById(R.id.shorts_edit_music_trim_button), gztVar.c.a(), min, gztVar.c.i() ? new gzq(gztVar) : null, gztVar.aB, actj.SHORTS_CREATION_EDITOR_AUDIO_SCRUBBER_BUTTON, true, gztVar.b, gztVar.an, gztVar.aq);
                    }
                }
                if (haiVar.g.a() == null) {
                    haiVar.g.j();
                }
                haiVar.k = haiVar.g.b().as(new ayqb() { // from class: gzz
                    @Override // defpackage.ayqb
                    public final void a(Object obj2) {
                        final hgo hgoVar;
                        pph pphVar;
                        final hai haiVar3 = hai.this;
                        ampq ampqVar = (ampq) obj2;
                        if (haiVar3.r == null) {
                            zep.b("ExoPlayer null while attempting to load video");
                        } else if (haiVar3.l == null || haiVar3.m == 0) {
                        } else {
                            if (ampqVar.h() && ((ShortsCreationSelectedTrack) ampqVar.c()).b() == null) {
                                return;
                            }
                            Context context2 = haiVar3.j;
                            axk axkVar = new axk(context2, pxi.E(context2, "VideoMPEG"));
                            final pqb a2 = new pra(axkVar).a(pjc.a(haiVar3.l));
                            vqr vqrVar = haiVar3.u;
                            if (vqrVar != null) {
                                a2 = new pph(a2, vqrVar.n(), haiVar3.u.l());
                            }
                            if (ampqVar.h() && ((ShortsCreationSelectedTrack) ampqVar.c()).b() != null) {
                                if (haiVar3.y) {
                                    haiVar3.w = 0.0f;
                                } else if (!((ShortsCreationSelectedTrack) ampqVar.c()).k().equals(haiVar3.x)) {
                                    haiVar3.w = 0.5f;
                                }
                                hbg hbgVar = haiVar3.p;
                                if (hbgVar != null) {
                                    hbgVar.a(haiVar3.w);
                                }
                                Uri b2 = ((ShortsCreationSelectedTrack) ampqVar.c()).b();
                                if (b2 != null) {
                                    prb a3 = new pra(axkVar).a(pjc.a(b2));
                                    long a4 = haiVar3.g.a().a();
                                    haiVar3.v = a4;
                                    if (haiVar3.p != null && a4 == 0) {
                                        haiVar3.v = 1L;
                                    }
                                    pphVar = new pph(a3, TimeUnit.MILLISECONDS.toMicros(haiVar3.v), TimeUnit.MILLISECONDS.toMicros(haiVar3.v + Math.min(haiVar3.m, 15000L)));
                                } else {
                                    pphVar = null;
                                }
                                if (pphVar != null) {
                                    a2 = new pqo(a2, pphVar);
                                } else {
                                    a2 = new pqo(a2);
                                }
                            } else {
                                hbg hbgVar2 = haiVar3.p;
                                if (hbgVar2 != null) {
                                    haiVar3.w = 1.0f;
                                    hbgVar2.a(1.0f);
                                }
                            }
                            if (ampqVar.h()) {
                                haiVar3.x = ((ShortsCreationSelectedTrack) ampqVar.c()).k();
                            } else {
                                haiVar3.x = null;
                            }
                            hah hahVar3 = haiVar3.o;
                            if (hahVar3 != null && (hgoVar = ((gzt) hahVar3).ap) != null) {
                                hgoVar.d.runOnUiThread(new Runnable() { // from class: hgm
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hgo hgoVar2 = hgo.this;
                                        hgoVar2.a.setProgress(Math.round((1.0f - ((hai) hgoVar2.c).w) * 100.0f));
                                        hgoVar2.a.setMax(100);
                                    }
                                });
                            }
                            haiVar3.m(new zdt() { // from class: hac
                                @Override // defpackage.zdt
                                public final void a(Object obj3) {
                                    hai haiVar4 = hai.this;
                                    pqb pqbVar = a2;
                                    pkl pklVar2 = (pkl) obj3;
                                    if (pklVar2 == null) {
                                        return;
                                    }
                                    pklVar2.z(!haiVar4.q);
                                    pklVar2.G(2);
                                    pklVar2.f(pqbVar);
                                    pklVar2.v();
                                }
                            });
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.pjx, defpackage.pyk
    public final /* synthetic */ void F(asr asrVar) {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void Y() {
    }

    @Override // defpackage.gzf
    public final long a() {
        long j = this.a;
        return j == -9223372036854775807L ? ((Long) B(gvq.d, 0L)).longValue() : j;
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ae(int i) {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ah() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void ap() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void aq() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void ar() {
    }

    @Override // defpackage.gzf
    public final long b() {
        return ((Long) B(gvq.e, 0L)).longValue();
    }

    @Override // defpackage.gzf
    public final ayoi c() {
        return this.H.R();
    }

    @Override // defpackage.gzf
    public final ayoi d() {
        return this.z.R();
    }

    @Override // defpackage.gzf
    public final void e() {
        m(etg.k);
    }

    @Override // defpackage.gzf
    public final void f() {
        m(etg.l);
    }

    @Override // defpackage.gzf
    public final void g(final long j) {
        m(new zdt() { // from class: gzw
            @Override // defpackage.zdt
            public final void a(Object obj) {
                hai haiVar = hai.this;
                long j2 = j;
                pkl pklVar = (pkl) obj;
                if (pklVar == null) {
                    return;
                }
                haiVar.b = haiVar.e.d();
                pklVar.b(j2);
                haiVar.z.c(Long.valueOf(j2));
                haiVar.a = -9223372036854775807L;
            }
        });
    }

    @Override // defpackage.gzf
    public final void h(long j, Runnable runnable) {
        pkl pklVar;
        if (this.e.d() - this.b <= 50 || (pklVar = this.r) == null || pklVar.m() != 3) {
            this.z.c(Long.valueOf(j));
            this.a = j;
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        g(j);
        this.a = -9223372036854775807L;
    }

    @Override // defpackage.gzf
    public final boolean i() {
        return ((Boolean) B(gvq.f, false)).booleanValue();
    }

    @Override // defpackage.hez
    public final long j() {
        return ((Long) B(new ampg() { // from class: gzx
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return Long.valueOf(((pkl) obj).q() + hai.this.v);
            }
        }, 0L)).longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zqv k() {
        zqq zqqVar = this.s;
        if (zqqVar != null) {
            return zqqVar.g;
        }
        return null;
    }

    public final zse l() {
        return ((zsc) this.t).k(avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED);
    }

    public final void m(zdt zdtVar) {
        pkl pklVar = this.r;
        if (pklVar != null) {
            zdtVar.a(pklVar);
        }
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void n(boolean z) {
    }

    @Override // defpackage.pjv
    public final void o(boolean z) {
        if (z) {
            this.a = -9223372036854775807L;
        }
        this.H.c(Boolean.valueOf(z));
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void p(pjt pjtVar) {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void q(int i) {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void r(pjr pjrVar) {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void s(boolean z, int i) {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void t(pjy pjyVar, pjy pjyVar2, int i) {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void u() {
    }

    public final void v() {
        aypg aypgVar = this.G;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.G = null;
        }
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.pjx, defpackage.pli
    public final /* synthetic */ void x(boolean z) {
    }

    public final void y(final atnp atnpVar, final String str) {
        if (this.g.a() != null && !this.g.a().d().h()) {
            hah hahVar = this.o;
            if (hahVar == null) {
                return;
            }
            hahVar.aI();
            return;
        }
        zqv k = k();
        if (k != null) {
            k.e(true, new zqx() { // from class: hae
                @Override // defpackage.zqx
                public final void a(File file, axbw axbwVar) {
                    hai haiVar = hai.this;
                    atnp atnpVar2 = atnpVar;
                    String str2 = str;
                    if (axbwVar == null || axbwVar.a() <= 0) {
                        haiVar.z(atnpVar2, null, null, str2);
                    } else if (axbwVar.g()) {
                        haiVar.z(atnpVar2, file, axbwVar, str2);
                    } else {
                        zep.l("State event received during upload is not for upload");
                        afus.b(2, 6, "[ShortsCreation][Android][Edit]State event received during upload is not for upload");
                        hah hahVar2 = haiVar.o;
                        if (hahVar2 == null) {
                            return;
                        }
                        hahVar2.aI();
                    }
                }
            });
        } else {
            z(atnpVar, null, null, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0677  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.atnp r25, java.io.File r26, defpackage.axbw r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hai.z(atnp, java.io.File, axbw, java.lang.String):void");
    }
}
