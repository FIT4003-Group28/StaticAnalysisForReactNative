package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: rgj  reason: default package */
/* loaded from: classes4.dex */
public class rgj extends qxb {
    protected final rgi a;
    private final String b;

    public rgj(Context context, Looper looper, qsv qsvVar, qsw qswVar, qwu qwuVar) {
        super(context, looper, 23, qwuVar, qsvVar, qswVar);
        this.a = new rgi(this);
        this.b = "locationServices";
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 11717000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof rgn) {
            return (rgn) queryLocalInterface;
        }
        return new rgn(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return rfo.f;
    }

    @Override // defpackage.qwr
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.b);
        return bundle;
    }
}
