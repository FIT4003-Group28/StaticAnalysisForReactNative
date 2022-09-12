package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
/* compiled from: PG */
/* renamed from: cmcc  reason: default package */
/* loaded from: classes5.dex */
public final class cmcc implements Parcelable.Creator<EventMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ EventMessage createFromParcel(Parcel parcel) {
        return new EventMessage(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ EventMessage[] newArray(int i) {
        return new EventMessage[i];
    }
}
