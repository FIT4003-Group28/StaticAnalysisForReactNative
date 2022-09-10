package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ebx  reason: default package */
/* loaded from: classes6.dex */
public class ebx implements ebk {
    public final gga a;
    public final dkfv b;
    public final ebu c;
    private final ebn d;
    private final List<ebj> e;
    @dzsi
    private final jad f;
    private jib g;

    public ebx(gga ggaVar, eco ecoVar, eci eciVar, ecq ecqVar, dkfv dkfvVar, ebu ebuVar) {
        dcdc f;
        dkfr dkfrVar;
        ecp ecpVar;
        this.a = ggaVar;
        this.d = ecoVar.a(dkfvVar, null);
        dkgl dkglVar = dkfvVar.d;
        int i = (dkglVar == null ? dkgl.d : dkglVar).a;
        dkgf dkgfVar = dkfvVar.c;
        int size = (dkgfVar == null ? dkgf.c : dkgfVar).a.size() - 1;
        dkgf dkgfVar2 = dkfvVar.c;
        int i2 = 2;
        if ((dkgfVar2 == null ? dkgf.c : dkgfVar2).a.size() == 0) {
            f = dcdc.e();
        } else {
            dccx F = dcdc.F();
            dkgf dkgfVar3 = dkfvVar.c;
            for (dkfr dkfrVar2 : (dkgfVar3 == null ? dkgf.c : dkgfVar3).a.get(size > i ? i + 1 : i).b) {
                F.g(dkfrVar2.a);
            }
            dccx F2 = dcdc.F();
            dcdc f2 = F.f();
            int size2 = f2.size();
            int i3 = 0;
            while (i3 < size2) {
                dspd dspdVar = (dspd) f2.get(i3);
                dkfr a = eci.a(dspdVar, i, dkfvVar);
                if (size > i) {
                    dkfrVar = eci.a(dspdVar, i + 1, dkfvVar);
                } else {
                    dkfrVar = dkfr.d;
                }
                if (size <= i || ebp.a(dkfrVar)) {
                    dkgl dkglVar2 = dkfvVar.d;
                    dkglVar2 = dkglVar2 == null ? dkgl.d : dkglVar2;
                    ebr.a(dkglVar2, 1);
                    ebr.a(a, i2);
                    ebr.a(dkfrVar, 3);
                    F2.g(new ebq(dkglVar2, a, dkfrVar));
                }
                i3++;
                i2 = 2;
            }
            f = F2.f();
        }
        this.e = f;
        cjtd f3 = this.d.f();
        dkgf dkgfVar4 = dkfvVar.c;
        if ((dkgfVar4 == null ? dkgf.c : dkgfVar4).b.size() == 0) {
            ecpVar = null;
        } else {
            dkgf dkgfVar5 = dkfvVar.c;
            dkgd dkgdVar = (dkgfVar5 == null ? dkgf.c : dkgfVar5).b.get(0);
            cafi a2 = ecqVar.a.a();
            ecq.a(a2, 1);
            ecq.a(ecqVar.b.a(), 2);
            ecq.a(ecqVar.c.a(), 3);
            Resources a3 = ecqVar.d.a();
            ecq.a(a3, 4);
            chnm a4 = ecqVar.e.a();
            ecq.a(a4, 5);
            ceet a5 = ecqVar.f.a();
            ecq.a(a5, 6);
            ecq.a(dkgdVar, 7);
            ecq.a(f3, 8);
            ecpVar = new ecp(a2, a3, a4, a5, dkgdVar, f3);
        }
        this.f = ecpVar;
        this.b = dkfvVar;
        this.c = ebuVar;
        this.g = g(false, ggaVar);
    }

    private static jib g(boolean z, Activity activity) {
        jhz e = jib.f(activity, activity.getString(R.string.BADGES_DETAILS_PAGE_TITLE)).e();
        e.q = irg.a();
        e.u = irg.b();
        e.i = cqrt.g(2131231588, irg.b());
        e.x = z;
        return e.b();
    }

    @Override // defpackage.ebk
    public ebn a() {
        return this.d;
    }

    @Override // defpackage.ebk
    public List<ebj> b() {
        return this.e;
    }

    @Override // defpackage.ebk
    public jib c() {
        return this.g;
    }

    @Override // defpackage.ebk
    @dzsi
    public jad d() {
        return this.f;
    }

    @Override // defpackage.ebk
    public jad e() {
        return new ebw(this);
    }

    public void f(boolean z) {
        this.g = g(z, this.a);
        cqkx.p(this);
    }
}
