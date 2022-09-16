package com.google.android.gms.droidguard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DroidGuardResultsRequest extends AbstractSafeParcelable {
    public Bundle a;
    private static final int b = (int) TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator<DroidGuardResultsRequest> CREATOR = new cnzs();

    public DroidGuardResultsRequest() {
        String str;
        this.a = new Bundle();
        this.a.putInt("clientVersion", cnmq.b);
        try {
            str = System.getProperty("os.arch");
        } catch (Exception unused) {
            str = "?";
        }
        this.a.putString("appArchitecture", str);
    }

    public final int a() {
        return this.a.getInt("timeoutMs", b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.m(parcel, 2, this.a);
        cnwn.c(parcel, d);
    }

    public DroidGuardResultsRequest(Bundle bundle) {
        new Bundle();
        this.a = bundle;
    }
}
