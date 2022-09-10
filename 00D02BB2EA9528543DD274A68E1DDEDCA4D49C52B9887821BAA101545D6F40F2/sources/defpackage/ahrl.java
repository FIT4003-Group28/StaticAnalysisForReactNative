package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ahrl  reason: default package */
/* loaded from: classes.dex */
public final class ahrl implements ahkl {
    public long D;
    public long E;
    @dzsi
    public Sensor F;
    public WindowManager R;
    @dzsi
    public cokf V;
    public boolean W;
    private boolean X;
    private final bvrb Y;
    private cojl aa;
    public final ahrm c;
    public boolean h;
    public Context i;
    @dzsi
    SensorManager j;
    @dzsi
    public Sensor m;
    @dzsi
    public Sensor o;
    @dzsi
    public ahrp p;
    public final duwy q;
    public final boolean r;
    @dzsi
    public Sensor t;
    @dzsi
    public Sensor u;
    @dzsi
    public Sensor v;
    @dzsi
    public Sensor w;
    public static final long a = TimeUnit.HOURS.toMillis(2);
    static final long d = TimeUnit.SECONDS.toMillis(5);
    public static final List<String> e = dchl.b("Google Inc.", "LG Electronics Inc.");
    public static final float N = (float) Math.cos(Math.toRadians(2.0d));
    public static final float O = (float) Math.cos(Math.toRadians(0.20000000298023224d));
    public static final float P = (float) Math.cos(Math.toRadians(1.0d));
    public static final float Q = (float) Math.cos(Math.toRadians(0.10000000149011612d));
    public final Object b = new Object();
    public boolean f = false;
    public ahkj g = ahkj.UPDATE_FREQUENCY_NONE;
    public final ahqu k = new ahqu(true);
    public final ahqu l = new ahqu(false);
    public final float[] n = new float[3];
    public final float[] x = new float[3];
    public final float[] y = new float[3];
    public final float[] z = new float[3];
    public final float[] A = new float[3];
    public final float[] B = new float[3];
    public final float[] C = new float[3];
    public final float[] G = new float[4];
    public final float[] H = new float[4];
    public long I = Long.MIN_VALUE;
    public long J = Long.MIN_VALUE;
    public final float[] K = new float[9];
    public final float[] L = new float[9];
    public final ahrj M = new ahrj();
    public final AtomicInteger S = new AtomicInteger();
    public long T = Long.MIN_VALUE;
    @dzsi
    private Timer Z = null;
    public int U = 0;
    private Looper ab = null;
    private final SensorEventListener ac = new ahri(this);
    public final ahqv s = new ahqv();

    public ahrl(ahki ahkiVar, cqat cqatVar, bvrb bvrbVar, duwy duwyVar) {
        this.Y = bvrbVar;
        this.c = new ahrm(ahkiVar, cqatVar);
        this.q = duwyVar;
        this.r = duwyVar.c;
        u(ahkiVar.a(), cqatVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float k(float[] fArr) {
        float f = 0.0f;
        for (int i = 0; i < 3; i++) {
            float f2 = fArr[i];
            f += f2 * f2;
        }
        double min = Math.min(f, 1.0f);
        Double.isNaN(min);
        return (float) Math.sqrt(1.0d - min);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l(@dzsi Sensor sensor, float[] fArr) {
        if (sensor != null && fArr != null) {
            if (sensor.getType() != 11 && sensor.getType() != 15) {
                return false;
            }
            if (fArr.length >= 3) {
                for (int i = 0; i < 3; i++) {
                    if (Float.isNaN(fArr[i]) || Math.abs(fArr[i]) > 1.0E-6f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float m(float[] fArr, float[] fArr2) {
        dbsk.a(fArr.length == fArr2.length);
        float f = 0.0f;
        for (int i = 0; i < fArr.length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(float[] fArr, float[] fArr2) {
        int i = 0;
        dbsk.a(fArr.length == fArr2.length);
        float f = 0.0f;
        for (float f2 : fArr) {
            f += f2 * f2;
        }
        float sqrt = (float) Math.sqrt(f);
        if (sqrt == 0.0f) {
            while (i < fArr.length) {
                fArr2[i] = 0.0f;
                i++;
            }
            return;
        }
        while (i < fArr.length) {
            fArr2[i] = fArr[i] / sqrt;
            i++;
        }
    }

    public static void q(Sensor sensor) {
        r(sensor.getType());
        sensor.getName();
        sensor.getVersion();
        sensor.getVendor();
    }

    private static String r(int i) {
        if (i != 1) {
            if (i == 2) {
                return "TYPE_MAGNETIC_FIELD";
            }
            if (i == 3) {
                return "TYPE_ORIENTATION";
            }
            if (i == 4) {
                return "TYPE_GYROSCOPE";
            }
            if (i == 11) {
                return "TYPE_ROTATION_VECTOR";
            }
            if (i == 15) {
                return "TYPE_GAME_ROTATION_VECTOR";
            }
            StringBuilder sb = new StringBuilder(16);
            sb.append("type ");
            sb.append(i);
            return sb.toString();
        }
        return "TYPE_ACCELEROMETER";
    }

    private final SensorManager s() {
        if (this.j == null) {
            dbsk.s(this.i);
            this.j = (SensorManager) this.i.getSystemService("sensor");
        }
        return this.j;
    }

    private final boolean t(int i) {
        return j(i) != null;
    }

    private final void u(@dzsi Location location, long j) {
        float f;
        float f2;
        float f3;
        if (!this.r) {
            this.p = null;
            this.T = Long.MIN_VALUE;
            return;
        }
        if (location != null) {
            f3 = (float) location.getLatitude();
            f = (float) location.getLatitude();
            f2 = (float) location.getLatitude();
        } else {
            f = Float.NaN;
            f2 = Float.NaN;
            f3 = Float.NaN;
        }
        ahrp ahrpVar = this.p;
        if (ahrpVar == null) {
            this.p = new ahrp(f, f2, f3, j);
            if (this.Z == null) {
                this.Z = new Timer();
            }
            this.Z.scheduleAtFixedRate(new ahrk(this), 0L, 500L);
        } else {
            Long valueOf = Long.valueOf(j);
            ahrpVar.c();
            ahrpVar.i = null;
            ahrpVar.j = Long.MIN_VALUE;
            ahrpVar.e(f, f2, f3, valueOf.longValue());
            ahrpVar.t = Float.NaN;
        }
        this.T = j;
    }

    @Override // defpackage.ahkl
    public final float a() {
        float f;
        synchronized (this.b) {
            f = this.c.g;
        }
        return f;
    }

    @Override // defpackage.ahkl
    public final void b() {
        cokf cokfVar;
        synchronized (this.b) {
            if (this.aa == null) {
                this.aa = new cojl(this) { // from class: ahrg
                    private final ahrl a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.cojl
                    public final void a(DeviceOrientation deviceOrientation) {
                        ahrl ahrlVar = this.a;
                        synchronized (ahrlVar.b) {
                            long b = ahrlVar.c.c.b();
                            if (ahrlVar.o()) {
                                synchronized (ahrlVar.b) {
                                    if (Math.abs(deviceOrientation.c() - ahrlVar.c.h) <= 0.2f) {
                                        if (!Float.isNaN(ahrlVar.c.g) && Math.abs(deviceOrientation.e() - ahrlVar.c.g) <= 0.2f) {
                                            long j = ahrlVar.I;
                                            if (j != Long.MIN_VALUE) {
                                            }
                                        }
                                    }
                                }
                                synchronized (ahrlVar.b) {
                                    ahrlVar.I = b;
                                    ahrlVar.c.h = deviceOrientation.c();
                                    ahrlVar.c.a(deviceOrientation.e());
                                    ahrlVar.c.g(1, 1);
                                    ahrj ahrjVar = ahrlVar.M;
                                    ahrm ahrmVar = ahrlVar.c;
                                    if (ahrjVar.a(b, ahrmVar.h, ahrmVar.i, ahrlVar.g)) {
                                        ahrlVar.c.d();
                                    }
                                }
                            }
                        }
                    }
                };
            }
            this.f = true;
            d(ahkj.UPDATE_FREQUENCY_SLOW);
            this.c.b();
            if (o() && (cokfVar = this.V) != null) {
                if (this.ab == null) {
                    this.ab = new Handler().getLooper();
                }
                DeviceOrientationRequest deviceOrientationRequest = new DeviceOrientationRequest();
                final cnsd<L> a2 = cnse.a(this.aa, core.a(this.ab), cojl.class.getSimpleName());
                final DeviceOrientationRequestInternal deviceOrientationRequestInternal = new DeviceOrientationRequestInternal(deviceOrientationRequest, DeviceOrientationRequestInternal.a, null);
                cnsr<A, cpct<Void>> cnsrVar = new cnsr(deviceOrientationRequestInternal, a2) { // from class: cojo
                    private final DeviceOrientationRequestInternal a;
                    private final cnsd b;

                    {
                        this.a = deviceOrientationRequestInternal;
                        this.b = a2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.cnsr
                    public final void a(Object obj, Object obj2) {
                        conk conkVar;
                        DeviceOrientationRequestInternal deviceOrientationRequestInternal2 = this.a;
                        cnsd cnsdVar = this.b;
                        conr conrVar = (conr) obj;
                        cokd cokdVar = new cokd((cpct) obj2);
                        synchronized (conrVar.t) {
                            conn connVar = conrVar.t;
                            connVar.f.a();
                            Object obj3 = cnsdVar.b;
                            if (obj3 == null) {
                                conkVar = null;
                            } else {
                                synchronized (connVar.d) {
                                    conk conkVar2 = connVar.d.get(obj3);
                                    if (conkVar2 == null) {
                                        conkVar2 = new conk(cnsdVar);
                                    }
                                    conkVar = conkVar2;
                                    connVar.d.put(obj3, conkVar);
                                }
                            }
                            if (conkVar != null) {
                                connVar.f.b().q(new DeviceOrientationRequestUpdateData(1, deviceOrientationRequestInternal2, conkVar, cokdVar));
                            }
                        }
                    }
                };
                cnsr<A, cpct<Boolean>> cnsrVar2 = new cnsr(a2) { // from class: cojp
                    private final cnsd a;

                    {
                        this.a = a2;
                    }

                    @Override // defpackage.cnsr
                    public final void a(Object obj, Object obj2) {
                        Object obj3 = this.a.b;
                        conn connVar = ((conr) obj).t;
                        connVar.f.a();
                        cnwc.n(obj3, "Invalid null listener key");
                        synchronized (connVar.d) {
                            conk remove = connVar.d.remove(obj3);
                            if (remove != null) {
                                remove.b();
                                connVar.f.b().q(DeviceOrientationRequestUpdateData.a(remove));
                            }
                        }
                    }
                };
                cnsp a3 = cnsq.a();
                a3.a = cnsrVar;
                a3.b = cnsrVar2;
                a3.c = a2;
                a3.d = 2434;
                cokfVar.f(a3.a());
            } else {
                u(this.c.e(), this.c.c.b());
            }
        }
    }

    @Override // defpackage.ahkl
    public final void c() {
        synchronized (this.b) {
            i();
            this.f = false;
            this.g = ahkj.UPDATE_FREQUENCY_NONE;
            this.F = null;
            this.o = null;
            this.w = null;
            this.m = null;
            this.t = null;
            this.u = null;
            this.p = null;
            this.T = Long.MIN_VALUE;
            this.c.b();
            Timer timer = this.Z;
            if (timer != null) {
                timer.cancel();
                this.Z = null;
            }
            if (o() && this.V != null) {
                dbsk.s(this.aa);
                cntf.d(this.V.g(cnse.b(this.aa, cojl.class.getSimpleName())));
            }
        }
    }

    @Override // defpackage.ahkl
    public final void d(ahkj ahkjVar) {
        this.Y.b(new ahrh(this, ahkjVar, this.S.incrementAndGet()), bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.ahkl
    public final void e(ahkh ahkhVar) {
        synchronized (this.b) {
            this.c.d.put(ahkhVar, null);
        }
    }

    @Override // defpackage.ahkl
    public final void f(ahkh ahkhVar) {
        synchronized (this.b) {
            this.c.d.remove(ahkhVar);
        }
    }

    @Override // defpackage.ahkl
    public final boolean g() {
        boolean z;
        synchronized (this.b) {
            if (!this.X) {
                ahrm ahrmVar = this.c;
                Context context = this.i;
                dbsk.s(context);
                boolean z2 = false;
                if (context.getPackageManager().hasSystemFeature("android.hardware.sensor.compass")) {
                    if (!t(11)) {
                        if (t(2)) {
                            if (t(1)) {
                            }
                        }
                        if (t(3)) {
                        }
                    }
                    z2 = true;
                }
                ahrmVar.e = z2;
                this.X = true;
            }
            z = this.c.e;
        }
        return z;
    }

    @dzsi
    public final Sensor h(int i, int i2) {
        r(i2);
        Sensor j = j(i2);
        if (j == null) {
            return null;
        }
        q(j);
        if (s().registerListener(this.ac, j, i, 60000)) {
            return j;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        s().unregisterListener(this.ac);
    }

    @dzsi
    protected final Sensor j(int i) {
        return s().getDefaultSensor(i);
    }

    public final boolean o() {
        if (this.W) {
            SensorManager s = s();
            Sensor defaultSensor = s.getDefaultSensor(1);
            Sensor defaultSensor2 = s.getDefaultSensor(4);
            Sensor defaultSensor3 = s.getDefaultSensor(2);
            Sensor defaultSensor4 = s.getDefaultSensor(16);
            Sensor defaultSensor5 = s.getDefaultSensor(14);
            if (defaultSensor == null) {
                return false;
            }
            if (defaultSensor2 == null && defaultSensor4 == null) {
                return false;
            }
            return !(defaultSensor3 == null && defaultSensor5 == null) && ahrm.f(this.q);
        }
        return false;
    }

    public final int p() {
        WindowManager windowManager = this.R;
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }
}
