package defpackage;

import android.os.Parcel;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
/* compiled from: PG */
/* renamed from: cnzg  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnzg extends clb implements cnzh {
    public cnzg() {
        super("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                b((Status) clc.d(parcel, Status.CREATOR));
                break;
            case 2:
                DataHolder dataHolder = (DataHolder) clc.d(parcel, DataHolder.CREATOR);
                e((Status) clc.d(parcel, Status.CREATOR), (DataHolder) clc.d(parcel, DataHolder.CREATOR));
                break;
            case 3:
                c((Status) clc.d(parcel, Status.CREATOR), (WriteBatchImpl) clc.d(parcel, WriteBatchImpl.CREATOR));
                break;
            case 4:
            default:
                return false;
            case 5:
                Status status = (Status) clc.d(parcel, Status.CREATOR);
                DataHolder dataHolder2 = (DataHolder) clc.d(parcel, DataHolder.CREATOR);
                break;
            case 6:
                Status status2 = (Status) clc.d(parcel, Status.CREATOR);
                Snapshot snapshot = (Snapshot) clc.d(parcel, Snapshot.CREATOR);
                break;
            case 7:
                Status status3 = (Status) clc.d(parcel, Status.CREATOR);
                FenceStateMapImpl fenceStateMapImpl = (FenceStateMapImpl) clc.d(parcel, FenceStateMapImpl.CREATOR);
                break;
            case 8:
                Status status4 = (Status) clc.d(parcel, Status.CREATOR);
                FenceStateImpl fenceStateImpl = (FenceStateImpl) clc.d(parcel, FenceStateImpl.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
