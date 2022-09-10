package com.google.android.libraries.messaging.lighter.ui.composebox;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.material.textfield.TextInputEditText;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LighterEditText extends TextInputEditText {
    private static final String[] a = {"image/*"};

    public LighterEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.textfield.TextInputEditText, defpackage.xj, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] stringArray;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        String[] strArr = a;
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        }
        cuxh cuxhVar = new cuxh(this);
        if (onCreateInputConnection != null) {
            if (editorInfo != null) {
                if (Build.VERSION.SDK_INT >= 25) {
                    return new ame(onCreateInputConnection, cuxhVar);
                }
                if (Build.VERSION.SDK_INT >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray == null) {
                        stringArray = amd.a;
                    }
                } else if (editorInfo.extras == null) {
                    stringArray = amd.a;
                } else {
                    String[] stringArray2 = editorInfo.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                    stringArray = stringArray2 == null ? editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES") : stringArray2;
                    if (stringArray == null) {
                        stringArray = amd.a;
                    }
                }
                return stringArray.length == 0 ? onCreateInputConnection : new amf(onCreateInputConnection, cuxhVar);
            }
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        throw new IllegalArgumentException("inputConnection must be non-null");
    }

    @Override // defpackage.xj, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        if (i == 16908322) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getDescription().hasMimeType("text/html")) {
                return true;
            }
            if (primaryClip.getItemCount() > 0 && primaryClip.getItemAt(0).getUri() != null) {
                return true;
            }
            i = 16908322;
        }
        return super.onTextContextMenuItem(i);
    }
}
