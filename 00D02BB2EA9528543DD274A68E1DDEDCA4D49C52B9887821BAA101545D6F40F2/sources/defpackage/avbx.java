package defpackage;
/* compiled from: PG */
/* renamed from: avbx  reason: default package */
/* loaded from: classes2.dex */
public final class avbx<T> extends btrh<T> {
    public avbx(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        final avbt avbtVar = (avbt) this.a;
        final alim alimVar = (alim) obj;
        avbtVar.a.c.execute(new Runnable(avbtVar, alimVar) { // from class: avbs
            private final avbt a;
            private final alim b;

            {
                this.a = avbtVar;
                this.b = alimVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a(this.b.b);
            }
        });
    }
}
