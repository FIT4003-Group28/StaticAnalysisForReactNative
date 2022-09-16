package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
/* compiled from: PG */
/* renamed from: cmde  reason: default package */
/* loaded from: classes5.dex */
public final class cmde implements Parcelable.Creator<SpliceNullCommand> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SpliceNullCommand createFromParcel(Parcel parcel) {
        return new SpliceNullCommand();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SpliceNullCommand[] newArray(int i) {
        return new SpliceNullCommand[i];
    }
}
