package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
@KeepForSdk
@SafeParcelable.Class(creator = "StatusCreator")
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    @SafeParcelable.VersionField(id = NetstatsParserPatterns.NEW_TS_TO_MILLIS)
    private final int zzal;
    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private final int zzam;
    @SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    private final PendingIntent zzan;
    @SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    private final String zzao;
    @VisibleForTesting
    @KeepForSdk
    public static final Status RESULT_SUCCESS = new Status(0);
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = new Status(14);
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = new Status(15);
    @KeepForSdk
    public static final Status RESULT_CANCELED = new Status(16);
    private static final Status zzdq = new Status(17);
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new zze();

    @KeepForSdk
    public Status(int i) {
        this(i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    @KeepForSdk
    public Status(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
        this.zzal = i;
        this.zzam = i2;
        this.zzao = str;
        this.zzan = pendingIntent;
    }

    @KeepForSdk
    public Status(int i, String str) {
        this(1, i, str, null);
    }

    @KeepForSdk
    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.zzal == status.zzal && this.zzam == status.zzam && Objects.equal(this.zzao, status.zzao) && Objects.equal(this.zzan, status.zzan);
    }

    public final PendingIntent getResolution() {
        return this.zzan;
    }

    @Override // com.google.android.gms.common.api.Result
    @KeepForSdk
    public final Status getStatus() {
        return this;
    }

    public final int getStatusCode() {
        return this.zzam;
    }

    public final String getStatusMessage() {
        return this.zzao;
    }

    @VisibleForTesting
    public final boolean hasResolution() {
        return this.zzan != null;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzal), Integer.valueOf(this.zzam), this.zzao, this.zzan);
    }

    public final boolean isCanceled() {
        return this.zzam == 16;
    }

    public final boolean isInterrupted() {
        return this.zzam == 14;
    }

    public final boolean isSuccess() {
        return this.zzam <= 0;
    }

    public final void startResolutionForResult(Activity activity, int i) {
        if (!hasResolution()) {
            return;
        }
        activity.startIntentSenderForResult(this.zzan.getIntentSender(), i, null, 0, 0, 0);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("statusCode", zzp()).add("resolution", this.zzan).toString();
    }

    @Override // android.os.Parcelable
    @KeepForSdk
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzan, i, false);
        SafeParcelWriter.writeInt(parcel, NetstatsParserPatterns.NEW_TS_TO_MILLIS, this.zzal);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzp() {
        return this.zzao != null ? this.zzao : CommonStatusCodes.getStatusCodeString(this.zzam);
    }
}
