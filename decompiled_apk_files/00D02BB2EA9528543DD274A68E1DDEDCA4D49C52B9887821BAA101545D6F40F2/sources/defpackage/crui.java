package defpackage;

import com.google.android.apps.maps.R;
import com.google.android.libraries.geophotouploader.UploadService;
/* renamed from: crui  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class crui implements cruu {
    public static final cruu a = new crui();

    private crui() {
    }

    @Override // defpackage.cruu
    public final void a(UploadService uploadService) {
        if (!uploadService.k) {
            uploadService.k = true;
            uploadService.j.b(uploadService, uploadService.getResources().getString(R.string.CANCELLING_UPLOADS_TITLE), true);
            crwb crwbVar = uploadService.g;
            if (crwbVar.p && crwbVar.u) {
                uploadService.i.a.c("geo.uploader.periodic_check");
            }
            new cruo(uploadService).execute(new Void[0]);
        }
    }
}
