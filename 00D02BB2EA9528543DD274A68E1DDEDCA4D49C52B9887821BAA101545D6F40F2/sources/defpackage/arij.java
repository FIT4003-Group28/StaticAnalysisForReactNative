package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arij  reason: default package */
/* loaded from: classes2.dex */
public class arij implements bfgu {
    public final jkf a;
    @dzsi
    private dvcj b;
    @dzsi
    private String c;
    private final bnhz d;
    private final bfgv f;
    private final izl g;
    private jjn i;
    private final cjtd e = cjtd.a(dtxv.eD);
    private final View.OnClickListener h = new arii(this);

    public arij(Resources resources, jkf jkfVar, bnhz bnhzVar, jjn jjnVar, boolean z, bfhx bfhxVar, izl izlVar) {
        this.a = jkfVar;
        this.i = jjnVar;
        this.d = bnhzVar;
        this.f = bfhxVar;
        this.g = izlVar;
    }

    @Override // defpackage.bfgu
    @dzsi
    public izl A() {
        return this.g;
    }

    @Override // defpackage.bfgu
    public Boolean B() {
        return false;
    }

    @Override // defpackage.bfgu
    @dzsi
    public bmgs C() {
        return null;
    }

    @Override // defpackage.bfgu
    public Boolean D() {
        return false;
    }

    @Override // defpackage.bfgu
    public Boolean E() {
        return false;
    }

    @Override // defpackage.bfgu
    public Boolean F() {
        return true;
    }

    @Override // defpackage.bfgu
    public bfgv G() {
        return this.f;
    }

    @Override // defpackage.bfgu
    @dzsi
    public bfcf H() {
        return null;
    }

    @Override // defpackage.bfgu
    public Boolean I() {
        return false;
    }

    @Override // defpackage.bfgu
    public Boolean J() {
        return false;
    }

    @Override // defpackage.bfgu
    public bruz K() {
        return null;
    }

    @Override // defpackage.bfgu
    public Boolean L() {
        return false;
    }

    @Override // defpackage.bfgu
    public void QT(View view) {
    }

    @Override // defpackage.bfgu
    public View.OnClickListener QU() {
        return this.h;
    }

    @Override // defpackage.bfgu
    public Boolean QV() {
        return true;
    }

    public void a(jjn jjnVar) {
        this.i = jjnVar;
    }

    public void b(String str) {
        this.c = str;
        cqkx.p(this);
    }

    public void c(dvcj dvcjVar) {
        this.b = dvcjVar;
        cqkx.p(this);
    }

    @Override // defpackage.bfgu
    public CharSequence d() {
        dvcj dvcjVar = this.b;
        if (dvcjVar == null) {
            return null;
        }
        return dvcjVar.a;
    }

    @Override // defpackage.bfgu
    public String e() {
        return "";
    }

    @Override // defpackage.bfgu
    public CharSequence f() {
        return this.c;
    }

    @Override // defpackage.bfgu
    public CharSequence g() {
        return this.c;
    }

    @Override // defpackage.bfgu
    public Boolean h() {
        return Boolean.valueOf(this.c != null);
    }

    @Override // defpackage.bfgu
    public Boolean i() {
        return false;
    }

    @Override // defpackage.bfgu
    @dzsi
    public String j() {
        bnhz bnhzVar = this.d;
        if (bnhzVar == null || !bnhzVar.b().booleanValue()) {
            return null;
        }
        return this.d.a();
    }

    @Override // defpackage.bfgu
    @dzsi
    public cqtd k() {
        bnhz bnhzVar = this.d;
        if (bnhzVar == null || !bnhzVar.b().booleanValue()) {
            return null;
        }
        return this.d.c();
    }

    @Override // defpackage.bfgu
    public Boolean l() {
        return Boolean.valueOf(this.i.b());
    }

    public Boolean m() {
        return Boolean.valueOf(this.i.equals(jjn.FULLY_EXPANDED));
    }

    @Override // defpackage.bfgu
    public Boolean n() {
        return Boolean.valueOf(!this.i.equals(jjn.FULLY_EXPANDED));
    }

    @Override // defpackage.bfgu
    public Boolean o() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.bfgu
    public Boolean p() {
        return false;
    }

    @Override // defpackage.bfgu
    public Boolean q() {
        return false;
    }

    @Override // defpackage.bfgu
    public cjtd r() {
        return this.e;
    }

    @Override // defpackage.bfgu
    public cjtd s() {
        return r();
    }

    @Override // defpackage.bfgu
    public cqtd v() {
        return cqrt.i(cqqg.a((int) R.drawable.ic_qu_mymaps_icon_small), l().booleanValue() ? irg.a() : irg.B());
    }

    @Override // defpackage.bfgu
    public Boolean x() {
        return true;
    }

    @Override // defpackage.bfgu
    public Boolean y() {
        return false;
    }

    @Override // defpackage.bfgu
    public Boolean z() {
        return false;
    }
}
