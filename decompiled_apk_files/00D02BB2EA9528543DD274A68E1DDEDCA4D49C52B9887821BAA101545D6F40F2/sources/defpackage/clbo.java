package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: clbo  reason: default package */
/* loaded from: classes5.dex */
public final class clbo {
    public static final Handler a;

    static {
        Looper.getMainLooper().getThread();
        a = new Handler(Looper.getMainLooper());
        deip deipVar = new deip();
        deipVar.a = "Pico-ViewerThreadUtils-%d";
        Executors.newSingleThreadExecutor(deip.a(deipVar));
    }
}
