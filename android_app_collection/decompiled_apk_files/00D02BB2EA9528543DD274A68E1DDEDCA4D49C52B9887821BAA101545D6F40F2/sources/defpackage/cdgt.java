package defpackage;

import android.media.FaceDetector;
/* compiled from: PG */
/* renamed from: cdgt  reason: default package */
/* loaded from: classes4.dex */
final class cdgt implements cdgx {
    private final FaceDetector.Face a;

    public cdgt(FaceDetector.Face face) {
        this.a = face;
    }

    @Override // defpackage.cdgx
    public final float a() {
        return this.a.confidence();
    }
}
