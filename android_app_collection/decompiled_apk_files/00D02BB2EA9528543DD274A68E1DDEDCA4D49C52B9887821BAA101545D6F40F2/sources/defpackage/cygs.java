package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.SessionContextRuleSet;
/* compiled from: PG */
/* renamed from: cygs  reason: default package */
/* loaded from: classes5.dex */
public final class cygs implements Parcelable.Creator<SessionContextRuleSet> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SessionContextRuleSet createFromParcel(Parcel parcel) {
        return new SessionContextRuleSet(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SessionContextRuleSet[] newArray(int i) {
        return new SessionContextRuleSet[i];
    }
}
