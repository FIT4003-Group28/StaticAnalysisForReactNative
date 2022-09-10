package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: qph  reason: default package */
/* loaded from: classes7.dex */
public class qph extends acoi implements qng {
    public static final dcqe a = dcqe.c("qph");
    @dzsi
    private acyt C;
    public final Activity b;
    public final ros c;
    public final dxio<qbt> d;
    public final cjqy e;
    public final cjqq f;
    public final qcz g;
    public dcdc<qpf> h;
    @dzsi
    public mw<Boolean> j;
    public int k;
    @dzsi
    public acyu l;
    private final qoq m;
    private final cjqu n;
    private final qco o;
    @dzsi
    private final rjz p;
    private final qpe q;
    private final zuq r;
    private final qnm s;
    private final dcdc<qpf> t;
    private final String u;
    private final qnl y;
    private final boolean z;
    public boolean i = false;
    private int A = 0;
    private int B = 0;
    private final acnw D = new qpa(this);

    /* JADX WARN: Code restructure failed: missing block: B:66:0x02c6, code lost:
        if (r1 != 5) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0303 A[EDGE_INSN: B:105:0x0303->B:86:0x0303 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qph(android.app.Activity r33, defpackage.dxio<defpackage.ahjq> r34, final defpackage.qoq r35, defpackage.ros r36, defpackage.dxio<defpackage.qbt> r37, defpackage.cjqy r38, defpackage.cjqq r39, final defpackage.qpe r40, defpackage.btvo r41, defpackage.acyp r42, @defpackage.dzsi final defpackage.rjz r43, final defpackage.qnm r44, defpackage.qco r45, @defpackage.dzsi android.os.Bundle r46) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qph.<init>(android.app.Activity, dxio, qoq, ros, dxio, cjqy, cjqq, qpe, btvo, acyp, rjz, qnm, qco, android.os.Bundle):void");
    }

    private static qnf x(String str, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, String str2) {
        return new qpc(str, cjtd.a(ddhoVar), ddhoVar2, str2);
    }

    private static qnf y(Context context, int i) {
        return z(context, i, null);
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz jhzVar = new jhz();
        jhzVar.f(new View.OnClickListener(this) { // from class: qos
            private final qph a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.onBackPressed();
            }
        });
        jhzVar.a = this.u;
        jhzVar.g = ibm.b();
        jhzVar.x = false;
        jhm jhmVar = new jhm();
        jhmVar.a = this.b.getText(R.string.MORE_ROUTES_MENU_ITEM);
        jhmVar.d(new View.OnClickListener(this) { // from class: qot
            private final qph a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qph qphVar = this.a;
                qphVar.d.a().m(qphVar.g);
            }
        });
        jhzVar.c(jhmVar.c());
        jhm jhmVar2 = new jhm();
        jhmVar2.a = this.b.getText(R.string.COMMUTE_SETTINGS_MENU_ITEM);
        jhmVar2.d(new View.OnClickListener(this) { // from class: qou
            private final qph a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.e();
            }
        });
        jhzVar.c(jhmVar2.c());
        return jhzVar.b();
    }

    @Override // defpackage.qng
    public Boolean b() {
        boolean z = true;
        if (this.h.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.qng
    public List<qnf> c() {
        return dchl.k(this.h, qov.a);
    }

    @Override // defpackage.qng
    public List<qnb> d() {
        return dchl.k(this.h, qor.a);
    }

    @Override // defpackage.qng
    public Integer e() {
        return Integer.valueOf(this.A);
    }

    @Override // defpackage.qng
    public Integer f() {
        return Integer.valueOf(this.B);
    }

    @Override // defpackage.qng
    public Boolean g() {
        return Boolean.valueOf(this.z);
    }

    @Override // defpackage.qng
    public Boolean h() {
        return Boolean.valueOf(this.i);
    }

    public void i(acyu acyuVar) {
        Z(this.k);
        w();
        Y(this.D);
        dcdc<qpf> dcdcVar = this.h;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).b().r(acyuVar);
        }
        this.h.get(this.k).b().s(this);
        this.l = acyuVar;
        qpd qpdVar = new qpd(this, acyuVar);
        this.C = qpdVar;
        acyuVar.l(qpdVar);
    }

    public void j() {
        this.h.get(this.k).b().v();
    }

    public void k() {
        acyt acytVar;
        qpf s = s();
        if (s != null) {
            s.b().w();
        }
        dcdc<qpf> dcdcVar = this.h;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).b().x();
        }
        acyu acyuVar = this.l;
        if (acyuVar == null || (acytVar = this.C) == null) {
            return;
        }
        acyuVar.m(acytVar);
        this.l = null;
        this.C = null;
    }

    public void l(Bundle bundle) {
        bundle.putInt("commute-board-focused-tab", this.k);
        bundle.putBundle("commute-board-start-params", this.o.j());
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.h.size());
        dcdc<qpf> dcdcVar = this.h;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            qpf qpfVar = dcdcVar.get(i);
            Bundle bundle2 = new Bundle();
            int c = qpfVar.c();
            int i2 = c - 1;
            if (c == 0) {
                throw null;
            }
            bundle2.putInt("tab-type", i2);
            if (qpfVar.c() == 5) {
                bundle2.putString("tab-title", qpfVar.a().a());
            }
            qop b = qpfVar.b();
            bundle2.putInt("tab-source", b.m().ordinal());
            b.k(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("commute-board-tab-data", arrayList);
    }

    public void m(int i) {
        this.A = i;
        cqkx.p(this);
    }

    public void n(int i) {
        this.B = i;
        cqkx.p(this);
    }

    public void o(mw<Boolean> mwVar) {
        this.j = mwVar;
    }

    public zuq p() {
        return this.r;
    }

    public void q() {
        this.q.a = false;
    }

    public final boolean r(int i) {
        return i >= 0 && i < this.h.size();
    }

    @dzsi
    public final qpf s() {
        if (r(this.k)) {
            return this.h.get(this.k);
        }
        return null;
    }

    @Override // defpackage.qne
    public dcdc<zdu> t() {
        return this.h.get(Os().intValue()).b().t();
    }

    @Override // defpackage.qne
    public Boolean u() {
        return false;
    }

    public float v() {
        return ((Float) dcln.a.m(dcbg.b(this.h).s(qow.a).s(qox.a))).floatValue();
    }

    public final void w() {
        qpf s = s();
        ddho c = s == null ? null : s.a().c();
        if (c != null) {
            this.n.a(c);
        }
    }

    private static qnf z(Context context, int i, @dzsi String str) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                throw new IllegalArgumentException("tabType");
            }
            if (i2 == 1) {
                return x(context.getString(R.string.TAB_TITLE_SELECTED_ROUTE), dtyc.ct, dtyc.cs, context.getString(R.string.TAB_TITLE_SELECTED_ROUTE_CONTENT_DESCRIPTION));
            }
            if (i2 == 2) {
                String string = context.getString(R.string.TAB_TITLE_REGULAR_ROUTE);
                return x(string, dtyc.cr, dtyc.cq, string);
            } else if (i2 == 3) {
                String string2 = context.getString(R.string.TAB_TITLE_ROUTE_FROM_HERE);
                return x(string2, dtyc.cp, dtyc.co, string2);
            } else if (i2 == 4) {
                dbsk.s(str);
                return x(str, dtyc.cp, dtyc.co, str);
            } else {
                throw new IllegalArgumentException("tabType");
            }
        }
        throw null;
    }
}
