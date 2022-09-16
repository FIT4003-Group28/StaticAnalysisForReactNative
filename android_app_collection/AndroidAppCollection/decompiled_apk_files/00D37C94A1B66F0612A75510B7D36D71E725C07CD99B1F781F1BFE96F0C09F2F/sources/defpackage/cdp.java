package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClientNativeCallback;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: cdp  reason: default package */
/* loaded from: classes2.dex */
public final class cdp {
    public volatile int a;
    public final String b;
    public final Handler c;
    public volatile cdn d;
    public Context e;
    public volatile cdw f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public ExecutorService o;
    public volatile cep p;
    private boolean q;
    private final String r;

    public cdp() {
    }

    private final void d(final ced cedVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post(new Runnable() { // from class: cdr
            @Override // java.lang.Runnable
            public final void run() {
                cdp cdpVar = cdp.this;
                ced cedVar2 = cedVar;
                BillingClientNativeCallback billingClientNativeCallback = cdpVar.d.b.d;
                if (cdpVar.d.a() != null) {
                    cdpVar.d.a().b(cedVar2, amuk.q());
                } else {
                    ceh.e("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030c A[Catch: Exception -> 0x034c, CancellationException -> 0x0358, TimeoutException -> 0x035a, TryCatch #4 {CancellationException -> 0x0358, TimeoutException -> 0x035a, Exception -> 0x034c, blocks: (B:117:0x02f8, B:119:0x030c, B:121:0x0332), top: B:141:0x02f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0332 A[Catch: Exception -> 0x034c, CancellationException -> 0x0358, TimeoutException -> 0x035a, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0358, TimeoutException -> 0x035a, Exception -> 0x034c, blocks: (B:117:0x02f8, B:119:0x030c, B:121:0x0332), top: B:141:0x02f8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ced a(android.app.Activity r30, defpackage.ceb r31) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdp.a(android.app.Activity, ceb):ced");
    }

    public final Future b(Callable callable, long j, final Runnable runnable, Handler handler) {
        double d = j;
        Double.isNaN(d);
        long j2 = (long) (d * 0.95d);
        if (this.o == null) {
            this.o = Executors.newFixedThreadPool(ceh.a, new dtn(1));
        }
        try {
            final Future submit = this.o.submit(callable);
            handler.postDelayed(new Runnable() { // from class: cds
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    ceh.e("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 == null) {
                        return;
                    }
                    runnable2.run();
                }
            }, j2);
            return submit;
        } catch (Exception e) {
            ceh.g("Async task throws exception!", e);
            return null;
        }
    }

    public final boolean c() {
        return (this.a != 2 || this.p == null || this.f == null) ? false : true;
    }

    public cdp(String str, boolean z, Context context, ceg cegVar) {
        String str2;
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.h = 0;
        this.r = str;
        try {
            str2 = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str2 = "4.0.0";
        }
        this.b = str2;
        this.e = context.getApplicationContext();
        this.d = new cdn(this.e, cegVar);
        this.q = z;
    }
}
