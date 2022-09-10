package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;
/* compiled from: PG */
/* renamed from: cocj  reason: default package */
/* loaded from: classes5.dex */
public abstract class cocj extends clb implements cock {
    public cocj() {
        super("com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((Status) clc.d(parcel, Status.CREATOR), (ForceSettingsCacheRefreshResult) clc.d(parcel, ForceSettingsCacheRefreshResult.CREATOR));
        } else if (i == 2) {
            c((Status) clc.d(parcel, Status.CREATOR), (UpdateActivityControlsSettingsResult) clc.d(parcel, UpdateActivityControlsSettingsResult.CREATOR));
        } else if (i == 3) {
            d((Status) clc.d(parcel, Status.CREATOR), (GetActivityControlsSettingsResult) clc.d(parcel, GetActivityControlsSettingsResult.CREATOR));
        } else if (i == 4) {
            Status status = (Status) clc.d(parcel, Status.CREATOR);
            f();
        } else if (i != 5) {
            return false;
        } else {
            Status status2 = (Status) clc.d(parcel, Status.CREATOR);
            ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult = (ReadDeviceLevelSettingsResult) clc.d(parcel, ReadDeviceLevelSettingsResult.CREATOR);
            e();
        }
        return true;
    }
}
