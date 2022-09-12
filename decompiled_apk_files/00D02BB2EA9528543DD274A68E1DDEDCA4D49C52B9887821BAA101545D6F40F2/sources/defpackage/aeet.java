package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aeet  reason: default package */
/* loaded from: classes.dex */
public final class aeet {
    public final List<aebb> a;
    public final dxio<awwq> b;
    public final cjqy c;
    public final cjqu d;
    public aebb e;
    @dzsi
    public cjql f;
    private final dxio<acwo> g;
    private final aedv h;

    public aeet(aedv aedvVar, dxio<aebl> dxioVar, dxio<aebg> dxioVar2, dxio<acwo> dxioVar3, dxio<awwq> dxioVar4, cjqy cjqyVar, acyr acyrVar, cjqq cjqqVar) {
        this.g = dxioVar3;
        this.b = dxioVar4;
        this.c = cjqyVar;
        this.d = new cjqu(cjqyVar, cjqqVar);
        this.h = aedvVar;
        dccx F = dcdc.F();
        if (aedvVar.e(dktk.EXPLORE)) {
            F.g(dxioVar.a());
        }
        if (aedvVar.e(dktk.INFORMAL_TRANSIT)) {
            F.g(dxioVar2.a());
        }
        dcdc f = F.f();
        this.a = f;
        dktk f2 = aedvVar.f();
        aebb c = c(f, f2);
        if (c != null) {
            this.e = c;
            return;
        }
        this.e = (aebb) f.get(0);
        if (acyrVar.c() && f2 == dktk.TRANSPORTATION) {
            return;
        }
        aedvVar.g(this.e.a());
    }

    @dzsi
    public static aebb c(List<aebb> list, dktk dktkVar) {
        for (aebb aebbVar : list) {
            if (aebbVar.a() == dktkVar) {
                return aebbVar;
            }
        }
        return null;
    }

    @dzsi
    public final aebb a() {
        return c(this.a, this.h.f());
    }

    public final void b() {
        this.g.a().i(this.e.e(), null);
    }
}
