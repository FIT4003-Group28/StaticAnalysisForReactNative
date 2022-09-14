package defpackage;
/* compiled from: PG */
/* renamed from: ivz  reason: default package */
/* loaded from: classes6.dex */
public final class ivz<T> extends btrh<T> {
    private final int d;

    private ivz(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    public static void b(btrm btrmVar, ivy ivyVar) {
        dceq a = dcet.a();
        a.b(amqo.class, new ivz(0, amqo.class, ivyVar, bvrj.UI_THREAD));
        a.b(amwe.class, new ivz(1, amwe.class, ivyVar, bvrj.UI_THREAD));
        btrmVar.g(ivyVar, a.a());
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ((ivy) this.a).i((amwe) obj);
        } else {
            ((ivy) this.a).h((amqo) obj);
        }
    }
}
