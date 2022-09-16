package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: amhz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amhz implements Runnable {
    public final /* synthetic */ ankt a;
    private final /* synthetic */ int b;

    public /* synthetic */ amhz(ankt anktVar) {
        this.a = anktVar;
    }

    public /* synthetic */ amhz(ankt anktVar, int i) {
        this.b = i;
        this.a = anktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            amia.b(this.a);
        } else if (i == 1) {
            try {
                anlz.y(this.a);
            } catch (ExecutionException e) {
                uwp.h(new Runnable() { // from class: vcs
                    @Override // java.lang.Runnable
                    public final void run() {
                        throw new RuntimeException(e.getCause());
                    }
                });
            }
        } else if (i == 2) {
            amia.b(this.a);
        } else if (i != 3) {
            if (i == 4) {
                amjh.i(this.a);
            } else {
                amjh.k(this.a);
            }
        } else {
            try {
                anlz.y(this.a);
            } catch (ExecutionException e2) {
                if (e2.getCause() instanceof amcn) {
                    ((amzw) ((amzw) ((amzw) amia.a.f()).h(e2)).i("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "lambda$crashOnException$4", (char) 269, "IntentFilterAcledReceiver.java")).q("Got unexpected accountId. Was the account removed?");
                } else if (e2.getCause() instanceof TimeoutException) {
                    throw ammu.a(e2.getCause());
                } else {
                    ammu.d(e2.getCause());
                }
            } catch (Throwable th) {
                ammu.d(th);
            }
        }
    }
}
