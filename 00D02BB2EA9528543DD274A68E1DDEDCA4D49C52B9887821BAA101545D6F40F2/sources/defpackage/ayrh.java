package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayrh  reason: default package */
/* loaded from: classes3.dex */
public final class ayrh extends TextView {
    public boolean a;
    private final CharSequence b;
    private final CharSequence c;
    private Integer d;
    private CharSequence e;

    public ayrh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.b = b(context, R.string.LIST_DESCRIPTION_LABEL_COLLAPSED);
        this.c = b(context, R.string.LIST_DESCRIPTION_LABEL_EXPANDED);
    }

    private final CharSequence a(boolean z) {
        return TextUtils.concat(" ", z ? this.c : this.b);
    }

    private static CharSequence b(Context context, int i) {
        bvsv a = new bvsx(context.getResources()).a(context.getString(i));
        a.l(ibm.x().b(context));
        return a.c();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!hasOnClickListeners()) {
            setOnClickListener(new View.OnClickListener(this) { // from class: ayrg
                private final ayrh a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ayrh ayrhVar = this.a;
                    ayrhVar.a = !ayrhVar.a;
                    ayrhVar.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        Layout layout;
        if (this.e == null) {
            this.e = getText();
        }
        CharSequence charSequence = this.e;
        if (charSequence == null || charSequence.length() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        setText(TextUtils.concat(this.e, a(true)));
        if (this.d == null) {
            this.d = Integer.valueOf(getMaxLines());
        }
        int intValue = this.a ? Integer.MAX_VALUE : this.d.intValue();
        setMaxLines(intValue);
        super.onMeasure(i, i2);
        if (length() <= 0 || (layout = getLayout()) == null) {
            return;
        }
        if (layout.getLineCount() > intValue) {
            CharSequence charSequence2 = this.e;
            CharSequence a = a(this.a);
            dbsk.l(charSequence2.length() > 0);
            dbsk.l(layout.getLineCount() > intValue);
            float width = layout.getWidth();
            float measureText = width - layout.getPaint().measureText(a.toString());
            if (measureText > 0.0f || intValue <= 1) {
                width = measureText;
            } else {
                intValue--;
            }
            CharSequence[] charSequenceArr = new CharSequence[2];
            TextPaint paint = layout.getPaint();
            int i3 = intValue - 1;
            int lineStart = layout.getLineStart(i3);
            if (lineStart < charSequence2.length()) {
                int lineEnd = layout.getLineEnd(i3);
                charSequence2 = TextUtils.concat(charSequence2.subSequence(0, lineStart), TextUtils.ellipsize(TextUtils.concat(charSequence2.subSequence(lineStart, lineEnd < charSequence2.length() ? lineEnd - 1 : charSequence2.length()), "…"), paint, width, TextUtils.TruncateAt.END));
            }
            charSequenceArr[0] = charSequence2;
            charSequenceArr[1] = a;
            setText(TextUtils.concat(charSequenceArr));
            setClickable(true);
        } else if (layout.getLineCount() > this.d.intValue()) {
        } else {
            setText(this.e);
            setClickable(false);
        }
    }
}
