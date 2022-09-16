package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: arpq  reason: default package */
/* loaded from: classes2.dex */
public final class arpq extends afhx {
    private final cjqy a;
    private final dxio<ascb> b;
    private final asim c;
    private final asik d;
    private final dxio<ckcw> e;

    public arpq(Intent intent, @dzsi String str, cjqy cjqyVar, dxio<ascb> dxioVar, asim asimVar, asik asikVar, dxio<ckcw> dxioVar2) {
        super(intent, str, afid.ENROUTE);
        this.a = cjqyVar;
        this.b = dxioVar;
        this.c = asimVar;
        this.d = asikVar;
        this.e = dxioVar2;
    }

    @Override // defpackage.afhx
    public final void a() {
        afia b = new afin().b(this.f, this.g);
        String str = b.b;
        boolean p = this.b.a().p();
        astd s = aste.s();
        assw asswVar = (assw) s;
        asswVar.a = cjqg.b(this.a);
        asswVar.b = str;
        s.d(dbsj.e(str));
        s.f(dtyb.az);
        s.h(b.D);
        drpm drpmVar = b.E.b;
        if (drpmVar == null) {
            drpmVar = drpm.c;
        }
        drph drphVar = drpmVar.b;
        if (drphVar == null) {
            drphVar = drph.c;
        }
        s.i(drphVar);
        asswVar.h = p ? 2 : 1;
        s.b(b.Q);
        aste a = s.a();
        if (this.d.a()) {
            this.c.j(this.b, a);
            ((ckco) this.e.a().a(ckee.x)).a(asij.a(8));
            return;
        }
        if (p) {
            cjqy cjqyVar = this.a;
            cjsx i = cjsy.i();
            i.b(ddda.dT);
            cjqyVar.k(i.a());
        }
        this.b.a().l(a);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_SEARCH_ALONG_ROUTE;
    }
}
