package com.facebook.common.j;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.d.m;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: StatFsHelper.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f2311a;

    /* renamed from: b  reason: collision with root package name */
    private static final long f2312b = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: d  reason: collision with root package name */
    private volatile File f2314d;
    private volatile File f;
    private long g;

    /* renamed from: c  reason: collision with root package name */
    private volatile StatFs f2313c = null;
    private volatile StatFs e = null;
    private volatile boolean i = false;
    private final Lock h = new ReentrantLock();

    /* compiled from: StatFsHelper.java */
    /* renamed from: com.facebook.common.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0052a {
        INTERNAL,
        EXTERNAL
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f2311a == null) {
                f2311a = new a();
            }
            aVar = f2311a;
        }
        return aVar;
    }

    protected a() {
    }

    private void b() {
        if (!this.i) {
            this.h.lock();
            try {
                if (!this.i) {
                    this.f2314d = Environment.getDataDirectory();
                    this.f = Environment.getExternalStorageDirectory();
                    d();
                    this.i = true;
                }
            } finally {
                this.h.unlock();
            }
        }
    }

    public boolean a(EnumC0052a enumC0052a, long j) {
        b();
        long a2 = a(enumC0052a);
        return a2 <= 0 || a2 < j;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long a(EnumC0052a enumC0052a) {
        long blockSize;
        long availableBlocks;
        b();
        c();
        StatFs statFs = enumC0052a == EnumC0052a.INTERNAL ? this.f2313c : this.e;
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

    private void c() {
        if (this.h.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.g > f2312b) {
                    d();
                }
            } finally {
                this.h.unlock();
            }
        }
    }

    private void d() {
        this.f2313c = a(this.f2313c, this.f2314d);
        this.e = a(this.e, this.f);
        this.g = SystemClock.uptimeMillis();
    }

    private StatFs a(StatFs statFs, File file) {
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th) {
            throw m.b(th);
        }
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }
}
