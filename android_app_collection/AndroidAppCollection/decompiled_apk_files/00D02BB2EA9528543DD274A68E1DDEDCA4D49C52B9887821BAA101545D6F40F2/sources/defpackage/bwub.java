package defpackage;
/* compiled from: PG */
/* renamed from: bwub  reason: default package */
/* loaded from: classes4.dex */
public final class bwub<T> extends btrh<T> {
    private final int d;

    public bwub(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        boolean z = true;
        if (i == 0) {
            bwty bwtyVar = (bwty) this.a;
            if (((alhw) obj).a != alje.FIRST_FINGER_DOWN) {
                z = false;
            }
            bwtyVar.t = z;
            if (z) {
                bwtyVar.v = false;
                bwtyVar.u = false;
                bwtyVar.w = bwtyVar.k.k();
            } else if (!bwtyVar.v) {
                if (!bwtyVar.u) {
                    return;
                }
                bwtyVar.c(new cjte(deaf.DRAG));
            } else if (bwtyVar.k.k() > bwtyVar.w) {
                bwtyVar.c(new cjte(deaf.PINCH_OPEN));
            } else {
                bwtyVar.c(new cjte(deaf.PINCH_CLOSED));
            }
        } else if (i == 1) {
            bwty bwtyVar2 = (bwty) this.a;
            alhl alhlVar = (alhl) obj;
            if (!bwtyVar2.t) {
                return;
            }
            bwtyVar2.u = true;
        } else if (i == 2) {
            bwty bwtyVar3 = (bwty) this.a;
            alhx alhxVar = (alhx) obj;
            if (!bwtyVar3.t) {
                return;
            }
            bwtyVar3.v = true;
        } else if (i == 3) {
            bwty bwtyVar4 = (bwty) this.a;
            bwtyVar4.c(new cjte(deaf.LONG_PRESS));
            bwtyVar4.y = ((alhk) obj).a.S();
            bwtyVar4.l.c(bwtyVar4.y, true, new bwtu(bwtyVar4));
        } else {
            bwty bwtyVar5 = (bwty) this.a;
            alaq alaqVar = ((alho) obj).a;
            if (!(alaqVar instanceof alap)) {
                return;
            }
            ily ilyVar = new ily();
            ilyVar.i((alap) alaqVar);
            ilo d = ilyVar.d();
            if (d.aj() != null) {
                bwtyVar5.h.s();
            }
            deig d2 = deig.d();
            befu p = befv.p();
            p.g(false);
            p.j(bwrs.a(d));
            bwtyVar5.j.f(new bwtw(d2), p.m());
            deha.q(d2, new bwtv(bwtyVar5), bwtyVar5.d);
        }
    }
}
