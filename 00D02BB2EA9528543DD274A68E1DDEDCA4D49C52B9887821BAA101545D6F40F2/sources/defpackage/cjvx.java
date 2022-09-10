package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cjvx  reason: default package */
/* loaded from: classes.dex */
public final class cjvx extends cjwa {
    public final cjwe a;
    private final buzy d;
    private final Executor e;
    private final cqat f;
    private final dzsj<duxm> g;

    public cjvx(akfa akfaVar, buzy buzyVar, Executor executor, cjwe cjweVar, cqat cqatVar, dzsj<duxm> dzsjVar) {
        super(akfaVar);
        this.d = buzyVar;
        this.e = executor;
        this.a = cjweVar;
        this.f = cqatVar;
        this.g = dzsjVar;
    }

    private static boolean h(@dzsi btlu btluVar) {
        return !btlu.p(btluVar) && !btlu.n(btluVar);
    }

    private final boolean i(@dzsi btlu btluVar) {
        return h(btluVar) && btluVar.equals(f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjwa
    public final boolean a(cjtk cjtkVar) {
        int a = duxl.a(this.g.a().k);
        if (a == 0 || a == 1 || a == 3) {
            return true;
        }
        if (a != 4 && a != 5) {
            return false;
        }
        return cjtkVar.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjwa
    public final void b(@dzsi btlu btluVar, cjtk cjtkVar, cjwj cjwjVar) {
        if (this.g.a().J && cjtkVar.f()) {
            cjwjVar = cjwj.HIGH;
        }
        d(btluVar, cjtkVar, cjwjVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjwa
    public final void c(cjvz cjvzVar) {
        cjvp cjvpVar = (cjvp) cjvzVar;
        btlu btluVar = cjvpVar.a;
        String e = dbsj.e(btlu.h(f()));
        String e2 = dbsj.e(btlu.h(btluVar));
        if (!btlu.n(btluVar) || e.equals(e2)) {
            dwuo bZ = dwup.e.bZ();
            dcdc<cjtk> dcdcVar = cjvpVar.b;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                dwun l = dcdcVar.get(i).l();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwup dwupVar = (dwup) bZ.b;
                l.getClass();
                dsrj<dwun> dsrjVar = dwupVar.b;
                if (!dsrjVar.a()) {
                    dwupVar.b = dsqw.cl(dsrjVar);
                }
                dwupVar.b.add(l);
            }
            long e3 = this.f.e();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwup dwupVar2 = (dwup) bZ.b;
            dwupVar2.a |= 1;
            dwupVar2.c = e3;
            boolean i2 = i(btluVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwup dwupVar3 = (dwup) bZ.b;
            dwupVar3.a |= 2;
            dwupVar3.d = i2;
            ((buzz) this.d).c.e = h(btluVar) ? cjvpVar.a : null;
            if (this.g.a().s) {
                buac buacVar = ((buzz) this.d).c;
                btyp bZ2 = btyq.h.bZ();
                boolean i3 = i(btluVar);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                btyq btyqVar = (btyq) bZ2.b;
                btyqVar.a |= 1;
                btyqVar.b = i3;
                buacVar.a = bZ2.bK();
            }
            if (cjvpVar.c == cjwj.HIGH) {
                btyr bZ3 = btys.f.bZ();
                int i4 = ((btys) bZ3.b).c;
                buac buacVar2 = ((buzz) this.d).c;
                int i5 = i4 + 1;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                btys btysVar = (btys) bZ3.b;
                btysVar.a |= 2;
                btysVar.c = i5;
                buacVar2.c(bZ3.bK());
            }
            ((buzz) this.d).b().b(bZ.bK(), new cjvw(this, cjvzVar), this.e);
        }
    }
}
