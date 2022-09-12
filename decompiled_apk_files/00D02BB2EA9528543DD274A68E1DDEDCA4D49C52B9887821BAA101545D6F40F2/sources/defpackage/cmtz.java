package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cmtz  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmtz extends clb implements cmua {
    public cmtz() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b();
        } else if (i != 2) {
            return false;
        } else {
            c();
        }
        return true;
    }
}
