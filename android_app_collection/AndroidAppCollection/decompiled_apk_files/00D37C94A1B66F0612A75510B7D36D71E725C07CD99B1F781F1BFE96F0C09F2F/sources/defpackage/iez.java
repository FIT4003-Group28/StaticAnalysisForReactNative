package defpackage;

import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: iez  reason: default package */
/* loaded from: classes3.dex */
public final class iez {
    public final Map a = new HashMap();

    public static avaq a(aulr aulrVar) {
        aunb aunbVar = aulrVar.n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
            aunb aunbVar2 = aulrVar.n;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            return (avaq) aunbVar2.qm(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        }
        return null;
    }

    public static String b(avaq avaqVar) {
        if (avaqVar != null) {
            return avaqVar.f;
        }
        return null;
    }
}
