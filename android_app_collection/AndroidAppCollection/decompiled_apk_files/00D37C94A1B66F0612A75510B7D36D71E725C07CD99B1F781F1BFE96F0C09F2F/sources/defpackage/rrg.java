package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: rrg  reason: default package */
/* loaded from: classes4.dex */
public final class rrg extends qxb {
    public rrg(Context context, Looper looper, qwu qwuVar, qsv qsvVar, qsw qswVar) {
        super(context, looper, 158, qwuVar, qsvVar, qswVar);
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService");
        if (queryLocalInterface instanceof rrf) {
            return (rrf) queryLocalInterface;
        }
        return new rrf(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.mobiledataplan.internal.IMobileDataPlanService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.mobiledataplan.service.START";
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return rqu.c;
    }
}
