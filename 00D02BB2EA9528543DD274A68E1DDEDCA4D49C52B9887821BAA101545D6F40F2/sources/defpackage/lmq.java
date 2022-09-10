package defpackage;

import android.text.Spanned;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: lmq  reason: default package */
/* loaded from: classes7.dex */
public final class lmq implements lmn {
    private static final dcqe a = dcqe.c("lmq");
    private final zcr b;
    private final lmm c;
    private final dbty<dcdc<ldm>> e;
    private final cqkj f;
    private final myg g;
    private boolean h;
    private final mzm d = new mzm(mzl.b(null));
    private dcdc<mzk> i = dcdc.e();

    public lmq(zcr zcrVar, dbty<dcdc<ldm>> dbtyVar, lmm lmmVar, cqkj cqkjVar, cqhn cqhnVar, myg mygVar, btvo btvoVar) {
        this.b = zcrVar;
        this.e = dbtyVar;
        dbsk.s(cqkjVar);
        this.f = cqkjVar;
        this.c = lmmVar;
        this.g = mygVar;
        dbsk.s(btvoVar);
        this.h = dbtyVar.a().size() + 1 < 10 ? false : true;
        f();
    }

    @Override // defpackage.lmn
    public cqkl a() {
        if (!this.h) {
            this.c.c();
        }
        return cqkl.a;
    }

    @Override // defpackage.lmn
    public Boolean b() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.lmn
    public cqkl c() {
        this.c.a();
        return cqkl.a;
    }

    @Override // defpackage.lmn
    public dcdc<? extends mzc> d() {
        return this.i;
    }

    @Override // defpackage.lmn
    public cqsn e() {
        return cqrt.l(R.string.MENU_DESTINATION_LIST);
    }

    public void f() {
        mzl b;
        knz knzVar;
        String str;
        dcdc<zfq> a2 = this.b.a();
        dcdc<ldm> a3 = this.e.a();
        int size = this.i.size();
        int size2 = a3.size();
        if (size != size2) {
            this.i = dcdc.e();
        }
        int size3 = a2.size();
        int size4 = a3.size() + 1;
        if (size3 != size4) {
            a3.size();
            bvoo.h("The number of WaypointSummaryViewModels (%d, includes current location as first element) doesn't match the number of destinations + 1 (%d, +1 to include current location).", Integer.valueOf(a2.size()), Integer.valueOf(a3.size() + 1));
        }
        dccx F = dcdc.F();
        int i = 0;
        boolean z = false;
        while (i < a3.size()) {
            knz knzVar2 = kob.a;
            if (size3 == size4) {
                Spanned a4 = a2.get(i + 1).a();
                str = a4 != null ? a4.toString() : "";
                knzVar = kob.a;
            } else {
                knzVar = knzVar2;
                str = "";
            }
            final ldm ldmVar = a3.get(i);
            String str2 = ldmVar.b;
            String string = str2 == null ? this.f.d.getResources().getString(R.string.LOADING_ADDRESS_CONTEXT_LABEL) : str2;
            final int i2 = i;
            mzj g = mzj.g(i, string, "", str, knzVar, i == a3.size() + (-1));
            if (size != size2) {
                final lmm lmmVar = this.c;
                lmmVar.getClass();
                F.g(new mzk(g, new mzi(lmmVar) { // from class: lmo
                    private final lmm a;

                    {
                        this.a = lmmVar;
                    }

                    @Override // defpackage.mzi
                    public final void a(int i3) {
                        this.a.b(i3);
                    }
                }, new dbty(ldmVar, i2) { // from class: lmp
                    private final ldm a;
                    private final int b;

                    {
                        this.a = ldmVar;
                        this.b = i2;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        ldm ldmVar2 = this.a;
                        int i3 = this.b;
                        ilo iloVar = ldmVar2.d;
                        cjta c = cjtd.c(iloVar != null ? iloVar.bZ() : null);
                        c.d = dtxm.bL;
                        c.i(i3);
                        return c.a();
                    }
                }));
            } else {
                z |= this.i.get(i2).i(g);
            }
            i = i2 + 1;
        }
        mzm mzmVar = this.d;
        dcdc<ldm> a5 = this.e.a();
        if (a5.isEmpty()) {
            b = mzl.b(null);
        } else {
            amte l = a5.get(0).l();
            if (l == null) {
                b = mzl.b(null);
            } else {
                amub b2 = l.b(0, this.f.d);
                b = b2 == null ? mzl.b(null) : this.g.a(b2);
            }
        }
        boolean b3 = z | mzmVar.b(b);
        this.h = a3.size() + 1 >= 10;
        if (size != size2) {
            this.i = F.f();
        }
        if (size != size2 || b3) {
            cqkx.p(this);
        }
    }
}
