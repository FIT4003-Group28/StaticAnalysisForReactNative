package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: corw  reason: default package */
/* loaded from: classes5.dex */
public final class corw extends cnuw<corr> {
    public corw(Context context, Looper looper, cnum cnumVar, cnpv cnpvVar, cnsi cnsiVar) {
        super(context, looper, 215, cnumVar, cnpvVar, cnsiVar);
    }

    @Override // defpackage.cnui
    public final boolean M() {
        return true;
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return corj.c;
    }

    @Override // defpackage.cnui
    protected final boolean Sn() {
        return true;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.mdisync.service.START";
    }

    @Override // defpackage.cnui
    protected final String b() {
        return "com.google.android.gms.mdisync.internal.IMdiSyncService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 19621000;
    }

    @Override // defpackage.cnui
    protected final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
        return queryLocalInterface instanceof corr ? (corr) queryLocalInterface : new corr(iBinder);
    }
}
