package defpackage;

import com.google.protos.youtube.api.innertube.MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gmo  reason: default package */
/* loaded from: classes3.dex */
public final class gmo implements aafl {
    public static final /* synthetic */ int b = 0;
    public final snc a;
    private final aagi c;

    public gmo(aagi aagiVar, snc sncVar) {
        this.c = aagiVar;
        this.a = sncVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.markBelowPlayerSurveyDisplayedCommand)) {
            return;
        }
        final aagh c = this.c.c();
        c.f(((MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand) apzgVar.qm(MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.markBelowPlayerSurveyDisplayedCommand)).b).g(aril.class).l(fzb.d).c(new ayqe() { // from class: gmn
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                gmo gmoVar = gmo.this;
                aajl aajlVar = c;
                aril arilVar = (aril) obj;
                if (arilVar == null) {
                    afus.b(2, 1, "Survey entity is null in onSuccess on display");
                    return aynr.f();
                }
                aahb c2 = ((aagu) aajlVar).c();
                arij e = arilVar.e();
                Long valueOf = Long.valueOf(gmoVar.a.c());
                aopa aopaVar = e.a;
                long longValue = valueOf.longValue();
                aopaVar.copyOnWrite();
                arii ariiVar = (arii) aopaVar.instance;
                arii ariiVar2 = arii.a;
                ariiVar.b = 2 | ariiVar.b;
                ariiVar.d = longValue;
                c2.j(e);
                return c2.b();
            }
        }).q(fzc.j).Q();
    }
}
