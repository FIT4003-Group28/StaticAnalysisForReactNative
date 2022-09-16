package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: ailu  reason: default package */
/* loaded from: classes.dex */
public final class ailu {
    public final axnm a;
    public final aadd b;
    public final yzj c;
    public final ScheduledExecutorService d;
    public final Executor e;
    public ails f;
    public yiy g;
    public volatile aiml h;
    public aikk i;
    public aikk j;
    public ConditionVariable k;
    public volatile aijx l;
    public aikx m;
    public PlaybackStartDescriptor n;
    public PlaybackStartDescriptor o;
    public volatile PlayerResponseModel p;
    public volatile WatchNextResponseModel q;
    public boolean r;
    public final aiqp s;
    private final Handler t;
    private final aiix u;
    private final ailt v;
    private final ahey w;
    private final aacz x;

    public ailu(yni yniVar, axnm axnmVar, Handler handler, yzj yzjVar, ScheduledExecutorService scheduledExecutorService, Executor executor, aiqp aiqpVar, ahey aheyVar, aadd aaddVar, aacz aaczVar, aiix aiixVar) {
        ailt ailtVar = new ailt(this);
        this.v = ailtVar;
        this.a = axnmVar;
        this.t = handler;
        this.c = yzjVar;
        this.d = scheduledExecutorService;
        this.e = executor;
        this.s = aiqpVar;
        this.w = aheyVar;
        this.b = aaddVar;
        this.x = aaczVar;
        this.u = aiixVar;
        yniVar.g(ailtVar);
    }

    public static ampq b(ampq ampqVar, ampq ampqVar2, aimk aimkVar, String str, yzj yzjVar) {
        if (ampqVar.h()) {
            aimkVar.d((PlayerResponseModel) ampqVar.c());
        } else if (ampqVar2.h()) {
            Exception exc = (Exception) ampqVar2.c();
            aimkVar.b(new aikd(4, true, 1, yzjVar.b(exc), exc, str));
        }
        return amon.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(int i) {
        return i == 3 || i == 2 || i == 0;
    }

    public static void p(aimk aimkVar, int i, ampq ampqVar, ampq ampqVar2) {
        if (!ampqVar.h() || !ampqVar2.h()) {
            return;
        }
        aimkVar.a(i);
    }

    public static void q(ampq ampqVar, ampq ampqVar2, aimk aimkVar, yzj yzjVar) {
        if (ampqVar.h()) {
            aimkVar.g((WatchNextResponseModel) ampqVar.c());
        } else if (!ampqVar2.h()) {
        } else {
            Exception exc = (Exception) ampqVar2.c();
            aimkVar.f(new aikd(12, true, yzjVar.b(exc), exc));
        }
    }

    public static void r(aikk aikkVar, Executor executor, aypx aypxVar) {
        aikkVar.qY(new aims(aikkVar, aypxVar, 1), executor);
    }

    public static void s(aikk aikkVar, PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, long j, final ConditionVariable conditionVariable, ScheduledExecutorService scheduledExecutorService, Executor executor, aypx aypxVar) {
        if (j <= 0 || ((playerResponseModel != null && (playerResponseModel.I() || playerResponseModel.c().an())) || playbackStartDescriptor.x())) {
            conditionVariable.open();
        } else {
            conditionVariable.getClass();
            scheduledExecutorService.schedule(new Runnable() { // from class: ailn
                @Override // java.lang.Runnable
                public final void run() {
                    conditionVariable.open();
                }
            }, j, TimeUnit.MILLISECONDS);
        }
        aikkVar.qY(new aims(aikkVar, aypxVar), executor);
    }

    private final Pair u(aikx aikxVar, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, String str) {
        Pair a = aikxVar.a(playbackStartDescriptor, str, aijpVar, false);
        return Pair.create(anlz.x((ankt) a.first, aiix.b(this.b, ailf.b), TimeUnit.MILLISECONDS, this.d), (ankt) a.second);
    }

    private final void v(aijx aijxVar) {
        this.l = aijxVar;
        String.valueOf(String.valueOf(aijxVar)).length();
    }

    public final PlayerResponseModel a() {
        boolean a = this.l.a(aijx.VIDEO_PLAYBACK_LOADED, aijx.VIDEO_WATCH_LOADED);
        PlayerResponseModel playerResponseModel = this.p;
        if (!a || n(playerResponseModel, "currentPlayerResponse")) {
            return null;
        }
        return playerResponseModel;
    }

    public final void c() {
        PlayerResponseModel a = a();
        WatchNextResponseModel watchNextResponseModel = this.q;
        apzg apzgVar = null;
        if (this.l != aijx.VIDEO_WATCH_LOADED || n(watchNextResponseModel, "currentWatchNextResponse")) {
            watchNextResponseModel = null;
        }
        PlaybackStartDescriptor playbackStartDescriptor = this.o;
        if (playbackStartDescriptor != null) {
            apzgVar = playbackStartDescriptor.b;
        }
        this.s.g.c(new ahhm(this.l, a, watchNextResponseModel, apzgVar));
    }

    public final void d() {
        if (this.h != null) {
            this.h.b(true);
            this.h = null;
        }
        aikk aikkVar = this.i;
        if (aikkVar != null && !aikkVar.isDone()) {
            this.i.g(true);
        }
        aikk aikkVar2 = this.j;
        if (aikkVar2 != null && !aikkVar2.isDone()) {
            this.j.g(true);
            ConditionVariable conditionVariable = this.k;
            if (conditionVariable != null) {
                conditionVariable.open();
            }
        }
        yiy yiyVar = this.g;
        if (yiyVar != null) {
            yiyVar.d();
            this.g = null;
        }
    }

    public final void e() {
        l(aijx.NEW);
        if (this.p != null) {
            l(aijx.VIDEO_PLAYBACK_LOADED);
            if (this.q == null) {
                return;
            }
            l(aijx.VIDEO_WATCH_LOADED);
        }
    }

    public final /* synthetic */ void f(aikx aikxVar, PlaybackStartDescriptor playbackStartDescriptor, String str, int i, final yiy yiyVar) {
        final PlayerResponseModel playerResponseModel;
        try {
            ankt b = aikxVar.b(playbackStartDescriptor, str, i, aijp.a);
            long max = Math.max(ailf.b, TimeUnit.SECONDS.toMillis(aiix.a(this.b)));
            if (max > 0) {
                playerResponseModel = (PlayerResponseModel) b.get(max, TimeUnit.MILLISECONDS);
            } else {
                playerResponseModel = (PlayerResponseModel) b.get(ailf.b, TimeUnit.MILLISECONDS);
            }
            this.e.execute(new Runnable() { // from class: ailo
                @Override // java.lang.Runnable
                public final void run() {
                    yiy.this.b(null, playerResponseModel);
                }
            });
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.e.execute(new Runnable() { // from class: ailp
                @Override // java.lang.Runnable
                public final void run() {
                    yiy.this.a(null, e);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [ails, aitg] */
    public final void g(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, acvg acvgVar) {
        playerResponseModel.getClass();
        WatchNextResponseModel watchNextResponseModel = this.q;
        if (watchNextResponseModel != null && !playerResponseModel.B().equals(watchNextResponseModel.b)) {
            this.q = null;
            ails ailsVar = this.f;
            if (ailsVar != null) {
                ailsVar.a(null);
            }
        }
        this.p = playerResponseModel;
        if (this.u.s() || this.w.a(playerResponseModel) != 2) {
            if (!this.l.b(aijx.VIDEO_PLAYBACK_LOADED)) {
                l(aijx.VIDEO_PLAYBACK_LOADED);
            }
            ?? r0 = this.f;
            if (r0 == 0) {
                return;
            }
            ((aiso) r0).d.a(playerResponseModel, playbackStartDescriptor, r0, acvgVar);
        }
    }

    public final void h(String str, aimk aimkVar) {
        PlaybackStartDescriptor playbackStartDescriptor = this.o;
        if (playbackStartDescriptor != null) {
            ails ailsVar = this.f;
            if (ailsVar != null) {
                ((aiso) ailsVar).b.c();
            }
            i(playbackStartDescriptor, str, aimkVar, aijp.a);
        }
    }

    public final void i(PlaybackStartDescriptor playbackStartDescriptor, String str, aimk aimkVar, aijp aijpVar) {
        j(playbackStartDescriptor, playbackStartDescriptor.w() ? this.r ? 2 : 3 : 0, str, aimkVar, aijpVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r24.i.g(false) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(final com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r25, int r26, java.lang.String r27, defpackage.aimk r28, defpackage.aijp r29) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ailu.j(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, int, java.lang.String, aimk, aijp):void");
    }

    public final void k() {
        d();
        this.m = null;
        this.p = null;
        this.q = null;
        this.n = null;
        this.o = null;
    }

    public final void l(aijx aijxVar) {
        this.l = aijxVar;
        String.valueOf(String.valueOf(aijxVar)).length();
        c();
    }

    public final boolean n(Object obj, String str) {
        if (obj == null) {
            afus.b(2, 10, String.format("%s was null when it shouldn't be", str));
            ails ailsVar = this.f;
            if (ailsVar != null) {
                ((aiso) ailsVar).b.d(new aikd(10, true, "There was an error with the video", new IllegalStateException()));
            }
            return true;
        }
        return false;
    }

    public final void t(String str, aimk aimkVar) {
        PlaybackStartDescriptor playbackStartDescriptor;
        PlaybackStartDescriptor playbackStartDescriptor2;
        if (!this.l.a(aijx.VIDEO_WATCH_LOADED) || (playbackStartDescriptor2 = this.n) == null) {
            if ((!this.l.a(aijx.VIDEO_PLAYBACK_LOADED) && !this.l.a(aijx.VIDEO_PLAYBACK_ERROR)) || (playbackStartDescriptor = this.o) == null) {
                return;
            }
            j(playbackStartDescriptor, 1, str, aimkVar, aijp.a);
            return;
        }
        j(playbackStartDescriptor2, 1, str, aimkVar, aijp.a);
    }
}
