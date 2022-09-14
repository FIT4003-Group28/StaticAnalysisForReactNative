package com.facebook.react.bridge;

import c.d.l.a.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@a
@Deprecated
/* loaded from: classes.dex */
public class ReactSoftException {
    private static final List<ReactSoftExceptionListener> sListeners = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface ReactSoftExceptionListener {
        void logSoftException(String str, Throwable th);
    }

    @a
    public static void addListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        if (!sListeners.contains(reactSoftExceptionListener)) {
            sListeners.add(reactSoftExceptionListener);
        }
    }

    @a
    public static void clearListeners() {
        sListeners.clear();
    }

    @a
    public static void logSoftException(String str, Throwable th) {
        if (sListeners.size() <= 0) {
            c.d.d.e.a.b(str, "Unhandled SoftException", th);
            return;
        }
        for (ReactSoftExceptionListener reactSoftExceptionListener : sListeners) {
            reactSoftExceptionListener.logSoftException(str, th);
        }
    }

    @a
    public static void removeListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        sListeners.remove(reactSoftExceptionListener);
    }
}
