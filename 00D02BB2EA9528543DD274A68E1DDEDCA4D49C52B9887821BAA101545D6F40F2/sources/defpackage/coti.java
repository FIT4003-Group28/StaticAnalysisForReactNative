package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
/* compiled from: PG */
/* renamed from: coti  reason: default package */
/* loaded from: classes5.dex */
public abstract class coti extends clb implements cotj {
    public coti() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((Status) clc.d(parcel, Status.CREATOR), (OpenFileDescriptorResponse) clc.d(parcel, OpenFileDescriptorResponse.CREATOR));
        } else if (i == 2) {
            c((Status) clc.d(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            d((Status) clc.d(parcel, Status.CREATOR));
        }
        return true;
    }
}
