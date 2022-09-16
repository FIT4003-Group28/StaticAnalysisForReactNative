package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayqb  reason: default package */
/* loaded from: classes3.dex */
public class ayqb implements bfkm {
    static final cqtd a = iup.e(R.raw.own_list);
    static final cqtd b = iup.e(R.raw.editorial_list);
    public final iys c;
    @dzsi
    public jic d;
    private final Activity e;
    private final cqhn f;
    private final ayfk g;
    @dzsi
    private final baad h;
    @dzsi
    private jbo i;
    private dcdc<azxb> j = dcdc.e();
    private int k;
    private float l;
    private float m;
    private float n;

    public ayqb(Activity activity, cqhn cqhnVar, @dzsi baad baadVar, ayfk ayfkVar) {
        this.e = activity;
        this.f = cqhnVar;
        this.h = baadVar;
        this.g = ayfkVar;
        iys iysVar = new iys();
        this.c = iysVar;
        iysVar.a(true);
        this.k = bfki.d(activity.getResources()).c;
    }

    @dzsi
    private final jic H() {
        dwfl dwflVar;
        jic jicVar = this.d;
        if (jicVar != null) {
            return jicVar;
        }
        baad baadVar = this.h;
        dnwl I = baadVar != null ? baadVar.I() : null;
        if (I != null && (I.a & 8192) != 0) {
            dnwr dnwrVar = I.e;
            if (dnwrVar == null) {
                dnwrVar = dnwr.c;
            }
            if (!dbsj.d(dnwrVar.b)) {
                dnwr dnwrVar2 = I.e;
                if (dnwrVar2 == null) {
                    dnwrVar2 = dnwr.c;
                }
                jic jicVar2 = new jic(dnwrVar2.b, ckqc.FULLY_QUALIFIED, d(), 0);
                this.d = jicVar2;
                return jicVar2;
            }
        }
        if (this.h != null) {
            for (azxb azxbVar : dchl.l(this.j)) {
                if (this.h.d(azxbVar) != null) {
                    baal d = this.h.d(azxbVar);
                    dbsk.s(d);
                    dwflVar = d.j();
                    continue;
                } else {
                    dwflVar = null;
                    continue;
                }
                if (dwflVar != null) {
                    jic jicVar3 = new jic(dwflVar.h, ckqc.FULLY_QUALIFIED, d(), 0);
                    this.d = jicVar3;
                    return jicVar3;
                }
            }
        }
        dcdc<azxb> dcdcVar = this.j;
        int size = dcdcVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            azxb azxbVar2 = dcdcVar.get(i);
            if (!azxbVar2.c().isEmpty()) {
                jic I2 = I(azxbVar2.c(), 2);
                this.d = I2;
                if (I2 != null) {
                    return I2;
                }
            } else {
                bnju h = this.g.h(azxbVar2.a());
                if (h != null) {
                    jic J = J(h, 2);
                    this.d = J;
                    if (J != null) {
                        return J;
                    }
                }
            }
            i++;
        }
        dcdc<azxb> SL = this.j.SL();
        int size2 = SL.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                break;
            }
            azxb azxbVar3 = SL.get(i2);
            if (!azxbVar3.c().isEmpty()) {
                jic I3 = I(azxbVar3.c(), 0);
                this.d = I3;
                if (I3 != null) {
                    return I3;
                }
            } else {
                bnju h2 = this.g.h(azxbVar3.a());
                if (h2 != null) {
                    jic J2 = J(h2, 0);
                    this.d = J2;
                    if (J2 != null) {
                        return J2;
                    }
                }
            }
            i2++;
        }
        return null;
    }

    @dzsi
    private final jic I(String str, int i) {
        ayfb g = this.g.g(str);
        if (g == null || g.c() != dqhy.OK) {
            return null;
        }
        diwb b2 = g.b();
        dbsk.s(b2);
        dive diveVar = b2.v;
        if (diveVar == null) {
            diveVar = dive.d;
        }
        dsrj<dwfl> dsrjVar = diveVar.a;
        if (i < dsrjVar.size()) {
            return new jic(dsrjVar.get(i).h, ckqc.FULLY_QUALIFIED, d(), 0);
        }
        return null;
    }

    @dzsi
    private static jic J(jba jbaVar, int i) {
        if (i >= jbaVar.ah().s().size()) {
            return null;
        }
        return jbaVar.ah().s().get(i).a();
    }

    @Override // defpackage.bfkk
    public List A() {
        return bfkj.b(this);
    }

    @Override // defpackage.bfkk
    public Boolean B() {
        return bfkj.e();
    }

    @Override // defpackage.bfkk
    public cqix C() {
        return null;
    }

    @Override // defpackage.bfkk
    public Boolean D() {
        return bfkj.f();
    }

    @Override // defpackage.bfkk
    public cqtv E() {
        return bfkj.d();
    }

    @Override // defpackage.bfkk
    public Float F() {
        return bfkj.c();
    }

    @Override // defpackage.bfkk
    public void G(float f) {
    }

    @Override // defpackage.bfkk
    public void Pp(float f) {
        this.n = f;
    }

    @Override // defpackage.bfkk
    public void Pq(boolean z) {
    }

    @Override // defpackage.bfkk
    public void Pr(float f) {
        this.l = f;
    }

    @Override // defpackage.bfkk
    public void Ps(float f) {
        this.m = f;
    }

    @Override // defpackage.bfkk
    public cqss a() {
        return cqrt.c(R.color.qu_grey_white_1000);
    }

    @Override // defpackage.bfkk
    public Boolean b() {
        return Boolean.valueOf(H() == null);
    }

    @Override // defpackage.bfkk
    public Boolean c() {
        return bfkj.a(this);
    }

    @Override // defpackage.bfkk
    public cqtd d() {
        baad baadVar = this.h;
        if (baadVar != null && !baadVar.y()) {
            return b;
        }
        return a;
    }

    @Override // defpackage.bfkk
    public Boolean i() {
        return Boolean.valueOf(H() != null);
    }

    @Override // defpackage.bfkk
    public void j(int i) {
        this.k = i;
    }

    @Override // defpackage.bfkk
    public Integer k() {
        return Integer.valueOf(this.k);
    }

    @Override // defpackage.bfkk
    public Float l() {
        return Float.valueOf(bfki.a(this.e.getResources()));
    }

    @Override // defpackage.bfkk
    public Float m() {
        return Float.valueOf(this.l);
    }

    @Override // defpackage.bfkk
    public Float n() {
        return Float.valueOf(this.m);
    }

    @Override // defpackage.bfkk
    public Float o() {
        return Float.valueOf(this.n);
    }

    @Override // defpackage.bfkk
    @dzsi
    public jbo p() {
        jbo jboVar = this.i;
        if (jboVar != null) {
            return jboVar;
        }
        if (H() != null) {
            this.i = new iyo(dcdc.f(new iyr(new ayqa(this))), dtxr.f, this.f, (cjqy) null, (iyn) null);
        }
        return this.i;
    }

    @Override // defpackage.bfkk
    public Boolean q() {
        return false;
    }

    @Override // defpackage.bfkk
    @dzsi
    public cqix<? extends cqkp> r() {
        return null;
    }

    @Override // defpackage.bfkk
    public List<jbp> s() {
        return dcdc.e();
    }

    public void t(dcdc<azxb> dcdcVar) {
        this.j = dcdcVar;
        this.d = null;
        this.i = null;
    }

    @Override // defpackage.bfkm
    public jbs u() {
        return bfkl.a(this);
    }

    @Override // defpackage.bfkm
    public View.OnAttachStateChangeListener v() {
        return null;
    }

    @Override // defpackage.bfkm
    public aeqd w() {
        return null;
    }

    @Override // defpackage.bfkk
    public void x(cqtv cqtvVar) {
    }

    @Override // defpackage.bfkm
    public Boolean y() {
        return bfkl.b();
    }

    @Override // defpackage.bfkk
    public Boolean z() {
        return bfkj.g();
    }
}
