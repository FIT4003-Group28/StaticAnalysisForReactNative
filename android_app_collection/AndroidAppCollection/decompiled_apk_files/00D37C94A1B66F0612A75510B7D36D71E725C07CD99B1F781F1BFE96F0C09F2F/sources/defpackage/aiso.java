package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aiso  reason: default package */
/* loaded from: classes.dex */
public final class aiso implements ails, aitg {
    public final yni a;
    public final aisq b;
    public final ailu c;
    public final aith d;
    public final aisx e;
    public final aiix f;
    public final aiqp g;
    private final bame h;
    private final aikh i;

    public aiso(bame bameVar, aiqp aiqpVar, yni yniVar, aikh aikhVar, aisq aisqVar, ailu ailuVar, aith aithVar, aisx aisxVar, aiix aiixVar) {
        this.h = bameVar;
        this.g = aiqpVar;
        this.a = yniVar;
        this.i = aikhVar;
        this.b = aisqVar;
        this.c = ailuVar;
        this.e = aisxVar;
        this.d = aithVar;
        this.f = aiixVar;
        yniVar.a(this, aiio.class, new aisn(this));
        ailuVar.f = this;
    }

    @Override // defpackage.ails
    public final void a(WatchNextResponseModel watchNextResponseModel) {
        this.h.c(new ahhz(watchNextResponseModel));
    }

    @Override // defpackage.aitg
    public final void b(aaod aaodVar) {
        this.c.g(aaodVar.a, null, null);
    }

    public final aimk c() {
        return new aism(this);
    }

    public final void d(final int i) {
        final aikx aikxVar;
        PlayerResponseModel playerResponseModel;
        PlaybackStartDescriptor playbackStartDescriptor;
        auag f;
        ajah ajahVar;
        this.b.c();
        final ailu ailuVar = this.c;
        String str = null;
        final String w = (!ailuVar.l.b(aijx.VIDEO_LOADING) || (ajahVar = this.e.a) == null) ? null : ajahVar.w();
        aimk c = c();
        PlayerResponseModel playerResponseModel2 = ailuVar.p;
        if (ailuVar.n(playerResponseModel2, "currentPlayerResponse") || playerResponseModel2 == null || (aikxVar = ailuVar.m) == null || ailuVar.g != null) {
            return;
        }
        String str2 = (playerResponseModel2.t() == null || (f = aijr.f(playerResponseModel2.t())) == null || (f.b & 2) == 0) ? null : f.d;
        if (!ailuVar.l.b(aijx.VIDEO_WATCH_LOADED) && str2 == null) {
            ailuVar.d();
            ailuVar.h(w, c);
            return;
        }
        final yiy c2 = yiy.c(new ailr(ailuVar, playerResponseModel2));
        ailuVar.g = c2;
        PlaybackStartDescriptor playbackStartDescriptor2 = ailuVar.o;
        if (playbackStartDescriptor2 == null) {
            return;
        }
        aijl e = playbackStartDescriptor2.e();
        if (str2 != null) {
            e.o = str2;
        }
        String l = playbackStartDescriptor2.l();
        if (ailuVar.l.b(aijx.VIDEO_WATCH_LOADED)) {
            if (!ailuVar.n(ailuVar.n, "lastFullyLoadedStartDescriptor") && (playbackStartDescriptor = ailuVar.n) != null) {
                str = playbackStartDescriptor.l();
            }
        } else if (!ailuVar.l.b(aijx.VIDEO_PLAYBACK_LOADED)) {
            PlaybackStartDescriptor playbackStartDescriptor3 = ailuVar.o;
            if (playbackStartDescriptor3 != null) {
                str = playbackStartDescriptor3.l();
            }
        } else if (!ailuVar.n(ailuVar.a(), "currentPlayerResponse") && (playerResponseModel = ailuVar.p) != null) {
            str = playerResponseModel.B();
        }
        if (!TextUtils.isEmpty(l) && str != null) {
            e.n = str;
        }
        final PlaybackStartDescriptor a = e.a();
        ailuVar.d.execute(new Runnable() { // from class: ailh
            @Override // java.lang.Runnable
            public final void run() {
                ailu.this.f(aikxVar, a, w, i, c2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        if (playbackStartDescriptor == null) {
            afus.b(2, 10, "Playbackservice#startRequest called without PlaybackStartDescriptor");
            return;
        }
        this.e.c(playbackStartDescriptor, aijpVar);
        this.i.e(!playbackStartDescriptor.x());
        ajah ajahVar = this.e.a;
        String w = ajahVar != null ? ajahVar.w() : null;
        this.b.c();
        this.c.i(playbackStartDescriptor, w, c(), aijpVar);
    }

    @Override // defpackage.aitg
    public final void f() {
        d(-1);
    }
}
