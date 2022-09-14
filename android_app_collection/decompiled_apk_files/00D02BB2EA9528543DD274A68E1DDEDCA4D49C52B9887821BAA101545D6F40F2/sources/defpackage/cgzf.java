package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cgzf  reason: default package */
/* loaded from: classes4.dex */
public class cgzf implements cgwb, cgyv {
    public final bsvm a;
    public final cgze b;
    private final Activity d;
    private final cgtn e;
    private final View.OnClickListener f;
    private jib g;
    private List<cgwa> h = dcdc.e();
    private List<cgwa> i = dcdc.e();
    public cgzd c = new cgzd();
    private boolean j = false;

    public cgzf(Activity activity, cgtn cgtnVar, bsvm bsvmVar, cgze cgzeVar) {
        this.d = activity;
        this.e = cgtnVar;
        this.a = bsvmVar;
        this.b = cgzeVar;
        cgza cgzaVar = new cgza(cgzeVar);
        this.f = cgzaVar;
        this.g = n(activity, "", cgzaVar, null, new ArrayList());
    }

    public static jib n(Activity activity, String str, @dzsi View.OnClickListener onClickListener, @dzsi View.OnClickListener onClickListener2, List<jho> list) {
        jhz e = jib.f(activity, str).e();
        e.q = irg.a();
        e.i = cqrt.g(2131231588, irg.b());
        e.o = cjtd.a(dtyd.am);
        e.g(16);
        e.u = irg.b();
        e.f = irg.b();
        e.p = null;
        e.x = false;
        e.f(onClickListener);
        if (onClickListener2 != null) {
            e.a = String.format("%s  ▾", str);
            e.m = onClickListener2;
            e.n = String.format("%s\n%s", str, activity.getString(R.string.UGC_TASKS_ACCESSIBILITY_TASK_SET_SWITCHER));
        } else {
            e.a = str;
        }
        e.d(list);
        return e.b();
    }

    @Override // defpackage.cgwb
    public List<cgwa> a() {
        return this.h;
    }

    @Override // defpackage.cgwb
    public List<cgwa> b() {
        return this.i;
    }

    @Override // defpackage.cgwb
    public jib c() {
        return this.g;
    }

    @Override // defpackage.cgwb
    public void d(boolean z) {
        this.j = z;
        cqkx.p(this);
    }

    @Override // defpackage.cgwb, defpackage.cgyv
    public Boolean e() {
        boolean z = true;
        if (!this.j && !this.b.f().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwb
    public Boolean f() {
        boolean z = true;
        if (b().isEmpty() && a().isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgyv
    public void g(cgwa cgwaVar) {
        this.c.c(cgwaVar.f(), cgwaVar.a().booleanValue(), cgwaVar.b().booleanValue());
        this.b.p(cgwaVar.a());
        cqkx.p(this);
    }

    @Override // defpackage.cgyv
    public Boolean h() {
        return this.b.f();
    }

    @Override // defpackage.cgyv
    public void i() {
        this.b.s();
    }

    public void j(cgzd cgzdVar) {
        this.c = cgzdVar;
    }

    public cgzd k() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(defpackage.dwrc r18, boolean r19, boolean r20, defpackage.cgzd r21, java.util.Set<defpackage.dspd> r22, java.util.Set<defpackage.dspd> r23) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzf.l(dwrc, boolean, boolean, cgzd, java.util.Set, java.util.Set):void");
    }

    public dwsr m(dwsr dwsrVar, dspd dspdVar) {
        List arrayList;
        dwrc f = cguq.f(dwsrVar, dspdVar);
        if (f == null) {
            return dwsrVar;
        }
        if ((f.a & 8) != 0) {
            dwqp dwqpVar = f.g;
            if (dwqpVar == null) {
                dwqpVar = dwqp.d;
            }
            arrayList = dwqpVar.c;
        } else {
            arrayList = new ArrayList();
        }
        Set<dspd> d = cguq.d(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        for (cgwa cgwaVar : this.i) {
            if (this.c.a(cgwaVar.f()) && !d.contains(cgwaVar.f())) {
                arrayList2.add(cgwaVar.g());
            }
        }
        if (!arrayList2.isEmpty()) {
            dsqp dsqpVar = (dsqp) f.cu(5);
            dsqpVar.bC(f);
            dwqj dwqjVar = (dwqj) dsqpVar;
            dwqm bZ = dwqp.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwqp dwqpVar2 = (dwqp) bZ.b;
            dwqpVar2.b = 2;
            dwqpVar2.a |= 1;
            bZ.a(arrayList2);
            if (dwqjVar.c) {
                dwqjVar.bF();
                dwqjVar.c = false;
            }
            dwrc dwrcVar = (dwrc) dwqjVar.b;
            dwqp bK = bZ.bK();
            bK.getClass();
            dwrcVar.g = bK;
            dwrcVar.a |= 8;
            f = dwqjVar.bK();
        }
        Set<dspd> d2 = cguq.d(f.f);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(f.f);
        for (cgwa cgwaVar2 : this.h) {
            if (this.c.b(cgwaVar2.f()) && !d2.contains(cgwaVar2.f())) {
                arrayList3.add(cgwaVar2.g());
            }
        }
        dsqp dsqpVar2 = (dsqp) f.cu(5);
        dsqpVar2.bC(f);
        dwqj dwqjVar2 = (dwqj) dsqpVar2;
        if (dwqjVar2.c) {
            dwqjVar2.bF();
            dwqjVar2.c = false;
        }
        ((dwrc) dwqjVar2.b).f = dwrc.ck();
        if (dwqjVar2.c) {
            dwqjVar2.bF();
            dwqjVar2.c = false;
        }
        dwrc dwrcVar2 = (dwrc) dwqjVar2.b;
        dsrj<dwqt> dsrjVar = dwrcVar2.f;
        if (!dsrjVar.a()) {
            dwrcVar2.f = dsqw.cl(dsrjVar);
        }
        dsod.bv(arrayList3, dwrcVar2.f);
        dwrc bK2 = dwqjVar2.bK();
        ArrayList arrayList4 = new ArrayList();
        for (dwrc dwrcVar3 : dwsrVar.b) {
            if (dwrcVar3.b.equals(bK2.b)) {
                arrayList4.add(bK2);
            } else {
                arrayList4.add(dwrcVar3);
            }
        }
        dsqp dsqpVar3 = (dsqp) dwsrVar.cu(5);
        dsqpVar3.bC(dwsrVar);
        dwso dwsoVar = (dwso) dsqpVar3;
        if (dwsoVar.c) {
            dwsoVar.bF();
            dwsoVar.c = false;
        }
        ((dwsr) dwsoVar.b).b = dwsr.ck();
        dwsoVar.b(arrayList4);
        return dwsoVar.bK();
    }
}
