package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Log;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amgu  reason: default package */
/* loaded from: classes.dex */
public final class amgu implements ver {
    public final Context a;
    public final azqb b;
    public final ankw c;
    public final axnm d;
    public final azqb e;
    public final azqb f;
    private final vei g;

    public amgu(Context context, vei veiVar, azqb azqbVar, ankw ankwVar, axnm axnmVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = context;
        this.g = veiVar;
        this.b = azqbVar;
        this.c = ankwVar;
        this.d = axnmVar;
        this.e = azqbVar3;
        this.f = azqbVar2;
    }

    public static int b(RandomAccessFile randomAccessFile) {
        try {
            int readInt = randomAccessFile.readInt();
            randomAccessFile.seek(0L);
            return readInt;
        } catch (EOFException unused) {
            randomAccessFile.seek(0L);
            return -1;
        } catch (Throwable th) {
            randomAccessFile.seek(0L);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.writeInt(i);
        randomAccessFile.seek(0L);
    }

    @Override // defpackage.ver
    public final void a() {
        if (!"robolectric".equals(Build.FINGERPRINT) && veg.b() && this.g.a()) {
            c(true);
        }
    }

    public final void c(final boolean z) {
        amlp l = amna.l("StartupAfterPackageReplaced");
        try {
            final ankt v = anlz.v(ammo.b(new aniq() { // from class: amgr
                @Override // defpackage.aniq
                public final ankt a() {
                    Callable callable;
                    final amgu amguVar = amgu.this;
                    boolean z2 = z;
                    try {
                        PackageInfo packageInfo = (PackageInfo) amguVar.e.get();
                        final int i = packageInfo.versionCode;
                        if (packageInfo.applicationInfo.dataDir != null) {
                            File file = new File(new File(packageInfo.applicationInfo.dataDir, "files"), "tiktok");
                            file.mkdirs();
                            File file2 = new File(file, "103243289");
                            boolean createNewFile = file2.createNewFile();
                            if (!file2.exists() || !file2.isFile()) {
                                throw new IOException("Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup.");
                            }
                            final RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                            if (createNewFile || i != amgu.b(randomAccessFile)) {
                                amgu.d(randomAccessFile, -1);
                                callable = new Callable() { // from class: amgt
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        amgu amguVar2 = amgu.this;
                                        RandomAccessFile randomAccessFile2 = randomAccessFile;
                                        int i2 = i;
                                        try {
                                            for (amgq amgqVar : (Set) amguVar2.b.get()) {
                                                amgqVar.a();
                                            }
                                            amgu.d(randomAccessFile2, i2);
                                            randomAccessFile2.close();
                                            return null;
                                        } catch (Throwable th) {
                                            randomAccessFile2.close();
                                            throw th;
                                        }
                                    }
                                };
                            } else {
                                randomAccessFile.close();
                                callable = null;
                            }
                            if (callable == null) {
                                return anlz.q(null);
                            }
                            ankt qp = amguVar.c.qp(ammo.g(callable));
                            ((amee) amguVar.d.get()).c(qp);
                            return qp;
                        }
                        throw new IllegalStateException("PackageInfo was invalid.");
                    } catch (IOException e) {
                        if (!z2 || Build.VERSION.SDK_INT < 24) {
                            Log.e("StartupAfterPkgReplaced", "StartupAfterPackageReplaced failed, will try again next startup: ", e);
                        } else {
                            if (!sre.e(amguVar.a)) {
                                Log.w("StartupAfterPkgReplaced", "StartupAfterPackageReplaced failed, device was locked. Will reschedule.", e);
                            }
                            sre.b(amguVar.a, new Runnable() { // from class: amgs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    amgu amguVar2 = amgu.this;
                                    if (amna.o()) {
                                        amguVar2.c(false);
                                        return;
                                    }
                                    amlv a = ((amly) amguVar2.f.get()).a("StartupAfterPackageReplacedUnlock");
                                    try {
                                        amguVar2.c(false);
                                        amna.i(a);
                                    } catch (Throwable th) {
                                        try {
                                            amna.i(a);
                                        } catch (Throwable unused) {
                                        }
                                        throw th;
                                    }
                                }
                            });
                        }
                        return anlz.q(null);
                    }
                }
            }), this.c);
            amee ameeVar = (amee) this.d.get();
            l.a(v);
            final TimeUnit timeUnit = TimeUnit.SECONDS;
            final ankv b = ameeVar.d.b(ammo.f(new Runnable() { // from class: amea
                @Override // java.lang.Runnable
                public final void run() {
                    ankt anktVar = ankt.this;
                    TimeUnit timeUnit2 = timeUnit;
                    if (!anktVar.isDone()) {
                        ((amzw) ((amzw) ((amzw) amee.a.f()).h(ammu.c())).i("com/google/apps/tiktok/concurrent/AndroidFutures", "lambda$crashApplicationOnFailure$1", 284, "AndroidFutures.java")).v("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", 30L, timeUnit2, anktVar);
                    }
                }
            }), 30L, timeUnit);
            v.qY(ammo.f(new Runnable() { // from class: amec
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = b;
                    ankt anktVar = v;
                    future.cancel(true);
                    try {
                        anlz.y(anktVar);
                    } catch (ExecutionException e) {
                        ammu.d(e.getCause());
                    }
                }
            }), ameeVar.c);
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
