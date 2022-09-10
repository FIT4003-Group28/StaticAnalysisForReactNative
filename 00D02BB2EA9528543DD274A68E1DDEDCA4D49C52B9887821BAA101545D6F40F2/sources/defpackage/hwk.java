package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hwk  reason: default package */
/* loaded from: classes.dex */
public final class hwk implements akpx {
    public final iqz a;
    public final akpy b;
    private volatile hwv c;
    private volatile dzsj<btze> d;
    private volatile dzsj<akpg> e;
    private volatile Map<akry, dxio<akpg>> f;
    private volatile buxe g;

    public hwk(iqz iqzVar, akpy akpyVar) {
        this.a = iqzVar;
        this.b = akpyVar;
    }

    private final dzsj<btze> a() {
        dzsj<btze> dzsjVar = this.d;
        if (dzsjVar == null) {
            hwj hwjVar = new hwj(this, 0);
            this.d = hwjVar;
            return hwjVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.akpx
    public final Resources rI() {
        Resources c = this.a.c();
        dxjg.e(c);
        return c;
    }

    @Override // defpackage.akpx
    public final Context rJ() {
        Context b = this.a.b();
        dxjg.e(b);
        return b;
    }

    @Override // defpackage.akpx
    public final akfa rK() {
        akfa rK = this.a.rK();
        dxjg.e(rK);
        return rK;
    }

    @Override // defpackage.akpx
    public final btrm rL() {
        btrm rz = this.a.rz();
        dxjg.e(rz);
        return rz;
    }

    @Override // defpackage.akpx
    public final cjvn rM() {
        cjvn j = this.a.j();
        dxjg.e(j);
        return j;
    }

    @Override // defpackage.akpx
    public final Runnable rN() {
        final btwr sx = this.a.sx();
        dxjg.e(sx);
        sx.getClass();
        return new Runnable(sx) { // from class: hwl
            private final btwr a;

            {
                this.a = sx;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g();
            }
        };
    }

    @Override // defpackage.akpx
    public final btzo<dmxh, dmxv> rP() {
        dxio c = dxjc.c(a());
        bvrb tn = this.a.tn();
        dxjg.e(tn);
        return buwg.b(c, tn);
    }

    @Override // defpackage.akpx
    public final btzp<dxai, dxam> rQ() {
        buxe buxeVar = this.g;
        if (buxeVar == null) {
            dxio c = dxjc.c(a());
            bvrb tn = this.a.tn();
            dxjg.e(tn);
            buxe b = buxg.b(buxf.b(c, tn));
            this.g = b;
            return b;
        }
        return buxeVar;
    }

    @Override // defpackage.akpx
    public final cqat rR() {
        cqat rR = this.a.rR();
        dxjg.e(rR);
        return rR;
    }

    @Override // defpackage.akpx
    public final bvnx rS() {
        bvnx rS = this.a.rS();
        dxjg.e(rS);
        return rS;
    }

    @Override // defpackage.akpx
    public final amqu rT() {
        amqu k = this.a.k();
        dxjg.e(k);
        return k;
    }

    @Override // defpackage.akpx
    public final ckcw rU() {
        ckcw rU = this.a.rU();
        dxjg.e(rU);
        return rU;
    }

    @Override // defpackage.akpx
    public final akwu rV() {
        btvo rp = this.a.rp();
        dxjg.e(rp);
        return hwh.a(rp);
    }

    @Override // defpackage.akpx
    public final bvjj rW() {
        bvjj rB = this.a.rB();
        dxjg.e(rB);
        return rB;
    }

    @Override // defpackage.akpx
    public final bttf rX() {
        bttf aL = this.a.aL();
        dxjg.e(aL);
        return aL;
    }

    @Override // defpackage.akpx
    public final btmv rY() {
        btmv rY = this.a.rY();
        dxjg.e(rY);
        return rY;
    }

    @Override // defpackage.akpx
    public final btmg rZ() {
        btmg aX = this.a.aX();
        dxjg.e(aX);
        return aX;
    }

    @Override // defpackage.akpx, defpackage.gch
    public final gcg sD() {
        gcg sD = this.a.sD();
        dxjg.e(sD);
        return sD;
    }

    @Override // defpackage.akpx, defpackage.ckmw
    public final ckmm sL() {
        ckmm r = this.a.r();
        dxjg.e(r);
        return r;
    }

    @Override // defpackage.akpx, defpackage.bvkt
    public final bvkx sN() {
        bvkx o = this.a.o();
        dxjg.e(o);
        return o;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final crzb sO() {
        crzb sO = this.a.sO();
        dxjg.e(sO);
        return sO;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final crzb sP() {
        crzb sP = this.a.sP();
        dxjg.e(sP);
        return sP;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final crzb sQ() {
        crzb sQ = this.a.sQ();
        dxjg.e(sQ);
        return sQ;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final crzb sR() {
        crzb sR = this.a.sR();
        dxjg.e(sR);
        return sR;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final crzb sS() {
        crzb sS = this.a.sS();
        dxjg.e(sS);
        return sS;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final crzb sT() {
        crzb sT = this.a.sT();
        dxjg.e(sT);
        return sT;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final Executor sX() {
        Executor sX = this.a.sX();
        dxjg.e(sX);
        return sX;
    }

    @Override // defpackage.akpx
    public final Map<akry, dxio<akpg>> sa() {
        Map<akry, dxio<akpg>> map = this.f;
        if (map == null) {
            dzsj dzsjVar = this.e;
            if (dzsjVar == null) {
                dzsjVar = new hwj(this, 1);
                this.e = dzsjVar;
            }
            dcdn k = dcdn.k(akry.BASE, dxjc.c(dzsjVar));
            dxjg.f(k);
            this.f = k;
            return k;
        }
        return map;
    }

    @Override // defpackage.akpx
    public final btwd sb() {
        btwd sb = this.a.sb();
        dxjg.e(sb);
        return sb;
    }

    @Override // defpackage.akpx
    public final dkiy sc() {
        dkiy sc = this.a.sc();
        dxjg.e(sc);
        return sc;
    }

    @Override // defpackage.akpx
    public final duxm sd() {
        duxm sd = this.a.sd();
        dxjg.e(sd);
        return sd;
    }

    @Override // defpackage.akpx
    public final dkks se() {
        dkks se = this.a.se();
        dxjg.e(se);
        return se;
    }

    @Override // defpackage.akpx
    public final dvsb sg() {
        dvsb sg = this.a.sg();
        dxjg.e(sg);
        return sg;
    }

    @Override // defpackage.akpx
    public final dvtk sh() {
        dvtk sh = this.a.sh();
        dxjg.e(sh);
        return sh;
    }

    @Override // defpackage.akpx
    public final dwwr si() {
        dwwr si = this.a.si();
        dxjg.e(si);
        return si;
    }

    @Override // defpackage.akpx
    public final dvcz sj() {
        dvcz sj = this.a.sj();
        dxjg.e(sj);
        return sj;
    }

    @Override // defpackage.akpx
    public final duxu sl() {
        duxu sl = this.a.sl();
        dxjg.e(sl);
        return sl;
    }

    @Override // defpackage.akpx
    public final dkwa so() {
        dkwa so = this.a.so();
        dxjg.e(so);
        return so;
    }

    @Override // defpackage.akpx, defpackage.akpy
    public final amfg sq() {
        amfg sq = this.b.sq();
        dxjg.e(sq);
        return sq;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final dehq tc() {
        dehq tc = this.a.tc();
        dxjg.e(tc);
        return tc;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final dehq td() {
        dehq td = this.a.td();
        dxjg.e(td);
        return td;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final dehq tf() {
        dehq tf = this.a.tf();
        dxjg.e(tf);
        return tf;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final dehq tg() {
        dehq tg = this.a.tg();
        dxjg.e(tg);
        return tg;
    }

    @Override // defpackage.akpx, defpackage.bvrk
    public final bvrb tn() {
        throw null;
    }

    @Override // defpackage.akpx, defpackage.cjqr
    public final cjqq tp() {
        cjqq tp = this.a.tp();
        dxjg.e(tp);
        return tp;
    }

    @Override // defpackage.akpx, defpackage.btvu
    public final btvt tq() {
        btvt tq = this.a.tq();
        dxjg.e(tq);
        return tq;
    }

    @Override // defpackage.akpx, defpackage.cjqz
    public final cjqy tr() {
        cjqy tr = this.a.tr();
        dxjg.e(tr);
        return tr;
    }

    @Override // defpackage.akpx
    public final hwv vv() {
        hwv hwvVar = this.c;
        if (hwvVar == null) {
            btrm rz = this.a.rz();
            dxjg.e(rz);
            hwv hwvVar2 = new hwv(rz);
            this.c = hwvVar2;
            return hwvVar2;
        }
        return hwvVar;
    }

    @Override // defpackage.akpx
    public final bvju vw() {
        bvju A = this.a.A();
        dxjg.e(A);
        return A;
    }
}
