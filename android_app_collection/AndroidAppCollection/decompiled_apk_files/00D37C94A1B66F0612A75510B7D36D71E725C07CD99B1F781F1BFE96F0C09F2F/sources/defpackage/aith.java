package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aith  reason: default package */
/* loaded from: classes.dex */
public final class aith {
    public final aisx a;
    public final Executor b;
    public final Executor c;
    public final aadd d;
    private final aanz e;
    private final aios f;
    private final ailu g;
    private final aiix h;
    private yiy i;
    private final aiqp j;
    private final ahex k;
    private final ahey l;

    public aith(aanz aanzVar, aiqp aiqpVar, aios aiosVar, aisx aisxVar, Executor executor, Executor executor2, aadd aaddVar, ahex ahexVar, ailu ailuVar, aiix aiixVar, ahey aheyVar) {
        this.e = aanzVar;
        this.j = aiqpVar;
        aiosVar.getClass();
        this.f = aiosVar;
        this.a = aisxVar;
        this.b = executor;
        this.c = executor2;
        this.d = aaddVar;
        this.k = ahexVar;
        this.g = ailuVar;
        this.h = aiixVar;
        this.l = aheyVar;
    }

    public final void a(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, aitg aitgVar, acvg acvgVar) {
        synchronized (this.a) {
            if (this.a.a == null) {
                return;
            }
            if (playerResponseModel == null) {
                return;
            }
            yiy yiyVar = this.i;
            if (yiyVar != null) {
                yiyVar.d();
            }
            yiy c = yiy.c(new aitf(this, playerResponseModel, aitgVar, playbackStartDescriptor, acvgVar));
            this.i = c;
            this.f.k(playerResponseModel.t(), c, playerResponseModel.B());
        }
    }

    public final void b() {
        yiy yiyVar = this.i;
        if (yiyVar != null) {
            yiyVar.d();
            this.i = null;
        }
    }

    public final void c(PlayerResponseModel playerResponseModel, aikd aikdVar, ajah ajahVar) {
        if (this.k.a() == 2) {
            return;
        }
        this.g.l(aijx.VIDEO_PLAYBACK_ERROR);
        if (aikdVar == null) {
            return;
        }
        ajahVar.D(playerResponseModel, aikdVar);
    }

    public final void d(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, acvg acvgVar, ajah ajahVar) {
        ylr.c();
        this.j.j.c(new ahgo());
        if (acvgVar != null) {
            acvgVar.c("pc");
        }
        if ((!this.h.s() || this.l.a(playerResponseModel) != 2) && ajahVar.aa()) {
            ajahVar.E(playerResponseModel, playbackStartDescriptor);
        }
    }

    public final void e() {
        this.f.c = false;
        b();
    }

    public final boolean f(final PlayerResponseModel playerResponseModel, final ajah ajahVar, final aitg aitgVar) {
        if (aiix.h(this.d)) {
            ylr.b();
            final aaod m = playerResponseModel.m(this.e);
            if (m == null) {
                return false;
            }
            if (!aijr.h(playerResponseModel.t())) {
                this.j.h.c(new ahhs(m.b()));
            }
            if (ajahVar.ab()) {
                this.c.execute(new Runnable() { // from class: aisz
                    @Override // java.lang.Runnable
                    public final void run() {
                        ajah.this.E(playerResponseModel, null);
                    }
                });
            } else if (aitgVar != null) {
                if (aijr.h(playerResponseModel.t())) {
                    this.c.execute(new Runnable() { // from class: aita
                        @Override // java.lang.Runnable
                        public final void run() {
                            ajah ajahVar2 = ajah.this;
                            PlayerResponseModel playerResponseModel2 = playerResponseModel;
                            aaod aaodVar = m;
                            if (ajahVar2.aa()) {
                                ajahVar2.C(playerResponseModel2, aaodVar.a);
                            }
                        }
                    });
                } else {
                    this.c.execute(new Runnable() { // from class: aisy
                        @Override // java.lang.Runnable
                        public final void run() {
                            aitg.this.b(m);
                        }
                    });
                }
            }
            return true;
        }
        aaod m2 = playerResponseModel.m(this.e);
        if (m2 == null) {
            return false;
        }
        this.j.h.c(new ahhs(m2.b()));
        if (ajahVar.ab()) {
            ajahVar.E(playerResponseModel, null);
        } else if (aitgVar != null) {
            aitgVar.b(m2);
        }
        return true;
    }
}
