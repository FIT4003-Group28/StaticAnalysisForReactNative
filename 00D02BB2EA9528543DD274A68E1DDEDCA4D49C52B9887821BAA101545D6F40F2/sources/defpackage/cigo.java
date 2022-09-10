package defpackage;

import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cigo  reason: default package */
/* loaded from: classes4.dex */
public class cigo extends cibj implements cigm, chyv {
    public final chvw a;
    private final gga b;
    private final chrx c;
    private final baad d;
    private final chyu e;

    public cigo(gga ggaVar, axwi axwiVar, chrx chrxVar, chxl chxlVar, chvw chvwVar) {
        super(chxlVar);
        this.e = chyu.VISIBLE;
        this.b = ggaVar;
        dpot dpotVar = chxlVar.e;
        this.d = axwiVar.c(dpotVar == null ? dpot.m : dpotVar);
        this.c = chrxVar;
        this.a = chvwVar;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return this.e;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.UNKNOWN;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    @Override // defpackage.cigm
    public cqkl e() {
        this.c.U(this.d);
        return cqkl.a;
    }

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: cign
            private final cigo a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                cigo cigoVar = (cigo) obj2;
                dpvc dpvcVar = this.a.a.c;
                if (dpvcVar == null) {
                    dpvcVar = dpvc.c;
                }
                dpvc dpvcVar2 = cigoVar.a.c;
                if (dpvcVar2 == null) {
                    dpvcVar2 = dpvc.c;
                }
                return dpvcVar.equals(dpvcVar2);
            }
        });
    }

    @Override // defpackage.cigm
    public CharSequence f() {
        return this.b.getApplicationContext().getString(R.string.ADD_LIST_ITEMS_TASK_ADD_PLACES_CONTENT_DESCRIPTION, this.d.E(this.b.getApplicationContext()));
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        dpvc dpvcVar = this.a.c;
        if (dpvcVar == null) {
            dpvcVar = dpvc.c;
        }
        objArr[0] = dpvcVar;
        objArr[1] = chxj.ADD_LIST_ITEMS;
        return Arrays.hashCode(objArr);
    }
}
