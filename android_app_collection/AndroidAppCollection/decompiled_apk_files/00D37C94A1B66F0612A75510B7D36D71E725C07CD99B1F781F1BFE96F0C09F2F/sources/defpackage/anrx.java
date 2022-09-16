package defpackage;

import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
/* compiled from: PG */
/* renamed from: anrx  reason: default package */
/* loaded from: classes.dex */
final class anrx extends anmq {
    public anrx(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anqm anqmVar = (anqm) obj;
        anqn anqnVar = anqmVar.c;
        if (anqnVar == null) {
            anqnVar = anqn.a;
        }
        anql anqlVar = anqnVar.c;
        if (anqlVar == null) {
            anqlVar = anql.a;
        }
        int e = anqx.e(anqlVar.c);
        int i = 1;
        if (e == 0) {
            e = 1;
        }
        ECPrivateKey i2 = antz.i(answ.d(e), anqmVar.d.I());
        anqn anqnVar2 = anqmVar.c;
        if (anqnVar2 == null) {
            anqnVar2 = anqn.a;
        }
        anql anqlVar2 = anqnVar2.c;
        if (anqlVar2 == null) {
            anqlVar2 = anql.a;
        }
        int e2 = anqx.e(anqlVar2.c);
        if (e2 == 0) {
            e2 = 1;
        }
        int d = answ.d(e2);
        anqn anqnVar3 = anqmVar.c;
        if (anqnVar3 == null) {
            anqnVar3 = anqn.a;
        }
        byte[] I = anqnVar3.d.I();
        anqn anqnVar4 = anqmVar.c;
        if (anqnVar4 == null) {
            anqnVar4 = anqn.a;
        }
        ECPublicKey j = antz.j(d, I, anqnVar4.e.I());
        anqn anqnVar5 = anqmVar.c;
        if (anqnVar5 == null) {
            anqnVar5 = anqn.a;
        }
        anql anqlVar3 = anqnVar5.c;
        if (anqlVar3 == null) {
            anqlVar3 = anql.a;
        }
        int c = anqx.c(anqlVar3.b);
        if (c == 0) {
            c = 1;
        }
        int f = answ.f(c);
        anqn anqnVar6 = anqmVar.c;
        if (anqnVar6 == null) {
            anqnVar6 = anqn.a;
        }
        anql anqlVar4 = anqnVar6.c;
        if (anqlVar4 == null) {
            anqlVar4 = anql.a;
        }
        int f2 = anqx.f(anqlVar4.d);
        if (f2 == 0) {
            f2 = 1;
        }
        anur.a(i2, j, f, answ.e(f2));
        anqn anqnVar7 = anqmVar.c;
        if (anqnVar7 == null) {
            anqnVar7 = anqn.a;
        }
        anql anqlVar5 = anqnVar7.c;
        if (anqlVar5 == null) {
            anqlVar5 = anql.a;
        }
        int c2 = anqx.c(anqlVar5.b);
        if (c2 == 0) {
            c2 = 1;
        }
        int f3 = answ.f(c2);
        anqn anqnVar8 = anqmVar.c;
        if (anqnVar8 == null) {
            anqnVar8 = anqn.a;
        }
        anql anqlVar6 = anqnVar8.c;
        if (anqlVar6 == null) {
            anqlVar6 = anql.a;
        }
        int f4 = anqx.f(anqlVar6.d);
        if (f4 != 0) {
            i = f4;
        }
        return new antj(i2, f3, answ.e(i));
    }
}
