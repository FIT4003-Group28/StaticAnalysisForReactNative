package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TimePicker;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: bodo  reason: default package */
/* loaded from: classes3.dex */
public final class bodo extends cqiw<boqj> {
    public static final /* synthetic */ int c = 0;
    private static final int d = cqkx.c();
    private static final int e = cqkx.c();
    @dzsi
    public WeakReference<TimePicker> a;
    @dzsi
    public WeakReference<TimePicker> b;
    private final boolean f;

    public bodo(boolean z) {
        super(Boolean.valueOf(z));
        this.f = z;
    }

    protected static final cqmj<boqj> e(final cqlc<boqj, Boolean> cqlcVar, final cqlc<boqj, cqsn> cqlcVar2, final cqlc<boqj, cqsn> cqlcVar3, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2, cqlc<boqj, View.OnClickListener> cqlcVar4, final cqlc<boqj, Boolean> cqlcVar5) {
        return cqgr.gd(cqgr.bL(cqrt.d(R.dimen.padding_dialog_content)), cqgr.bO(cqrt.d(R.dimen.padding_dialog_content)), cqgr.dr(0), cqgr.aJ(8388629), cqgr.gq(cqgr.dU(cqrt.d(R.dimen.padding_dialog_header_top)), cqgr.dB(cqrt.d(R.dimen.padding_dialog_header_bottom)), cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d)), irn.p(), cqgr.x(irn.G()), cqgr.eU(ibm.w()), cqgr.eL(Integer.valueOf((int) R.string.CANCEL_BUTTON)), cqgr.cW(cqgr.q(bocq.a)), iue.b(cjtdVar)), cqgr.gq(cqgr.au(cqlcVar5), cqgr.dU(cqrt.d(R.dimen.padding_dialog_header_top)), cqgr.dB(cqrt.d(R.dimen.padding_dialog_header_bottom)), cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d)), irn.p(), cqgr.eW(new cqlc(cqlcVar5) { // from class: bocr
            private final cqlc a;

            {
                this.a = cqlcVar5;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = bodo.c;
                return ((Boolean) this.a.a((boqj) cqkpVar)).booleanValue() ? ibm.w() : ibm.l();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eM(new cqlc(cqlcVar, cqlcVar2, cqlcVar3) { // from class: bocs
            private final cqlc a;
            private final cqlc b;
            private final cqlc c;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
                this.c = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar6 = this.a;
                cqlc cqlcVar7 = this.b;
                cqlc cqlcVar8 = this.c;
                int i = bodo.c;
                return ((Boolean) cqlcVar6.a((boqj) cqkpVar)).booleanValue() ? ((cqlb) cqlcVar7).a : ((cqlb) cqlcVar8).a;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cW(cqlcVar4), iue.b(cjtdVar2)));
    }

    private static cqrx f(boolean z) {
        return new bodl(z);
    }

    private static cqmj<boqj> h() {
        return j(cqkz.a(cqrt.l(R.string.CLOSED)), bocw.a, bocx.a, bocy.a);
    }

    private static cqmj<boqj> i() {
        return j(cqkz.a(cqrt.l(R.string.OPEN_24_HOURS)), bocz.a, boda.a, bodb.a);
    }

    private static cqmj<boqj> j(cqlc<boqj, cqsn> cqlcVar, cqlc<boqj, Boolean> cqlcVar2, cqlc<boqj, Boolean> cqlcVar3, cqlc<boqj, CompoundButton.OnCheckedChangeListener> cqlcVar4) {
        return cqgr.gd(cqgr.cd(-1), cqgr.dr(1), cqgr.aI(cqlcVar2), iuh.b(new cqmp[0]), cqgr.gd(cqgr.cd(-1), cqgr.z(ibm.h()), cqgr.gq(cqgr.eM(cqlcVar), cqgr.dM(cqrt.d(R.dimen.padding_dialog_content)), cqgr.dO(cqrt.d(R.dimen.padding_dialog_content)), cqgr.dU(cqrt.d(R.dimen.padding_dialog_header_top)), cqgr.dB(cqrt.d(R.dimen.padding_dialog_header_bottom)), cqgr.eU(ibm.c()), cqgr.eN(5), ibq.z()), cjmv.a(cqgr.bp(-2), cqgr.cd(-1), cqgr.bG(cqrp.d(16.0d)), cqgr.aJ(8388629), cqgr.I(cqlcVar3), cqgr.cX(cqlcVar4), cqgr.J(true))));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, boqj boqjVar, Context context, cqiv cqivVar) {
        cqivVar.f(new body(), boqjVar.x());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<boqj> a() {
        cqlc cqlcVar = bobx.a;
        cqrx f = f(true);
        cqrx f2 = f(false);
        cqmm fR = cqgr.fR(new body(), boct.a, new cqmp[0]);
        cqmp[] cqmpVarArr = {cqgr.z(ibm.b()), cqgr.eL(Integer.valueOf((int) R.string.BUSINESS_HOURS_SELECT_DAYS_TITLE)), cqgr.fh(cqrt.d(R.dimen.dialog_title_text)), cqgr.dM(cqrt.d(R.dimen.padding_dialog_content)), cqgr.dO(cqrt.d(R.dimen.padding_dialog_content)), cqgr.dU(cqrt.d(R.dimen.padding_dialog_header_top)), cqgr.dB(cqrt.d(R.dimen.padding_dialog_header_bottom)), cqgr.eU(ibm.c()), cqgr.eN(5), cqgr.fe(cqvh.a(cqgm.d)), ibq.z()};
        Float valueOf = Float.valueOf(1.0f);
        cqmj<boqj> gt = cqgr.gt(cqgr.cd(-1), cqgr.bp(-2), cqjv.f(cqfe.MEASURE_ALL_CHILDREN, cqlcVar), cqgr.o(false), cqjv.j(cqfe.IN_ANIMATION, f), cqjv.j(cqfe.OUT_ANIMATION, f2), cqgr.ad(boci.a), cqgr.gd(cqgr.aT(boqj.a), cqgr.aI(bode.a), cqgr.cd(-1), cqgr.dr(1), cqgr.z(ibm.h()), cqgr.gq(cqmpVarArr), cqgr.gk(cqgr.cd(-1), cqgr.bq(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C()))), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), iuh.b(new cqmp[0]), fR, iuh.b(cqgr.aF(cqjv.x(bodf.a))), e(bodg.a, cqkz.a(cqrt.l(R.string.NEXT_BUTTON)), cqkz.a(cqrt.l(R.string.CONFIRM_BUTTON)), cjtd.a(dtya.d), cjtd.a(dtya.f), cqgr.q(bodh.a), bodi.a))), cqgr.gd(cqgr.aT(boqj.b), cqgr.aI(bodj.a), cqgr.cd(-1), cqgr.dr(1), cqgr.z(ibm.h()), cqgr.gq(cqgr.z(ibm.b()), cqgr.eM(bodk.a), cqgr.fh(cqrt.d(R.dimen.dialog_title_text)), cqgr.dM(cqrt.d(R.dimen.padding_dialog_content)), cqgr.dO(cqrt.d(R.dimen.padding_dialog_content)), cqgr.dU(cqrt.d(R.dimen.padding_dialog_header_top)), cqgr.dB(cqrt.d(R.dimen.padding_dialog_header_bottom)), cqgr.eU(ibm.c()), cqgr.eN(5), cqgr.fe(cqvh.a(cqgm.d)), ibq.z()), i(), h(), iuh.b(cqgr.aF(boby.a)), cqgr.gr(cqgr.aR(Integer.valueOf(e)), cqgr.eh(false), cqgr.bq(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqic.f(bobz.a, new cqmp[0]), cqgr.aF(bocv.a), cqgr.fD(new bodm(this)), cqgr.bn(boca.a), cqgr.W(bocb.a), cqgr.X(bocc.a)), iuh.b(new cqmp[0]), e(bocd.a, cqkz.a(cqrt.l(R.string.NEXT_BUTTON)), cqkz.a(cqrt.l(R.string.CONFIRM_BUTTON)), cjtd.a(dtya.g), cjtd.a(dtya.i), new cqlc(this) { // from class: bocf
            private final bodo a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                final bodo bodoVar = this.a;
                final boqj boqjVar = (boqj) cqkpVar;
                return new View.OnClickListener(bodoVar, boqjVar) { // from class: bodd
                    private final bodo a;
                    private final boqj b;

                    {
                        this.a = bodoVar;
                        this.b = boqjVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bodo bodoVar2 = this.a;
                        boqj boqjVar2 = this.b;
                        WeakReference<TimePicker> weakReference = bodoVar2.b;
                        dbsk.s(weakReference);
                        TimePicker timePicker = weakReference.get();
                        if (timePicker != null) {
                            boqjVar2.J(timePicker.getCurrentHour().intValue(), timePicker.getCurrentMinute().intValue());
                            boqjVar2.p();
                        }
                    }
                };
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, boce.a)), cqgr.gd(cqgr.aT(boqj.c), cqgr.aI(bocg.a), cqgr.cd(-1), cqgr.dr(1), cqgr.z(ibm.h()), cqgr.gq(cqgr.z(ibm.b()), cqgr.eM(boch.a), cqgr.fh(cqrt.d(R.dimen.dialog_title_text)), cqgr.dM(cqrt.d(R.dimen.padding_dialog_content)), cqgr.dO(cqrt.d(R.dimen.padding_dialog_content)), cqgr.dU(cqrt.d(R.dimen.padding_dialog_header_top)), cqgr.dB(cqrt.d(R.dimen.padding_dialog_header_bottom)), cqgr.eU(ibm.c()), cqgr.eN(5), cqgr.fe(cqvh.a(cqgm.d)), ibq.z()), i(), h(), iuh.b(cqgr.aF(bocj.a)), cqgr.gr(cqgr.aR(Integer.valueOf(d)), cqgr.eh(false), cqgr.bq(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqic.f(bock.a, new cqmp[0]), cqgr.aF(bocv.a), cqgr.fD(new bodn(this)), cqgr.bn(bocl.a), cqgr.W(bocm.a), cqgr.X(bocn.a)), iuh.b(new cqmp[0]), e(cqkz.a(false), cqkz.a(cqrt.l(R.string.CONFIRM_BUTTON)), cqkz.a(cqrt.l(R.string.CONFIRM_BUTTON)), cjtd.a(dtya.a), cjtd.a(dtya.b), new cqlc(this) { // from class: bocp
            private final bodo a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                final bodo bodoVar = this.a;
                final boqj boqjVar = (boqj) cqkpVar;
                return new View.OnClickListener(bodoVar, boqjVar) { // from class: bodc
                    private final bodo a;
                    private final boqj b;

                    {
                        this.a = bodoVar;
                        this.b = boqjVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bodo bodoVar2 = this.a;
                        boqj boqjVar2 = this.b;
                        WeakReference<TimePicker> weakReference = bodoVar2.a;
                        dbsk.s(weakReference);
                        TimePicker timePicker = weakReference.get();
                        if (timePicker != null) {
                            boqjVar2.P(timePicker.getCurrentHour().intValue(), timePicker.getCurrentMinute().intValue());
                            boqjVar2.p();
                        }
                    }
                };
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, boco.a)));
        if (this.f) {
            return gt;
        }
        gt.g(cqgr.bw(17));
        return cqgr.fY(cqgr.fY(cqgr.ce(cqsv.f(330.0d, 500.0d, 330.0d, 500.0d)), cqgr.bq(cqrp.d(-2.0d)), cqgr.bw(17), gt));
    }
}
