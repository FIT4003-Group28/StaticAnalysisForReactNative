package defpackage;

import com.google.android.apps.maps.R;
import com.google.android.libraries.geophotouploader.UploadService;
/* renamed from: cruj  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cruj implements cruu {
    public static final cruu a = new cruj();

    private cruj() {
    }

    @Override // defpackage.cruu
    public final void a(UploadService uploadService) {
        if (!uploadService.k) {
            uploadService.k = true;
            uploadService.j.b(uploadService, uploadService.getResources().getString(R.string.STOPPING_UPLOADS_TITLE), true);
            crwb crwbVar = uploadService.g;
            if (crwbVar.p) {
                uploadService.i.a(crwbVar);
            }
            new crus(uploadService).execute(new Void[0]);
        }
    }
}
