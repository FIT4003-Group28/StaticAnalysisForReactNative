package defpackage;

import com.google.android.apps.gmm.inappsurvey.api.SurveyData;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aezy  reason: default package */
/* loaded from: classes2.dex */
public final class aezy implements bvwz {
    public final gga a;
    public final dxio<aezk> b;
    public final SurveyData c;

    public aezy(SurveyData surveyData, dxio<aezk> dxioVar, gga ggaVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = surveyData;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: aezw
            private final aezy a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final aezy aezyVar = this.a;
                Map map = (Map) obj;
                aezyVar.a.runOnUiThread(new Runnable(aezyVar) { // from class: aezx
                    private final aezy a;

                    {
                        this.a = aezyVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aezy aezyVar2 = this.a;
                        aezyVar2.b.a().f();
                        aezyVar2.b.a().k(aezl.GENERIC_ERROR, aezyVar2.c);
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
        return "in_app_survey.on_error";
    }
}
