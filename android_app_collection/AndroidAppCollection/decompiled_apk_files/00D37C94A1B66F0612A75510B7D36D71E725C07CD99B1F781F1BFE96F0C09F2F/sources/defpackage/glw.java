package defpackage;

import com.google.protos.youtube.api.innertube.SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: glw  reason: default package */
/* loaded from: classes3.dex */
public final class glw implements aafl {
    private final airr a;
    private final aizn b;

    public glw(airr airrVar, aizn aiznVar) {
        this.a = airrVar;
        this.b = aiznVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand setPlaybackStateCommandOuterClass$SetPlaybackStateCommand = apzgVar.qn(SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.setPlaybackStateCommand) ? (SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand) apzgVar.qm(SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.setPlaybackStateCommand) : null;
        if (setPlaybackStateCommandOuterClass$SetPlaybackStateCommand != null) {
            int i = 1;
            if ((setPlaybackStateCommandOuterClass$SetPlaybackStateCommand.b & 1) == 0) {
                return;
            }
            int bi = awwc.bi(setPlaybackStateCommandOuterClass$SetPlaybackStateCommand.c);
            if (bi != 0) {
                i = bi;
            }
            switch (i - 1) {
                case 1:
                    if (this.a.d()) {
                        return;
                    }
                    this.a.b();
                    return;
                case 2:
                    if (!this.a.d()) {
                        return;
                    }
                    this.a.a();
                    return;
                case 3:
                    this.b.g(10000L);
                    return;
                case 4:
                    this.b.g(-10000L);
                    return;
                case 5:
                    this.b.j();
                    return;
                case 6:
                    this.b.k();
                    return;
                case 7:
                    this.a.B();
                    return;
                default:
                    return;
            }
        }
    }
}
