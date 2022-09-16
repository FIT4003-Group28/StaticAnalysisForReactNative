package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ffk  reason: default package */
/* loaded from: classes3.dex */
public final class ffk implements ahwy {
    public final ahwz a;
    public final ArrayList b;
    public final ArrayList c;
    public long d;
    private boolean e;

    public ffk(ahwz ahwzVar) {
        ahwzVar.getClass();
        this.a = ahwzVar;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override // defpackage.ahwy
    public final void c(aicb aicbVar, boolean z) {
        if (aicbVar == aicb.CHAPTER || aicbVar == aicb.TIMESTAMP_MARKER) {
            if (aicbVar == aicb.TIMESTAMP_MARKER) {
                this.e = z;
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahwy) arrayList.get(i)).c(aicbVar, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ampq d(aibx aibxVar) {
        TimelineMarker[] m = this.a.m(aicb.TIMESTAMP_MARKER);
        return (!this.e || m == null || m.length <= 0 || !aibxVar.s()) ? amon.a : ampq.j(m);
    }

    @Override // defpackage.ahwy
    public final void nD(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, aicb aicbVar, int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ahwy) arrayList.get(i2)).nD(timelineMarker, timelineMarker2, aicbVar, i);
        }
    }

    @Override // defpackage.ahwy
    public final void nw(aicb aicbVar) {
        if (aicbVar == aicb.CHAPTER || aicbVar == aicb.TIMESTAMP_MARKER) {
            if (aicbVar == aicb.TIMESTAMP_MARKER) {
                this.b.clear();
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahwy) arrayList.get(i)).nw(aicbVar);
            }
        }
    }
}
