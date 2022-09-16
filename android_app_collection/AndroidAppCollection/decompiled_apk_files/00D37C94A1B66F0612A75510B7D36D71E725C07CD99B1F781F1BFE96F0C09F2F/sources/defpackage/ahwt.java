package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
/* compiled from: PG */
/* renamed from: ahwt  reason: default package */
/* loaded from: classes.dex */
final class ahwt implements ahwy {
    final /* synthetic */ ahwu a;

    public ahwt(ahwu ahwuVar) {
        this.a = ahwuVar;
    }

    @Override // defpackage.ahwy
    public final void c(aicb aicbVar, boolean z) {
        if (aicbVar != aicb.TIMESTAMP_MARKER) {
            return;
        }
        this.a.f = z;
    }

    @Override // defpackage.ahwy
    public final void nD(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, aicb aicbVar, int i) {
        ahwu ahwuVar = this.a;
        if (!ahwuVar.e || !ahwuVar.f) {
            if (aicbVar != aicb.CHAPTER) {
                return;
            }
        } else if (aicbVar != aicb.TIMESTAMP_MARKER) {
            return;
        }
        ahwu ahwuVar2 = this.a;
        ahwuVar2.b = ahwuVar2.a.d();
        ahwu ahwuVar3 = this.a;
        ahwuVar3.d = ahwuVar3.c;
        ahwuVar3.c = timelineMarker2;
    }

    @Override // defpackage.ahwy
    public final void nw(aicb aicbVar) {
        this.a.e = aicbVar == aicb.TIMESTAMP_MARKER;
    }
}
