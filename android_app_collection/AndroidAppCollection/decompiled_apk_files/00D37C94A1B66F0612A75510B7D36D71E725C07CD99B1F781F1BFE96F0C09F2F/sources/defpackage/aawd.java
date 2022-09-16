package defpackage;

import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aawd  reason: default package */
/* loaded from: classes.dex */
public class aawd implements aafl {
    public static final aawb a = aavy.a;
    public static final aawc b = aavz.a;
    public final yni c;
    public final aafo d;
    public final aawb e;
    public final aawc f;
    public final yzj g;
    private final aawh h;

    public aawd(aawh aawhVar, yni yniVar, aafo aafoVar, aawb aawbVar, aawc aawcVar, yzj yzjVar) {
        aawhVar.getClass();
        this.h = aawhVar;
        yniVar.getClass();
        this.c = yniVar;
        aafoVar.getClass();
        this.d = aafoVar;
        aawbVar.getClass();
        this.e = aawbVar;
        aawcVar.getClass();
        this.f = aawcVar;
        this.g = yzjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(aoob aoobVar) {
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aawg a2 = this.h.a();
        aqyh aqyhVar = apzgVar.qn(FeedbackEndpointOuterClass.feedbackEndpoint) ? (aqyh) apzgVar.qm(FeedbackEndpointOuterClass.feedbackEndpoint) : null;
        a2.t(aqyhVar != null ? aqyhVar.e : ((UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint) apzgVar.qm(UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.undoFeedbackEndpoint)).b);
        List<String> list = (List) zew.K(map, "feedback_token", List.class);
        if (list != null) {
            for (String str : list) {
                a2.t(str);
            }
        }
        if (((Boolean) zew.J(map, "feedback_merge_token", false)).booleanValue()) {
            a2.u(true);
        }
        if (((Boolean) zew.J(map, "feedback_unencrypted", false)).booleanValue()) {
            a2.b = true;
        }
        if (aqyhVar != null) {
            a2.a = aqyhVar.g;
            if (aqyhVar.c == 7) {
                a2.c = Long.valueOf(((Long) aqyhVar.d).longValue());
            }
        }
        if (apzgVar.qn(auqs.b)) {
            auqr auqrVar = (auqr) apzgVar.qm(auqs.b);
            if (!auqrVar.c.isEmpty()) {
                a2.l(auqrVar.c);
            }
        }
        a2.k(aafx.a(apzgVar).I());
        this.c.d(new aawf(apzgVar, zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        this.h.a.e(a2, new aawa(this, apzgVar, map, aqyhVar));
    }
}
