package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: accx  reason: default package */
/* loaded from: classes.dex */
public final class accx implements acdo {
    public static final long a;
    public static final long b;
    static final String c;
    private static final String k = "accx";
    public final SharedPreferences d;
    public final Handler e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public boolean j;

    static {
        String name = accx.class.getName();
        a = TimeUnit.SECONDS.toMillis(15L);
        b = TimeUnit.SECONDS.toMillis(1L);
        c = String.valueOf(name).concat(".KEY_LAST_TIMESTAMP");
    }

    public accx(SharedPreferences sharedPreferences, Handler handler) {
        sharedPreferences.getClass();
        this.d = sharedPreferences;
        this.e = handler;
    }

    public static accx a(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("youtube", 0);
        HandlerThread handlerThread = new HandlerThread("RtmpContinuityManager");
        handlerThread.start();
        return new accx(sharedPreferences, new Handler(handlerThread.getLooper()));
    }

    protected final void finalize() {
        Looper looper = this.e.getLooper();
        if (looper != null) {
            Thread thread = looper.getThread();
            if ((thread instanceof HandlerThread) && TextUtils.equals("RtmpContinuityManager", thread.getName())) {
                ((HandlerThread) thread).quitSafely();
            }
        }
        super.finalize();
    }
}
