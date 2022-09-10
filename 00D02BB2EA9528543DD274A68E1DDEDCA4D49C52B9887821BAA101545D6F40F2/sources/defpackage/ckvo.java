package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.gmm.wearable.R;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
/* compiled from: PG */
/* renamed from: ckvo  reason: default package */
/* loaded from: classes4.dex */
public final class ckvo {
    public final Context a;
    @dzsi
    public GoogleApiClient b;
    public int c = 1;
    @dzsi
    public ckvg d;
    private final colo e;

    public ckvo(Context context, colo coloVar) {
        dbsk.s(context);
        this.a = context;
        dbsk.s(coloVar);
        this.e = coloVar;
    }

    public final void a() {
        this.c = 5;
        GoogleApiClient googleApiClient = this.b;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
            this.b = null;
        }
        this.d = null;
    }

    public final void b(boolean z) {
        if (this.c != 3) {
            return;
        }
        if (z) {
            this.c = 2;
            d();
            return;
        }
        e();
    }

    public final void c() {
        if (this.c != 4) {
            return;
        }
        e();
    }

    public final void d() {
        this.b.connect();
        colg colgVar = new colg();
        LocationRequest create = LocationRequest.create();
        create.setPriority(100);
        colgVar.b(create);
        colgVar.a = true;
        this.e.a(this.b, colgVar.a()).i(new ckvn(this));
    }

    public final void e() {
        this.c = 5;
        this.b.disconnect();
        this.b = null;
        ckvg ckvgVar = this.d;
        if (ckvk.l(ckvgVar.a)) {
            ckvgVar.a.k();
        } else {
            Toast.makeText(ckvgVar.a, R.string.TOAST_NEED_HIGH_ACCURACY_LOCATION, 1).show();
            ckvgVar.a.finish();
        }
        this.d = null;
    }
}
