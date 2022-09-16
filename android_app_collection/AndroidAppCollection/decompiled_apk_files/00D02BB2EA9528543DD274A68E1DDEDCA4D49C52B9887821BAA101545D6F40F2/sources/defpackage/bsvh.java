package defpackage;
/* compiled from: PG */
/* renamed from: bsvh  reason: default package */
/* loaded from: classes4.dex */
final class bsvh implements btzi<dwvn, dwvp> {
    final /* synthetic */ bsvj a;

    public bsvh(bsvj bsvjVar) {
        this.a = bsvjVar;
    }

    private final void c(dpyv dpyvVar, boolean z, boolean z2) {
        aufs aufsVar;
        if (z) {
            aufsVar = aufs.INBOX_ONLY;
        } else {
            aufsVar = z2 ? aufs.DISABLED : aufs.ENABLED;
        }
        this.a.e.e(dpyvVar.dm, aufsVar);
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwvn> btzrVar, btzy btzyVar) {
        this.a.c.b(new btat());
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwvn> btzrVar, dwvp dwvpVar) {
        dwvp dwvpVar2 = dwvpVar;
        doro doroVar = dwvpVar2.a;
        if (doroVar == null) {
            doroVar = doro.f;
        }
        if ((doroVar.a & 8) != 0) {
            doro doroVar2 = dwvpVar2.a;
            if (doroVar2 == null) {
                doroVar2 = doro.f;
            }
            dorm dormVar = doroVar2.b;
            if (dormVar == null) {
                dormVar = dorm.n;
            }
            c(dpyv.RIDDLER, dormVar.c, dormVar.b);
            c(dpyv.PLACE_QA, dormVar.m, dormVar.l);
            c(dpyv.SHARED_LOCATION_RECEIVED, dormVar.e, dormVar.d);
            c(dpyv.PHOTO_TAKEN, dormVar.g, dormVar.f);
            c(dpyv.TODO_PHOTO, dormVar.k, dormVar.j);
            c(dpyv.TIMELINE_VISIT_CONFIRMATION, dormVar.i, dormVar.h);
        }
        doro doroVar3 = dwvpVar2.a;
        if (doroVar3 == null) {
            doroVar3 = doro.f;
        }
        int i = 1;
        if ((doroVar3.a & 8192) != 0) {
            doro doroVar4 = dwvpVar2.a;
            if (doroVar4 == null) {
                doroVar4 = doro.f;
            }
            dnjn dnjnVar = doroVar4.d;
            if (dnjnVar == null) {
                dnjnVar = dnjn.c;
            }
            if ((dnjnVar.a & 1) != 0) {
                this.a.a.T(bvjk.gK, this.a.b.j(), dnjnVar.b);
            }
        }
        doro doroVar5 = dwvpVar2.a;
        if (doroVar5 == null) {
            doroVar5 = doro.f;
        }
        if ((doroVar5.a & 32) != 0) {
            bvjj bvjjVar = this.a.a;
            bvjk bvjkVar = bvjk.dK;
            doro doroVar6 = dwvpVar2.a;
            if (doroVar6 == null) {
                doroVar6 = doro.f;
            }
            dons donsVar = doroVar6.c;
            if (donsVar == null) {
                donsVar = dons.g;
            }
            bvjjVar.S(bvjkVar, donsVar.b);
            bvjj bvjjVar2 = this.a.a;
            bvjk bvjkVar2 = bvjk.dN;
            doro doroVar7 = dwvpVar2.a;
            if (doroVar7 == null) {
                doroVar7 = doro.f;
            }
            dons donsVar2 = doroVar7.c;
            if (donsVar2 == null) {
                donsVar2 = dons.g;
            }
            bvjjVar2.S(bvjkVar2, donsVar2.c);
            bvjj bvjjVar3 = this.a.a;
            bvjk bvjkVar3 = bvjk.dL;
            doro doroVar8 = dwvpVar2.a;
            if (doroVar8 == null) {
                doroVar8 = doro.f;
            }
            dons donsVar3 = doroVar8.c;
            if (donsVar3 == null) {
                donsVar3 = dons.g;
            }
            bvjjVar3.S(bvjkVar3, donsVar3.d);
            bvjj bvjjVar4 = this.a.a;
            bvjk bvjkVar4 = bvjk.dO;
            doro doroVar9 = dwvpVar2.a;
            if (doroVar9 == null) {
                doroVar9 = doro.f;
            }
            dons donsVar4 = doroVar9.c;
            if (donsVar4 == null) {
                donsVar4 = dons.g;
            }
            bvjjVar4.S(bvjkVar4, donsVar4.e);
        }
        doro doroVar10 = dwvpVar2.a;
        if (doroVar10 == null) {
            doroVar10 = doro.f;
        }
        dqfd dqfdVar = doroVar10.e;
        if (dqfdVar == null) {
            dqfdVar = dqfd.e;
        }
        if ((dqfdVar.a & 1) != 0) {
            bvjj bvjjVar5 = this.a.a;
            bvjk bvjkVar5 = bvjk.hL;
            btlu j = this.a.b.j();
            doro doroVar11 = dwvpVar2.a;
            if (doroVar11 == null) {
                doroVar11 = doro.f;
            }
            dqfd dqfdVar2 = doroVar11.e;
            if (dqfdVar2 == null) {
                dqfdVar2 = dqfd.e;
            }
            dqfc b = dqfc.b(dqfdVar2.b);
            if (b == null) {
                b = dqfc.UNKNOWN_VISIBILITY;
            }
            bvjjVar5.T(bvjkVar5, j, b != dqfc.PRIVATE);
        }
        if (this.a.f.getPeopleFollowParameters().a) {
            doro doroVar12 = dwvpVar2.a;
            if (doroVar12 == null) {
                doroVar12 = doro.f;
            }
            dqfd dqfdVar3 = doroVar12.e;
            if (dqfdVar3 == null) {
                dqfdVar3 = dqfd.e;
            }
            if ((dqfdVar3.a & 2) != 0) {
                bvjj bvjjVar6 = this.a.a;
                bvjk bvjkVar6 = bvjk.hM;
                btlu j2 = this.a.b.j();
                doro doroVar13 = dwvpVar2.a;
                if (doroVar13 == null) {
                    doroVar13 = doro.f;
                }
                dqfd dqfdVar4 = doroVar13.e;
                if (dqfdVar4 == null) {
                    dqfdVar4 = dqfd.e;
                }
                int a = dfqg.a(dqfdVar4.c);
                if (a == 0) {
                    a = 1;
                }
                bvjjVar6.X(bvjkVar6, j2, a - 1);
            }
            doro doroVar14 = dwvpVar2.a;
            if (doroVar14 == null) {
                doroVar14 = doro.f;
            }
            dqfd dqfdVar5 = doroVar14.e;
            if (dqfdVar5 == null) {
                dqfdVar5 = dqfd.e;
            }
            if ((dqfdVar5.a & 4) != 0) {
                bvjj bvjjVar7 = this.a.a;
                bvjk bvjkVar7 = bvjk.gY;
                btlu j3 = this.a.b.j();
                doro doroVar15 = dwvpVar2.a;
                if (doroVar15 == null) {
                    doroVar15 = doro.f;
                }
                dqfd dqfdVar6 = doroVar15.e;
                if (dqfdVar6 == null) {
                    dqfdVar6 = dqfd.e;
                }
                int a2 = dfqa.a(dqfdVar6.d);
                if (a2 != 0) {
                    i = a2;
                }
                bvjjVar7.X(bvjkVar7, j3, i - 1);
            }
        }
        this.a.a.aa(bvjk.jU, this.a.b.j(), this.a.g.b());
        this.a.c.b(new btat());
    }
}
