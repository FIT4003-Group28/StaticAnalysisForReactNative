package defpackage;

import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cigf  reason: default package */
/* loaded from: classes4.dex */
public class cigf extends cibj implements cigc {
    public final chvq a;
    public chyu b;
    private final gga c;
    private final chrx d;
    private final chxl e;
    private final baad f;

    public cigf(gga ggaVar, axwi axwiVar, chrx chrxVar, chxl chxlVar, chvq chvqVar) {
        super(chxlVar);
        this.b = chyu.VISIBLE;
        this.c = ggaVar;
        this.d = chrxVar;
        this.e = chxlVar;
        dpot dpotVar = chxlVar.e;
        this.f = axwiVar.c(dpotVar == null ? dpot.m : dpotVar);
        this.a = chvqVar;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return this.b;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.ADD_LIST_DESCRIPTION;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    @Override // defpackage.cigc
    public cqkl e() {
        this.d.W(this.f, new bvqg(this) { // from class: cigd
            private final cigf a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                cigf cigfVar = this.a;
                if (!((baad) obj).G().isEmpty()) {
                    cigfVar.b = chyu.COMPLETED;
                }
            }
        });
        return cqkl.a;
    }

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: cige
            private final cigf a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                cigf cigfVar = (cigf) obj2;
                dpvc dpvcVar = this.a.a.c;
                if (dpvcVar == null) {
                    dpvcVar = dpvc.c;
                }
                dpvc dpvcVar2 = cigfVar.a.c;
                if (dpvcVar2 == null) {
                    dpvcVar2 = dpvc.c;
                }
                return dpvcVar.equals(dpvcVar2);
            }
        });
    }

    @Override // defpackage.cigc
    public Boolean f() {
        chxp chxpVar = this.e.i;
        if (chxpVar == null) {
            chxpVar = chxp.k;
        }
        return Boolean.valueOf(chxpVar.j);
    }

    @Override // defpackage.cigc
    public cqsn g() {
        return new cqvf(R.string.ADD_LIST_DESCRIPTION_TASK_ADD_DESCRIPTION_CONTENT_DESCRIPTION, this.f.E(this.c.getApplicationContext()));
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        dpvc dpvcVar = this.a.c;
        if (dpvcVar == null) {
            dpvcVar = dpvc.c;
        }
        objArr[0] = dpvcVar;
        objArr[1] = chxj.ADD_LIST_DESCRIPTION;
        return Arrays.hashCode(objArr);
    }
}
