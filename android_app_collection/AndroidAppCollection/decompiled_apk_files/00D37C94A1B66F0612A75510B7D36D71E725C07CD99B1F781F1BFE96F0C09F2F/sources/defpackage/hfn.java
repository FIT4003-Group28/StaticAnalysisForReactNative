package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hfn  reason: default package */
/* loaded from: classes3.dex */
public final class hfn implements hfr {
    public final ailv a;
    public final hew c;
    public final Context d;
    public final acth f;
    public boolean g;
    public gxf h;
    private final aimy i;
    private final Executor j;
    private final aeov k;
    private final Executor l;
    private final hfs m;
    private final abda n;
    public final azpa b = azpa.ar();
    public final pjx e = new hfl(this);

    public hfn(Context context, ailv ailvVar, aimy aimyVar, aeov aeovVar, Executor executor, hew hewVar, Executor executor2, hft hftVar, acth acthVar, abda abdaVar) {
        this.a = ailvVar;
        this.i = aimyVar;
        this.k = aeovVar;
        this.j = executor;
        this.c = hewVar;
        this.l = executor2;
        this.d = context;
        yqw yqwVar = (yqw) hftVar.a.get();
        yqwVar.getClass();
        gyn gynVar = (gyn) hftVar.b.get();
        gynVar.getClass();
        this.m = new hfs(yqwVar, gynVar, this);
        this.f = acthVar;
        this.n = abdaVar;
    }

    public final ShortsCreationSelectedTrack a() {
        if (this.b.at() == null || !((ampq) this.b.at()).h()) {
            return null;
        }
        return (ShortsCreationSelectedTrack) ((ampq) this.b.at()).c();
    }

    public final ayoi b() {
        return this.b.W();
    }

    public final void c() {
        this.b.c(amon.a);
        gxf gxfVar = this.h;
        if (gxfVar != null) {
            gxfVar.a();
        }
    }

    public final void d(String str, String str2, apzg apzgVar) {
        this.f.oi().D(new acte(actj.SHORTS_CREATION_REMIX_AUDIO_DOWNLOAD_ERROR_DIALOG));
        gxf gxfVar = this.h;
        if (gxfVar != null) {
            gxfVar.b();
        }
        final hfm hfmVar = new hfm(this);
        final aina c = this.i.c();
        c.c = str2;
        c.b = str;
        c.u(aijs.BACKGROUND.i);
        c.j(aoob.b);
        if (apzgVar == null || !apzgVar.qn(ardq.b)) {
            this.j.execute(new Runnable() { // from class: hfi
                @Override // java.lang.Runnable
                public final void run() {
                    hfn hfnVar = hfn.this;
                    hfnVar.a.b(c, hfmVar, null, null, true, null);
                }
            });
            return;
        }
        final ankt u = anlz.u(new Callable() { // from class: hfk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hfn hfnVar = hfn.this;
                return hfnVar.a.a(c);
            }
        }, this.j);
        final ankt a = this.n.a(apzgVar, this.j);
        ylx.k(anlz.k(u, a).a(new Callable() { // from class: hfc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hfn hfnVar = hfn.this;
                ankt anktVar = a;
                ankt anktVar2 = u;
                try {
                    arue arueVar = (arue) anlz.y(anktVar);
                    if ((arueVar.b & 2) != 0) {
                        if (!hfnVar.g) {
                            auup auupVar = arueVar.d;
                            if (auupVar == null) {
                                auupVar = auup.a;
                            }
                            auuo auuoVar = auupVar.c;
                            if (auuoVar == null) {
                                auuoVar = auuo.a;
                            }
                            hfnVar.g(auuoVar.c);
                        }
                        if ((arueVar.b & 2) != 0) {
                            auup auupVar2 = arueVar.d;
                            if (auupVar2 == null) {
                                auupVar2 = auup.a;
                            }
                            azpa azpaVar = hfnVar.b;
                            hfo c2 = hfnVar.a().c();
                            c2.b(true);
                            c2.d = auupVar2;
                            azpaVar.c(ampq.j(c2.a()));
                        }
                    }
                } catch (ExecutionException unused) {
                }
                return (PlayerResponseModel) anlz.y(anktVar2);
            }
        }, this.j), this.j, new ylv() { // from class: hfb
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                hfn.this.e();
            }
        }, new ylw() { // from class: hfd
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                hfn.this.k((PlayerResponseModel) obj);
            }
        });
    }

    public final void e() {
        this.l.execute(new hfe(this, 1));
    }

    public final void f() {
        hew hewVar = this.c;
        if (!hewVar.e) {
            Context context = hewVar.a;
            php phpVar = new php(context);
            azb azbVar = new azb();
            pvd pvdVar = new pvd(context);
            new ppn(new axi(context), azbVar);
            pki pkiVar = new pki(context, phpVar, pvdVar, new phm(), axh.h(context), new auy(pvq.a));
            hfa hfaVar = hewVar.i;
            ptx.e(!pkiVar.m);
            pkiVar.e = hfaVar;
            hewVar.j = pkiVar.a();
            hewVar.j.N();
            hewVar.g(true);
            hewVar.j.u(hewVar.b);
            pkl pklVar = hewVar.j;
            ava avaVar = hewVar.c;
            ptx.a(avaVar);
            pklVar.f.b(avaVar);
            hewVar.e = true;
        }
        hew hewVar2 = this.c;
        pjx pjxVar = this.e;
        pkl pklVar2 = hewVar2.j;
        if (pklVar2 != null) {
            pklVar2.u(pjxVar);
        }
        if (a() == null || a().b() == null || this.c.d) {
            return;
        }
        final Uri b = a().b();
        this.l.execute(new Runnable() { // from class: hfh
            @Override // java.lang.Runnable
            public final void run() {
                hfn hfnVar = hfn.this;
                hfnVar.c.h(b);
            }
        });
    }

    public final void g(final long j) {
        if (this.c.e) {
            this.l.execute(new Runnable() { // from class: hff
                @Override // java.lang.Runnable
                public final void run() {
                    hfn hfnVar = hfn.this;
                    long j2 = j;
                    hew hewVar = hfnVar.c;
                    hewVar.g = j2;
                    hewVar.d();
                }
            });
        }
    }

    @Override // defpackage.hfr
    public final void h(long j) {
        n(j, amon.a);
    }

    public final void i(long j) {
        ShortsCreationSelectedTrack a = a();
        if (a != null) {
            azpa azpaVar = this.b;
            hfo c = a.c();
            c.b(true);
            c.c(j);
            azpaVar.c(ampq.j(c.a()));
            g(j);
        }
    }

    public final void j() {
        this.l.execute(new hfe(this));
    }

    public final void k(PlayerResponseModel playerResponseModel) {
        final ampq ampqVar;
        FormatStreamModel[] formatStreamModelArr;
        int length;
        aegu aeguVar = null;
        try {
            VideoStreamingData videoStreamingData = playerResponseModel.c;
            if (videoStreamingData != null) {
                aeguVar = this.k.b(videoStreamingData, playerResponseModel.c(), true);
            }
        } catch (aegw e) {
            zep.d("SCMusicController: Missing stream", e);
        }
        if (aeguVar == null || (formatStreamModelArr = aeguVar.b) == null || (length = formatStreamModelArr.length) == 0) {
            if (aeguVar != null) {
                zep.b("[Shorts Creation][Music] No usable audio streams found in response");
            }
            e();
            ampqVar = amon.a;
        } else {
            int i = 0;
            while (true) {
                if (i < length) {
                    FormatStreamModel formatStreamModel = formatStreamModelArr[i];
                    if (formatStreamModel.f() == 3 && !formatStreamModel.d.toString().isEmpty()) {
                        ampqVar = ampq.j(formatStreamModel.d);
                        break;
                    }
                    i++;
                } else {
                    zep.l("[Shorts Creation][Music] Medium quality stream not found, using the first available stream. ");
                    if (!aeguVar.b[0].d.toString().isEmpty()) {
                        ampqVar = ampq.j(aeguVar.b[0].d);
                    } else {
                        e();
                        ampqVar = amon.a;
                    }
                }
            }
        }
        if (ampqVar.h()) {
            final hfs hfsVar = this.m;
            final long j = playerResponseModel.c.d;
            asan asanVar = playerResponseModel.a.h;
            if (asanVar == null) {
                asanVar = asan.a;
            }
            Iterator it = asanVar.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hfsVar.b.h(j);
                    break;
                }
                atfm atfmVar = (atfm) it.next();
                if (atfmVar.b == 1) {
                    String str = ((atfl) atfmVar.c).b;
                    yqw yqwVar = hfsVar.a;
                    gyn gynVar = hfsVar.c;
                    gynVar.f = gynVar.a.b(asny.LATENCY_ACTION_SHORTS_WAVEFORM_DOWNLOAD);
                    yqwVar.a(new hfq(hfsVar, str, new cez() { // from class: hfp
                        @Override // defpackage.cez
                        public final void kV(cff cffVar) {
                            cew cewVar;
                            hfs.this.b.h(j);
                            if (cffVar == null || (cewVar = cffVar.b) == null) {
                                return;
                            }
                            int i2 = cewVar.a;
                            StringBuilder sb = new StringBuilder(73);
                            sb.append("[ShortsCreation][Android][Music]Error fetching waveform data: ");
                            sb.append(i2);
                            afus.b(2, 6, sb.toString());
                        }
                    }, str, j));
                    break;
                }
            }
            this.l.execute(new Runnable() { // from class: hfj
                @Override // java.lang.Runnable
                public final void run() {
                    hfn hfnVar = hfn.this;
                    ampq ampqVar2 = ampqVar;
                    hew hewVar = hfnVar.c;
                    if (hewVar.e) {
                        hewVar.h((Uri) ampqVar2.c());
                    }
                    if (hfnVar.a() != null) {
                        azpa azpaVar = hfnVar.b;
                        hfo c = hfnVar.a().c();
                        c.f = (Uri) ampqVar2.c();
                        azpaVar.c(ampq.j(c.a()));
                    }
                }
            });
            return;
        }
        zep.b("SCMusicController: Streaming url not found");
    }

    public final void l(auus auusVar) {
        azpa azpaVar = this.b;
        hfo m = ShortsCreationSelectedTrack.m();
        m.d(auusVar.c);
        if ((auusVar.b & 2) != 0) {
            avhn avhnVar = auusVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            m.c = avhnVar;
        }
        if ((auusVar.b & 4) != 0) {
            m.e = auusVar.e;
        }
        m.b(false);
        m.a = auusVar.g;
        if ((auusVar.b & 64) != 0) {
            apzg apzgVar = auusVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            m.b = apzgVar;
        }
        m.c(hhw.f(auusVar));
        azpaVar.c(ampq.j(m.a()));
        this.g = false;
        if ((auusVar.b & 16) != 0) {
            g(hhw.f(auusVar));
            this.g = true;
        }
        String str = auusVar.c;
        String str2 = auusVar.g;
        apzg apzgVar2 = auusVar.h;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        d(str, str2, apzgVar2);
    }

    public final void m(axcw axcwVar) {
        azpa azpaVar = this.b;
        hfo m = ShortsCreationSelectedTrack.m();
        m.d(axcwVar.c);
        axcv axcvVar = axcwVar.e;
        if (axcvVar == null) {
            axcvVar = axcv.a;
        }
        if ((axcvVar.b & 2) != 0) {
            axcv axcvVar2 = axcwVar.e;
            if (axcvVar2 == null) {
                axcvVar2 = axcv.a;
            }
            avhn avhnVar = axcvVar2.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            m.c = avhnVar;
        }
        axcv axcvVar3 = axcwVar.e;
        if (axcvVar3 == null) {
            axcvVar3 = axcv.a;
        }
        if ((axcvVar3.b & 1) != 0) {
            axcv axcvVar4 = axcwVar.e;
            if (axcvVar4 == null) {
                axcvVar4 = axcv.a;
            }
            m.e = axcvVar4.c;
        }
        if ((axcwVar.b & 16) != 0) {
            apzg apzgVar = axcwVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            m.b = apzgVar;
        }
        m.b(false);
        m.c(hhw.g(axcwVar));
        m.a = axcwVar.f;
        azpaVar.c(ampq.j(m.a()));
        g(hhw.g(axcwVar));
        this.g = true;
        String str = axcwVar.c;
        String str2 = axcwVar.f;
        apzg apzgVar2 = axcwVar.g;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        d(str, str2, apzgVar2);
    }

    public final void n(final long j, final ampq ampqVar) {
        this.l.execute(new Runnable() { // from class: hfg
            @Override // java.lang.Runnable
            public final void run() {
                hfn hfnVar = hfn.this;
                long j2 = j;
                ampq ampqVar2 = ampqVar;
                if (hfnVar.a() != null) {
                    azpa azpaVar = hfnVar.b;
                    hfo c = hfnVar.a().c();
                    c.g = ampq.j(Long.valueOf(j2));
                    c.h = ampqVar2;
                    azpaVar.c(ampq.j(c.a()));
                }
            }
        });
    }
}
