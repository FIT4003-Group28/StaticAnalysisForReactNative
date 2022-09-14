package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cohx  reason: default package */
/* loaded from: classes5.dex */
public final class cohx extends cla implements IInterface {
    public cohx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.secagg.IPRFAbortFlag");
    }

    public final boolean e() {
        Parcel Si = Si(2, a());
        boolean a = clc.a(Si);
        Si.recycle();
        return a;
    }
}
