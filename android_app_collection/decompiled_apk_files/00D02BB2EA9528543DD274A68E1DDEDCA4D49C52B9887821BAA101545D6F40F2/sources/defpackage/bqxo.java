package defpackage;
/* compiled from: PG */
/* renamed from: bqxo  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqxo implements amci {
    public final awck a;
    public final int b;
    public volatile boolean c;
    public final String d;
    @dzsi
    private final amcl e;

    public bqxo(awck awckVar, @dzsi amcl amclVar, int i, String str, ckcw ckcwVar) {
        this.a = awckVar;
        this.e = amclVar;
        this.b = i;
        this.d = str;
        new nul(ckcwVar);
    }

    @Override // defpackage.amci
    public final void a() {
    }

    @Override // defpackage.amci
    public final void c(alyh alyhVar, String str, String str2, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amci
    public final void d(amze amzeVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amci
    public final void e(alyh alyhVar, String str, String str2, int i, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amci
    public final void f(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amci
    @dzsi
    public final amze g(alyh alyhVar) {
        if (m(alyhVar)) {
            amzd bZ = amze.o.bZ();
            akry akryVar = akry.ROAD_GRAPH;
            amza a = alym.a(akrw.a(akryVar), alyl.o, akryVar.J, alyhVar, "", "");
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amze amzeVar = (amze) bZ.b;
            a.getClass();
            amzeVar.b = a;
            amzeVar.a |= 1;
            return bZ.bK();
        }
        return null;
    }

    @Override // defpackage.amci
    public final byte[] h(alyh alyhVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amci
    public final boolean i() {
        return false;
    }

    @Override // defpackage.amci
    public final boolean j() {
        return false;
    }

    @Override // defpackage.amci
    public final void k(alyh alyhVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amci
    public final void l() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amcl
    public final boolean m(alyh alyhVar) {
        int i = awck.c - alyhVar.a;
        dbsk.b(i >= 0, Integer.valueOf(i));
        int i2 = alyhVar.b << i;
        int i3 = alyhVar.c << i;
        dnae bZ = dnaf.d.bZ();
        int i4 = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnaf dnafVar = (dnaf) bZ.b;
        dnafVar.a |= 1;
        dnafVar.c = i4;
        dnai bZ2 = dnaj.d.bZ();
        dnac bZ3 = dnad.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnad dnadVar = (dnad) bZ3.b;
        int i5 = dnadVar.a | 1;
        dnadVar.a = i5;
        dnadVar.b = i2;
        dnadVar.a = i5 | 2;
        dnadVar.c = i3;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnaj dnajVar = (dnaj) bZ2.b;
        dnad bK = bZ3.bK();
        bK.getClass();
        dnajVar.b = bK;
        dnajVar.a |= 1;
        dnac bZ4 = dnad.d.bZ();
        int i6 = i2 + 1;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnad dnadVar2 = (dnad) bZ4.b;
        int i7 = dnadVar2.a | 1;
        dnadVar2.a = i7;
        dnadVar2.b = i6;
        dnadVar2.a = i7 | 2;
        dnadVar2.c = i3 + 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnaj dnajVar2 = (dnaj) bZ2.b;
        dnad bK2 = bZ4.bK();
        bK2.getClass();
        dnajVar2.c = bK2;
        dnajVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnaf dnafVar2 = (dnaf) bZ.b;
        dnaj bK3 = bZ2.bK();
        bK3.getClass();
        dsrj<dnaj> dsrjVar = dnafVar2.b;
        if (!dsrjVar.a()) {
            dnafVar2.b = dsqw.cl(dsrjVar);
        }
        dnafVar2.b.add(bK3);
        final dnaf bK4 = bZ.bK();
        byte[] bArr = (byte[]) t(new dbty(this, bK4) { // from class: bqxm
            private final bqxo a;
            private final dnaf b;

            {
                this.a = this;
                this.b = bK4;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a.i(this.b.bS());
            }
        });
        if (bArr != null) {
            try {
                return ((dnah) dsqw.cr(dnah.b, bArr, dsqa.b())).a.size() > 0;
            } catch (dsrm e) {
                bvoo.f(new RuntimeException(e));
            }
        }
        return false;
    }

    @Override // defpackage.amcl
    @dzsi
    public alyg n(alyh alyhVar) {
        if (this.e != null) {
            int i = awck.c - alyhVar.a;
            dbsk.b(i >= 0, Integer.valueOf(i));
            byte[] bArr = (byte[]) t(new bqxn(this, alyhVar.b << i, alyhVar.c << i));
            if (bArr != null) {
                try {
                    try {
                        dmzl dmzlVar = (dmzl) dsqw.cq(dmzl.f, bArr);
                        dmzt dmztVar = dmzlVar.a;
                        if (dmztVar == null) {
                            dmztVar = dmzt.e;
                        }
                        if (dmztVar.b > 0) {
                            return new bqxq(dmzlVar, (bqyj) this.e);
                        }
                        dmzt dmztVar2 = dmzlVar.a;
                        if (dmztVar2 == null) {
                            dmztVar2 = dmzt.e;
                        }
                        if (dmztVar2.bE == -1) {
                            dmztVar2.bE = dsst.a.b(dmztVar2).e(dmztVar2);
                        }
                        return null;
                    } catch (dsrm e) {
                        bvoo.f(new RuntimeException(e));
                    }
                } catch (OutOfMemoryError unused) {
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.amcl
    public final void o(alyh alyhVar, alyg alygVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amcl
    public final void p(alyh alyhVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amcl
    public final boolean q(alyg alygVar) {
        return false;
    }

    public abstract boolean s();

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public final <T> T t(dbty<T> dbtyVar) {
        return (T) this.a.Qu(dbtyVar);
    }
}
