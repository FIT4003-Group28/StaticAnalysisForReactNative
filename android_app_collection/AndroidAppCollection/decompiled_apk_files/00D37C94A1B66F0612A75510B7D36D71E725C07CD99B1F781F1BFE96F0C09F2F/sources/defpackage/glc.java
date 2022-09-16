package defpackage;

import com.google.protos.youtube.api.innertube.PlayBillingCommandOuterClass$PlayBillingCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: glc  reason: default package */
/* loaded from: classes3.dex */
public final class glc implements aafl {
    private final ybq a;

    public glc(ybq ybqVar) {
        this.a = ybqVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(PlayBillingCommandOuterClass$PlayBillingCommand.playBillingCommand)) {
            return;
        }
        this.a.g((PlayBillingCommandOuterClass$PlayBillingCommand) apzgVar.qm(PlayBillingCommandOuterClass$PlayBillingCommand.playBillingCommand));
    }
}
