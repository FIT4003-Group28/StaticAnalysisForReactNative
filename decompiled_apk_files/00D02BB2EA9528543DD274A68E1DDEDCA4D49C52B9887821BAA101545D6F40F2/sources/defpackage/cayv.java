package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cayv  reason: default package */
/* loaded from: classes4.dex */
public class cayv implements cbqk, cbqh {
    public final ff a;
    private final ges b;
    private final cays c;
    private final dcdc<cbqj> d;

    public cayv(ges gesVar, List<drlr> list, List<dupx> list2, @dzsi dprz dprzVar) {
        cayw caywVar = new cayw(false);
        this.b = gesVar;
        ff J = gesVar.J();
        dbsk.s(J);
        this.a = J;
        cays caysVar = new cays(list);
        this.c = caysVar;
        dccx F = dcdc.F();
        for (drlr drlrVar : caysVar.a.values()) {
            dprz b = dprz.b(drlrVar.a);
            F.g(caywVar.a(drlrVar, (b == null ? dprz.EXPERIENCE_CATEGORY_UNKNOWN : b) == dprzVar, this));
        }
        F.f();
        dccx F2 = dcdc.F();
        for (dupx dupxVar : list2) {
            F2.g(new cayr(dupxVar, dprzVar, caywVar, this));
        }
        this.d = F2.f();
    }

    @Override // defpackage.cbqh
    public void a(cbqi cbqiVar) {
        this.b.Nw(cbqiVar.j());
        this.a.g().f();
    }

    @Override // defpackage.cbqh
    public void b() {
    }

    @Override // defpackage.cbqk
    public jib c() {
        jhz jhzVar = new jhz();
        jhzVar.a = this.a.getString(R.string.UGC_EVENTS_CATEGORY_LEAF_PAGE_TITLE);
        jhzVar.f(new View.OnClickListener(this) { // from class: cayu
            private final cayv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.onBackPressed();
            }
        });
        jhzVar.q = ibm.b();
        jhzVar.i = cqrt.g(2131231588, ibm.t());
        jhzVar.u = ibm.t();
        return jhzVar.b();
    }

    @Override // defpackage.cbqk
    public dcdc<cbqj> d() {
        return this.d;
    }
}
