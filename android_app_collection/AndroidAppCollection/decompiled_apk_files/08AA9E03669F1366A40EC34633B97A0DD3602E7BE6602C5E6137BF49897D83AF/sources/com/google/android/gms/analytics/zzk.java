package com.google.android.gms.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.internal.measurement.zzz;
import java.lang.Thread;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
@VisibleForTesting
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class zzk {
    private static volatile zzk zzsb;
    private final Context zzqx;
    private final List<zzn> zzsc;
    private final zze zzsd;
    private final zza zzse;
    private volatile zzu zzsf;
    private Thread.UncaughtExceptionHandler zzsg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class zza extends ThreadPoolExecutor {
        public zza() {
            super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new zzb(null));
            allowCoreThreadTimeOut(true);
        }

        @Override // java.util.concurrent.AbstractExecutorService
        protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new zzm(this, runnable, t);
        }
    }

    /* loaded from: classes.dex */
    static class zzb implements ThreadFactory {
        private static final AtomicInteger zzsk = new AtomicInteger();

        private zzb() {
        }

        /* synthetic */ zzb(zzl zzlVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = zzsk.incrementAndGet();
            StringBuilder sb = new StringBuilder(23);
            sb.append("measurement-");
            sb.append(incrementAndGet);
            return new zzc(runnable, sb.toString());
        }
    }

    /* loaded from: classes.dex */
    static class zzc extends Thread {
        zzc(Runnable runnable, String str) {
            super(runnable, str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    @VisibleForTesting
    private zzk(Context context) {
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zzqx = applicationContext;
        this.zzse = new zza();
        this.zzsc = new CopyOnWriteArrayList();
        this.zzsd = new zze();
    }

    public static void zzab() {
        if (!(Thread.currentThread() instanceof zzc)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public static zzk zzb(Context context) {
        Preconditions.checkNotNull(context);
        if (zzsb == null) {
            synchronized (zzk.class) {
                if (zzsb == null) {
                    zzsb = new zzk(context);
                }
            }
        }
        return zzsb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(zzg zzgVar) {
        Preconditions.checkNotMainThread("deliver should be called from worker thread");
        Preconditions.checkArgument(zzgVar.zzt(), "Measurement must be submitted");
        List<zzo> zzq = zzgVar.zzq();
        if (zzq.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (zzo zzoVar : zzq) {
            Uri zzk = zzoVar.zzk();
            if (!hashSet.contains(zzk)) {
                hashSet.add(zzk);
                zzoVar.zzb(zzgVar);
            }
        }
    }

    public final Context getContext() {
        return this.zzqx;
    }

    public final <V> Future<V> zza(Callable<V> callable) {
        Preconditions.checkNotNull(callable);
        if (Thread.currentThread() instanceof zzc) {
            FutureTask futureTask = new FutureTask(callable);
            futureTask.run();
            return futureTask;
        }
        return this.zzse.submit(callable);
    }

    public final void zza(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        this.zzse.submit(runnable);
    }

    public final void zza(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzsg = uncaughtExceptionHandler;
    }

    public final zzz zzaa() {
        DisplayMetrics displayMetrics = this.zzqx.getResources().getDisplayMetrics();
        zzz zzzVar = new zzz();
        zzzVar.setLanguage(zzdd.zza(Locale.getDefault()));
        zzzVar.zztw = displayMetrics.widthPixels;
        zzzVar.zztx = displayMetrics.heightPixels;
        return zzzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zzg zzgVar) {
        if (zzgVar.zzw()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (zzgVar.zzt()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        zzg zzo = zzgVar.zzo();
        zzo.zzu();
        this.zzse.execute(new zzl(this, zzo));
    }

    public final zzu zzz() {
        if (this.zzsf == null) {
            synchronized (this) {
                if (this.zzsf == null) {
                    zzu zzuVar = new zzu();
                    PackageManager packageManager = this.zzqx.getPackageManager();
                    String packageName = this.zzqx.getPackageName();
                    zzuVar.setAppId(packageName);
                    zzuVar.setAppInstallerId(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.zzqx.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        String valueOf = String.valueOf(packageName);
                        Log.e("GAv4", valueOf.length() != 0 ? "Error retrieving package info: appName set to ".concat(valueOf) : new String("Error retrieving package info: appName set to "));
                    }
                    zzuVar.setAppName(packageName);
                    zzuVar.setAppVersion(str);
                    this.zzsf = zzuVar;
                }
            }
        }
        return this.zzsf;
    }
}
