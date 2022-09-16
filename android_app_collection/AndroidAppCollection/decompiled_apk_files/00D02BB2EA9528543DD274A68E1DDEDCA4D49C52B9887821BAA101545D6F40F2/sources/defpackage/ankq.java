package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ankq  reason: default package */
/* loaded from: classes2.dex */
public final class ankq implements anhn {
    private final dxio<burb> a;
    private final Executor b;
    private final bvjj c;
    private final bsvn d;
    private final cqat e;

    static {
        dlxt bZ = dlxy.c.bZ();
        dlxx dlxxVar = dlxx.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlxy dlxyVar = (dlxy) bZ.b;
        dlxxVar.getClass();
        dlxyVar.b = dlxxVar;
        dlxyVar.a = 2;
        bZ.bK();
    }

    public ankq(dxio<burb> dxioVar, Executor executor, bvjj bvjjVar, bsvn bsvnVar, cqat cqatVar) {
        this.a = dxioVar;
        this.b = executor;
        this.c = bvjjVar;
        this.d = bsvnVar;
        this.e = cqatVar;
    }

    @Override // defpackage.anhn
    public final void a() {
        this.c.Z(bvjk.dQ, this.e.b());
        bsvn bsvnVar = this.d;
        btau c = btav.c();
        c.b(true);
        ((bsvj) bsvnVar).d(dbsg.i(c.a()));
    }

    @Override // defpackage.anhn
    public final void b(btzi<diez, diff> btziVar) {
        diew bZ = diez.c.bZ();
        diex bZ2 = diey.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        diey dieyVar = (diey) bZ2.b;
        dieyVar.a |= 2;
        dieyVar.c = false;
        diey dieyVar2 = (diey) bZ2.b;
        dieyVar2.a |= 1;
        dieyVar2.b = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diez diezVar = (diez) bZ.b;
        diey bK = bZ2.bK();
        bK.getClass();
        diezVar.b = bK;
        diezVar.a |= 1;
        this.a.a().b(bZ.bK(), btziVar, this.b);
    }
}
