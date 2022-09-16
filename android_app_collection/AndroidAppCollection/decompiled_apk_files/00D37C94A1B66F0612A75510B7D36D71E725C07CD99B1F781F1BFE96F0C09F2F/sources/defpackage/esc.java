package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.NotificationReminderDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand;
import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
import com.google.protos.youtube.api.innertube.UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction;
import java.util.Map;
/* compiled from: PG */
/* renamed from: esc  reason: default package */
/* loaded from: classes3.dex */
public final class esc implements aafl {
    private final /* synthetic */ int a;

    public esc() {
    }

    public esc(int i) {
        this.a = i;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aslq aslqVar;
        abhh abhhVar;
        int i = 1;
        switch (this.a) {
            case 0:
                UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction = (UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction) apzgVar.qm(UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.updateHorizontalCardListAction);
                String str = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.b == 3 ? (String) updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.c : "";
                akaf akafVar = (akaf) zew.K(map, "sectionListController", akaf.class);
                if (akafVar == null) {
                    zep.b("Cannot perform UpdateHorizontalCardListAction on a null section list controller.");
                    return;
                } else if (!str.isEmpty()) {
                    avsx avsxVar = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.d;
                    if (avsxVar == null) {
                        avsxVar = avsx.a;
                    }
                    if (avsxVar.b != 50195462) {
                        zep.b("Cannot perform UpdateHorizontalCardListAction with a null replacement ItemSectionRenderer.");
                        return;
                    }
                    avsx avsxVar2 = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.d;
                    if (avsxVar2 == null) {
                        avsxVar2 = avsx.a;
                    }
                    if (avsxVar2.b == 50195462) {
                        aslqVar = (aslq) avsxVar2.c;
                    } else {
                        aslqVar = aslq.a;
                    }
                    ajyq ajyqVar = (ajyq) akafVar.s(str);
                    if (ajyqVar == null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 103);
                        sb.append("Cannot perform UpdateHorizontalCardListAction. An ItemSectionController identified by \"");
                        sb.append(str);
                        sb.append("\" was not found.");
                        zep.b(sb.toString());
                        return;
                    }
                    ajyqVar.i(new aakq(aslqVar));
                    if (ajyqVar.lA().a() <= 0 || !(akafVar instanceof ajzq)) {
                        return;
                    }
                    RecyclerView recyclerView = ((ajzq) akafVar).f60J;
                    if (recyclerView.canScrollVertically(-1)) {
                        return;
                    }
                    xw xwVar = recyclerView.n;
                    if (!(xwVar instanceof LinearLayoutManager)) {
                        return;
                    }
                    int I = ((LinearLayoutManager) xwVar).I();
                    ajqm r = akafVar.r();
                    Object c = ajyqVar.lA().c(0);
                    for (int i2 = 0; i2 <= I; i2++) {
                        if (r.c(i2) == c) {
                            akafVar.lp(str);
                            return;
                        }
                    }
                    return;
                } else {
                    zep.b("Cannot perform UpdateHorizontalCardListAction without a section identifier.");
                    return;
                }
            case 1:
                return;
            case 2:
                apzgVar.qn(aqmj.b);
                return;
            case 3:
                ((hop) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", hop.class)).d();
                return;
            case 4:
                icr icrVar = (icr) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", icr.class);
                aqxo.p(apzgVar.qn(ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.reelWatchSurveyActionCommand));
                ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand = (ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand) apzgVar.qm(ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.reelWatchSurveyActionCommand);
                int by = awwc.by(reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.c);
                if (by != 0) {
                    i = by;
                }
                if (i == 2) {
                    icrVar.f(reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.b);
                    return;
                } else if (i != 3) {
                    return;
                } else {
                    icrVar.c(reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.b);
                    return;
                }
            case 5:
                xnt xntVar = (xnt) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xnt.class);
                if (!apzgVar.qn(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.updateBackstagePollAction) || xntVar == null) {
                    return;
                }
                xntVar.a((UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) apzgVar.qm(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.updateBackstagePollAction));
                return;
            case 6:
                return;
            case 7:
                if (!apzgVar.qn(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)) {
                    return;
                }
                LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = (LiveChatEndpointOuterClass$LiveChatEndpoint) apzgVar.qm(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
                if ((liveChatEndpointOuterClass$LiveChatEndpoint.b & 2) == 0 || (abhhVar = (abhh) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", abhh.class)) == null) {
                    return;
                }
                assp asspVar = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                if (asspVar == null) {
                    asspVar = assp.a;
                }
                if ((asspVar.b & 1) != 0) {
                    assp asspVar2 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asspVar2 == null) {
                        asspVar2 = assp.a;
                    }
                    aumx aumxVar = asspVar2.c;
                    if (aumxVar == null) {
                        aumxVar = aumx.a;
                    }
                    abhhVar.d(ajna.g(aumxVar));
                    return;
                }
                assp asspVar3 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                if (asspVar3 == null) {
                    asspVar3 = assp.a;
                }
                if ((asspVar3.b & 2) != 0) {
                    assp asspVar4 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asspVar4 == null) {
                        asspVar4 = assp.a;
                    }
                    avia aviaVar = asspVar4.d;
                    if (aviaVar == null) {
                        aviaVar = avia.a;
                    }
                    abhhVar.d(ajna.g(aviaVar));
                    return;
                }
                assp asspVar5 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                if (asspVar5 == null) {
                    asspVar5 = assp.a;
                }
                if ((asspVar5.b & 4) != 0) {
                    assp asspVar6 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asspVar6 == null) {
                        asspVar6 = assp.a;
                    }
                    askw askwVar = asspVar6.e;
                    if (askwVar == null) {
                        askwVar = askw.a;
                    }
                    abhhVar.d(ajna.g(askwVar));
                    return;
                }
                assp asspVar7 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                if (asspVar7 == null) {
                    asspVar7 = assp.a;
                }
                if ((asspVar7.b & 8) != 0) {
                    assp asspVar8 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asspVar8 == null) {
                        asspVar8 = assp.a;
                    }
                    assq assqVar = asspVar8.f;
                    if (assqVar == null) {
                        assqVar = assq.a;
                    }
                    abhhVar.d(ajna.g(assqVar));
                    return;
                }
                assp asspVar9 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                if (asspVar9 == null) {
                    asspVar9 = assp.a;
                }
                if ((asspVar9.b & 16) == 0) {
                    return;
                }
                assp asspVar10 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                if (asspVar10 == null) {
                    asspVar10 = assp.a;
                }
                aubu aubuVar = asspVar10.g;
                if (aubuVar == null) {
                    aubuVar = aubu.a;
                }
                abhhVar.d(ajna.g(aubuVar));
                return;
            default:
                if (!apzgVar.qn(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)) {
                    return;
                }
                aunb aunbVar = ((OpenDialogCommandOuterClass$OpenDialogCommand) apzgVar.qm(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                aunbVar.qn(NotificationReminderDialogRendererOuterClass.notificationReminderDialogRenderer);
                return;
        }
    }
}
