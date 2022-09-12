package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SessionContextRuleSet implements Parcelable {
    public final int b;
    public final int c;
    public static final SessionContextRuleSet a = new SessionContextRuleSet(0, 0);
    public static final Parcelable.Creator<SessionContextRuleSet> CREATOR = new cygs();

    public SessionContextRuleSet(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SessionContextRuleSet) {
            SessionContextRuleSet sessionContextRuleSet = (SessionContextRuleSet) obj;
            if (this.b == sessionContextRuleSet.b && this.c == sessionContextRuleSet.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
