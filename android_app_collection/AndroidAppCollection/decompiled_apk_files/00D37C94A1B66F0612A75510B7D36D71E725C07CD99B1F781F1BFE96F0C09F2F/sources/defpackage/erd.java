package defpackage;

import com.google.protos.youtube.api.innertube.RefreshCommandOuterClass$RefreshCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: erd  reason: default package */
/* loaded from: classes3.dex */
public final class erd implements aafl {
    private final gbu a;

    public erd(gbu gbuVar) {
        this.a = gbuVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = (RefreshCommandOuterClass$RefreshCommand) apzgVar.qm(RefreshCommandOuterClass$RefreshCommand.refreshCommand);
        if (refreshCommandOuterClass$RefreshCommand == null) {
            return;
        }
        int bw = awwc.bw(refreshCommandOuterClass$RefreshCommand.c);
        if (bw == 0) {
            bw = 1;
        }
        if (bw == 2) {
            this.a.k();
        } else if (bw != 3) {
        } else {
            this.a.l();
        }
    }
}
