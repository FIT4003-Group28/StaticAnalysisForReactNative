package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: qzd  reason: default package */
/* loaded from: classes4.dex */
public final class qzd extends qxb {
    public qzd(Context context, Looper looper, qub qubVar, qvh qvhVar) {
        super(context, looper, 25, qwu.a(context), qubVar, qvhVar);
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        if (queryLocalInterface instanceof qzl) {
            return (qzl) queryLocalInterface;
        }
        return new qzl(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.droidguard.service.START";
    }
}
