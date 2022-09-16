package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;
/* compiled from: PG */
/* renamed from: czpm  reason: default package */
/* loaded from: classes5.dex */
public final class czpm extends czrr {
    private boolean[] af;
    private ViewGroup ag;
    public QuestionMetrics d;
    public czps e;

    @Override // defpackage.fd
    public final void aj(Bundle bundle) {
        super.aj(bundle);
        ((czpw) J()).b(w(), this);
    }

    @Override // defpackage.czrr, defpackage.czpi
    public final void f() {
        super.f();
        this.d.a();
        ((czpw) J()).b(w(), this);
    }

    @Override // defpackage.czpi
    public final duaq g() {
        dubb dubbVar;
        duae bZ = duaq.d.bZ();
        if (this.d.c()) {
            duaf bZ2 = duag.b.bZ();
            dubq dubqVar = this.a;
            if (dubqVar.a == 5) {
                dubbVar = (dubb) dubqVar.b;
            } else {
                dubbVar = dubb.b;
            }
            dtzc dtzcVar = dubbVar.a;
            if (dtzcVar == null) {
                dtzcVar = dtzc.b;
            }
            dsrj<dtza> dsrjVar = dtzcVar.a;
            int i = 0;
            while (true) {
                boolean[] zArr = this.e.b;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    String str = dsrjVar.get(i).c;
                    int a = dtyy.a(dsrjVar.get(i).a);
                    int i2 = 4;
                    if (a != 0 && a == 4 && !TextUtils.isEmpty(this.e.a)) {
                        str = this.e.a;
                    }
                    duam bZ3 = duan.d.bZ();
                    int i3 = dsrjVar.get(i).b;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    duan duanVar = (duan) bZ3.b;
                    duanVar.b = i3;
                    str.getClass();
                    duanVar.c = str;
                    int a2 = dtyy.a(dsrjVar.get(i).a);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i4 = a2 - 2;
                    if (i4 == 1) {
                        i2 = 3;
                    } else if (i4 != 2) {
                        i2 = i4 != 3 ? 2 : 5;
                    }
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    ((duan) bZ3.b).a = dual.a(i2);
                    bZ2.a(bZ3.bK());
                    this.d.b();
                }
                int i5 = this.a.c;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((duaq) bZ.b).c = i5;
                duag bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                duaq duaqVar = (duaq) bZ.b;
                bK.getClass();
                duaqVar.b = bK;
                duaqVar.a = 3;
                i++;
            }
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
        dubb dubbVar;
        dubb dubbVar2;
        dubb dubbVar3;
        super.l(bundle);
        if (bundle != null) {
            this.d = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
            this.af = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.d == null) {
            this.d = new QuestionMetrics();
        }
        boolean[] zArr = this.af;
        if (zArr == null) {
            dubq dubqVar = this.a;
            if (dubqVar.a == 5) {
                dubbVar3 = (dubb) dubqVar.b;
            } else {
                dubbVar3 = dubb.b;
            }
            dtzc dtzcVar = dubbVar3.a;
            if (dtzcVar == null) {
                dtzcVar = dtzc.b;
            }
            this.af = new boolean[dtzcVar.a.size()];
            return;
        }
        int length = zArr.length;
        dubq dubqVar2 = this.a;
        if (dubqVar2.a == 5) {
            dubbVar = (dubb) dubqVar2.b;
        } else {
            dubbVar = dubb.b;
        }
        dtzc dtzcVar2 = dubbVar.a;
        if (dtzcVar2 == null) {
            dtzcVar2 = dtzc.b;
        }
        if (length == dtzcVar2.a.size()) {
            return;
        }
        int length2 = this.af.length;
        StringBuilder sb = new StringBuilder(64);
        sb.append("Saved instance state responses had incorrect length: ");
        sb.append(length2);
        sb.toString();
        dubq dubqVar3 = this.a;
        if (dubqVar3.a == 5) {
            dubbVar2 = (dubb) dubqVar3.b;
        } else {
            dubbVar2 = dubb.b;
        }
        dtzc dtzcVar3 = dubbVar2.a;
        if (dtzcVar3 == null) {
            dtzcVar3 = dtzc.b;
        }
        this.af = new boolean[dtzcVar3.a.size()];
    }

    @Override // defpackage.czrr
    public final String p() {
        return this.a.e.isEmpty() ? this.a.d : this.a.e;
    }

    @Override // defpackage.czrr
    public final View q() {
        dubb dubbVar;
        this.ag = (LinearLayout) LayoutInflater.from(H()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        czpu czpuVar = new czpu(H());
        czpuVar.setOnAnswerSelectClickListener(new czpt(this) { // from class: czpl
            private final czpm a;

            {
                this.a = this;
            }

            @Override // defpackage.czpt
            public final void a(czps czpsVar) {
                czpm czpmVar = this.a;
                ff e = czpmVar.e();
                if (e == null) {
                    return;
                }
                if (!czpsVar.a()) {
                    ((SurveyActivity) e).q(false);
                    return;
                }
                czpmVar.e = czpsVar;
                czpmVar.d.b();
                ((czpw) e).b(czpmVar.w(), czpmVar);
            }
        });
        dubq dubqVar = this.a;
        if (dubqVar.a == 5) {
            dubbVar = (dubb) dubqVar.b;
        } else {
            dubbVar = dubb.b;
        }
        czpuVar.setUpMultipleSelectView(dubbVar, this.af);
        this.ag.addView(czpuVar);
        return this.ag;
    }

    @Override // defpackage.czrr, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putParcelable("QuestionMetrics", this.d);
        bundle.putBooleanArray("ResponsesAsArray", this.af);
    }

    public final boolean w() {
        czps czpsVar = this.e;
        if (czpsVar == null) {
            return false;
        }
        return czpsVar.a();
    }
}
