package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: cvbz  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvbz extends LinearLayout {
    protected final TextView a;
    protected final TextView b;
    protected final RelativeLayout c;
    protected final MaterialButton d;
    protected final MaterialButton e;

    public cvbz(Context context) {
        this(context, null);
    }

    private final LinearLayout.LayoutParams a(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dialog_margin_horizontal);
        int i2 = i - (dimensionPixelSize + dimensionPixelSize);
        int a = cuwg.a(getContext(), 280.0f);
        int i3 = i2 > a ? a : i2;
        if (i2 > a) {
            dimensionPixelSize = (i - a) / 2;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, -2);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    protected abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11, -1);
        layoutParams.addRule(3, i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(6, this.d.getId());
        layoutParams2.addRule(0, this.d.getId());
        layoutParams.addRule(21, -1);
        layoutParams2.addRule(16, this.d.getId());
        this.c.addView(this.d, layoutParams);
        this.c.addView(this.e, layoutParams2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c.setLayoutParams(a(i));
        this.c.invalidate();
    }

    public cvbz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cvbz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClickable(true);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.c = relativeLayout;
        relativeLayout.setId(R.id.dialog_body);
        relativeLayout.setBackground(getContext().getDrawable(R.drawable.dialog_card));
        od.F(relativeLayout, getResources().getDimensionPixelSize(R.dimen.dialog_elevation));
        relativeLayout.setPadding(getResources().getDimensionPixelSize(R.dimen.dialog_padding_horizontal), getResources().getDimensionPixelSize(R.dimen.dialog_padding_top), getResources().getDimensionPixelSize(R.dimen.dialog_padding_horizontal), getResources().getDimensionPixelSize(R.dimen.dialog_padding_bottom));
        relativeLayout.setFocusable(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10, -1);
        TextView textView = new TextView(getContext());
        this.a = textView;
        textView.setId(R.id.dialog_title);
        textView.setGravity(1);
        qf.a(textView, R.style.DialogTitle);
        relativeLayout.addView(textView, layoutParams);
        TextView textView2 = new TextView(getContext());
        this.b = textView2;
        qf.a(textView2, R.style.DialogBody);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, textView.getId());
        layoutParams2.setMargins(0, getResources().getDimensionPixelSize(R.dimen.dialog_description_top_margin), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView2, layoutParams2);
        MaterialButton materialButton = (MaterialButton) inflate(getContext(), R.layout.dialog_button, null);
        this.d = materialButton;
        materialButton.setId(R.id.positive_button);
        MaterialButton materialButton2 = (MaterialButton) inflate(getContext(), R.layout.dialog_button, null);
        this.e = materialButton2;
        materialButton2.setId(R.id.negative_button);
        setBackgroundColor(akm.c(getContext(), R.color.dialog_background));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        addView(relativeLayout, a(displayMetrics.widthPixels));
        setImportantForAccessibility(1);
        b();
    }
}
