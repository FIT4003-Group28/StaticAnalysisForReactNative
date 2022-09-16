package defpackage;

import com.google.protos.youtube.api.innertube.ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahwk  reason: default package */
/* loaded from: classes.dex */
public final class ahwk implements aafl {
    private final ahwz a;

    public ahwk(ahwz ahwzVar) {
        this.a = ahwzVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand = (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand) apzgVar.qm(ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.changeKeyedMarkersVisibilityCommand);
        int i = changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            return;
        }
        this.a.g(changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.d, changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.c);
    }
}
