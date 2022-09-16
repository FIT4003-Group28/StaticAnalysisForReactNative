package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.view.Surface;
import android.view.SurfaceView;
import com.google.android.filament.Camera;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.View;
import com.google.android.filament.Viewport;
import com.google.android.filament.android.UiHelper;
import com.google.ar.sceneform.rendering.EngineInstance;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dbhq  reason: default package */
/* loaded from: classes5.dex */
public final class dbhq implements UiHelper.RendererCallback {
    private static final dbep s = new dbep(0.0f, 0.0f, 0.0f, 1.0f);
    public final dbij a;
    public Surface e;
    public SwapChain f;
    public final View g;
    public final View h;
    public final Renderer i;
    public final Camera j;
    public final Scene k;
    public IndirectLight l;
    public dbfh m;
    public boolean n;
    public final UiHelper o;
    public dbch r;
    private final SurfaceView t;
    public final ArrayList<dbhl> b = new ArrayList<>();
    public final ArrayList<dbfc> c = new ArrayList<>();
    public final ArrayList<dbex> d = new ArrayList<>();
    public final double[] p = new double[16];
    public final List<dbhp> q = new ArrayList();

    public dbhq(SurfaceView surfaceView) {
        dbix.b();
        this.t = surfaceView;
        this.a = new dbij(c(), surfaceView);
        UiHelper uiHelper = new UiHelper(UiHelper.ContextErrorPolicy.DONT_CHECK);
        this.o = uiHelper;
        uiHelper.setRenderCallback(this);
        uiHelper.attachTo(surfaceView);
        dbet a = EngineInstance.a();
        this.i = a.a.createRenderer();
        Scene f = a.f();
        this.k = f;
        View c = a.c();
        this.g = c;
        View c2 = a.c();
        this.h = c2;
        Camera e = a.e();
        this.j = e;
        e.setExposure(4.0f, 0.033333335f, 320.0f);
        b();
        c.setCamera(e);
        c.setScene(f);
        d(true);
        c2.setClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        c2.setCamera(a.e());
        c2.setScene(a.f());
    }

    public static void h() {
        ArrayList<dbit> arrayList = dbhs.b().a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).b();
        }
        if (EngineInstance.b != null) {
            if (EngineInstance.a != null) {
                if (!EGL14.eglDestroyContext(EGL14.eglGetDisplay(0), EngineInstance.a)) {
                    throw new IllegalStateException("Error destroying GL context.");
                }
                EngineInstance.a = null;
            }
            dbet dbetVar = EngineInstance.b;
            dbjb.c(dbetVar);
            dbetVar.a.destroy();
            EngineInstance.b = null;
        }
    }

    public static void i() {
        ArrayList<dbit> arrayList = dbhs.b().a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).c();
        }
    }

    public final void a(dbep dbepVar) {
        this.g.setClearColor(dbepVar.a, dbepVar.b, dbepVar.c, dbepVar.d);
    }

    public final void b() {
        a(s);
    }

    public final Context c() {
        return this.t.getContext();
    }

    public final void d(boolean z) {
        View.DynamicResolutionOptions dynamicResolutionOptions = new View.DynamicResolutionOptions();
        dynamicResolutionOptions.enabled = z;
        dynamicResolutionOptions.targetFrameTimeMilli = 33.333332f;
        this.g.setDynamicResolutionOptions(dynamicResolutionOptions);
    }

    public final void e() {
        this.g.setPostProcessingEnabled(false);
        this.g.setAntiAliasing(View.AntiAliasing.NONE);
        d(false);
        View.RenderQuality renderQuality = new View.RenderQuality();
        renderQuality.hdrColorBuffer = View.QualityLevel.LOW;
        this.g.setRenderQuality(renderQuality);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(dbhl dbhlVar) {
        this.k.addEntity(dbhlVar.a());
        this.b.add(dbhlVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(dbhl dbhlVar) {
        this.k.remove(dbhlVar.a());
        this.b.remove(dbhlVar);
    }

    @Override // com.google.android.filament.android.UiHelper.RendererCallback
    public final void onDetachedFromSurface() {
        SwapChain swapChain = this.f;
        if (swapChain != null) {
            dbet a = EngineInstance.a();
            a.b(swapChain);
            a.a.flushAndWait();
            this.f = null;
        }
    }

    @Override // com.google.android.filament.android.UiHelper.RendererCallback
    public final void onNativeWindowChanged(Surface surface) {
        synchronized (this) {
            this.e = surface;
            this.n = true;
        }
    }

    @Override // com.google.android.filament.android.UiHelper.RendererCallback
    public final void onResized(int i, int i2) {
        this.g.setViewport(new Viewport(0, 0, i, i2));
        this.h.setViewport(new Viewport(0, 0, i, i2));
    }
}
