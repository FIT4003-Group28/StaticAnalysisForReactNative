package defpackage;

import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hlw  reason: default package */
/* loaded from: classes3.dex */
public final class hlw implements Runnable {
    final /* synthetic */ hmc a;

    public hlw(hmc hmcVar) {
        this.a = hmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!hqs.i(this.a)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        File file = this.a.aE().a;
        if (file != null) {
            this.a.am = zna.e(file, currentTimeMillis);
            hma hmaVar = this.a.b;
            if (hmaVar != null) {
                ((hml) hmaVar).mJ().getWindow().addFlags(128);
            }
            hmc hmcVar = this.a;
            CameraView cameraView = hmcVar.an;
            zkz zkzVar = new zkz(hmcVar.am);
            hmc hmcVar2 = this.a;
            cameraView.M(zkzVar, (360 - hmcVar2.as) % 360, hmcVar2);
            return;
        }
        zna.i(this.a.mJ(), R.string.reel_camera_no_external_storage);
    }
}
