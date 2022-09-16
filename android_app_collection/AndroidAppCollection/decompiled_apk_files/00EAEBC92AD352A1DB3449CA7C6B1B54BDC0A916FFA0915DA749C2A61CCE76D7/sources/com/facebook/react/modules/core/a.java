package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f5595b;

    /* renamed from: a  reason: collision with root package name */
    private Choreographer f5596a = a();

    /* renamed from: com.facebook.react.modules.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0125a {

        /* renamed from: a  reason: collision with root package name */
        private Choreographer.FrameCallback f5597a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.react.modules.core.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Choreographer$FrameCallbackC0126a implements Choreographer.FrameCallback {
            Choreographer$FrameCallbackC0126a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                AbstractC0125a.this.a(j);
            }
        }

        Choreographer.FrameCallback a() {
            if (this.f5597a == null) {
                this.f5597a = new Choreographer$FrameCallbackC0126a();
            }
            return this.f5597a;
        }

        public abstract void a(long j);
    }

    private a() {
    }

    private Choreographer a() {
        return Choreographer.getInstance();
    }

    private void a(Choreographer.FrameCallback frameCallback) {
        this.f5596a.postFrameCallback(frameCallback);
    }

    public static a b() {
        UiThreadUtil.assertOnUiThread();
        if (f5595b == null) {
            f5595b = new a();
        }
        return f5595b;
    }

    private void b(Choreographer.FrameCallback frameCallback) {
        this.f5596a.removeFrameCallback(frameCallback);
    }

    public void a(AbstractC0125a abstractC0125a) {
        a(abstractC0125a.a());
    }

    public void b(AbstractC0125a abstractC0125a) {
        b(abstractC0125a.a());
    }
}
