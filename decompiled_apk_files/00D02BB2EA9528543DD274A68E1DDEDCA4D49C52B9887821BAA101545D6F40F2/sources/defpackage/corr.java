package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
/* compiled from: PG */
/* renamed from: corr  reason: default package */
/* loaded from: classes5.dex */
public final class corr extends cla implements IInterface {
    public corr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdisync.internal.IMdiSyncService");
    }

    public final void e(corq corqVar, SyncRequest syncRequest, CallerInfo callerInfo) {
        Parcel a = a();
        clc.f(a, corqVar);
        clc.e(a, syncRequest);
        clc.e(a, callerInfo);
        Sk(1, a);
    }
}
