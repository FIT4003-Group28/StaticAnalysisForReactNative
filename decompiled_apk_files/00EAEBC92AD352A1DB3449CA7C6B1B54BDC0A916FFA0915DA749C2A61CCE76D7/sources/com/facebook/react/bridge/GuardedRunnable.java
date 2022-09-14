package com.facebook.react.bridge;
/* loaded from: classes.dex */
public abstract class GuardedRunnable implements Runnable {
    private final NativeModuleCallExceptionHandler mExceptionHandler;

    public GuardedRunnable(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mExceptionHandler = nativeModuleCallExceptionHandler;
    }

    @Deprecated
    public GuardedRunnable(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            runGuarded();
        } catch (RuntimeException e2) {
            this.mExceptionHandler.handleException(e2);
        }
    }

    public abstract void runGuarded();
}
