package defpackage;

import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
/* compiled from: PG */
/* renamed from: ikk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ikk implements Runnable {
    public final /* synthetic */ UploadActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ ikk(UploadActivity uploadActivity) {
        this.a = uploadActivity;
    }

    public /* synthetic */ ikk(UploadActivity uploadActivity, int i) {
        this.b = i;
        this.a = uploadActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            UploadActivity uploadActivity = this.a;
            uploadActivity.D(uploadActivity.X);
        } else if (i == 1) {
            UploadActivity uploadActivity2 = this.a;
            ilh ilhVar = uploadActivity2.s;
            for (alfc alfcVar : ilhVar.D) {
                ilhVar.G.i(alfcVar.e(), avul.UPLOAD_FRONTEND_EVENT_TYPE_ZERO_STEP_CHANNEL_CREATION_FAILED, alfcVar.h(), alfcVar.f());
            }
            uploadActivity2.Z.a();
            uploadActivity2.aa.b(true);
        } else {
            UploadActivity uploadActivity3 = this.a;
            ilh ilhVar2 = uploadActivity3.s;
            for (alfc alfcVar2 : ilhVar2.D) {
                ilhVar2.G.i(alfcVar2.e(), avul.UPLOAD_FRONTEND_EVENT_TYPE_ZERO_STEP_CHANNEL_CREATION_COMPLETED, alfcVar2.h(), alfcVar2.f());
            }
            uploadActivity3.G();
            uploadActivity3.Z.a();
            uploadActivity3.aa.b(true);
            uploadActivity3.v();
        }
    }
}
