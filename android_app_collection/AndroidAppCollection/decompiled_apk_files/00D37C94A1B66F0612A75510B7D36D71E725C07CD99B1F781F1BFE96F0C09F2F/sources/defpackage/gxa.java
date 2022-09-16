package defpackage;

import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
/* compiled from: PG */
/* renamed from: gxa  reason: default package */
/* loaded from: classes3.dex */
public final class gxa {
    final /* synthetic */ gxk a;

    public gxa(gxk gxkVar) {
        this.a = gxkVar;
    }

    public final void a(int i) {
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.a.aC;
        if (multiSegmentCameraProgressIndicator == null) {
            zep.b("Unexpected null recordingProgressIndicator in call to onRecordingDurationSelected");
            return;
        }
        aqxo.p(i >= 0);
        multiSegmentCameraProgressIndicator.c = i;
        multiSegmentCameraProgressIndicator.postInvalidate();
    }
}
