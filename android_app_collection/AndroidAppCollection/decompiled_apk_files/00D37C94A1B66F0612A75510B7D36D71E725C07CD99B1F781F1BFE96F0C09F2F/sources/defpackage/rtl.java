package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: rtl  reason: default package */
/* loaded from: classes4.dex */
public final class rtl extends qxb {
    public rtl(Context context, Looper looper, qwu qwuVar, qsv qsvVar, qsw qswVar) {
        super(context, looper, 51, qwuVar, qsvVar, qswVar);
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 9410000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        if (queryLocalInterface instanceof rtk) {
            return (rtk) queryLocalInterface;
        }
        return new rtk(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return rtb.e;
    }
}
