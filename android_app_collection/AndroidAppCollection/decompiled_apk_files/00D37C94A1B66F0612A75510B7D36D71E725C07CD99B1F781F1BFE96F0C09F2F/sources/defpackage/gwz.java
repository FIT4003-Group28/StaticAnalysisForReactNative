package defpackage;

import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
/* compiled from: PG */
/* renamed from: gwz  reason: default package */
/* loaded from: classes3.dex */
final class gwz implements hha {
    final /* synthetic */ gxk a;

    public gwz(gxk gxkVar) {
        this.a = gxkVar;
    }

    @Override // defpackage.hha
    public final void a() {
        this.a.aN();
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.a.aC;
        if (multiSegmentCameraProgressIndicator != null) {
            multiSegmentCameraProgressIndicator.setVisibility(0);
        }
    }

    @Override // defpackage.hha
    public final void b() {
        this.a.aG();
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.a.aC;
        if (multiSegmentCameraProgressIndicator != null) {
            multiSegmentCameraProgressIndicator.setVisibility(4);
        }
    }
}
