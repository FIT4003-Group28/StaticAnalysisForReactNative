package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aohx  reason: default package */
/* loaded from: classes2.dex */
public final class aohx implements bzml {
    @dzsi
    public anhy a;
    private final gga b;
    private final dxio<aohw> c;

    public aohx(gga ggaVar, dxio<aohw> dxioVar) {
        this.b = ggaVar;
        this.c = dxioVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.TIMELINE_INTRO;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        anhy anhyVar = this.a;
        if (anhyVar == null) {
            return false;
        }
        return anhyVar.b() == anhu.FORCE || this.a.b() != anhu.NO;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        anhy anhyVar;
        if (this.c.a().a.w(bvjk.dA, 0L) >= 3 && ((anhyVar = this.a) == null || anhyVar.b() != anhu.FORCE)) {
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        anhy anhyVar;
        if (bzmkVar == bzmk.REPRESSED || (anhyVar = this.a) == null) {
            return false;
        }
        gga ggaVar = this.b;
        anhq j = anhyVar.j();
        j.f(anhu.NO);
        anhy k = j.k();
        aohg aohgVar = new aohg();
        Bundle bundle = new Bundle();
        dsuv.d(bundle, "params", k.r());
        aohgVar.B(bundle);
        ggaVar.D(aohgVar);
        this.a = null;
        return true;
    }
}
