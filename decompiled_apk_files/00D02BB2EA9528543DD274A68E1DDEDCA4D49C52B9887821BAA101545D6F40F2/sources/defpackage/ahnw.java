package defpackage;

import com.google.android.apps.gmm.car.api.CarSatelliteStatusEvent;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
/* compiled from: PG */
/* renamed from: ahnw  reason: default package */
/* loaded from: classes2.dex */
public final class ahnw<T> extends btrh<T> {
    private final int d;

    public ahnw(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        String manufacturer;
        String model;
        if (this.d != 0) {
            CarSatelliteStatusEvent carSatelliteStatusEvent = (CarSatelliteStatusEvent) obj;
            ((ahnv) this.a).a(carSatelliteStatusEvent.getNumUsedInFix(), carSatelliteStatusEvent.getNumInView(), false);
            return;
        }
        ahnv ahnvVar = (ahnv) this.a;
        GmmCarProjectionStateEvent gmmCarProjectionStateEvent = (GmmCarProjectionStateEvent) obj;
        ahnvVar.c();
        ahnvVar.c = false;
        ahnvVar.d = false;
        ahnvVar.f = false;
        ahnvVar.e = gmmCarProjectionStateEvent.getLocationCharacterization();
        if (!gmmCarProjectionStateEvent.isInProjectedMode() || (manufacturer = gmmCarProjectionStateEvent.getManufacturer()) == null || (model = gmmCarProjectionStateEvent.getModel()) == null || !gmmCarProjectionStateEvent.hasHeadUnitSoftwareVersion()) {
            return;
        }
        String headUnitModel = gmmCarProjectionStateEvent.getHeadUnitModel();
        String headUnitSoftwareVersion = gmmCarProjectionStateEvent.getHeadUnitSoftwareVersion();
        if (manufacturer.equals("Audi") && model.startsWith("37") && (headUnitSoftwareVersion.startsWith("CLU6_MCM_AU_NAR") || headUnitSoftwareVersion.startsWith("CLU7_MCM_AU_NAR"))) {
            ahnvVar.c = true;
        }
        if ("HYUNDAI".equals(manufacturer) && "TUCSON".equals(model) && "1.0".equals(headUnitSoftwareVersion) && ahnvVar.e == 0) {
            ahnvVar.e = 177;
        }
        if ("Mazda".equals(manufacturer) && "Connectivity Master Unit".equals(headUnitModel) && ahnv.b.contains(headUnitSoftwareVersion)) {
            ahnvVar.d = true;
        }
        if (!"Volkswagen".equals(manufacturer) || !"MIB3".equals(headUnitModel) || !"2020".equals(gmmCarProjectionStateEvent.getModelYear())) {
            return;
        }
        ahnvVar.f = true;
    }
}
