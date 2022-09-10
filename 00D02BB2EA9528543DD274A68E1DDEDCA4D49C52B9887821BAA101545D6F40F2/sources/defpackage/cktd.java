package defpackage;
/* compiled from: PG */
/* renamed from: cktd  reason: default package */
/* loaded from: classes4.dex */
public final class cktd {
    @dzsi
    public cktc b;
    public final ckuv c;
    public final btrm d;
    public boolean e;
    public boolean f;
    public boolean g;
    private final asik j;
    private boolean k;
    private boolean l;
    public final Object a = new Object();
    public final cktb h = new cktb(this);
    public final ckta i = new ckta(this);

    public cktd(ckuv ckuvVar, btrm btrmVar, asik asikVar) {
        dbsk.s(ckuvVar);
        this.c = ckuvVar;
        dbsk.s(btrmVar);
        this.d = btrmVar;
        dbsk.s(asikVar);
        this.j = asikVar;
    }

    public final void a() {
        this.d.a(this.h);
        this.g = false;
        this.k = false;
        b();
    }

    public final void b() {
        boolean z = false;
        if (this.f && !this.g && !this.k) {
            z = true;
        }
        if (z == this.l) {
            return;
        }
        this.l = z;
        if (z) {
            final ckua ckuaVar = (ckua) this.b;
            ckuf ckufVar = ckuaVar.b;
            ckufVar.g.a(ckufVar.h);
            ckuf ckufVar2 = ckuaVar.b;
            btrm btrmVar = ckufVar2.a;
            ckud ckudVar = ckufVar2.l;
            dceq a = dcet.a();
            a.b(crhp.class, new ckug(crhp.class, ckudVar, bvrj.WEARABLE_DATA));
            btrmVar.g(ckudVar, a.a());
            ckuf ckufVar3 = ckuaVar.b;
            ckuv ckuvVar = ckufVar3.c;
            ckuc ckucVar = ckufVar3.n;
            dbsk.s(ckucVar);
            ckuvVar.b.add(ckucVar);
            ckuaVar.b.b.b(new Runnable(ckuaVar) { // from class: ckty
                private final ckua a;

                {
                    this.a = ckuaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ckua ckuaVar2 = this.a;
                    ckuaVar2.a = new ckue(ckuaVar2.b);
                    ckuaVar2.a.a();
                }
            }, bvrj.WEARABLE_DATA);
            return;
        }
        final ckua ckuaVar2 = (ckua) this.b;
        ckuf ckufVar4 = ckuaVar2.b;
        ckuv ckuvVar2 = ckufVar4.c;
        ckuc ckucVar2 = ckufVar4.n;
        dbsk.s(ckucVar2);
        dbsk.l(ckuvVar2.b.remove(ckucVar2));
        ckuf ckufVar5 = ckuaVar2.b;
        ckufVar5.a.a(ckufVar5.l);
        ckuaVar2.b.b.b(new Runnable(ckuaVar2) { // from class: cktz
            private final ckua a;

            {
                this.a = ckuaVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ckua ckuaVar3 = this.a;
                ckuaVar3.a.a = true;
                ckuaVar3.a = null;
                ckuf ckufVar6 = ckuaVar3.b;
                ckufVar6.i = false;
                ckufVar6.k = null;
                ckufVar6.j = null;
                ckufVar6.a();
            }
        }, bvrj.WEARABLE_DATA);
    }

    public final void c() {
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.k = this.j.a();
            b();
        }
    }
}
