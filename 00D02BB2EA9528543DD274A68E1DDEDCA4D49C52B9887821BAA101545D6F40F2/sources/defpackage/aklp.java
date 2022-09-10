package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: aklp  reason: default package */
/* loaded from: classes2.dex */
public class aklp implements akld {
    private final diin a;
    private final bvpe b;
    private final cjtd c;
    private final List<aklg> d;
    private final absg e;
    @dzsi
    private final aklg f;
    @dzsi
    private final jic g;
    @dzsi
    private final aklc h;

    public aklp(diin diinVar, dpwr dpwrVar, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, @dzsi acwt acwtVar, absg absgVar, cqat cqatVar, aklw aklwVar, aklo akloVar) {
        this.a = diinVar;
        this.b = new bvpe(cqatVar);
        this.c = cjtd.a(ddhoVar);
        this.e = absgVar;
        int a = diim.a(diinVar.f);
        int i = 3;
        if (a != 0 && a == 2) {
            i = 2;
        }
        dccx F = dcdc.F();
        akln aklnVar = null;
        aklv aklvVar = null;
        int i2 = 0;
        for (dhxu dhxuVar : diinVar.e) {
            djsa bZ = djsd.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djsd djsdVar = (djsd) bZ.b;
            dhxuVar.getClass();
            djsdVar.b = dhxuVar;
            int i3 = 1 | djsdVar.a;
            djsdVar.a = i3;
            djsdVar.c = i - 1;
            djsdVar.a = i3 | 2;
            djsd bK = bZ.bK();
            if (aklvVar == null) {
                dqja dqjaVar = dhxuVar.r;
                if ((dqjaVar == null ? dqja.g : dqjaVar).c) {
                    aklvVar = aklwVar.a(bK, dpwrVar, ddhoVar2, 0, dbpy.a);
                }
            }
            F.g(aklwVar.a(bK, dpwrVar, ddhoVar2, i2, dbpy.a));
            i2++;
        }
        dcdc<aklg> f = F.f();
        this.d = f;
        this.f = aklvVar;
        if (aklvVar != null) {
            int i4 = 1;
            for (aklg aklgVar : f) {
                aklgVar.n(i4);
                i4++;
            }
        }
        diik diikVar = diinVar.d;
        String str = (diikVar == null ? diik.c : diikVar).a;
        this.g = !str.isEmpty() ? new jic(str, ckqc.FULLY_QUALIFIED, (cqtd) null, 0) : null;
        if ((diinVar.a & 32) != 0) {
            dpsf dpsfVar = diinVar.g;
            dpsfVar = dpsfVar == null ? dpsf.d : dpsfVar;
            aklo.a(dpsfVar, 1);
            aklt a2 = akloVar.a.a();
            aklo.a(a2, 4);
            aklnVar = new akln(dpsfVar, acwtVar, ddhoVar, a2);
        }
        this.h = aklnVar;
    }

    @Override // defpackage.aklb
    public cjtd a() {
        return this.c;
    }

    @Override // defpackage.akld
    public List<aklg> b() {
        return this.d;
    }

    @Override // defpackage.akld
    @dzsi
    public aklg c(int i) {
        if (this.d.size() < i + 1) {
            return null;
        }
        return this.d.get(i);
    }

    @Override // defpackage.akld
    @dzsi
    public CharSequence d() {
        return this.a.b;
    }

    @Override // defpackage.akld
    public cjtd e() {
        return cjtd.a(this.e == absg.AREA_EXPLORE ? dtxj.cg : dtxr.L);
    }

    @Override // defpackage.akld
    public cqkl f(cjqm cjqmVar) {
        if (j() == null || j().b() == null) {
            return cqkl.a;
        }
        return j().b().b(cjqmVar);
    }

    @Override // defpackage.akld
    @dzsi
    public CharSequence g() {
        return this.a.c;
    }

    @Override // defpackage.akld
    @dzsi
    public jic h() {
        return this.g;
    }

    @Override // defpackage.akld
    public View.OnAttachStateChangeListener i() {
        return this.b.b;
    }

    @Override // defpackage.akld
    @dzsi
    public aklc j() {
        return this.h;
    }

    @Override // defpackage.akld
    @dzsi
    public aklg k() {
        return this.f;
    }
}
