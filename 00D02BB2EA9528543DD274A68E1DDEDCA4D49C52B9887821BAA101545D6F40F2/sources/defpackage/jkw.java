package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jkw  reason: default package */
/* loaded from: classes7.dex */
public final class jkw extends AppCompatTextView {
    @dzsi
    private CharSequence b;

    public jkw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.setText(this.b);
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || length() == 0 || getMaxLines() <= 0 || TextUtils.isEmpty(this.b) || layout.getLineCount() <= getMaxLines()) {
            return;
        }
        String string = getContext().getString(R.string.ELLIPSIS);
        CharSequence[] charSequenceArr = new CharSequence[2];
        CharSequence charSequence = this.b;
        Layout layout2 = getLayout();
        int maxLines = getMaxLines() - 1;
        int lineVisibleEnd = layout2.getLineVisibleEnd(maxLines);
        if (layout2.getWidth() < layout2.getLineMax(maxLines) + layout2.getPaint().measureText(string) && (i3 = lineVisibleEnd + 1) < this.b.length()) {
            lineVisibleEnd = i3;
        }
        int i4 = lineVisibleEnd;
        while (true) {
            if (i4 < 0) {
                break;
            } else if (Character.isSpaceChar(this.b.charAt(i4))) {
                lineVisibleEnd = i4;
                break;
            } else {
                i4--;
            }
        }
        charSequenceArr[0] = charSequence.subSequence(0, lineVisibleEnd);
        charSequenceArr[1] = string;
        super.setText(TextUtils.concat(charSequenceArr));
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (truncateAt.equals(TextUtils.TruncateAt.END)) {
            return;
        }
        throw new UnsupportedOperationException("This class does not support ellipsize modes other than TruncateAt.END.");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.b = charSequence;
        super.setText(charSequence, bufferType);
    }
}
