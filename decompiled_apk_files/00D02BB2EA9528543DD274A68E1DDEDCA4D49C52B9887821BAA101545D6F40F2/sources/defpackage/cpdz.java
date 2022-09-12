package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;
import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: cpdz  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpdz extends clb implements cpea {
    public cpdz() {
        super("com.google.android.gms.udc.internal.IUdcCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) clc.d(parcel, Status.CREATOR);
                parcel.createByteArray();
                k();
                return true;
            case 2:
                Status status2 = (Status) clc.d(parcel, Status.CREATOR);
                parcel.createByteArray();
                i();
                return true;
            case 3:
                Status status3 = (Status) clc.d(parcel, Status.CREATOR);
                parcel.createByteArray();
                d();
                return true;
            case 4:
                Status status4 = (Status) clc.d(parcel, Status.CREATOR);
                parcel.createByteArray();
                e();
                return true;
            case 5:
                parcel.createTypedArrayList(SettingState.CREATOR);
                l((Status) clc.d(parcel, Status.CREATOR));
                return true;
            case 6:
                Status status5 = (Status) clc.d(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) clc.d(parcel, PendingIntent.CREATOR);
                j();
                return true;
            case 7:
                b((Status) clc.d(parcel, Status.CREATOR), (SettingDisplayInfo) clc.d(parcel, SettingDisplayInfo.CREATOR), (PendingIntent) clc.d(parcel, PendingIntent.CREATOR));
                return true;
            case 8:
                c((Status) clc.d(parcel, Status.CREATOR), (UdcCacheResponse) clc.d(parcel, UdcCacheResponse.CREATOR));
                return true;
            case 9:
                Status status6 = (Status) clc.d(parcel, Status.CREATOR);
                h();
                return true;
            case 10:
                Status status7 = (Status) clc.d(parcel, Status.CREATOR);
                DeviceDataUploadOptInFlags deviceDataUploadOptInFlags = (DeviceDataUploadOptInFlags) clc.d(parcel, DeviceDataUploadOptInFlags.CREATOR);
                f();
                return true;
            case 11:
                Status status8 = (Status) clc.d(parcel, Status.CREATOR);
                DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable = (DeviceDataUploadOptedInAccountsParcelable) clc.d(parcel, DeviceDataUploadOptedInAccountsParcelable.CREATOR);
                g();
                return true;
            default:
                return false;
        }
    }
}
