package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: cvgn  reason: default package */
/* loaded from: classes5.dex */
public final class cvgn extends LinearLayout implements cvgi {
    private final TextView a;
    private final MaterialButton b;

    public cvgn(Context context) {
        this(context, null);
    }

    @Override // defpackage.cvgi
    public final void a(String str, boolean z) {
        String string;
        TextView textView = this.a;
        if (z) {
            string = getContext().getResources().getString(R.string.unblock_and_reported_label, str);
        } else {
            string = getContext().getResources().getString(R.string.unblock_label, str);
        }
        textView.setText(string);
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cvgh cvghVar) {
        this.b.setOnClickListener(new View.OnClickListener(cvghVar) { // from class: cvgm
            private final cvgh a;

            {
                this.a = cvghVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b();
            }
        });
    }

    public void setStyleProvider(cuwf cuwfVar) {
        cuwfVar.b();
    }

    public cvgn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.unblockStyle);
    }

    public cvgn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.unblock_view_layout, this);
        TextView textView = (TextView) findViewById(R.id.unblock_label);
        this.a = textView;
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.unblock_button);
        this.b = materialButton;
        od.F(this, getResources().getDimensionPixelSize(R.dimen.elevation));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvgf.a, i, R.style.LighterUnblockView);
        qf.a(textView, obtainStyledAttributes.getResourceId(1, R.style.UnblockLabelText));
        int color = obtainStyledAttributes.getColor(2, akm.c(getContext(), R.color.google_blue600));
        materialButton.setTextColor(color);
        materialButton.setRippleColor(ColorStateList.valueOf(cuwg.d(color)));
        setBackgroundResource(obtainStyledAttributes.getResourceId(0, akm.c(getContext(), R.color.google_blue50)));
        obtainStyledAttributes.recycle();
    }
}
