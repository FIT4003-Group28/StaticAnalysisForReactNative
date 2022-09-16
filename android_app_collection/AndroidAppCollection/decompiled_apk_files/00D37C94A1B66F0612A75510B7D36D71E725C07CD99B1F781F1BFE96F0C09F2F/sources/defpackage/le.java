package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: le  reason: default package */
/* loaded from: classes3.dex */
public final class le {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static void c(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof aaw) {
                editorInfo.hintText = ((aaw) parent).a();
                return;
            }
        }
    }

    public static void d(View view, bll bllVar) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, bllVar);
    }

    public static StringBuilder e() {
        return new StringBuilder();
    }

    public static void f(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }
}
