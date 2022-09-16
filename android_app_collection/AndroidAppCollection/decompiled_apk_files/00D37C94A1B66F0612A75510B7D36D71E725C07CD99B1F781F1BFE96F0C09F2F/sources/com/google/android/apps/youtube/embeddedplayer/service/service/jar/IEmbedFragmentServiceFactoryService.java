package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.s;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.u;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IEmbedFragmentServiceFactoryService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public abstract class Stub extends dvd implements IEmbedFragmentServiceFactoryService {

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public class Proxy extends dvc implements IEmbedFragmentServiceFactoryService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
            }

            @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService
            public final IEmbedFragmentService a(u uVar, int i) {
                IEmbedFragmentService proxy;
                Parcel pv = pv();
                dve.i(pv, uVar);
                pv.writeInt(i);
                Parcel pw = pw(1, pv);
                IBinder readStrongBinder = pw.readStrongBinder();
                if (readStrongBinder == null) {
                    proxy = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
                    if (queryLocalInterface instanceof IEmbedFragmentService) {
                        proxy = (IEmbedFragmentService) queryLocalInterface;
                    } else {
                        proxy = new IEmbedFragmentService.Stub.Proxy(readStrongBinder);
                    }
                }
                pw.recycle();
                return proxy;
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
        }

        @Override // defpackage.dvd
        protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            u sVar;
            if (i == 1) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    sVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
                    if (queryLocalInterface instanceof u) {
                        sVar = (u) queryLocalInterface;
                    } else {
                        sVar = new s(readStrongBinder);
                    }
                }
                IEmbedFragmentService a = a(sVar, parcel.readInt());
                parcel2.writeNoException();
                dve.i(parcel2, a);
                return true;
            }
            return false;
        }
    }

    IEmbedFragmentService a(u uVar, int i);
}
