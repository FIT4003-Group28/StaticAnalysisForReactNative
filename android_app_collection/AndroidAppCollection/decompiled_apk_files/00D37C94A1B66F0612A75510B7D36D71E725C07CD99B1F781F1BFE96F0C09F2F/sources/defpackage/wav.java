package defpackage;

import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
/* compiled from: PG */
/* renamed from: wav  reason: default package */
/* loaded from: classes4.dex */
final class wav implements Runnable {
    final /* synthetic */ Exception a;
    final /* synthetic */ waw b;

    public wav(waw wawVar, Exception exc) {
        this.b = wawVar;
        this.a = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        arag aragVar;
        waw wawVar = this.b;
        wax waxVar = wawVar.c;
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = wawVar.b;
        if ((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b & 256) != 0) {
            aragVar = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        waxVar.p(ajgl.b(aragVar).toString(), new wat(this.a));
    }
}
