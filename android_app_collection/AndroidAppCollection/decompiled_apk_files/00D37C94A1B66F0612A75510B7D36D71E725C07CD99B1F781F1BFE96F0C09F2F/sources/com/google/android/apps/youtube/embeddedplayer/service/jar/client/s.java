package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PermissionsWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayabilityStatusWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class s extends dvc implements u {
    public s(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final String a(String str) {
        Parcel pv = pv();
        pv.writeString(str);
        Parcel pw = pw(14, pv);
        String readString = pw.readString();
        pw.recycle();
        return readString;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void f(PermissionsWrapper permissionsWrapper) {
        Parcel pv = pv();
        dve.g(pv, permissionsWrapper);
        px(16, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void g(CommandWrapper commandWrapper) {
        Parcel pv = pv();
        dve.g(pv, commandWrapper);
        px(17, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void h(Bitmap bitmap) {
        Parcel pv = pv();
        dve.g(pv, bitmap);
        px(6, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void i(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(4, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void j(PlayabilityStatusWrapper playabilityStatusWrapper) {
        Parcel pv = pv();
        dve.g(pv, playabilityStatusWrapper);
        px(13, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void k(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(12, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void l(SubscribeButtonData subscribeButtonData) {
        Parcel pv = pv();
        dve.g(pv, subscribeButtonData);
        px(7, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void m(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        Parcel pv = pv();
        dve.g(pv, subscriptionNotificationButtonData);
        px(8, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void n(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        Parcel pv = pv();
        dve.g(pv, subscriptionNotificationMenuData);
        px(9, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void o(CharSequence charSequence) {
        Parcel pv = pv();
        dve.f(pv, charSequence);
        px(3, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void p(int i) {
        Parcel pv = pv();
        pv.writeInt(i);
        px(10, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void q(Bitmap bitmap) {
        Parcel pv = pv();
        dve.g(pv, bitmap);
        px(1, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void r(CharSequence charSequence) {
        Parcel pv = pv();
        dve.f(pv, charSequence);
        px(2, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void s(VideoDetails videoDetails) {
        Parcel pv = pv();
        dve.g(pv, videoDetails);
        px(5, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void t(WatchLaterButtonData watchLaterButtonData) {
        Parcel pv = pv();
        dve.g(pv, watchLaterButtonData);
        px(11, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final boolean u() {
        Parcel pw = pw(15, pv());
        boolean j = dve.j(pw);
        pw.recycle();
        return j;
    }
}
