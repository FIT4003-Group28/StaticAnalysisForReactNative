package defpackage;

import android.os.StrictMode;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: codp  reason: default package */
/* loaded from: classes5.dex */
public final class codp {
    public static <T> T a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
