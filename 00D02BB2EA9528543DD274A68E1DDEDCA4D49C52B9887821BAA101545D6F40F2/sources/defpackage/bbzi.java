package defpackage;

import android.graphics.Rect;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbzi  reason: default package */
/* loaded from: classes3.dex */
public final class bbzi extends bbvw {
    public final bvrb e;
    public final bduq f;
    @dzsi
    public MediaRecorder g;
    public boolean h = false;
    @dzsi
    public String i;
    private final bcpe j;

    public bbzi(bvrb bvrbVar, bduq bduqVar, bcpe bcpeVar) {
        this.e = bvrbVar;
        this.f = bduqVar;
        this.j = bcpeVar;
    }

    private final synchronized void l(final MediaRecorder mediaRecorder, final bbvx bbvxVar) {
        this.e.b(new Runnable(this, mediaRecorder, bbvxVar) { // from class: bbzh
            private final bbzi a;
            private final MediaRecorder b;
            private final bbvx c;

            {
                this.a = this;
                this.b = mediaRecorder;
                this.c = bbvxVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbzi bbziVar = this.a;
                MediaRecorder mediaRecorder2 = this.b;
                bbvx bbvxVar2 = this.c;
                boolean i = bbziVar.i(mediaRecorder2);
                mediaRecorder2.release();
                bbziVar.g = null;
                if (!i) {
                    int i2 = bbyy.r;
                    ((bbyw) bbvxVar2).c.n = false;
                    return;
                }
                bbziVar.k(bbvxVar2);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.bbvw
    public final List<Camera.Size> a(Camera.Parameters parameters) {
        return parameters.getSupportedVideoSizes();
    }

    @Override // defpackage.bbvw
    public final List<String> d() {
        return dcdc.g("continuous-video", "auto");
    }

    @Override // defpackage.bbvw
    public final void g(Camera camera, int i) {
        camera.setDisplayOrientation(i);
    }

    public final synchronized void h(Camera camera, Camera.Size size, String str, MediaRecorder mediaRecorder) {
        bvrj.UI_THREAD.d();
        Camera.Parameters parameters = camera.getParameters();
        parameters.setRotation(this.c);
        camera.setParameters(parameters);
        camera.unlock();
        mediaRecorder.setOrientationHint(this.c);
        mediaRecorder.setCamera(camera);
        mediaRecorder.setVideoSource(1);
        mediaRecorder.setAudioSource(1);
        CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
        dbsk.s(camcorderProfile);
        int i = camcorderProfile.fileFormat;
        mediaRecorder.setProfile(camcorderProfile);
        int i2 = size.width;
        int i3 = size.height;
        mediaRecorder.setVideoSize(size.width, size.height);
        try {
            mediaRecorder.setOutputFile(str);
            mediaRecorder.prepare();
            mediaRecorder.start();
            this.g = mediaRecorder;
        } catch (IOException unused) {
            this.h = false;
        }
    }

    public final synchronized boolean i(MediaRecorder mediaRecorder) {
        boolean z;
        bvrj.UI_THREAD.d();
        try {
            mediaRecorder.stop();
            z = true;
        } catch (RuntimeException unused) {
            z = false;
        }
        return z;
    }

    public final synchronized void j(bbvx bbvxVar) {
        Rect c = c();
        int width = c.width();
        int height = c.height();
        ((bbyw) bbvxVar).a = width;
        ((bbyw) bbvxVar).b = height;
        this.h = false;
        MediaRecorder mediaRecorder = this.g;
        if (mediaRecorder == null) {
            return;
        }
        if (this.i == null) {
            return;
        }
        l(mediaRecorder, bbvxVar);
    }

    public final synchronized void k(bbvx bbvxVar) {
        String str = this.i;
        dbsk.s(str);
        Uri b = this.j.b(Uri.fromFile(new File(str)));
        if (b != null) {
            int i = bbyy.r;
            ((bbyw) bbvxVar).c.n = false;
            ((bbyw) bbvxVar).c.y();
            bbyy bbyyVar = ((bbyw) bbvxVar).c;
            bbtj A = bbyyVar.A(b, ((bbyw) bbvxVar).a, ((bbyw) bbvxVar).b, bbyyVar.o, null, dddn.GMM_LIVE_CAMERA);
            if (((bbyw) bbvxVar).c.u().booleanValue() && A != null) {
                ((bbyw) bbvxVar).c.G(A);
            }
        }
    }
}
