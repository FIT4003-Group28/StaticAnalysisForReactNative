package defpackage;

import com.google.android.apps.gmm.inappsurvey.api.SurveyData;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afac  reason: default package */
/* loaded from: classes2.dex */
public final class afac implements bvwz {
    public final SurveyData a;
    public final dxio<aezk> b;
    public final gga c;

    public afac(SurveyData surveyData, dxio<aezk> dxioVar, gga ggaVar) {
        this.a = surveyData;
        this.b = dxioVar;
        this.c = ggaVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: afaa
            private final afac a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final afac afacVar = this.a;
                Map map = (Map) obj;
                afacVar.b.a().i(afacVar.a);
                afacVar.c.runOnUiThread(new Runnable(afacVar) { // from class: afab
                    private final afac a;

                    {
                        this.a = afacVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        afac afacVar2 = this.a;
                        afacVar2.b.a().f();
                        afacVar2.b.a().j();
                    }
                });
                return bvwy.a;
            }
        };
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "in_app_survey.on_survey_completed";
    }
}
