package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: daoi  reason: default package */
/* loaded from: classes5.dex */
public final class daoi {
    private static daoi e;
    private static final long f = TimeUnit.SECONDS.toMillis(10);
    private final Context a;
    private final ExecutorService b = dany.a.c;
    private final ExecutorService c = dany.b.c;
    private final long d = f;

    private daoi(Context context) {
        this.a = context;
    }

    public static synchronized daoi e(Context context) {
        daoi daoiVar;
        synchronized (daoi.class) {
            if (e == null) {
                e = new daoi(context.getApplicationContext());
            }
            daoiVar = e;
        }
        return daoiVar;
    }

    public final void a(final int i, final Bundle bundle) {
        try {
            this.b.execute(new Runnable(this, i, bundle) { // from class: daog
                private final daoi a;
                private final int b;
                private final Bundle c;

                {
                    this.a = this;
                    this.b = i;
                    this.c = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(this.b, this.c);
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void b(final String str, final Bundle bundle) {
        try {
            this.c.execute(new Runnable(this, str, bundle) { // from class: daoh
                private final daoi a;
                private final String b;
                private final Bundle c;

                {
                    this.a = this;
                    this.b = str;
                    this.c = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(this.b, this.c);
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void c(int i, Bundle bundle) {
        try {
            danu b = daol.b(this.a, this.d, TimeUnit.MILLISECONDS);
            if (b == null) {
                return;
            }
            b.f(i, bundle, Bundle.EMPTY);
        } catch (RemoteException | IllegalStateException | InterruptedException | TimeoutException unused) {
        }
    }

    public final void d(String str, Bundle bundle) {
        try {
            danu b = daol.b(this.a, this.d, TimeUnit.MILLISECONDS);
            if (b == null) {
                return;
            }
            b.e(str, bundle);
        } catch (RemoteException | InterruptedException | TimeoutException unused) {
        }
    }
}
