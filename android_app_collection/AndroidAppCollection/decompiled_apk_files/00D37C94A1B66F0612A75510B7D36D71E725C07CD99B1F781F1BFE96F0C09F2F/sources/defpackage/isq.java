package defpackage;

import com.google.protos.youtube.api.innertube.ShowContentPillActionOuterClass$ShowContentPillAction;
import java.util.Map;
/* compiled from: PG */
/* renamed from: isq  reason: default package */
/* loaded from: classes3.dex */
public final class isq implements aafl {
    private final fwx a;

    public isq(fwx fwxVar) {
        this.a = fwxVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqgu aqguVar;
        auva auvaVar = ((ShowContentPillActionOuterClass$ShowContentPillAction) apzgVar.qm(ShowContentPillActionOuterClass$ShowContentPillAction.showContentPillAction)).b;
        if (auvaVar == null) {
            auvaVar = auva.a;
        }
        if (auvaVar.b != 127508420 || !this.a.d()) {
            return;
        }
        fwx fwxVar = this.a;
        if (auvaVar.b == 127508420) {
            aqguVar = (aqgu) auvaVar.c;
        } else {
            aqguVar = aqgu.a;
        }
        this.a.f(fwxVar.g(aqguVar), true);
    }
}
