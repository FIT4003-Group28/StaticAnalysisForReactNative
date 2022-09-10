package defpackage;

import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cijf  reason: default package */
/* loaded from: classes4.dex */
public class cijf extends cibj implements ciiz {
    public final chxl a;
    public chyu b;
    private final gga c;
    private final chrx d;
    private final baad e;
    private chxp f;

    public cijf(gga ggaVar, axwi axwiVar, chrx chrxVar, chxl chxlVar) {
        super(chxlVar);
        this.b = chyu.VISIBLE;
        this.c = ggaVar;
        this.d = chrxVar;
        this.a = chxlVar;
        dpot dpotVar = chxlVar.e;
        this.e = axwiVar.c(dpotVar == null ? dpot.m : dpotVar);
        chxp chxpVar = chxlVar.i;
        this.f = chxpVar == null ? chxp.k : chxpVar;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return this.f.i ? chyu.COMPLETED : this.b;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.PUBLISH_LIST;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    @Override // defpackage.ciiz
    public cqkl e() {
        this.d.R(this.e, new Runnable(this) { // from class: cija
            private final cijf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cijf cijfVar = this.a;
                cijfVar.b = chyu.COMPLETED;
                cijfVar.m(cije.a);
            }
        }, new Runnable(this) { // from class: cijb
            private final cijf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.m(cijd.a);
            }
        });
        return cqkl.a;
    }

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: cijc
            private final cijf a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                cijf cijfVar = (cijf) obj2;
                chxr chxrVar = this.a.a.b;
                if (chxrVar == null) {
                    chxrVar = chxr.e;
                }
                chxr chxrVar2 = cijfVar.a.b;
                if (chxrVar2 == null) {
                    chxrVar2 = chxr.e;
                }
                return chxrVar.equals(chxrVar2);
            }
        });
    }

    @Override // defpackage.ciiz
    public cqkl f() {
        this.b = chyu.DISMISSED;
        chrx chrxVar = this.d;
        chxr chxrVar = this.a.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        chrxVar.z(chxrVar);
        return cqkl.a;
    }

    @Override // defpackage.ciiz
    public cqkl g() {
        this.d.u(this.a);
        return cqkl.a;
    }

    @Override // defpackage.ciiz
    public CharSequence h() {
        return this.c.getApplicationContext().getString(R.string.PUBLISH_LIST_TASK_PUBLISH_CONTENT_DESCRIPTION, this.e.E(this.c.getApplicationContext()));
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        chxr chxrVar = this.a.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        objArr[0] = chxrVar;
        objArr[1] = chxj.PUBLISH_LIST;
        return Arrays.hashCode(objArr);
    }

    @Override // defpackage.ciiz
    public cqsn i() {
        return new cqvf(R.string.PUBLISH_LIST_TASK_PREVIEW_CONTENT_DESCRIPTION, this.e.E(this.c.getApplicationContext()));
    }

    @Override // defpackage.ciiz
    public cqsn j() {
        return new cqvf(R.string.PUBLISH_LIST_TASK_SKIP_CONTENT_DESCRIPTION, this.e.E(this.c.getApplicationContext()));
    }

    @Override // defpackage.ciiz
    public Boolean k() {
        return Boolean.valueOf(this.f.i);
    }

    @Override // defpackage.ciiz
    public Boolean l() {
        chxp chxpVar = this.a.i;
        if (chxpVar == null) {
            chxpVar = chxp.k;
        }
        return Boolean.valueOf(chxpVar.j);
    }

    public final void m(dbrn<chxp, chxp> dbrnVar) {
        this.f = dbrnVar.a(this.f);
        chrx chrxVar = this.d;
        chxr chxrVar = this.a.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        chrxVar.Q(chxrVar, dbrnVar);
        cqkx.p(this);
    }
}
