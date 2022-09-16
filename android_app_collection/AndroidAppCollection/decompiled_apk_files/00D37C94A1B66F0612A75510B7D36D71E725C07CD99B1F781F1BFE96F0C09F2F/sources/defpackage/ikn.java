package defpackage;

import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ikn  reason: default package */
/* loaded from: classes3.dex */
public final class ikn implements afzf {
    final /* synthetic */ UploadActivity a;

    public ikn(UploadActivity uploadActivity) {
        this.a = uploadActivity;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Cannot load GetUploadVideoFormResponse from InnerTube.", cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        final asfp asfpVar = (asfp) obj;
        this.a.runOnUiThread(new Runnable() { // from class: ikm
            @Override // java.lang.Runnable
            public final void run() {
                ikn iknVar = ikn.this;
                iknVar.a.D(asfpVar);
            }
        });
    }
}
