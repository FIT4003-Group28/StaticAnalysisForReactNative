package defpackage;

import android.os.AsyncTask;
import com.google.android.libraries.geophotouploader.UploadService;
/* compiled from: PG */
/* renamed from: crup  reason: default package */
/* loaded from: classes5.dex */
public final class crup extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ UploadService a;

    public crup(UploadService uploadService) {
        this.a = uploadService;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        this.a.stopSelf();
        return null;
    }
}
