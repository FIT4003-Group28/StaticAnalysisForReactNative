package defpackage;
/* compiled from: PG */
/* renamed from: anox  reason: default package */
/* loaded from: classes.dex */
final class anox extends anmq {
    public anox(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anqr anqrVar = (anqr) obj;
        anqs anqsVar = anqrVar.c;
        if (anqsVar == null) {
            anqsVar = anqs.a;
        }
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
        antz.i(anpf.c(e), anqrVar.d.I());
        anqo anqoVar = anqqVar.c;
        if (anqoVar == null) {
            anqoVar = anqo.a;
        }
        anrc anrcVar = anqoVar.b;
        if (anrcVar == null) {
            anrcVar = anrc.a;
        }
        new anpg(anrcVar);
        anqtVar.d.I();
        int c = anqx.c(anqtVar.c);
        if (c == 0) {
            c = 1;
        }
        anpf.b(c);
        int h = anqx.h(anqqVar.d);
        if (h != 0) {
            i = h;
        }
        anpf.d(i);
        return new antm();
    }
}
