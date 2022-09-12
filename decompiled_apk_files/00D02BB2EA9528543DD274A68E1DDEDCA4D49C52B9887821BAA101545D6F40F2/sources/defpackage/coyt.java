package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: coyt  reason: default package */
/* loaded from: classes5.dex */
public final class coyt extends cla implements IInterface {
    public coyt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
    }

    public final void e(coys coysVar) {
        Parcel a = a();
        clc.f(a, coysVar);
        Sj(1, a);
    }
}
