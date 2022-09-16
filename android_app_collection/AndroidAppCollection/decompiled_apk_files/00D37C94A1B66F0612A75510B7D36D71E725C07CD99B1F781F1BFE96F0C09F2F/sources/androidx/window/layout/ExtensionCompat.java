package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.window.core.Version;
import androidx.window.extensions.ExtensionInterface;
import androidx.window.extensions.ExtensionProvider;
import androidx.window.layout.ExtensionInterfaceCompat;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExtensionCompat implements ExtensionInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    public static final boolean DEBUG = false;
    private static final String TAG = "ExtensionVersionCompat";
    private final ExtensionAdapter adapter;
    private final ExtensionInterface windowExtension;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(azsr azsrVar) {
            this();
        }

        public final Version getExtensionVersion() {
            try {
                String apiVersion = ExtensionProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.Companion.parse(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtensionCompat(Context context) {
        this(ExtensionProvider.getExtensionImpl(context), new ExtensionAdapter(WindowMetricsCalculatorCompat.INSTANCE));
        context.getClass();
        if (this.windowExtension != null) {
            return;
        }
        throw new IllegalArgumentException("Extension provider returned null".toString());
    }

    public ExtensionCompat(ExtensionInterface extensionInterface, ExtensionAdapter extensionAdapter) {
        extensionAdapter.getClass();
        this.windowExtension = extensionInterface;
        this.adapter = extensionAdapter;
    }

    public final ExtensionInterface getWindowExtension() {
        return this.windowExtension;
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(Activity activity) {
        activity.getClass();
        ExtensionInterface extensionInterface = this.windowExtension;
        if (extensionInterface == null) {
            return;
        }
        extensionInterface.onWindowLayoutChangeListenerAdded(activity);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(Activity activity) {
        activity.getClass();
        ExtensionInterface extensionInterface = this.windowExtension;
        if (extensionInterface == null) {
            return;
        }
        extensionInterface.onWindowLayoutChangeListenerRemoved(activity);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
        extensionCallbackInterface.getClass();
        ExtensionTranslatingCallback extensionTranslatingCallback = new ExtensionTranslatingCallback(extensionCallbackInterface, this.adapter);
        ExtensionInterface extensionInterface = this.windowExtension;
        if (extensionInterface == null) {
            return;
        }
        extensionInterface.setExtensionCallback(extensionTranslatingCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:25:0x004d, B:27:0x0055, B:37:0x0075, B:39:0x007d, B:40:0x00a2, B:41:0x00ad, B:36:0x0071, B:30:0x005b, B:33:0x0062, B:42:0x00ae, B:43:0x00b9, B:24:0x0049, B:18:0x0032, B:21:0x0039, B:44:0x00ba, B:45:0x00c5, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:25:0x004d, B:27:0x0055, B:37:0x0075, B:39:0x007d, B:40:0x00a2, B:41:0x00ad, B:36:0x0071, B:30:0x005b, B:33:0x0062, B:42:0x00ae, B:43:0x00b9, B:24:0x0049, B:18:0x0032, B:21:0x0039, B:44:0x00ba, B:45:0x00c5, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:25:0x004d, B:27:0x0055, B:37:0x0075, B:39:0x007d, B:40:0x00a2, B:41:0x00ad, B:36:0x0071, B:30:0x005b, B:33:0x0062, B:42:0x00ae, B:43:0x00b9, B:24:0x0049, B:18:0x0032, B:21:0x0039, B:44:0x00ba, B:45:0x00c5, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:25:0x004d, B:27:0x0055, B:37:0x0075, B:39:0x007d, B:40:0x00a2, B:41:0x00ad, B:36:0x0071, B:30:0x005b, B:33:0x0062, B:42:0x00ae, B:43:0x00b9, B:24:0x0049, B:18:0x0032, B:21:0x0039, B:44:0x00ba, B:45:0x00c5, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:25:0x004d, B:27:0x0055, B:37:0x0075, B:39:0x007d, B:40:0x00a2, B:41:0x00ad, B:36:0x0071, B:30:0x005b, B:33:0x0062, B:42:0x00ae, B:43:0x00b9, B:24:0x0049, B:18:0x0032, B:21:0x0039, B:44:0x00ba, B:45:0x00c5, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:25:0x004d, B:27:0x0055, B:37:0x0075, B:39:0x007d, B:40:0x00a2, B:41:0x00ad, B:36:0x0071, B:30:0x005b, B:33:0x0062, B:42:0x00ae, B:43:0x00b9, B:24:0x0049, B:18:0x0032, B:21:0x0039, B:44:0x00ba, B:45:0x00c5, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:25:0x004d, B:27:0x0055, B:37:0x0075, B:39:0x007d, B:40:0x00a2, B:41:0x00ad, B:36:0x0071, B:30:0x005b, B:33:0x0062, B:42:0x00ae, B:43:0x00b9, B:24:0x0049, B:18:0x0032, B:21:0x0039, B:44:0x00ba, B:45:0x00c5, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:25:0x004d, B:27:0x0055, B:37:0x0075, B:39:0x007d, B:40:0x00a2, B:41:0x00ad, B:36:0x0071, B:30:0x005b, B:33:0x0062, B:42:0x00ae, B:43:0x00b9, B:24:0x0049, B:18:0x0032, B:21:0x0039, B:44:0x00ba, B:45:0x00c5, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:48:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0002, B:13:0x0024, B:15:0x002c, B:25:0x004d, B:27:0x0055, B:37:0x0075, B:39:0x007d, B:40:0x00a2, B:41:0x00ad, B:36:0x0071, B:30:0x005b, B:33:0x0062, B:42:0x00ae, B:43:0x00b9, B:24:0x0049, B:18:0x0032, B:21:0x0039, B:44:0x00ba, B:45:0x00c5, B:12:0x0020, B:6:0x0009, B:9:0x0010), top: B:48:0x0002 }] */
    @Override // androidx.window.layout.ExtensionInterfaceCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean validateExtensionInterface() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            androidx.window.extensions.ExtensionInterface r2 = r6.windowExtension     // Catch: java.lang.Throwable -> Lc6
            r3 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r3
            goto L1c
        L9:
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> Lc6
            if (r2 != 0) goto L10
            goto L7
        L10:
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class<androidx.window.extensions.ExtensionInterface$ExtensionCallback> r5 = androidx.window.extensions.ExtensionInterface.ExtensionCallback.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = "setExtensionCallback"
            java.lang.reflect.Method r2 = r2.getMethod(r5, r4)     // Catch: java.lang.Throwable -> Lc6
        L1c:
            if (r2 != 0) goto L20
            r2 = r3
            goto L24
        L20:
            java.lang.Class r2 = r2.getReturnType()     // Catch: java.lang.Throwable -> Lc6
        L24:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> Lc6
            boolean r4 = defpackage.azst.c(r2, r4)     // Catch: java.lang.Throwable -> Lc6
            if (r4 == 0) goto Lba
            androidx.window.extensions.ExtensionInterface r2 = r6.windowExtension     // Catch: java.lang.Throwable -> Lc6
            if (r2 != 0) goto L32
        L30:
            r2 = r3
            goto L45
        L32:
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> Lc6
            if (r2 != 0) goto L39
            goto L30
        L39:
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = "onWindowLayoutChangeListenerAdded"
            java.lang.reflect.Method r2 = r2.getMethod(r5, r4)     // Catch: java.lang.Throwable -> Lc6
        L45:
            if (r2 != 0) goto L49
            r2 = r3
            goto L4d
        L49:
            java.lang.Class r2 = r2.getReturnType()     // Catch: java.lang.Throwable -> Lc6
        L4d:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> Lc6
            boolean r4 = defpackage.azst.c(r2, r4)     // Catch: java.lang.Throwable -> Lc6
            if (r4 == 0) goto Lae
            androidx.window.extensions.ExtensionInterface r2 = r6.windowExtension     // Catch: java.lang.Throwable -> Lc6
            if (r2 != 0) goto L5b
        L59:
            r2 = r3
            goto L6e
        L5b:
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> Lc6
            if (r2 != 0) goto L62
            goto L59
        L62:
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r5 = "onWindowLayoutChangeListenerRemoved"
            java.lang.reflect.Method r2 = r2.getMethod(r5, r4)     // Catch: java.lang.Throwable -> Lc6
        L6e:
            if (r2 != 0) goto L71
            goto L75
        L71:
            java.lang.Class r3 = r2.getReturnType()     // Catch: java.lang.Throwable -> Lc6
        L75:
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> Lc6
            boolean r2 = defpackage.azst.c(r3, r2)     // Catch: java.lang.Throwable -> Lc6
            if (r2 == 0) goto La2
            androidx.window.extensions.ExtensionFoldingFeature r2 = new androidx.window.extensions.ExtensionFoldingFeature     // Catch: java.lang.Throwable -> Lc6
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch: java.lang.Throwable -> Lc6
            r4 = 100
            r3.<init>(r1, r1, r4, r1)     // Catch: java.lang.Throwable -> Lc6
            r2.<init>(r3, r0, r0)     // Catch: java.lang.Throwable -> Lc6
            android.graphics.Rect r2 = r2.getBounds()     // Catch: java.lang.Throwable -> Lc6
            r2.getClass()     // Catch: java.lang.Throwable -> Lc6
            androidx.window.extensions.ExtensionWindowLayoutInfo r2 = new androidx.window.extensions.ExtensionWindowLayoutInfo     // Catch: java.lang.Throwable -> Lc6
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc6
            r3.<init>()     // Catch: java.lang.Throwable -> Lc6
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lc6
            java.util.List r2 = r2.getDisplayFeatures()     // Catch: java.lang.Throwable -> Lc6
            r2.getClass()     // Catch: java.lang.Throwable -> Lc6
            goto Lc7
        La2:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r2 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r2 = defpackage.azst.a(r2, r3)     // Catch: java.lang.Throwable -> Lc6
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc6
            throw r0     // Catch: java.lang.Throwable -> Lc6
        Lae:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r2 = defpackage.azst.a(r3, r2)     // Catch: java.lang.Throwable -> Lc6
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc6
            throw r0     // Catch: java.lang.Throwable -> Lc6
        Lba:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = "Illegal return type for 'setExtensionCallback': "
            java.lang.String r2 = defpackage.azst.a(r3, r2)     // Catch: java.lang.Throwable -> Lc6
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc6
            throw r0     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r0 = 0
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.ExtensionCompat.validateExtensionInterface():boolean");
    }
}
