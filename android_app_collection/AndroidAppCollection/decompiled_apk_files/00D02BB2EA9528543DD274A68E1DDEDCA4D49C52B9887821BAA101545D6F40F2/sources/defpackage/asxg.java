package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: asxg  reason: default package */
/* loaded from: classes2.dex */
public final class asxg implements asmo {
    public final btyh a;
    boolean b = true;
    boolean c = true;
    final asxv d = new asxf(this);
    private final gga e;
    private final btrm f;
    private final asmm g;
    private final asxw h;

    public asxg(gga ggaVar, btrm btrmVar, asmm asmmVar, asxw asxwVar, btyh btyhVar) {
        this.e = ggaVar;
        this.f = btrmVar;
        this.g = asmmVar;
        dbsk.t(asxwVar, "stateController");
        this.h = asxwVar;
        this.a = btyhVar;
    }

    @Override // defpackage.asmo
    public final void NZ(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void b() {
        btrm btrmVar = this.f;
        dceq a = dcet.a();
        a.b(gdt.class, new asxh(gdt.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.h.F(this.d);
    }

    @Override // defpackage.asmo
    public final void c() {
        this.h.G(this.d);
        this.f.a(this);
    }

    public final void g() {
        aslt.g(this.e, this.g, this.b, false, false, this.c, 0);
    }
}
