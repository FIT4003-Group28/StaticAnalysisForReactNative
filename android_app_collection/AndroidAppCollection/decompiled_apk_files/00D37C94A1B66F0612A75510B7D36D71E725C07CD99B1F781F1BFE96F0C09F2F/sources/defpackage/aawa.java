package defpackage;

import com.google.protos.youtube.api.innertube.UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aawa  reason: default package */
/* loaded from: classes.dex */
final class aawa implements afzf {
    final /* synthetic */ apzg a;
    final /* synthetic */ Map b;
    final /* synthetic */ aqyh c;
    final /* synthetic */ aawd d;

    public aawa(aawd aawdVar, apzg apzgVar, Map map, aqyh aqyhVar) {
        this.d = aawdVar;
        this.a = apzgVar;
        this.b = map;
        this.c = aqyhVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.d.c.d(new aawe(this.a, zew.I(this.b, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        aqyh aqyhVar = this.c;
        if (aqyhVar == null || (aqyhVar.b & 32) == 0) {
            this.d.g.e(cffVar);
            return;
        }
        aafo aafoVar = this.d.d;
        apzg apzgVar = aqyhVar.h;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, this.b);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arrw arrwVar = (arrw) obj;
        this.d.c.d(new aawe(this.a, zew.I(this.b, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        Object I = zew.I(this.b, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (I instanceof afzf) {
            ((afzf) I).lG(arrwVar);
        }
        aqyh aqyhVar = this.c;
        if (aqyhVar != null) {
            if (aqyhVar.f.size() > 0) {
                for (apzg apzgVar : this.c.f) {
                    aawd aawdVar = this.d;
                    aawdVar.d.c(aawdVar.e.a(apzgVar, arrwVar), this.b);
                }
            }
            aqyi aqyiVar = this.c.i;
            if (aqyiVar == null) {
                aqyiVar = aqyi.a;
            }
            if (aqyiVar.b) {
                this.d.c.d(new aawi(this.a, I));
            }
            if (arrwVar.d.size() > 0) {
                this.d.d.d(arrwVar.d, this.b);
            }
        } else if (this.a.qn(UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.undoFeedbackEndpoint)) {
            this.d.c.d(new aawj(this.a, I, zew.I(this.b, "feedback_undo")));
            aopu aopuVar = ((UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint) this.a.qm(UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.undoFeedbackEndpoint)).c;
            if (aopuVar.size() > 0) {
                this.d.d.d(aopuVar, this.b);
            }
        }
        this.d.f.a(arrwVar, I);
        this.d.b(arrwVar.e);
    }
}
