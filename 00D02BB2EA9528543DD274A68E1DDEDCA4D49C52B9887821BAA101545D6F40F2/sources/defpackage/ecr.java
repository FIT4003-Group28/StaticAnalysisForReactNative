package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ecr  reason: default package */
/* loaded from: classes6.dex */
public class ecr implements ebo {
    private static final eaow a = eaow.e(80);
    private final String b;
    private final String c;
    private final List<String> d;
    private final boolean e;

    public ecr(dkgh dkghVar, boolean z) {
        dkgn dkgnVar = dkghVar.c;
        this.b = (dkgnVar == null ? dkgn.h : dkgnVar).d;
        dkgn dkgnVar2 = dkghVar.c;
        this.c = (dkgnVar2 == null ? dkgn.h : dkgnVar2).b;
        dccx F = dcdc.F();
        for (dkfr dkfrVar : dkghVar.b) {
            if (ebp.a(dkfrVar)) {
                dkgn dkgnVar3 = dkfrVar.c;
                F.g((dkgnVar3 == null ? dkgn.h : dkgnVar3).c);
            }
        }
        this.d = F.f();
        this.e = z;
    }

    @Override // defpackage.ebo
    public jic a() {
        return new jic(this.b, ckqc.FIFE_MERGE, (cqtd) null, (int) a.b);
    }

    @Override // defpackage.ebo
    public String b() {
        return this.c;
    }

    @Override // defpackage.ebo
    public List<jbi> c() {
        dccx F = dcdc.F();
        for (String str : this.d) {
            F.g(new iyb(str));
        }
        return F.f();
    }

    @Override // defpackage.ebo
    public Boolean d() {
        return Boolean.valueOf(this.e);
    }
}
