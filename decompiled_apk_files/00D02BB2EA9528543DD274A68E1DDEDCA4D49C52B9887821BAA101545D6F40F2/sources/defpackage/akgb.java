package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
/* compiled from: PG */
/* renamed from: akgb  reason: default package */
/* loaded from: classes2.dex */
public final class akgb implements Parcelable.Creator<MajorEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MajorEvent createFromParcel(Parcel parcel) {
        byte[] createByteArray;
        aknq aknqVar = null;
        if (parcel.dataAvail() != 0 && (createByteArray = parcel.createByteArray()) != null) {
            try {
                aknqVar = (aknq) dsqw.cq(aknq.d, createByteArray);
            } catch (dsrm unused) {
            }
        }
        if (aknqVar == null) {
            aknqVar = aknq.d;
        }
        aknt b = aknt.b(aknqVar.b);
        if (b == null) {
            b = aknt.UNKNOWN_DETAIL_LEVEL;
        }
        diwb diwbVar = aknqVar.c;
        if (diwbVar == null) {
            diwbVar = diwb.U;
        }
        if ((diwbVar.a & 1) != 0 && b == aknt.UNKNOWN_DETAIL_LEVEL) {
            b = aknt.MINIMAL;
        }
        diwb diwbVar2 = aknqVar.c;
        if (diwbVar2 == null) {
            diwbVar2 = diwb.U;
        }
        return new MajorEvent(b, diwbVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MajorEvent[] newArray(int i) {
        return new MajorEvent[i];
    }
}
