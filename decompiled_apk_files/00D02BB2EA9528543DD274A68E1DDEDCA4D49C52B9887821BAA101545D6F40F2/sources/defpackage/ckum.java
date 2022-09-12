package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ckum  reason: default package */
/* loaded from: classes4.dex */
public final class ckum {
    @dzsi
    public final GoogleApiClient a;
    public String c;
    public LatLngBounds d;
    public long e;
    private final ckuu g;
    public final Object b = new Object();
    public final GoogleApiClient.ConnectionCallbacks f = new ckul(this);

    public ckum(@dzsi GoogleApiClient googleApiClient, ckuu ckuuVar) {
        this.a = googleApiClient;
        dbsk.s(ckuuVar);
        this.g = ckuuVar;
    }

    public final void a(String str, long j, @dzsi ArrayList<ckwb> arrayList) {
        ckyd bZ = ckyf.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ckyf ckyfVar = (ckyf) bZ.b;
        ckyfVar.a |= 1;
        ckyfVar.b = j;
        if (arrayList == null) {
            ckyf ckyfVar2 = (ckyf) bZ.b;
            ckyfVar2.c = 2;
            ckyfVar2.a = 2 | ckyfVar2.a;
        } else {
            ckyf ckyfVar3 = (ckyf) bZ.b;
            ckyfVar3.c = 1;
            ckyfVar3.a = 2 | ckyfVar3.a;
            ckyf ckyfVar4 = (ckyf) bZ.b;
            dsrj<ckwb> dsrjVar = ckyfVar4.d;
            if (!dsrjVar.a()) {
                ckyfVar4.d = dsqw.cl(dsrjVar);
            }
            dsod.bv(arrayList, ckyfVar4.d);
        }
        ckuw.a(this.g, str, "/place_list_response", bZ.bK().bS());
    }
}
