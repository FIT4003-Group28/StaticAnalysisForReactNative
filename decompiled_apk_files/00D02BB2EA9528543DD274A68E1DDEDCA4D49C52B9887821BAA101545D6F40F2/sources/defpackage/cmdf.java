package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
/* compiled from: PG */
/* renamed from: cmdf  reason: default package */
/* loaded from: classes5.dex */
public final class cmdf implements Parcelable.Creator<SpliceScheduleCommand> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SpliceScheduleCommand createFromParcel(Parcel parcel) {
        return new SpliceScheduleCommand(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SpliceScheduleCommand[] newArray(int i) {
        return new SpliceScheduleCommand[i];
    }
}
