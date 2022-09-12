package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cmsy  reason: default package */
/* loaded from: classes5.dex */
public final class cmsy extends cla implements IInterface {
    public cmsy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void e(cmsx cmsxVar) {
        Parcel a = a();
        clc.f(a, cmsxVar);
        Sk(3, a);
    }
}
