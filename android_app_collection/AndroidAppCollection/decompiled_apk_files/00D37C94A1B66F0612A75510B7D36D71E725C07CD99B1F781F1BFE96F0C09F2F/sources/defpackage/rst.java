package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: rst  reason: default package */
/* loaded from: classes4.dex */
public final class rst extends qxb {
    private static volatile Bundle c;
    private static volatile Bundle d;
    public final String a;
    public final String b;
    private final HashMap e;

    public rst(Context context, Looper looper, qsv qsvVar, qsw qswVar, String str, qwu qwuVar) {
        super(context.getApplicationContext(), looper, 5, qwuVar, qsvVar, qswVar);
        this.e = new HashMap();
        this.a = str;
        this.b = qwuVar.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Status n(int i, Bundle bundle) {
        return new Status(i, (String) null, bundle == null ? null : (PendingIntent) bundle.getParcelable("pendingIntent"));
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        if (queryLocalInterface instanceof rsm) {
            return (rsm) queryLocalInterface;
        }
        return new rsm(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.people.service.START";
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return rrz.n;
    }

    @Override // defpackage.qwr
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.b);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    public final synchronized void k(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        rsu.a = bundle.getBoolean("use_contactables_api", true);
        rta.a.b(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        c = bundle.getBundle("config.email_type_map");
        d = bundle.getBundle("config.phone_type_map");
    }

    @Override // defpackage.qwr, defpackage.qsn
    public final void l() {
        synchronized (this.e) {
            if (w()) {
                for (rso rsoVar : this.e.values()) {
                    rsoVar.a.a();
                    try {
                        try {
                            p().a(rsoVar, false, 0);
                        } catch (RemoteException e) {
                            rug.b("Failed to unregister listener", e);
                        }
                    } catch (IllegalStateException e2) {
                        rug.b("PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.e.clear();
        }
        super.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final void m(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            if (bundle != null) {
                k(bundle.getBundle("post_init_configuration"));
            }
            i = 0;
        }
        super.m(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    public final void o(qtu qtuVar, int i) {
        super.H();
        rsp rspVar = new rsp(qtuVar);
        try {
            rsm p = p();
            Parcel pv = p.pv();
            dve.i(pv, rspVar);
            dve.e(pv, false);
            dve.e(pv, false);
            pv.writeString(null);
            pv.writeString(null);
            pv.writeInt(i);
            p.px(305, pv);
        } catch (RemoteException unused) {
            rspVar.a(8, null, null);
        }
    }

    public final rsm p() {
        return (rsm) super.D();
    }
}
