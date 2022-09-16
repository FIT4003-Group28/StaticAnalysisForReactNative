package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahxh  reason: default package */
/* loaded from: classes.dex */
public final class ahxh implements ahxf {
    private final ahwz a;
    private final /* synthetic */ int b;

    public ahxh(ahwz ahwzVar) {
        this.a = ahwzVar;
    }

    public ahxh(ahwz ahwzVar, int i) {
        this.b = i;
        this.a = ahwzVar;
    }

    private static final apzg b(awmt awmtVar) {
        if (awmtVar == null || !awmtVar.qn(arng.a)) {
            return null;
        }
        return (apzg) awmtVar.qm(arng.a);
    }

    private static final apzg c(awmt awmtVar) {
        if (awmtVar == null || !awmtVar.qn(arng.a)) {
            return null;
        }
        return (apzg) awmtVar.qm(arng.a);
    }

    @Override // defpackage.ahxf
    public final void a(asxb asxbVar) {
        apzg apzgVar = null;
        if (this.b == 0) {
            if (!asxbVar.b() || asxbVar.getMarkersListModel().b().isEmpty()) {
                return;
            }
            String d = asxbVar.d();
            List b = asxbVar.getMarkersListModel().b();
            TimelineMarker[] timelineMarkerArr = new TimelineMarker[((amxx) b).c];
            amzt listIterator = ((amuk) b).listIterator();
            int i = 0;
            while (listIterator.hasNext()) {
                aswx aswxVar = (aswx) listIterator.next();
                timelineMarkerArr[i] = new TimelineMarker(aswxVar.d().longValue(), aswxVar.d().longValue() + aswxVar.c().longValue(), i, aswxVar.a().c.size() > 0 ? ((arai) aswxVar.a().c.get(0)).c : null, !aswxVar.e() ? null : b(aswxVar.b()));
                i++;
            }
            this.a.k(d, aicb.TIMESTAMP_MARKER, timelineMarkerArr, null);
            asxe markersListModel = asxbVar.getMarkersListModel();
            if (markersListModel.c()) {
                apzgVar = b(markersListModel.a());
            }
            this.a.d(d, apzgVar);
        } else if (!asxbVar.b() || asxbVar.getMarkersListModel().b().isEmpty()) {
        } else {
            String d2 = asxbVar.d();
            List b2 = asxbVar.getMarkersListModel().b();
            TimelineMarker[] timelineMarkerArr2 = new TimelineMarker[((amxx) b2).c];
            amzt listIterator2 = ((amuk) b2).listIterator();
            int i2 = 0;
            while (listIterator2.hasNext()) {
                aswx aswxVar2 = (aswx) listIterator2.next();
                timelineMarkerArr2[i2] = new TimelineMarker(aswxVar2.d().longValue(), aswxVar2.d().longValue() + aswxVar2.c().longValue(), i2, aswxVar2.a().c.size() > 0 ? ((arai) aswxVar2.a().c.get(0)).c : null, !aswxVar2.e() ? null : c(aswxVar2.b()));
                i2++;
            }
            this.a.k(d2, aicb.CHAPTER, timelineMarkerArr2, null);
            asxe markersListModel2 = asxbVar.getMarkersListModel();
            if (markersListModel2.c()) {
                apzgVar = c(markersListModel2.a());
            }
            this.a.d(d2, apzgVar);
        }
    }
}
