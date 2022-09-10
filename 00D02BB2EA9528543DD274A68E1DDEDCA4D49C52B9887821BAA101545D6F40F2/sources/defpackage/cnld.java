package defpackage;

import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: cnld  reason: default package */
/* loaded from: classes.dex */
public abstract class cnld extends clb implements cnle {
    public cnld() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                b((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 2:
                Status status = (Status) clc.d(parcel, Status.CREATOR);
                c();
                return true;
            case 3:
                Status status2 = (Status) clc.d(parcel, Status.CREATOR);
                parcel.readLong();
                g();
                return true;
            case 4:
                Status status3 = (Status) clc.d(parcel, Status.CREATOR);
                h();
                return true;
            case 5:
                Status status4 = (Status) clc.d(parcel, Status.CREATOR);
                parcel.readLong();
                d();
                return true;
            case 6:
                Status status5 = (Status) clc.d(parcel, Status.CREATOR);
                LogEventParcelable[] logEventParcelableArr = (LogEventParcelable[]) parcel.createTypedArray(LogEventParcelable.CREATOR);
                e();
                return true;
            case 7:
                DataHolder dataHolder = (DataHolder) clc.d(parcel, DataHolder.CREATOR);
                f();
                return true;
            default:
                return false;
        }
    }
}
