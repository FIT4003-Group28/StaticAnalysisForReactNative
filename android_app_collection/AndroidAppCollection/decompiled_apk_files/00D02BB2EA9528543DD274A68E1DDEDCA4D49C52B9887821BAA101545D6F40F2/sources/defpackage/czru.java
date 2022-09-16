package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;
/* compiled from: PG */
/* renamed from: czru  reason: default package */
/* loaded from: classes5.dex */
public final class czru extends czrr {
    public int af;
    private LinearLayout ag;
    private QuestionMetrics ah;
    public String d;
    public int e = -1;

    @Override // defpackage.czrr, defpackage.czpi
    public final void f() {
        EditText editText;
        super.f();
        this.ah.a();
        czpw czpwVar = (czpw) J();
        LinearLayout linearLayout = this.ag;
        boolean z = false;
        if (linearLayout != null && (editText = (EditText) linearLayout.findViewById(R.id.survey_other_option)) != null && editText.hasFocus()) {
            z = true;
        }
        czpwVar.b(z, this);
    }

    @Override // defpackage.czpi
    public final duaq g() {
        duae bZ = duaq.d.bZ();
        if (this.ah.c() && this.d != null) {
            this.ah.b();
            duam bZ2 = duan.d.bZ();
            int i = this.e;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            duan duanVar = (duan) bZ2.b;
            duanVar.b = i;
            duanVar.a = dual.a(this.af);
            String str = this.d;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            str.getClass();
            ((duan) bZ2.b).c = str;
            duan bK = bZ2.bK();
            duao bZ3 = duap.b.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            bK.getClass();
            ((duap) bZ3.b).a = bK;
            duap bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duaq duaqVar = (duaq) bZ.b;
            bK2.getClass();
            duaqVar.b = bK2;
            duaqVar.a = 2;
            duaqVar.c = this.a.c;
        }
        return bZ.bK();
    }

    @Override // defpackage.czpi
    public final void i() {
        if (this.ag != null) {
            int i = 0;
            while (i < this.ag.getChildCount()) {
                View childAt = this.ag.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.czpi, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.ah = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
        if (this.ah == null) {
            this.ah = new QuestionMetrics();
        }
    }

    @Override // defpackage.czrr
    public final String p() {
        return this.a.e.isEmpty() ? this.a.d : this.a.e;
    }

    @Override // defpackage.czrr
    public final View q() {
        duck duckVar;
        View inflate = LayoutInflater.from(H()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null);
        this.ag = (LinearLayout) inflate.findViewById(R.id.survey_answers_container);
        czsc czscVar = new czsc(H());
        czscVar.setOnAnswerSelectClickListener(new czsa(this) { // from class: czrt
            private final czru a;

            {
                this.a = this;
            }

            @Override // defpackage.czsa
            public final void a(czsb czsbVar) {
                czru czruVar = this.a;
                ff e = czruVar.e();
                if (e == null) {
                    return;
                }
                czruVar.af = czsbVar.c;
                czruVar.d = czsbVar.a;
                czruVar.e = czsbVar.b;
                if (czsbVar.c == 4) {
                    ((SurveyActivity) e).q(true);
                } else {
                    ((czpv) e).a();
                }
            }
        });
        dubq dubqVar = this.a;
        if (dubqVar.a == 4) {
            duckVar = (duck) dubqVar.b;
        } else {
            duckVar = duck.c;
        }
        czscVar.setUpSingleSelectView(duckVar);
        this.ag.addView(czscVar);
        if (!((SurveyActivity) J()).o()) {
            inflate.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), Rn().getDimensionPixelSize(R.dimen.survey_bottom_padding));
        }
        return inflate;
    }

    @Override // defpackage.czrr, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.ah);
    }
}
