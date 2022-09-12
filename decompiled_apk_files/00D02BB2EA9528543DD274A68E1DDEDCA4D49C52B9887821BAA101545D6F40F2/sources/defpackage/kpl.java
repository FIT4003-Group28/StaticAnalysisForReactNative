package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: kpl  reason: default package */
/* loaded from: classes7.dex */
public final class kpl {
    private static final long c;
    private static final btys d;
    public final kpj a;
    public final kpj b;

    static {
        long millis = TimeUnit.SECONDS.toMillis(15L);
        c = millis;
        btyr bZ = btys.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btys btysVar = (btys) bZ.b;
        btysVar.a |= 2;
        btysVar.c = 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btys btysVar2 = (btys) bZ.b;
        btysVar2.a |= 4;
        btysVar2.d = millis;
        d = bZ.bK();
    }

    public kpl(Context context, dxio<axwq> dxioVar, btrm btrmVar, buyt buytVar, Executor executor, Executor executor2, kcv kcvVar) {
        buytVar.a().c(d);
        buyv c2 = buytVar.c();
        this.a = new kpj(context, dndr.HOME, dxioVar, btrmVar, c2, executor, executor2, kcvVar);
        this.b = new kpj(context, dndr.WORK, dxioVar, btrmVar, c2, executor, executor2, kcvVar);
    }

    public final kpj a(@dzsi dndr dndrVar) {
        boolean z = true;
        if (dndrVar != dndr.HOME && dndrVar != dndr.WORK) {
            z = false;
        }
        dbsk.l(z);
        return dndrVar == dndr.HOME ? this.a : this.b;
    }
}
