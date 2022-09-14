package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
/* compiled from: PG */
/* renamed from: cnyz  reason: default package */
/* loaded from: classes5.dex */
public final class cnyz extends cnuw<cnzi> {
    public static final clcp a = clcp.a;
    public final ContextManagerClientInfo t;
    private final Looper u;
    private clcr<cnyf, cnyt> v;

    public cnyz(Context context, Looper looper, cnum cnumVar, cmuz cmuzVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 47, cnumVar, connectionCallbacks, onConnectionFailedListener);
        PackageInfo packageInfo;
        Bundle bundle;
        this.u = looper;
        Account account = cnumVar.a;
        String str = account == null ? "@@ContextManagerNullAccount@@" : account.name;
        Account account2 = cmuzVar.c;
        String str2 = account2 != null ? account2.name : str;
        String packageName = context.getPackageName();
        int myUid = Process.myUid();
        String str3 = cmuzVar.a;
        try {
            packageInfo = cnyb.b(context).b(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        int i = (packageInfo == null || packageInfo.applicationInfo == null || (bundle = packageInfo.applicationInfo.metaData) == null) ? -1 : bundle.getInt("com.google.android.gms.version", -1);
        int i2 = cmuzVar.b;
        this.t = new ContextManagerClientInfo(str2, packageName, myUid, str3, i, 1, null, null, -1, Process.myPid(), cmuzVar.d);
    }

    @Override // defpackage.cnui
    public final boolean M() {
        return false;
    }

    public final clcr<cnyf, cnyt> Q() {
        if (this.v == null) {
            this.v = new clcr<>(this.u, cnyt.d);
        }
        return this.v;
    }

    @Override // defpackage.cnui
    public final boolean So() {
        return true;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.contextmanager.service.ContextManagerService.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.contextmanager.internal.IContextManagerService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
        return queryLocalInterface instanceof cnzi ? (cnzi) queryLocalInterface : new cnzi(iBinder);
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.google.android.contextmanager.service.args", cnwo.a(this.t));
        return bundle;
    }
}
