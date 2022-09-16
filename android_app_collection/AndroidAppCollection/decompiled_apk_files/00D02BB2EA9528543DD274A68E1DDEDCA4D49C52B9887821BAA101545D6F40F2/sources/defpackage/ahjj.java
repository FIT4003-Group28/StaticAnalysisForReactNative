package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahjj  reason: default package */
/* loaded from: classes2.dex */
public class ahjj extends ahhv {
    private final ahar a;
    private final cjta b;
    private final List<agxa<?>> c;
    private final List<agwu> d;
    private final List<jho> e;

    public ahjj(Activity activity, ahas ahasVar, ahbd ahbdVar, ahht ahhtVar, final dxio<afzv> dxioVar, ahfo ahfoVar, ahjn ahjnVar, dlcv dlcvVar, int i, agyh agyhVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        dldx dldxVar;
        dlal dlalVar;
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        if (dlcvVar.b == 21) {
            dldxVar = (dldx) dlcvVar.c;
        } else {
            dldxVar = dldx.g;
        }
        dldx dldxVar2 = dldxVar;
        Object[] objArr = new Object[1];
        dlam dlamVar = dlcvVar.g;
        dlamVar = dlamVar == null ? dlam.d : dlamVar;
        if (dlamVar.a == 4) {
            dlalVar = (dlal) dlamVar.b;
        } else {
            dlalVar = dlal.b;
        }
        objArr[0] = dlalVar.a;
        this.a = ahasVar.a(activity.getString(R.string.LOCALSTREAM_TRIP_CARD_TRIP_NAME_LABEL, objArr), null, new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.localstream_trip_icon_svg), 0), null, cjtd.b, dldxVar2.b, null, this);
        ddzf bZ = ddzg.t.bZ();
        ddyt bZ2 = ddyu.i.bZ();
        boolean z2 = agyhVar.b;
        if (bZ2.c) {
            bZ2.bF();
            z = false;
            bZ2.c = false;
        } else {
            z = false;
        }
        ddyu ddyuVar = (ddyu) bZ2.b;
        int i2 = ddyuVar.a | 4;
        ddyuVar.a = i2;
        ddyuVar.c = z2;
        dspd dspdVar = dlcvVar.d;
        dspdVar.getClass();
        int i3 = i2 | 512;
        ddyuVar.a = i3;
        ddyuVar.h = dspdVar;
        ddyuVar.a = i3 | 8;
        ddyuVar.d = i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = z;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        ddyu bK = bZ2.bK();
        bK.getClass();
        ddzgVar.k = bK;
        ddzgVar.b |= 1;
        ddzg bK2 = bZ.bK();
        this.b = z(dldxVar2.a, i, bK2, agyhVar);
        Resources resources = activity.getResources();
        int size = dldxVar2.c.size();
        Object[] objArr2 = new Object[1];
        Integer valueOf = Integer.valueOf(dldxVar2.c.size());
        char c = z ? 1 : 0;
        char c2 = z ? 1 : 0;
        objArr2[c] = valueOf;
        arrayList.add(agxa.a(new agve(agvd.c().a()), new ahip(new ahiq(dldxVar2.b, resources.getQuantityString(R.plurals.LIST_COUNT_PLACES, size, objArr2), null, cjtd.b))));
        agvp agvpVar = new agvp();
        Activity activity2 = (Activity) ((dxjd) ahjnVar.a).a;
        ahjn.a(activity2, 1);
        dxio a = ((dxjh) ahjnVar.b).a();
        ahjn.a(a, 2);
        ahjn.a(dldxVar2, 3);
        arrayList.add(agxa.a(agvpVar, new ahjm(activity2, a, dldxVar2)));
        ArrayList arrayList2 = new ArrayList();
        agoa h = agob.h();
        h.e(true);
        h.c(true);
        agoc agocVar = new agoc(h.a());
        for (int i4 = 0; i4 < dldxVar2.c.size(); i4++) {
            ahfn a2 = ahfoVar.a(dldxVar2.c.get(i4), i4, bK2, null, true);
            this.d.add(a2);
            arrayList2.add(cqgr.fT(agocVar, a2));
        }
        this.c.add(agxa.a(new agdh(), new ahat(ahbdVar.a(arrayList2, this.b.b(dtxu.bE)).a())));
        dlam dlamVar2 = dlcvVar.g;
        if ((dlamVar2 == null ? dlam.d : dlamVar2).a != 4) {
            this.e = dcdc.e();
            return;
        }
        jhm jhmVar = new jhm();
        jhmVar.a = activity.getString(R.string.LOCALSTREAM_MANAGE_TRIPS_SUGGESTIONS);
        jhmVar.d(new View.OnClickListener(dxioVar) { // from class: ahji
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
        return this.c;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.b.b(ddhoVar);
    }

    @Override // defpackage.agxe
    @dzsi
    public cqix<agyq> c() {
        return cqgr.fT(new agdv(), this.a);
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.d;
    }

    @Override // defpackage.ahhv
    protected final List<jho> r() {
        return this.e;
    }
}
