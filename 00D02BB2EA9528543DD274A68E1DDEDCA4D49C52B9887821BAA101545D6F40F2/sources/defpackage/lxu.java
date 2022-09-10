package defpackage;
/* compiled from: PG */
/* renamed from: lxu  reason: default package */
/* loaded from: classes7.dex */
public final class lxu<T> extends btrh<T> {
    public lxu(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        final lxt lxtVar = (lxt) this.a;
        final jzs jzsVar = (jzs) obj;
        lxtVar.b.execute(new Runnable(lxtVar, jzsVar) { // from class: lxr
            private final lxt a;
            private final jzs b;

            {
                this.a = lxtVar;
                this.b = jzsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lxt lxtVar2 = this.a;
                jzs jzsVar2 = this.b;
                for (lxs lxsVar : lxtVar2.a) {
                    lxsVar.a(jzsVar2);
                }
            }
        });
    }
}
