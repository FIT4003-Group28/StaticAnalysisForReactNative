package defpackage;

import java.security.interfaces.ECPublicKey;
/* compiled from: PG */
/* renamed from: ansa  reason: default package */
/* loaded from: classes.dex */
final class ansa extends anmq {
    public ansa(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anqn anqnVar = (anqn) obj;
        anql anqlVar = anqnVar.c;
        if (anqlVar == null) {
            anqlVar = anql.a;
        }
        int e = anqx.e(anqlVar.c);
        int i = 1;
        if (e == 0) {
            e = 1;
        }
        ECPublicKey j = antz.j(answ.d(e), anqnVar.d.I(), anqnVar.e.I());
        anql anqlVar2 = anqnVar.c;
        if (anqlVar2 == null) {
            anqlVar2 = anql.a;
        }
        int c = anqx.c(anqlVar2.b);
        if (c == 0) {
            c = 1;
        }
        int f = answ.f(c);
        anql anqlVar3 = anqnVar.c;
        if (anqlVar3 == null) {
            anqlVar3 = anql.a;
        }
        int f2 = anqx.f(anqlVar3.d);
        if (f2 != 0) {
            i = f2;
        }
        return new antk(j, f, answ.e(i));
    }
}
