package defpackage;

import com.google.protos.youtube.api.innertube.ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ahxa  reason: default package */
/* loaded from: classes.dex */
public final class ahxa implements aafl {
    private final ahxb a;

    public ahxa(ahxb ahxbVar) {
        this.a = ahxbVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand = (ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand) apzgVar.qm(ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.changeMarkersVisibilityCommand);
        if ((changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.b & 1) == 0 || changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.d.size() == 0) {
            return;
        }
        for (String str : changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.d) {
            this.a.a(changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.c, str);
        }
    }
}
