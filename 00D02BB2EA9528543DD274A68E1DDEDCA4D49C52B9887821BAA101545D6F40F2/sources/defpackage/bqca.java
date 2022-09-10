package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqca  reason: default package */
/* loaded from: classes4.dex */
public class bqca implements bqin {
    public static final dcqe a = dcqe.c("bqca");
    public final jkf b;
    public final jlp c;
    public final zzn d;
    public final eeu e;
    public final Executor f;
    public final bpzp g;
    public final dnqe h;
    public final gga i;
    public final bqba j;
    public final cpv k;
    @dzsi
    public jmb l;
    private final afwr m;
    private final bqat n;
    private final bnyc p;
    private final afud q;
    @dzsi
    private jmb t;
    @dzsi
    private jmb u;
    private final jkh o = new bqbw(this);
    private final Runnable r = new bqbt(this);
    private boolean s = true;

    public bqca(bqhg bqhgVar, dnqe dnqeVar, gga ggaVar, eeu eeuVar, jmx jmxVar, bnyd bnydVar, Executor executor, jkf jkfVar, cqhn cqhnVar, jlp jlpVar, bqbb bqbbVar, zzn zznVar, afwr afwrVar, bpzq bpzqVar, bqau bqauVar, gdc gdcVar, cpv cpvVar) {
        this.h = dnqeVar;
        this.i = ggaVar;
        this.e = eeuVar;
        this.f = executor;
        this.b = jkfVar;
        this.c = jlpVar;
        this.d = zznVar;
        this.m = afwrVar;
        this.k = cpvVar;
        this.q = new afud(afwrVar.l());
        cqhn a2 = bqauVar.a.a();
        bqau.a(a2, 1);
        Activity activity = (Activity) ((dxjd) bqauVar.b).a;
        bqau.a(activity, 2);
        this.n = new bqat(a2, activity);
        bqgw b = bqhgVar.b().b();
        bqbz bqbzVar = new bqbz(this, gdcVar);
        bpzq.a(b, 1);
        bpzq.a(bqbzVar, 2);
        jkf a3 = bpzqVar.a.a();
        bpzq.a(a3, 3);
        bpys a4 = bpzqVar.b.a();
        bpzq.a(a4, 4);
        ff ffVar = (ff) ((dxjd) bpzqVar.c).a;
        bpzq.a(ffVar, 5);
        cqhn a5 = bpzqVar.d.a();
        bpzq.a(a5, 6);
        jmx a6 = bpzqVar.e.a();
        bpzq.a(a6, 7);
        this.g = new bpzp(b, bqbzVar, a3, a4, ffVar, a5, a6);
        this.j = bqbbVar.a(bqhgVar, new bqbv(this));
        this.p = bnydVar.a(ggaVar.g(), dtya.cA, dtya.cB);
    }

    private final void v() {
        jmb jmbVar = this.t;
        if (jmbVar != null) {
            jmbVar.a();
            this.t = null;
        }
        jmb jmbVar2 = this.u;
        if (jmbVar2 != null) {
            jmbVar2.a();
            this.u = null;
        }
        jmb jmbVar3 = this.l;
        if (jmbVar3 != null) {
            jmbVar3.a();
            this.l = null;
        }
    }

    public void a() {
        this.q.c(this.r);
        bqbu bqbuVar = new bqbu(this);
        d();
        this.n.a(bqbuVar);
        this.j.c();
        if (this.j.o() == 0) {
            int i = this.j.h;
            View view = null;
            if (i == 0) {
                throw null;
            }
            if (i == 2) {
                return;
            }
            View o = cqkx.o(this);
            if (o != null) {
                view = o.findViewById(bqgh.a);
            }
            if (view != null) {
                jlo a2 = this.c.a(this.i.getString(R.string.MISSING_ROAD_MULTI_ADD_FIRST_ROAD_TIP_SUBTITLE), view);
                a2.o(false);
                a2.b(4);
                a2.p();
                a2.v();
                a2.t(jln.GM2_BLUE);
                a2.r();
                this.t = a2.a();
                return;
            }
            bvoo.h("Unable to find chip view", new Object[0]);
        }
    }

    public void b() {
        v();
        ImageView imageView = (ImageView) this.d.b();
        if (imageView != null) {
            imageView.clearColorFilter();
        }
        this.q.d();
        this.j.e();
    }

    public cqss c() {
        if (this.m.l().d(afwm.SATELLITE)) {
            return ibm.k();
        }
        return ibm.c();
    }

    public final void d() {
        boolean d = this.m.l().d(afwm.SATELLITE);
        ImageView imageView = (ImageView) this.d.b();
        if (imageView != null) {
            imageView.setColorFilter(c().b(this.i));
        }
        bqba bqbaVar = this.j;
        int i = 1;
        if (true == d) {
            i = 2;
        }
        bqbaVar.q(i);
    }

    @Override // defpackage.bqin
    public bqil e() {
        return this.n;
    }

    @Override // defpackage.bqin
    public cqkl f() {
        this.j.p();
        View b = this.d.b();
        if (b != null) {
            b.setVisibility(0);
            if (this.j.o() == 0) {
                jlo a2 = this.c.a(this.i.getString(R.string.MISSING_ROAD_POLYLINE_ADD_TIP_SUBTITLE), b);
                a2.o(true);
                a2.v();
                a2.e(new Runnable(this) { // from class: bqbp
                    private final bqca a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bqca bqcaVar = this.a;
                        View o = cqkx.o(bqcaVar);
                        View findViewById = o != null ? o.findViewById(bqft.a) : null;
                        if (findViewById != null) {
                            jlo a3 = bqcaVar.c.a(bqcaVar.i.getString(R.string.MISSING_ROAD_POLYLINE_ADD_TIP_SUBTITLE), findViewById);
                            a3.d();
                            a3.o(false);
                            a3.p();
                            a3.t(jln.GM2_BLUE);
                            a3.v();
                            a3.r();
                            bqcaVar.l = a3.a();
                        } else if (o == null || !bqcaVar.e.b()) {
                        } else {
                            bvoo.h("Unable to find addButton ", new Object[0]);
                        }
                    }
                }, this.f);
                a2.p();
                a2.t(jln.GM2_BLUE);
                a2.r();
                a2.f(new Runnable(this) { // from class: bqbq
                    private final bqca a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bqca bqcaVar = this.a;
                        View o = cqkx.o(bqcaVar);
                        if (o != null) {
                            bqcaVar.k.f(o, bqcaVar.i.getString(R.string.MISSING_ROAD_POLYLINE_ADD_TIP_SUBTITLE));
                        }
                    }
                }, dege.a);
                this.u = a2.a();
            }
        }
        this.b.B(jjn.HIDDEN);
        g();
        cqkx.p(this);
        return cqkl.a;
    }

    public final void g() {
        this.n.b(this.j.n());
    }

    @Override // defpackage.bqin
    public String h() {
        if (!j().booleanValue()) {
            return this.i.getString(R.string.MISSING_ROAD_MULTI_ADD_FIRST_ROAD_BUTTON_LABEL);
        }
        return this.i.getString(R.string.MISSING_ROAD_MULTI_ADD_ANOTHER_ROAD_BUTTON_LABEL);
    }

    @Override // defpackage.bqin
    public String i() {
        return this.i.getString(R.string.NEXT);
    }

    @Override // defpackage.bqin
    public Boolean j() {
        return Boolean.valueOf(this.j.o() > 0);
    }

    @Override // defpackage.bqin
    public cqkl k() {
        if (this.e.b()) {
            jmw.d(this.i, new Runnable(this) { // from class: bqbs
                private final bqca a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bqca bqcaVar = this.a;
                    gga ggaVar = bqcaVar.i;
                    bqif r = bqcaVar.r();
                    dnqe dnqeVar = bqcaVar.h;
                    Bundle bundle = new Bundle();
                    bvrs.k(bundle, "NOTE_PROTO_KEY", new bokk("", false).b().bK());
                    bvrs.k(bundle, "MODEL_PROTO_KEY", r);
                    bvrs.k(bundle, "CLIENT_STATE_PROTO_KEY", dnqeVar);
                    bqbh bqbhVar = new bqbh();
                    bqbhVar.B(bundle);
                    ggaVar.D(bqbhVar);
                }
            });
        }
        return cqkl.a;
    }

    @Override // defpackage.bqin
    public Boolean l() {
        return Boolean.valueOf(!m().booleanValue());
    }

    @Override // defpackage.bqin
    public Boolean m() {
        int i = this.j.h;
        if (i != 0) {
            boolean z = true;
            if (i != 1 && i != 3) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        throw null;
    }

    @Override // defpackage.bqin
    public Boolean n() {
        return Boolean.valueOf(this.s);
    }

    @Override // defpackage.bqin
    public afuc o() {
        return this.q;
    }

    public bpzp p() {
        return this.g;
    }

    public jkh q() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bqif r() {
        bqba bqbaVar = this.j;
        bqhy bZ = bqif.f.bZ();
        List k = dchl.k(bqbaVar.e, bqay.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqif bqifVar = (bqif) bZ.b;
        bqifVar.b();
        dsod.bv(k, bqifVar.b);
        int i = bqbaVar.h;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqif bqifVar2 = (bqif) bZ.b;
        int i2 = i - 1;
        if (i != 0) {
            bqifVar2.e = i2;
            bqifVar2.a |= 4;
            bqcn bqcnVar = bqbaVar.f;
            bqib bZ2 = bqie.e.bZ();
            bqhm c = bqcnVar.c.c();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            bqie bqieVar = (bqie) bZ2.b;
            bqhv bK = c.bK();
            bK.getClass();
            bqieVar.b = bK;
            bqieVar.a |= 1;
            int i3 = bqcnVar.d;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            bqie bqieVar2 = (bqie) bZ2.b;
            int i4 = bqieVar2.a | 2;
            bqieVar2.a = i4;
            bqieVar2.c = i3;
            int i5 = bqcnVar.k;
            int i6 = i5 - 1;
            if (i5 != 0) {
                bqieVar2.d = i6;
                bqieVar2.a = i4 | 4;
                bqie bK2 = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bqif bqifVar3 = (bqif) bZ.b;
                bK2.getClass();
                bqifVar3.d = bK2;
                int i7 = bqifVar3.a | 2;
                bqifVar3.a = i7;
                bqhr bqhrVar = bqbaVar.g;
                bqhrVar.getClass();
                bqifVar3.c = bqhrVar;
                bqifVar3.a = i7 | 1;
                return bZ.bK();
            }
            throw null;
        }
        throw null;
    }

    public void s(boolean z) {
        if (this.s != z) {
            this.s = z;
            cqkx.p(this);
        }
    }

    public jib t() {
        jhz a2 = jhz.a();
        a2.e = cqtt.g(ibm.b());
        a2.r = 0;
        a2.x = false;
        a2.h = false;
        a2.f(new View.OnClickListener(this) { // from class: bqbr
            private final bqca a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.u();
            }
        });
        return a2.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r3.f.c.f().isEmpty() == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u() {
        /*
            r6 = this;
            eeu r0 = r6.e
            boolean r0 = r0.b()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            r6.v()
            jkf r0 = r6.b
            jkj r0 = r0.l()
            jjn r0 = r0.L()
            boolean r0 = r0.b()
            r2 = 1
            if (r0 == 0) goto L26
            jkf r0 = r6.b
            jjn r1 = defpackage.jjn.COLLAPSED
            r0.B(r1)
            return r2
        L26:
            bnyc r0 = r6.p
            bqba r3 = r6.j
            java.util.List<bqgw> r4 = r3.e
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L4a
            int r4 = r3.h
            if (r4 == 0) goto L48
            r5 = 2
            if (r4 != r5) goto L4b
            bqcn r3 = r3.f
            bqgw r3 = r3.c
            java.util.List r3 = r3.f()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L4b
            goto L4a
        L48:
            r0 = 0
            throw r0
        L4a:
            r1 = 1
        L4b:
            r0.b(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqca.u():boolean");
    }
}
