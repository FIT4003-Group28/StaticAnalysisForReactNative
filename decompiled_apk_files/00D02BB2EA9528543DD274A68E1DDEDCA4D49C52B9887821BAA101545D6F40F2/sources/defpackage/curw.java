package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: curw  reason: default package */
/* loaded from: classes5.dex */
public final class curw extends FrameLayout {
    private final TextView a;
    private final GradientDrawable b;

    public curw(Context context) {
        this(context, null);
    }

    public void setBadgeBackgroundColor(int i) {
        this.b.setColor(i);
        this.a.setBackground(this.b);
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    public curw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public curw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.status_badge_layout, this);
        Resources resources = getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.badge_padding_vertical);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.badge_padding_horizontal);
        TextView textView = (TextView) findViewById(R.id.status_badge_text);
        this.a = textView;
        textView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        textView.setTextColor(-1);
        textView.setTextSize(0, resources.getDimension(R.dimen.badge_text_size));
        qf.a(textView, R.style.StatusBadgeTextAppearance);
        Context context2 = getContext();
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.badge_letter_spacing);
        textView.setLetterSpacing((dimensionPixelSize3 / context2.getResources().getDisplayMetrics().density) / (resources.getDimensionPixelSize(R.dimen.badge_text_size) / getContext().getResources().getDisplayMetrics().scaledDensity));
        textView.setFocusable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(resources.getDimensionPixelSize(R.dimen.badge_radius));
    }
}
