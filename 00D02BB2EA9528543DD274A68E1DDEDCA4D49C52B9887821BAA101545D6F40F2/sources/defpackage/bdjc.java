package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bdjc  reason: default package */
/* loaded from: classes3.dex */
public class bdjc implements bdim {
    public final gga a;
    public final bdhg b;
    public final bdin c;
    public final bdil d;
    public final Handler e;
    public bdja g;
    public boolean h;
    private final buti i;
    private final bdis j;
    private final bbut k;
    private final bbuq l;
    private final gdc m;
    private final ges o;
    private bdjb q;
    private boolean r;
    private final List<bcdh> n = new ArrayList();
    public final List<bdik> f = new ArrayList();
    private final bbup s = new bdiy(this);
    private dcdc<bcdf> p = dcdc.e();

    public bdjc(gga ggaVar, cqhn cqhnVar, buti butiVar, bdis bdisVar, bbut bbutVar, bdin bdinVar, gdc gdcVar, Handler handler, bbuq bbuqVar, bdhg bdhgVar, bdil bdilVar, ges gesVar) {
        this.a = ggaVar;
        this.i = butiVar;
        this.j = bdisVar;
        this.k = bbutVar;
        this.l = bbuqVar;
        this.b = bdhgVar;
        this.d = bdilVar;
        this.o = gesVar;
        this.e = handler;
        this.g = new bdja(this, bdhgVar.h().size());
        this.c = bdinVar;
        this.m = gdcVar;
    }

    private final cjtd p(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.g = decs.a(akqi.b(this.b.a()).c);
        b.d = ddhoVar;
        return b.a();
    }

    @Override // defpackage.cqrh
    public void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        this.l.h(this.i);
        bdjb bdjbVar = this.q;
        if (cqkpVar != bdjbVar || !bdjbVar.a()) {
            return;
        }
        this.l.h(this.i);
    }

    @Override // defpackage.bdim
    public List<bcdf> a() {
        return this.p;
    }

    @Override // defpackage.bdim
    public Boolean b() {
        return Boolean.valueOf(this.l.g());
    }

    @Override // defpackage.bdim
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.bdim
    public cqkp d() {
        bdjb bdjbVar = new bdjb();
        this.q = bdjbVar;
        return bdjbVar;
    }

    @Override // defpackage.bdim
    public jib e() {
        jhz e = jib.g(this.a, this.b.e()).e();
        e.f(new View.OnClickListener(this) { // from class: bdit
            private final bdjc a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m();
            }
        });
        if (this.b.i() == bdhf.MULTIPLE) {
            jhm jhmVar = new jhm();
            jhmVar.h = 1;
            jhmVar.c = cqrt.f(2131232241);
            jhmVar.d = this.g.a() ? ibm.w() : irg.b();
            jhmVar.n = this.g.a();
            jhmVar.b = this.a.getString(R.string.SUGGEST_PHOTO_DONE);
            jhmVar.f = p(dtxy.fa);
            jhmVar.d(new View.OnClickListener(this) { // from class: bdiw
                private final bdjc a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bdjc bdjcVar = this.a;
                    bdjcVar.d.a(bdjcVar.n());
                }
            });
            e.c(jhmVar.c());
        }
        if (!dbsj.d(this.b.f())) {
            e.b = this.b.f();
        }
        return e.b();
    }

    @Override // defpackage.bdim
    public Boolean g() {
        boolean z = true;
        if (this.b.j() == 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdim
    public cqkl h() {
        bbuz m = bbve.m();
        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_AND_INVOKER_FLOW);
        m.e(this.b.d());
        bdhf bdhfVar = bdhf.MULTIPLE;
        int j = this.b.j();
        int i = j - 1;
        if (j != 0) {
            if (i == 1) {
                ily ilyVar = new ily();
                dvya bZ = dvyw.bv.bZ();
                String b = this.b.b();
                dbsk.s(b);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvyw dvywVar = (dvyw) bZ.b;
                b.getClass();
                dvywVar.a |= 8;
                dvywVar.h = b;
                ilyVar.E(bZ.bK());
                ilo d = ilyVar.d();
                bbut bbutVar = this.k;
                ((bbsu) m).b = d;
                bbutVar.j(m.a());
            } else if (i == 2) {
                ily ilyVar2 = new ily();
                ilyVar2.k(this.b.a());
                ilo d2 = ilyVar2.d();
                bbut bbutVar2 = this.k;
                ((bbsu) m).b = d2;
                bbutVar2.j(m.a());
            } else if (i == 3) {
                this.k.k(m.a(), this.o);
            }
            return cqkl.a;
        }
        throw null;
    }

    @Override // defpackage.bdim
    @dzsi
    public CharSequence i() {
        return this.b.g();
    }

    @Override // defpackage.bdim
    public Boolean j() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.bdim
    public Boolean k() {
        return Boolean.valueOf(this.n.size() > 0);
    }

    @Override // defpackage.bdim
    public jam l() {
        return this.c;
    }

    public void m() {
        bdhf bdhfVar = bdhf.MULTIPLE;
        int ordinal = this.b.i().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            this.d.a(n());
        } else if (!this.g.a()) {
            this.a.g().f();
        } else {
            gcz a = this.m.a();
            a.j();
            a.d(R.string.SUGGEST_PHOTO_EXIT_DIALOG_TITLE);
            a.h(R.string.SUGGEST_PHOTO_EXIT_DIALOG_CONFIRM_BUTTON, p(dtxy.ff), new gdd(this) { // from class: bdiu
                private final bdjc a;

                {
                    this.a = this;
                }

                @Override // defpackage.gdd
                public final void a(DialogInterface dialogInterface) {
                    this.a.a.g().f();
                }
            });
            a.e(R.string.SUGGEST_PHOTO_EXIT_DIALOG_CANCEL_BUTTON, p(dtxy.fe), bdiv.a);
            a.i = p(dtxy.fd);
            a.b();
        }
    }

    public final Map<String, String> n() {
        int i;
        dcdg dcdgVar = new dcdg();
        dcdc<bcdf> dcdcVar = this.p;
        int size = dcdcVar.size();
        int i2 = 0;
        while (i2 < size) {
            dcdc<bcdh> a = dcdcVar.get(i2).a();
            int size2 = a.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 < size2) {
                    bcdh bcdhVar = a.get(i3);
                    if (bcdhVar.k().booleanValue()) {
                        String l = bcdhVar.l();
                        dbsk.s(l);
                        String str = bcdhVar.b().a;
                        dbsk.s(str);
                        dcdgVar.f(l, str);
                    }
                    i3++;
                }
            }
            i2 = i;
        }
        return dcdgVar.b();
    }

    public void o() {
        int size = this.n.size();
        int d = this.l.d();
        for (int i = size; i < d; i++) {
            dwfl e = this.l.e(i);
            dbsk.s(e);
            final String str = e.h;
            if (!dcbg.b(this.b.h()).p(new dbsl(str) { // from class: bdix
                private final String a;

                {
                    this.a = str;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    String str2 = this.a;
                    String a = ((bbtm) obj).a();
                    dbsk.s(a);
                    return a.equals(str2);
                }
            })) {
                this.n.add(this.j.a(e, this.f.size() + i, this.b.i(), false, this.g));
            }
        }
        if (size == 0) {
            try {
                List<dwfl> list = this.k.r(this.b.h()).get();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    this.f.add(this.j.a(list.get(i2), i2, this.b.i(), true, this.g));
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            this.n.addAll(0, this.f);
            size = 0;
        }
        if (d > size) {
            this.p = bccu.a(dcdc.r(this.n), this.p);
        }
        if (!this.r) {
            this.l.r(this.s);
            this.r = true;
        }
    }
}
