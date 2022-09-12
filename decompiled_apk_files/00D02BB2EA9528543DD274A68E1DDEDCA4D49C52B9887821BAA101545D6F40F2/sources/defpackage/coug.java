package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: coug  reason: default package */
/* loaded from: classes5.dex */
public final class coug extends cnuw<coue> {
    public coug(Context context, Looper looper, cnum cnumVar, cnpv cnpvVar, cnsi cnsiVar) {
        super(context, looper, 198, cnumVar, cnpvVar, cnsiVar);
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return new Feature[]{coua.a, coua.b, coua.E, coua.d, coua.e, coua.f, coua.g, coua.h, coua.i, coua.k, coua.j, coua.l, coua.m, coua.o, coua.n, coua.c, coua.p, coua.q, coua.r, coua.s, coua.t, coua.v, coua.u, coua.w, coua.x, coua.y, coua.z, coua.A, coua.B, coua.C, coua.D};
    }

    @Override // defpackage.cnui
    protected final boolean Sn() {
        return true;
    }

    @Override // defpackage.cnui
    public final boolean So() {
        return true;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.pay.service.BIND";
    }

    @Override // defpackage.cnui
    protected final String b() {
        return "com.google.android.gms.pay.internal.IPayService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 17895000;
    }

    @Override // defpackage.cnui
    protected final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pay.internal.IPayService");
        return queryLocalInterface instanceof coue ? (coue) queryLocalInterface : new coue(iBinder);
    }
}
