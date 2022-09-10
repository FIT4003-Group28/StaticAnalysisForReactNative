package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: apem  reason: default package */
/* loaded from: classes2.dex */
public class apem implements apdz {
    public final Long a;
    public final axyp b;
    public final aper c;
    public final anhk d;
    public final dzsj<anhg> e;
    public final aoxt f;
    public final Executor g;
    public final cjqy h;
    public final apcl i;
    public final apdi j;
    public axyo k;
    private final bwrr<ilo> l;
    private final begg m;
    private final dzsj<axwy> n;
    private final bwqv o;
    private final gga p;
    private final angp q;
    private final bwrs<ilo> r;
    private final int s;
    private final apda t;
    private final aoxv u;

    public apem(begg beggVar, axyp axypVar, dzsj<axwy> dzsjVar, bwqv bwqvVar, gga ggaVar, dzsj<anhg> dzsjVar2, angp angpVar, anhk anhkVar, Executor executor, cjqy cjqyVar, apdb apdbVar, apcl apclVar, aoxv aoxvVar, aper aperVar, aoxt aoxtVar, int i, aoxr aoxrVar, apdi apdiVar) {
        apef apefVar = new apef(this);
        this.l = apefVar;
        this.m = beggVar;
        this.b = axypVar;
        this.n = dzsjVar;
        this.o = bwqvVar;
        this.p = ggaVar;
        this.q = angpVar;
        this.d = anhkVar;
        this.c = aperVar;
        this.g = executor;
        this.h = cjqyVar;
        this.k = axypVar.a(aoxtVar.a());
        bwrs<ilo> a = bwrs.a(aoxtVar.a());
        this.r = a;
        dpuc dpucVar = aoxtVar.e().b;
        this.a = Long.valueOf((dpucVar == null ? dpuc.c : dpucVar).b);
        this.e = dzsjVar2;
        this.f = aoxtVar;
        this.s = i;
        this.t = apdbVar.a(aoxtVar, aoxrVar);
        this.i = apclVar;
        this.u = aoxvVar;
        this.j = apdiVar;
        dbsk.s(bwqvVar);
        dbsk.s(a);
        dbsk.s(apefVar);
        bwqvVar.f(a, apefVar, false);
    }

    public static cqtd k(cqtd cqtdVar) {
        return new apeg(new Object[]{cqtdVar}, cqtdVar);
    }

    public static cqtd l(cqtd cqtdVar, cqss cqssVar) {
        return new apeh(new Object[]{cqtdVar, cqssVar}, cqssVar, cqtdVar);
    }

    @Override // defpackage.apdz
    public cqtd a() {
        if (this.k.a()) {
            return l(this.k.b(), this.k.h());
        }
        return k(cqrt.i(this.k.b(), ibm.x()));
    }

    @Override // defpackage.apdz
    public cqkl b() {
        this.n.a().j(this.r);
        return cqkl.a;
    }

    @Override // defpackage.apdz
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtyi.aG;
        b.i(this.s);
        return b.a();
    }

    @Override // defpackage.apdz
    public String d() {
        return ((cqsh) this.k.f()).a.toString();
    }

    @Override // defpackage.apcy
    public apcz e() {
        return this.t;
    }

    @Override // defpackage.apcy
    public cqkl f() {
        cjqy cjqyVar = this.h;
        cjta b = cjtd.b();
        b.d = dtyi.aE;
        b.i(this.s);
        cjqyVar.i(b.a());
        begg beggVar = this.m;
        begj begjVar = new begj();
        begjVar.b(m());
        begjVar.c = jjn.EXPANDED;
        begjVar.n = true;
        begjVar.c(false);
        beggVar.o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.apcy
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtyi.aE;
        b.i(this.s);
        return b.a();
    }

    @Override // defpackage.apdz
    public jht h() {
        jhu h = jhv.h();
        jhi jhiVar = (jhi) h;
        jhiVar.e = this.p.getString(R.string.MAPS_ACTIVITY_OVERFLOW_MENU_BUTTON_CONTENT_DESCRIPTION, new Object[]{this.t.a()});
        if (this.a.longValue() > 0) {
            jhm jhmVar = new jhm();
            jhmVar.l = 0;
            jhmVar.a = this.p.getString(R.string.MAPS_ACTIVITY_VIEW_LAST_VISIT_BUTTON);
            jhmVar.d(new View.OnClickListener(this) { // from class: apec
                private final apem a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    apem apemVar = this.a;
                    apemVar.e.a().D(anhy.n(apemVar.a.longValue(), apemVar.m().aT(), dbpy.a));
                }
            });
            jhmVar.f = cjtd.a(dtyi.bU);
            h.d(jhmVar.c());
        }
        jhm jhmVar2 = new jhm();
        jhmVar2.l = 1;
        jhmVar2.a = this.p.getString(R.string.MAPS_ACTIVITY_REMOVE_VISIT_BUTTON);
        jhmVar2.d(new View.OnClickListener(this) { // from class: aped
            private final apem a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final apem apemVar = this.a;
                apemVar.i.c(1, new DialogInterface.OnClickListener(apemVar) { // from class: apee
                    private final apem a;

                    {
                        this.a = apemVar;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.a.n();
                    }
                });
            }
        });
        jhmVar2.f = cjtd.a(dtyi.aN);
        h.d(jhmVar2.c());
        return jhiVar.b();
    }

    @Override // defpackage.apdz
    public cjtd i() {
        cjta b = cjtd.b();
        b.d = dtyi.aF;
        b.i(this.s);
        return b.a();
    }

    @Override // defpackage.apdz
    public Boolean j() {
        return Boolean.valueOf(!this.c.h(this.f.a().ai()));
    }

    public ilo m() {
        ilo c = this.r.c();
        dbsk.s(c);
        return c;
    }

    public final void n() {
        apel apelVar = new apel(this);
        this.c.g(dcep.B(this.f.a().ai()));
        this.u.f();
        angp angpVar = this.q;
        dbpy<Object> dbpyVar = dbpy.a;
        dbpy<Object> dbpyVar2 = dbpy.a;
        ilo c = this.r.c();
        dbsk.s(c);
        angpVar.g(dbpyVar, dbpyVar2, c.h(), dbpy.a, dnqh.p, dbpy.a, dbsg.i(apelVar));
    }
}
