package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.account.AccountId;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountActionResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alwc(3);
    public final AccountId a;
    public final ambp b;
    public final ValidationResult c;
    public final Intent d;

    public AccountActionResult(Parcel parcel) {
        this.a = (AccountId) parcel.readParcelable(AccountId.class.getClassLoader());
        try {
            this.b = (ambp) aphq.g(parcel, ambp.a, aoos.b());
            this.c = (ValidationResult) parcel.readParcelable(ValidationResult.class.getClassLoader());
            this.d = (Intent) parcel.readParcelable(ValidationResult.class.getClassLoader());
        } catch (aopx e) {
            throw new IllegalStateException("Failed to convert AccountInfo to Parcelable!", e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        aphq.l(parcel, this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
    }

    public AccountActionResult(AccountId accountId, ambp ambpVar, ValidationResult validationResult, Intent intent) {
        this.a = accountId;
        ambpVar.getClass();
        this.b = ambpVar;
        this.c = validationResult;
        this.d = intent;
    }
}
