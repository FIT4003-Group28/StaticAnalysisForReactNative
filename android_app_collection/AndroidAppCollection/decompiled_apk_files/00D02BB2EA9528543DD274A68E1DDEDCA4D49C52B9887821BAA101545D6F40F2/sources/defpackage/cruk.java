package defpackage;

import com.google.android.libraries.geophotouploader.UploadService;
/* renamed from: cruk  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cruk implements cruu {
    public static final cruu a = new cruk();

    private cruk() {
    }

    @Override // defpackage.cruu
    public final void a(UploadService uploadService) {
        if (((int) uploadService.h.c()) <= 0) {
            return;
        }
        uploadService.a();
        uploadService.i.a.c("geo.uploader.wait_for_wifi_task");
        uploadService.a.e();
        crwb crwbVar = uploadService.g;
        if (crwbVar.p) {
            uploadService.i.a(crwbVar);
        }
        if (!new crxq(uploadService).c()) {
            return;
        }
        uploadService.a.l(61);
    }
}
