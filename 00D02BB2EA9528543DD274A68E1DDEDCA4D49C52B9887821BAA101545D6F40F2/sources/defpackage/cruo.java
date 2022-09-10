package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.geophotouploader.UploadService;
/* compiled from: PG */
/* renamed from: cruo  reason: default package */
/* loaded from: classes5.dex */
final class cruo extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ UploadService a;

    public cruo(UploadService uploadService) {
        this.a = uploadService;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        this.a.a.h(true);
        this.a.k = false;
        return null;
    }
}
