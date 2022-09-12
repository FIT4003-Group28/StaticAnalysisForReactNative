package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cowh  reason: default package */
/* loaded from: classes.dex */
public final class cowh extends cnuw<covy> {
    private static volatile Bundle v;
    private static volatile Bundle w;
    public final String a;
    public final String t;
    public final HashMap<coun, cowc> u;

    public cowh(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, cnum cnumVar) {
        super(context.getApplicationContext(), looper, 5, cnumVar, connectionCallbacks, onConnectionFailedListener);
        this.u = new HashMap<>();
        this.a = str;
        this.t = cnumVar.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Status R(int i, Bundle bundle) {
        return new Status(i, null, bundle == null ? null : (PendingIntent) bundle.getParcelable("pendingIntent"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final void J(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            if (bundle != null) {
                Q(bundle.getBundle("post_init_configuration"));
            }
            i = 0;
        }
        super.J(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    public final synchronized void Q(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        cowj.a = bundle.getBoolean("use_contactables_api", true);
        coxh.a.a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        v = bundle.getBundle("config.email_type_map");
        w = bundle.getBundle("config.phone_type_map");
    }

    public final void S(cowc cowcVar) {
        super.K();
        synchronized (this.u) {
            T().e(cowcVar, true, 1);
        }
    }

    @Override // defpackage.cnui
    public final Feature[] Sm() {
        return couh.l;
    }

    @Override // defpackage.cnui
    public final boolean So() {
        return true;
    }

    public final covy T() {
        return (covy) super.L();
    }

    public final void U(cnph<couj> cnphVar, int i) {
        super.K();
        cowd cowdVar = new cowd(cnphVar);
        try {
            T().h(cowdVar, i);
        } catch (RemoteException unused) {
            cowdVar.b(8, null, null);
        }
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.people.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.people.internal.IPeopleService";
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        return queryLocalInterface instanceof covy ? (covy) queryLocalInterface : new covy(iBinder);
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.t);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final void o() {
        synchronized (this.u) {
            if (r()) {
                for (cowc cowcVar : this.u.values()) {
                    cowcVar.a.b();
                    try {
                        T().e(cowcVar, false, 0);
                    } catch (RemoteException | IllegalStateException unused) {
                    }
                }
            }
            this.u.clear();
        }
        super.o();
    }
}
