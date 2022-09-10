package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: bzpv  reason: default package */
/* loaded from: classes4.dex */
public final class bzpv {
    public static final /* synthetic */ int f = 0;
    private static final int g = 8;
    private static final int h = dsnt.WEB_AND_APP.l;
    @dzsi
    public GoogleApiClient a;
    public final bzpq b;
    public final Activity c;
    public final awnm d;
    public final axwy e;
    private final dxio<akfa> i;
    private final cjxd j;
    private final dxio<btvo> k;
    private final dxio<bzpz> l;

    public bzpv(@dzsi bzpu bzpuVar, @dzsi awnl awnlVar, Activity activity, dxio<akfa> dxioVar, cjxd cjxdVar, awnm awnmVar, axwy axwyVar, dxio<btvo> dxioVar2, dxio<bzpz> dxioVar3) {
        this.i = dxioVar;
        this.c = activity;
        this.j = cjxdVar;
        this.d = awnmVar;
        this.e = axwyVar;
        this.k = dxioVar2;
        this.l = dxioVar3;
        if (awnlVar != null) {
            this.b = new bzpq(this, awnlVar);
            return;
        }
        dbsk.s(bzpuVar);
        this.b = new bzpq(this, bzpuVar);
    }

    public static void c(Activity activity) {
        Toast.makeText(activity, (int) R.string.WAA_ENABLE_UNAVAILABLE, 1).show();
    }

    public final void a(String str) {
        GoogleApiClient googleApiClient = null;
        if (dbsj.d(str) || !this.k.a().getEnableFeatureParameters().by) {
            if (this.j.b()) {
                String o = this.i.a().o();
                btsm b = btsm.b(this.c);
                if (b != null) {
                    b.g(cpdo.c);
                    b.j(o);
                    googleApiClient = b.e();
                }
            }
            this.a = googleApiClient;
            if (googleApiClient == null) {
                b(this.b.b);
                return;
            }
            googleApiClient.registerConnectionFailedListener(new bzpp(this));
            this.a.connect();
            cnoa<cpes> cnoaVar = cpdo.a;
            GoogleApiClient googleApiClient2 = this.a;
            int[] iArr = {h};
            int i = g;
            cpdb cpdbVar = new cpdb();
            cpdbVar.b(iArr);
            cpdbVar.a = i;
            cpdbVar.b = str;
            cpeq.a(googleApiClient2, cpdbVar.a()).i(this.b);
            return;
        }
        bzpz a = this.l.a();
        bzpq bzpqVar = this.b;
        if (bzpqVar.a == null) {
            a.b = bzpqVar.b;
            a.e = null;
            a.a(str);
            return;
        }
        a.b = new bzps(bzpqVar);
        a.e = new bzpo(this);
        a.a(str);
    }

    public final void b(@dzsi awnl awnlVar) {
        if (awnlVar != null) {
            awnlVar.b(this.c, 0, null);
        }
    }
}
