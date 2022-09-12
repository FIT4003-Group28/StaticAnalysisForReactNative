package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.maps.R;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: krc  reason: default package */
/* loaded from: classes7.dex */
public final class krc extends nor {
    private final cqkf<krv> A;
    private final krg B;
    @dzsi
    private final mcm C;
    private dbsg<bvpk> D;
    public final Context a;
    public final jzp b;
    public final nov c;
    public final nop d;
    public final kdi e;
    public final nct f;
    public final befw g;
    public final kqp h;
    public final ntc i;
    public final not j;
    public final bxla k;
    public final cqkf<krv> l;
    public final krx m;
    public final krt n;
    public final btvo o;
    @dzsi
    public final dndr p;
    public final ksb q;
    public final kcz<dcdc<bxmh>> r;
    public final ndu s;
    public final ndx t;
    public final ndx u;
    public final ndy v;
    private final kdg w;
    private final kcv x;
    private final kpl y;
    private final cjsz z;

    public krc(Context context, btrm btrmVar, cqat cqatVar, bxer bxerVar, kdg kdgVar, btpc btpcVar, cjqy cjqyVar, cjqq cjqqVar, kdi kdiVar, cqkj cqkjVar, jzp jzpVar, akox akoxVar, nov novVar, nop nopVar, noo nooVar, @dzsi mcm mcmVar, not notVar, @dzsi dndr dndrVar, kpl kplVar, befw befwVar, kcv kcvVar, krt krtVar, cqiw<krv> cqiwVar, krx krxVar, btvo btvoVar, krg krgVar, kqp kqpVar) {
        super(cjqyVar, cjqqVar);
        this.z = new cjsz(dtxm.dK);
        this.D = dbpy.a;
        this.r = new kqt(this);
        this.s = new kqu(this);
        this.t = new kqw(this);
        this.u = new kqy(this);
        this.v = new kqz(this);
        if (!q(btvoVar)) {
            dbsk.l(false);
        }
        dbsk.s(context);
        this.a = context;
        dbsk.s(kdgVar);
        this.w = kdgVar;
        dbsk.s(kdiVar);
        this.e = kdiVar;
        dbsk.s(jzpVar);
        this.b = jzpVar;
        dbsk.s(novVar);
        this.c = novVar;
        dbsk.s(nopVar);
        this.d = nopVar;
        this.C = mcmVar;
        dbsk.s(notVar);
        this.j = notVar;
        dbsk.s(befwVar);
        this.g = befwVar;
        dbsk.s(kcvVar);
        this.x = kcvVar;
        this.h = kqpVar;
        if (dndrVar != null) {
            boolean z = true;
            if (dndrVar != dndr.HOME && dndrVar != dndr.WORK) {
                z = false;
            }
            dbsk.l(z);
        }
        this.p = dndrVar;
        if (dndrVar == dndr.HOME) {
            this.k = bxla.HOME;
        } else if (dndrVar == dndr.WORK) {
            this.k = bxla.WORK;
        } else {
            this.k = bxla.SEARCH;
        }
        dbsk.s(kplVar);
        this.y = kplVar;
        this.f = new nct(btrmVar, akoxVar, cqatVar, bxerVar, btpcVar);
        this.i = new ntc(cqkjVar, dbsg.i(11));
        this.l = cqkjVar.d(cqiwVar, notVar.a(), false);
        this.A = cqkjVar.c(new krs(), null);
        this.q = new ksb(new krb(this), nooVar, kqpVar);
        dbsk.s(krtVar);
        this.n = krtVar;
        this.m = krxVar;
        this.o = btvoVar;
        this.B = krgVar;
    }

    public static boolean q(btvo btvoVar) {
        return btvoVar.getCarParameters().j;
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        if (q(this.o)) {
            boolean b = this.h.b();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
            sb.append(str);
            sb.append("   isSoftInputKeyboardShowing(): ");
            sb.append(b);
            printWriter.println(sb.toString());
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        boolean isActive = inputMethodManager.isActive();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20);
        sb2.append(str);
        sb2.append("   isActive(): ");
        sb2.append(isActive);
        printWriter.println(sb2.toString());
        boolean isAcceptingText = inputMethodManager.isAcceptingText();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27);
        sb3.append(str);
        sb3.append("   isAcceptingText(): ");
        sb3.append(isAcceptingText);
        printWriter.println(sb3.toString());
        boolean isFullscreenMode = inputMethodManager.isFullscreenMode();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 28);
        sb4.append(str);
        sb4.append("   isFullscreenMode(): ");
        sb4.append(isFullscreenMode);
        printWriter.println(sb4.toString());
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.f.a();
    }

    @Override // defpackage.non
    public final noq b() {
        this.l.e(this.q);
        this.A.e(this.q);
        View c = this.l.c();
        cov k = k();
        k.setAdapter(this.i);
        k.setMaxPages(3);
        this.w.d(this);
        s(this.z);
        dbsg<bvpk> i = dbsg.i(bvpk.a(new Runnable(this) { // from class: kqq
            private final krc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                krc krcVar = this.a;
                EditText l = krcVar.l();
                nol.b(l);
                if (krc.q(krcVar.o)) {
                    krcVar.h.a(l);
                    return;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) krcVar.a.getSystemService("input_method");
                dbsk.s(inputMethodManager);
                inputMethodManager.showSoftInput(l, 0);
            }
        }));
        this.D = i;
        c.post(i.b());
        if (q(this.o)) {
            View c2 = this.l.c();
            int i2 = krq.a;
            View findViewById = c2.findViewById(R.id.results_list_touch_overlay_view_id);
            krg krgVar = this.B;
            kqp kqpVar = this.h;
            btvo a = krgVar.a.a();
            krg.a(a, 1);
            cjqy a2 = krgVar.b.a();
            krg.a(a2, 2);
            cjqq a3 = krgVar.c.a();
            krg.a(a3, 3);
            krg.a(kqpVar, 4);
            krg.a(c2, 5);
            findViewById.setOnTouchListener(new krf(a, a2, a3, kqpVar, c2));
        }
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.l.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
        r();
        this.w.e(this);
        this.l.e(null);
        this.A.e(null);
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.f.b();
    }

    @Override // defpackage.non
    public final String g() {
        return "KeyboardSearchOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.j.b(noeVar, this.l.c());
    }

    public final cov k() {
        View c = this.l.c();
        int i = krq.a;
        return (cov) c.findViewById(R.id.results_list_view_id);
    }

    public final EditText l() {
        View c = this.l.c();
        int i = krq.a;
        return (EditText) c.findViewById(R.id.edittext_view_id);
    }

    public final void m(@dzsi String str, ddho ddhoVar, deaf deafVar) {
        if (this.p != null) {
            r();
        }
        if (this.C == null) {
            return;
        }
        if (str == null || str.isEmpty()) {
            n();
            return;
        }
        this.c.a();
        this.C.a(str, "", null, null, null, ddhoVar, deafVar, false, mex.a(), null, mnz.SEARCH_KEYBOARD_QUERY, dbpy.a, false);
        this.c.b();
    }

    public final void n() {
        this.i.B();
        this.q.i(false);
        cqkx.p(this.q);
        this.q.k(null);
        this.f.d();
    }

    public final void o() {
        this.x.k(this.a.getResources().getString(jvn.CAR_ERROR_HOME_WORK_UPDATE_FAILED), 1);
    }

    public final void p(ldm ldmVar) {
        dbsk.s(this.p);
        ldm l = this.y.a(this.p).d().l();
        this.y.a(this.p).e(ldmVar);
        this.c.a();
        this.q.g();
        if (l == null) {
            this.d.k(this.e.b(this.p));
        }
        this.c.b();
    }

    final void r() {
        bvor.a(this.D, kqr.a);
        if (q(this.o)) {
            kqp kqpVar = this.h;
            d().getWindowToken();
            kqpVar.c();
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        dbsk.s(inputMethodManager);
        inputMethodManager.hideSoftInputFromWindow(d().getWindowToken(), 0);
    }
}
