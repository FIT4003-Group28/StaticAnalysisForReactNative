package defpackage;

import com.google.protos.youtube.api.innertube.UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahxq  reason: default package */
/* loaded from: classes.dex */
public final class ahxq implements aafl {
    private final ahxo a;

    public ahxq(ahxo ahxoVar) {
        this.a = ahxoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        ampq ampqVar;
        UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand = (UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand) apzgVar.qm(UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.updateTimedMarkersSyncObserverCommand);
        int i = updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.b;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            return;
        }
        if (updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.c) {
            if ((i & 8) != 0) {
                apzg apzgVar2 = updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.f;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                ampqVar = ampq.j(apzgVar2);
            } else {
                ampqVar = amon.a;
            }
            this.a.i(updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.d, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.e, ampqVar);
            return;
        }
        this.a.g(updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.d, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.e);
    }
}
