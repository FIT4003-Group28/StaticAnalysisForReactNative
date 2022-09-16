package defpackage;

import com.google.protos.youtube.api.innertube.AppBrowserPrewarmAndPreconnectCommandOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gmh  reason: default package */
/* loaded from: classes3.dex */
public final class gmh implements aafl {
    private final ajgq a;

    public gmh(ajgq ajgqVar) {
        this.a = ajgqVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        ankt a;
        if (apzgVar == null || !apzgVar.qn(AppBrowserPrewarmAndPreconnectCommandOuterClass.appBrowserPrewarmAndPreconnectCommand) || (a = this.a.a()) == null) {
            return;
        }
        a.isCancelled();
    }
}
