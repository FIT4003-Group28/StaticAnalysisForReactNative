package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: ytm  reason: default package */
/* loaded from: classes4.dex */
public final class ytm implements ytx {
    public yst b;
    private final ScheduledExecutorService d;
    private final long e;
    private final long f;
    private ScheduledFuture h;
    private final Runnable g = new Runnable() { // from class: ytl
        @Override // java.lang.Runnable
        public final void run() {
            ytm ytmVar = ytm.this;
            ytmVar.b.getClass();
            int i = 2;
            if (ytmVar.a != 2) {
                i = 1;
            }
            ytmVar.a = 3;
            yst ystVar = ytmVar.b;
            ysw yswVar = ystVar.a;
            UrlRequest urlRequest = ystVar.b;
            yswVar.e = i;
            urlRequest.cancel();
        }
    };
    public volatile int a = 0;

    public ytm(ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        this.d = scheduledExecutorService;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.ytx
    public final void a() {
        this.a = 3;
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.ytx
    public final void b() {
        this.a = 3;
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.ytx
    public final void c() {
        this.h.getClass();
        aqxo.z(this.a == 2, "Read completed in non READING_RESPONSE state");
        this.h.cancel(false);
        this.h = this.d.schedule(this.g, this.f, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ytx
    public final void d() {
        this.h.getClass();
        boolean z = true;
        if (this.a != 1) {
            z = false;
        }
        aqxo.z(z, "Redirect can only be received in CONNECTING state");
        this.h.cancel(false);
        this.h = this.d.schedule(this.g, this.e, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ytx
    public final void e() {
        this.h.getClass();
        boolean z = true;
        if (this.a != 1) {
            z = false;
        }
        aqxo.z(z, "Response started can only be received in CONNECTING state");
        this.a = 2;
        this.h.cancel(false);
        this.h = this.d.schedule(this.g, this.f, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ytx
    public final void f() {
        this.h.getClass();
        this.a = 3;
        this.h.cancel(false);
    }

    @Override // defpackage.ytx
    public final void g(yst ystVar) {
        aqxo.z(this.a == 0, "Other request is already being monitored");
        this.b = ystVar;
        this.a = 1;
        this.h = this.d.schedule(this.g, this.e, TimeUnit.MILLISECONDS);
    }
}
