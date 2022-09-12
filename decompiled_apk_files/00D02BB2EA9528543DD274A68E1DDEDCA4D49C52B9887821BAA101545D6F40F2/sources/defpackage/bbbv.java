package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbbv  reason: default package */
/* loaded from: classes3.dex */
public class bbbv extends bban {
    static final int[] a = {bzqb.WEB_AND_APP_ACTIVITY.d, bzqb.LOCATION_HISTORY.d, bzqb.LOCATION_REPORTING.d};
    public final anhg b;
    public final cpv c;
    public boolean h;
    @dzsi
    public Runnable i;
    private final bzqa j;
    private final cjnx k;
    private final cjqy l;
    private final ania m;
    private final bbbq n;
    @dzsi
    private bayn o;
    @dzsi
    private bayn p;

    public bbbv(gga ggaVar, anhg anhgVar, bzqa bzqaVar, cjnx cjnxVar, cjqy cjqyVar, ania aniaVar, bbbq bbbqVar, cpv cpvVar) {
        super(ggaVar);
        this.o = null;
        this.p = null;
        this.b = anhgVar;
        this.j = bzqaVar;
        this.k = cjnxVar;
        this.l = cjqyVar;
        this.m = aniaVar;
        this.n = bbbqVar;
        this.c = cpvVar;
    }

    @Override // defpackage.bban, defpackage.bayl
    public List<bayj> QI() {
        return this.m.a() ? super.QI() : dcdc.e();
    }

    @Override // defpackage.bban, defpackage.bayl
    public Boolean d() {
        return Boolean.valueOf(this.h);
    }

    public final void e() {
        this.j.a(a, new baty(), "your_places_visited");
    }

    public void f(List<dwxj> list) {
        for (dwxj dwxjVar : list) {
            List<bayj> list2 = this.e;
            bbbq bbbqVar = this.n;
            gga a2 = bbbqVar.a.a();
            bbbq.a(a2, 1);
            bwqv a3 = bbbqVar.b.a();
            bbbq.a(a3, 2);
            ania a4 = bbbqVar.c.a();
            bbbq.a(a4, 3);
            bmdv a5 = bbbqVar.d.a();
            bbbq.a(a5, 4);
            angp a6 = bbbqVar.e.a();
            bbbq.a(a6, 5);
            anhg a7 = bbbqVar.f.a();
            bbbq.a(a7, 6);
            cjqy a8 = bbbqVar.g.a();
            bbbq.a(a8, 7);
            cjqq a9 = bbbqVar.h.a();
            bbbq.a(a9, 8);
            batz a10 = bbbqVar.i.a();
            bbbq.a(a10, 9);
            bbbq.a(dwxjVar, 10);
            bbbq.a(this, 11);
            list2.add(new bbbp(a2, a3, a4, a5, a6, a7, a8, a9, a10, dwxjVar, this));
        }
    }

    public void g(boolean z) {
        this.h = z;
    }

    @Override // defpackage.bban, defpackage.bayl
    public cqqw h() {
        return new bbbs(this);
    }

    @Override // defpackage.bban, defpackage.bayl
    public bayn i() {
        if (!this.k.m()) {
            if (this.p == null) {
                this.p = new bbbu(this, this.d.getString(R.string.VISITED_PLACES_TURN_LOCATION_HISTORY_BACK_ON_PROMPT), this.d.getString(R.string.TURN_ON), dtyd.cO, cqrt.g(2131232950, ibm.x()));
            }
            return this.p;
        }
        if (this.o == null) {
            gga ggaVar = this.d;
            this.o = new bbbt(this, ggaVar, this.l, ggaVar.getString(R.string.VISITED_PLACES_TIMELINE_LINK_FORMAT), this.d.getString(R.string.VISITED_PLACES_TIMELINE_LINK_TEXT), dtyi.bX);
        }
        return this.o;
    }

    public void j(Runnable runnable) {
        this.i = runnable;
    }

    @Override // defpackage.bayl
    public baye n() {
        return new bbbr(this, this.m.a(), this.k.m());
    }
}
