package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajfs  reason: default package */
/* loaded from: classes.dex */
public final class ajfs {
    public final awaj a;
    public long b;
    final long c;
    final long d;
    final long e;
    final /* synthetic */ ajft i;
    long f = 0;
    long g = 0;
    long h = 0;
    int j = 8;
    private final Runnable k = new Runnable() { // from class: ajfr
        @Override // java.lang.Runnable
        public final void run() {
            ajfs ajfsVar = ajfs.this;
            ajfsVar.d(ajfsVar.j);
            if (ajfsVar.g > ajfsVar.e || (ajfsVar.f <= ajfsVar.c && ajfsVar.h <= ajfsVar.d)) {
                zep.b("VideoQualityPromoRenderer triggered when criteria not met.");
                return;
            }
            ajfsVar.b();
            ajfsVar.i.setChanged();
            ajfsVar.i.notifyObservers(ajfsVar.a);
        }
    };

    public ajfs(ajft ajftVar, awam awamVar, awaj awajVar) {
        this.i = ajftVar;
        this.a = awajVar;
        this.c = TimeUnit.SECONDS.toMillis(awamVar.d);
        this.d = TimeUnit.SECONDS.toMillis(awamVar.e);
        this.e = TimeUnit.SECONDS.toMillis(awamVar.f);
    }

    private final long e(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        this.j = i;
        this.b = elapsedRealtime;
        return elapsedRealtime - j;
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.i.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void b() {
        a();
        d(8);
    }

    public final void c(long j) {
        ScheduledFuture scheduledFuture = this.i.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ajft ajftVar = this.i;
        ajftVar.b = ajftVar.a.schedule(this.k, j, TimeUnit.MILLISECONDS);
    }

    public final void d(int i) {
        aika aikaVar = aika.NEW;
        int i2 = this.j;
        int i3 = i2 - 1;
        if (i2 != 0) {
            switch (i3) {
                case 0:
                case 1:
                    this.f += e(i);
                    return;
                case 2:
                    this.g += e(i);
                    return;
                case 3:
                    this.h += e(i);
                    return;
                case 4:
                case 5:
                case 6:
                    e(i);
                    return;
                default:
                    return;
            }
        }
        throw null;
    }
}
