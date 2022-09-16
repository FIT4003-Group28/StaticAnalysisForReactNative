package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axu  reason: default package */
/* loaded from: classes2.dex */
public final class axu extends Handler implements Runnable {
    public final int a;
    public IOException b;
    public int c;
    final /* synthetic */ axz d;
    private final axv e;
    private axt f;
    private Thread g;
    private boolean h;
    private volatile boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axu(axz axzVar, Looper looper, axv axvVar, axt axtVar, int i) {
        super(looper);
        this.d = axzVar;
        this.e = axvVar;
        this.f = axtVar;
        this.a = i;
    }

    private final void c() {
        this.b = null;
        axz axzVar = this.d;
        ExecutorService executorService = axzVar.a;
        axu axuVar = axzVar.b;
        ptx.a(axuVar);
        executorService.execute(axuVar);
    }

    private final void d() {
        this.d.b = null;
    }

    public final void a(boolean z) {
        this.i = z;
        this.b = null;
        if (hasMessages(0)) {
            this.h = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.h = true;
                this.e.a();
                Thread thread = this.g;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            d();
            SystemClock.elapsedRealtime();
            axt axtVar = this.f;
            ptx.a(axtVar);
            axtVar.pV(this.e, true);
            this.f = null;
        }
    }

    public final void b(long j) {
        ptx.e(this.d.b == null);
        this.d.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            c();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        if (message.what == 0) {
            c();
        } else if (message.what == 3) {
            throw ((Error) message.obj);
        } else {
            d();
            SystemClock.elapsedRealtime();
            axt axtVar = this.f;
            ptx.a(axtVar);
            if (this.h) {
                axtVar.pV(this.e, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                try {
                    axtVar.pW(this.e);
                } catch (RuntimeException e) {
                    pns.e("LoadTask", "Unexpected exception handling load completed", e);
                    this.d.c = new axy(e);
                }
            } else if (i != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.b = iOException;
                int i2 = this.c + 1;
                this.c = i2;
                bbu pX = axtVar.pX(this.e, iOException, i2);
                int i3 = pX.b;
                if (i3 == 3) {
                    this.d.c = this.b;
                } else if (i3 == 2) {
                } else {
                    if (i3 == 1) {
                        this.c = 1;
                    }
                    long j = pX.a;
                    if (j == -9223372036854775807L) {
                        j = Math.min((this.c - 1) * 1000, 5000);
                    }
                    b(j);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.h;
                this.g = Thread.currentThread();
            }
            if (z) {
                String valueOf = String.valueOf(this.e.getClass().getSimpleName());
                if (valueOf.length() != 0) {
                    "load:".concat(valueOf);
                }
                int i = pxi.a;
                this.e.b();
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.i) {
                return;
            }
            pns.e("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(2, new axy(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.i) {
                return;
            }
            pns.e("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(2, new axy(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.i) {
                pns.e("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
