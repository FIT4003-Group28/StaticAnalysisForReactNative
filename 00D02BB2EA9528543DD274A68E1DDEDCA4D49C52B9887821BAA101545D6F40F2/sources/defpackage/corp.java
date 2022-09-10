package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.SyncResult;
/* compiled from: PG */
/* renamed from: corp  reason: default package */
/* loaded from: classes5.dex */
public abstract class corp extends clb implements corq {
    public corp() {
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((Status) clc.d(parcel, Status.CREATOR), (SyncResult) clc.d(parcel, SyncResult.CREATOR));
            return true;
        }
        return false;
    }
}
