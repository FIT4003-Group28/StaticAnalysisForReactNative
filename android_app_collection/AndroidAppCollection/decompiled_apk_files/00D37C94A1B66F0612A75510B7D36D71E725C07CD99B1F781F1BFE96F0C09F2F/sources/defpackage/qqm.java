package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: qqm  reason: default package */
/* loaded from: classes4.dex */
public final class qqm extends qxb {
    public qqm(Context context, Looper looper, qwu qwuVar, qsv qsvVar, qsw qswVar) {
        super(context, looper, 40, qwuVar, qsvVar, qswVar);
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (queryLocalInterface instanceof qqo) {
            return (qqo) queryLocalInterface;
        }
        return new qqo(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return qqi.b;
    }
}
