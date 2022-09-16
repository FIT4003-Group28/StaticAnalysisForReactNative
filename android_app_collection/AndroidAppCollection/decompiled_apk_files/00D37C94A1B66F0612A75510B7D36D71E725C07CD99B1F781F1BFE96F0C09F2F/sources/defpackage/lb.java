package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.view.PointerIcon;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: lb  reason: default package */
/* loaded from: classes3.dex */
public final class lb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    public static final jw d(View view, jw jwVar) {
        CharSequence coerceToStyledText;
        if (jwVar.a.b() != 2) {
            ClipData c = jwVar.a.c();
            int a = jwVar.a.a();
            TextView textView = (TextView) view;
            Editable editable = (Editable) textView.getText();
            Context context = textView.getContext();
            boolean z = false;
            for (int i = 0; i < c.getItemCount(); i++) {
                ClipData.Item itemAt = c.getItemAt(i);
                if ((a & 1) != 0) {
                    coerceToStyledText = itemAt.coerceToText(context);
                    if (coerceToStyledText instanceof Spanned) {
                        coerceToStyledText = coerceToStyledText.toString();
                    }
                } else {
                    coerceToStyledText = itemAt.coerceToStyledText(context);
                }
                if (coerceToStyledText != null) {
                    if (!z) {
                        int selectionStart = Selection.getSelectionStart(editable);
                        int selectionEnd = Selection.getSelectionEnd(editable);
                        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                        Selection.setSelection(editable, max2);
                        editable.replace(max, max2, coerceToStyledText);
                    } else {
                        editable.insert(Selection.getSelectionEnd(editable), "\n");
                        editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                    }
                    z = true;
                }
            }
            return null;
        }
        return jwVar;
    }
}
