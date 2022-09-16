package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: czqz  reason: default package */
/* loaded from: classes5.dex */
public final class czqz {
    public final czqy a;
    public Answer b;
    public Context c;
    public czps d;
    public dubf e;
    public QuestionMetrics f;
    public duch g;
    public czsb h;
    public View i;
    public ViewGroup j;
    public boolean k = false;
    public boolean l;
    public boolean m;
    public int n;
    public Integer o;
    public String p;
    public String q;
    public cznv r;

    public czqz(czqy czqyVar) {
        this.a = czqyVar;
    }

    public static final void i(View view, String str) {
        TextView textView = (TextView) view.findViewById(R.id.survey_prompt_title_text);
        Spanned a = alq.a(str, 0);
        textView.setText(a);
        textView.announceForAccessibility(a.toString());
    }

    public final void a(dubq dubqVar) {
        czsb czsbVar = this.h;
        duae bZ = duaq.d.bZ();
        if (this.f.c() && czsbVar.a != null) {
            duam bZ2 = duan.d.bZ();
            int i = czsbVar.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            duan duanVar = (duan) bZ2.b;
            duanVar.b = i;
            duanVar.a = dual.a(czsbVar.c);
            String str = czsbVar.a;
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
            duaqVar.c = dubqVar.c;
        }
        duaq bK3 = bZ.bK();
        if (bK3 != null) {
            this.b.a = bK3;
        }
        b();
    }

    public final void b() {
        this.f.b();
        if (czov.a(dyed.b(czov.a))) {
            if (this.r != cznv.TOAST || this.e.e.size() != 1) {
                f();
                return;
            }
            View view = this.i;
            dtzt dtztVar = this.e.b;
            if (dtztVar == null) {
                dtztVar = dtzt.f;
            }
            dafk.n(view, dtztVar.a, -1).c();
            this.a.g();
            return;
        }
        f();
    }

    public final void c() {
        ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.survey_controls, this.j);
        if (!czph.r(this.e)) {
            this.j.findViewById(R.id.survey_next).setVisibility(8);
        } else {
            d(false);
            MaterialButton materialButton = (MaterialButton) this.j.findViewById(R.id.survey_next);
            if (materialButton != null && this.e.e.size() == 1) {
                materialButton.setText(R.string.survey_submit);
            }
            czox.b(this.j.findViewById(R.id.survey_controls_container), this.j.findViewById(R.id.survey_next), R.dimen.survey_button_accessibility_padding, 0);
        }
        this.j.findViewById(R.id.survey_controls_divider).setVisibility(8);
        this.j.findViewById(R.id.survey_controls_legal_text).setVisibility(8);
    }

    public final void d(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.j.findViewById(R.id.survey_next);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    public final void e(final View.OnClickListener onClickListener, final String str) {
        ((MaterialButton) this.j.findViewById(R.id.survey_next)).setOnClickListener(new View.OnClickListener(this, onClickListener, str) { // from class: czqo
            private final czqz a;
            private final View.OnClickListener b;
            private final String c;

            {
                this.a = this;
                this.b = onClickListener;
                this.c = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czqz czqzVar = this.a;
                View.OnClickListener onClickListener2 = this.b;
                String str2 = this.c;
                czpb a = czpb.a();
                onClickListener2.onClick(view);
                czpa.e(a, czqzVar.c, str2);
            }
        });
    }

    public final void f() {
        Activity a = this.a.a();
        String str = this.p;
        dubf dubfVar = this.e;
        duch duchVar = this.g;
        Answer answer = this.b;
        Integer valueOf = Integer.valueOf(this.n);
        boolean z = this.l;
        boolean z2 = this.m;
        Integer num = this.o;
        cznv cznvVar = this.r;
        Intent intent = new Intent(a, SurveyActivity.class);
        intent.setClassName(a, "com.google.android.libraries.surveys.internal.view.SurveyActivity");
        intent.putExtra("TriggerId", str);
        intent.putExtra("SurveyPayload", dubfVar.bS());
        intent.putExtra("SurveySession", duchVar.bS());
        intent.putExtra("Answer", answer);
        intent.putExtra("IsFullWidth", z);
        intent.putExtra("IgnoreFirstQuestion", z2);
        if (num != null) {
            intent.putExtra("LogoResId", num);
        }
        intent.putExtra("IsSubmitting", false);
        intent.putExtra("SurveyCompletionStyle", cznvVar);
        int i = czph.a;
        a.startActivityForResult(intent, valueOf.intValue());
        this.k = true;
        Context context = this.c;
        String str2 = this.p;
        duch duchVar2 = this.g;
        boolean b = czph.b(this.e);
        this.b.g = 3;
        new czoj(context, str2, duchVar2).a(this.b, b);
        this.a.g();
    }

    public final void g(Context context, String str, duch duchVar, boolean z) {
        this.b.g = 6;
        new czoj(context, str, duchVar).a(this.b, z);
    }

    public final void h(Context context, String str, duch duchVar, boolean z) {
        this.b.g = 4;
        new czoj(context, str, duchVar).a(this.b, z);
    }
}
