package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource;
/* compiled from: PG */
/* renamed from: cygt  reason: default package */
/* loaded from: classes5.dex */
public final class cygt implements Parcelable.Creator<SocialAffinityAllEventSource> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SocialAffinityAllEventSource createFromParcel(Parcel parcel) {
        return new SocialAffinityAllEventSource(eawb.b(parcel.readInt()), eawb.b(parcel.readInt()), eawb.b(parcel.readInt()), eawb.b(parcel.readInt()), eawb.b(parcel.readInt()), eawb.b(parcel.readInt()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SocialAffinityAllEventSource[] newArray(int i) {
        return new SocialAffinityAllEventSource[i];
    }
}
