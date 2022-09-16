package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aaxs  reason: default package */
/* loaded from: classes2.dex */
public class aaxs implements aawu {
    private static final dcqe a = dcqe.c("aaxs");
    @dzsi
    private jic b;
    @dzsi
    private final dnpq c;
    private final dxio<afha> d;
    private final String e;
    private final String f;
    private final cjtd g;
    private final List<aawv> h = new ArrayList();
    private final Activity i;

    public aaxs(dxio<afha> dxioVar, aaxv aaxvVar, Activity activity, dpzw dpzwVar) {
        jic jicVar = null;
        this.b = null;
        this.d = dxioVar;
        this.i = activity;
        String str = dpzwVar.a;
        dnpq dnpqVar = dpzwVar.c;
        this.c = dnpqVar == null ? dnpq.g : dnpqVar;
        this.e = dpzwVar.b;
        dpyl dpylVar = dpzwVar.d;
        this.f = (dpylVar == null ? dpyl.c : dpylVar).a;
        dpyl dpylVar2 = dpzwVar.d;
        int min = Math.min(3, (dpylVar2 == null ? dpyl.c : dpylVar2).b.size());
        for (int i = 0; i < min; i++) {
            List<aawv> list = this.h;
            dpyl dpylVar3 = dpzwVar.d;
            if (dpylVar3 == null) {
                dpylVar3 = dpyl.c;
            }
            dpyk dpykVar = dpylVar3.b.get(i);
            dxio a2 = ((dxjh) aaxvVar.a).a();
            aaxv.a(a2, 1);
            Activity activity2 = (Activity) ((dxjd) aaxvVar.b).a;
            aaxv.a(activity2, 2);
            aaxv.a(dpykVar, 3);
            list.add(new aaxu(a2, activity2, dpykVar));
        }
        this.b = !str.isEmpty() ? new jic(str, ckqc.FULLY_QUALIFIED, 2131233000, 250) : jicVar;
        cjta b = cjtd.b();
        b.d = dtxo.bE;
        if (this.c.b.isEmpty()) {
            bvoo.h("Participant's loggedlink doesn't have VED.", new Object[0]);
        } else {
            b.g(this.c.b);
        }
        this.g = b.a();
    }

    @Override // defpackage.aawu
    public Boolean a() {
        boolean z = false;
        if (this.b != null && !this.e.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aawu
    @dzsi
    public jic b() {
        return this.b;
    }

    @Override // defpackage.aawu
    public cqkl c() {
        if (this.c == null) {
            bvoo.h("Participant's loggedlink is null.", new Object[0]);
        } else {
            this.d.a().m(this.c.c, 4);
        }
        return cqkl.a;
    }

    @Override // defpackage.aawu
    public cjtd d() {
        return this.g;
    }

    @Override // defpackage.aawu
    public String e() {
        return this.e;
    }

    @Override // defpackage.aawu
    public String f() {
        return this.f;
    }

    @Override // defpackage.aawu
    public List<aawv> g() {
        return this.h;
    }

    @Override // defpackage.aawu
    public CharSequence h() {
        return this.i.getString(aaai.EXPERIENCE_SHEET_ARTIST_ACCESSIBILITY, new Object[]{this.e});
    }
}
