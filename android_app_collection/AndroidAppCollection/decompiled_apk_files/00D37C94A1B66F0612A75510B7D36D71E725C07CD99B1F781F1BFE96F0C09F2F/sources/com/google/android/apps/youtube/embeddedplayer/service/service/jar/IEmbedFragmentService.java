package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IEmbedFragmentService extends IInterface {
    int a();

    c b();

    d d();

    void e(int i);

    void f();

    void g();

    void h(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem);

    void i();

    void j();

    void r(SimplePlaybackDescriptor simplePlaybackDescriptor);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class Stub extends dvd implements IEmbedFragmentService {

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public class Proxy extends dvc implements IEmbedFragmentService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final int a() {
                Parcel pw = pw(3, pv());
                int readInt = pw.readInt();
                pw.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final c b() {
                c aVar;
                Parcel pw = pw(9, pv());
                IBinder readStrongBinder = pw.readStrongBinder();
                if (readStrongBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.IEmbedErrorLoggingService");
                    if (queryLocalInterface instanceof c) {
                        aVar = (c) queryLocalInterface;
                    } else {
                        aVar = new a(readStrongBinder);
                    }
                }
                pw.recycle();
                return aVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final d d() {
                d bVar;
                Parcel pw = pw(10, pv());
                IBinder readStrongBinder = pw.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.IEmbedInteractionLoggingService");
                    if (queryLocalInterface instanceof d) {
                        bVar = (d) queryLocalInterface;
                    } else {
                        bVar = new b(readStrongBinder);
                    }
                }
                pw.recycle();
                return bVar;
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final void e(int i) {
                Parcel pv = pv();
                pv.writeInt(i);
                px(4, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final void f() {
                px(5, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a
            public final void g() {
                px(6, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d
            public final void h(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
                Parcel pv = pv();
                dve.g(pv, subscriptionNotificationMenuItem);
                px(7, pv);
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final void i() {
                px(2, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a
            public final void j() {
                px(8, pv());
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService
            public final void r(SimplePlaybackDescriptor simplePlaybackDescriptor) {
                Parcel pv = pv();
                dve.g(pv, simplePlaybackDescriptor);
                px(1, pv);
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
        }

        @Override // defpackage.dvd
        protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    r((SimplePlaybackDescriptor) dve.a(parcel, SimplePlaybackDescriptor.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    i();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    int a = a();
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 4:
                    e(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    f();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    g();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    h((SubscriptionNotificationMenuItem) dve.a(parcel, SubscriptionNotificationMenuItem.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    j();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    c b = b();
                    parcel2.writeNoException();
                    dve.i(parcel2, b);
                    return true;
                case 10:
                    d d = d();
                    parcel2.writeNoException();
                    dve.i(parcel2, d);
                    return true;
                default:
                    return false;
            }
        }
    }
}
