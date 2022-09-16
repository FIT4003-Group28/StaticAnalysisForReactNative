package androidx.window.layout;

import android.app.Activity;
import androidx.window.extensions.ExtensionInterface;
import androidx.window.extensions.ExtensionWindowLayoutInfo;
import androidx.window.layout.ExtensionInterfaceCompat;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExtensionTranslatingCallback implements ExtensionInterface.ExtensionCallback {
    private final ExtensionAdapter adapter;
    private final ExtensionInterfaceCompat.ExtensionCallbackInterface callback;

    public ExtensionTranslatingCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface, ExtensionAdapter extensionAdapter) {
        extensionCallbackInterface.getClass();
        extensionAdapter.getClass();
        this.callback = extensionCallbackInterface;
        this.adapter = extensionAdapter;
    }

    public void onWindowLayoutChanged(Activity activity, ExtensionWindowLayoutInfo extensionWindowLayoutInfo) {
        activity.getClass();
        extensionWindowLayoutInfo.getClass();
        this.callback.onWindowLayoutChanged(activity, this.adapter.translate(activity, extensionWindowLayoutInfo));
    }
}
