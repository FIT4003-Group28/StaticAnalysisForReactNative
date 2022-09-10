package defpackage;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;
/* compiled from: PG */
/* renamed from: czsv  reason: default package */
/* loaded from: classes5.dex */
public final class czsv extends czpi {
    private LinearLayout d;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.d = (LinearLayout) layoutInflater.inflate(R.layout.survey_thank_you_fragment, viewGroup, false);
        Bundle bundle2 = this.o;
        czox.a((ImageView) this.d.findViewById(R.id.survey_prompt_banner_logo), Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)));
        TextView textView = (TextView) this.d.findViewById(R.id.survey_question_text);
        Spanned a = alq.a(this.b.a, 0);
        textView.setText(a);
        textView.setContentDescription(a.toString());
        textView.announceForAccessibility(textView.getContentDescription());
        String q = czph.q(this.b.c);
        if (!TextUtils.isEmpty(q)) {
            String str = this.b.b;
            if (TextUtils.isEmpty(str)) {
                str = Rn().getString(R.string.survey_thank_you_followup_message);
            }
            TextView textView2 = (TextView) this.d.findViewById(R.id.survey_follow_up_url);
            textView2.setContentDescription(str);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new czsu(this, q), 0, str.length(), 0);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(spannableString);
            if (czph.n(H())) {
                textView2.setClickable(false);
                textView2.setLongClickable(false);
            }
            textView2.setOnTouchListener(czst.a);
            textView2.setVisibility(0);
        }
        return this.d;
    }

    @Override // defpackage.czpi
    public final void f() {
        ((SurveyActivity) J()).p(false);
        ((czpw) J()).b(true, this);
        if (!TextUtils.isEmpty(czph.q(this.b.c)) || !(J() instanceof SurveyActivity)) {
            return;
        }
        ((SurveyActivity) J()).s();
    }

    @Override // defpackage.czpi
    public final duaq g() {
        return null;
    }

    @Override // defpackage.czpi
    public final void h(String str) {
    }

    @Override // defpackage.czpi
    public final void i() {
        if (this.d != null) {
            int i = 0;
            while (i < this.d.getChildCount()) {
                View childAt = this.d.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }
}
