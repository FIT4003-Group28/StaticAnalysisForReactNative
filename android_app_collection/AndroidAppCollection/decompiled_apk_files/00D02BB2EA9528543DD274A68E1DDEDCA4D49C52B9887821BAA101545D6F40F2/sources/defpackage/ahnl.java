package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahnl  reason: default package */
/* loaded from: classes2.dex */
public final class ahnl implements ahkb {
    private final List<GmmLocation> a;
    private final List<GmmLocation> b;
    private final List<GmmLocation> c;
    private final List<GmmLocation> d;
    private final dzot<ahnj> e;
    private final btvo f;

    static {
        TimeUnit.MINUTES.toMillis(5L);
    }

    public ahnl(btvo btvoVar, ckcw ckcwVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.d = arrayList4;
        this.e = new dzot<>();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        this.f = btvoVar;
        new ahnk(ckcwVar);
        new ahpx();
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
        arrayList4.clear();
        for (ahnj ahnjVar : ahnj.values()) {
            this.e.a(ahnjVar, false);
        }
    }

    @Override // defpackage.ahkb
    @dzsi
    public final GmmLocation a(@dzsi GmmLocation gmmLocation) {
        bvrj.LOCATION_DISPATCHER.c();
        boolean z = this.f.getLocationParameters().e;
        return gmmLocation;
    }
}
