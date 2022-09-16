package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: asbo  reason: default package */
/* loaded from: classes2.dex */
public final class asbo implements crha {
    public final cqat a;
    @dzsi
    public arrg b;
    private final Executor d;
    private final aryc h;
    private eaow e = eaow.a;
    public eaow c = eaow.a;
    private eaow f = eaow.a;
    private final crzp<arrg> g = new asbn(this);

    public asbo(cqat cqatVar, Executor executor, aryc arycVar) {
        this.a = cqatVar;
        this.d = executor;
        this.h = arycVar;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        d();
        this.e = eaow.e(this.a.b());
        this.h.a().a(this.g, this.d);
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.h.a().c(this.g);
    }

    @Override // defpackage.crha
    public final void c(ddnt ddntVar) {
        arrg arrgVar = this.b;
        if (arrgVar == null) {
            ddnx bZ = ddny.d.bZ();
            ddnk ddnkVar = ddnk.NAVIGATION_MEDIA_INTEGRATION_PROVIDER_NONE;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddny ddnyVar = (ddny) bZ.b;
            ddnyVar.b = ddnkVar.i;
            int i = 1 | ddnyVar.a;
            ddnyVar.a = i;
            ddnyVar.a = i | 2;
            ddnyVar.c = false;
            ddny bK = bZ.bK();
            if (ddntVar.c) {
                ddntVar.bF();
                ddntVar.c = false;
            }
            ddom ddomVar = (ddom) ddntVar.b;
            ddom ddomVar2 = ddom.aj;
            bK.getClass();
            ddomVar.z = bK;
            ddomVar.a |= 268435456;
            return;
        }
        eaow k = eaow.e(this.a.b()).k(this.e);
        e();
        boolean z = this.f.p(eaow.c(1L)) || (k.q(eaow.c(1L)) && this.f.p(eaow.a));
        ddnx bZ2 = ddny.d.bZ();
        ddnk a = arrgVar.a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddny ddnyVar2 = (ddny) bZ2.b;
        ddnyVar2.b = a.i;
        int i2 = ddnyVar2.a | 1;
        ddnyVar2.a = i2;
        ddnyVar2.a = i2 | 2;
        ddnyVar2.c = z;
        ddny bK2 = bZ2.bK();
        if (ddntVar.c) {
            ddntVar.bF();
            ddntVar.c = false;
        }
        ddom ddomVar3 = (ddom) ddntVar.b;
        ddom ddomVar4 = ddom.aj;
        bK2.getClass();
        ddomVar3.z = bK2;
        ddomVar3.a |= 268435456;
    }

    public final void d() {
        this.c = eaow.a;
        this.f = eaow.a;
        this.b = null;
    }

    public final void e() {
        if (this.c.p(eaow.a)) {
            this.f = this.f.j(eaow.e(this.a.b()).k(this.c));
        }
    }
}
