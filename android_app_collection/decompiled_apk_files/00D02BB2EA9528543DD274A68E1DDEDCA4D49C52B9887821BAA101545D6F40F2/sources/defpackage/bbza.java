package defpackage;

import android.hardware.Camera;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbza  reason: default package */
/* loaded from: classes3.dex */
public final class bbza implements Camera.AutoFocusCallback {
    final /* synthetic */ bbvx a;
    final /* synthetic */ bduq b;
    final /* synthetic */ bbzd c;

    public bbza(bbzd bbzdVar, bbvx bbvxVar, bduq bduqVar) {
        this.c = bbzdVar;
        this.a = bbvxVar;
        this.b = bduqVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        try {
            bbzd bbzdVar = this.c;
            bbvx bbvxVar = this.a;
            bduq bduqVar = this.b;
            bbzdVar.b = false;
            camera.takePicture(null, null, new bbzc(bbzdVar, bduqVar, bbvxVar));
        } catch (RuntimeException unused) {
            bbvx bbvxVar2 = this.a;
            int i = bbyy.r;
            ((bbyu) bbvxVar2).e.K(false);
        }
    }
}
