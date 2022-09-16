package defpackage;
/* compiled from: PG */
/* renamed from: mfv  reason: default package */
/* loaded from: classes7.dex */
public final class mfv<T> extends btrh<T> {
    private final int d;

    public mfv(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            mfr mfrVar = (mfr) this.a;
            if (((amqo) obj).a() == null) {
                mfrVar.a.g = false;
                return;
            }
            mfs mfsVar = mfrVar.a;
            if (mfsVar.g) {
                return;
            }
            mfsVar.g = true;
            mfsVar.a();
            return;
        }
        mfr mfrVar2 = (mfr) this.a;
        if (!mfrVar2.a.d.b(((gds) obj).a)) {
            return;
        }
        mfrVar2.a.a();
    }
}
