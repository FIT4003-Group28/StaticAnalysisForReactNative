package com.baidu.platform.comjni.engine;

import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2137a = "a";

    /* renamed from: b  reason: collision with root package name */
    private static SparseArray<List<Handler>> f2138b = new SparseArray<>();

    public static void a() {
        synchronized (f2138b) {
            int size = f2138b.size();
            for (int i = 0; i < size; i++) {
                List<Handler> list = f2138b.get(f2138b.keyAt(i));
                if (list != null) {
                    list.clear();
                }
            }
            f2138b.clear();
        }
    }

    public static void a(int i, int i2, int i3, long j) {
        synchronized (f2138b) {
            List<Handler> list = f2138b.get(i);
            if (list != null && !list.isEmpty()) {
                for (Handler handler : list) {
                    Message.obtain(handler, i, i2, i3, Long.valueOf(j)).sendToTarget();
                }
            }
        }
    }

    public static void a(int i, Handler handler) {
        synchronized (f2138b) {
            try {
                if (handler == null) {
                    return;
                }
                List<Handler> list = f2138b.get(i);
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(handler);
                    f2138b.put(i, arrayList);
                } else if (!list.contains(handler)) {
                    list.add(handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(int i, Handler handler) {
        synchronized (f2138b) {
            if (handler != null) {
                try {
                    handler.removeCallbacksAndMessages(null);
                    List<Handler> list = f2138b.get(i);
                    if (list != null) {
                        list.remove(handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
