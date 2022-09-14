package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class InAppNotificationTarget extends ContactMethodField implements Parcelable, cyff {
    private String a;

    public static cyfi n() {
        cyca cycaVar = new cyca();
        cycaVar.g(cyep.IN_APP_NOTIFICATION_TARGET);
        return cycaVar;
    }

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField
    public abstract CharSequence a();

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyft
    public abstract PersonFieldMetadata b();

    public abstract dcdc<ContactMethodField> d();

    @dzsi
    public abstract String e();

    public abstract cyfi f();

    @dzsi
    public abstract int g();

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyff
    public final String k() {
        if (this.a == null) {
            cyep SA = SA();
            int g = g();
            String charSequence = a().toString();
            int i = -1;
            if (g != 0) {
                i = (-1) + g;
            }
            String valueOf = String.valueOf(SA);
            StringBuilder sb = new StringBuilder(String.valueOf(charSequence).length() + 13 + String.valueOf(valueOf).length());
            sb.append(charSequence);
            sb.append(",");
            sb.append(i);
            sb.append(",");
            sb.append(valueOf);
            this.a = sb.toString();
        }
        return this.a;
    }

    public final cyfi m() {
        cyfi f = f();
        cygd l = PersonFieldMetadata.l();
        l.k(b());
        f.e(l.i());
        return f;
    }
}
