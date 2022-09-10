package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.surveys.SurveyMetadata;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: acws  reason: default package */
/* loaded from: classes2.dex */
public final class acws implements acwp {
    public final akfa a;
    public final cjqy b;
    public final bvjj c;
    public final bubp e;
    public final acwq f = new acwq(this);
    @dzsi
    public SurveyMetadata d = null;

    public acws(Context context, CronetEngine cronetEngine, bubp bubpVar, akfa akfaVar, cjqy cjqyVar, bvjj bvjjVar) {
        dbsk.s(context);
        dbsk.s(cronetEngine);
        dbsk.b(true, "SDK < 16 isn't supported");
        czod czodVar = czod.a;
        if (czov.a == null) {
            czov.a = new cxji(context);
        }
        int i = czph.a;
        dbsk.s(cronetEngine);
        czpc.a.b = cronetEngine;
        czpc.a.c = new czoe(context);
        this.e = bubpVar;
        this.a = akfaVar;
        this.b = cjqyVar;
        this.c = bvjjVar;
    }

    @Override // defpackage.acwp
    public final void a(ff ffVar) {
        SurveyMetadata surveyMetadata = this.d;
        if (surveyMetadata == null || ffVar == null) {
            return;
        }
        czod czodVar = czod.a;
        czpb a = czpb.a();
        synchronized (czod.b) {
            SurveyDataImpl surveyDataImpl = czodVar.c;
            if (surveyDataImpl == null) {
                return;
            }
            if (!TextUtils.equals(surveyMetadata.a, surveyDataImpl.a)) {
                return;
            }
            if (!TextUtils.equals(surveyMetadata.c, czodVar.c.b())) {
                return;
            }
            if (!TextUtils.equals(surveyMetadata.b, czodVar.c.b)) {
                return;
            }
            gn g = ffVar.g();
            fd H = g.H(czsp.ad);
            if (H != null) {
                gz b = g.b();
                b.u(H);
                b.r();
            }
            fd H2 = g.H("com.google.android.libraries.surveys.internal.PromptDialogFragment");
            if (H2 == null) {
                Intent intent = new Intent(ffVar, SurveyActivity.class);
                intent.setClassName(ffVar, "com.google.android.libraries.surveys.internal.view.SurveyActivity");
                intent.putExtra("IsDismissing", true);
                ffVar.startActivity(intent);
            } else {
                gz b2 = g.b();
                b2.u(H2);
                b2.r();
            }
            String str = TextUtils.isEmpty(czodVar.d) ? null : czodVar.d;
            if (czov.a(dydo.b(czov.a))) {
                czoz a2 = czoz.a();
                dtue bZ = dtuu.c.bZ();
                dtui dtuiVar = dtui.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dtuu dtuuVar = (dtuu) bZ.b;
                dtuiVar.getClass();
                dtuuVar.b = dtuiVar;
                dtuuVar.a = 5;
                a2.d(bZ.bK(), a.b(), a.c(), ffVar, str);
            }
        }
    }
}
