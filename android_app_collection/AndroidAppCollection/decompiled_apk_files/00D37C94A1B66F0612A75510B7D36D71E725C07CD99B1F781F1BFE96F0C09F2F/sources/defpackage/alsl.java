package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.play.core.review.ReviewInfo;
/* compiled from: PG */
/* renamed from: alsl  reason: default package */
/* loaded from: classes.dex */
final class alsl extends alrq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alsl(alsm alsmVar, alvg alvgVar) {
        super(alsmVar, alvgVar);
        new alrz("OnRequestInstallCallback");
    }

    @Override // defpackage.alrq
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.a.b(ReviewInfo.b((PendingIntent) bundle.get("confirmation_intent")));
    }
}
