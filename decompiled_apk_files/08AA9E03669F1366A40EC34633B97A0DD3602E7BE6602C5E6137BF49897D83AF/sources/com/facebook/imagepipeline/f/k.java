package com.facebook.imagepipeline.f;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
/* compiled from: PriorityThreadFactory.java */
/* loaded from: classes.dex */
public class k implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final int f2676a;

    public k(int i) {
        this.f2676a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable() { // from class: com.facebook.imagepipeline.f.k.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(k.this.f2676a);
                } catch (Throwable unused) {
                }
                runnable.run();
            }
        });
    }
}
