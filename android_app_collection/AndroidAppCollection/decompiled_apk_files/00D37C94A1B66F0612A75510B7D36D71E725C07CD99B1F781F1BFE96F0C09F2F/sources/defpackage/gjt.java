package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.protos.youtube.api.innertube.GetSurveyCommandOuterClass$GetSurveyCommand;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gjt */
/* loaded from: classes3.dex */
public final class gjt implements aafl {
    public final HatsController a;
    public final acth b;
    private final abdm c;
    private final Executor d;

    public gjt(abdm abdmVar, HatsController hatsController, Executor executor, acth acthVar) {
        this.c = abdmVar;
        this.a = hatsController;
        this.d = executor;
        this.b = acthVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(GetSurveyCommandOuterClass$GetSurveyCommand.getSurveyCommand)) {
            return;
        }
        GetSurveyCommandOuterClass$GetSurveyCommand getSurveyCommandOuterClass$GetSurveyCommand = (GetSurveyCommandOuterClass$GetSurveyCommand) apzgVar.qm(GetSurveyCommandOuterClass$GetSurveyCommand.getSurveyCommand);
        asdu asduVar = getSurveyCommandOuterClass$GetSurveyCommand.b;
        if (asduVar == null) {
            asduVar = asdu.a;
        }
        abdl a = this.c.a();
        a.i();
        a.a = asduVar;
        int y = akpq.y(getSurveyCommandOuterClass$GetSurveyCommand.c);
        if (y == 0) {
            y = 1;
        }
        a.b = y;
        ylx.k(this.c.b(a), this.d, dzl.s, new ylw() { // from class: gjs
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                aunb aunbVar;
                gjt gjtVar = gjt.this;
                asdw asdwVar = (asdw) obj;
                gjtVar.b.oi().D(new acte(asdwVar.e));
                if ((asdwVar.b & 2) != 0) {
                    aunbVar = asdwVar.d;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                } else {
                    aunbVar = null;
                }
                avdv avdvVar = (avdv) ajjh.l(aunbVar, SurveyRenderer.surveyTriggerRenderer);
                if (avdvVar == null || (avdvVar.b & 16) == 0) {
                    return;
                }
                HatsController hatsController = gjtVar.a;
                avdu avduVar = avdvVar.c;
                if (avduVar == null) {
                    avduVar = avdu.a;
                }
                hatsController.k(avduVar);
            }
        });
    }
}
