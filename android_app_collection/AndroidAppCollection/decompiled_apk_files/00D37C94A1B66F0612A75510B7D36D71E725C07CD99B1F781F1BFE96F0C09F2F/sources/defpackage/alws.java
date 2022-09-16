package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: alws  reason: default package */
/* loaded from: classes.dex */
public final class alws extends amh {
    private final Rect f;
    private final TextView g;

    public alws(TextView textView) {
        super(textView);
        this.f = new Rect();
        this.g = textView;
    }

    private final ClickableSpan w(int i) {
        CharSequence text = this.g.getText();
        if (text instanceof Spanned) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length != 1) {
                return null;
            }
            return clickableSpanArr[0];
        }
        return null;
    }

    private final CharSequence x(ClickableSpan clickableSpan) {
        CharSequence text = this.g.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
        }
        return text;
    }

    @Override // defpackage.amh
    protected final int k(float f, float f2) {
        CharSequence text = this.g.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            TextView textView = this.g;
            int i = -1;
            if (textView.getLayout() != null) {
                i = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((textView.getHeight() - textView.getTotalPaddingBottom()) - 1, Math.max(0.0f, f2 - textView.getTotalPaddingTop())) + textView.getScrollY())), Math.min((textView.getWidth() - textView.getTotalPaddingRight()) - 1, Math.max(0.0f, f - textView.getTotalPaddingLeft())) + textView.getScrollX());
            }
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(i, i, ClickableSpan.class);
            return clickableSpanArr.length == 1 ? spanned.getSpanStart(clickableSpanArr[0]) : CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    @Override // defpackage.amh
    protected final void m(List list) {
        CharSequence text = this.g.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.amh
    protected final void p(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan w = w(i);
        if (w != null) {
            accessibilityEvent.setContentDescription(x(w));
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        accessibilityEvent.setContentDescription(this.g.getText());
    }

    @Override // defpackage.amh
    protected final void q(int i, mh mhVar) {
        Layout layout;
        ClickableSpan w = w(i);
        if (w != null) {
            mhVar.v(x(w));
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("LinkSpan is null for offset: ");
            sb.append(i);
            Log.e("LinkAccessibilityHelper", sb.toString());
            mhVar.v(this.g.getText());
        }
        mhVar.y(true);
        mhVar.s(true);
        Rect rect = this.f;
        CharSequence text = this.g.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = this.g.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(w);
            int spanEnd = spanned.getSpanEnd(w);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 == lineForOffset) {
                rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
            } else if (layout.getParagraphDirection(lineForOffset) == -1) {
                rect.right = (int) primaryHorizontal;
            } else {
                rect.left = (int) primaryHorizontal;
            }
            rect.offset(this.g.getTotalPaddingLeft(), this.g.getTotalPaddingTop());
        }
        if (this.f.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("LinkSpan bounds is empty for: ");
            sb2.append(i);
            Log.e("LinkAccessibilityHelper", sb2.toString());
            this.f.set(0, 0, 1, 1);
        }
        mhVar.n(this.f);
        mhVar.h(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amh
    public final boolean u(int i, int i2) {
        if (i2 == 16) {
            ClickableSpan w = w(i);
            if (w != null) {
                w.onClick(this.g);
                return true;
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("LinkSpan is null for offset: ");
            sb.append(i);
            Log.e("LinkAccessibilityHelper", sb.toString());
            return false;
        }
        return false;
    }
}
