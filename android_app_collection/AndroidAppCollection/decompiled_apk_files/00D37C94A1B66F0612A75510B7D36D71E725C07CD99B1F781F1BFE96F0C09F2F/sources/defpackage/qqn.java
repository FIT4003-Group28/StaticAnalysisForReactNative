package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: qqn  reason: default package */
/* loaded from: classes4.dex */
public class qqn extends dvd implements IInterface {
    public qqn() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((Status) dve.a(parcel, Status.CREATOR));
                return true;
            case 2:
                Status status = (Status) dve.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                Status status2 = (Status) dve.a(parcel, Status.CREATOR);
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 4:
                Status status3 = (Status) dve.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 5:
                Status status4 = (Status) dve.a(parcel, Status.CREATOR);
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 6:
                Status status5 = (Status) dve.a(parcel, Status.CREATOR);
                LogEventParcelable[] logEventParcelableArr = (LogEventParcelable[]) parcel.createTypedArray(LogEventParcelable.CREATOR);
                throw new UnsupportedOperationException();
            case 7:
                DataHolder dataHolder = (DataHolder) dve.a(parcel, DataHolder.CREATOR);
                throw new UnsupportedOperationException();
            case 8:
                Status status6 = (Status) dve.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
