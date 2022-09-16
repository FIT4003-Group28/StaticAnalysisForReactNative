package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: aiml  reason: default package */
/* loaded from: classes.dex */
public final class aiml implements Runnable {
    public final PlaybackStartDescriptor a;
    public final int b;
    public final aimk c;
    public final yzj d;
    public volatile boolean e;
    private final aikx g;
    private final PlayerResponseModel h;
    private final String i;
    private final boolean j;
    private final Handler k;
    private final long l;
    private final long m;
    private final aijp n;
    private final boolean o;
    private volatile boolean p = true;
    private WatchNextResponseModel q = null;
    private Exception r = null;
    private PlayerResponseModel s = null;
    private Exception t = null;
    final ConditionVariable f = new ConditionVariable();

    public aiml(PlaybackStartDescriptor playbackStartDescriptor, int i, aikx aikxVar, PlayerResponseModel playerResponseModel, String str, boolean z, Handler handler, long j, long j2, yzj yzjVar, aimk aimkVar, boolean z2, aijp aijpVar) {
        this.a = playbackStartDescriptor;
        this.b = i;
        this.g = aikxVar;
        this.h = playerResponseModel;
        this.i = str;
        this.j = z;
        this.k = handler;
        this.l = j;
        this.m = j2;
        this.d = yzjVar;
        this.c = aimkVar;
        this.o = z2;
        this.n = aijpVar;
    }

    private final void c(Exception exc) {
        this.k.post(new aimj(this, exc, 1));
    }

    private final void d() {
        Handler handler = this.k;
        final aimk aimkVar = this.c;
        handler.post(new Runnable() { // from class: aimf
            @Override // java.lang.Runnable
            public final void run() {
                aimk.this.c();
            }
        });
    }

    private final void e(final PlayerResponseModel playerResponseModel) {
        Runnable runnable = new Runnable() { // from class: aimi
            @Override // java.lang.Runnable
            public final void run() {
                aiml aimlVar = aiml.this;
                PlayerResponseModel playerResponseModel2 = playerResponseModel;
                if (aimlVar.e) {
                    return;
                }
                aimlVar.c.d(playerResponseModel2);
            }
        };
        if (this.j) {
            this.k.post(runnable);
        } else {
            this.k.postAtFrontOfQueue(runnable);
        }
    }

    private final void f(final WatchNextResponseModel watchNextResponseModel) {
        this.k.post(new Runnable() { // from class: aimh
            @Override // java.lang.Runnable
            public final void run() {
                aiml aimlVar = aiml.this;
                WatchNextResponseModel watchNextResponseModel2 = watchNextResponseModel;
                if (aimlVar.e) {
                    return;
                }
                aimlVar.c.g(watchNextResponseModel2);
            }
        });
    }

    private final void g() {
        try {
            aikx aikxVar = this.g;
            this.a.l();
            ankt d = aikxVar.d(this.i, this.a, this.n, this.o);
            d();
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) d.get(this.m, TimeUnit.MILLISECONDS);
            this.s = playerResponseModel;
            e(playerResponseModel);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c(e);
        }
    }

    private final void h(boolean z) {
        PlayerResponseModel playerResponseModel;
        Pair a = this.g.a(this.a, this.i, this.n, this.o);
        d();
        Future future = (Future) a.second;
        try {
            this.s = (PlayerResponseModel) ((ankt) a.first).get(this.m, TimeUnit.MILLISECONDS);
            this.p = false;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zep.d("Problem fetching player response", e);
            this.t = e;
        }
        if (!z) {
            PlayerResponseModel playerResponseModel2 = this.s;
            if (playerResponseModel2 != null) {
                e(playerResponseModel2);
            } else {
                Exception exc = this.t;
                if (exc != null) {
                    c(exc);
                }
            }
        }
        if (this.l > 0 && (((playerResponseModel = this.s) == null || (!playerResponseModel.I() && !this.s.c().an())) && !this.a.x())) {
            this.f.block(this.l);
        }
        if (this.e) {
            return;
        }
        try {
            this.q = (WatchNextResponseModel) future.get();
        } catch (InterruptedException | ExecutionException e2) {
            zep.d("Problem fetching WatchNext response", e2);
            this.r = e2;
        }
    }

    private final void i() {
        WatchNextResponseModel watchNextResponseModel = this.q;
        if (watchNextResponseModel != null) {
            f(watchNextResponseModel);
            return;
        }
        Exception exc = this.r;
        if (exc == null) {
            return;
        }
        this.k.post(new aimj(this, exc));
    }

    public final synchronized void a() {
        this.f.open();
    }

    public final boolean b(boolean z) {
        if (this.p || z) {
            this.e = true;
            a();
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() != Looper.getMainLooper() && Process.getThreadPriority(Process.myTid()) != 0) {
            zep.b("Request being made from non-critical thread");
        }
        this.c.e();
        int i = this.b;
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                this.s = this.h;
                ankt c = this.g.c(this.a);
                if (!this.e) {
                    try {
                        this.q = (WatchNextResponseModel) c.get();
                    } catch (InterruptedException | ExecutionException e) {
                        this.r = e;
                    }
                }
                i();
            } else if (i == 2) {
                h(true);
                WatchNextResponseModel watchNextResponseModel = this.q;
                if (watchNextResponseModel != null || this.r != null) {
                    PlayerResponseModel playerResponseModel = this.s;
                    Exception exc = this.t;
                    Exception exc2 = this.r;
                    boolean z2 = (playerResponseModel == null && exc == null) ? false : true;
                    boolean z3 = (watchNextResponseModel == null && exc2 == null) ? false : true;
                    if (!z2 || !z3) {
                        z = false;
                    }
                    aqxo.y(z);
                    if (exc != null) {
                        c(exc);
                    } else if (exc2 != null) {
                        c(exc2);
                    } else if (playerResponseModel != null && watchNextResponseModel != null) {
                        f(watchNextResponseModel);
                        e(playerResponseModel);
                    }
                }
            } else {
                h(false);
                i();
            }
        } else {
            g();
        }
        if (this.b == 0 || this.s == null || this.q == null) {
            return;
        }
        this.k.post(new Runnable() { // from class: aimg
            @Override // java.lang.Runnable
            public final void run() {
                aiml aimlVar = aiml.this;
                if (aimlVar.e) {
                    return;
                }
                aimlVar.c.a(aimlVar.b);
            }
        });
    }
}
