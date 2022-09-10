package defpackage;
/* compiled from: PG */
/* renamed from: afzo  reason: default package */
/* loaded from: classes2.dex */
public final class afzo<T> extends btrh<T> {
    public afzo(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        afzg afzgVar = (afzg) this.a;
        azre azreVar = (azre) obj;
        afzm afzmVar = afzgVar.a;
        if (afzmVar.aD) {
            agxr agxrVar = (agxr) afzmVar.ar.b;
            if (!dbsd.a((agxrVar.a & 8) != 0 ? agxrVar.e : null, btlu.h(azreVar.a))) {
                return;
            }
            dcdc<azwv> b = azreVar.b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                afzgVar.a.ap.b(b.get(i).a());
            }
        }
    }
}
