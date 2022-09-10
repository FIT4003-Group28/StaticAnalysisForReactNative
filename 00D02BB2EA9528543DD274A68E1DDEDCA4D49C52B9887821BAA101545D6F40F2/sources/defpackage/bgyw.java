package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgyw  reason: default package */
/* loaded from: classes3.dex */
public class bgyw implements bgyp {
    public int a;
    @dzsi
    public Integer b;
    public final cpv c;
    public final Application d;
    public final List<String> e;
    public int f = 3;
    private final cqss g;
    private final int h;
    private final cqtd i;
    private final fd j;
    private final bgyu k;
    private final List<bgyo> l;
    private final cjtd m;
    private final cqjg n;
    private boolean o;
    private int p;
    private int q;

    public bgyw(cpv cpvVar, Application application, cqhn cqhnVar, cqhu cqhuVar, fd fdVar, List<String> list, int i, Integer num, @dzsi Integer num2, bgyu bgyuVar, cjtd cjtdVar, cqjg cqjgVar) {
        this.c = cpvVar;
        this.d = application;
        this.j = fdVar;
        this.e = list;
        this.a = i;
        this.q = i;
        this.b = num;
        this.p = num.intValue();
        this.k = bgyuVar;
        this.m = cjtdVar;
        this.n = cqjgVar;
        ArrayList arrayList = new ArrayList(3);
        cqsr.b(ibm.x(), new int[]{16842910}, arrayList);
        cqsr.b(ibm.x(), new int[0], arrayList);
        this.g = cqsr.a(arrayList);
        float f = application.getResources().getDisplayMetrics().density;
        this.h = (int) (f + f);
        this.i = cqrt.g(2131232150, ibm.x());
        this.l = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            this.l.add(new bgyv(this, i2, i2 < num2.intValue()));
            i2++;
        }
    }

    private final void q() {
        this.a = this.q;
        this.b = Integer.valueOf(this.p);
        r();
    }

    private final void r() {
        if (this.o) {
            this.o = false;
            if (this.c.e(this.d)) {
                s(0);
            }
            cqkx.p(this);
        }
    }

    private final void s(int i) {
        View a;
        View view = this.j.P;
        if (view == null || (a = cqhu.a(view, this.n)) == null) {
            return;
        }
        od.m(a, i);
    }

    @Override // defpackage.bgyp
    public Boolean a() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.bgyp
    public List<bgyo> b() {
        return this.l;
    }

    @Override // defpackage.bgyp
    public Integer c() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.bgyp
    public cqkl d() {
        q();
        return cqkl.a;
    }

    @Override // defpackage.bgyp
    public cqkl e() {
        Integer num = this.b;
        if (num != null && (this.a != this.q || num.intValue() != this.p)) {
            this.q = this.a;
            this.p = this.b.intValue();
            bgyu bgyuVar = this.k;
            int i = this.a;
            int intValue = this.b.intValue();
            bgyy bgyyVar = (bgyy) bgyuVar;
            bgza bgzaVar = bgyyVar.a;
            bepa bepaVar = (bepa) bgyyVar.b;
            bepb bepbVar = bepaVar.a;
            bepbVar.a.n(i, intValue, bepaVar.b, bepaVar.c);
            cqkx.p(bepbVar.a.c);
            cqkx.p(bepbVar.a.e);
            cqkx.p(bgzaVar);
        }
        r();
        return cqkl.a;
    }

    @Override // defpackage.bgyp
    public Boolean f() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.bgyp
    @dzsi
    public cqfc g() {
        if (this.f != 3) {
            return null;
        }
        return new bgyt(this);
    }

    @Override // defpackage.bgyq
    public Boolean h() {
        return false;
    }

    @Override // defpackage.bgyq
    public cqss j() {
        return this.g;
    }

    @Override // defpackage.bgyq
    public Integer k() {
        return Integer.valueOf(this.h);
    }

    @Override // defpackage.bgyq
    public cqtd l() {
        return this.i;
    }

    @Override // defpackage.bgyq
    public cqkl m() {
        q();
        return cqkl.a;
    }

    @Override // defpackage.bgyq
    public String n() {
        String string = this.d.getString(R.string.MERCHANT_PANEL_INSIGHTS_MONTHS_HINT);
        String i = i();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(i).length());
        sb.append(string);
        sb.append(" ");
        sb.append(i);
        return sb.toString();
    }

    @Override // defpackage.bgyq
    public cjtd o() {
        return this.m;
    }

    public void p() {
        if (!this.o) {
            this.o = true;
            if (this.c.e(this.d)) {
                for (View view : cqkx.n(this)) {
                    View a = cqhu.a(view, bgwz.a);
                    if (a != null) {
                        czue.b(a);
                        s(4);
                    }
                }
            }
            cqkx.p(this);
        }
    }

    @Override // defpackage.bgyq
    public String i() {
        Integer num = this.b;
        String str = num == null ? "" : this.e.get(num.intValue());
        String str2 = this.e.get(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append("–");
        sb.append(str);
        return sb.toString();
    }
}
