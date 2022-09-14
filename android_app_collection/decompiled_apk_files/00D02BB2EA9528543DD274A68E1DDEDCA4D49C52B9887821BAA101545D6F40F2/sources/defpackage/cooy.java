package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.maps.model.LatLngBounds;
/* compiled from: PG */
/* renamed from: cooy  reason: default package */
/* loaded from: classes5.dex */
public final class cooy extends coon<copa> {
    final /* synthetic */ LatLngBounds a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cooy(Api api, GoogleApiClient googleApiClient, LatLngBounds latLngBounds) {
        super(api, googleApiClient);
        this.a = latLngBounds;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cnnq cnnqVar) {
        copa copaVar = (copa) cnnqVar;
        coop coopVar = new coop(this);
        ((copd) copaVar.L()).f(this.a, new PlaceFilter(null, false, null, null), copaVar.a, coopVar);
    }
}
