package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gmm.inappsurvey.AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl;
import com.google.android.apps.gmm.inappsurvey.api.SurveyData;
import com.google.android.apps.gmm.inappsurvey.webview.SurveyWebViewCallbacks;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aezj  reason: default package */
/* loaded from: classes2.dex */
public final class aezj extends itb implements aezk {
    public final auon a;
    private long b = -1;
    private final bvvw c;
    private final afag d;
    private final gga e;
    private final Executor f;
    private final btpc g;
    private final akfa h;
    private final auom i;
    private final cztz j;
    private final cqkj k;
    private final cqat o;

    public aezj(bvvw bvvwVar, afag afagVar, auon auonVar, gga ggaVar, cqkj cqkjVar, btpc btpcVar, akfa akfaVar, cqat cqatVar, auom auomVar, Executor executor, cztz cztzVar) {
        this.c = bvvwVar;
        this.d = afagVar;
        this.a = auonVar;
        this.e = ggaVar;
        this.k = cqkjVar;
        this.f = executor;
        this.g = btpcVar;
        this.h = akfaVar;
        this.o = cqatVar;
        this.i = auomVar;
        this.j = cztzVar;
    }

    @Override // defpackage.aezk
    public final void e(SurveyData surveyData) {
        String b = surveyData.b();
        if (b == null) {
            k(aezl.GENERIC_ERROR, surveyData);
        } else if (this.g.i()) {
            if (this.h.j().l()) {
                fd K = this.e.K();
                if ((K instanceof ges) && ((ges) K).p() == dtxs.p) {
                    return;
                }
                bvvw bvvwVar = this.c;
                afag afagVar = this.d;
                gga ggaVar = this.e;
                bvxn bZ = bvxu.A.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar = (bvxu) bZ.b;
                b.getClass();
                int i = bvxuVar.a | 1;
                bvxuVar.a = i;
                bvxuVar.b = b;
                int i2 = i | 4;
                bvxuVar.a = i2;
                bvxuVar.d = true;
                bvxuVar.a = i2 | 32;
                bvxuVar.g = true;
                bvxu.b(bvxuVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar2 = (bvxu) bZ.b;
                int i3 = bvxuVar2.a | 64;
                bvxuVar2.a = i3;
                bvxuVar2.h = "IN_APP_SURVEY";
                bvxuVar2.a = i3 | 8;
                bvxuVar2.e = false;
                dkyx dkyxVar = afagVar.a.getEnableFeatureParameters().au;
                if (dkyxVar == null) {
                    dkyxVar = dkyx.f;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar3 = (bvxu) bZ.b;
                dkyxVar.getClass();
                bvxuVar3.j = dkyxVar;
                bvxuVar3.a |= 256;
                bvxj bZ2 = bvxm.e.bZ();
                String string = ggaVar.getString(R.string.INAPP_SURVEY_YOUR_FEEDBACK_HEADER);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                bvxm bvxmVar = (bvxm) bZ2.b;
                string.getClass();
                bvxmVar.a |= 1;
                bvxmVar.b = string;
                bvxm bvxmVar2 = (bvxm) bZ2.b;
                bvxmVar2.c = 2;
                bvxmVar2.a = 2 | bvxmVar2.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar4 = (bvxu) bZ.b;
                bvxm bK = bZ2.bK();
                bK.getClass();
                bvxuVar4.t = bK;
                bvxuVar4.a |= 262144;
                bvxp f = bvoa.f(ibm.b(), ggaVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar5 = (bvxu) bZ.b;
                f.getClass();
                bvxuVar5.x = f;
                int i4 = bvxuVar5.a | 4194304;
                bvxuVar5.a = i4;
                bvxuVar5.a = i4 | 16;
                bvxuVar5.f = 1;
                bvxu.c(bvxuVar5);
                bvvwVar.k(bZ.bK(), new SurveyWebViewCallbacks(surveyData), dtxs.p);
                this.b = this.o.b();
                return;
            }
            k(aezl.SIGNED_OUT_ERROR, surveyData);
        } else {
            k(aezl.OFFLINE_ERROR, surveyData);
        }
    }

    @Override // defpackage.aezk
    public final void f() {
        gn g = this.e.g();
        if (g == null || g.J()) {
            return;
        }
        g.f();
    }

    @Override // defpackage.aezk
    public final void i(SurveyData surveyData) {
        if (this.i.b) {
            final String a = auqm.a(3, surveyData.c());
            this.f.execute(new Runnable(this, a) { // from class: aezf
                private final aezj a;
                private final String b;

                {
                    this.a = this;
                    this.b = a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aezj aezjVar = this.a;
                    aezjVar.a.d(this.b);
                }
            });
        }
    }

    @Override // defpackage.aezk
    public final void j() {
        gga ggaVar = this.e;
        if (ggaVar.aZ) {
            this.j.d(ggaVar.getWindowManager(), true);
        }
        cztq a = cztt.a(this.j);
        a.e(R.string.INAPP_SURVEY_THANK_YOU_SNACKBAR_TEXT, new Object[0]);
        a.d(cztr.LONG);
        cztt b = a.a(R.string.DISMISS, aezg.a).b();
        b.b.setImportantForAccessibility(2);
        b.b();
    }

    @Override // defpackage.aezk
    public final void k(aezl aezlVar, SurveyData surveyData) {
        gga ggaVar = this.e;
        aezq aezqVar = new aezq();
        Bundle bundle = new Bundle();
        bundle.putInt("ERROR_TYPE", aezlVar.ordinal());
        bundle.putParcelable("SURVEY_DATA", surveyData);
        aezqVar.B(bundle);
        ggaVar.D(aezqVar);
    }

    @Override // defpackage.aezk
    public final boolean l() {
        if (this.b == -1 || this.o.b() - this.b < 5000) {
            return false;
        }
        iii iiiVar = new iii();
        iiiVar.a = this.e.getString(R.string.INAPP_SURVEY_EXIT_CONFIRMATION_DIALOG_TITLE);
        iiiVar.c(this.e.getString(R.string.YES_BUTTON), new View.OnClickListener(this) { // from class: aezh
            private final aezj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f();
            }
        }, cjtd.b);
        iiiVar.d(this.e.getString(R.string.NO_BUTTON), aezi.a, cjtd.b);
        iiiVar.a(this.e, this.k).k();
        return true;
    }

    @Override // defpackage.aezk
    public final SurveyData m(Intent intent) {
        return new AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl(intent);
    }
}
