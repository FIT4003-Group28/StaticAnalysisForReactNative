package defpackage;
/* compiled from: PG */
/* renamed from: cty  reason: default package */
/* loaded from: classes5.dex */
public final class cty implements beia {
    public final btpc a;
    public final ckhe b;
    public final ctw c;
    private final cvv d;
    private final dujz e;
    private final cjqy f;

    public cty(dujz dujzVar, btpc btpcVar, ckcw ckcwVar, cvv cvvVar, ctw ctwVar, cjqy cjqyVar) {
        this.e = dujzVar;
        this.d = cvvVar;
        this.a = btpcVar;
        this.b = (ckhe) ckcwVar.a(ckfc.d);
        this.c = ctwVar;
        this.f = cjqyVar;
    }

    private final dbsg<String> d(ilo iloVar) {
        dbsg<String> e = ctw.e(iloVar);
        return e.a() ? e : this.c.a(iloVar);
    }

    @Override // defpackage.beia
    public final boolean a(ilo iloVar) {
        return d(iloVar).a();
    }

    public final void b(ddda dddaVar, dbsg<cjqm> dbsgVar) {
        cjsx i = cjsy.i();
        i.b(dddaVar);
        cjsy a = i.a();
        if (dbsgVar.a()) {
            this.f.K(a, dbsgVar.b());
        } else {
            this.f.k(a);
        }
    }

    @Override // defpackage.beia
    public final void c(ilo iloVar, bmdn bmdnVar, dbsg<cjqm> dbsgVar) {
        dbsg<Integer> i;
        dbsg<String> d = d(iloVar);
        if (d.a()) {
            this.b.a();
            ctw ctwVar = this.c;
            if (!ctw.e(iloVar).a()) {
                if (ctwVar.c(iloVar).a()) {
                    i = dbsg.i(101483);
                } else {
                    i = ctw.d(iloVar).a() ? dbsg.i(101482) : dbpy.a;
                }
            } else {
                i = dbsg.i(101484);
            }
            dbsg<Integer> dbsgVar2 = i;
            dbsg<Integer> i2 = dbsg.i(51);
            cvv cvvVar = this.d;
            String b = d.b();
            ctx ctxVar = new ctx(this, dbsgVar, bmdnVar);
            btyr bZ = btys.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            btys btysVar = (btys) bZ.b;
            int i3 = btysVar.a | 2;
            btysVar.a = i3;
            btysVar.c = 1;
            int i4 = this.e.m;
            btysVar.a = i3 | 4;
            btysVar.d = i4;
            cvvVar.d(b, dbsgVar2, i2, ctxVar, bZ.bK());
            return;
        }
        bmdnVar.b();
    }
}
