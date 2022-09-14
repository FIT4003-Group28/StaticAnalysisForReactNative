package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
/* loaded from: classes.dex */
public final class g implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final FileOutputStream f6475b;

    /* renamed from: c  reason: collision with root package name */
    private final FileLock f6476c;

    private g(File file) {
        this.f6475b = new FileOutputStream(file);
        try {
            FileLock lock = this.f6475b.getChannel().lock();
            if (lock == null) {
            }
            this.f6476c = lock;
        } finally {
            this.f6475b.close();
        }
    }

    public static g a(File file) {
        return new g(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.f6476c != null) {
                this.f6476c.release();
            }
        } finally {
            this.f6475b.close();
        }
    }
}
