package defpackage;

import java.security.interfaces.ECPublicKey;
/* compiled from: PG */
/* renamed from: anpa  reason: default package */
/* loaded from: classes.dex */
final class anpa extends anmq {
    public anpa(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anqs anqsVar = (anqs) obj;
        anqq anqqVar = anqsVar.c;
        if (anqqVar == null) {
            anqqVar = anqq.a;
        }
        anqt anqtVar = anqqVar.b;
        if (anqtVar == null) {
            anqtVar = anqt.a;
        }
        int e = anqx.e(anqtVar.b);
        int i = 1;
        if (e == 0) {
            e = 1;
        }
        ECPublicKey j = antz.j(anpf.c(e), anqsVar.d.I(), anqsVar.e.I());
        anqo anqoVar = anqqVar.c;
        if (anqoVar == null) {
            anqoVar = anqo.a;
        }
        anrc anrcVar = anqoVar.b;
        if (anrcVar == null) {
            anrcVar = anrc.a;
        }
        anpg anpgVar = new anpg(anrcVar);
        byte[] I = anqtVar.d.I();
        int c = anqx.c(anqtVar.c);
        if (c == 0) {
            c = 1;
        }
        String b = anpf.b(c);
        int h = anqx.h(anqqVar.d);
        if (h != 0) {
            i = h;
        }
        return new antn(j, I, b, anpf.d(i), anpgVar);
    }
}
