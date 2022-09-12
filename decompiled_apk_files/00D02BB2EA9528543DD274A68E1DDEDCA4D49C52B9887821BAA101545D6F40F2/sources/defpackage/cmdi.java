package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
/* compiled from: PG */
/* renamed from: cmdi  reason: default package */
/* loaded from: classes5.dex */
public final class cmdi implements Parcelable.Creator<TimeSignalCommand> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TimeSignalCommand createFromParcel(Parcel parcel) {
        return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TimeSignalCommand[] newArray(int i) {
        return new TimeSignalCommand[i];
    }
}
