package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cnlc  reason: default package */
/* loaded from: classes.dex */
public final class cnlc extends cla implements IInterface {
    public cnlc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IBootCountService");
    }

    public final void e(cnlb cnlbVar) {
        Parcel a = a();
        clc.f(a, cnlbVar);
        Sj(1, a);
    }
}
