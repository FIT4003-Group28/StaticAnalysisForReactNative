package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
/* compiled from: PG */
/* renamed from: cnlf  reason: default package */
/* loaded from: classes.dex */
public final class cnlf extends cla implements IInterface {
    public cnlf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void e(cnle cnleVar, LogEventParcelable logEventParcelable) {
        Parcel a = a();
        clc.f(a, cnleVar);
        clc.e(a, logEventParcelable);
        Sj(1, a);
    }
}
