package defpackage;

import android.os.Looper;
import android.util.Log;
/* compiled from: PG */
/* renamed from: rah  reason: default package */
/* loaded from: classes4.dex */
public final class rah {
    private static volatile ClassLoader a;
    private static volatile Thread b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (rah.class) {
            if (a == null) {
                a = b();
            }
            classLoader = a;
        }
        return classLoader;
    }

    private static synchronized ClassLoader b() {
        synchronized (rah.class) {
            ClassLoader classLoader = null;
            if (b == null) {
                b = c();
                if (b == null) {
                    return null;
                }
            }
            synchronized (b) {
                try {
                    classLoader = b.getContextClassLoader();
                } catch (SecurityException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread c() {
        SecurityException e;
        rag ragVar;
        rag ragVar2;
        ThreadGroup threadGroup;
        synchronized (rah.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            ragVar2 = null;
                            break;
                        }
                        ragVar2 = threadArr[i];
                        if ("GmsDynamite".equals(ragVar2.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    ragVar = null;
                }
                if (ragVar2 == null) {
                    try {
                        ragVar = new rag(threadGroup);
                        try {
                            ragVar.setContextClassLoader(null);
                            ragVar.start();
                        } catch (SecurityException e3) {
                            e = e3;
                            String valueOf = String.valueOf(e.getMessage());
                            Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                            ragVar2 = ragVar;
                            return ragVar2;
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        ragVar = ragVar2;
                    }
                    ragVar2 = ragVar;
                }
            }
            return ragVar2;
        }
    }
}
