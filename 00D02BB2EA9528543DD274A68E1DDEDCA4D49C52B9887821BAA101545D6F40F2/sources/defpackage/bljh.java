package defpackage;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.StyleSpan;
/* compiled from: PG */
/* renamed from: bljh  reason: default package */
/* loaded from: classes3.dex */
public class bljh implements bliy {
    static final dcdn<drdk, String> a;
    public static final /* synthetic */ int b = 0;
    private static final dcqe c = dcqe.c("bljh");
    private final boolean d;
    private final dxio<bkpi> e;
    private final bwrs<ilo> f;
    private final doft g;
    private final SpannableString h;
    private final String i;
    private final Runnable j;
    private final jic k;
    private final dbsg<djck> l;
    private final cjtd m;

    static {
        drdj bZ = drdk.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drdk drdkVar = (drdk) bZ.b;
        drdkVar.a = 1;
        drdkVar.b = "/m/01w53b";
        drdk bK = bZ.bK();
        drdj bZ2 = drdk.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drdk drdkVar2 = (drdk) bZ2.b;
        drdkVar2.a = 1;
        drdkVar2.b = "/m/035bpb";
        a = dcdn.l(bK, "/geo/type/establishment_poi/has_takeout", bZ2.bK(), "/geo/type/establishment_poi/has_delivery");
    }

    public bljh(Activity activity, btvo btvoVar, dxio<bkpi> dxioVar, cafi cafiVar, dxio<afha> dxioVar2, bwrs<ilo> bwrsVar, doft doftVar) {
        dbsg<djck> r;
        this.d = btvoVar.getUgcParameters().aq().a.isEmpty();
        this.e = dxioVar;
        this.f = bwrsVar;
        this.g = doftVar;
        this.h = j(doftVar);
        dnpq dnpqVar = doftVar.b;
        this.j = bmek.b(activity, cafiVar, dxioVar2, (dnpqVar == null ? dnpq.g : dnpqVar).c);
        dnfg dnfgVar = doftVar.c;
        dnna dnnaVar = (dnfgVar == null ? dnfg.c : dnfgVar).b;
        this.k = new jic((dnnaVar == null ? dnna.m : dnnaVar).e, ckqc.FIFE_MERGE, 2131232998);
        ilo c2 = bwrsVar.c();
        if (c2 == null) {
            r = dbpy.a;
        } else {
            final dcep B = dcbg.b(doftVar.f).o(bljb.a).s(bljc.a).B();
            r = dcbg.b(c2.bE().a).r(new dbsl(B) { // from class: bljd
                private final dcep a;

                {
                    this.a = B;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    dcep dcepVar = this.a;
                    int i = bljh.b;
                    drdk drdkVar = ((djck) obj).b;
                    if (drdkVar == null) {
                        drdkVar = drdk.c;
                    }
                    return dcepVar.contains(drdkVar);
                }
            });
        }
        this.l = r;
        ilo c3 = bwrsVar.c();
        dbsk.s(c3);
        cjta c4 = cjtd.c(c3.bZ());
        dofq dofqVar = doftVar.g;
        c4.d = (dofqVar == null ? dofq.c : dofqVar).a ? dtya.di : dtya.ea;
        if (r.a()) {
            this.i = bljs.j(activity, r.b());
            dcdn<drdk, String> dcdnVar = a;
            drdk drdkVar = r.b().b;
            dcdnVar.get(drdkVar == null ? drdk.c : drdkVar);
            c4.g(r.b().c);
        } else {
            this.i = "";
        }
        this.m = c4.a();
    }

    private static SpannableString j(doft doftVar) {
        SpannableString spannableString = new SpannableString(doftVar.e);
        for (dofs dofsVar : doftVar.f) {
            int i = dofsVar.a;
            int i2 = -1;
            int i3 = (i & 1) != 0 ? dofsVar.b : -1;
            if ((i & 2) != 0) {
                i2 = dofsVar.c;
            }
            try {
                spannableString.setSpan(new StyleSpan(1), i3, i2, 17);
            } catch (IndexOutOfBoundsException unused) {
                bvoo.h("Exception in setSpan, ignoring SummaryQuote.highlights of SummaryQuote:[%d-%d] %s", Integer.valueOf(i3), Integer.valueOf(i2), spannableString);
            }
        }
        return spannableString;
    }

    @Override // defpackage.bliy
    public CharSequence a() {
        return this.h;
    }

    @Override // defpackage.bliy
    public CharSequence b() {
        return this.i;
    }

    @Override // defpackage.bliy
    public CharSequence c() {
        return this.i;
    }

    @Override // defpackage.bliy
    public jic d() {
        return this.k;
    }

    @Override // defpackage.bliy
    public Boolean e() {
        dofq dofqVar = this.g.g;
        if (dofqVar == null) {
            dofqVar = dofq.c;
        }
        return Boolean.valueOf(dofqVar.b);
    }

    @Override // defpackage.bliy
    public Boolean f() {
        dofq dofqVar = this.g.g;
        if (dofqVar == null) {
            dofqVar = dofq.c;
        }
        return Boolean.valueOf(dofqVar.a);
    }

    @Override // defpackage.bliy
    public cqkl g() {
        if (this.d) {
            this.j.run();
        } else if (this.l.a()) {
            bkpi a2 = this.e.a();
            bwrs<ilo> bwrsVar = this.f;
            dbsg<drdk> h = this.l.h(blje.a);
            dbpy<Object> dbpyVar = dbpy.a;
            this.l.b();
            a2.b(bwrsVar, h, dbpyVar, blif.i(), false, dbsg.i(this.g.d));
        } else {
            this.e.a().b(this.f, dbpy.a, dcbg.b(this.g.f).s(bljf.a).r(bljg.a), dbpy.a, false, dbsg.i(this.g.d));
        }
        return cqkl.a;
    }

    @Override // defpackage.bliy
    public cjtd h() {
        return this.m;
    }

    @Override // defpackage.bliy
    public dbsg<djck> i() {
        return this.l;
    }
}
