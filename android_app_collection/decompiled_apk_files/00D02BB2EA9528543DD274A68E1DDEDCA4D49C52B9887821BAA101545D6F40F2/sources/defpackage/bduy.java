package defpackage;

import android.hardware.Camera;
import android.media.MediaRecorder;
import android.view.GestureDetector;
import android.view.MotionEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bduy  reason: default package */
/* loaded from: classes3.dex */
public final class bduy extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ bduz a;

    public bduy(bduz bduzVar) {
        this.a = bduzVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        bduz bduzVar = this.a;
        bduzVar.b = true;
        bbyy bbyyVar = bduzVar.c.a;
        if (!bbyyVar.C().booleanValue()) {
            bbyyVar.i();
        } else if (!bbyyVar.p) {
            bbyyVar.i.b(bbyyVar.b);
        } else if (bbyyVar.m || bbyyVar.n) {
        } else {
            bbyyVar.n = true;
            bbyyVar.o = bbyyVar.g.b();
            bbwn bbwnVar = (bbwn) bbyyVar.h;
            final Camera camera = bbwnVar.h;
            if (camera != null) {
                final bbzi f = bbwnVar.f();
                final MediaRecorder mediaRecorder = new MediaRecorder();
                f.e.b(new Runnable(f, camera, mediaRecorder) { // from class: bbzg
                    private final bbzi a;
                    private final Camera b;
                    private final MediaRecorder c;

                    {
                        this.a = f;
                        this.b = camera;
                        this.c = mediaRecorder;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        bbzi bbziVar = this.a;
                        Camera camera2 = this.b;
                        MediaRecorder mediaRecorder2 = this.c;
                        synchronized (bbziVar) {
                            Camera.Size size = bbziVar.d;
                            bbziVar.i = bbziVar.f.b();
                            if (size != null && (str = bbziVar.i) != null) {
                                bbziVar.h(camera2, size, str, mediaRecorder2);
                                return;
                            }
                            bbziVar.h = false;
                        }
                    }
                }, bvrj.BACKGROUND_THREADPOOL);
                f.h = true;
            }
            bbyyVar.a.g(false);
            cqkx.p(bbyyVar);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.c.a.i();
        return true;
    }
}
