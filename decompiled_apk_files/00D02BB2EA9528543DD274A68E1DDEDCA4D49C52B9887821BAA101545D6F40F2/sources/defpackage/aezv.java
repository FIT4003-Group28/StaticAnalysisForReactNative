package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.inappsurvey.api.SurveyData;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aezv  reason: default package */
/* loaded from: classes2.dex */
public final class aezv implements bvwz {
    public final SurveyData a;

    public aezv(SurveyData surveyData) {
        this.a = surveyData;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: aezu
            private final aezv a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Map map = (Map) obj;
                Bundle e = this.a.a.e();
                Set<String> keySet = e.keySet();
                HashMap hashMap = new HashMap();
                for (String str : keySet) {
                    Object obj2 = e.get(str);
                    if (obj2 instanceof String) {
                        hashMap.put(str, obj2);
                    }
                }
                return hashMap;
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
        return "in_app_survey.get_survey_parameters";
    }
}
