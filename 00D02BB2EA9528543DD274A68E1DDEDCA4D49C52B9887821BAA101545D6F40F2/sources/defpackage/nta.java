package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: nta  reason: default package */
/* loaded from: classes7.dex */
public final class nta extends cqro {
    private cqtv b;
    private dcfc<cqtv> c;
    private final dclu<cqtv> d;
    private float e;
    private float f;

    public nta(Context context) {
        this(context, null);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int compoundPaddingStart = (size - getCompoundPaddingStart()) - getCompoundPaddingEnd();
        cqtv cqtvVar = this.b;
        if (cqtvVar != null) {
            size2 = cqtvVar.e(getContext());
        }
        int compoundPaddingTop = (size2 - getCompoundPaddingTop()) - getCompoundPaddingBottom();
        CharSequence text = getText();
        if (!this.c.isEmpty() && text.length() != 0) {
            TextPaint textPaint = new TextPaint(getPaint());
            textPaint.setTypeface(getTypeface());
            int maxLines = getMaxLines();
            float textSize = getTextSize();
            Context context = getContext();
            dcpd<cqtv> it = this.c.iterator();
            float f = textSize;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                float a = it.next().a(context);
                if (a < 1.0f) {
                    break;
                }
                textPaint.setTextSize(a);
                StaticLayout staticLayout = new StaticLayout(text, textPaint, compoundPaddingStart, Layout.Alignment.ALIGN_NORMAL, this.e, this.f, true);
                if ((maxLines <= 0 || staticLayout.getLineCount() <= maxLines) && staticLayout.getHeight() <= compoundPaddingTop) {
                    f = a;
                    break;
                }
                f = a;
            }
            if (f != textSize) {
                super.setTextSize(0, f);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        requestLayout();
        invalidate();
    }

    public void setAvailableTextHeight(cqtv cqtvVar) {
        this.b = cqtvVar;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.e = f2;
        this.f = f;
    }

    public void setPreferredTextSizes(dcep<cqtv> dcepVar) {
        dbsk.s(dcepVar);
        boolean z = true;
        dbsk.l(!dcepVar.isEmpty());
        dcfc<cqtv> R = dcfc.R(this.d, dcepVar);
        float a = R.first().a(getContext());
        if (a < 1.0f) {
            z = false;
        }
        dbsk.l(z);
        this.c = R;
        super.setTextSize(0, a);
    }

    public nta(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = dcms.a;
        this.e = 1.0f;
        this.f = 0.0f;
        this.d = new nsz(context).c();
    }
}
