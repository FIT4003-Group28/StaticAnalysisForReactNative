package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ProfileId extends ContactMethodField implements Parcelable {
    private String a;

    public static cygk d() {
        return new cyce();
    }

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField
    public final cyep SA() {
        return cyep.PROFILE_ID;
    }

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField
    public abstract CharSequence a();

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyft
    public abstract PersonFieldMetadata b();

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyff
    public final String k() {
        if (this.a == null) {
            this.a = l(cyfj.PROFILE_ID, a().toString());
        }
        return this.a;
    }
}
