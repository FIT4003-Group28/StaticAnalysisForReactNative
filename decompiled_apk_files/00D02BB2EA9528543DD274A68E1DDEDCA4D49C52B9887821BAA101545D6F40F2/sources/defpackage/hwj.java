package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hwj  reason: default package */
/* loaded from: classes.dex */
public final class hwj<T> implements dzsj<T> {
    final /* synthetic */ hwk a;
    private final int b;

    public hwj(hwk hwkVar, int i) {
        this.a = hwkVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            T t = (T) this.a.b.sp();
            dxjg.e(t);
            return t;
        }
        T t2 = (T) this.a.a.rE();
        dxjg.e(t2);
        return t2;
    }
}
