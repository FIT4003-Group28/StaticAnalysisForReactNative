package defpackage;

import android.widget.Toast;
import com.google.android.apps.gmm.place.updates.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnah  reason: default package */
/* loaded from: classes3.dex */
public final class bnah implements btzi<dinq, dins> {
    final /* synthetic */ bnai a;

    public bnah(bnai bnaiVar) {
        this.a = bnaiVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dinq> btzrVar, btzy btzyVar) {
        bvrj.UI_THREAD.c();
        this.a.f = null;
        bnha bnhaVar = this.a.h;
        bnhaVar.a.j = true;
        bnhb bnhbVar = bnhaVar.a;
        bnhbVar.g = true;
        Toast.makeText(bnhbVar.a, R.string.VISITOR_UPDATES_SCROLL_FETCH_FAILURE, 1).show();
        cqkx.p(bnhaVar.a);
        bnhaVar.a.d.a();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dinq> btzrVar, dins dinsVar) {
        dins dinsVar2 = dinsVar;
        bvrj.UI_THREAD.c();
        bnai bnaiVar = this.a;
        bnaiVar.d = false;
        bnaiVar.e = dinsVar2.c;
        bnaiVar.f = null;
        dcdc<dmbc> z = dcbg.b(dinsVar2.b).s(bnag.a).z();
        bnha bnhaVar = this.a.h;
        bnhaVar.a.j = true;
        bnhb bnhbVar = bnhaVar.a;
        for (dmbc dmbcVar : z) {
            dmbu dmbuVar = dmbcVar.c;
            if (dmbuVar == null) {
                dmbuVar = dmbu.i;
            }
            dmbe dmbeVar = dmbuVar.e;
            if (dmbeVar == null) {
                dmbeVar = dmbe.c;
            }
            dhze dhzeVar = dmbeVar.b;
            if (dhzeVar == null) {
                dhzeVar = dhze.m;
            }
            String str = dhzeVar.f;
            dmbg dmbgVar = dmbcVar.d;
            if (dmbgVar == null) {
                dmbgVar = dmbg.i;
            }
            dmcc dmccVar = dmbgVar.c;
            if (dmccVar == null) {
                dmccVar = dmcc.i;
            }
            String str2 = dmccVar.b;
            List<bneq> list = bnhbVar.f;
            bngs bngsVar = bnhbVar.c;
            bwrs<ilo> bwrsVar = bnhbVar.e;
            cdsa cdsaVar = new cdsa(dmbcVar);
            bwqv a = bngsVar.a.a();
            bngs.a(a, 1);
            cqhn a2 = bngsVar.b.a();
            bngs.a(a2, 2);
            bnfu a3 = bngsVar.c.a();
            bngs.a(a3, 3);
            cebm a4 = bngsVar.d.a();
            bngs.a(a4, 4);
            bngl a5 = bngsVar.e.a();
            bngs.a(a5, 5);
            bnfr a6 = bngsVar.f.a();
            bngs.a(a6, 6);
            bhuh a7 = bngsVar.g.a();
            bngs.a(a7, 7);
            dxio a8 = ((dxjh) bngsVar.h).a();
            bngs.a(a8, 8);
            bngs.a(bwrsVar, 9);
            bngs.a(cdsaVar, 10);
            list.add(new bngr(a, a2, a3, a4, a5, a6, a7, a8, bwrsVar, cdsaVar));
        }
        cqkx.p(bnhaVar.a);
        bnhaVar.a.d.a();
    }
}
