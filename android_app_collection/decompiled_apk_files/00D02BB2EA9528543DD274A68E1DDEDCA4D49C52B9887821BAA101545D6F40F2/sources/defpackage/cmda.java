package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
/* compiled from: PG */
/* renamed from: cmda  reason: default package */
/* loaded from: classes5.dex */
public final class cmda implements Parcelable.Creator<PrivateCommand> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PrivateCommand createFromParcel(Parcel parcel) {
        return new PrivateCommand(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PrivateCommand[] newArray(int i) {
        return new PrivateCommand[i];
    }
}
