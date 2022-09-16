package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alyt  reason: default package */
/* loaded from: classes.dex */
public abstract class alyt extends dvd implements alyu {
    public alyt() {
        super("com.google.android.youtube.player.internal.IYouTubeService");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        alyq alyqVar;
        if (i == 1) {
            IBinder d = d();
            parcel2.writeNoException();
            parcel2.writeStrongBinder(d);
        } else if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                alyqVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                if (queryLocalInterface instanceof alyq) {
                    alyqVar = (alyq) queryLocalInterface;
                } else {
                    alyqVar = new alyq(readStrongBinder);
                }
            }
            alys h = h(alyqVar);
            parcel2.writeNoException();
            dve.i(parcel2, h);
        } else if (i == 3) {
            dve.j(parcel);
            g();
            parcel2.writeNoException();
        } else if (i != 4) {
            return false;
        } else {
            IBinder e = e();
            parcel2.writeNoException();
            parcel2.writeStrongBinder(e);
        }
        return true;
    }
}
