package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: cvfl  reason: default package */
/* loaded from: classes5.dex */
public final class cvfl extends LinearLayout implements cvfr {
    public final ContactAvatarView a;
    private final TextView b;
    private final MaterialButton c;
    private cvft d;
    private final int e;
    private final int f;
    private final int g;

    public cvfl(Context context) {
        this(context, null);
    }

    public void setActionText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.setText(str);
        this.c.setVisibility(0);
    }

    public void setActionTextAndRippleEffectColor(int i) {
        this.c.setTextColor(i);
        this.c.setRippleColor(ColorStateList.valueOf(cuwg.d(i)));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.c.setBackgroundColor(i);
    }

    public void setContentText(String str) {
        this.b.setText(str);
    }

    public void setContentTextColor(int i) {
        this.b.setTextColor(i);
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cvfq cvfqVar) {
        this.c.setOnClickListener(new View.OnClickListener(cvfqVar) { // from class: cvfk
            private final cvfq a;

            {
                this.a = cvfqVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
    }

    public void setStyleProvider(cvft cvftVar) {
        this.d = cvftVar;
        setActionTextAndRippleEffectColor(cvftVar.b());
        setBackgroundColor(this.d.c());
        setContentTextColor(this.d.a());
    }

    public cvfl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textStatusBarStyle);
    }

    public cvfl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.avatar_status_bar_layout, this);
        this.a = (ContactAvatarView) findViewById(R.id.contact_avatar);
        this.b = (TextView) findViewById(R.id.status_content);
        this.c = (MaterialButton) findViewById(R.id.action_button);
        int c = akm.c(getContext(), R.color.google_blue700);
        this.e = c;
        int c2 = akm.c(getContext(), R.color.google_grey800);
        this.f = c2;
        int c3 = akm.c(getContext(), R.color.google_grey50);
        this.g = c3;
        setBackgroundColor(akm.c(getContext(), R.color.google_grey50));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvfo.a, i, R.style.Default);
        int color = obtainStyledAttributes.getColor(2, c2);
        int color2 = obtainStyledAttributes.getColor(1, c);
        int color3 = obtainStyledAttributes.getColor(0, c3);
        setContentTextColor(color);
        setActionTextAndRippleEffectColor(color2);
        setBackgroundColor(color3);
        obtainStyledAttributes.recycle();
    }
}
