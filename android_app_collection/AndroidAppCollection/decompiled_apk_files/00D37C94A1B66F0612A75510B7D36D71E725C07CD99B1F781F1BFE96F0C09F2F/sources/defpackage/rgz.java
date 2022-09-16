package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: rgz  reason: default package */
/* loaded from: classes4.dex */
public final class rgz extends qxb {
    public rgz(Context context, Looper looper, qwu qwuVar, qub qubVar, qvh qvhVar) {
        super(context, looper, 215, qwuVar, qubVar, qvhVar);
    }

    @Override // defpackage.qwr
    public final boolean L() {
        return true;
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 19621000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
        if (queryLocalInterface instanceof rgv) {
            return (rgv) queryLocalInterface;
        }
        return new rgv(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.mdisync.internal.IMdiSyncService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.mdisync.service.START";
    }

    @Override // defpackage.qwr
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return rgs.c;
    }
}
