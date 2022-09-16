package defpackage;

import com.google.protos.youtube.api.innertube.ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction;
import java.util.Map;
/* compiled from: PG */
/* renamed from: isv  reason: default package */
/* loaded from: classes3.dex */
public final class isv implements aafl {
    private final ajqa a;
    private final yni b;

    public isv(ajqa ajqaVar, yni yniVar) {
        ajqaVar.getClass();
        this.a = ajqaVar;
        yniVar.getClass();
        this.b = yniVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        aunk aunkVar = ((ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) apzgVar.qm(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction)).c;
        if (aunkVar == null) {
            aunkVar = aunk.a;
        }
        if (I != null) {
            this.b.d(isw.a(I, aunkVar));
        }
        if ((aunkVar.b & 16) != 0) {
            apsm apsmVar = aunkVar.g;
            if (apsmVar == null) {
                apsmVar = apsm.a;
            }
            iis iisVar = new iis(apsmVar);
            this.a.c(iisVar.b, iisVar);
        }
    }
}
