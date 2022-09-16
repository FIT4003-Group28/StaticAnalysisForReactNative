package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cmyk  reason: default package */
/* loaded from: classes5.dex */
public final class cmyk extends cmwz {
    static final cnoa<cmwb> b;
    private static final cnnp<cmwb, cnag> d;
    private static final Api<cnag> e;
    public final ddid c;
    private final GoogleApiClient f;

    static {
        cnoa<cmwb> cnoaVar = new cnoa<>();
        b = cnoaVar;
        cmyh cmyhVar = new cmyh();
        d = cmyhVar;
        e = new Api<>("Car.API", cmyhVar, cnoaVar);
    }

    public cmyk(Context context, cmze cmzeVar, final cmzh cmzhVar, cmvr cmvrVar, Looper looper, int i, int i2, ddid ddidVar) {
        super(i2);
        this.c = ddidVar;
        cmyj cmyjVar = new cmyj(cmzeVar);
        GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = new GoogleApiClient.OnConnectionFailedListener(cmzhVar) { // from class: cmyg
            private final cmzh a;

            {
                this.a = cmzhVar;
            }

            @Override // defpackage.cnsi
            public final void Pi(ConnectionResult connectionResult) {
                cmzh cmzhVar2 = this.a;
                cmzf c = cmzg.c();
                cmvo cmvoVar = (cmvo) c;
                cmvoVar.b = 2;
                cmvoVar.a = connectionResult;
                c.b();
                cmzhVar2.a();
            }
        };
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(context);
        builder.addApi(e, new cnag(new cnaf(cmvrVar, i)));
        builder.setHandler(new cojb(looper));
        builder.addConnectionCallbacks(cmyjVar);
        builder.addOnConnectionFailedListener(onConnectionFailedListener);
        GoogleApiClient build = builder.build();
        dbsk.s(build);
        this.f = build;
        build.registerConnectionCallbacks(new cmyi(this, context));
    }

    @Override // defpackage.cmwc
    public final cnab a() {
        return ((cmwb) this.f.getClient(b)).a;
    }

    @Override // defpackage.cmwc
    public final boolean b() {
        return this.f.isConnected();
    }

    @Override // defpackage.cmwz
    public final void c() {
        this.f.connect();
    }

    @Override // defpackage.cmwz
    public final void d() {
        this.f.disconnect();
    }
}
