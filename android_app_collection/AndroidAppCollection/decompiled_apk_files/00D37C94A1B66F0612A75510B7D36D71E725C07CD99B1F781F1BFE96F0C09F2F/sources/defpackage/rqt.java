package defpackage;

import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: rqt  reason: default package */
/* loaded from: classes4.dex */
public final class rqt {
    public static rjm a;

    public static int a(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        Set<String> keySet = bundle.keySet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : keySet) {
            linkedHashSet.add(bundle.get(str));
        }
        return Arrays.hashCode(new Object[]{keySet, linkedHashSet});
    }

    public static boolean b(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null) != (bundle2 == null) || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!(obj2 instanceof Bundle) || !b((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                    return false;
                }
                for (int i = 0; i < length; i++) {
                    if (!tnk.j(Array.get(obj, i), Array.get(obj2, i))) {
                        return false;
                    }
                }
                continue;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static final ExecutorService d(ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
