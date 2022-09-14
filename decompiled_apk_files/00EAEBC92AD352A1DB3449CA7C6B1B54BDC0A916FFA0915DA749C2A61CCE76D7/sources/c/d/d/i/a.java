package c.d.d.i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import c.d.d.d.n;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class a {

    /* renamed from: h  reason: collision with root package name */
    private static a f2849h;
    private static final long i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b  reason: collision with root package name */
    private volatile File f2851b;

    /* renamed from: d  reason: collision with root package name */
    private volatile File f2853d;

    /* renamed from: e  reason: collision with root package name */
    private long f2854e;

    /* renamed from: a  reason: collision with root package name */
    private volatile StatFs f2850a = null;

    /* renamed from: c  reason: collision with root package name */
    private volatile StatFs f2852c = null;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f2856g = false;

    /* renamed from: f  reason: collision with root package name */
    private final Lock f2855f = new ReentrantLock();

    /* renamed from: c.d.d.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0072a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private StatFs a(StatFs statFs, File file) {
        ?? r0 = 0;
        r0 = 0;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            r0 = statFs;
            return r0;
        } catch (IllegalArgumentException unused) {
            return r0;
        } catch (Throwable th) {
            n.a(th);
            throw r0;
        }
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void a() {
        if (!this.f2856g) {
            this.f2855f.lock();
            try {
                if (!this.f2856g) {
                    this.f2851b = Environment.getDataDirectory();
                    this.f2853d = Environment.getExternalStorageDirectory();
                    d();
                    this.f2856g = true;
                }
            } finally {
                this.f2855f.unlock();
            }
        }
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            if (f2849h == null) {
                f2849h = new a();
            }
            aVar = f2849h;
        }
        return aVar;
    }

    private void c() {
        if (this.f2855f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f2854e > i) {
                    d();
                }
            } finally {
                this.f2855f.unlock();
            }
        }
    }

    private void d() {
        this.f2850a = a(this.f2850a, this.f2851b);
        this.f2852c = a(this.f2852c, this.f2853d);
        this.f2854e = SystemClock.uptimeMillis();
    }

    @SuppressLint({"DeprecatedMethod"})
    public long a(EnumC0072a enumC0072a) {
        long blockSize;
        long availableBlocks;
        a();
        c();
        StatFs statFs = enumC0072a == EnumC0072a.INTERNAL ? this.f2850a : this.f2852c;
        if (statFs != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                availableBlocks = statFs.getAvailableBlocksLong();
            } else {
                blockSize = statFs.getBlockSize();
                availableBlocks = statFs.getAvailableBlocks();
            }
            return blockSize * availableBlocks;
        }
        return 0L;
    }

    public boolean a(EnumC0072a enumC0072a, long j) {
        a();
        long a2 = a(enumC0072a);
        return a2 <= 0 || a2 < j;
    }
}
