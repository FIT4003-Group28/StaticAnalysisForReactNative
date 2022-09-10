package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awhn  reason: default package */
/* loaded from: classes3.dex */
public final class awhn implements avlm {
    static final long a = TimeUnit.DAYS.toMillis(30);
    private final cqat b;
    private final bvjj c;
    private final avzj d;
    private final avjn e;

    public awhn(cqat cqatVar, bvjj bvjjVar, avzj avzjVar, avjn avjnVar) {
        this.b = cqatVar;
        this.c = bvjjVar;
        this.d = avzjVar;
        this.e = avjnVar;
    }

    @Override // defpackage.avlm
    public final void a(dlpt dlptVar) {
        try {
            avzj avzjVar = this.d;
            dlsw dlswVar = dlptVar.k;
            if (dlswVar == null) {
                dlswVar = dlsw.d;
            }
            btlu c = avzjVar.c(dlswVar);
            dlrj dlrjVar = dlptVar.e;
            if (dlrjVar == null) {
                dlrjVar = dlrj.e;
            }
            if (!dlrjVar.b.isEmpty()) {
                return;
            }
            long x = this.c.x(bvjk.eD, c, 0L);
            long b = this.b.b();
            if (b - x <= a) {
                return;
            }
            avjn avjnVar = this.e;
            avjr bZ = avjy.l.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            avjy avjyVar = (avjy) bZ.b;
            int i = avjyVar.a | 1;
            avjyVar.a = i;
            avjyVar.b = true;
            int i2 = i | 4;
            avjyVar.a = i2;
            avjyVar.d = false;
            avjyVar.a = i2 | 2;
            avjyVar.c = false;
            avjt avjtVar = avjt.NO_INTERVAL_CHECK;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            avjy avjyVar2 = (avjy) bZ.b;
            avjyVar2.f = avjtVar.d;
            avjyVar2.a |= 16;
            avjnVar.a("current-location", c, 0L, bZ.bK());
            this.c.aa(bvjk.eD, c, b);
        } catch (avzi e) {
            bvoo.j(e);
        }
    }
}
