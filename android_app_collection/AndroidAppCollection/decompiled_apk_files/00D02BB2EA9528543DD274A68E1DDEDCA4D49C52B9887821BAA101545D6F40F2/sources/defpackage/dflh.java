package defpackage;

import android.content.Context;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.CameraConfigFilter;
import com.google.ar.core.Config;
import com.google.ar.core.Earth;
import com.google.ar.core.EarthNetworkClientInterface;
import com.google.ar.core.EarthPose;
import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.NotTrackingException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dflh  reason: default package */
/* loaded from: classes6.dex */
public final class dflh implements dflf {
    private static final dbry c = dbrz.e(",").c(",");
    private static final Pose d = Pose.makeRotation((float) (Math.sqrt(2.0d) / 2.0d), 0.0f, 0.0f, (float) (Math.sqrt(2.0d) / 2.0d));
    private static final Pose e = Pose.makeRotation((float) ((-Math.sqrt(2.0d)) / 2.0d), 0.0f, 0.0f, (float) (Math.sqrt(2.0d) / 2.0d));
    private final Context a;
    private final Object b;
    private final dbsg<dflr> f;
    private volatile Session g;
    private volatile Earth h;
    private final dflc i;
    private final String j;
    private Config.PlaneFindingMode k;
    private Config.EarthMode l;
    private dflw m;
    private Earth.LocalizationPerformanceMode n;
    private final dflg o;

    public dflh(Context context, dflc dflcVar, Map<String, String> map, dbsg<dflr> dbsgVar) {
        dflg dflgVar = dflg.a;
        this.b = new Object();
        this.l = Config.EarthMode.DISABLED;
        this.m = null;
        this.n = Earth.LocalizationPerformanceMode.SESSION_STATE_DEFAULT;
        this.o = dflgVar;
        this.a = context;
        this.i = dflcVar;
        this.f = dbsgVar;
        HashMap hashMap = new HashMap(map);
        hashMap.put("enable_geo", "true");
        this.j = c.a(hashMap);
    }

    private final void k(Session session) {
        Config config = new Config(session);
        config.setUpdateMode(Config.UpdateMode.LATEST_CAMERA_IMAGE);
        config.setPlaneFindingMode(this.k);
        config.setEarthMode(this.l);
        session.configure(config);
    }

    @Override // defpackage.dflf
    public final void a() {
        Session session;
        synchronized (this.b) {
            if (this.g == null) {
                dbsk.t(this.m, "ARCore session cannot be created without a Logging Policy set");
                synchronized (this.b) {
                    if (this.g != null) {
                        session = this.g;
                    } else {
                        this.i.e(dflc.a);
                        this.i.e(dflc.b);
                        this.i.e(dflc.d);
                        this.i.e(dflc.c);
                        Session session2 = new Session(this.a, this.j);
                        k(session2);
                        CameraConfigFilter cameraConfigFilter = new CameraConfigFilter(session2);
                        cameraConfigFilter.setTargetFps(EnumSet.of(CameraConfig.TargetFps.TARGET_FPS_30));
                        List<CameraConfig> supportedCameraConfigs = session2.getSupportedCameraConfigs(cameraConfigFilter);
                        if (supportedCameraConfigs.isEmpty()) {
                            cameraConfigFilter.setTargetFps(EnumSet.of(CameraConfig.TargetFps.TARGET_FPS_60));
                            supportedCameraConfigs = session2.getSupportedCameraConfigs(cameraConfigFilter);
                        }
                        dbsk.l(!supportedCameraConfigs.isEmpty());
                        session2.setCameraConfig(supportedCameraConfigs.get(0));
                        this.m.a(session2);
                        session = session2;
                    }
                }
                this.g = session;
            }
            this.l = Config.EarthMode.ENABLED;
            k(this.g);
            this.h = this.g.getEarth();
            if (this.n != Earth.LocalizationPerformanceMode.SESSION_STATE_DEFAULT) {
                this.h.setLocalizationPerformanceMode(this.n);
            }
            this.h.setNetworkClient((EarthNetworkClientInterface) ((dbsu) this.f).a);
        }
    }

    @Override // defpackage.dflf
    public final void b() {
        this.i.a();
        synchronized (this.b) {
            this.l = Config.EarthMode.DISABLED;
            k(this.g);
            this.h = null;
        }
    }

    @Override // defpackage.dflf
    public final void c() {
        this.i.a();
        synchronized (this.b) {
            if (this.g != null) {
                this.g.close();
                this.g = null;
            }
            dflr dflrVar = (dflr) ((dbsu) this.f).a;
            dflrVar.d.b();
            if (dflrVar.b.a()) {
                dflrVar.b.b().b();
            }
        }
    }

    @Override // defpackage.dflf
    public final void d(Frame frame) {
        if (frame == null) {
            return;
        }
        this.i.d(dflc.a);
        if (frame.getCamera().getTrackingState() == TrackingState.TRACKING) {
            this.i.d(dflc.b);
        }
        synchronized (this.b) {
            Earth earth = this.h;
            if (earth == null) {
                return;
            }
            if (earth.getTrackingState() == TrackingState.TRACKING) {
                this.i.d(dflc.c);
            }
        }
    }

    @Override // defpackage.dflf
    public final Session e() {
        Session session;
        synchronized (this.b) {
            session = this.g;
            dbsk.s(session);
        }
        return session;
    }

    @Override // defpackage.dflf
    public final dfle f() {
        EarthPose earthPose;
        Object obj;
        double asin;
        double atan2;
        double d2;
        Object obj2 = this.b;
        synchronized (obj2) {
            try {
                try {
                    Earth earth = this.h;
                    dfld dfldVar = null;
                    if (earth == null || earth.getTrackingState() != TrackingState.TRACKING) {
                        return null;
                    }
                    try {
                        earthPose = earth.getCameraEarthPose();
                    } catch (NotTrackingException unused) {
                        earthPose = null;
                    }
                    if (earthPose != null) {
                        EarthPose.EarthPoseConfidence earthPoseConfidence = EarthPose.EarthPoseConfidence.LEVEL_0;
                        int ordinal = earthPose.getConfidence().ordinal();
                        int i = 2;
                        if (ordinal == 0) {
                            i = 1;
                        } else if (ordinal != 1) {
                            if (ordinal == 2) {
                                i = 3;
                            } else if (ordinal == 3) {
                                i = 4;
                            } else if (ordinal == 4) {
                                i = 5;
                            }
                        }
                        Pose compose = d.compose(Pose.makeRotation(earthPose.getDisplayOrientedQuaternion())).compose(e);
                        float qx = compose.qx();
                        double d3 = qx + qx;
                        float qy = compose.qy();
                        double d4 = qy + qy;
                        float qz = compose.qz();
                        double d5 = qz + qz;
                        double qw = compose.qw();
                        Double.isNaN(d3);
                        Double.isNaN(qw);
                        double d6 = qw * d3;
                        double qw2 = compose.qw();
                        Double.isNaN(d4);
                        Double.isNaN(qw2);
                        double d7 = qw2 * d4;
                        obj = obj2;
                        double qw3 = compose.qw();
                        Double.isNaN(d5);
                        Double.isNaN(qw3);
                        double d8 = qw3 * d5;
                        int i2 = i;
                        double qx2 = compose.qx();
                        Double.isNaN(d3);
                        Double.isNaN(qx2);
                        double d9 = d3 * qx2;
                        double qx3 = compose.qx();
                        Double.isNaN(d4);
                        Double.isNaN(qx3);
                        double d10 = qx3 * d4;
                        EarthPose earthPose2 = earthPose;
                        double qx4 = compose.qx();
                        Double.isNaN(d5);
                        Double.isNaN(qx4);
                        double d11 = qx4 * d5;
                        double qy2 = compose.qy();
                        Double.isNaN(d4);
                        Double.isNaN(qy2);
                        double d12 = d4 * qy2;
                        double qy3 = compose.qy();
                        Double.isNaN(d5);
                        Double.isNaN(qy3);
                        double d13 = qy3 * d5;
                        double qz2 = compose.qz();
                        Double.isNaN(d5);
                        Double.isNaN(qz2);
                        double d14 = d5 * qz2;
                        double d15 = 1.0d - (d12 + d14);
                        double d16 = d10 - d8;
                        double d17 = d10 + d8;
                        double d18 = 1.0d - (d14 + d9);
                        double d19 = d11 - d7;
                        double d20 = d13 + d6;
                        double d21 = 1.0d - (d9 + d12);
                        if (d20 <= -1.0d || d20 >= 1.0d) {
                            asin = Math.asin(Math.min(Math.max(d20, -1.0d), 1.0d));
                            atan2 = Math.atan2(d17, d15);
                            d2 = dcyn.a;
                        } else {
                            asin = Math.asin(d20);
                            d2 = Math.atan2(-d19, d21);
                            atan2 = Math.atan2(-d16, d18);
                        }
                        dfldVar = new dfld(i2, earthPose2.getLatitudeDegrees(), earthPose2.getLongitudeDegrees(), earthPose2.getAltitudeMeters(), earthPose2.getLocationAccuracyMeters(), earthPose2.getHeadingDegrees(), Math.toDegrees(d2), Math.toDegrees(asin), Math.toDegrees(-atan2), earthPose2.getHeadingAccuracyDegrees());
                        return dfldVar;
                    }
                    obj = obj2;
                    return dfldVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // defpackage.dflf
    public final String g() {
        String uuid;
        synchronized (this.b) {
            uuid = this.g == null ? null : this.g.getDebugSessionId().toString();
        }
        return uuid;
    }

    @Override // defpackage.dflf
    public final void h(dflw dflwVar) {
        this.m = dflwVar;
        synchronized (this.b) {
            if (this.g != null) {
                dflwVar.a(this.g);
            }
        }
    }

    @Override // defpackage.dflf
    public final void i(Earth.LocalizationPerformanceMode localizationPerformanceMode) {
        if (this.n == localizationPerformanceMode) {
            return;
        }
        this.n = localizationPerformanceMode;
        synchronized (this.b) {
            Earth earth = this.h;
            if (earth == null) {
                return;
            }
            earth.setLocalizationPerformanceMode(localizationPerformanceMode);
        }
    }

    public final void j(Config.PlaneFindingMode planeFindingMode) {
        this.k = planeFindingMode;
        synchronized (this.b) {
            if (this.g != null) {
                k(this.g);
            }
        }
    }
}
