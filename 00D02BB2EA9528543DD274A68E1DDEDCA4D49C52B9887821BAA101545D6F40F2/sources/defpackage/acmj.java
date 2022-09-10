package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;
/* compiled from: PG */
/* renamed from: acmj  reason: default package */
/* loaded from: classes2.dex */
public final class acmj extends ams {
    private final TextView f;
    private final Rect g;

    public acmj(TextView textView) {
        super(textView);
        this.g = new Rect();
        this.f = textView;
    }

    private final ClickableSpan B(int i) {
        CharSequence text = this.f.getText();
        if (text instanceof Spanned) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length != 1) {
                return null;
            }
            return clickableSpanArr[0];
        }
        return null;
    }

    private final CharSequence C(ClickableSpan clickableSpan) {
        CharSequence text = this.f.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
        }
        return text;
    }

    private final void D(ClickableSpan clickableSpan, Rect rect) {
        CharSequence text = this.f.getText();
        rect.setEmpty();
        Layout layout = this.f.getLayout();
        if (!(text instanceof Spanned) || layout == null || clickableSpan == null) {
            return;
        }
        Spanned spanned = (Spanned) text;
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
        float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineForOffset2 = layout.getLineForOffset(spanEnd);
        layout.getLineBounds(lineForOffset, rect);
        rect.left = (int) primaryHorizontal;
        if (lineForOffset2 == lineForOffset) {
            rect.right = (int) primaryHorizontal2;
        }
        rect.offset(this.f.getTotalPaddingLeft(), this.f.getTotalPaddingTop());
    }

    @Override // defpackage.ams
    protected final int u(float f, float f2) {
        CharSequence text = this.f.getText();
        Layout layout = this.f.getLayout();
        if (!(text instanceof Spanned) || layout == null) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        TextView textView = this.f;
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) (Math.min((textView.getHeight() - textView.getTotalPaddingBottom()) - 1, Math.max(0.0f, f2 - textView.getTotalPaddingTop())) + textView.getScrollY())), Math.min((textView.getWidth() - textView.getTotalPaddingRight()) - 1, Math.max(0.0f, f - textView.getTotalPaddingLeft())) + textView.getScrollX());
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length != 1) {
            return Integer.MIN_VALUE;
        }
        return spanned.getSpanStart(clickableSpanArr[0]);
    }

    @Override // defpackage.ams
    protected final void v(List<Integer> list) {
        CharSequence text = this.f.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.ams
    protected final void w(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan B = B(i);
        if (B != null) {
            accessibilityEvent.setContentDescription(C(B));
        } else {
            accessibilityEvent.setContentDescription(this.f.getText());
        }
    }

    @Override // defpackage.ams
    protected final void x(int i, pc pcVar) {
        ClickableSpan B = B(i);
        if (B != null) {
            pcVar.G(C(B));
        } else {
            pcVar.G(this.f.getText());
        }
        pcVar.q(true);
        pcVar.t(true);
        D(B, this.g);
        if (!this.g.isEmpty()) {
            Rect rect = this.g;
            D(B, rect);
            pcVar.k(rect);
        } else {
            this.g.set(0, 0, 1, 1);
            pcVar.k(this.g);
        }
        pcVar.f(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ams
    public final boolean z(int i, int i2) {
        ClickableSpan B;
        if (i2 != 16 || (B = B(i)) == null) {
            return false;
        }
        B.onClick(this.f);
        return true;
    }
}
