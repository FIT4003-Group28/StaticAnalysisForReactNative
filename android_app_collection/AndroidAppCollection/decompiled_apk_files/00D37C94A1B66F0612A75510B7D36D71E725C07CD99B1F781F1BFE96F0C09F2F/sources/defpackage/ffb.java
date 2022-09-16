package defpackage;

import android.os.Looper;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
/* compiled from: PG */
/* renamed from: ffb  reason: default package */
/* loaded from: classes3.dex */
final class ffb implements ahwy {
    final /* synthetic */ ffh a;

    public ffb(ffh ffhVar) {
        this.a = ffhVar;
    }

    @Override // defpackage.ahwy
    public final void c(aicb aicbVar, boolean z) {
        ffh ffhVar = this.a;
        if (aicbVar == aicb.CHAPTER) {
            ffhVar.invalidate();
        } else if (aicbVar != aicb.TIMESTAMP_MARKER) {
        } else {
            if (ffhVar.o != z) {
                ffhVar.o = z;
                if (z) {
                    ffhVar.j.cancel();
                    ffhVar.j.start();
                }
            }
            ffhVar.invalidate();
        }
    }

    @Override // defpackage.ahwy
    public final void nD(TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, aicb aicbVar, int i) {
        final ffh ffhVar = this.a;
        if (aicbVar != aicb.CHAPTER) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ffhVar.z(timelineMarker2);
        } else {
            ffhVar.post(new Runnable() { // from class: fey
                @Override // java.lang.Runnable
                public final void run() {
                    ffh.this.z(timelineMarker2);
                }
            });
        }
    }

    @Override // defpackage.ahwy
    public final void nw(aicb aicbVar) {
        this.a.invalidate();
    }
}
