package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awug  reason: default package */
/* loaded from: classes3.dex */
public class awug implements awtt, bnit {
    public static final ddho a = dtyb.aa;
    public final awuf b;
    public final gga c;
    public final dzsj<awre> d;
    public final dzsj<bwft> e;
    public final cqat f;
    public final jkf g;
    public final awtj h;
    @dzsi
    public awul i;
    public boolean j;
    public awtn k;
    private final awtv l;
    private final cqkj m;
    private final acko n;
    private final bniu o;
    private final bnix p;
    private final String q;
    private final String r;
    private final String s;
    @dzsi
    private izw t;
    private String u;
    private float v;
    private float w;
    private final DialogInterface.OnClickListener x = new awue(this);

    public awug(awtn awtnVar, awuf awufVar, gfw gfwVar, gga ggaVar, cqkj cqkjVar, dzsj<awre> dzsjVar, dxio<bbut> dxioVar, dzsj<bwft> dzsjVar2, bniv bnivVar, cqat cqatVar, jkf jkfVar, cjqy cjqyVar, awtj awtjVar, bniy bniyVar) {
        this.k = awtnVar;
        this.b = awufVar;
        this.c = ggaVar;
        this.m = cqkjVar;
        this.d = dzsjVar;
        this.e = dzsjVar2;
        this.f = cqatVar;
        this.g = jkfVar;
        this.h = awtjVar;
        this.u = C(awtnVar, cqatVar, ggaVar);
        this.q = ggaVar.getString(R.string.CHANGE_PARKING_LOCATION);
        this.r = ggaVar.getString(R.string.PARKING_LOCATION_NOTES_TITLE);
        this.s = ggaVar.getString(R.string.PARKING_LOCATION_TIME_REMAINING_TITLE);
        bniu a2 = bnivVar.a(this, null, false, false);
        this.o = a2;
        bnix a3 = bniyVar.a(a2, cjtd.a(dtyb.I), false);
        this.p = a3;
        this.l = new awtv(ggaVar, cqatVar, jkfVar, awtnVar, a2, a3, awtjVar);
        acks acksVar = new acks(ggaVar, cjqyVar, gfwVar, dxioVar);
        this.n = acksVar;
        acksVar.c(awtnVar);
    }

    private static String C(awtn awtnVar, cqat cqatVar, gga ggaVar) {
        long b = (awtnVar.b() - cqatVar.b()) / TimeUnit.SECONDS.toMillis(1L);
        if (!awtnVar.o() || b <= 0) {
            return ggaVar.getString(R.string.PARKING_LOCATION_TIME_REMAINING_PLACEHOLDER);
        }
        return bvtb.e(ggaVar.getResources(), (int) b, bvsz.ABBREVIATED).toString();
    }

    private final dcdc<izx> D() {
        dccx F = dcdc.F();
        if (!g().booleanValue()) {
            F.g(new ivd(cqrt.g(2131231745, ibm.x()), cqrt.l(R.string.SHARE_PARKING_LOCATION), ibm.x(), new ivc(this) { // from class: awua
                private final awug a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    awug awugVar = this.a;
                    String str = null;
                    String h = dbsj.d(awugVar.k.e()) ? null : awugVar.h();
                    if (awugVar.s().booleanValue()) {
                        gga ggaVar = awugVar.c;
                        long b = awugVar.k.b();
                        long b2 = awugVar.f.b();
                        String c = awtj.c(ggaVar, b);
                        if (b < b2) {
                            str = ggaVar.getString(R.string.SHARED_PARKING_LOCATION_EXPIRED_TIME, c);
                        } else {
                            str = ggaVar.getString(R.string.SHARED_PARKING_LOCATION_EXPIRES_TIME, c);
                        }
                    }
                    awugVar.e.a().c(awugVar.c.getString(R.string.SHARED_PARKING_LOCATION_TITLE), h, dbsj.f(awugVar.l()), str, awugVar.k, awug.a);
                }
            }, cjtd.a(a)));
            F.g(E());
        } else {
            F.g(new ivd(cqrt.g(2131232634, ibm.x()), cqrt.l(awrb.CONFIRM_PARKING_LOCATION), ibm.x(), new ivc(this) { // from class: awub
                private final awug a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    awug awugVar = this.a;
                    awugVar.j = true;
                    awqc awqcVar = (awqc) awugVar.b;
                    awtn awtnVar = awqcVar.a.ar;
                    if (awtnVar != null) {
                        awtm i = awtnVar.i();
                        i.j(2);
                        awtn k = i.k();
                        awqcVar.a.g(k);
                        awqcVar.a.ag.a().i(k);
                    }
                }
            }, cjtd.a(dtyb.Y)));
            F.g(E());
            F.g(new ivd(cqrt.g(2131231715, ibm.x()), cqrt.l(awrb.MOVE_PARKING_LOCATION), ibm.x(), new ivc(this) { // from class: awuc
                private final awug a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    awug awugVar = this.a;
                    awugVar.j = true;
                    awugVar.b.a();
                }
            }, cjtd.a(dtyb.Z)));
        }
        return F.f();
    }

    private final ivd E() {
        return new ivd(cqrt.g(2131232205, ibm.x()), cqrt.l(R.string.CLEAR_PARKING_LOCATION), ibm.x(), new ivc(this) { // from class: awud
            private final awug a;

            {
                this.a = this;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                this.a.d.a().j();
            }
        }, cjtd.a(dtyb.X));
    }

    public izl A() {
        return this.p;
    }

    @Override // defpackage.bnit
    public void PP(bniu bniuVar) {
        cqkx.p(this.l);
        cqkx.p(this);
    }

    @Override // defpackage.awtt
    public awts a() {
        return this.l;
    }

    @Override // defpackage.awtt
    public Float b() {
        return Float.valueOf(bfki.a(this.c.getResources()));
    }

    @Override // defpackage.awtt
    public Float c() {
        return Float.valueOf(this.v);
    }

    @Override // defpackage.awtt
    public Float d() {
        return Float.valueOf(this.w);
    }

    @Override // defpackage.awtt
    public izw e() {
        if (this.t == null || this.j) {
            this.t = new ivb(D(), null);
            this.j = false;
        }
        return this.t;
    }

    @Override // defpackage.awtt
    public acko f() {
        return this.n;
    }

    @Override // defpackage.awtt
    public Boolean g() {
        return Boolean.valueOf(this.k.p());
    }

    @Override // defpackage.awtt
    public String h() {
        if (dbsj.d(this.k.e())) {
            return this.c.getString(R.string.PARKING_LOCATION_LABEL);
        }
        gga ggaVar = this.c;
        String e = this.k.e();
        dbsk.s(e);
        return ggaVar.getString(R.string.PARKING_LOCATION_NEAR, new Object[]{e});
    }

    @Override // defpackage.awtt
    public String i() {
        return this.q;
    }

    @Override // defpackage.awtt
    public String j() {
        return this.r;
    }

    @Override // defpackage.awtt
    public String k() {
        return this.s;
    }

    @Override // defpackage.awtt
    public String l() {
        return dbsj.e(this.k.f());
    }

    @Override // defpackage.awtt
    public cqgl m() {
        return new cqgl(this) { // from class: awty
            private final awug a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.b.b(charSequence.toString());
            }
        };
    }

    @Override // defpackage.awtt
    public View.OnFocusChangeListener n() {
        return new View.OnFocusChangeListener(this) { // from class: awtz
            private final awug a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                awug awugVar = this.a;
                if (!z || awugVar.g.l().L() == jjn.FULLY_EXPANDED) {
                    return;
                }
                awugVar.g.B(jjn.FULLY_EXPANDED);
            }
        };
    }

    @Override // defpackage.awtt
    public cqkl o() {
        if (this.g.l().L() != jjn.FULLY_EXPANDED) {
            this.g.B(jjn.FULLY_EXPANDED);
        }
        return cqkl.a;
    }

    @Override // defpackage.awtt
    public Boolean p() {
        return Boolean.valueOf(!dbsj.d(this.k.f()));
    }

    @Override // defpackage.awtt
    public cqkl q() {
        this.b.b("");
        return cqkl.a;
    }

    @Override // defpackage.awtt
    public cqkl r() {
        this.b.a();
        return cqkl.a;
    }

    @Override // defpackage.awtt
    public Boolean s() {
        return Boolean.valueOf(this.k.o());
    }

    @Override // defpackage.awtt
    public String t() {
        return this.u;
    }

    @Override // defpackage.awtt
    public cqkl u() {
        this.i = new awul(this.c, Math.max(0L, this.k.b() - this.f.b()));
        cqkf e = this.m.e(new awtf());
        e.e(this.i);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.c);
        builder.setView(e.c());
        builder.setTitle(this.c.getString(R.string.PARKING_LOCATION_TIME_REMAINING_PICKER_TITLE));
        builder.setPositiveButton(this.c.getString(R.string.PARKING_LOCATION_TIME_REMAINING_PICKER_CONFIRM), this.x);
        builder.create().show();
        return cqkl.a;
    }

    public void v(boolean z) {
        this.l.a = z;
        this.p.K(z ? jjn.EXPANDED : jjn.COLLAPSED);
        this.p.M(this.o.a(), this.o.l());
        cqkx.p(this.p);
    }

    public void w(awtn awtnVar) {
        this.l.g(awtnVar);
        this.n.c(awtnVar);
        this.u = C(awtnVar, this.f, this.c);
        this.k = awtnVar;
    }

    public void x(float f) {
        this.v = f;
    }

    public void y(float f) {
        this.w = f;
    }

    public bniu z() {
        return this.o;
    }
}
