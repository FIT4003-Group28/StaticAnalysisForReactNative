package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Spanned;
import android.util.AttributeSet;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cqro  reason: default package */
/* loaded from: classes.dex */
public class cqro extends AppCompatTextView {
    public cqro(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        CharSequence text = getText();
        if (!(text instanceof Spanned) || ((Spanned) text).getSpans(0, text.length(), Object.class).length <= 0 || Arrays.equals(getPaint().drawableState, getDrawableState())) {
            return;
        }
        invalidate();
    }

    public cqro(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public cqro(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
