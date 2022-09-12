package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: gwu  reason: default package */
/* loaded from: classes.dex */
public final class gwu {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    public static final cqfc c = m(true);
    public static final cqfc d = m(false);

    private gwu() {
    }

    public static cqtv a() {
        return cqrp.d(12.0d);
    }

    public static cqtv b() {
        return cqsv.d(cqrp.d(12.0d), cqrp.d(16.0d));
    }

    public static cqtv c() {
        return cqsv.d(cqrp.d(16.0d), cqrp.d(20.0d));
    }

    public static cqtv d() {
        return cqsv.d(cqrp.d(8.0d), cqrp.d(16.0d));
    }

    public static ViewGroup e(View view) {
        FrameLayout frameLayout;
        if (view instanceof begb) {
            frameLayout = new gwv(view.getContext(), (begb) view);
        } else {
            frameLayout = new FrameLayout(view.getContext());
        }
        frameLayout.addView(view);
        frameLayout.setClipChildren(false);
        frameLayout.setOnTouchListener(new gwp(view));
        return frameLayout;
    }

    public static cqfc f(boolean z) {
        float f = 1.0f;
        float f2 = true != z ? 0.0f : 1.0f;
        if (true != z) {
            f = 0.5f;
        }
        return new gwr(z, f2, f, true != z ? 167 : 250);
    }

    public static boolean g(View view) {
        return cqkx.i(view) != null;
    }

    public static <T extends cqkp> cqmj<T> h(cqlc<T, jar> cqlcVar, boolean z) {
        return j(cqlcVar, z, cqkz.a(b()), cqkz.a(a()));
    }

    public static <T extends cqkp> cqmj<T> i(cqlc<T, jar> cqlcVar) {
        return j(cqlcVar, true, cqkz.a(b()), cqkz.a(a()));
    }

    public static <T extends cqkp> cqmj<T> j(cqlc<T, jar> cqlcVar, boolean z, cqlc<T, cqtv> cqlcVar2, cqlc<T, cqtv> cqlcVar3) {
        return k(cqlcVar, z, true, null, cqlcVar2, cqlcVar3);
    }

    public static <T extends cqkp> cqmj<T> k(final cqlc<T, jar> cqlcVar, boolean z, boolean z2, @dzsi cqmj<T> cqmjVar, cqlc<T, cqtv> cqlcVar2, cqlc<T, cqtv> cqlcVar3) {
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.cd(-2);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.by(new cqlc(cqlcVar) { // from class: gvt
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).I();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr[3] = cqgr.L(false);
        cqmpVarArr[4] = cqgr.aT(a);
        cqmpVarArr[5] = z ? cqgr.fF(new cqlc(cqlcVar) { // from class: gwe
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).J();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }) : cqmp.e;
        cqmpVarArr[6] = z2 ? cqgr.fs(new cqlc(cqlcVar) { // from class: gwh
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).B();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }) : cqmp.e;
        cqmp[] cqmpVarArr2 = new cqmp[17];
        cqmpVarArr2[0] = cqgr.cL(ibn.a());
        cqmpVarArr2[1] = cqgr.cH(ibn.a());
        cqmpVarArr2[2] = cqgr.cd(-2);
        cqmpVarArr2[3] = cqgr.bp(-2);
        cqmpVarArr2[4] = cqgr.by(new cqlc(cqlcVar) { // from class: gwi
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).I();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[5] = cqgr.L(false);
        cqmpVarArr2[6] = cqgr.aS(new cqlc(cqlcVar) { // from class: gwj
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).C();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[7] = cqgr.V(new cqlc(cqlcVar) { // from class: gwk
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).y();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[8] = cqgr.au(new cqlc(cqlcVar) { // from class: gwl
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).o();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[9] = cqgr.cW(acly.a(new acmd(cqlcVar) { // from class: gwm
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.acmd
            public final void a(cqkp cqkpVar, cjqm cjqmVar) {
                ((jar) this.a.a(cqkpVar)).a(cjqmVar);
            }
        }));
        cqmpVarArr2[10] = cqgr.K(new cqlc(cqlcVar) { // from class: gwn
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).p();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[11] = cqgr.dn(cqgr.s(new cqlc(cqlcVar) { // from class: gwo
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).c();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        cqmpVarArr2[12] = cqgr.cs(new cqlc(cqlcVar) { // from class: gvu
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).b();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[13] = iue.c(new cqlc(cqlcVar) { // from class: gvv
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).z();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[14] = cqmp.e;
        cqmpVarArr2[15] = cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.fab_icon)), cqgr.aT(b), cqgr.L(false), cqgr.cg(new cqlc(cqlcVar) { // from class: gvw
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).m();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bs(new cqlc(cqlcVar) { // from class: gvx
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).m();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bw(8388613), cqgr.bI(cqlcVar2), cqgr.bF(cqlcVar3), cqgr.fY(cqgr.gc(cqgr.eG(new cqlc(cqlcVar) { // from class: gvy
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).u();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })), cqgr.y(new cqlc(cqlcVar) { // from class: gvz
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).w();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })), cqgr.fY(cqgr.j(new cqlc(cqlcVar) { // from class: gwa
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).NG();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.gc(cqgr.cg(new cqlc(cqlcVar) { // from class: gwb
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                if (((jar) cqlcVar4.a(cqkpVar)).s() == null) {
                    return ((jar) cqlcVar4.a(cqkpVar)).m();
                }
                return ((jar) cqlcVar4.a(cqkpVar)).s();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bs(new cqlc(cqlcVar) { // from class: gwc
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                if (((jar) cqlcVar4.a(cqkpVar)).s() == null) {
                    return ((jar) cqlcVar4.a(cqkpVar)).m();
                }
                return ((jar) cqlcVar4.a(cqkpVar)).s();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bw(17), cqgr.fF(new cqlc(cqlcVar) { // from class: gwd
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).q().booleanValue() ? gwu.c : gwu.d;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eG(new cqlc(cqlcVar) { // from class: gwf
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).r();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.ej(new cqlc(cqlcVar) { // from class: gwg
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((jar) this.a.a(cqkpVar)).t().booleanValue() ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }))));
        cqmpVarArr2[16] = cqmjVar != null ? cqmjVar : cqmp.e;
        cqmpVarArr[7] = cqgr.fY(cqmpVarArr2);
        return cqgr.fY(cqmpVarArr);
    }

    public static cqtv l() {
        return cqsv.d(cqrp.d(4.0d), cqrp.d(12.0d));
    }

    private static cqfc m(boolean z) {
        return new gwt(z);
    }
}
