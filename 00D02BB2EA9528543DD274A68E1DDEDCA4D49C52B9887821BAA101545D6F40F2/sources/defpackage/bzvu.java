package defpackage;

import android.widget.Toast;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationUpdater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzvu  reason: default package */
/* loaded from: classes4.dex */
public final class bzvu implements bqlb {
    final /* synthetic */ bzvx a;
    final /* synthetic */ bzvv b;

    public bzvu(bzvv bzvvVar, bzvx bzvxVar) {
        this.b = bzvvVar;
        this.a = bzvxVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        int i = ReviewAtAPlaceNotificationUpdater.g;
        Toast.makeText(this.b.a, this.a.d(), 0).show();
        if (this.a.e().a()) {
            this.a.e().b().run();
        }
    }

    @Override // defpackage.bqlb
    public final void e() {
        int i = ReviewAtAPlaceNotificationUpdater.g;
        Toast.makeText(this.b.a, this.a.f(), 1).show();
        if (this.a.g().a()) {
            this.a.g().b().run();
        }
    }
}
