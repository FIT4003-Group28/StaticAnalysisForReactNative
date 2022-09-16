package defpackage;

import com.google.protos.youtube.api.innertube.LeaveBroadcastCommandOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abwg  reason: default package */
/* loaded from: classes.dex */
public final class abwg implements aafl {
    private final abzn a;
    private final abzl b;

    public abwg(abzn abznVar, abzl abzlVar) {
        this.a = abznVar;
        this.b = abzlVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        asoe asoeVar = (asoe) apzgVar.qm(LeaveBroadcastCommandOuterClass.leaveBroadcastCommand);
        if ((asoeVar.b & 1) != 0) {
            this.a.f(asoeVar.c, this.b);
        }
    }
}
