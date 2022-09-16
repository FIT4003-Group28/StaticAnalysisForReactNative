package defpackage;
/* compiled from: PG */
/* renamed from: pas  reason: default package */
/* loaded from: classes4.dex */
final class pas extends pat {
    final /* synthetic */ pau a;
    private final pcs b = new pcs(new byte[5]);
    private final pct c = new pct();
    private final int d;
    private int e;
    private int f;
    private int g;

    public pas(pau pauVar, int i) {
        this.a = pauVar;
        this.d = i;
    }

    @Override // defpackage.pat
    public final void a(pct pctVar, boolean z, oxr oxrVar) {
        pab padVar;
        int i = 12;
        if (z) {
            pctVar.A(pctVar.h());
            pctVar.t(this.b, 3);
            this.b.e(12);
            this.e = this.b.a(12);
            this.f = 0;
            this.g = pcx.t(this.b.a, 3, -1);
            this.c.w(this.e);
        }
        int min = Math.min(pctVar.a(), this.e - this.f);
        pctVar.u(this.c.a, this.f, min);
        int i2 = this.f + min;
        this.f = i2;
        int i3 = this.e;
        if (i2 >= i3 && pcx.t(this.c.a, i3, this.g) == 0) {
            this.c.A(7);
            this.c.t(this.b, 2);
            this.b.e(4);
            int a = this.b.a(12);
            this.c.A(a);
            int i4 = ((this.e - 9) - a) - 4;
            while (i4 > 0) {
                int i5 = 5;
                this.c.t(this.b, 5);
                int a2 = this.b.a(8);
                this.b.e(3);
                int a3 = this.b.a(13);
                this.b.e(4);
                int a4 = this.b.a(i);
                if (a2 == 6) {
                    pct pctVar2 = this.c;
                    int i6 = pctVar2.b + a4;
                    int i7 = -1;
                    while (true) {
                        if (pctVar2.b >= i6) {
                            break;
                        }
                        int h = pctVar2.h();
                        int h2 = pctVar2.h();
                        if (h != i5) {
                            if (h == 106) {
                                i7 = 129;
                            } else if (h == 122) {
                                i7 = 135;
                            } else if (h == 123) {
                                i7 = 138;
                            }
                            pctVar2.A(h2);
                            i5 = 5;
                        } else {
                            long n = pctVar2.n();
                            if (n == pau.a) {
                                i7 = 129;
                            } else if (n == pau.b) {
                                i7 = 135;
                            } else if (n == pau.c) {
                                i7 = 36;
                            }
                        }
                    }
                    pctVar2.z(i6);
                    a2 = i7;
                } else {
                    this.c.A(a4);
                }
                i4 -= a4 + 5;
                if (!this.a.f.get(a3)) {
                    if (a2 == 2) {
                        padVar = new pad(oxrVar.pP(a3));
                    } else if (a2 == 3) {
                        padVar = new pak(oxrVar.pP(a3));
                    } else if (a2 == 4) {
                        padVar = new pak(oxrVar.pP(a3));
                    } else if (a2 == 15) {
                        padVar = new ozz(oxrVar.pP(a3), new oxp());
                    } else if (a2 == 21) {
                        pau pauVar = this.a;
                        int i8 = pauVar.g;
                        pauVar.g = i8 + 1;
                        padVar = new paj(oxrVar.pP(i8));
                    } else if (a2 == 27) {
                        oyf pP = oxrVar.pP(a3);
                        pau pauVar2 = this.a;
                        int i9 = pauVar2.g;
                        pauVar2.g = i9 + 1;
                        padVar = new pag(pP, new pap(oxrVar.pP(i9)));
                    } else if (a2 == 36) {
                        oyf pP2 = oxrVar.pP(a3);
                        pau pauVar3 = this.a;
                        int i10 = pauVar3.g;
                        pauVar3.g = i10 + 1;
                        padVar = new pai(pP2, new pap(oxrVar.pP(i10)));
                    } else if (a2 != 135) {
                        if (a2 != 138) {
                            if (a2 == 129) {
                                padVar = new ozx(oxrVar.pP(a3), false);
                            } else if (a2 != 130) {
                                padVar = null;
                            }
                        }
                        padVar = new paa(oxrVar.pP(a3));
                    } else {
                        padVar = new ozx(oxrVar.pP(a3), true);
                    }
                    if (padVar != null) {
                        this.a.f.put(a3, true);
                        pau pauVar4 = this.a;
                        pauVar4.e.put(a3, new par(padVar, pauVar4.d));
                    }
                }
                i = 12;
            }
            this.a.e.remove(0);
            this.a.e.remove(this.d);
            oxrVar.pR();
        }
    }

    @Override // defpackage.pat
    public final void b() {
    }
}
