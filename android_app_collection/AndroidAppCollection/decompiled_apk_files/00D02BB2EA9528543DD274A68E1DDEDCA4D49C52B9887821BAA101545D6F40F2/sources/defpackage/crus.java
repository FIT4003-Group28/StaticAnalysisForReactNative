package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.geophotouploader.UploadService;
/* compiled from: PG */
/* renamed from: crus  reason: default package */
/* loaded from: classes5.dex */
final class crus extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ UploadService a;

    public crus(UploadService uploadService) {
        this.a = uploadService;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        int a = this.a.a.i.a();
        int b = this.a.a.i.b();
        this.a.a.l(60);
        this.a.a.h(false);
        UploadService uploadService = this.a;
        uploadService.k = false;
        uploadService.j.d(a, b);
        return null;
    }
}
