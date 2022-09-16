package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aenk  reason: default package */
/* loaded from: classes.dex */
public final class aenk implements aenl {
    public final azqb a;
    public final ScheduledExecutorService b;
    public final aadd c;
    public final snc d;
    public final aeld e;
    public final afgz f;
    public final aeju g;
    public final afje h;
    public final aacz i;
    public final aivp j;
    public final afjz k;
    private final aflx l;
    private final aflu m;
    private final aanz n;
    private final aaqp o;
    private final axxj q;
    private aelb s;
    private String t;
    private long u;
    private final Object r = new Object();
    private final Handler p = new Handler(Looper.getMainLooper());

    public aenk(azqb azqbVar, ScheduledExecutorService scheduledExecutorService, aflx aflxVar, aflu afluVar, aadd aaddVar, aacz aaczVar, snc sncVar, aanz aanzVar, aivp aivpVar, aaqp aaqpVar, aeld aeldVar, afgz afgzVar, aeju aejuVar, afja afjaVar, axxj axxjVar, afjz afjzVar) {
        this.a = azqbVar;
        this.b = scheduledExecutorService;
        this.l = aflxVar;
        this.m = afluVar;
        this.c = aaddVar;
        this.i = aaczVar;
        this.d = sncVar;
        this.n = aanzVar;
        this.j = aivpVar;
        this.o = aaqpVar;
        this.e = aeldVar;
        this.f = afgzVar;
        this.g = aejuVar;
        this.h = afjaVar;
        this.q = axxjVar;
        this.k = afjzVar;
    }

    public final aelb a(String str, aenv aenvVar, aenb aenbVar, aflm aflmVar, aaqk aaqkVar, aanr aanrVar) {
        aelb aelbVar;
        synchronized (this.r) {
            if (!TextUtils.equals(this.t, str) || str == null || TimeUnit.MILLISECONDS.toSeconds(this.d.d() - this.u) >= 10 || (aelbVar = this.s) == null) {
                this.s = this.e.a(aanrVar, aenvVar, aenbVar, aflmVar, aaqkVar);
                this.t = str;
                this.u = this.d.d();
                return this.s;
            }
            return aelbVar;
        }
    }

    public final aflm b(acvg acvgVar) {
        aflm aflmVar = this.l;
        if (acvgVar != null && !(acvgVar instanceof acvi)) {
            if (this.k.o().B) {
                aflmVar = this.m.a(acvgVar);
            }
            aflmVar.D();
        }
        return aflmVar;
    }

    public final void c(yqw yqwVar, aaqk aaqkVar) {
        if (this.k.q().q) {
            return;
        }
        yqwVar.a(aaqkVar);
    }

    public final void d(final aanr aanrVar, final aeuo aeuoVar, final aflm aflmVar) {
        if (this.k.p().v) {
            this.p.post(new Runnable() { // from class: aenh
                @Override // java.lang.Runnable
                public final void run() {
                    aenk aenkVar = aenk.this;
                    ((aeov) aenkVar.a.get()).s(aanrVar, aeuoVar, aflmVar);
                }
            });
        } else {
            ((aeov) this.a.get()).s(aanrVar, aeuoVar, aflmVar);
        }
    }

    public final void e(yqw yqwVar, aanr aanrVar, aaqk aaqkVar, aelb aelbVar, aeuo aeuoVar, aflm aflmVar) {
        auaf auafVar;
        this.g.b(aeuoVar, aanrVar.b);
        aeks aeksVar = (aeks) aelbVar;
        aeksVar.n();
        if (aanrVar.j) {
            return;
        }
        if (!aanrVar.g() && yqwVar != null && aaqkVar != null) {
            anlz.A(aeksVar.f, new aenj(this, aaqkVar, yqwVar), anjk.a);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ayqi.c((AtomicReference) this.q.a().as(new ldk(atomicBoolean, 6)));
        if (atomicBoolean.get()) {
            return;
        }
        aadd aaddVar = this.c;
        if (aaddVar == null || aaddVar.a() == null) {
            auafVar = auaf.a;
        } else {
            auafVar = aaddVar.a().j;
            if (auafVar == null) {
                auafVar = auaf.a;
            }
        }
        if (auafVar.S) {
            return;
        }
        d(aanrVar, aeuoVar, aflmVar);
    }

    public final void f(aanr aanrVar, byte[] bArr, aflm aflmVar) {
        PlayerResponseModel playerResponseModel;
        VideoStreamingData videoStreamingData;
        asaj asajVar = (asaj) this.o.a(bArr, asaj.a);
        if (asajVar == null) {
            aeny.g("Invalid prefetched ads PlayerResponse");
        } else if ((asajVar.b & 8) == 0) {
        } else {
            asan asanVar = asajVar.h;
            if (asanVar == null) {
                asanVar = asan.a;
            }
            if (asanVar.l.isEmpty() || (videoStreamingData = (playerResponseModel = new PlayerResponseModel(asajVar, 0L, this.n)).c) == null || videoStreamingData.e() == null) {
                return;
            }
            aanrVar.f(videoStreamingData.c);
            if (this.k.ad()) {
                aanrVar.d(videoStreamingData, playerResponseModel.c());
            } else {
                aanrVar.c(videoStreamingData);
            }
            aanrVar.e(playerResponseModel.c().F());
            try {
                e(null, aanrVar, null, a(null, new aenv(this.h, aanrVar.b, this.f), null, aflmVar, null, aanrVar), this.j.a(aanrVar.b), aflmVar);
            } catch (RuntimeException e) {
                aeny.j("LoadOnesieVideo for prefetched ads playbacks got an exception.", e);
            }
        }
    }
}
