package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.ViewTreeObserver;
import com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel;
import com.google.android.libraries.abuse.reporting.ReportAbuseComponentState;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cplo  reason: default package */
/* loaded from: classes5.dex */
public final class cplo implements cplj {
    final cpln a;
    public final cplw b;
    public final ReportAbuseComponentState c;
    private final gn f;
    private final AtomicBoolean e = new AtomicBoolean(true);
    public final Handler d = new Handler();

    /* JADX WARN: Multi-variable type inference failed */
    public cplo(Context context, gn gnVar, ReportAbuseComponentState reportAbuseComponentState) {
        this.a = context;
        this.f = gnVar;
        this.c = reportAbuseComponentState;
        cplw cplwVar = new cplw();
        this.b = cplwVar;
        String a = reportAbuseComponentState.a(1);
        String a2 = reportAbuseComponentState.a(3);
        cplwVar.a = a;
        cplwVar.b = a2;
        ckd c = reportAbuseComponentState.c("finish_reporting");
        String a3 = reportAbuseComponentState.a(19);
        String a4 = reportAbuseComponentState.a(5);
        String str = c.e;
        String a5 = reportAbuseComponentState.a(4);
        String a6 = reportAbuseComponentState.a(2);
        String a7 = reportAbuseComponentState.a(15);
        cplwVar.e = a4;
        cplwVar.f = str;
        cplwVar.g = a3;
        cplwVar.ad = a5;
        cplwVar.c = a6;
        cplwVar.d = a7;
        gz b = gnVar.b();
        b.i = 4097;
        b.w(16908290, cplwVar);
        b.f();
    }

    private final void g(String str) {
        int i;
        if (str.equals("undo")) {
            m();
            return;
        }
        ckd c = this.c.c(str);
        ckn cknVar = this.c.f;
        if (cknVar == null || (cknVar.a & 1) == 0) {
            i = -1;
        } else {
            ckb ckbVar = cknVar.b;
            if (ckbVar == null) {
                ckbVar = ckb.c;
            }
            i = ckbVar.b;
        }
        this.a.p(this.c.d, i, c.c, null, null);
    }

    private final void h() {
        int i;
        ArrayList arrayList;
        ReportAbuseComponentState reportAbuseComponentState = this.c;
        ckh d = reportAbuseComponentState.d(reportAbuseComponentState.f.c);
        ckn cknVar = this.c.f;
        if (cknVar == null || (cknVar.a & 1) == 0) {
            i = -1;
        } else {
            ckb ckbVar = cknVar.b;
            if (ckbVar == null) {
                ckbVar = ckb.c;
            }
            i = ckbVar.b;
        }
        if ((d.a & 4) != 0 && !d.d.isEmpty()) {
            if (!d.f.isEmpty()) {
                dsrj<ckq> dsrjVar = d.f;
                ArrayList arrayList2 = new ArrayList();
                for (ckq ckqVar : dsrjVar) {
                    arrayList2.add(Pair.create(ckqVar.b, ckqVar.c));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            this.a.p(this.c.d, i, -1, d.d, arrayList);
            j(false);
        }
        if (d.c) {
            i(true);
        } else {
            j(false);
        }
    }

    private final void i(boolean z) {
        a(false);
        cpln cplnVar = this.a;
        ckb ckbVar = this.c.f.b;
        if (ckbVar == null) {
            ckbVar = ckb.c;
        }
        cplnVar.q(ckbVar);
        this.c.d = true;
        if (z) {
            j(true);
        }
        a(true);
    }

    private final void m() {
        this.a.r();
    }

    public final void a(boolean z) {
        this.e.set(z);
    }

    public final void b() {
        String a = this.c.a(6);
        ArrayList arrayList = new ArrayList(this.c.a.a);
        ArrayList arrayList2 = new ArrayList();
        a(false);
        this.d.postDelayed(new cplm(this, a, arrayList, arrayList2), 100L);
    }

    public final void c(String str, ArrayList<ckn> arrayList, ArrayList<ckd> arrayList2, ckh ckhVar, int i, int i2, boolean z) {
        ReportAbuseCardConfigParcel reportAbuseCardConfigParcel = new ReportAbuseCardConfigParcel(str, arrayList, arrayList2, ckhVar, i, i2, z);
        ReportAbuseComponentState reportAbuseComponentState = this.c;
        reportAbuseComponentState.c.add(reportAbuseComponentState.e);
        reportAbuseComponentState.e = arrayList;
        reportAbuseComponentState.b.add(reportAbuseCardConfigParcel);
        cplw cplwVar = this.b;
        if (cplwVar.ai > 0) {
            ViewTreeObserver viewTreeObserver = cplwVar.ae.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new cplt(cplwVar, viewTreeObserver));
        }
        cplwVar.q(reportAbuseCardConfigParcel);
        cplwVar.w();
        cplwVar.i(reportAbuseCardConfigParcel);
    }

    public final void d() {
        int i;
        this.d.removeCallbacksAndMessages(null);
        ckn cknVar = this.c.f;
        if (cknVar == null || (cknVar.a & 1) == 0) {
            i = -1;
        } else {
            ckb ckbVar = cknVar.b;
            if (ckbVar == null) {
                ckbVar = ckb.c;
            }
            i = ckbVar.b;
        }
        this.a.p(this.c.d, i, -1, null, null);
    }

    public final void e() {
        cplw cplwVar = this.b;
        cplwVar.ah.setVisibility(8);
        cplwVar.af.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        cplw cplwVar = this.b;
        cplwVar.ah.setVisibility(0);
        cplwVar.af.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cplj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r15, int r16) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cplo.l(int, int):void");
    }

    @Override // defpackage.cplj
    public final void o() {
        d();
    }

    private final void j(boolean z) {
        String a;
        ckh d;
        if (z) {
            ReportAbuseComponentState reportAbuseComponentState = this.c;
            ckn cknVar = reportAbuseComponentState.f;
            if ((cknVar.a & 4) == 0 || !cknVar.e) {
                a = reportAbuseComponentState.a(8);
            } else {
                a = reportAbuseComponentState.a(13);
            }
            String str = a;
            ArrayList<ckn> arrayList = new ArrayList<>();
            ArrayList<ckd> arrayList2 = new ArrayList<>();
            ReportAbuseComponentState reportAbuseComponentState2 = this.c;
            int i = 1;
            if (true == reportAbuseComponentState2.d) {
                i = 2;
            }
            ckn cknVar2 = reportAbuseComponentState2.f;
            c(str, arrayList, arrayList2, ((2 & cknVar2.a) == 0 || ((d = reportAbuseComponentState2.d(cknVar2.c)) != null && d.c)) ? null : d, i, 2, true);
            return;
        }
        this.a.p(false, -1, -1, null, null);
    }

    @Override // defpackage.cplj
    public final void k(int i, int i2, String str) {
        ckh ckhVar;
        ckn cknVar;
        int i3 = 4;
        if (i2 != 0) {
            i3 = 2;
        } else {
            ArrayList<ckn> arrayList = this.c.e;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                ckhVar = null;
                if (i4 >= size) {
                    cknVar = null;
                    break;
                }
                cknVar = arrayList.get(i4);
                i4++;
                if (cknVar.g.equals(str)) {
                    break;
                }
            }
            if ((2 & cknVar.a) != 0) {
                ckhVar = this.c.d(cknVar.c);
            }
            if (cknVar.f.size() != 0 || cknVar.e || (ckhVar != null && ckhVar.c)) {
                i3 = 3;
            }
        }
        this.b.p(i3, true);
        this.c.e().g = i3;
        this.c.e().h = new ReportAbuseCardConfigParcel.ButtonState(i, i2, str);
    }
}
