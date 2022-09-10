package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: cpjw  reason: default package */
/* loaded from: classes5.dex */
public final class cpjw extends cnuw<cpiy> {
    private final cpja A;
    private final cpjz B;
    public final cpja<cpgo> a;
    private final cpja t;
    private final cpja u;
    private final cpja<cpgg> v;
    private final cpja w;
    private final cpja x;
    private final cpja y;
    private final cpja z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpjw(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, cnum cnumVar) {
        super(context, looper, 14, cnumVar, connectionCallbacks, onConnectionFailedListener);
        coiz coizVar = coja.a;
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        cpjz a = cpjz.a(context);
        this.t = new cpja();
        this.u = new cpja();
        this.v = new cpja<>();
        this.w = new cpja();
        this.x = new cpja();
        this.y = new cpja();
        this.z = new cpja();
        this.a = new cpja<>();
        this.A = new cpja();
        cnwc.a(unconfigurableExecutorService);
        this.B = a;
    }

    @Override // defpackage.cnui
    protected final String B() {
        return this.B.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final void J(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            this.t.a(iBinder);
            this.u.a(iBinder);
            this.v.a(iBinder);
            this.w.a(iBinder);
            this.x.a(iBinder);
            this.y.a(iBinder);
            this.z.a(iBinder);
            this.a.a(iBinder);
            this.A.a(iBinder);
            i = 0;
        }
        super.J(i, iBinder, bundle, i2);
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 8600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof cpiy ? (cpiy) queryLocalInterface : new cpiy(iBinder);
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final void n(cnuc cnucVar) {
        if (!t()) {
            try {
                Bundle bundle = this.c.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    StringBuilder sb = new StringBuilder(82);
                    sb.append("The Wear OS app is out of date. Requires API version 8600000 but found ");
                    sb.append(i);
                    sb.toString();
                    Context context = this.c;
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    G(cnucVar, 6, PendingIntent.getActivity(context, 0, intent, 0));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                G(cnucVar, 16, null);
                return;
            }
        }
        super.n(cnucVar);
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final boolean t() {
        return !this.B.b();
    }
}
