package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahec  reason: default package */
/* loaded from: classes2.dex */
public class ahec extends ahhv {
    private final agaw a;
    private final cqix<? extends agxd> b;
    private final List<agwu> c;
    private final List<agxa<?>> d;
    @dzsi
    private final agwu e;
    private final cjta f;

    public ahec(ahas ahasVar, ahht ahhtVar, agaw agawVar, dlcv dlcvVar, agyh agyhVar, List<agxa<?>> list, List<agwu> list2, ahea aheaVar, cjta cjtaVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        this.a = agawVar;
        this.c = list2;
        this.d = list;
        this.e = aheaVar.f;
        this.f = cjtaVar;
        this.b = cqgr.fT(new agdv(), ahasVar.a(aheaVar.a, null, aheaVar.b, aheaVar.c, aheaVar.d, aheaVar.e, null, this));
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.d;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.f.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<? extends agxd> c() {
        return this.b;
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.c;
    }

    @Override // defpackage.ahhv, defpackage.agxe
    public int h(View view) {
        int i;
        int[] iArr = new int[2];
        int i2 = Integer.MAX_VALUE;
        agwu agwuVar = null;
        int i3 = Integer.MAX_VALUE;
        for (View view2 : agxk.k(view, agoc.class)) {
            cqkp i4 = cqkx.i(view2);
            if (i4 instanceof agwu) {
                view2.getLocationOnScreen(iArr);
                int i5 = iArr[0];
                if (i5 >= 0 && ((i = iArr[1]) < i2 || (i == i2 && i5 < i3))) {
                    i3 = i5;
                    agwuVar = (agwu) i4;
                    i2 = i;
                }
            }
        }
        return Math.max(0, this.c.indexOf(agwuVar));
    }

    @Override // defpackage.ahhv, defpackage.agxe
    public void i(View view, int i) {
        jnq jnqVar;
        if (this.c.size() <= 1 || (jnqVar = (jnq) view.findViewById(R.id.item_view_pager)) == null) {
            return;
        }
        jnqVar.setCurrentItem(i);
    }

    @Override // defpackage.ahhv
    public final agyh n() {
        agxv bZ = agxw.c.bZ();
        for (agxa<?> agxaVar : this.d) {
            V v = agxaVar.b;
            if (v instanceof ahdf) {
                int b = ((ahdf) v).b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                agxw agxwVar = (agxw) bZ.b;
                agxwVar.a |= 4;
                agxwVar.b = b;
            }
        }
        agxs agxsVar = this.m;
        if (agxsVar.c) {
            agxsVar.bF();
            agxsVar.c = false;
        }
        agyh agyhVar = (agyh) agxsVar.b;
        agxw bK = bZ.bK();
        agyh agyhVar2 = agyh.k;
        bK.getClass();
        agyhVar.e = bK;
        agyhVar.a |= 8;
        return super.n();
    }

    @Override // defpackage.ahhv
    @dzsi
    public agwu o() {
        return this.e;
    }

    @Override // defpackage.ahhv
    public void p() {
        for (agxa<?> agxaVar : this.d) {
            V v = agxaVar.b;
            if (v instanceof ahdf) {
                ((ahdf) v).c();
            }
        }
    }

    @Override // defpackage.ahhv
    public void q() {
        super.q();
        for (agxa<?> agxaVar : this.d) {
            V v = agxaVar.b;
            if (v instanceof ahdf) {
                ((ahdf) v).h();
            }
        }
    }
}
