package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alyp  reason: default package */
/* loaded from: classes.dex */
public class alyp extends dvd implements IInterface {
    public alyp() {
        super("com.google.android.youtube.player.internal.IServiceBroker");
    }

    public void a(alyc alycVar, int i, String str, String str2, String str3) {
        throw null;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        alyc alycVar;
        alyc alycVar2;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                alycVar2 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
                if (queryLocalInterface instanceof alyc) {
                    alycVar2 = (alyc) queryLocalInterface;
                } else {
                    alycVar = new alyc(readStrongBinder);
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    Bundle bundle = (Bundle) dve.a(parcel, Bundle.CREATOR);
                    a(alycVar, readInt, readString, readString2, readString3);
                    parcel2.writeNoException();
                    return true;
                }
            }
            alycVar = alycVar2;
            int readInt2 = parcel.readInt();
            String readString4 = parcel.readString();
            String readString22 = parcel.readString();
            String readString32 = parcel.readString();
            Bundle bundle2 = (Bundle) dve.a(parcel, Bundle.CREATOR);
            a(alycVar, readInt2, readString4, readString22, readString32);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
