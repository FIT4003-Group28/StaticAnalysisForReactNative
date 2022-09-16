package defpackage;

import com.google.protos.youtube.api.innertube.SubmitSurveyCommandOuterClass$SubmitSurveyCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gne  reason: default package */
/* loaded from: classes3.dex */
public final class gne implements aafl {
    public static final /* synthetic */ int d = 0;
    public final snc a;
    public final xew b;
    public final wzd c;
    private final aagi e;
    private final azqb f;
    private final azqb g;

    public gne(aagi aagiVar, snc sncVar, xfc xfcVar, wzb wzbVar, azqb azqbVar, azqb azqbVar2) {
        this.e = aagiVar;
        this.a = sncVar;
        this.b = xfcVar.b(new gnd());
        this.c = wzbVar.a();
        this.f = azqbVar;
        this.g = azqbVar2;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(SubmitSurveyCommandOuterClass$SubmitSurveyCommand.submitSurveyCommand)) {
            return;
        }
        final SubmitSurveyCommandOuterClass$SubmitSurveyCommand submitSurveyCommandOuterClass$SubmitSurveyCommand = (SubmitSurveyCommandOuterClass$SubmitSurveyCommand) apzgVar.qm(SubmitSurveyCommandOuterClass$SubmitSurveyCommand.submitSurveyCommand);
        xiw xiwVar = (xiw) this.f.get();
        ylr.c();
        if (xiwVar.d != null) {
            xiwVar.d.y();
        }
        this.e.c().f(submitSurveyCommandOuterClass$SubmitSurveyCommand.c).g(aril.class).o(new ayqb() { // from class: gnc
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                gne gneVar = gne.this;
                SubmitSurveyCommandOuterClass$SubmitSurveyCommand submitSurveyCommandOuterClass$SubmitSurveyCommand2 = submitSurveyCommandOuterClass$SubmitSurveyCommand;
                aril arilVar = (aril) obj;
                if (arilVar == null) {
                    afus.b(2, 1, "Null survey entity on submit");
                    return;
                }
                xec xecVar = new xec(null, gneVar.a);
                if (submitSurveyCommandOuterClass$SubmitSurveyCommand2.d) {
                    xecVar.c();
                    xecVar.e();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < arilVar.getIsSelected().size(); i++) {
                        if (((Boolean) arilVar.getIsSelected().get(i)).booleanValue()) {
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                    xecVar.d(arrayList);
                }
                xecVar.c = arilVar.getDisplayTime().longValue();
                aval avalVar = submitSurveyCommandOuterClass$SubmitSurveyCommand2.b;
                if (avalVar == null) {
                    avalVar = aval.a;
                }
                for (Map.Entry entry : xecVar.b(avalVar)) {
                    gneVar.b.d((apae) entry.getKey(), (List) entry.getValue(), true, gneVar.c);
                }
            }
        }).m(fzc.m).l(fzb.f).S();
        ((wnk) this.g.get()).a();
    }
}
