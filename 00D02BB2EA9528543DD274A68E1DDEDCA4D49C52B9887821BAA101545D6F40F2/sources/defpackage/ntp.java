package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;
import java.text.Bidi;
/* compiled from: PG */
/* renamed from: ntp  reason: default package */
/* loaded from: classes7.dex */
public final class ntp extends AppCompatTextView {
    public ntp(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        char[] charArray = getText().toString().toCharArray();
        boolean z = false;
        int i3 = 0;
        while (!z) {
            int length = charArray.length;
            if (i3 < length - 1) {
                z = Bidi.requiresBidi(charArray, i3, Math.min(length, i3 + 256));
                i3 += 255;
            } else {
                Layout layout = getLayout();
                if (layout == null) {
                    return;
                }
                int lineCount = layout.getLineCount();
                float f = 0.0f;
                for (int i4 = 0; i4 < lineCount; i4++) {
                    if (layout.getLineWidth(i4) > f) {
                        f = layout.getLineWidth(i4);
                    }
                }
                setMeasuredDimension(Math.min(((int) Math.ceil(f)) + getCompoundPaddingLeft() + getCompoundPaddingRight(), getMeasuredWidth()), getMeasuredHeight());
                return;
            }
        }
    }

    public ntp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
