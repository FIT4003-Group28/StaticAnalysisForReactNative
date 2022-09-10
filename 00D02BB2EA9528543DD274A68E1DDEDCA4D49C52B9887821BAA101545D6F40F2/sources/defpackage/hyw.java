package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: hyw  reason: default package */
/* loaded from: classes.dex */
public final class hyw {
    static final cqkv a = new hza(cqlg.a);
    static final View.AccessibilityDelegate b = new hyv();
    public static final /* synthetic */ int c = 0;

    public static <T extends cqkp> cqmj<T> A() {
        return new cqmh(hyx.class, new cqmp[0]);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> B(cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(new cqmp[0]);
        ArrayList arrayList = new ArrayList();
        cqmj cqmjVar = null;
        for (cqmp<T> cqmpVar : cqmpVarArr) {
            if (cqmpVar instanceof cqmj) {
                cqmj cqmjVar2 = (cqmj) cqmpVar;
                if (cqmjVar != null) {
                    arrayList.add(A());
                }
                arrayList.add(cqmjVar2);
                cqmjVar = cqmjVar2;
            } else {
                arrayList.add(cqmpVar);
            }
        }
        gd.e(arrayList);
        return gd;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> C(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.chip_input_internal, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> D(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.chip_assistive_internal, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> E(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.chip_assistive_protected_internal, cqmpVarArr);
    }

    public static cqss F() {
        ArrayList arrayList = new ArrayList(3);
        cqsr.b(ibm.u(), new int[]{16842912}, arrayList);
        cqsr.b(ibm.u(), new int[]{16842910, 16842913}, arrayList);
        cqsr.b(iva.b(ibl.b(), ibl.a()), new int[]{16842910}, arrayList);
        cqsr.b(ibl.h(), new int[0], arrayList);
        return cqsr.a(arrayList);
    }

    public static cqss G() {
        ArrayList arrayList = new ArrayList(3);
        cqsr.b(ibm.u(), new int[]{16842912}, arrayList);
        cqsr.b(ibm.u(), new int[]{16842910, 16842913}, arrayList);
        cqsr.b(ibm.b(), new int[]{16842910}, arrayList);
        cqsr.b(ibl.h(), new int[0], arrayList);
        return cqsr.a(arrayList);
    }

    public static cqss H() {
        ArrayList arrayList = new ArrayList(3);
        cqsr.b(iva.b(ibl.C(), ibl.K()), new int[]{16842912}, arrayList);
        cqsr.b(iva.b(ibl.C(), ibl.K()), new int[]{16842910, 16842913}, arrayList);
        cqsr.b(ibm.j(), new int[0], arrayList);
        return cqsr.a(arrayList);
    }

    public static cqss I() {
        ArrayList arrayList = new ArrayList(3);
        cqsr.b(ibm.y(), new int[]{16842912}, arrayList);
        cqsr.b(ibm.y(), new int[]{16842910, 16842913}, arrayList);
        cqsr.b(ibm.p(), new int[]{16842910}, arrayList);
        cqsr.b(ibm.q(), new int[0], arrayList);
        return cqsr.a(arrayList);
    }

    public static <T extends cqkp> cqmn<T> J() {
        return cqmn.a(W(Integer.valueOf((int) R.style.gmm_chip_text_appearance)), cqgr.eU(I()));
    }

    public static <T extends cqkp> cqmn<T> K() {
        return cqmn.a(W(Integer.valueOf((int) R.style.gmm_chip_text_appearance)), cqgr.eU(ibm.b()));
    }

    public static <T extends cqkp> cqmn<T> L() {
        return cqmn.a(W(Integer.valueOf((int) R.style.gmm_chip_text_appearance)), cqgr.eU(ibm.n()));
    }

    public static <T extends cqkp> cqmn<T> M() {
        return cqmn.a(ibq.p(), cqgr.eU(I()));
    }

    public static <T extends cqkp> cqnf<T> N(@dzsi cqss cqssVar) {
        return cqjv.i(hyz.CHIP_BACKGROUND_COLOR, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> O(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(hyz.CHIP_BACKGROUND_COLOR, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> P(@dzsi cqss cqssVar) {
        return cqjv.i(hyz.CHIP_STROKE_COLOR, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> Q(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(hyz.CHIP_STROKE_COLOR, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> R(cqtv cqtvVar) {
        return cqjv.i(hyz.CHIP_STROKE_WIDTH, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> S(cqlc<T, cqtv> cqlcVar) {
        return cqjv.g(hyz.CHIP_STROKE_WIDTH, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> T(@dzsi CharSequence charSequence) {
        return cqjv.i(hyz.CHIP_TEXT, charSequence, a);
    }

    public static <T extends cqkp> cqnf<T> U(Integer num) {
        return cqjv.i(hyz.CHIP_TEXT_RESOURCE, num, a);
    }

    public static <T extends cqkp> cqnf<T> V(cqlc<T, ?> cqlcVar) {
        return cqjv.g(hyz.CHIP_TEXT, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> W(Integer num) {
        return cqjv.i(hyz.TEXT_APPEARANCE_RESOURCE, num, a);
    }

    public static <T extends cqkp> cqnf<T> X(cqtv cqtvVar) {
        return cqjv.i(hyz.TEXT_START_PADDING, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> Y(cqtv cqtvVar) {
        return cqjv.i(hyz.TEXT_END_PADDING, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> Z(@dzsi cqtd cqtdVar) {
        return cqjv.i(hyz.CHIP_ICON, cqtdVar, a);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqlc<T, cqtd> cqlcVar, cqlc<T, ?> cqlcVar2, cqlc<T, View.OnClickListener> cqlcVar3, cqlc<T, cjtd> cqlcVar4, cqmp<T>... cqmpVarArr) {
        return b(cqlcVar, cqlcVar2, cqlcVar3, cqkz.a(false), cqlcVar2, cqlcVar4, cqmpVarArr);
    }

    @SafeVarargs
    @Deprecated
    private static <T extends cqkp> cqmj<T> aA(cqmj<T> cqmjVar, @dzsi cqkl cqklVar, @dzsi cjtd cjtdVar, cqmp<T>... cqmpVarArr) {
        cqmp[] cqmpVarArr2 = new cqmp[9];
        boolean z = false;
        cqmpVarArr2[0] = cqgr.cH(cqrp.d(48.0d));
        cqmpVarArr2[1] = cqgr.cL(cqrp.d(48.0d));
        cqmpVarArr2[2] = cqgr.cd(-2);
        cqmpVarArr2[3] = cqgr.bp(-2);
        cqmpVarArr2[4] = cqgr.cU(cqklVar);
        if (cqklVar != null) {
            z = true;
        }
        cqmpVarArr2[5] = cqgr.J(Boolean.valueOf(z));
        cqmpVarArr2[6] = iue.b(cjtdVar);
        cqmpVarArr2[7] = cqgr.a(b);
        cqmpVarArr2[8] = cqmjVar;
        cqmj<T> fY = cqgr.fY(cqmpVarArr2);
        fY.f(cqmpVarArr);
        return fY;
    }

    @SafeVarargs
    @Deprecated
    private static <T extends cqkp> cqmj<T> aB(cqmj<T> cqmjVar, final cqlc<T, View.OnClickListener> cqlcVar, cqlc<T, cjtd> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.cH(cqrp.d(48.0d)), cqgr.cL(cqrp.d(48.0d)), cqgr.cd(-2), cqgr.bp(-2), cqgr.cW(cqlcVar), cqgr.K(new cqlc(cqlcVar) { // from class: hyp
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                int i = hyw.c;
                return Boolean.valueOf(!cqjv.v((View.OnClickListener) cqlcVar3.a(cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), iue.c(cqlcVar2), cqgr.a(b), cqmjVar);
        fY.f(cqmpVarArr);
        return fY;
    }

    @SafeVarargs
    private static <T extends cqkp> cqmj<T> aC(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.chip_assistive_for_filled_blue_internal, cqmpVarArr);
    }

    @SafeVarargs
    private static <T extends cqkp> void aD(cqmj<T> cqmjVar, final cqlc<T, cqtd> cqlcVar, final cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, final cqlc<T, cqss> cqlcVar4, final cqlc<T, cqss> cqlcVar5, final cqlc<T, Boolean> cqlcVar6, cqlc<T, Boolean> cqlcVar7, cqmp<T>... cqmpVarArr) {
        cqmjVar.f(ax(cqkz.a(true)), cqgr.cd(-2), cqgr.bp(-2), ag(cqrp.d(20.0d)), ad(cqrp.d(8.0d)), an(cqrp.d(36.0d)), ae(cqrp.d(18.0d)), aq(new cqlc(cqlcVar) { // from class: hyu
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar8 = this.a;
                int i = hyw.c;
                return cqrp.d(cqlcVar8.a(cqkpVar) == null ? 16.0d : 12.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), X(cqrp.d(dcyn.a)), Y(cqrp.d(dcyn.a)), ar(cqrp.d(16.0d)), cqgr.eU(I()), O(new cqlc(cqlcVar4) { // from class: hyi
            private final cqlc a;

            {
                this.a = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar8 = this.a;
                int i = hyw.c;
                if (cqlcVar8.a(cqkpVar) == null) {
                    return hyw.F();
                }
                return (cqss) cqlcVar8.a(cqkpVar);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), Q(new cqlc(cqlcVar5) { // from class: hyj
            private final cqlc a;

            {
                this.a = cqlcVar5;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar8 = this.a;
                int i = hyw.c;
                return cqlcVar8.a(cqkpVar) == null ? hyw.H() : (cqss) cqlcVar8.a(cqkpVar);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), S(new cqlc(cqlcVar6) { // from class: hyk
            private final cqlc a;

            {
                this.a = cqlcVar6;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar8 = this.a;
                int i = hyw.c;
                return cqrp.d(((Boolean) cqlcVar8.a(cqkpVar)).booleanValue() ? 1.0d : dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.es(cqlcVar7), aa(cqlcVar), iue.c(cqlcVar3), cqgr.cW(cqlcVar2), cqgr.K(new cqlc(cqlcVar2) { // from class: hyl
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar8 = this.a;
                int i = hyw.c;
                return Boolean.valueOf(!cqjv.v((View.OnClickListener) cqlcVar8.a(cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.as(cqkz.a(TextUtils.TruncateAt.END)));
        cqmjVar.f(cqmpVarArr);
    }

    @SafeVarargs
    private static <T extends cqkp> void aE(cqmj<T> cqmjVar, @dzsi cqtd cqtdVar, @dzsi cqkl cqklVar, @dzsi cjtd cjtdVar, @dzsi cqss cqssVar, @dzsi cqss cqssVar2, Boolean bool, Boolean bool2, cqmp<T>... cqmpVarArr) {
        cqmp<T>[] cqmpVarArr2 = new cqmp[21];
        boolean z = true;
        cqmpVarArr2[0] = aw(true);
        cqmpVarArr2[1] = cqgr.cd(-2);
        cqmpVarArr2[2] = cqgr.bp(-2);
        cqmpVarArr2[3] = ag(cqrp.d(20.0d));
        cqmpVarArr2[4] = ad(cqrp.d(8.0d));
        cqmpVarArr2[5] = an(cqrp.d(36.0d));
        cqmpVarArr2[6] = ae(cqrp.d(18.0d));
        cqmpVarArr2[7] = cqjv.k(cqjv.v(cqtdVar), ap(cqrp.d(16.0d)), ap(cqrp.d(12.0d)));
        cqmpVarArr2[8] = X(cqrp.d(dcyn.a));
        cqmpVarArr2[9] = Y(cqrp.d(dcyn.a));
        cqmpVarArr2[10] = ar(cqrp.d(16.0d));
        cqmpVarArr2[11] = cqgr.eU(I());
        cqmpVarArr2[12] = cqjv.k(cqjv.v(cqssVar), N(F()), N(cqssVar));
        cqmpVarArr2[13] = cqjv.k(cqjv.v(cqssVar2), P(H()), P(cqssVar2));
        cqmpVarArr2[14] = cqjv.k(bool, R(cqrp.d(1.0d)), R(cqrp.d(dcyn.a)));
        cqmpVarArr2[15] = cqgr.er(bool2);
        cqmpVarArr2[16] = Z(cqtdVar);
        cqmpVarArr2[17] = iue.b(cjtdVar);
        cqmpVarArr2[18] = cqgr.cU(cqklVar);
        if (cqklVar == null) {
            z = false;
        }
        cqmpVarArr2[19] = cqgr.J(Boolean.valueOf(z));
        cqmpVarArr2[20] = cqgr.ar(TextUtils.TruncateAt.END);
        cqmjVar.f(cqmpVarArr2);
        cqmjVar.f(cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> aa(cqlc<T, cqtd> cqlcVar) {
        return cqjv.g(hyz.CHIP_ICON, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> ab(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(hyz.CHIP_ICON_TINT, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> ac(cqtv cqtvVar) {
        return cqjv.i(hyz.ICON_START_PADDING, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> ad(cqtv cqtvVar) {
        return cqjv.i(hyz.ICON_END_PADDING, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> ae(cqtv cqtvVar) {
        return cqjv.i(hyz.CHIP_CORNER_RADIUS, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> af(cqss cqssVar) {
        return cqjv.i(hyz.RIPPLE_COLOR, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> ag(cqtv cqtvVar) {
        return cqjv.i(hyz.CHIP_ICON_SIZE, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> ah(Boolean bool) {
        return cqjv.i(hyz.CLOSE_ICON_ENABLED, bool, a);
    }

    public static <T extends cqkp> cqnf<T> ai(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(hyz.CLOSE_ICON_ENABLED, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> aj(@dzsi cqtd cqtdVar) {
        return cqjv.i(hyz.CLOSE_ICON, cqtdVar, a);
    }

    public static <T extends cqkp> cqnf<T> ak(cqlc<T, cqtd> cqlcVar) {
        return cqjv.g(hyz.CLOSE_ICON, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> al(cqtv cqtvVar) {
        return cqjv.i(hyz.CLOSE_ICON_SIZE, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> am(cqlc<T, View.OnClickListener> cqlcVar) {
        return cqjv.g(hyz.ON_CLOSE_ICON_CLICK_LISTENER, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> an(cqtv cqtvVar) {
        return cqjv.i(hyz.CHIP_MIN_HEIGHT, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> ao(cqlc<T, cqtv> cqlcVar) {
        return cqjv.g(hyz.CHIP_MIN_HEIGHT, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> ap(cqtv cqtvVar) {
        return cqjv.i(hyz.CHIP_START_PADDING, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> aq(cqlc<T, cqtv> cqlcVar) {
        return cqjv.g(hyz.CHIP_START_PADDING, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> ar(cqtv cqtvVar) {
        return cqjv.i(hyz.CHIP_END_PADDING, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> as(cqlc<T, cqtv> cqlcVar) {
        return cqjv.g(hyz.CHIP_END_PADDING, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> at(Boolean bool) {
        return cqjv.i(hyz.CHECKED_ICON_ENABLED, bool, a);
    }

    public static <T extends cqkp> cqnf<T> au(Boolean bool) {
        return cqjv.i(hyz.CHECKABLE, bool, a);
    }

    public static <T extends cqkp> cqnf<T> av(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(hyz.CHECKABLE, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> aw(Boolean bool) {
        return cqjv.i(hyz.ENSURE_MIN_TOUCH_TARGET_SIZE, bool, a);
    }

    public static <T extends cqkp> cqnf<T> ax(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(hyz.ENSURE_MIN_TOUCH_TARGET_SIZE, cqlcVar, a);
    }

    @SafeVarargs
    private static <T extends cqkp> cqmj<T> ay(final cqlc<T, cqtd> cqlcVar, final cqlc<T, cqtd> cqlcVar2, cqlc<T, ?> cqlcVar3, cqlc<T, View.OnClickListener> cqlcVar4, cqlc<T, Boolean> cqlcVar5, cqlc<T, ?> cqlcVar6, cqlc<T, cjtd> cqlcVar7, cqmp<T>... cqmpVarArr) {
        cqmj<T> C = C(ax(cqkz.a(true)), iue.c(cqlcVar7), cqgr.cd(-2), cqgr.bp(-2), ag(cqrp.d(20.0d)), ad(cqrp.d(4.0d)), al(cqrp.d(20.0d)), cqjv.i(hyz.CLOSE_ICON_START_PADDING, cqrp.d(4.0d), a), an(cqrp.d(32.0d)), ae(cqrp.d(16.0d)), aq(new cqlc(cqlcVar) { // from class: hyn
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar8 = this.a;
                int i = hyw.c;
                return cqrp.d(cqlcVar8.a(cqkpVar) == null ? 12.0d : 8.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), as(new cqlc(cqlcVar2) { // from class: hyo
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar8 = this.a;
                int i = hyw.c;
                return cqrp.d(cqlcVar8.a(cqkpVar) == null ? 12.0d : 8.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), X(cqrp.d(dcyn.a)), Y(cqrp.d(dcyn.a)), N(F()), P(H()), R(cqrp.d(1.0d)), cqgr.es(cqlcVar5), av(cqkz.a(false)), aa(cqlcVar), ak(cqlcVar2), am(cqlcVar4), cqgr.V(cqlcVar6), cqgr.eM(cqlcVar3), M());
        C.f(cqmpVarArr);
        return C;
    }

    @SafeVarargs
    private static <T extends cqkp> cqmj<T> az(cqlc<T, cqtd> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, Boolean> cqlcVar3, cqlc<T, Boolean> cqlcVar4, cqlc<T, cjtd> cqlcVar5, cqlc<T, ?> cqlcVar6, cqmp<T>... cqmpVarArr) {
        cqmj<T> aB = aB(u(cqlcVar, cqkz.a(null), cqkz.a(null), cqkz.a(true), cqlcVar3, cqgr.V(cqlcVar6), r(), av(cqlcVar4), cqgr.I(cqlcVar3)), cqlcVar2, cqlcVar5, cqmpVarArr);
        aB.f(itj.f(Integer.valueOf((int) R.id.circular_chip)));
        return aB;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, cqtd> cqlcVar, cqlc<T, ?> cqlcVar2, cqlc<T, View.OnClickListener> cqlcVar3, cqlc<T, Boolean> cqlcVar4, cqlc<T, ?> cqlcVar5, cqlc<T, cjtd> cqlcVar6, cqmp<T>... cqmpVarArr) {
        return aB(u(cqlcVar, cqkz.a(null), cqkz.a(null), cqkz.a(true), cqlcVar4, cqgr.eM(cqlcVar2), cqgr.V(cqlcVar5), J()), cqlcVar3, cqlcVar6, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(@dzsi cqtd cqtdVar, CharSequence charSequence, @dzsi cqkl cqklVar, @dzsi CharSequence charSequence2, @dzsi cjtd cjtdVar, cqmp<T>... cqmpVarArr) {
        cqjb b2 = cqne.b(charSequence);
        cqjb b3 = cqne.b(charSequence2);
        cqmj<T> aC = aC(new cqmp[0]);
        aE(aC, cqtdVar, cqklVar, cjtdVar, ibm.x(), null, false, false, cqgr.eK(b2), cqgr.U(b3), K());
        aC.f(cqmpVarArr);
        return aC;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqlc<T, cqtd> cqlcVar, cqlc<T, ?> cqlcVar2, cqlc<T, View.OnClickListener> cqlcVar3, cqlc<T, ?> cqlcVar4, cqlc<T, cjtd> cqlcVar5, cqmp<T>... cqmpVarArr) {
        cqmj<T> aC = aC(new cqmp[0]);
        aD(aC, cqlcVar, cqlcVar3, cqlcVar5, cqkz.a(ibm.x()), cqkz.a(null), cqkz.a(false), cqkz.a(false), cqgr.eM(cqlcVar2), cqgr.V(cqlcVar4), K());
        aC.f(cqmpVarArr);
        return aC;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqlc<T, cqtd> cqlcVar, cqlc<T, ?> cqlcVar2, cqlc<T, View.OnClickListener> cqlcVar3, cqjb<T, ? extends CharSequence> cqjbVar, cqlc<T, cjtd> cqlcVar4, cqmp<T>... cqmpVarArr) {
        cqmj<T> aC = aC(new cqmp[0]);
        aD(aC, cqlcVar, cqlcVar3, cqlcVar4, cqkz.a(ibm.x()), cqkz.a(null), cqkz.a(false), cqkz.a(false), cqgr.eM(cqlcVar2), cqgr.U(cqjbVar), K());
        aC.f(cqmpVarArr);
        return aC;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(@dzsi cqtd cqtdVar, CharSequence charSequence, @dzsi cqkl cqklVar, @dzsi CharSequence charSequence2, @dzsi cjtd cjtdVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> E = E(new cqmp[0]);
        aE(E, cqtdVar, cqklVar, cjtdVar, null, null, false, false, cqgr.eI(charSequence), cqgr.R(charSequence2), J());
        E.f(cqmpVarArr);
        return E;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> g(cqlc<T, cqtd> cqlcVar, cqlc<T, ?> cqlcVar2, cqlc<T, View.OnClickListener> cqlcVar3, cqlc<T, ?> cqlcVar4, cqlc<T, cjtd> cqlcVar5, cqmp<T>... cqmpVarArr) {
        cqmj<T> E = E(new cqmp[0]);
        aD(E, cqlcVar, cqlcVar3, cqlcVar5, cqkz.a(null), cqkz.a(null), cqkz.a(false), cqkz.a(false), cqgr.eM(cqlcVar2), cqgr.V(cqlcVar4), J());
        E.f(cqmpVarArr);
        return E;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> h(CharSequence charSequence, @dzsi cqkl cqklVar, @dzsi cjtd cjtdVar, cqmp<T>... cqmpVarArr) {
        cqmp[] cqmpVarArr2 = new cqmp[23];
        boolean z = true;
        cqmpVarArr2[0] = aw(true);
        cqmpVarArr2[1] = cqgr.cd(-2);
        cqmpVarArr2[2] = cqgr.bp(-2);
        cqmpVarArr2[3] = cqgr.bw(8388611);
        cqmpVarArr2[4] = ag(cqrp.d(20.0d));
        cqmpVarArr2[5] = ad(cqrp.d(8.0d));
        cqmpVarArr2[6] = an(cqrp.d(36.0d));
        cqmpVarArr2[7] = ae(cqrp.d(18.0d));
        cqmpVarArr2[8] = ap(cqrp.d(16.0d));
        cqmpVarArr2[9] = ar(cqrp.d(16.0d));
        cqmpVarArr2[10] = X(cqrp.d(dcyn.a));
        cqmpVarArr2[11] = Y(cqrp.d(dcyn.a));
        cqmpVarArr2[12] = N(F());
        cqmpVarArr2[13] = P(H());
        cqmpVarArr2[14] = R(cqrp.d(1.0d));
        cqmpVarArr2[15] = cqgr.er(false);
        cqmpVarArr2[16] = Z(null);
        if (cqklVar == null) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        cqmpVarArr2[17] = cqgr.az(valueOf);
        cqmpVarArr2[18] = cqgr.cU(cqklVar);
        cqmpVarArr2[19] = cqgr.J(valueOf);
        cqmpVarArr2[20] = iue.b(cjtdVar);
        cqmpVarArr2[21] = cqgr.eI(charSequence);
        cqmpVarArr2[22] = L();
        cqmj<T> D = D(cqmpVarArr2);
        D.f(cqmpVarArr);
        return D;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> i(cqlc<T, ?> cqlcVar, final cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqmp<T>... cqmpVarArr) {
        cqmj<T> D = D(ax(cqkz.a(true)), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388611), ag(cqrp.d(20.0d)), ad(cqrp.d(8.0d)), an(cqrp.d(36.0d)), ae(cqrp.d(18.0d)), ap(cqrp.d(16.0d)), ar(cqrp.d(16.0d)), X(cqrp.d(dcyn.a)), Y(cqrp.d(dcyn.a)), N(F()), P(H()), R(cqrp.d(1.0d)), cqgr.es(cqkz.a(false)), Z(null), cqgr.aA(new cqlc(cqlcVar2) { // from class: hyh
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                int i = hyw.c;
                return Boolean.valueOf(!cqjv.v((View.OnClickListener) cqlcVar4.a(cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cW(cqlcVar2), cqgr.K(new cqlc(cqlcVar2) { // from class: hym
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                int i = hyw.c;
                return Boolean.valueOf(!cqjv.v((View.OnClickListener) cqlcVar4.a(cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), iue.c(cqlcVar3), cqgr.eM(cqlcVar), L());
        D.f(cqmpVarArr);
        return D;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> j(cqlc<T, cqtd> cqlcVar, cqlc<T, cqtd> cqlcVar2, cqlc<T, ?> cqlcVar3, cqlc<T, cqkn<T>> cqlcVar4, cqlc<T, View.OnClickListener> cqlcVar5, cqlc<T, Boolean> cqlcVar6, cqlc<T, ?> cqlcVar7, cqlc<T, cjtd> cqlcVar8, cqmp<T>... cqmpVarArr) {
        return ay(cqlcVar, cqlcVar2, cqlcVar3, cqlcVar5, cqlcVar6, cqlcVar7, cqlcVar8, (cqmp[]) dclq.c(cqgr.cW(cqlcVar4), cqmpVarArr));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> k(cqlc<T, cqtd> cqlcVar, cqlc<T, cqtd> cqlcVar2, cqlc<T, ?> cqlcVar3, cqlc<T, View.OnClickListener> cqlcVar4, cqlc<T, Boolean> cqlcVar5, cqlc<T, ?> cqlcVar6, cqlc<T, cjtd> cqlcVar7, cqmp<T>... cqmpVarArr) {
        return ay(cqlcVar, cqlcVar2, cqlcVar3, cqlcVar4, cqlcVar5, cqlcVar6, cqlcVar7, (cqmp[]) dclq.c(cqgr.cW(cqlcVar4), cqmpVarArr));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> l(cqtd cqtdVar, @dzsi cqkl cqklVar, @dzsi cjtd cjtdVar, @dzsi CharSequence charSequence, cqmp<T>... cqmpVarArr) {
        cqmj<T> aA = aA(t(cqtdVar, null, null, true, false, cqgr.R(charSequence), r(), au(false), cqgr.H(false)), cqklVar, cjtdVar, cqmpVarArr);
        aA.f(itj.f(Integer.valueOf((int) R.id.circular_chip)));
        return aA;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> m(cqlc<T, cqtd> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqlc<T, ?> cqlcVar4, cqmp<T>... cqmpVarArr) {
        return az(cqlcVar, cqlcVar2, cqkz.a(false), cqkz.a(false), cqlcVar3, cqlcVar4, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> n(cqtd cqtdVar, @dzsi cqkl cqklVar, @dzsi cjtd cjtdVar, @dzsi CharSequence charSequence, @dzsi cqss cqssVar, @dzsi cqss cqssVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> aA = aA(t(cqtdVar, cqssVar, cqssVar2, true, false, cqgr.R(charSequence), r(), au(false), cqgr.H(false)), cqklVar, cjtdVar, cqmpVarArr);
        aA.f(itj.f(Integer.valueOf((int) R.id.circular_chip)));
        return aA;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> o(cqlc<T, cqtd> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqlc<T, ?> cqlcVar4, cqlc<T, cqss> cqlcVar5, cqlc<T, cqss> cqlcVar6, cqmp<T>... cqmpVarArr) {
        cqlc a2 = cqkz.a(false);
        cqmj<T> aB = aB(u(cqlcVar, cqlcVar5, cqlcVar6, cqkz.a(true), a2, cqgr.V(cqlcVar4), r(), av(cqkz.a(false)), cqgr.I(a2)), cqlcVar2, cqlcVar3, cqmpVarArr);
        aB.f(itj.f(Integer.valueOf((int) R.id.circular_chip)));
        return aB;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> p(cqlc<T, cqtd> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, Boolean> cqlcVar3, cqlc<T, cjtd> cqlcVar4, cqlc<T, ?> cqlcVar5, cqmp<T>... cqmpVarArr) {
        return az(cqlcVar, cqlcVar2, cqlcVar3, cqkz.a(false), cqlcVar4, cqlcVar5, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> q(cqlc<T, cqtd> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, Boolean> cqlcVar3, cqlc<T, cjtd> cqlcVar4, cqlc<T, ?> cqlcVar5, cqmp<T>... cqmpVarArr) {
        return az(cqlcVar, cqlcVar2, cqlcVar3, cqkz.a(true), cqlcVar4, cqlcVar5, cqmpVarArr);
    }

    public static <T extends cqkp> cqmn<T> r() {
        return cqmn.a(ap(cqrp.d(8.0d)), ar(cqrp.d(8.0d)), ad(cqrp.d(dcyn.a)), cqgr.cd(-2), cqgr.cL(cqrp.d(36.0d)), cqgr.cH(cqrp.d(36.0d)), cqgr.eI(""));
    }

    public static <T extends cqkp> cqmn<T> s() {
        return cqmn.a(ap(cqrp.d(6.0d)), ar(cqrp.d(6.0d)), ad(cqrp.d(dcyn.a)), cqgr.cd(-2), an(cqrp.d(32.0d)), cqgr.cL(cqrp.d(32.0d)), cqgr.cH(cqrp.d(32.0d)), ae(cqrp.d(16.0d)), cqgr.eI(""));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> t(@dzsi cqtd cqtdVar, @dzsi cqss cqssVar, @dzsi cqss cqssVar2, Boolean bool, Boolean bool2, cqmp<T>... cqmpVarArr) {
        cqmj<T> D = D(new cqmp[0]);
        D.f(cqgr.cd(-1), cqgr.bp(-2), cqgr.cL(cqrp.d(36.0d)), cqgr.cH(cqrp.d(36.0d)), cqgr.bw(17), ag(cqrp.d(20.0d)), ad(cqrp.d(8.0d)), an(cqrp.d(36.0d)), ae(cqrp.d(18.0d)), cqjv.k(cqjv.v(cqtdVar), ap(cqrp.d(16.0d)), ap(cqrp.d(12.0d))), X(cqrp.d(dcyn.a)), Y(cqrp.d(dcyn.a)), ar(cqrp.d(16.0d)), cqjv.k(cqjv.v(cqssVar), N(F()), N(cqssVar)), cqjv.k(cqjv.v(cqssVar2), P(H()), P(cqssVar2)), cqjv.k(bool, R(cqrp.d(1.0d)), R(cqrp.d(dcyn.a))), cqgr.er(bool2), Z(cqtdVar), cqgr.az(false), cqgr.J(false), cqgr.ar(TextUtils.TruncateAt.END));
        D.f(cqmpVarArr);
        return D;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> u(final cqlc<T, cqtd> cqlcVar, final cqlc<T, cqss> cqlcVar2, final cqlc<T, cqss> cqlcVar3, final cqlc<T, Boolean> cqlcVar4, cqlc<T, Boolean> cqlcVar5, cqmp<T>... cqmpVarArr) {
        cqmj<T> D = D(new cqmp[0]);
        D.f(cqgr.cd(-1), cqgr.bp(-2), cqgr.cL(cqrp.d(36.0d)), cqgr.cH(cqrp.d(36.0d)), cqgr.bw(17), ag(cqrp.d(20.0d)), ad(cqrp.d(8.0d)), an(cqrp.d(36.0d)), ae(cqrp.d(18.0d)), aq(new cqlc(cqlcVar) { // from class: hyq
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar6 = this.a;
                int i = hyw.c;
                return cqrp.d(cqlcVar6.a(cqkpVar) == null ? 16.0d : 12.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), X(cqrp.d(dcyn.a)), Y(cqrp.d(dcyn.a)), ar(cqrp.d(16.0d)), O(new cqlc(cqlcVar2) { // from class: hyr
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar6 = this.a;
                int i = hyw.c;
                if (cqlcVar6.a(cqkpVar) == null) {
                    return hyw.F();
                }
                return (cqss) cqlcVar6.a(cqkpVar);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), Q(new cqlc(cqlcVar3) { // from class: hys
            private final cqlc a;

            {
                this.a = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar6 = this.a;
                int i = hyw.c;
                return cqlcVar6.a(cqkpVar) == null ? hyw.H() : (cqss) cqlcVar6.a(cqkpVar);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), S(new cqlc(cqlcVar4) { // from class: hyt
            private final cqlc a;

            {
                this.a = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar6 = this.a;
                int i = hyw.c;
                return cqrp.d(((Boolean) cqlcVar6.a(cqkpVar)).booleanValue() ? 1.0d : dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.es(cqlcVar5), aa(cqlcVar), cqgr.aA(cqkz.a(false)), cqgr.K(cqkz.a(false)), cqgr.as(cqkz.a(TextUtils.TruncateAt.END)));
        D.f(cqmpVarArr);
        return D;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> v(@dzsi cqtd cqtdVar, @dzsi cqkl cqklVar, @dzsi cjtd cjtdVar, @dzsi cqss cqssVar, @dzsi cqss cqssVar2, Boolean bool, Boolean bool2, cqmp<T>... cqmpVarArr) {
        cqmj<T> D = D(new cqmp[0]);
        aE(D, cqtdVar, cqklVar, cjtdVar, cqssVar, cqssVar2, bool, bool2, cqmpVarArr);
        return D;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> w(cqlc<T, cqtd> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqlc<T, cqss> cqlcVar4, cqlc<T, cqss> cqlcVar5, cqlc<T, Boolean> cqlcVar6, cqlc<T, Boolean> cqlcVar7, cqmp<T>... cqmpVarArr) {
        cqmj<T> D = D(new cqmp[0]);
        aD(D, cqlcVar, cqlcVar2, cqlcVar3, cqlcVar4, cqlcVar5, cqlcVar6, cqlcVar7, cqmpVarArr);
        return D;
    }

    public static <V extends cqkp> void x(cqiv cqivVar, V v, cqiw<V> cqiwVar) {
        if (cqivVar.i() > 0) {
            cqivVar.c(new hyy());
        }
        cqivVar.a(cqiwVar, v);
    }

    public static <T extends cqkp> cqmj<T> y() {
        return cqgr.gm(cqgr.ce(cqrp.d(8.0d)));
    }

    public static <T extends cqkp> cqmj<T> z() {
        return cqgr.gm(cqgr.ce(cqrp.d(2.0d)));
    }
}
