package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Channel;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ChannelImpl extends AbstractSafeParcelable implements Channel, Parcelable {
    public static final Parcelable.Creator<ChannelImpl> CREATOR = new cphs();
    public final String a;
    public final String b;
    public final String c;

    public ChannelImpl(String str, String str2, String str3) {
        cnwc.a(str);
        this.a = str;
        cnwc.a(str2);
        this.b = str2;
        cnwc.a(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.a.equals(channelImpl.a) && cnvv.a(channelImpl.b, this.b) && cnvv.a(channelImpl.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        int i = 0;
        for (char c : this.a.toCharArray()) {
            i += c;
        }
        String trim = this.a.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 16 + String.valueOf(substring2).length());
            sb.append(substring);
            sb.append("...");
            sb.append(substring2);
            sb.append("::");
            sb.append(i);
            trim = sb.toString();
        }
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(trim).length() + 31 + str.length() + str2.length());
        sb2.append("Channel{token=");
        sb2.append(trim);
        sb2.append(", nodeId=");
        sb2.append(str);
        sb2.append(", path=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.c(parcel, d);
    }
}
