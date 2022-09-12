package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
/* compiled from: PG */
/* renamed from: cmsw  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmsw extends clb implements cmsx {
    public cmsw() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ProxyResponse proxyResponse = (ProxyResponse) clc.d(parcel, ProxyResponse.CREATOR);
            c();
        } else if (i != 2) {
            return false;
        } else {
            b(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
