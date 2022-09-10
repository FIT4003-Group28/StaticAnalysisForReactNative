package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzzb  reason: default package */
/* loaded from: classes4.dex */
public final class bzzb extends ConstraintLayout {
    private CharSequence c;
    private int d;
    private final TextView e;
    private final TextView f;
    private final TextView g;

    public bzzb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = "";
        this.d = Integer.MAX_VALUE;
        LayoutInflater.from(context).inflate(R.layout.custom_ellipsis, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.fixedText);
        this.e = textView;
        TextView textView2 = (TextView) findViewById(R.id.truncatedText);
        this.f = textView2;
        this.g = (TextView) findViewById(R.id.endLabel);
        textView.setMaxLines(this.d - 1);
        c(textView, getContext());
        c(textView2, getContext());
    }

    private static void c(TextView textView, Context context) {
        textView.setTextColor(ibm.p().c(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.constraint.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.e.measure(i, i2);
        int i3 = 8;
        if (this.e.getLineCount() > this.d - 1) {
            int lineEnd = this.e.getLayout().getLineEnd(this.d - 2);
            dbra dbraVar = dbra.b;
            CharSequence charSequence = this.c;
            String s = dbraVar.s(charSequence.subSequence(lineEnd, charSequence.length()));
            int length = s.length();
            this.f.setText(s);
            this.f.setVisibility(length != 0 ? 0 : 8);
            this.f.measure(i, i2);
            boolean z = length != 0 && this.f.getLayout().getEllipsisCount(0) > 0;
            TextView textView = this.g;
            if (true == z) {
                i3 = 0;
            }
            textView.setVisibility(i3);
        } else {
            this.f.setVisibility(8);
            this.g.setVisibility(8);
        }
        super.onMeasure(i, i2);
    }

    public void setEndLabel(@dzsi CharSequence charSequence) {
        TextView textView = this.g;
        if (charSequence == null) {
            charSequence = "";
        }
        textView.setText(charSequence);
    }

    public void setFullText(@dzsi CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.c = charSequence;
        this.e.setText(charSequence);
    }

    public void setMaxLines(int i) {
        dbsk.a(i >= 2);
        this.d = i;
        this.e.setMaxLines(i - 1);
    }
}
