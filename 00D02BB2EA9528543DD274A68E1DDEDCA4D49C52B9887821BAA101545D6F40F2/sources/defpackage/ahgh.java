package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahgh  reason: default package */
/* loaded from: classes2.dex */
public class ahgh extends ahhv {
    private final List<agxa<?>> a;
    private final List<agwu> b;
    private final agyq c;
    private final cjta d;
    private final List<jho> e;

    public ahgh(Activity activity, ahas ahasVar, ahht ahhtVar, final dxio<afzv> dxioVar, final dxio<axwy> dxioVar2, ahbd ahbdVar, ahfo ahfoVar, dlcv dlcvVar, int i, agyh agyhVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        final dlcq dlcqVar;
        int i2;
        if (dlcvVar.b == 14) {
            dlcqVar = (dlcq) dlcvVar.c;
        } else {
            dlcqVar = dlcq.d;
        }
        djrm djrmVar = dlcqVar.c;
        djrmVar = djrmVar == null ? djrm.v : djrmVar;
        ddzf bZ = ddzg.t.bZ();
        ddyt bZ2 = ddyu.i.bZ();
        boolean z = agyhVar.b;
        boolean z2 = false;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddyu ddyuVar = (ddyu) bZ2.b;
        int i3 = ddyuVar.a | 4;
        ddyuVar.a = i3;
        ddyuVar.c = z;
        dspd dspdVar = dlcvVar.d;
        dspdVar.getClass();
        int i4 = i3 | 512;
        ddyuVar.a = i4;
        ddyuVar.h = dspdVar;
        int i5 = i4 | 8;
        ddyuVar.a = i5;
        ddyuVar.d = i;
        int i6 = dlcqVar.a;
        ddyuVar.a = i5 | 16;
        ddyuVar.e = i6;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        ddyu bK = bZ2.bK();
        bK.getClass();
        ddzgVar.k = bK;
        ddzgVar.b |= 1;
        this.d = z(dlcqVar.b, i, bZ.bK(), agyhVar);
        if (dlcqVar.a == ddcu.JR.a) {
            i2 = ddcu.JS.a;
        } else {
            i2 = ddcu.Jm.a;
        }
        djrm djrmVar2 = dlcqVar.c;
        djrmVar2 = djrmVar2 == null ? djrm.v : djrmVar2;
        dccx F = dcdc.F();
        int i7 = 0;
        while (i7 < djrmVar2.e.size()) {
            ddzf bZ3 = ddzg.t.bZ();
            ddyt bZ4 = ddyu.i.bZ();
            boolean z3 = agyhVar.b;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = z2;
            }
            ddyu ddyuVar2 = (ddyu) bZ4.b;
            int i8 = ddyuVar2.a | 4;
            ddyuVar2.a = i8;
            ddyuVar2.c = z3;
            int i9 = i8 | 8;
            ddyuVar2.a = i9;
            ddyuVar2.d = i;
            int i10 = dlcqVar.a;
            ddyuVar2.a = i9 | 16;
            ddyuVar2.e = i10;
            dqbi dqbiVar = djrmVar2.e.get(i7).bg;
            float f = (dqbiVar == null ? dqbi.g : dqbiVar).b;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            ddyu ddyuVar3 = (ddyu) bZ4.b;
            ddyuVar3.a |= 64;
            ddyuVar3.f = f;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ddzg ddzgVar2 = (ddzg) bZ3.b;
            ddyu bK2 = bZ4.bK();
            bK2.getClass();
            ddzgVar2.k = bK2;
            ddzgVar2.b |= 1;
            ddzg bK3 = bZ3.bK();
            dlcw bZ5 = dlcx.e.bZ();
            dvyw dvywVar = djrmVar2.e.get(i7);
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dlcx dlcxVar = (dlcx) bZ5.b;
            dvywVar.getClass();
            dlcxVar.c = dvywVar;
            dlcxVar.a |= 2;
            ddxw bZ6 = ddxx.j.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            ddxx ddxxVar = (ddxx) bZ6.b;
            ddxxVar.a |= 8;
            ddxxVar.d = i2;
            String b = cjrx.b(bZ6.bK());
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dlcx dlcxVar2 = (dlcx) bZ5.b;
            b.getClass();
            dlcxVar2.a |= 1;
            dlcxVar2.b = b;
            F.g(ahfoVar.a(bZ5.bK(), i7, bK3, null, false));
            i7++;
            z2 = false;
        }
        dcdc<agwu> f2 = F.f();
        this.b = f2;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        cjta cjtaVar = this.d;
        djrm djrmVar3 = dlcqVar.c;
        djrmVar3 = djrmVar3 == null ? djrm.v : djrmVar3;
        arrayList.add(agxa.a(new agve(agvd.c().a()), new ahip(new ahiq(djrmVar3.b, djrmVar3.c, new cqkn(dxioVar2, dlcqVar) { // from class: ahgj
            private final dxio a;
            private final dlcq b;

            {
                this.a = dxioVar2;
                this.b = dlcqVar;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                dxio dxioVar3 = this.a;
                dlcq dlcqVar2 = this.b;
                ahae ahaeVar = (ahae) cqkpVar;
                axwy axwyVar = (axwy) dxioVar3.a();
                djrm djrmVar4 = dlcqVar2.c;
                if (djrmVar4 == null) {
                    djrmVar4 = djrm.v;
                }
                drco drcoVar = djrmVar4.m;
                if (drcoVar == null) {
                    drcoVar = drco.d;
                }
                axwyVar.E(drcoVar.c);
            }
        }, cjtaVar.b(dtxu.bz)))));
        cjta cjtaVar2 = this.d;
        agoa h = agob.h();
        h.e(true);
        h.c(true);
        agoc agocVar = new agoc(h.a());
        ArrayList arrayList2 = new ArrayList();
        for (agwu agwuVar : f2) {
            arrayList2.add(cqgr.fT(agocVar, agwuVar));
        }
        arrayList.add(agxa.a(new agdh(), new ahat(ahbdVar.a(arrayList2, cjtaVar2.b(dtxu.bE)).a())));
        djro djroVar = djrmVar.j;
        String str = (djroVar == null ? djro.c : djroVar).a;
        djro djroVar2 = djrmVar.j;
        this.c = ahasVar.a(str, null, new jic((djroVar2 == null ? djro.c : djroVar2).b, ckqc.FULLY_QUALIFIED, 2131232998), new ahaq(dxioVar2, dlcqVar) { // from class: ahgf
            private final dxio a;
            private final dlcq b;

            {
                this.a = dxioVar2;
                this.b = dlcqVar;
            }

            @Override // defpackage.ahaq
            public final void a() {
                dxio dxioVar3 = this.a;
                dlcq dlcqVar2 = this.b;
                axwy axwyVar = (axwy) dxioVar3.a();
                djrm djrmVar4 = dlcqVar2.c;
                if (djrmVar4 == null) {
                    djrmVar4 = djrm.v;
                }
                drco drcoVar = djrmVar4.m;
                if (drcoVar == null) {
                    drcoVar = drco.d;
                }
                axwyVar.E(drcoVar.c);
            }
        }, this.d.b(dtxu.bz), djrmVar.b, null, this);
        dlam dlamVar = dlcvVar.g;
        if ((dlamVar == null ? dlam.d : dlamVar).a != 4) {
            this.e = dcdc.e();
            return;
        }
        jhm jhmVar = new jhm();
        jhmVar.a = activity.getString(R.string.LOCALSTREAM_MANAGE_TRIPS_SUGGESTIONS);
        jhmVar.d(new View.OnClickListener(dxioVar) { // from class: ahgg
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((afzv) this.a.a()).k();
            }
        });
        this.e = dcdc.f(jhmVar.c());
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.a;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.d.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<agyq> c() {
        return cqgr.fT(new agdv(), this.c);
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.b;
    }

    @Override // defpackage.ahhv
    protected final List<jho> r() {
        return this.e;
    }
}
