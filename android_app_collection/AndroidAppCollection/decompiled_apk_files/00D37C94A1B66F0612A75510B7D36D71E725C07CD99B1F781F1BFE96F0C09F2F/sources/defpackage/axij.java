package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.webrtc.Logging;
import org.webrtc.VideoCodecStatus;
/* compiled from: PG */
/* renamed from: axij  reason: default package */
/* loaded from: classes2.dex */
public class axij {
    private static Context a;
    public static int b;
    public static volatile Boolean c;
    private static axgk d;

    public static VideoCodecStatus e(Handler handler, final Callable callable, String str) {
        Object call;
        try {
            if (handler.getLooper().getThread() == Thread.currentThread()) {
                try {
                    call = callable.call();
                } catch (Exception e) {
                    throw new ExecutionException(e);
                }
            } else {
                final axii axiiVar = new axii();
                final axih axihVar = new axih();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                if (handler.post(new Runnable() { // from class: axig
                    @Override // java.lang.Runnable
                    public final void run() {
                        axii axiiVar2 = axii.this;
                        Callable callable2 = callable;
                        axih axihVar2 = axihVar;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        try {
                            axiiVar2.a = callable2.call();
                        } catch (Exception e2) {
                            axihVar2.a = e2;
                        }
                        countDownLatch2.countDown();
                    }
                })) {
                    while (!countDownLatch.await(3000L, TimeUnit.MILLISECONDS)) {
                        Thread thread = handler.getLooper().getThread();
                        if (thread.isAlive()) {
                            Throwable th = new Throwable();
                            th.setStackTrace(thread.getStackTrace());
                            Logging.e("ThreadUtils", "Invoke waiting to complete.", new Throwable(th));
                        } else {
                            throw new IllegalStateException("Underlying thread died while waiting for the operation to complete.");
                        }
                    }
                    Exception exc = axihVar.a;
                    if (exc == null) {
                        call = axiiVar.a;
                    } else {
                        throw new ExecutionException(exc);
                    }
                } else {
                    throw new IllegalStateException("Posting on the handler failed. (Thread is not alive.)");
                }
            }
            return (VideoCodecStatus) call;
        } catch (IllegalStateException e2) {
            e = e2;
            Logging.c("ThreadUtils", "Exception", e);
            return VideoCodecStatus.ERROR;
        } catch (InterruptedException e3) {
            Logging.c("ThreadUtils", "Interrupted", e3);
            Thread.currentThread().interrupt();
            return VideoCodecStatus.ERROR;
        } catch (ExecutionException e4) {
            e = e4;
            Logging.c("ThreadUtils", "Exception", e);
            return VideoCodecStatus.ERROR;
        } catch (TimeoutException e5) {
            Thread thread2 = handler.getLooper().getThread();
            if (thread2.isAlive()) {
                Throwable th2 = new Throwable();
                th2.setStackTrace(thread2.getStackTrace());
                StringBuilder sb = new StringBuilder(str.length() + 36);
                sb.append("Timeout waiting for ");
                sb.append(str);
                sb.append(". Thread is busy");
                Logging.c("ThreadUtils", sb.toString(), new Throwable(th2));
            } else {
                Logging.c("ThreadUtils", str.length() != 0 ? "Thread died while waiting for ".concat(str) : new String("Thread died while waiting for "), e5);
            }
            return VideoCodecStatus.ERROR;
        }
    }

    public static axif f(String str) {
        return new axif(MediaCodec.createByCodecName(str));
    }

    public static Context g(Context context) {
        if (a == null) {
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            if (vrCoreClientApiVersion < 9) {
                throw new axfj(4);
            }
            try {
                a = context.createPackageContext("com.google.vr.vrcore", 3);
                b = vrCoreClientApiVersion;
            } catch (PackageManager.NameNotFoundException unused) {
                throw new axfj(1);
            }
        }
        return a;
    }

    public static axgk h(Context context) {
        axgk axgkVar;
        if (d == null) {
            IBinder m = m(g(context).getClassLoader());
            if (m == null) {
                axgkVar = null;
            } else {
                IInterface queryLocalInterface = m.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                if (queryLocalInterface instanceof axgk) {
                    axgkVar = (axgk) queryLocalInterface;
                } else {
                    axgkVar = new axgk(m);
                }
            }
            d = axgkVar;
        }
        return d;
    }

    public static synchronized boolean i(Context context) {
        boolean booleanValue;
        synchronized (axij.class) {
            if (c == null) {
                try {
                    c = Boolean.valueOf(axfi.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), axfi.c, axfi.d, axfi.b));
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalStateException("Unable to find self package info", e);
                }
            }
            booleanValue = c.booleanValue();
        }
        return booleanValue;
    }

    public static int j(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
            case 11:
            default:
                return 0;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
        }
    }

    public static int k(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static ankt l() {
        throw new UnsupportedOperationException();
    }

    private static IBinder m(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.vrcore.library.VrCreator").newInstance();
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.vrcore.library.VrCreator");
        } catch (IllegalAccessException unused2) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.vrcore.library.VrCreator");
        } catch (InstantiationException unused3) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.vrcore.library.VrCreator");
        }
    }

    public void a(awyp awypVar) {
    }

    public void b(awyp awypVar) {
    }

    public void c(awyp awypVar) {
    }

    public void d() {
    }
}
