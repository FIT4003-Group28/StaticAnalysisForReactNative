package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;
/* compiled from: PG */
/* renamed from: dapg  reason: default package */
/* loaded from: classes5.dex */
final class dapg extends ams {
    private final Rect f;
    private final TextView g;

    public dapg(TextView textView) {
        super(textView);
        this.f = new Rect();
        this.g = textView;
    }

    private final ClickableSpan B(int i) {
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

    private final CharSequence C(ClickableSpan clickableSpan) {
        CharSequence text = this.g.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
        }
        return text;
    }

    @Override // defpackage.ams
    protected final int u(float f, float f2) {
        CharSequence text = this.g.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            TextView textView = this.g;
            int i = -1;
            if (textView.getLayout() != null) {
                i = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((textView.getHeight() - textView.getTotalPaddingBottom()) - 1, Math.max(0.0f, f2 - textView.getTotalPaddingTop())) + textView.getScrollY())), Math.min((textView.getWidth() - textView.getTotalPaddingRight()) - 1, Math.max(0.0f, f - textView.getTotalPaddingLeft())) + textView.getScrollX());
            }
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length != 1) {
                return Integer.MIN_VALUE;
            }
            return spanned.getSpanStart(clickableSpanArr[0]);
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.ams
    protected final void v(List<Integer> list) {
        CharSequence text = this.g.getText();
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
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        sb.toString();
        accessibilityEvent.setContentDescription(this.g.getText());
    }

    @Override // defpackage.ams
    protected final void x(int i, pc pcVar) {
        Layout layout;
        ClickableSpan B = B(i);
        if (B != null) {
            pcVar.G(C(B));
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("LinkSpan is null for offset: ");
            sb.append(i);
            sb.toString();
            pcVar.G(this.g.getText());
        }
        pcVar.q(true);
        pcVar.t(true);
        Rect rect = this.f;
        CharSequence text = this.g.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = this.g.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(B);
            int spanEnd = spanned.getSpanEnd(B);
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
            sb2.toString();
            this.f.set(0, 0, 1, 1);
        }
        pcVar.k(this.f);
        pcVar.f(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ams
    public final boolean z(int i, int i2) {
        if (i2 == 16) {
            ClickableSpan B = B(i);
            if (B != null) {
                B.onClick(this.g);
                return true;
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("LinkSpan is null for offset: ");
            sb.append(i);
            sb.toString();
            return false;
        }
        return false;
    }
}
