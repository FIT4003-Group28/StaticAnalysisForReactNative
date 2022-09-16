package defpackage;

import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qon  reason: default package */
/* loaded from: classes4.dex */
public final class qon extends dvd implements IInterface {
    final /* synthetic */ qok a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qon(qok qokVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
        this.a = qokVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.a.publishProgress(Long.valueOf(parcel.readLong()), Long.valueOf(parcel.readLong()));
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(213380000);
        }
        return true;
    }

    public qon() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }
}
