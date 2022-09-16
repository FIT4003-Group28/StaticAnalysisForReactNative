package defpackage;

import com.google.android.apps.gmm.car.api.CarIgnitionStateEvent;
import com.google.android.apps.gmm.car.api.CarLocationEvent;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.location.rawlocationevents.AtmosphericPressureEvent;
import com.google.android.apps.gmm.location.rawlocationevents.GeoArLocationEvent;
import com.google.android.apps.gmm.location.rawlocationevents.LaneBoundaryEvent;
import com.google.android.apps.gmm.wearable.api.WearableLocationEvent;
/* compiled from: PG */
/* renamed from: ahov  reason: default package */
/* loaded from: classes2.dex */
public final class ahov<T> extends btrh<T> {
    private final int d;

    public ahov(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        switch (this.d) {
            case 0:
                ((ahos) this.a).c(((CarLocationEvent) obj).getLocation());
                return;
            case 1:
                ((ahos) this.a).c(((WearableLocationEvent) obj).getLocation());
                return;
            case 2:
                ((ahos) this.a).c(((AndroidLocationEvent) obj).getLocation());
                return;
            case 3:
                ((ahos) this.a).c(((GeoArLocationEvent) obj).getLocation());
                return;
            case 4:
                ahos ahosVar = (ahos) this.a;
                ahsx ahsxVar = (ahsx) obj;
                throw null;
            case 5:
                ahsy ahsyVar = (ahsy) obj;
                ((ahos) this.a).d();
                return;
            case 6:
                ahos ahosVar2 = (ahos) this.a;
                ahsz ahszVar = (ahsz) obj;
                throw null;
            case 7:
                ahos ahosVar3 = (ahos) this.a;
                ahsw ahswVar = (ahsw) obj;
                dbsk.s(ahosVar3.h);
                ahog ahogVar = ahosVar3.h;
                throw null;
            case 8:
                AtmosphericPressureEvent atmosphericPressureEvent = (AtmosphericPressureEvent) obj;
                ((ahos) this.a).r(new ahqf(atmosphericPressureEvent.getTimeMs(), atmosphericPressureEvent.getPascals()));
                return;
            case 9:
                LaneBoundaryEvent laneBoundaryEvent = (LaneBoundaryEvent) obj;
                ((ahos) this.a).r(new ahqo(laneBoundaryEvent.getTimeMs(), laneBoundaryEvent.getBounds(), laneBoundaryEvent.getQualities()));
                return;
            case 10:
                ahos ahosVar4 = (ahos) this.a;
                crmj crmjVar = (crmj) obj;
                ahosVar4.p = crmjVar.b.a().h;
                ahosVar4.r = crmjVar.b.a;
                ahosVar4.g();
                return;
            case 11:
                ahos ahosVar5 = (ahos) this.a;
                crmc crmcVar = (crmc) obj;
                ahosVar5.p = crmcVar.b.a().h;
                ahosVar5.r = crmcVar.b.a;
                ahosVar5.g();
                return;
            case 12:
                ahos ahosVar6 = (ahos) this.a;
                ahosVar6.p = ((crhb) obj).a.a();
                ahosVar6.g();
                return;
            case 13:
                ahos ahosVar7 = (ahos) this.a;
                crhp crhpVar = (crhp) obj;
                ahosVar7.q = crhpVar.b();
                if (crhpVar.d()) {
                    ahosVar7.p = crhpVar.e().g().a.h;
                } else if (crhpVar.f()) {
                    ahosVar7.p = crhpVar.g().f;
                }
                ahosVar7.g();
                return;
            case 14:
                ahos ahosVar8 = (ahos) this.a;
                byze byzeVar = (byze) obj;
                boolean a = byzeVar.a();
                ahosVar8.q = a;
                ahosVar8.a = null;
                ahosVar8.b = -1L;
                if (!a) {
                    ahosVar8.g();
                    return;
                }
                bzck bzckVar = byzeVar.a;
                dbsk.s(bzckVar);
                ahosVar8.r = bzckVar.a;
                amub k = ahosVar8.r.k();
                ahosVar8.p = k.h;
                ahosVar8.g();
                if (ahosVar8.l.getTransitTrackingParameters().k) {
                    return;
                }
                ahosVar8.b = k.W;
                ahosVar8.a = amux.g(k.k, k.D);
                return;
            default:
                ahos ahosVar9 = (ahos) this.a;
                jzm jzmVar = jzm.IGNITION_STATE_INVALID;
                int ordinal = ((CarIgnitionStateEvent) obj).getIgnitionState().ordinal();
                if (ordinal != 2 && ordinal != 3) {
                    return;
                }
                ahosVar9.u = false;
                return;
        }
    }
}
