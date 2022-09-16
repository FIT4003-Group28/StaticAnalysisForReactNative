package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: rts  reason: default package */
/* loaded from: classes4.dex */
public final class rts extends qxb {
    public rts(Context context, Looper looper, qwu qwuVar, qub qubVar, qvh qvhVar) {
        super(context, looper, 285, qwuVar, qubVar, qvhVar);
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.potokens.internal.IPoTokensService");
        if (queryLocalInterface instanceof rto) {
            return (rto) queryLocalInterface;
        }
        return new rto(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.potokens.internal.IPoTokensService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.potokens.service.START";
    }

    @Override // defpackage.qwr
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return rtm.b;
    }
}
