package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: swg  reason: default package */
/* loaded from: classes7.dex */
public class swg implements swb, swn {
    public final tmh a;
    private final dcdc<zdw> b;
    private final sxa c;
    @dzsi
    private final suo d;
    private final tlv e;

    public swg(tmi tmiVar, final swp swpVar, suq suqVar, sxa sxaVar, tlv tlvVar, amve amveVar) {
        tmh a = tmiVar.a(tlvVar, dbsg.i(amveVar));
        this.a = a;
        this.c = sxaVar;
        this.e = tlvVar;
        amuk b = a.b().b();
        dbsk.s(b);
        this.b = dcdc.q(dcbg.b(a.a(b)).s(new dbrn(this, swpVar) { // from class: swe
            private final swg a;
            private final swp b;

            {
                this.a = this;
                this.b = swpVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                swg swgVar = this.a;
                swp swpVar2 = this.b;
                wuv wuvVar = (wuv) obj;
                tmh tmhVar = swgVar.a;
                Activity activity = (Activity) ((dxjd) swpVar2.a).a;
                swp.a(activity, 1);
                byae a2 = swpVar2.b.a();
                swp.a(a2, 2);
                swp.a(swgVar, 3);
                swp.a(tmhVar, 4);
                swp.a(wuvVar, 5);
                return new swo(activity, a2, swgVar, tmhVar, wuvVar);
            }
        }));
        this.d = tlvVar.d().j().a() ? suqVar.a(true) : null;
    }

    @Override // defpackage.swb
    public dcdc<cqix<?>> a() {
        return dcdc.q(dcbg.b(this.b).s(swf.a));
    }

    @Override // defpackage.swb
    @dzsi
    public suo b() {
        return this.d;
    }

    @Override // defpackage.swn
    public void c(wuv wuvVar) {
        sxa sxaVar = this.c;
        amve amveVar = this.e.g().get(Integer.valueOf(wuvVar.s()));
        dbsk.s(amveVar);
        sxaVar.f(amveVar);
    }

    @Override // defpackage.swn
    public void d(wuv wuvVar, View view) {
        c(wuvVar);
        for (View view2 : cqkx.n(this)) {
            RecyclerView recyclerView = (RecyclerView) cqkx.e(view2, jkn.n, zvp.class);
            if (recyclerView != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int measuredWidth = view.getMeasuredWidth();
                int measuredWidth2 = recyclerView.getMeasuredWidth();
                int i = iArr[0];
                if (i < 0) {
                    recyclerView.t(i, 0);
                } else {
                    int i2 = i + measuredWidth;
                    if (i2 > measuredWidth2) {
                        recyclerView.t(-(measuredWidth2 - i2), 0);
                    }
                }
            }
        }
    }
}
