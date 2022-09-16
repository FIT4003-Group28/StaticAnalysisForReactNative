package defpackage;
/* compiled from: PG */
/* renamed from: qsn  reason: default package */
/* loaded from: classes7.dex */
public final class qsn<T> extends btrh<T> {
    public qsn(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        degu<amte> deguVar;
        srf srfVar = (srf) obj;
        qsm qsmVar = ((qsj) this.a).a;
        if (qsmVar.c == srfVar.a && (deguVar = qsmVar.d) != null) {
            qsmVar.g();
            qbm qbmVar = srfVar.b;
            if (qbmVar.d()) {
                deguVar.a(new qsl());
            } else if (!qbmVar.o()) {
                deguVar.a(new qsk());
            } else {
                amte n = qbmVar.n();
                if (n == null) {
                    deguVar.a(new NullPointerException("getStorageItem"));
                } else {
                    deguVar.b(n);
                }
            }
        }
    }
}
