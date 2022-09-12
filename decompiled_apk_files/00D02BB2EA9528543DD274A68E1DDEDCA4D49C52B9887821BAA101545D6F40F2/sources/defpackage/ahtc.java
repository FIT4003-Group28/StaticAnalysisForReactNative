package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationServices;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahtc  reason: default package */
/* loaded from: classes2.dex */
public final class ahtc {
    public final GoogleApiClient a;
    public final FusedLocationProviderApi b;
    public final deig<GmmLocation> c = deig.d();
    private final ahtb d;

    public ahtc(Application application) {
        ahtb ahtbVar = new ahtb(this);
        this.d = ahtbVar;
        btsm c = btsm.c(application);
        c.g(LocationServices.API);
        c.h(ahtbVar);
        c.i(ahtbVar);
        this.a = c.e();
        this.b = LocationServices.FusedLocationApi;
    }
}
