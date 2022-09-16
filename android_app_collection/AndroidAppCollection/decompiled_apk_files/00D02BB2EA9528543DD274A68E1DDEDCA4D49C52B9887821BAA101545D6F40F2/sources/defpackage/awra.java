package defpackage;
/* compiled from: PG */
/* renamed from: awra  reason: default package */
/* loaded from: classes3.dex */
public final class awra<T> extends btrh<T> {
    private final int d;

    public awra(Class<?> cls, T t) {
        super(cls, t);
        this.d = 1;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ((awqz) this.a).k = ((alhj) obj).a;
            return;
        }
        awqz awqzVar = (awqz) this.a;
        awtn awtnVar = ((awrf) obj).a;
        if (!awqzVar.k) {
            return;
        }
        awqzVar.m(awtnVar, true);
    }

    public awra(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = 0;
    }
}
