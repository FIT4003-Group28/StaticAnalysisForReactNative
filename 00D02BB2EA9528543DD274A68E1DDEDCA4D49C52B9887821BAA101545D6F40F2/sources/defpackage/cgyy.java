package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgyy  reason: default package */
/* loaded from: classes4.dex */
public class cgyy implements cagf {
    private final cgyx a;
    private final cafw b;

    public cgyy(cgyx cgyxVar, dwrc dwrcVar) {
        this.a = cgyxVar;
        dwqz dwqzVar = dwrcVar.c;
        this.b = new cgzh(dwqzVar == null ? dwqz.g : dwqzVar);
    }

    @Override // defpackage.cagf
    public String a() {
        return this.b.a();
    }

    @Override // defpackage.cagf
    public String b() {
        cgzh cgzhVar = (cgzh) this.b;
        dwqz dwqzVar = cgzhVar.a;
        if ((dwqzVar.a & 8) != 0) {
            dwqw dwqwVar = dwqzVar.e;
            if (dwqwVar == null) {
                dwqwVar = dwqw.c;
            }
            if ((dwqwVar.a & 1) != 0) {
                dwqw dwqwVar2 = cgzhVar.a.e;
                if (dwqwVar2 == null) {
                    dwqwVar2 = dwqw.c;
                }
                return dwqwVar2.b;
            }
        }
        return cgzhVar.a.c;
    }

    @Override // defpackage.cagf
    public Integer c() {
        return Integer.valueOf((int) R.string.UGC_TASKS_SEE_PLACES_BUTTON);
    }

    @Override // defpackage.cagf
    public jic d() {
        return this.b.c();
    }

    @Override // defpackage.cagf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.cagf
    public cqkl f() {
        cgde cgdeVar = (cgde) this.a;
        cgdv cgdvVar = cgdeVar.a;
        cgdeVar.b.dismiss();
        if (cgdvVar.e.H() != null) {
            cgdvVar.bE();
            cgdvVar.at.B(jjn.EXPANDED);
        }
        return cqkl.a;
    }
}
