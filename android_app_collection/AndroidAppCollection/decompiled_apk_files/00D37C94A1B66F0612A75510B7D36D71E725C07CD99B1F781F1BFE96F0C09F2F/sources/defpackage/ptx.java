package defpackage;

import android.location.Location;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: ptx  reason: default package */
/* loaded from: classes4.dex */
public final class ptx {
    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static void c(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void d(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void e(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void f(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    public static void g(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException((String) obj2);
    }

    public static int i(dnj dnjVar) {
        dnj dnjVar2 = dnj.INVALID_REQUEST;
        int ordinal = dnjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 3;
            }
            return ordinal != 2 ? 0 : 2;
        }
        return 1;
    }

    public static void j(AdRequestParcel adRequestParcel) {
        List list = adRequestParcel.e;
        if (list != null) {
            new HashSet(list);
        }
        new Date(adRequestParcel.b);
        int i = adRequestParcel.d;
        Location location = adRequestParcel.k;
    }

    public static Object k(amqo amqoVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return amqoVar.get();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
