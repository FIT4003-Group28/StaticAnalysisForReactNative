package defpackage;

import com.google.android.apps.gmm.mapsactivity.locationhistory.events.webview.EventWebViewCallbacks;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoff  reason: default package */
/* loaded from: classes2.dex */
public class aoff implements aofc {
    private final dprk a;
    private final akqi b;
    private final aofk c;

    public aoff(dprk dprkVar, akqi akqiVar, aofk aofkVar) {
        this.a = dprkVar;
        this.b = akqiVar;
        this.c = aofkVar;
    }

    @Override // defpackage.aofc
    public CharSequence b() {
        return this.a.c;
    }

    @Override // defpackage.aofc
    public cjtd c() {
        return cjtd.a(dtyc.ak);
    }

    @Override // defpackage.aofc
    public cqkl d() {
        aofk aofkVar = this.c;
        dprk dprkVar = this.a;
        akqi akqiVar = this.b;
        bvxn a = aofkVar.a();
        dmkt bZ = dmku.e.bZ();
        dspd dspdVar = dprkVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dspdVar.getClass();
        ((dmku) bZ.b).b = dspdVar;
        String o = akqiVar.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        o.getClass();
        ((dmku) bZ.b).c = o;
        boolean z = !aofkVar.c.m(bvjk.dR, false);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dmku) bZ.b).d = z;
        int d = (int) aofkVar.e.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dmku) bZ.b).a = d;
        dmku bK = bZ.bK();
        duyj duyjVar = aofkVar.d.getMapsActivitiesParameters().g;
        if (duyjVar == null) {
            duyjVar = duyj.c;
        }
        debv a2 = debv.a(duyjVar.a);
        a2.d("data", aofk.a.i(bK.bS()));
        String debvVar = a2.toString();
        if (a.c) {
            a.bF();
            a.c = false;
        }
        bvxu bvxuVar = (bvxu) a.b;
        bvxu bvxuVar2 = bvxu.A;
        debvVar.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = debvVar;
        bvxuVar.a = i | 64;
        bvxuVar.h = "aGMM.Timeline.Events";
        aofkVar.b.a().k(a.bK(), new EventWebViewCallbacks(), dtxv.N);
        return cqkl.a;
    }

    @Override // defpackage.aofc
    public cqtd a() {
        int i = this.a.a;
        int i2 = i != 0 ? i != 3 ? 0 : 1 : 2;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                return cqrt.g(2131232354, ibm.x());
            }
            if (i3 == 1) {
                return cqrt.g(2131231615, ibm.x());
            }
            return cqrt.g(2131231615, ibm.x());
        }
        throw null;
    }
}
