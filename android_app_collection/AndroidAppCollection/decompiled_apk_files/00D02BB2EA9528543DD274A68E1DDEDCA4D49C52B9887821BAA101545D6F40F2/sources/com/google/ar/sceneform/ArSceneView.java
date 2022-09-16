package com.google.ar.sceneform;

import android.content.Context;
import android.content.pm.PackageManager;
import android.opengl.GLES30;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.filament.R;
import com.google.android.filament.VertexBuffer;
import com.google.ar.core.Camera;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.HitResult;
import com.google.ar.core.LightEstimate;
import com.google.ar.core.Plane;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.Trackable;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.sceneform.rendering.EngineInstance;
import com.google.ar.sceneform.rendering.Material;
import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ArSceneView extends dbcw {
    public static final /* synthetic */ int e = 0;
    private static final dbep i = new dbep((byte[]) null);
    public Session a;
    public Frame b;
    public dbgx c;
    public final dbcx d;
    private int j;
    private Config k;
    private int l;
    private Display m;
    private dbem n;
    private boolean o;
    private float p;
    private final dbep q;
    private final float[] r;

    public ArSceneView(Context context) {
        super(context);
        this.o = true;
        this.p = 1.0f;
        this.q = new dbep(i);
        this.r = new float[4];
        this.d = new dbcx();
        dbhq dbhqVar = this.f;
        dbjb.c(dbhqVar);
        dbhqVar.e();
        b();
    }

    private final void b() {
        Context context = getContext();
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                this.l = bundle.getInt("com.google.ar.core.min_apk_version");
                this.m = ((WindowManager) getContext().getSystemService(WindowManager.class)).getDefaultDisplay();
                dbhq dbhqVar = this.f;
                dbjb.c(dbhqVar);
                this.c = new dbgx(dbhqVar);
                int[] iArr = new int[1];
                GLES30.glGenTextures(1, iArr, 0);
                int i2 = iArr[0];
                GLES30.glBindTexture(36197, i2);
                GLES30.glTexParameteri(36197, 10242, 33071);
                GLES30.glTexParameteri(36197, 10243, 33071);
                GLES30.glTexParameteri(36197, 10241, 9728);
                GLES30.glTexParameteri(36197, 10240, 9728);
                this.j = i2;
                dbhq dbhqVar2 = this.f;
                dbjb.c(dbhqVar2);
                this.n = new dbem(this.j, dbhqVar2);
                return;
            }
            throw new IllegalStateException("Application manifest must contain meta-data.com.google.ar.core.min_apk_version");
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalStateException("Could not load application package metadata.", e2);
        }
    }

    public static native void nativeReportEngineType(Session session, String str, String str2);

    @Override // defpackage.dbcw
    protected final boolean a() {
        dbeb g;
        dbgy dbgyVar;
        Session session = this.a;
        if (session == null) {
            return false;
        }
        dbcx dbcxVar = this.d;
        CompletableFuture<Void> completableFuture = dbcxVar.a;
        if (completableFuture != null) {
            if (completableFuture.isDone()) {
                dbcxVar.a = null;
            }
            return false;
        }
        Session session2 = this.a;
        if (session2 != null && this.l >= 180604036) {
            Config config = this.k;
            if (config == null) {
                this.k = session2.getConfig();
            } else {
                session2.getConfig(config);
            }
            Config.UpdateMode updateMode = this.k.getUpdateMode();
            if (updateMode != Config.UpdateMode.LATEST_CAMERA_IMAGE) {
                String valueOf = String.valueOf(updateMode);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_windowFixedWidthMinor);
                sb.append("Invalid ARCore UpdateMode ");
                sb.append(valueOf);
                sb.append(", Sceneform requires that the ARCore session is configured to the UpdateMode LATEST_CAMERA_IMAGE.");
                throw new RuntimeException(sb.toString());
            }
        }
        try {
            Frame update = session.update();
            if (update == null) {
                return false;
            }
            dbem dbemVar = this.n;
            if (!dbemVar.h) {
                int[] imageDimensions = update.getCamera().getTextureIntrinsics().getImageDimensions();
                dbemVar.e = new dbes(dbemVar.a, imageDimensions[0], imageDimensions[1]);
                dbemVar.h = true;
                Material material = dbemVar.g;
                if (material != null) {
                    dbemVar.a(material);
                }
            }
            if (update.hasDisplayGeometryChanged()) {
                dbem dbemVar2 = this.n;
                dbet a = EngineInstance.a();
                FloatBuffer floatBuffer = dbemVar2.c;
                FloatBuffer floatBuffer2 = dbemVar2.d;
                VertexBuffer vertexBuffer = dbemVar2.b;
                update.transformDisplayUvCoords(floatBuffer, floatBuffer2);
                dbemVar2.b();
                vertexBuffer.setBufferAt(a.a, 1, floatBuffer2);
            }
            Frame frame = this.b;
            boolean z = frame == null || frame.getTimestamp() != update.getTimestamp();
            this.b = update;
            Camera camera = update.getCamera();
            if (camera == null) {
                return false;
            }
            if (z) {
                this.g.a.b(camera);
                Frame frame2 = this.b;
                if (frame2 != null) {
                    if (this.o && this.a != null) {
                        LightEstimate lightEstimate = frame2.getLightEstimate();
                        float f = this.p;
                        if (lightEstimate.getState() == LightEstimate.State.VALID) {
                            lightEstimate.getColorCorrection(this.r, 0);
                            f = Math.max(this.r[3], 0.0f);
                            dbep dbepVar = this.q;
                            float[] fArr = this.r;
                            dbepVar.b(fArr[0], fArr[1], fArr[2]);
                        }
                        this.g.b(this.q, f);
                        this.p = f;
                    }
                    dbgx dbgxVar = this.c;
                    int width = getWidth();
                    int height = getHeight();
                    Collection<Plane> updatedTrackables = frame2.getUpdatedTrackables(Plane.class);
                    List<HitResult> hitTest = frame2.hitTest(width / 2, height / 2);
                    if (hitTest != null && !hitTest.isEmpty()) {
                        for (HitResult hitResult : hitTest) {
                            Trackable trackable = hitResult.getTrackable();
                            Pose hitPose = hitResult.getHitPose();
                            if ((trackable instanceof Plane) && ((Plane) trackable).isPoseInPolygon(hitPose)) {
                                g = new dbeb(hitPose.tx(), hitPose.ty(), hitPose.tz());
                                dbgxVar.h = hitResult.getDistance();
                                break;
                            }
                        }
                    }
                    Pose pose = frame2.getCamera().getPose();
                    dbeb dbebVar = new dbeb(pose.tx(), pose.ty(), pose.tz());
                    float[] zAxis = pose.getZAxis();
                    g = dbeb.g(dbebVar, new dbeb(zAxis[0], zAxis[1], zAxis[2]).f(-dbgxVar.h));
                    Material now = dbgxVar.c.getNow(null);
                    if (now != null) {
                        now.b.a.put("focusPoint", new dbgj("focusPoint", g.a, g.b, g.c));
                        if (now.c.b()) {
                            now.b.a(now.c.a());
                        }
                        now.b("radius", 0.5f);
                    }
                    for (Plane plane : updatedTrackables) {
                        if (dbgxVar.b.containsKey(plane)) {
                            dbgyVar = dbgxVar.b.get(plane);
                        } else {
                            dbgy dbgyVar2 = new dbgy(plane, dbgxVar.a);
                            Material material2 = dbgxVar.g.get(plane);
                            if (material2 != null) {
                                dbgyVar2.d(material2);
                            } else if (now != null) {
                                dbgyVar2.d(now);
                            }
                            Material material3 = dbgxVar.d;
                            if (material3 != null) {
                                dbgyVar2.c(material3);
                            }
                            dbgyVar2.b(dbgxVar.f);
                            if (!dbgyVar2.a) {
                                dbgyVar2.a = true;
                                dbgyVar2.e();
                            }
                            dbgyVar2.a(dbgxVar.e);
                            dbgxVar.b.put(plane, dbgyVar2);
                            dbgyVar = dbgyVar2;
                        }
                        dbgyVar.e();
                    }
                    Iterator<Map.Entry<Plane, dbgy>> it = dbgxVar.b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<Plane, dbgy> next = it.next();
                        Plane key = next.getKey();
                        dbgy value = next.getValue();
                        if (key.getSubsumedBy() != null || key.getTrackingState() == TrackingState.STOPPED) {
                            value.g();
                            value.b = null;
                            it.remove();
                        }
                    }
                    return true;
                }
            }
            return z;
        } catch (CameraNotAvailableException unused) {
        }
    }

    @Override // defpackage.dbcw, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        Session session = this.a;
        if (session != null) {
            session.setDisplayGeometry(this.m.getRotation(), i4 - i2, i5 - i3);
        }
    }

    public void setCameraMaterial(Material material) {
        this.n.a(material);
    }

    public void setCameraMaterialToDefault() {
        dbem dbemVar = this.n;
        Material material = dbemVar.f;
        if (material != null) {
            dbemVar.a(material);
        } else {
            dbemVar.g = null;
        }
    }

    public void setLightDirectionUpdateEnabled(boolean z) {
    }

    public void setLightEstimationEnabled(boolean z) {
        this.o = z;
        if (!z) {
            dbcs dbcsVar = this.g;
            dbep dbepVar = i;
            dbcsVar.b(dbepVar, 1.0f);
            this.p = 1.0f;
            this.q.a(dbepVar);
        }
    }

    public void setupSession(Session session) {
        if (this.a != null) {
            return;
        }
        dbix.b();
        this.a = session;
        dbhq dbhqVar = this.f;
        dbjb.c(dbhqVar);
        int desiredWidth = dbhqVar.o.getDesiredWidth();
        int desiredHeight = dbhqVar.o.getDesiredHeight();
        if (desiredWidth != 0 && desiredHeight != 0) {
            session.setDisplayGeometry(this.m.getRotation(), desiredWidth, desiredHeight);
        }
        session.setCameraTextureName(this.j);
    }

    public ArSceneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = true;
        this.p = 1.0f;
        this.q = new dbep(i);
        this.r = new float[4];
        this.d = new dbcx();
        dbhq dbhqVar = this.f;
        dbjb.c(dbhqVar);
        dbhqVar.e();
        b();
    }
}
