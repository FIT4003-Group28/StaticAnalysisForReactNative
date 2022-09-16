package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qcf  reason: default package */
/* loaded from: classes4.dex */
public final class qcf extends dvd implements qcg {
    private final Object a;
    private volatile qch b;

    public qcf() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public qcf(byte[] bArr) {
        super("com.google.android.gms.ads.internal.client.IVideoController");
        this.a = new Object();
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qch qchVar;
        qch qchVar2;
        switch (i) {
            case 1:
                throw new RemoteException();
            case 2:
                throw new RemoteException();
            case 3:
                dve.j(parcel);
                throw new RemoteException();
            case 4:
                throw new RemoteException();
            case 5:
                throw new RemoteException();
            case 6:
                throw new RemoteException();
            case 7:
                throw new RemoteException();
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    qchVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof qch) {
                        qchVar = (qch) queryLocalInterface;
                    } else {
                        qchVar = new qch(readStrongBinder);
                    }
                }
                synchronized (this.a) {
                    this.b = qchVar;
                }
                parcel2.writeNoException();
                return true;
            case 9:
                throw new RemoteException();
            case 10:
                throw new RemoteException();
            case 11:
                synchronized (this.a) {
                    qchVar2 = this.b;
                }
                parcel2.writeNoException();
                dve.i(parcel2, qchVar2);
                return true;
            case 12:
                throw new RemoteException();
            case 13:
                throw new RemoteException();
            default:
                return false;
        }
    }
}
