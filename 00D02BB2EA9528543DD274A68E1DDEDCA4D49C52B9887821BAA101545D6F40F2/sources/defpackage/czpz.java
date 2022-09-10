package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
/* compiled from: PG */
/* renamed from: czpz  reason: default package */
/* loaded from: classes5.dex */
public final class czpz extends czrr {
    public String d;
    private QuestionMetrics e;

    @Override // defpackage.fd
    public final void aj(Bundle bundle) {
        super.aj(bundle);
        ((czpw) J()).b(true, this);
    }

    @Override // defpackage.czrr, defpackage.czpi
    public final void f() {
        super.f();
        this.e.a();
        ((czpw) J()).b(true, this);
    }

    @Override // defpackage.czpi
    public final duaq g() {
        duae bZ = duaq.d.bZ();
        if (this.e.c()) {
            this.e.b();
            String e = dbsj.e(this.d);
            duah bZ2 = duai.b.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            e.getClass();
            ((duai) bZ2.b).a = e;
            duai bK = bZ2.bK();
            int i = this.a.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duaq duaqVar = (duaq) bZ.b;
            duaqVar.c = i;
            bK.getClass();
            duaqVar.b = bK;
            duaqVar.a = 5;
        }
        return bZ.bK();
    }

    @Override // defpackage.czpi, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            this.e = new QuestionMetrics();
        } else {
            this.e = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
    }

    @Override // defpackage.czrr
    public final String p() {
        return this.a.e.isEmpty() ? this.a.d : this.a.e;
    }

    @Override // defpackage.czrr
    public final View q() {
        dubd dubdVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(H()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        czqc czqcVar = new czqc(H());
        dubq dubqVar = this.a;
        if (dubqVar.a == 7) {
            dubdVar = (dubd) dubqVar.b;
        } else {
            dubdVar = dubd.c;
        }
        czqcVar.setUpOpenTextView(dubdVar);
        czqcVar.setOnOpenTextResponseListener(new czqb(this) { // from class: czpy
            private final czpz a;

            {
                this.a = this;
            }

            @Override // defpackage.czqb
            public final void a(String str) {
                this.a.d = str;
            }
        });
        linearLayout.addView(czqcVar);
        return linearLayout;
    }

    @Override // defpackage.czrr, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putParcelable("QuestionMetrics", this.e);
    }
}
