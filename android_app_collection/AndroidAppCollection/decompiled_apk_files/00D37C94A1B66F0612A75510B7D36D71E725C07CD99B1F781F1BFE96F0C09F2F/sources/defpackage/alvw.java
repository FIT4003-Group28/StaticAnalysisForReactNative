package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: alvw  reason: default package */
/* loaded from: classes.dex */
public final class alvw {
    private static alvw a;
    private final Context c;
    private final ExecutorService d = alvo.a.c;
    private final ExecutorService e = alvo.b.c;
    private final long f = b;
    private static final ancy g = new ancy("SetupCompatServiceInvoker");
    private static final long b = TimeUnit.SECONDS.toMillis(10);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    private alvw(Context context) {
        this.c = context;
    }

    public static synchronized alvw a(Context context) {
        alvw alvwVar;
        synchronized (alvw.class) {
            if (a == null) {
                a = new alvw(context.getApplicationContext());
            }
            alvwVar = a;
        }
        return alvwVar;
    }

    public final void b(final String str, final Bundle bundle) {
        try {
            this.e.execute(new Runnable() { // from class: alvv
                @Override // java.lang.Runnable
                public final void run() {
                    alvw.this.c(str, bundle);
                }
            });
        } catch (RejectedExecutionException e) {
            g.c(String.format("Screen %s bind back fail.", str), e);
        }
    }

    public final void c(String str, Bundle bundle) {
        try {
            alvl b2 = alvz.b(this.c, this.f, TimeUnit.MILLISECONDS);
            if (b2 != null) {
                Parcel pv = b2.pv();
                pv.writeString(str);
                dve.g(pv, bundle);
                b2.py(1, pv);
                return;
            }
            g.d("BindBack failed since service reference is null. Are the permissions valid?");
        } catch (RemoteException | InterruptedException | TimeoutException e) {
            g.c(String.format("Exception occurred while %s trying bind back to SetupWizard.", str), e);
        }
    }

    public final void d(int i, Bundle bundle) {
        try {
            alvl b2 = alvz.b(this.c, this.f, TimeUnit.MILLISECONDS);
            if (b2 != null) {
                Bundle bundle2 = Bundle.EMPTY;
                Parcel pv = b2.pv();
                pv.writeInt(i);
                dve.g(pv, bundle);
                dve.g(pv, bundle2);
                b2.py(2, pv);
                return;
            }
            g.d("logMetric failed since service reference is null. Are the permissions valid?");
        } catch (RemoteException | IllegalStateException | InterruptedException | TimeoutException e) {
            g.c(String.format("Exception occurred while trying to log metric = [%s]", bundle), e);
        }
    }

    public final void e(final int i, final Bundle bundle) {
        try {
            this.d.execute(new Runnable() { // from class: alvu
                @Override // java.lang.Runnable
                public final void run() {
                    alvw.this.d(i, bundle);
                }
            });
        } catch (RejectedExecutionException e) {
            g.c(String.format("Metric of type %d dropped since queue is full.", Integer.valueOf(i)), e);
        }
    }
}
