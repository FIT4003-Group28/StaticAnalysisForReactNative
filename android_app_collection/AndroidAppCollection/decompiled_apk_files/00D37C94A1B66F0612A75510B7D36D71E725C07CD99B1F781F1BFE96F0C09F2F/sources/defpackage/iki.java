package defpackage;

import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
/* compiled from: PG */
/* renamed from: iki  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iki implements zdt {
    public final /* synthetic */ UploadActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ iki(UploadActivity uploadActivity) {
        this.a = uploadActivity;
    }

    public /* synthetic */ iki(UploadActivity uploadActivity, int i) {
        this.b = i;
        this.a = uploadActivity;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.E((asvk) obj);
        } else if (i == 1) {
            UploadActivity uploadActivity = this.a;
            String b = uploadActivity.k.c().b();
            aldw aldwVar = aldw.a;
            aoqp aoqpVar = ((aldy) obj).b;
            if (aoqpVar.containsKey(b)) {
                aldwVar = (aldw) aoqpVar.get(b);
            }
            uploadActivity.af = aldwVar.c;
            int i2 = aldwVar.b;
            if ((i2 & 2) != 0) {
                uploadActivity.ai = aldwVar.d;
            }
            if ((i2 & 4) == 0) {
                return;
            }
            aldv aldvVar = aldwVar.e;
            if (aldvVar == null) {
                aldvVar = aldv.a;
            }
            uploadActivity.ah = ampq.j(aldvVar);
        } else {
            UploadActivity uploadActivity2 = this.a;
            zep.d("Error getting location.", (Throwable) obj);
            uploadActivity2.E(null);
        }
    }
}
