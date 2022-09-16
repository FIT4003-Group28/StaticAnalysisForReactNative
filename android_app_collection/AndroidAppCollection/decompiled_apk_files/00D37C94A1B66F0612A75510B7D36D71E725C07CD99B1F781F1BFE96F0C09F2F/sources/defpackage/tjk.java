package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
/* compiled from: PG */
/* renamed from: tjk  reason: default package */
/* loaded from: classes4.dex */
public final class tjk {
    public static tfj a;

    public static void a() {
        b(Looper.myLooper() == Looper.getMainLooper(), "This should be running on the main thread.");
    }

    public static void b(boolean z, String str) {
        if (!z) {
            j(new IllegalStateException(str));
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            j(new NullPointerException());
        }
    }

    public static tis d(Context context) {
        return new tis(res.a(context));
    }

    public static ankt e(rve rveVar) {
        final SettableFuture f = SettableFuture.f();
        rveVar.m(anjk.a, new rut() { // from class: tin
            @Override // defpackage.rut
            public final void a(rve rveVar2) {
                SettableFuture settableFuture = SettableFuture.this;
                if (((rvj) rveVar2).d) {
                    settableFuture.cancel(false);
                } else if (rveVar2.k()) {
                    settableFuture.o(rveVar2.g());
                } else {
                    Exception f2 = rveVar2.f();
                    if (f2 != null) {
                        settableFuture.e(f2);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return f;
    }

    public static final String f(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static final void g(String str, Object obj, List list) {
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }

    public static final void i(MediaQueueItem mediaQueueItem) {
        if (mediaQueueItem.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (Double.isNaN(mediaQueueItem.d) || mediaQueueItem.d >= 0.0d) {
            if (Double.isNaN(mediaQueueItem.e)) {
                throw new IllegalArgumentException("playbackDuration cannot be NaN.");
            }
            if (!Double.isNaN(mediaQueueItem.f) && mediaQueueItem.f >= 0.0d) {
                return;
            }
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        throw new IllegalArgumentException("startTime cannot be negative or NaN.");
    }

    private static void j(RuntimeException runtimeException) {
        Log.e("Preconditions", "Precondition broken. Build is not strict; continuing...", runtimeException);
    }

    public static qsp h(Status status) {
        if (status.i == null) {
            return new qsp(status);
        }
        return new qtc(status);
    }
}
