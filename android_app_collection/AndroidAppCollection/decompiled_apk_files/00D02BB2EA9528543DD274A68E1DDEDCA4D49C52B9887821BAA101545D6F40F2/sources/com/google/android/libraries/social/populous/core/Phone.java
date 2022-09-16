package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Phone extends ContactMethodField implements Parcelable {
    private String a;

    public static cygh e() {
        return new cycc();
    }

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField
    public final cyep SA() {
        return cyep.PHONE;
    }

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField
    public abstract CharSequence a();

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyft
    public abstract PersonFieldMetadata b();

    @dzsi
    public abstract CharSequence d();

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyff
    public final String k() {
        if (this.a == null) {
            this.a = l(cyfj.PHONE_NUMBER, a().toString());
        }
        return this.a;
    }
}
