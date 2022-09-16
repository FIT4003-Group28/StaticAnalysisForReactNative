package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: ctk  reason: default package */
/* loaded from: classes3.dex */
public final class ctk implements ctg, ctl {
    private Object a;
    private cth b;
    private boolean c;
    private boolean d;
    private boolean e;
    private ckq f;

    private final synchronized Object i(Long l) {
        if (!isDone() && !cvd.m()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (!this.c) {
            if (!this.e) {
                if (this.d) {
                    return this.a;
                }
                if (l == null) {
                    wait(0L);
                } else if (l.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        wait(longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.e) {
                        if (!this.c) {
                            if (!this.d) {
                                throw new TimeoutException();
                            }
                            return this.a;
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.f);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.f);
        }
        throw new CancellationException();
    }

    @Override // defpackage.ctz
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.ctz
    public final synchronized void b(Object obj, cug cugVar) {
    }

    @Override // defpackage.ctz
    public final synchronized cth c() {
        return this.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.c = true;
            notifyAll();
            cth cthVar = null;
            if (z) {
                cth cthVar2 = this.b;
                this.b = null;
                cthVar = cthVar2;
            }
            if (cthVar != null) {
                cthVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.ctz
    public final void d(cty ctyVar) {
        ctyVar.g(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
    }

    @Override // defpackage.ctz
    public final synchronized void e(Drawable drawable) {
    }

    @Override // defpackage.ctz
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.ctz
    public final void g(cty ctyVar) {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return i(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.ctz
    public final synchronized void h(cth cthVar) {
        this.b = cthVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.c && !this.d) {
            if (!this.e) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // defpackage.ctl
    public final synchronized boolean jY(ckq ckqVar, Object obj, ctz ctzVar, boolean z) {
        this.e = true;
        this.f = ckqVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.ctl
    public final synchronized boolean jZ(Object obj, int i) {
        this.d = true;
        this.a = obj;
        notifyAll();
        return false;
    }

    @Override // defpackage.cse
    public final void k() {
    }

    @Override // defpackage.cse
    public final void l() {
    }

    @Override // defpackage.cse
    public final void m() {
    }

    public final String toString() {
        cth cthVar;
        String str;
        String concat = String.valueOf(super.toString()).concat("[status=");
        synchronized (this) {
            cthVar = null;
            if (this.c) {
                str = "CANCELLED";
            } else if (this.e) {
                str = "FAILURE";
            } else if (this.d) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                cthVar = this.b;
            }
        }
        if (cthVar != null) {
            String valueOf = String.valueOf(cthVar);
            int length = String.valueOf(concat).length();
            StringBuilder sb = new StringBuilder(length + 13 + str.length() + String.valueOf(valueOf).length());
            sb.append(concat);
            sb.append(str);
            sb.append(", request=[");
            sb.append(valueOf);
            sb.append("]]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 1 + str.length());
        sb2.append(concat);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return i(Long.valueOf(timeUnit.toMillis(j)));
    }
}
