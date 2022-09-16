package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.layout.ExtensionWindowBackend;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExtensionWindowBackend implements WindowBackend {
    private static final String TAG = "WindowServer";
    private static volatile ExtensionWindowBackend globalInstance;
    private ExtensionInterfaceCompat windowExtension;
    private final CopyOnWriteArrayList windowLayoutChangeCallbacks;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(azsr azsrVar) {
            this();
        }

        public final ExtensionWindowBackend getInstance(Context context) {
            context.getClass();
            if (ExtensionWindowBackend.globalInstance == null) {
                ReentrantLock reentrantLock = ExtensionWindowBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (ExtensionWindowBackend.globalInstance == null) {
                        ExtensionWindowBackend.globalInstance = new ExtensionWindowBackend(ExtensionWindowBackend.Companion.initAndVerifyExtension(context));
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            ExtensionWindowBackend extensionWindowBackend = ExtensionWindowBackend.globalInstance;
            extensionWindowBackend.getClass();
            return extensionWindowBackend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r1.validateExtensionInterface() == false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.window.layout.ExtensionInterfaceCompat initAndVerifyExtension(android.content.Context r4) {
            /*
                r3 = this;
                r4.getClass()
                r0 = 0
                androidx.window.layout.ExtensionCompat$Companion r1 = androidx.window.layout.ExtensionCompat.Companion     // Catch: java.lang.Throwable -> L1b
                androidx.window.core.Version r1 = r1.getExtensionVersion()     // Catch: java.lang.Throwable -> L1b
                boolean r1 = r3.isExtensionVersionSupported(r1)     // Catch: java.lang.Throwable -> L1b
                if (r1 == 0) goto L1b
                androidx.window.layout.ExtensionCompat r1 = new androidx.window.layout.ExtensionCompat     // Catch: java.lang.Throwable -> L1b
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L1b
                boolean r2 = r1.validateExtensionInterface()     // Catch: java.lang.Throwable -> L1b
                if (r2 != 0) goto L1c
            L1b:
                r1 = r0
            L1c:
                if (r1 != 0) goto L36
                androidx.window.layout.SidecarCompat$Companion r2 = androidx.window.layout.SidecarCompat.Companion     // Catch: java.lang.Throwable -> L37
                androidx.window.core.Version r2 = r2.getSidecarVersion()     // Catch: java.lang.Throwable -> L37
                boolean r2 = r3.isExtensionVersionSupported(r2)     // Catch: java.lang.Throwable -> L37
                if (r2 == 0) goto L36
                androidx.window.layout.SidecarCompat r1 = new androidx.window.layout.SidecarCompat     // Catch: java.lang.Throwable -> L37
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L37
                boolean r4 = r1.validateExtensionInterface()     // Catch: java.lang.Throwable -> L37
                if (r4 != 0) goto L36
                return r0
            L36:
                r0 = r1
            L37:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.ExtensionWindowBackend.Companion.initAndVerifyExtension(android.content.Context):androidx.window.layout.ExtensionInterfaceCompat");
        }

        public final boolean isExtensionVersionSupported(Version version) {
            return (version == null || version.getMajor() == 1 || Version.CURRENT.getMajor() < version.getMajor()) ? false : true;
        }

        public final void resetInstance() {
            ExtensionWindowBackend.globalInstance = null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        final /* synthetic */ ExtensionWindowBackend this$0;

        public ExtensionListenerImpl(ExtensionWindowBackend extensionWindowBackend) {
            extensionWindowBackend.getClass();
            this.this$0 = extensionWindowBackend;
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo) {
            activity.getClass();
            windowLayoutInfo.getClass();
            Iterator it = this.this$0.getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = (WindowLayoutChangeCallbackWrapper) it.next();
                if (azst.c(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
                }
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class WindowLayoutChangeCallbackWrapper {
        private final Activity activity;
        private final ji callback;
        private final Executor executor;
        private WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(Activity activity, Executor executor, ji jiVar) {
            activity.getClass();
            executor.getClass();
            jiVar.getClass();
            this.activity = activity;
            this.executor = executor;
            this.callback = jiVar;
        }

        public final void accept(final WindowLayoutInfo windowLayoutInfo) {
            windowLayoutInfo.getClass();
            this.lastInfo = windowLayoutInfo;
            this.executor.execute(new Runnable() { // from class: androidx.window.layout.ExtensionWindowBackend$WindowLayoutChangeCallbackWrapper$accept$1
                @Override // java.lang.Runnable
                public final void run() {
                    ExtensionWindowBackend.WindowLayoutChangeCallbackWrapper.this.getCallback().accept(windowLayoutInfo);
                }
            });
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final ji getCallback() {
            return this.callback;
        }

        public final WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }
    }

    public ExtensionWindowBackend(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        if (extensionInterfaceCompat != null) {
            extensionInterfaceCompat.setExtensionCallback(new ExtensionListenerImpl(this));
        }
        this.windowLayoutChangeCallbacks = new CopyOnWriteArrayList();
    }

    private final void callbackRemovedForActivity(Activity activity) {
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : copyOnWriteArrayList) {
                if (azst.c(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    return;
                }
            }
        }
        ExtensionInterfaceCompat extensionInterfaceCompat = this.windowExtension;
        if (extensionInterfaceCompat == null) {
            return;
        }
        extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
    }

    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }

    private final boolean isActivityRegistered(Activity activity) {
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : copyOnWriteArrayList) {
                if (azst.c(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    public final CopyOnWriteArrayList getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(Activity activity, Executor executor, ji jiVar) {
        WindowLayoutInfo windowLayoutInfo;
        Object obj;
        activity.getClass();
        executor.getClass();
        jiVar.getClass();
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            ExtensionInterfaceCompat windowExtension = getWindowExtension();
            if (windowExtension == null) {
                jiVar.accept(new WindowLayoutInfo(azqp.a));
                return;
            }
            boolean isActivityRegistered = isActivityRegistered(activity);
            WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, executor, jiVar);
            getWindowLayoutChangeCallbacks().add(windowLayoutChangeCallbackWrapper);
            if (!isActivityRegistered) {
                windowExtension.onWindowLayoutChangeListenerAdded(activity);
            } else {
                Iterator it = getWindowLayoutChangeCallbacks().iterator();
                while (true) {
                    windowLayoutInfo = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (azst.c(activity, ((WindowLayoutChangeCallbackWrapper) obj).getActivity())) {
                        break;
                    }
                }
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) obj;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    windowLayoutInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (windowLayoutInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setWindowExtension(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(ji jiVar) {
        jiVar.getClass();
        synchronized (globalLock) {
            if (getWindowExtension() == null) {
                return;
            }
            ArrayList<WindowLayoutChangeCallbackWrapper> arrayList = new ArrayList();
            Iterator it = getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = (WindowLayoutChangeCallbackWrapper) it.next();
                if (windowLayoutChangeCallbackWrapper.getCallback() == jiVar) {
                    windowLayoutChangeCallbackWrapper.getClass();
                    arrayList.add(windowLayoutChangeCallbackWrapper);
                }
            }
            getWindowLayoutChangeCallbacks().removeAll(arrayList);
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 : arrayList) {
                callbackRemovedForActivity(windowLayoutChangeCallbackWrapper2.getActivity());
            }
        }
    }
}
