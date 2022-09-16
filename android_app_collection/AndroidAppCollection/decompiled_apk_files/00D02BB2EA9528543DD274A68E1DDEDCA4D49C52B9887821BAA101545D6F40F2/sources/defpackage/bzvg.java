package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationAdapter$AdapterParams;
/* compiled from: PG */
/* renamed from: bzvg  reason: default package */
/* loaded from: classes4.dex */
public final class bzvg extends BroadcastReceiver {
    final /* synthetic */ bzvv a;
    final /* synthetic */ ReviewAtAPlaceNotificationAdapter$AdapterParams b;

    public bzvg(bzvv bzvvVar, ReviewAtAPlaceNotificationAdapter$AdapterParams reviewAtAPlaceNotificationAdapter$AdapterParams) {
        this.a = bzvvVar;
        this.b = reviewAtAPlaceNotificationAdapter$AdapterParams;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bzvv bzvvVar = this.a;
        bzuy p = this.b.p();
        p.b(false);
        bzvvVar.b(p.f());
        context.unregisterReceiver(this);
    }
}
