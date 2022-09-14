package com.facebook.l;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
/* compiled from: FileLocker.java */
/* loaded from: classes.dex */
public final class e implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final FileOutputStream f3041a;

    /* renamed from: b  reason: collision with root package name */
    private final FileLock f3042b;

    public static e a(File file) {
        return new e(file);
    }

    private e(File file) {
        this.f3041a = new FileOutputStream(file);
        try {
            FileLock lock = this.f3041a.getChannel().lock();
            if (lock == null) {
            }
            this.f3042b = lock;
        } finally {
            this.f3041a.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f3042b.release();
        } finally {
            this.f3041a.close();
        }
    }
}
