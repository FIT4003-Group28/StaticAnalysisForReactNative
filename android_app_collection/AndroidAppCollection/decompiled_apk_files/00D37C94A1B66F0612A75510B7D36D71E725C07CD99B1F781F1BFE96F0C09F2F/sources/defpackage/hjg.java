package defpackage;

import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.CroppedVideoWithPreviewView;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hjg  reason: default package */
/* loaded from: classes3.dex */
final class hjg extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ hjh a;

    public hjg(hjh hjhVar) {
        this.a = hjhVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        hje hjeVar;
        hjh hjhVar = this.a;
        if (!hjhVar.g || (hjeVar = hjhVar.b) == null) {
            return false;
        }
        hjeVar.a(f);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        String string;
        hje hjeVar = this.a.b;
        if (hjeVar != null) {
            actj actjVar = actj.SHORTS_CREATION_TRIM_PLAY_BUTTON;
            hjm hjmVar = (hjm) hjeVar;
            gyq gyqVar = hjmVar.ar;
            if (gyqVar != null) {
                gyqVar.a(actjVar).b();
            }
            TrimVideoControllerView trimVideoControllerView = hjmVar.b;
            if (!trimVideoControllerView.h && !hjmVar.a.z) {
                trimVideoControllerView.p();
                hjmVar.aj = !hjmVar.aQ();
                CroppedVideoWithPreviewView q = hjmVar.q();
                boolean aQ = hjmVar.aQ();
                Resources rh = hjmVar.rh();
                if (aQ) {
                    string = rh.getString(R.string.shorts_a11y_video_preview_tap_to_pause);
                } else {
                    string = rh.getString(R.string.shorts_a11y_video_preview_tap_to_play);
                }
                q.setContentDescription(string);
            }
        }
        return true;
    }
}
