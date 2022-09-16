package defpackage;

import android.util.Log;
import android.widget.Toast;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acfv  reason: default package */
/* loaded from: classes.dex */
public final class acfv {
    final /* synthetic */ acgd a;

    public acfv(acgd acgdVar) {
        this.a = acgdVar;
    }

    public final void a(Exception exc) {
        acgd acgdVar = this.a;
        Log.e("SelfViewWindow", "Camera preview failed", exc);
        String string = acgdVar.f.getResources().getString(R.string.camera_preview_error);
        acgb acgbVar = acgdVar.p;
        if (acgbVar != null) {
            Log.e("ScreencastControls", "Disabling camera preview support due to camera error.");
            ((acfs) acgbVar).c.l(false);
        } else {
            Toast.makeText(acgdVar.f, string, 0).show();
        }
        acgdVar.e(false, null);
        aces acesVar = acgdVar.t;
        if (acesVar != null) {
            acesVar.l();
            acgdVar.t.b();
        }
    }
}
