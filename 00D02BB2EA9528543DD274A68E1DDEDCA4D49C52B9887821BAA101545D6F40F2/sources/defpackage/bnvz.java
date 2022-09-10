package defpackage;

import com.google.android.apps.gmm.car.api.CarAccelerometerEvent;
import com.google.android.apps.gmm.car.api.CarCompassEvent;
import com.google.android.apps.gmm.car.api.CarGyroscopeEvent;
import com.google.android.apps.gmm.car.api.CarIgnitionStateEvent;
import com.google.android.apps.gmm.car.api.CarLocationEvent;
import com.google.android.apps.gmm.car.api.CarSatelliteStatusEvent;
import com.google.android.apps.gmm.car.api.CarWheelSpeedEvent;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import com.google.android.apps.gmm.directions.api.PseudoTrackDirectionsEvent;
import com.google.android.apps.gmm.location.events.CarHeadingEvent;
import com.google.android.apps.gmm.location.mapinfo.GpsStatusEvent;
import com.google.android.apps.gmm.location.mapinfo.NetworkLocationEvent;
import com.google.android.apps.gmm.location.motionsensors.MotionSensorEvent;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.location.rawlocationevents.AtmosphericPressureEvent;
import com.google.android.apps.gmm.location.rawlocationevents.BleBeaconEvent;
import com.google.android.apps.gmm.location.rawlocationevents.ExpectedLocationEvent;
import com.google.android.apps.gmm.location.rawlocationevents.GeoArLocationEvent;
import com.google.android.apps.gmm.location.rawlocationevents.LaneBoundaryEvent;
import com.google.android.apps.gmm.location.rawlocationevents.RotationVectorEvent;
import com.google.android.apps.gmm.location.rawlocationevents.SatelliteStatusEvent;
import com.google.android.apps.gmm.map.intents.AndroidIntentEvent;
import com.google.android.apps.gmm.mylocation.events.ActivityRecognitionEvent;
import com.google.android.apps.gmm.replay.events.LoggedObjectDiffEvent;
import com.google.android.apps.gmm.replay.events.TombstoneEvent;
import com.google.android.apps.gmm.shared.net.CannedResponseEvent;
import com.google.android.apps.gmm.shared.net.LoggedProtoEvent;
import com.google.android.apps.gmm.transit.go.activity.TransitGuidanceActivityRecognitionEvent;
import com.google.android.apps.gmm.transit.go.events.TransitGuidanceRemainingStopsEvent;
import com.google.android.apps.gmm.transit.go.events.TransitGuidanceTypeEvent;
import com.google.android.apps.gmm.transit.go.events.TransitGuidanceUserActionEvent;
import com.google.android.apps.gmm.transit.go.events.TripComparisonEvent;
import com.google.android.apps.gmm.util.replay.SetStateEvent;
import com.google.android.apps.gmm.wearable.api.WearableLocationEvent;
import com.google.android.apps.gmm.wearable.api.WearableLocationStatusEvent;
import com.google.android.libraries.geo.navcore.service.alert.events.GuidanceAlertDataEvent;
import java.util.HashMap;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bnvz  reason: default package */
/* loaded from: classes.dex */
public final class bnvz {
    private static final dcqe b = dcqe.c("bnvz");
    static final dcep<Class<? extends Object>> a = dcep.G(ActivityRecognitionEvent.class, AndroidIntentEvent.class, AndroidLocationEvent.class, AtmosphericPressureEvent.class, BleBeaconEvent.class, CannedResponseEvent.class, CarAccelerometerEvent.class, CarCompassEvent.class, CarGyroscopeEvent.class, CarHeadingEvent.class, CarIgnitionStateEvent.class, CarLocationEvent.class, CarSatelliteStatusEvent.class, CarWheelSpeedEvent.class, ExpectedLocationEvent.class, GeoArLocationEvent.class, GmmCarProjectionStateEvent.class, GpsStatusEvent.class, GuidanceAlertDataEvent.class, LaneBoundaryEvent.class, LoggedObjectDiffEvent.class, LoggedProtoEvent.class, MotionSensorEvent.class, NetworkLocationEvent.class, PseudoTrackDirectionsEvent.class, RotationVectorEvent.class, SatelliteStatusEvent.class, SetStateEvent.class, TombstoneEvent.class, TransitGuidanceActivityRecognitionEvent.class, TransitGuidanceRemainingStopsEvent.class, TransitGuidanceTypeEvent.class, TransitGuidanceUserActionEvent.class, TripComparisonEvent.class, WearableLocationStatusEvent.class, WearableLocationEvent.class);

    public bnvz(Set<Class<? extends Object>> set) {
        HashMap f = dcjz.f(set.size());
        HashMap f2 = dcjz.f(set.size());
        for (Class<? extends Object> cls : set) {
            if (f2.containsKey(cls)) {
                bvoo.h("Class %s already added.", cls);
            }
            bnvy a2 = bnvy.a(cls);
            if (f.containsKey(a2.a)) {
                bnvy bnvyVar = (bnvy) f.get(a2.a);
                dbsk.s(bnvyVar);
                bvoo.h("Duplicate definition for %s in %s and %s", a2.a, cls.getName(), bnvyVar.b.getName());
            }
            f.put(a2.a, a2);
            f2.put(cls, a2);
        }
        dcdn.r(f);
        dcdn.r(f2);
    }
}
