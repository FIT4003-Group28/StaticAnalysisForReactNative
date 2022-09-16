package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: qpk  reason: default package */
/* loaded from: classes4.dex */
public final class qpk extends qxb {
    private final CastDevice a;
    private final Bundle b;
    private final String c;

    static {
        new qpu("CastClientImplCxless");
    }

    public qpk(Context context, Looper looper, qwu qwuVar, CastDevice castDevice, Bundle bundle, String str, qsv qsvVar, qsw qswVar) {
        super(context, looper, 10, qwuVar, qsvVar, qswVar);
        this.a = castDevice;
        this.b = bundle;
        this.c = str;
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 19390000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof qpp) {
            return (qpp) queryLocalInterface;
        }
        return new qpp(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return qjm.m;
    }

    @Override // defpackage.qwr
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        this.a.c(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        bundle.putString("connectionless_client_record_id", this.c);
        Bundle bundle2 = this.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // defpackage.qwr, defpackage.qsn
    public final void l() {
        try {
            ((qpp) D()).a();
        } catch (RemoteException | IllegalStateException unused) {
        } finally {
            super.l();
        }
    }
}
