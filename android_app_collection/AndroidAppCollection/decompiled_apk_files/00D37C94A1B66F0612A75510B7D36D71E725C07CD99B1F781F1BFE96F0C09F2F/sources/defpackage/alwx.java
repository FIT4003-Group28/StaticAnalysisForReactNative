package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: alwx  reason: default package */
/* loaded from: classes.dex */
public final class alwx extends ClickableSpan {
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        alwv alwvVar;
        if (view instanceof alww) {
            ((alww) view).a();
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof alwv)) {
                if (!(context instanceof ContextWrapper)) {
                    alwvVar = null;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                alwvVar = (alwv) context;
                break;
            }
        }
        if (alwvVar == null) {
            Log.w("LinkSpan", "Dropping click event. No listener attached.");
        } else {
            alwvVar.a();
            view.cancelPendingInputEvents();
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (!(text instanceof Spannable)) {
                return;
            }
            Selection.setSelection((Spannable) text, 0);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
