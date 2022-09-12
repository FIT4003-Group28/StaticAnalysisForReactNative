package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;
/* compiled from: PG */
/* renamed from: czrd  reason: default package */
/* loaded from: classes5.dex */
public final class czrd extends czpi {
    public String d;
    public int e;
    public QuestionMetrics f;
    private TextView g;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dubt dubtVar;
        View inflate = layoutInflater.inflate(R.layout.survey_question_rating_fragment, viewGroup, false);
        Bundle bundle2 = this.o;
        CharSequence charSequence = null;
        czox.a((ImageView) inflate.findViewById(R.id.survey_prompt_banner_logo), bundle2.containsKey("DisplayLogoResId") ? Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)) : null);
        if (bundle != null) {
            charSequence = bundle.getCharSequence("QuestionTextFromHtml");
        }
        if (charSequence == null) {
            charSequence = alq.a(this.a.e.isEmpty() ? this.a.d : this.a.e, 0);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.survey_question_text);
        this.g = textView;
        textView.setText(charSequence);
        this.g.setContentDescription(charSequence.toString());
        czro czroVar = new czro(H());
        dubq dubqVar = this.a;
        if (dubqVar.a == 6) {
            dubtVar = (dubt) dubqVar.b;
        } else {
            dubtVar = dubt.f;
        }
        czroVar.setUpRatingView(dubtVar);
        czroVar.setOnRatingClickListener(new czrn(this) { // from class: czrc
            private final czrd a;

            {
                this.a = this;
            }

            @Override // defpackage.czrn
            public final void a(int i) {
                czrd czrdVar = this.a;
                czrdVar.d = Integer.toString(i);
                czrdVar.e = i;
                czrdVar.f.b();
                int a = dubp.a(czrdVar.a.g);
                if (a == 0) {
                    a = 1;
                }
                ff e = czrdVar.e();
                if (e == null) {
                    return;
                }
                if (a == 5) {
                    ((czpv) e).a();
                } else {
                    ((czpw) e).b(czrdVar.p(), czrdVar);
                }
            }
        });
        ((ViewGroup) inflate.findViewById(R.id.survey_rating_container)).addView(czroVar);
        return inflate;
    }

    @Override // defpackage.czpi
    public final void f() {
        TextView textView;
        this.f.a();
        if (J() instanceof SurveyActivity) {
            ((SurveyActivity) J()).p(false);
        }
        ((czpw) J()).b(p(), this);
        if (!czph.n(H()) || (textView = this.g) == null) {
            return;
        }
        textView.requestFocus();
        this.g.sendAccessibilityEvent(8);
    }

    @Override // defpackage.czpi
    public final duaq g() {
        duae bZ = duaq.d.bZ();
        if (this.f.c() && this.d != null) {
            duam bZ2 = duan.d.bZ();
            int i = this.e;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ((duan) bZ2.b).b = i;
            ((duan) bZ2.b).a = dual.a(3);
            String str = this.d;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            str.getClass();
            ((duan) bZ2.b).c = str;
            duan bK = bZ2.bK();
            duaj bZ3 = duak.b.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            bK.getClass();
            ((duak) bZ3.b).a = bK;
            duak bK2 = bZ3.bK();
            int i2 = this.a.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duaq duaqVar = (duaq) bZ.b;
            duaqVar.c = i2;
            bK2.getClass();
            duaqVar.b = bK2;
            duaqVar.a = 4;
            int i3 = czph.a;
        }
        return bZ.bK();
    }

    @Override // defpackage.czpi
    public final void h(String str) {
        if (!czov.b(dyea.c(czov.a)) || !(H() == null || this.g == null)) {
            Spanned a = alq.a(str, 0);
            this.g.setText(a);
            this.g.setContentDescription(a.toString());
        }
    }

    @Override // defpackage.czpi, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.f = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
        if (this.f == null) {
            this.f = new QuestionMetrics();
        }
    }

    public final boolean p() {
        return this.d != null;
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.f);
        TextView textView = this.g;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }
}
