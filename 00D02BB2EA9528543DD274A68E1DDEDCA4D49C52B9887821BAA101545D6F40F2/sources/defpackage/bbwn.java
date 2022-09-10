package defpackage;

import android.graphics.Matrix;
import android.hardware.Camera;
import android.view.OrientationEventListener;
import android.view.TextureView;
/* compiled from: PG */
/* renamed from: bbwn  reason: default package */
/* loaded from: classes3.dex */
public final class bbwn implements bbwi {
    public static final dcqe a = dcqe.c("bbwn");
    public final gga b;
    public final bvrb c;
    public final bduq d;
    public final OrientationEventListener e;
    public bbvw g;
    @dzsi
    public Camera h;
    @dzsi
    public TextureView k;
    private final dxio<bbzd> p;
    private final dxio<bbzi> q;
    public final Matrix f = new Matrix();
    private final Matrix o = new Matrix();
    private int r = 1;
    public int n = 1;
    public bbvu i = new bbvu(4, 3);
    @dzsi
    public bbyi m = null;
    public int j = 0;
    public final TextureView.SurfaceTextureListener l = new bbwk(this);

    public bbwn(gga ggaVar, bvrb bvrbVar, bdup bdupVar, dxio<bbzd> dxioVar, dxio<bbzi> dxioVar2, bbts bbtsVar) {
        this.b = ggaVar;
        this.c = bvrbVar;
        this.d = bdupVar.a(bbtsVar.h());
        this.p = dxioVar;
        this.q = dxioVar2;
        this.g = dxioVar.a();
        this.e = new bbwl(this, ggaVar);
    }

    public static Camera.CameraInfo e() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0) {
                break;
            }
        }
        return cameraInfo;
    }

    @Override // defpackage.bbwi
    public final void a() {
        Camera camera = this.h;
        if (camera == null) {
            return;
        }
        bbvw bbvwVar = this.g;
        if (!bbvwVar.b) {
            return;
        }
        camera.stopPreview();
        bbvwVar.b = false;
    }

    @Override // defpackage.bbwi
    public final boolean b() {
        if (this.r != 2) {
            return false;
        }
        return f().h;
    }

    @dzsi
    public final Camera.Parameters c() {
        Camera camera = this.h;
        if (camera == null) {
            return null;
        }
        try {
            return camera.getParameters();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbwn.d(int, int):void");
    }

    public final bbzi f() {
        g(2);
        return (bbzi) this.g;
    }

    public final void g(int i) {
        TextureView textureView = this.k;
        if (textureView == null || this.r == i) {
            return;
        }
        this.r = i;
        if (i - 1 != 0) {
            this.g = this.q.a();
        } else {
            this.g = this.p.a();
        }
        d(textureView.getWidth(), textureView.getHeight());
    }
}
