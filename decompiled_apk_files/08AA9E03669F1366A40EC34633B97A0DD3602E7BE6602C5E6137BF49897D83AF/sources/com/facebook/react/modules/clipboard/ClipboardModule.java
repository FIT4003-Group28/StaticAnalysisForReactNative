package com.facebook.react.modules.clipboard;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.al;
/* loaded from: classes.dex */
public class ClipboardModule extends ContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Clipboard";
    }

    public ClipboardModule(Context context) {
        super(context);
    }

    private ClipboardManager getClipboardService() {
        Context context = getContext();
        getContext();
        return (ClipboardManager) context.getSystemService("clipboard");
    }

    @al
    public void getString(af afVar) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (primaryClip == null) {
                afVar.a("");
            } else if (primaryClip.getItemCount() >= 1) {
                ClipData.Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
                afVar.a((Object) ("" + ((Object) itemAt.getText())));
            } else {
                afVar.a("");
            }
        } catch (Exception e) {
            afVar.a((Throwable) e);
        }
    }

    @al
    @SuppressLint({"DeprecatedMethod"})
    public void setString(String str) {
        if (Build.VERSION.SDK_INT >= 11) {
            getClipboardService().setPrimaryClip(ClipData.newPlainText(null, str));
            return;
        }
        getClipboardService().setText(str);
    }
}
