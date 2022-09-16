package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crsq  reason: default package */
/* loaded from: classes5.dex */
public final class crsq {
    private final pag a;
    private final Executor b;
    private final ckcw c;
    private final buvq d;

    public crsq(pag pagVar, Executor executor, ckcw ckcwVar, buvq buvqVar) {
        this.a = pagVar;
        this.b = executor;
        this.d = buvqVar;
        this.c = ckcwVar;
    }

    public static final disc a(long j, amub amubVar, long j2, long j3) {
        String f = amubVar.f();
        dirt bZ = disc.j.bZ();
        long j4 = j2 - j3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        disc discVar = (disc) bZ.b;
        int i = discVar.a | 2;
        discVar.a = i;
        discVar.c = j4;
        int i2 = i | 4;
        discVar.a = i2;
        discVar.d = j2;
        discVar.a = i2 | 1;
        discVar.b = j;
        if (!dbsj.d(f)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            disc discVar2 = (disc) bZ.b;
            f.getClass();
            discVar2.a |= 64;
            discVar2.f = f;
        }
        return bZ.bK();
    }

    public final void b(disc discVar) {
        dutq a = this.a.a();
        if (a == null || a.equals(dutq.d)) {
            ((ckco) this.c.a(ckhi.T)).a(1);
            return;
        }
        buvq buvqVar = this.d;
        diro bZ = disd.d.bZ();
        dirr bZ2 = dirs.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dirs dirsVar = (dirs) bZ2.b;
        discVar.getClass();
        dirsVar.b = discVar;
        dirsVar.a = 3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        disd disdVar = (disd) bZ.b;
        dirs bK = bZ2.bK();
        bK.getClass();
        dsrj<dirs> dsrjVar = disdVar.b;
        if (!dsrjVar.a()) {
            disdVar.b = dsqw.cl(dsrjVar);
        }
        disdVar.b.add(bK);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        disd disdVar2 = (disd) bZ.b;
        a.getClass();
        disdVar2.c = a;
        disdVar2.a |= 2;
        buvqVar.b(bZ.bK(), new crsp(), this.b);
    }
}
