package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PermissionsWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayabilityStatusWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import j$.util.Optional;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class t extends dvd implements u {
    private final ax a;

    public t(ax axVar) {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
        this.a = axVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final String a(String str) {
        return this.a.d(str);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void f(PermissionsWrapper permissionsWrapper) {
        ax axVar = this.a;
        boolean z = ((aqtv) permissionsWrapper.a).b;
        if (z && !axVar.a.isEmpty()) {
            for (aw awVar : axVar.a) {
                axVar.k(awVar.b(), awVar.a());
            }
        }
        axVar.d.post(new ao(axVar, z));
        axVar.a.clear();
        axVar.t = true != z ? 3 : 2;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void g(CommandWrapper commandWrapper) {
        ax axVar = this.a;
        apzg apzgVar = (apzg) commandWrapper.a;
        if (!axVar.n()) {
            axVar.g.a(apzgVar);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void h(final Bitmap bitmap) {
        final ax axVar = this.a;
        axVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ah
            @Override // java.lang.Runnable
            public final void run() {
                ax axVar2 = ax.this;
                axVar2.c.h.n(bitmap);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void i(boolean z) {
        ax axVar = this.a;
        axVar.s = z;
        axVar.d.post(new ao(axVar, z, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void j(PlayabilityStatusWrapper playabilityStatusWrapper) {
        ax axVar = this.a;
        asaa asaaVar = (asaa) playabilityStatusWrapper.a;
        int cj = awwc.cj(asaaVar.c);
        if (cj == 0) {
            cj = 1;
        }
        if (cj == 1 || cj == 7) {
            axVar.b.a();
            axVar.d.post(new ar(axVar, 2));
            return;
        }
        ((com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.j) axVar.b).b(asaaVar, false, Optional.empty());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void k(boolean z) {
        ax axVar = this.a;
        axVar.d.post(new ao(axVar, z, 3));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void l(final SubscribeButtonData subscribeButtonData) {
        final ax axVar = this.a;
        axVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ak
            @Override // java.lang.Runnable
            public final void run() {
                ax axVar2 = ax.this;
                axVar2.c.h.u(subscribeButtonData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void m(final SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        final ax axVar = this.a;
        axVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.al
            @Override // java.lang.Runnable
            public final void run() {
                ax axVar2 = ax.this;
                axVar2.c.h.w(subscriptionNotificationButtonData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void n(final SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        final ax axVar = this.a;
        axVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.am
            @Override // java.lang.Runnable
            public final void run() {
                ax axVar2 = ax.this;
                axVar2.c.h.pF(subscriptionNotificationMenuData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void o(CharSequence charSequence) {
        com.google.android.apps.youtube.embeddedplayer.service.model.d dVar;
        ax axVar = this.a;
        if (!axVar.s && (dVar = (com.google.android.apps.youtube.embeddedplayer.service.model.d) axVar.m.aJ()) != null) {
            azpm azpmVar = axVar.m;
            com.google.android.apps.youtube.embeddedplayer.service.model.c a = dVar.a();
            a.b = charSequence;
            azpmVar.c(a.a());
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void p(int i) {
        ax axVar = this.a;
        axVar.d.post(new as(axVar, i));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void q(Bitmap bitmap) {
        ax axVar = this.a;
        com.google.android.apps.youtube.embeddedplayer.service.model.d dVar = (com.google.android.apps.youtube.embeddedplayer.service.model.d) axVar.m.aJ();
        if (dVar != null) {
            azpm azpmVar = axVar.m;
            com.google.android.apps.youtube.embeddedplayer.service.model.c a = dVar.a();
            a.c = bitmap;
            azpmVar.c(a.a());
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void r(CharSequence charSequence) {
        com.google.android.apps.youtube.embeddedplayer.service.model.d dVar;
        ax axVar = this.a;
        if (!axVar.s && (dVar = (com.google.android.apps.youtube.embeddedplayer.service.model.d) axVar.m.aJ()) != null) {
            azpm azpmVar = axVar.m;
            com.google.android.apps.youtube.embeddedplayer.service.model.c a = dVar.a();
            a.a = charSequence;
            azpmVar.c(a.a());
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void s(final VideoDetails videoDetails) {
        final ax axVar = this.a;
        axVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.aj
            @Override // java.lang.Runnable
            public final void run() {
                ax axVar2 = ax.this;
                axVar2.c.h.C(videoDetails);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final void t(final WatchLaterButtonData watchLaterButtonData) {
        final ax axVar = this.a;
        axVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.an
            @Override // java.lang.Runnable
            public final void run() {
                ax axVar2 = ax.this;
                axVar2.c.h.E(watchLaterButtonData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.u
    public final boolean u() {
        Optional a = this.a.c.h.a();
        if (!a.isPresent()) {
            return false;
        }
        return ((View) a.get()).isAttachedToWindow();
    }

    public t() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                q((Bitmap) dve.a(parcel, Bitmap.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                r(dve.b(parcel));
                parcel2.writeNoException();
                return true;
            case 3:
                o(dve.b(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                i(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                s((VideoDetails) dve.a(parcel, VideoDetails.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                h((Bitmap) dve.a(parcel, Bitmap.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                l((SubscribeButtonData) dve.a(parcel, SubscribeButtonData.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                m((SubscriptionNotificationButtonData) dve.a(parcel, SubscriptionNotificationButtonData.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                n((SubscriptionNotificationMenuData) dve.a(parcel, SubscriptionNotificationMenuData.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                p(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 11:
                t((WatchLaterButtonData) dve.a(parcel, WatchLaterButtonData.CREATOR));
                parcel2.writeNoException();
                return true;
            case 12:
                k(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 13:
                j((PlayabilityStatusWrapper) dve.a(parcel, PlayabilityStatusWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                String a = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 15:
                boolean u = u();
                parcel2.writeNoException();
                dve.e(parcel2, u);
                return true;
            case 16:
                f((PermissionsWrapper) dve.a(parcel, PermissionsWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                g((CommandWrapper) dve.a(parcel, CommandWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
