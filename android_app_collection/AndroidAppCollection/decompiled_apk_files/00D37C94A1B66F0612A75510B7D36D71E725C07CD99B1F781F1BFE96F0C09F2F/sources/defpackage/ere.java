package defpackage;

import com.google.protos.youtube.api.innertube.RefreshAppActionOuterClass$RefreshAppAction;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ere  reason: default package */
/* loaded from: classes3.dex */
public final class ere implements aafl {
    private final Set a;

    public ere(Set set) {
        this.a = set;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(RefreshAppActionOuterClass$RefreshAppAction.refreshAppAction)) {
            throw new aafy();
        }
        for (Runnable runnable : this.a) {
            runnable.run();
        }
    }
}
