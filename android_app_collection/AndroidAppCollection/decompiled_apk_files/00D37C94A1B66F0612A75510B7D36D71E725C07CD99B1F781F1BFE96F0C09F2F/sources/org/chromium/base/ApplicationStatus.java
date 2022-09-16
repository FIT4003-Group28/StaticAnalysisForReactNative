package org.chromium.base;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class ApplicationStatus {
    public static babs a;
    public static bacf b;
    private static final Map c = DesugarCollections.synchronizedMap(new HashMap());

    private ApplicationStatus() {
    }

    public static void a(babs babsVar) {
        if (b == null) {
            b = new bacf();
        }
        b.d(babsVar);
    }

    public static int getStateForApplication() {
        synchronized (c) {
        }
        return 0;
    }

    public static boolean hasVisibleActivities() {
        getStateForApplication();
        return false;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        ThreadUtils.c(new ajsy(17));
    }
}
