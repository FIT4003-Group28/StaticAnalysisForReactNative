package com.facebook.react.modules.core;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
/* compiled from: ChoreographerCompat.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f3516a;

    /* renamed from: b  reason: collision with root package name */
    private static final a f3517b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f3518c;

    /* renamed from: d  reason: collision with root package name */
    private Choreographer f3519d;

    static {
        f3516a = Build.VERSION.SDK_INT >= 16;
        f3517b = new a();
    }

    public static a a() {
        return f3517b;
    }

    private a() {
        if (f3516a) {
            this.f3519d = b();
        } else {
            this.f3518c = new Handler(Looper.getMainLooper());
        }
    }

    public void a(AbstractC0069a abstractC0069a) {
        if (f3516a) {
            a(abstractC0069a.a());
        } else {
            this.f3518c.postDelayed(abstractC0069a.b(), 0L);
        }
    }

    public void b(AbstractC0069a abstractC0069a) {
        if (f3516a) {
            b(abstractC0069a.a());
        } else {
            this.f3518c.removeCallbacks(abstractC0069a.b());
        }
    }

    @TargetApi(16)
    private Choreographer b() {
        return Choreographer.getInstance();
    }

    @TargetApi(16)
    private void a(Choreographer.FrameCallback frameCallback) {
        this.f3519d.postFrameCallback(frameCallback);
    }

    @TargetApi(16)
    private void b(Choreographer.FrameCallback frameCallback) {
        this.f3519d.removeFrameCallback(frameCallback);
    }

    /* compiled from: ChoreographerCompat.java */
    /* renamed from: com.facebook.react.modules.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0069a {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f3520a;

        /* renamed from: b  reason: collision with root package name */
        private Choreographer.FrameCallback f3521b;

        public abstract void b(long j);

        @TargetApi(16)
        Choreographer.FrameCallback a() {
            if (this.f3521b == null) {
                this.f3521b = new Choreographer.FrameCallback() { // from class: com.facebook.react.modules.core.a.a.1
                    @Override // android.view.Choreographer.FrameCallback
                    public void doFrame(long j) {
                        AbstractC0069a.this.b(j);
                    }
                };
            }
            return this.f3521b;
        }

        Runnable b() {
            if (this.f3520a == null) {
                this.f3520a = new Runnable() { // from class: com.facebook.react.modules.core.a.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC0069a.this.b(System.nanoTime());
                    }
                };
            }
            return this.f3520a;
        }
    }
}
