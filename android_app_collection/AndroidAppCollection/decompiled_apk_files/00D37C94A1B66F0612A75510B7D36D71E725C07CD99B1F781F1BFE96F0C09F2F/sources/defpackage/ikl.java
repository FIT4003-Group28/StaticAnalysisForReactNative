package defpackage;

import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
/* compiled from: PG */
/* renamed from: ikl  reason: default package */
/* loaded from: classes3.dex */
public final class ikl extends ajmg {
    final /* synthetic */ UploadActivity a;

    public ikl(UploadActivity uploadActivity) {
        this.a = uploadActivity;
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void a(ImageView imageView) {
        zep.l("Upload active account header thumbnail could not be loaded.");
        this.a.ae.setBackgroundResource(2131232143);
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void b(ImageView imageView) {
        this.a.ae.setBackground(null);
    }
}
