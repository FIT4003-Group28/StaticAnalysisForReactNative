package defpackage;
/* compiled from: PG */
/* renamed from: cjoq  reason: default package */
/* loaded from: classes4.dex */
public final class cjoq<T> extends btrh<T> {
    public cjoq(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        cjog cjogVar = (cjog) this.a;
        azre azreVar = (azre) obj;
        cjoo cjooVar = cjogVar.a;
        if (cjooVar.aD) {
            cjpk cjpkVar = (cjpk) cjooVar.aC.b;
            if (!dbsd.a((cjpkVar.a & 1) != 0 ? cjpkVar.b : null, btlu.h(azreVar.a))) {
                return;
            }
            dcdc<azwv> b = azreVar.b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                cjogVar.a.aw.b(b.get(i).a());
            }
        }
    }
}
