package defpackage;

import android.content.Context;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.os.Vibrator;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.FieldOfView;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.microedition.khronos.egl.EGLConfig;
/* compiled from: PG */
/* renamed from: ahjr  reason: default package */
/* loaded from: classes.dex */
public final class ahjr implements GvrView.StereoRenderer, ahol {
    public static final GvrViewerParams a = new GvrViewerParams();
    public final ahmk b;
    public ahop e;
    public ahjq f;
    public ahlb g;
    public ahlf h;
    public boolean i;
    boolean j;
    public volatile boolean k;
    public int l;
    private final ahlv m;
    private final float[] n;
    private boolean s;
    private ahoi t;
    private float u;
    private final float[] o = new float[16];
    private final float[] p = new float[16];
    private final float[] q = new float[16];
    public final Queue c = new ConcurrentLinkedQueue();
    private final float[] r = new float[3];
    public azqb d = usw.o;
    private int v = 16;
    private int w = 9;

    public ahjr(Context context) {
        float[] fArr = new float[16];
        this.n = fArr;
        context.getClass();
        this.m = new ahlv(context);
        this.b = new ahmk(amok.a, (Vibrator) context.getSystemService("vibrator"), context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0);
        Matrix.setLookAtM(fArr, 0, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    }

    private final void e() {
        while (!this.c.isEmpty()) {
            ((Runnable) this.c.remove()).run();
        }
    }

    private final void f(ahok ahokVar) {
        ahop ahopVar = this.e;
        if (ahopVar != null) {
            ((ahkv) ahopVar).i(ahokVar);
        }
    }

    private final void g() {
        if (ahom.i(this.u, this.b.a())) {
            return;
        }
        float a2 = this.b.a();
        this.u = a2;
        float tan = (float) Math.tan(a2 / 2.0f);
        int i = this.v;
        int i2 = this.w;
        float f = i > i2 ? tan : (i * tan) / i2;
        if (i >= i2) {
            tan = (tan * i2) / i;
        }
        Matrix.frustumM(this.o, 0, (-f) * 0.1f, f * 0.1f, (-tan) * 0.1f, tan * 0.1f, 0.1f, 20000.0f);
        this.t = new ahoi(f, tan, f, tan);
    }

    public final void a() {
        this.m.b();
    }

    @Override // defpackage.ahol
    public final void b(Runnable runnable) {
        throw null;
    }

    public final void c(boolean z) {
        this.s = z;
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r5 = this;
            int r0 = r5.l
            r1 = 0
            r2 = 1
            r3 = 3
            if (r0 == r3) goto L11
            boolean r3 = r5.j
            if (r3 == 0) goto Lf
            r3 = 2
            if (r0 != r3) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            boolean r3 = r5.s
            if (r3 != 0) goto L19
            if (r0 != 0) goto L24
            r0 = 0
        L19:
            ahlv r3 = r5.m
            boolean r4 = r3.c
            if (r4 == 0) goto L22
            r3.b()
        L22:
            if (r0 == 0) goto L6f
        L24:
            boolean r0 = r5.s
            if (r0 != 0) goto L6f
            ahlv r0 = r5.m
            boolean r3 = r0.c
            if (r3 != 0) goto L6f
            r3 = -1
            r0.k = r3
            r3 = 0
            r0.e = r3
            r0.f = r3
            r0.g = r3
            r0.h = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.i = r1
            java.lang.Object r1 = r0.n
            monitor-enter(r1)
            com.google.vr.sdk.base.sensors.internal.GyroscopeBiasEstimator r3 = r0.o     // Catch: java.lang.Throwable -> L6c
            r3.reset()     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            android.hardware.SensorEventListener r1 = r0.b
            if (r1 != 0) goto L53
            ahlt r1 = new ahlt
            r1.<init>(r0)
            r0.b = r1
        L53:
            java.lang.Thread r1 = new java.lang.Thread
            ahlu r3 = new ahlu
            r3.<init>(r0)
            java.lang.String r4 = "glOrientationSensor"
            r1.<init>(r3, r4)
            r0.a(r2)
            r0.c = r2
            r1.start()
            ahlv r0 = r5.m
            r0.j = r2
            return
        L6c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            throw r0
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjr.d():void");
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onDrawEye(Eye eye) {
        float[] fArr;
        ahoi ahoiVar;
        eye.getClass();
        if (this.g != null) {
            Matrix.multiplyMM(this.q, 0, eye.getEyeView(), 0, this.n, 0);
            if (eye.getType() != 0) {
                fArr = eye.getPerspective(0.1f, 20000.0f);
                FieldOfView fov = eye.getFov();
                ahoiVar = new ahoi(fov.getLeft(), fov.getTop(), fov.getRight(), fov.getBottom());
            } else {
                fArr = this.o;
                ahoiVar = this.t;
            }
            try {
                this.g.qQ(new ahoh(this.s ? this.q : this.p, fArr, ahoiVar, eye, (GvrViewerParams) this.d.get()));
            } catch (ahok e) {
                f(e);
            }
        }
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onFinishFrame(Viewport viewport) {
        viewport.getClass();
        try {
            ahom.f();
        } catch (ahok e) {
            f(e);
        }
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onNewFrame(HeadTransform headTransform) {
        float f;
        e();
        headTransform.getClass();
        if (this.g == null && this.h == null) {
            return;
        }
        g();
        if (this.s) {
            headTransform.getHeadView(this.p, 0);
        } else if (this.j || this.l != 2) {
            ahlv ahlvVar = this.m;
            float[] fArr = this.r;
            fArr[0] = almu.z(ahlvVar.e, -1.5707964f, 1.5707964f);
            fArr[1] = ahlvVar.f;
            fArr[2] = ahlvVar.j ? ahlvVar.g : 0.0f;
            if (this.i) {
                this.i = false;
                ahmk ahmkVar = this.b;
                float[] fArr2 = this.r;
                float f2 = fArr2[0];
                float f3 = fArr2[1];
                float z = almu.z(f2, -1.5707964f, 1.5707964f);
                ahmkVar.t = -z;
                ahmkVar.u = -f3;
                ahmkVar.v = z;
                ahmkVar.w = f3;
            }
            ahmk ahmkVar2 = this.b;
            float[] fArr3 = this.r;
            float f4 = fArr3[0];
            float f5 = fArr3[1];
            float f6 = fArr3[2];
            int i = this.l;
            long a2 = ahmkVar2.a.a();
            boolean z2 = !ahmkVar2.k && ((float) (a2 - ahmkVar2.A)) * 1.0E-9f < 10.0f && (!ahom.k(ahmkVar2.y) || !ahom.k(ahmkVar2.z));
            if (z2) {
                float exp = ((1.0f - ((float) Math.exp(f * (-3.8f)))) / 3.8f) - ((1.0f - ((float) Math.exp((((float) (ahmkVar2.B - ahmkVar2.A)) * 1.0E-9f) * (-3.8f)))) / 3.8f);
                ahmkVar2.t += ahmkVar2.y * exp;
                ahmkVar2.u += ahmkVar2.z * exp;
                ahmkVar2.B = a2;
            }
            float a3 = ((float) (ahmkVar2.a.a() - ahmkVar2.s)) * 1.0E-9f;
            float z3 = (ahom.k(2.0f) || a3 >= 2.0f) ? 0.0f : almu.z(1.0f - (a3 / 2.0f), 0.0f, 1.0f);
            float f7 = ahmkVar2.t;
            float f8 = ahmkVar2.v;
            ahmkVar2.t = f7 + ((f8 - f4) * z3);
            if (!z2 && z3 == 0.0f) {
                float min = Math.min(Math.abs(f4 - f8), (float) Math.toRadians(1.0d)) * 0.1f;
                if (Math.abs(ahmkVar2.t) < min) {
                    ahmkVar2.t = 0.0f;
                } else {
                    float f9 = ahmkVar2.t;
                    ahmkVar2.t = f9 - (Math.signum(f9) * min);
                }
            }
            ahmkVar2.v = f4;
            ahmkVar2.w = f5;
            ahmkVar2.x = f6;
            if (i == 2) {
                float f10 = ahmkVar2.u + f5;
                if (f10 > 0.62831855f) {
                    ahmkVar2.u = 0.62831855f - f5;
                    if (ahmkVar2.z > 0.0f) {
                        ahmkVar2.z = 0.0f;
                    }
                } else if (f10 < -0.62831855f) {
                    ahmkVar2.u = (-0.62831855f) - f5;
                    if (ahmkVar2.z < 0.0f) {
                        ahmkVar2.z = 0.0f;
                    }
                }
                ahmkVar2.b(0.9424779f);
            } else {
                ahmkVar2.b(1.5707964f);
            }
            if (!ahmkVar2.c && !ahmkVar2.k) {
                float f11 = ahmkVar2.e;
                if ((f11 > 2.26894f || f11 < 0.78538996f) && a2 > ahmkVar2.o) {
                    if (ahmkVar2.j) {
                        ahmkVar2.r = true;
                        ahmkVar2.f(ahmkVar2.q);
                        ahmkVar2.j = false;
                    }
                    float f12 = ((float) (a2 - ahmkVar2.o)) * 1.0E-9f;
                    float f13 = ahmkVar2.e;
                    if (f13 > 2.26894f) {
                        f13 = Math.max(f13 - ((f12 / 0.1f) * 0.087249994f), 2.26893f);
                        ahmkVar2.e = f13;
                    }
                    if (f13 < 0.78538996f) {
                        ahmkVar2.e = Math.min(f13 + ((f12 / 0.1f) * 0.087249994f), 0.7854f);
                    }
                    ahmkVar2.o = a2;
                }
            }
            ahmk ahmkVar3 = this.b;
            float f14 = ahmkVar3.v;
            float f15 = ahmkVar3.t;
            float f16 = ahmkVar3.w;
            float f17 = ahmkVar3.u;
            float f18 = ahmkVar3.x;
            double cos = Math.cos(f14);
            Matrix.setIdentityM(this.p, 0);
            Matrix.rotateM(this.p, 0, (float) Math.toDegrees(f18 * ((float) cos)), 0.0f, 0.0f, 1.0f);
            Matrix.rotateM(this.p, 0, (float) Math.toDegrees(f14 + f15), 1.0f, 0.0f, 0.0f);
            Matrix.rotateM(this.p, 0, (float) Math.toDegrees(f16 + f17), 0.0f, 1.0f, 0.0f);
        } else {
            Matrix.setIdentityM(this.p, 0);
        }
        if (Double.isNaN(this.p[0])) {
            zep.b("New frame error: head view has NaN value");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ahlf ahlfVar = this.h;
        if (ahlfVar != null) {
            float[] fArr4 = this.p;
            if (uptimeMillis >= ahlfVar.g + 1000) {
                ahlfVar.g = uptimeMillis;
                float[][] fArr5 = ahlfVar.b;
                int i2 = ahlfVar.f;
                ahlfVar.f = i2 + 1;
                ahom.m(fArr5[i2 % 10], fArr4);
                if (ahlfVar.f >= 10) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        float[] fArr6 = ahlfVar.c;
                        float[] fArr7 = ahlfVar.b[0];
                        fArr6[i3] = fArr7[i3];
                        ahlfVar.d[i3] = fArr7[i3];
                    }
                    for (int i4 = 1; i4 < 10; i4++) {
                        for (int i5 = 0; i5 < 3; i5++) {
                            float[] fArr8 = ahlfVar.b[i4];
                            float f19 = fArr8[i5];
                            float[] fArr9 = ahlfVar.c;
                            if (f19 < fArr9[i5]) {
                                fArr9[i5] = f19;
                            }
                            float f20 = fArr8[i5];
                            float[] fArr10 = ahlfVar.d;
                            if (f20 > fArr10[i5]) {
                                fArr10[i5] = f20;
                            }
                        }
                    }
                    int i6 = 0;
                    while (true) {
                        if (i6 < 3) {
                            if (ahlfVar.d[i6] - ahlfVar.c[i6] <= ahlf.a) {
                                i6++;
                            } else if (!ahlfVar.h) {
                                ahlfVar.h = true;
                                ahlfVar.e.a(true);
                            }
                        } else if (ahlfVar.h) {
                            ahlfVar.h = false;
                            ahlfVar.e.a(false);
                        }
                    }
                }
            }
        }
        ahlb ahlbVar = this.g;
        if (ahlbVar == null) {
            return;
        }
        ahjy ahjyVar = new ahjy(this.p, uptimeMillis);
        if (ahlbVar.d) {
            ahlbVar.d = false;
            ahlbVar.j(ahjyVar);
        }
        ahlbVar.qR(ahlbVar.o(ahjyVar), ahjyVar);
        ahlbVar.m(ahjyVar);
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onRendererShutdown() {
        ahlb ahlbVar = this.g;
        if (ahlbVar != null) {
            ahlbVar.i();
            this.g = null;
        }
        this.m.b();
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onSurfaceChanged(int i, int i2) {
        this.v = i;
        this.w = i2;
        try {
            ahjq ahjqVar = this.f;
            if (ahjqVar != null) {
                ((ahkv) ahjqVar).i.a();
            }
        } catch (ahok e) {
            f(e);
        }
        this.u = -1.0f;
        g();
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onSurfaceCreated(EGLConfig eGLConfig) {
        this.k = true;
        try {
            ahjq ahjqVar = this.f;
            if (ahjqVar != null) {
                ((ahkv) ahjqVar).l.getClass();
                try {
                    ((ahkv) ahjqVar).i.a();
                    ((ahkv) ahjqVar).n = new ahof(((ahkv) ahjqVar).t, ((ahkv) ahjqVar).h, ((ahkv) ahjqVar).k, ((ahkv) ahjqVar).x / ((ahkv) ahjqVar).y, ((ahkv) ahjqVar).f, ((ahkv) ahjqVar).a());
                    ((ahkv) ahjqVar).o = ((ahkv) ahjqVar).n.b;
                    ((ahkv) ahjqVar).o.p(((ahkv) ahjqVar).i.c(), ((ahkv) ahjqVar).i.d(), ((ahkv) ahjqVar).i.a, ((ahkv) ahjqVar).C);
                    if (((ahkv) ahjqVar).w) {
                        ((ahkv) ahjqVar).c();
                    }
                    ((ahkv) ahjqVar).l.c(((ahkv) ahjqVar).w);
                    ahjr ahjrVar = ((ahkv) ahjqVar).l;
                    ahjrVar.h = ((ahkv) ahjqVar).m;
                    ahof ahofVar = ((ahkv) ahjqVar).n;
                    ahofVar.getClass();
                    ahjrVar.g = ahofVar;
                    ((ahkv) ahjqVar).o(((ahkv) ahjqVar).z, ((ahkv) ahjqVar).A);
                    if (((ahkv) ahjqVar).v) {
                        ((ahkv) ahjqVar).m();
                    }
                    ((ahkv) ahjqVar).n.t(((ahkv) ahjqVar).D);
                    ahof ahofVar2 = ((ahkv) ahjqVar).n;
                    ahofVar2.b.k(((ahkv) ahjqVar).s);
                } catch (ahok e) {
                    ((ahkv) ahjqVar).i(e);
                }
            }
        } catch (ahok e2) {
            f(e2);
        }
        e();
    }
}
