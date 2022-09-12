package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
/* compiled from: PG */
/* renamed from: cmdc  reason: default package */
/* loaded from: classes5.dex */
public final class cmdc implements Parcelable.Creator<SpliceInsertCommand> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SpliceInsertCommand createFromParcel(Parcel parcel) {
        return new SpliceInsertCommand(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SpliceInsertCommand[] newArray(int i) {
        return new SpliceInsertCommand[i];
    }
}
