package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
/* compiled from: PG */
/* renamed from: xk  reason: default package */
/* loaded from: classes.dex */
public final class xk {
    public static void a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof afn) {
                editorInfo.hintText = ((afn) parent).a();
                return;
            }
        }
    }
}
