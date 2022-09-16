package com.google.android.libraries.surveys.internal.view;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SurveyActivity extends rb implements czpw, czpv {
    public Answer k;
    public LinearLayout l;
    public boolean m;
    private dubf n;
    private SurveyViewPager o;
    private czoj p;
    private MaterialCardView r;
    private Integer t;
    private boolean u;
    private cznv v;
    private Bundle q = new Bundle();
    private final Handler s = new Handler();

    private final void u() {
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.survey_next);
        if (materialButton == null || !this.o.y()) {
            return;
        }
        materialButton.setText(R.string.survey_submit);
    }

    private final int v() {
        SurveyViewPager surveyViewPager = this.o;
        if (surveyViewPager != null) {
            int e = surveyViewPager.e();
            return this.u ? e + 1 : e;
        }
        return 0;
    }

    private final void w() {
        duap duapVar;
        int a = duad.a(r().a);
        if (a != 0) {
            if (a != 1) {
                return;
            }
            Bundle bundle = this.q;
            String valueOf = String.valueOf(r().c);
            duaq r = r();
            if (r.a == 2) {
                duapVar = (duap) r.b;
            } else {
                duapVar = duap.b;
            }
            duan duanVar = duapVar.a;
            if (duanVar == null) {
                duanVar = duan.d;
            }
            bundle.putString(valueOf, duanVar.c);
            return;
        }
        throw null;
    }

    private final void x() {
        String str;
        String str2;
        int length;
        String str3;
        ducm ducmVar;
        SurveyViewPager surveyViewPager = this.o;
        if (surveyViewPager != null) {
            if (czov.a(dyed.b(czov.a))) {
                czsm czsmVar = (czsm) surveyViewPager.c();
                if (czsmVar != null) {
                    if (czsmVar.a.get(surveyViewPager.e()).b == 5) {
                        return;
                    }
                }
            } else if (surveyViewPager.e() == surveyViewPager.c().OV() - 1) {
                return;
            }
        }
        dubq dubqVar = this.n.e.get(v());
        final String str4 = dubqVar.e.isEmpty() ? dubqVar.d : dubqVar.e;
        int size = dubqVar.f.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        for (int i = 0; i < size; i++) {
            duco ducoVar = dubqVar.f.get(i);
            int i2 = ducoVar.a;
            if (i2 == 2) {
                if (i2 == 2) {
                    ducmVar = (ducm) ducoVar.b;
                } else {
                    ducmVar = ducm.b;
                }
                int i3 = ducmVar.a;
                String string = this.q.getString(String.valueOf(i3));
                if (string != null) {
                    strArr[i] = ducoVar.c;
                    strArr2[i] = string;
                } else {
                    StringBuilder sb = new StringBuilder(61);
                    sb.append("No single-select question with ordinal ");
                    sb.append(i3);
                    sb.append(" was found.");
                    sb.toString();
                }
            }
        }
        if (str4 != null && !str4.isEmpty() && size != 0 && size != 0) {
            if (size == size) {
                boolean[] zArr = new boolean[size];
                int i4 = -1;
                int i5 = -1;
                for (int i6 = 0; i6 < size; i6++) {
                    if (!zArr[i6] && (str3 = strArr[i6]) != null && !str3.isEmpty() && strArr2[i6] != null) {
                        int indexOf = str4.indexOf(strArr[i6]);
                        if (indexOf == -1) {
                            zArr[i6] = true;
                        } else if (i4 == -1 || indexOf < i4) {
                            i5 = i6;
                            i4 = indexOf;
                        }
                    }
                }
                if (i4 != -1) {
                    int i7 = 0;
                    for (int i8 = 0; i8 < size; i8++) {
                        if (strArr[i8] != null && (str2 = strArr2[i8]) != null && (length = str2.length() - strArr[i8].length()) > 0) {
                            i7 += length * 3;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(str4.length() + Math.min(i7, str4.length() / 5));
                    int i9 = 0;
                    while (i4 != -1) {
                        while (i9 < i4) {
                            sb2.append(str4.charAt(i9));
                            i9++;
                        }
                        sb2.append(strArr2[i5]);
                        i9 = strArr[i5].length() + i4;
                        i4 = -1;
                        i5 = -1;
                        for (int i10 = 0; i10 < size; i10++) {
                            if (!zArr[i10] && (str = strArr[i10]) != null && !str.isEmpty() && strArr2[i10] != null) {
                                int indexOf2 = str4.indexOf(strArr[i10], i9);
                                if (indexOf2 == -1) {
                                    zArr[i10] = true;
                                } else if (i4 == -1 || indexOf2 < i4) {
                                    i5 = i10;
                                    i4 = indexOf2;
                                }
                            }
                        }
                    }
                    int length2 = str4.length();
                    while (i9 < length2) {
                        sb2.append(str4.charAt(i9));
                        i9++;
                    }
                    str4 = sb2.toString();
                }
            } else {
                throw new IllegalArgumentException("Search and Replace array lengths don't match: " + size + " vs " + size);
            }
        }
        final SurveyViewPager surveyViewPager2 = this.o;
        czpi B = surveyViewPager2.B();
        if (B == null) {
            surveyViewPager2.post(new Runnable(surveyViewPager2, str4) { // from class: czsk
                private final SurveyViewPager a;
                private final String b;

                {
                    this.a = surveyViewPager2;
                    this.b = str4;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SurveyViewPager surveyViewPager3 = this.a;
                    surveyViewPager3.B().h(this.b);
                }
            });
        } else {
            B.h(str4);
        }
    }

    private final void z() {
        findViewById(R.id.survey_controls_divider).setVisibility(8);
        findViewById(R.id.survey_controls_legal_text).setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a5, code lost:
        if (java.util.Collections.disjoint(r5, r0) == false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    @Override // defpackage.czpv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.SurveyActivity.a():void");
    }

    @Override // defpackage.czpw
    public final void b(boolean z, fd fdVar) {
        if (this.m || czsm.s(fdVar) != this.o.e()) {
            return;
        }
        q(z);
    }

    public final boolean o() {
        return czph.r(this.n);
    }

    @Override // defpackage.agi, android.app.Activity
    public final void onBackPressed() {
        t(6);
        if (this.m) {
            setResult(-1, new Intent().putExtra("EXTRA_BACK_BUTTON_PRESSED", true));
        }
        finish();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(Bundle bundle) {
        duch duchVar;
        dubf dubfVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("IsDismissing", false)) {
            finish();
            return;
        }
        setTitle("");
        String stringExtra = intent.getStringExtra("TriggerId");
        final String str = null;
        this.n = null;
        if (czov.b(dydx.b(czov.a))) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("SurveyPayload");
            if (byteArrayExtra != null) {
                this.n = (dubf) czph.a(dubf.g, byteArrayExtra);
            }
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("SurveySession");
            duchVar = byteArrayExtra2 != null ? (duch) czph.a(duch.c, byteArrayExtra2) : null;
        } else {
            this.n = (dubf) czph.a(dubf.g, intent.getByteArrayExtra("SurveyPayload"));
            duchVar = (duch) czph.a(duch.c, intent.getByteArrayExtra("SurveySession"));
        }
        if (bundle != null) {
            this.k = (Answer) bundle.getParcelable("Answer");
            this.m = bundle.getBoolean("IsSubmitting");
            Bundle bundle2 = bundle.getBundle("SingleSelectOrdinalAnswerMappings");
            this.q = bundle2;
            if (bundle2 == null) {
                this.q = new Bundle();
            }
        } else {
            this.k = (Answer) intent.getParcelableExtra("Answer");
            this.m = intent.getBooleanExtra("IsSubmitting", false);
        }
        this.u = intent.getBooleanExtra("IgnoreFirstQuestion", false);
        this.t = intent.hasExtra("LogoResId") ? Integer.valueOf(intent.getIntExtra("LogoResId", 0)) : null;
        if (stringExtra == null || (dubfVar = this.n) == null || dubfVar.e.size() == 0 || this.k == null || duchVar == null) {
            finish();
            return;
        }
        duaz duazVar = this.n.a;
        if (duazVar == null) {
            duazVar = duaz.c;
        }
        boolean z = true;
        if (!duazVar.a && !this.u) {
            z = false;
        }
        if (bundle != null || !z) {
            czsi.a.a();
        }
        int i = czph.a;
        this.p = new czoj(this, stringExtra, duchVar);
        setContentView(R.layout.survey_container);
        this.l = (LinearLayout) findViewById(R.id.survey_container);
        this.r = (MaterialCardView) findViewById(R.id.survey_overall_container);
        if (!TextUtils.isEmpty(this.k.b)) {
            str = this.k.b;
        }
        ImageButton imageButton = (ImageButton) findViewById(R.id.survey_close_button);
        imageButton.setImageDrawable(czph.s(this));
        imageButton.setOnClickListener(new View.OnClickListener(this, str) { // from class: czsf
            private final SurveyActivity a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SurveyActivity surveyActivity = this.a;
                String str2 = this.b;
                czpb a = czpb.a();
                surveyActivity.t(6);
                czph.m(surveyActivity.l);
                surveyActivity.finish();
                czpa.d(a, surveyActivity, str2);
            }
        });
        boolean o = o();
        getLayoutInflater().inflate(R.layout.survey_controls, this.l);
        if (czov.b(dyea.c(czov.a))) {
            p(o);
        } else if (!o) {
            p(false);
        }
        if (!z) {
            czph.f(this, (TextView) findViewById(R.id.survey_controls_legal_text), str, new czpg(this, str) { // from class: czsd
                private final SurveyActivity a;
                private final String b;

                {
                    this.a = this;
                    this.b = str;
                }

                @Override // defpackage.czpg
                public final void a() {
                    SurveyActivity surveyActivity = this.a;
                    String str2 = this.b;
                    czpb a = czpb.a();
                    gn g = surveyActivity.g();
                    czsp czspVar = new czsp();
                    Bundle bundle3 = new Bundle(2);
                    bundle3.putString("EXTRA_ACCOUNT_NAME", str2);
                    bundle3.putBundle("EXTRA_PSD_BUNDLE", czph.h(surveyActivity.k.c));
                    czspVar.B(bundle3);
                    czspVar.e(g, czsp.ad);
                    g.aq();
                    czpa.c(a, surveyActivity, str2);
                }
            });
        } else {
            z();
        }
        cznv cznvVar = (cznv) intent.getSerializableExtra("SurveyCompletionStyle");
        this.v = cznvVar;
        czsm czsmVar = new czsm(g(), this.n, this.t, this.u, cznvVar);
        SurveyViewPager surveyViewPager = (SurveyViewPager) findViewById(R.id.survey_viewpager);
        this.o = surveyViewPager;
        surveyViewPager.setAdapter(czsmVar);
        this.o.setImportantForAccessibility(2);
        if (bundle != null) {
            this.o.setCurrentItem(bundle.getInt("CurrentQuestionIndexForViewPager"));
        }
        if (o) {
            u();
        }
        this.l.setVisibility(0);
        this.l.forceLayout();
        if (this.u) {
            w();
            x();
            t(5);
        }
        if (o) {
            ((MaterialButton) findViewById(R.id.survey_next)).setOnClickListener(new View.OnClickListener(this, str) { // from class: czse
                private final SurveyActivity a;
                private final String b;

                {
                    this.a = this;
                    this.b = str;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SurveyActivity surveyActivity = this.a;
                    String str2 = this.b;
                    czpb a = czpb.a();
                    surveyActivity.a();
                    czpa.e(a, surveyActivity, str2);
                }
            });
        }
        Window window = getWindow();
        window.addFlags(2);
        window.clearFlags(32);
        window.addFlags(262144);
        window.setDimAmount(0.4f);
        findViewById(R.id.survey_close_button).setVisibility(0);
        SurveyViewPager surveyViewPager2 = this.o;
        if (surveyViewPager2 == null || !surveyViewPager2.z()) {
            return;
        }
        duaz duazVar2 = this.n.a;
        if (duazVar2 == null) {
            duazVar2 = duaz.c;
        }
        if (duazVar2.a) {
            return;
        }
        t(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rb, defpackage.ff, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            czsi.a.b();
        }
        this.s.removeCallbacks(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("IsDismissing", false)) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (czov.b(dyea.c(czov.a))) {
            SurveyViewPager surveyViewPager = this.o;
            bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? surveyViewPager.e() : 0);
        } else {
            bundle.putInt("CurrentQuestionIndexForViewPager", v());
        }
        bundle.putBoolean("IsSubmitting", this.m);
        bundle.putParcelable("Answer", this.k);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", this.q);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            this.r.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && this.m) {
                int i = czph.a;
                finish();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.survey_next);
        int i = true != z ? 8 : 0;
        if (materialButton != null) {
            materialButton.setVisibility(i);
        }
    }

    public final void q(boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.survey_next);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    public final duaq r() {
        return this.k.a;
    }

    public final void s() {
        this.s.postDelayed(new Runnable(this) { // from class: czsg
            private final SurveyActivity a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurveyActivity surveyActivity = this.a;
                surveyActivity.m = true;
                surveyActivity.finish();
            }
        }, 2400L);
    }

    public final void t(int i) {
        Answer answer = this.k;
        answer.g = i;
        this.p.a(answer, czph.b(this.n));
    }
}
