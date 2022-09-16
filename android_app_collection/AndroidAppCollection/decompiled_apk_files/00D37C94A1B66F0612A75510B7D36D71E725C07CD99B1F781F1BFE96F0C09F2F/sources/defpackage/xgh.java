package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: xgh  reason: default package */
/* loaded from: classes4.dex */
final class xgh implements xgd {
    final /* synthetic */ xgm a;

    public xgh(xgm xgmVar) {
        this.a = xgmVar;
    }

    @Override // defpackage.xgd
    public final void a(Bundle bundle) {
        xgm xgmVar = this.a;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            hashMap.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
        }
        SurveyAd surveyAd = xgmVar.e;
        if (surveyAd == null || surveyAd.A() == null) {
            return;
        }
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xgmVar.b);
        xgmVar.a.c(xgmVar.e.A(), hashMap);
    }

    @Override // defpackage.xgd
    public final void b(int[] iArr) {
        xgm xgmVar = this.a;
        if (xgmVar.h != null) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                arrayList.add(Integer.valueOf(i));
            }
            xgmVar.h.d(arrayList);
            xgmVar.c.q(xgmVar.h);
        }
        xgmVar.c.h();
        xgmVar.b(wzq.SURVEY_ENDED);
    }

    @Override // defpackage.xgd
    public final void c(int i, int i2) {
        xgm xgmVar = this.a;
        xec xecVar = xgmVar.h;
        if (xecVar != null) {
            xecVar.e();
            xgmVar.h.c();
            xgmVar.c.q(xgmVar.h);
        }
        xgmVar.c.j(i, i2);
        xgmVar.b(wzq.USER_SKIPPED);
    }
}
