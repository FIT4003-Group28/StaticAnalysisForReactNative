package defpackage;
/* compiled from: PG */
/* renamed from: asdg  reason: default package */
/* loaded from: classes2.dex */
public final class asdg<T> extends btrh<T> {
    public asdg(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        asde asdeVar = (asde) this.a;
        crih crihVar = (crih) obj;
        if (!asdeVar.a.e.i()) {
            final asdf asdfVar = asdeVar.a;
            asdfVar.d.b(new Runnable(asdfVar) { // from class: asdd
                private final asdf a;

                {
                    this.a = asdfVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    asdf asdfVar2 = this.a;
                    gn gnVar = asdfVar2.A;
                    if (gnVar == null || gnVar.J()) {
                        return;
                    }
                    gfq.m(asdfVar2);
                }
            }, bvrj.UI_THREAD);
        }
    }
}
