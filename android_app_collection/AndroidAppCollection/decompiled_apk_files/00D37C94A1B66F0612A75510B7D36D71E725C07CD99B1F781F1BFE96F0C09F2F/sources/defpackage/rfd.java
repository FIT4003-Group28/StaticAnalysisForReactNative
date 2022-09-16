package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: rfd  reason: default package */
/* loaded from: classes4.dex */
public final class rfd extends qxb {
    public rfd(Context context, Looper looper, qsv qsvVar, qsw qswVar) {
        super(context, looper, 121, qwu.a(context), qsvVar, qswVar);
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 12200000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsService");
        if (queryLocalInterface instanceof rfc) {
            return (rfc) queryLocalInterface;
        }
        return new rfc(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.instantapps.internal.IInstantAppsService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.instantapps.START";
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return new Feature[]{rez.a, rez.b, rez.c, rez.d};
    }
}
