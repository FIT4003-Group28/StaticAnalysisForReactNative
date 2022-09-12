package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.audit.LogAuditRecordsRequest;
/* compiled from: PG */
/* renamed from: cmqv  reason: default package */
/* loaded from: classes5.dex */
public final class cmqv extends cla implements IInterface {
    public cmqv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audit.internal.IAuditService");
    }

    public final void e(LogAuditRecordsRequest logAuditRecordsRequest, cnrt cnrtVar) {
        Parcel a = a();
        clc.e(a, logAuditRecordsRequest);
        clc.f(a, cnrtVar);
        Sk(1, a);
    }
}
