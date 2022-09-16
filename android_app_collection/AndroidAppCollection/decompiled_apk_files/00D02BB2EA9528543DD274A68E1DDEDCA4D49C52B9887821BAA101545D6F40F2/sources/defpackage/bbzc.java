package defpackage;

import android.hardware.Camera;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbzc  reason: default package */
/* loaded from: classes3.dex */
public final class bbzc implements Camera.PictureCallback {
    final /* synthetic */ bduq a;
    final /* synthetic */ bbvx b;
    final /* synthetic */ bbzd c;

    public bbzc(bbzd bbzdVar, bduq bduqVar, bbvx bbvxVar) {
        this.c = bbzdVar;
        this.a = bduqVar;
        this.b = bbvxVar;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        camera.cancelAutoFocus();
        this.c.g.b(new bbzb(this, bArr), bvrj.BACKGROUND_THREADPOOL);
        this.c.f(camera);
    }
}
