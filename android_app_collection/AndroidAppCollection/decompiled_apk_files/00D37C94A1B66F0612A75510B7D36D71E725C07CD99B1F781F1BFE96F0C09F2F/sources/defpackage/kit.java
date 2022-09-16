package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kit  reason: default package */
/* loaded from: classes3.dex */
public final class kit implements View.OnClickListener {
    final /* synthetic */ kiu a;
    private final /* synthetic */ int b;

    public kit(kiu kiuVar) {
        this.a = kiuVar;
    }

    public kit(kiu kiuVar, int i) {
        this.b = i;
        this.a = kiuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            xgi xgiVar = this.a.i;
            if (xgiVar == null) {
                return;
            }
            xgm xgmVar = xgiVar.a;
            xgm.j(xgmVar.g);
            SurveyAd surveyAd = xgmVar.e;
            if (surveyAd == null) {
                return;
            }
            xgmVar.a.d(surveyAd.c.f, xgmVar.a());
            xgmVar.i();
            return;
        }
        kiu kiuVar = this.a;
        if (kiuVar.i == null || kiuVar.g == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        aunb aunbVar = this.a.g.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aoyl aoylVar = (aoyl) ajjh.l(aunbVar, AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        if (aoylVar != null) {
            arrayList.addAll(aoylVar.n);
            if ((aoylVar.b & 512) != 0) {
                apzg apzgVar = aoylVar.m;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                arrayList.add(apzgVar);
            }
        }
        xgm xgmVar2 = this.a.i.a;
        xgm.j(xgmVar2.g);
        aafx.d(xgmVar2.a, arrayList, xgmVar2.a());
        xgmVar2.i();
    }
}
