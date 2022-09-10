package defpackage;
/* compiled from: PG */
/* renamed from: awjw  reason: default package */
/* loaded from: classes3.dex */
public final class awjw<T> extends btrh<T> {
    public awjw(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        final awjq awjqVar = (awjq) this.a;
        int i = awjv.p;
        if (((ahmo) obj).a() != null) {
            awjqVar.a.c.execute(new Runnable(awjqVar) { // from class: awjp
                private final awjq a;

                {
                    this.a = awjqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.d();
                }
            });
        }
    }
}
