package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
/* compiled from: PG */
/* renamed from: cpiw  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpiw extends clb implements cpix {
    public cpiw() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        cpis cpisVar;
        if (i == 13) {
            MessageEventParcelable messageEventParcelable = (MessageEventParcelable) clc.d(parcel, MessageEventParcelable.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                cpisVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                if (queryLocalInterface instanceof cpis) {
                    cpisVar = (cpis) queryLocalInterface;
                } else {
                    cpisVar = new cpis(readStrongBinder);
                }
            }
            f(messageEventParcelable, cpisVar);
            return true;
        }
        switch (i) {
            case 1:
                b((DataHolder) clc.d(parcel, DataHolder.CREATOR));
                return true;
            case 2:
                c((MessageEventParcelable) clc.d(parcel, MessageEventParcelable.CREATOR));
                return true;
            case 3:
                NodeParcelable nodeParcelable = (NodeParcelable) clc.d(parcel, NodeParcelable.CREATOR);
                j();
                return true;
            case 4:
                NodeParcelable nodeParcelable2 = (NodeParcelable) clc.d(parcel, NodeParcelable.CREATOR);
                k();
                return true;
            case 5:
                d(parcel.createTypedArrayList(NodeParcelable.CREATOR));
                return true;
            case 6:
                AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) clc.d(parcel, AncsNotificationParcelable.CREATOR);
                i();
                return true;
            case 7:
                e((ChannelEventParcelable) clc.d(parcel, ChannelEventParcelable.CREATOR));
                return true;
            case 8:
                CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) clc.d(parcel, CapabilityInfoParcelable.CREATOR);
                g();
                return true;
            case 9:
                AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) clc.d(parcel, AmsEntityUpdateParcelable.CREATOR);
                h();
                return true;
            default:
                return false;
        }
    }
}
