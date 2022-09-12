package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: jhz  reason: default package */
/* loaded from: classes7.dex */
public final class jhz {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public CharSequence a;
    @dzsi
    public CharSequence b;
    @dzsi
    public jic c;
    public cqtd d;
    public cqtd e;
    public cqss f;
    public cqss g;
    public boolean h;
    @dzsi
    public cqtd i;
    @dzsi
    public cqsn j;
    @dzsi
    public jia k;
    @dzsi
    public CharSequence l;
    public View.OnClickListener m;
    @dzsi
    public CharSequence n;
    @dzsi
    public cjtd o;
    @dzsi
    public cjtd p;
    public cqss q;
    public int r;
    public int s;
    @dzsi
    public Integer t;
    public cqss u;
    public cqss v;
    public boolean w;
    public boolean x;
    public final List<jho> y;
    public int z;

    @Deprecated
    public jhz() {
        this.y = new ArrayList();
        this.q = ibm.x();
        this.r = -1;
        this.d = irn.N();
        this.e = null;
        this.f = irg.a();
        this.g = null;
        this.c = null;
        this.h = false;
        this.i = cqrt.g(2131231588, irg.a());
        this.j = cqrt.l(R.string.NAVIGATE_UP);
        this.s = 255;
        this.u = jib.a;
        this.w = false;
        this.x = true;
        this.z = 1;
        this.B = 1;
        this.C = 1;
        this.D = 1;
        this.E = 0;
        this.p = cjtd.a(dtxy.jU);
        this.F = 0;
        this.G = 0;
    }

    public static jhz a() {
        jhz jhzVar = new jhz(new jib());
        jhzVar.u = ibm.t();
        jhzVar.i = cqrt.g(2131231588, ibm.p());
        jhzVar.d = ibo.h();
        jhzVar.j = cqrt.l(R.string.NAVIGATE_UP);
        jhzVar.q = ibm.b();
        jhzVar.v = ibm.n();
        jhzVar.f = ibm.p();
        jhzVar.g = ibm.p();
        jhzVar.w = false;
        jhzVar.x = true;
        jhzVar.p = cjtd.a(dtxy.jU);
        return jhzVar;
    }

    public final jib b() {
        return new jib(this);
    }

    public final void c(jho jhoVar) {
        this.y.add(jhoVar);
    }

    public final void d(List<jho> list) {
        this.y.addAll(list);
    }

    public final void e() {
        this.y.clear();
    }

    public final void f(@dzsi final View.OnClickListener onClickListener) {
        this.k = onClickListener != null ? new jia(onClickListener) { // from class: jhy
            private final View.OnClickListener a;

            {
                this.a = onClickListener;
            }

            @Override // defpackage.jia
            public final void a(View view) {
                this.a.onClick(view);
            }
        } : null;
    }

    public final void g(int i) {
        this.t = Integer.valueOf(i);
    }

    public jhz(jib jibVar) {
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
        this.a = jibVar.u;
        this.b = jibVar.b;
        this.c = jibVar.c;
        this.d = jibVar.d;
        this.e = jibVar.e;
        this.f = jibVar.f;
        this.g = jibVar.g;
        this.h = jibVar.h;
        this.i = jibVar.i;
        this.j = jibVar.j;
        this.k = jibVar.A;
        this.l = jibVar.H;
        this.m = jibVar.D;
        this.n = jibVar.F;
        this.o = jibVar.k;
        this.p = jibVar.l;
        this.q = jibVar.m;
        this.r = jibVar.y;
        this.s = jibVar.x;
        this.t = jibVar.v;
        this.u = jibVar.w;
        this.v = jibVar.z;
        this.w = jibVar.B;
        this.x = jibVar.C;
        arrayList.addAll(jibVar.n);
        this.z = jibVar.s;
        this.A = jibVar.t;
        this.B = jibVar.o.intValue();
        this.C = jibVar.p.intValue();
        this.D = jibVar.q.intValue();
        this.E = jibVar.r;
        this.F = jibVar.I;
        this.G = jibVar.J;
    }
}
