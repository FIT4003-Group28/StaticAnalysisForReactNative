package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelEventParcelable> CREATOR = new cphr();
    final ChannelImpl a;
    final int b;
    final int c;
    final int d;

    public ChannelEventParcelable(ChannelImpl channelImpl, int i, int i2, int i3) {
        this.a = channelImpl;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.c;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(num).length() + String.valueOf(num2).length());
        sb.append("ChannelEventParcelable[, channel=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(num);
        sb.append(", closeReason=");
        sb.append(num2);
        sb.append(", appErrorCode=");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.g(parcel, 3, this.b);
        cnwn.g(parcel, 4, this.c);
        cnwn.g(parcel, 5, this.d);
        cnwn.c(parcel, d);
    }

    public final void a(cpgg cpggVar) {
        int i = this.b;
        if (i == 1) {
            cpggVar.c(this.a);
        } else if (i == 2) {
            cpggVar.d(this.a);
        } else if (i == 3) {
            cpggVar.e(this.a);
        } else if (i == 4) {
            cpggVar.f(this.a);
        } else {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unknown type: ");
            sb.append(i);
            sb.toString();
        }
    }
}
