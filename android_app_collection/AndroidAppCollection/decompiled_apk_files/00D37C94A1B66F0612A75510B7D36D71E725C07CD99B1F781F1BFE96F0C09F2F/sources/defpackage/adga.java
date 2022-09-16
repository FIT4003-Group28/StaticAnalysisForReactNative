package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adga  reason: default package */
/* loaded from: classes.dex */
public final class adga {
    public static final String a = zep.a("MDX.MediaRouteLogger");
    static final long b = TimeUnit.MINUTES.toMillis(1);
    public final Handler c;
    public final acrr d;
    public final adeo e;
    public final yni f;
    public final Executor g;
    public final acwu h;
    public final ankw i;
    final adfz j;
    final adfy k;
    long l;
    public final adyf m;
    private final yrj n;

    public adga(adeo adeoVar, acrr acrrVar, yrj yrjVar, yni yniVar, Executor executor, acwu acwuVar, ankw ankwVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        adyf adyfVar = new adyf();
        this.l = 0L;
        this.e = adeoVar;
        acrrVar.getClass();
        this.d = acrrVar;
        this.c = handler;
        yrjVar.getClass();
        this.n = yrjVar;
        yniVar.getClass();
        this.f = yniVar;
        this.g = executor;
        this.h = acwuVar;
        this.i = ankwVar;
        this.m = adyfVar;
        this.j = new adfz(this);
        this.k = new adfy(this);
    }

    public final void a() {
        this.l = 0L;
        this.c.removeCallbacks(this.k);
        if (!this.n.p() || !this.n.r()) {
            return;
        }
        this.c.postDelayed(this.k, b);
    }
}
