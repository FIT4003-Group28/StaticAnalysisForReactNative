package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.SurveyEndpointOuterClass$SurveyEndpoint;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import java.util.Map;
/* compiled from: PG */
/* renamed from: erx  reason: default package */
/* loaded from: classes3.dex */
public final class erx implements aafl {
    private final HatsController a;

    public erx(HatsController hatsController) {
        hatsController.getClass();
        this.a = hatsController;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        asqb asqbVar = (asqb) apzgVar.qm(LiveChatAction.showLiveChatSurveyCommand);
        aunb aunbVar = asqbVar.b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(SurveyRenderer.surveyTriggerRenderer)) {
            aunb aunbVar2 = asqbVar.b;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            avdv avdvVar = (avdv) aunbVar2.qm(SurveyRenderer.surveyTriggerRenderer);
            if ((avdvVar.b & 16) == 0) {
                return;
            }
            HatsController hatsController = this.a;
            avdu avduVar = avdvVar.c;
            if (avduVar == null) {
                avduVar = avdu.a;
            }
            hatsController.k(avduVar);
        } else if (!apzgVar.qn(SurveyEndpointOuterClass$SurveyEndpoint.surveyEndpoint)) {
        } else {
            HatsController hatsController2 = this.a;
            avdu avduVar2 = ((SurveyEndpointOuterClass$SurveyEndpoint) apzgVar.qm(SurveyEndpointOuterClass$SurveyEndpoint.surveyEndpoint)).b;
            if (avduVar2 == null) {
                avduVar2 = avdu.a;
            }
            hatsController2.k(avduVar2);
        }
    }
}
