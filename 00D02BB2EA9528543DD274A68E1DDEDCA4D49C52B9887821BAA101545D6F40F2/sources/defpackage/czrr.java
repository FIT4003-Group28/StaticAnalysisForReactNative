package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback;
/* compiled from: PG */
/* renamed from: czrr  reason: default package */
/* loaded from: classes5.dex */
public abstract class czrr extends czpi {
    public View ad;
    public ScrollViewWithSizeCallback ae;
    private TextView d;
    public View f;
    public View g;
    private final czrq e = new czrq(this);
    private boolean af = false;

    @Override // defpackage.fd
    public final void Qe() {
        ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        if (this.af && (scrollViewWithSizeCallback = this.ae) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().removeOnScrollChangedListener(this.e);
            this.af = false;
        }
        super.Qe();
    }

    public final boolean aJ() {
        return (H() == null || this.d == null || this.f == null || this.g == null || this.ad == null || this.ae == null) ? false : true;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        View inflate = layoutInflater.inflate(R.layout.survey_question_with_scrollable_content, viewGroup, false);
        this.f = inflate.findViewById(R.id.survey_question_header_logo_text);
        this.d = (TextView) inflate.findViewById(R.id.survey_question_text);
        CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            charSequence = alq.a(p(), 0);
        }
        this.d.setText(charSequence);
        this.d.setContentDescription(charSequence.toString());
        this.ad = q();
        ScrollViewWithSizeCallback scrollViewWithSizeCallback2 = (ScrollViewWithSizeCallback) inflate.findViewById(R.id.survey_question_scroll_view);
        this.ae = scrollViewWithSizeCallback2;
        scrollViewWithSizeCallback2.addView(this.ad);
        this.ae.setOnHeightChangedListener(this.e);
        if (!this.af && (scrollViewWithSizeCallback = this.ae) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().addOnScrollChangedListener(this.e);
            this.af = true;
        }
        czox.a((ImageView) inflate.findViewById(R.id.survey_prompt_banner_logo), this.c);
        this.g = ((ff) viewGroup.getContext()).findViewById(R.id.survey_controls_container);
        return inflate;
    }

    @Override // defpackage.czpi
    public void f() {
        TextView textView;
        if ((!czov.b(dyea.c(czov.a)) || aJ()) && czph.n(H()) && (textView = this.d) != null) {
            textView.requestFocus();
            this.d.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.czpi
    public final void h(String str) {
        if (!czov.b(dyea.c(czov.a)) || aJ()) {
            Spanned a = alq.a(str, 0);
            this.d.setText(a);
            this.d.setContentDescription(a.toString());
        }
    }

    public abstract String p();

    public abstract View q();

    @Override // defpackage.fd
    public void t(Bundle bundle) {
        TextView textView = this.d;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }
}
