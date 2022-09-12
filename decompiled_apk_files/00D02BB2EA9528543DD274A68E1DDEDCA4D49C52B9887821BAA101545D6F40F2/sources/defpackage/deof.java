package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.MutateRequest;
/* compiled from: PG */
/* renamed from: deof  reason: default package */
/* loaded from: classes6.dex */
public final class deof extends cla implements deoh {
    public deof(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    @Override // defpackage.deoh
    public final CallStatus e(cnrt cnrtVar, MutateRequest mutateRequest) {
        Parcel a = a();
        clc.f(a, cnrtVar);
        clc.e(a, mutateRequest);
        Parcel Si = Si(8, a);
        CallStatus callStatus = (CallStatus) clc.d(Si, CallStatus.CREATOR);
        Si.recycle();
        return callStatus;
    }
}
