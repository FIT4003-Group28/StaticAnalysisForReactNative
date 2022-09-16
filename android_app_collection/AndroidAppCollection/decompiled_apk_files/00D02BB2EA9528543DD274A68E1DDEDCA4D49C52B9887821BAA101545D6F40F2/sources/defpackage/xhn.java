package defpackage;

import android.content.ActivityNotFoundException;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: xhn  reason: default package */
/* loaded from: classes7.dex */
public class xhn implements xgt {
    public final xhq a;
    private final gga b;
    private final dxio<afha> c;
    private final xgx d;
    private List<xgv> e;
    private dice f;

    public xhn(gga ggaVar, xhq xhqVar, dxio<afha> dxioVar, btvo btvoVar, ckcw ckcwVar, dice diceVar) {
        this.b = ggaVar;
        this.a = xhqVar;
        this.f = diceVar;
        this.c = dxioVar;
        this.e = f(diceVar);
        this.d = new xgx(ckcwVar);
    }

    private final List<xgv> f(dice diceVar) {
        return dcbg.b(diceVar.k).s(new dbrn(this) { // from class: xhm
            private final xhn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                diif diifVar = (diif) obj;
                xhq xhqVar = this.a.a;
                gga a = xhqVar.a.a();
                xhq.a(a, 1);
                dxio a2 = ((dxjh) xhqVar.b).a();
                xhq.a(a2, 2);
                xhq.a(diifVar, 3);
                return new xhp(a, a2, diifVar);
            }
        }).z();
    }

    @Override // defpackage.xgt
    public String a() {
        return this.b.getResources().getString(R.string.TRANSIT_PAYMENTS_PASSES_DISAMBIGUATION_TICKET_SUBTITLE);
    }

    @Override // defpackage.xgt
    public String b() {
        return this.b.getResources().getString(R.string.TRANSIT_PAYMENTS_PASSES_BUY_ANOTHER_TICKET_LINK);
    }

    @Override // defpackage.xgt
    public cqkl c() {
        xgx xgxVar = this.d;
        dice diceVar = this.f;
        String str = diceVar.c;
        int i = diceVar.l;
        try {
            this.c.a().f(this.b, xgxVar.a(str), 4);
        } catch (ActivityNotFoundException unused) {
        }
        return cqkl.a;
    }

    @Override // defpackage.xgt
    public List<xgv> d() {
        return this.e;
    }

    public void e(dice diceVar) {
        this.f = diceVar;
        this.e = f(diceVar);
    }
}
