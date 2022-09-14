package com.baidu.vi;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public class VMsg {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2157a = "VMsg";

    /* renamed from: b  reason: collision with root package name */
    private static Handler f2158b;

    /* renamed from: c  reason: collision with root package name */
    private static HandlerThread f2159c;

    /* loaded from: classes.dex */
    static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            VMsg.OnUserCommand1(message.what, message.arg1, message.arg2, message.obj == null ? 0L : ((Long) message.obj).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void OnUserCommand1(int i, int i2, int i3, long j);

    public static void destroy() {
        f2159c.quit();
        f2159c = null;
        f2158b.removeCallbacksAndMessages(null);
        f2158b = null;
    }

    public static void init() {
        f2159c = new HandlerThread("VIMsgThread");
        f2159c.start();
        f2158b = new a(f2159c.getLooper());
    }

    private static void postMessage(int i, int i2, int i3, long j) {
        if (f2158b == null) {
            return;
        }
        Message.obtain(f2158b, i, i2, i3, Long.valueOf(j)).sendToTarget();
    }
}
