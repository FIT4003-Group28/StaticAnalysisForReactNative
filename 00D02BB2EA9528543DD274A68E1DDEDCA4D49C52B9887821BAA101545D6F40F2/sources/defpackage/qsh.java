package defpackage;
/* compiled from: PG */
/* renamed from: qsh  reason: default package */
/* loaded from: classes7.dex */
public final class qsh<T> extends btrh<T> {
    public qsh(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        qsf qsfVar = (qsf) this.a;
        srf srfVar = (srf) obj;
        qbn qbnVar = srfVar.a;
        synchronized (qsfVar.a) {
            if (!qsfVar.a.a.containsKey(qbnVar)) {
                return;
            }
            deig<amte> deigVar = qsfVar.a.a.get(qbnVar);
            qsfVar.a.a.remove(qbnVar);
            if (deigVar == null) {
                return;
            }
            qbm qbmVar = srfVar.b;
            if (qbmVar.d()) {
                deigVar.k(new RuntimeException("DirectionsFetcher in error state"));
                return;
            }
            amte n = qbmVar.n();
            if (n == null) {
                deigVar.k(new RuntimeException("DirectionsStorageItem is null"));
                return;
            }
            if (!qbmVar.o()) {
                dvzu dvzuVar = n.a.a().b;
                if (dvzuVar == null) {
                    dvzuVar = dvzu.F;
                }
                if (dvzuVar.f.isEmpty()) {
                    deigVar.k(new RuntimeException("DirectionsFetcher returned invalid directions"));
                }
            }
            deigVar.j(n);
        }
    }
}
