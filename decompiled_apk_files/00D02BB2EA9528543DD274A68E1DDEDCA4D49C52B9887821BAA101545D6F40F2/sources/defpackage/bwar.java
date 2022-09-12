package defpackage;
/* compiled from: PG */
/* renamed from: bwar  reason: default package */
/* loaded from: classes4.dex */
public final class bwar<T> extends btrh<T> {
    private final int d;

    public bwar(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            bwap bwapVar = (bwap) this.a;
            if (((azrg) obj).b() != 1) {
                return;
            }
            bwapVar.a();
            return;
        }
        azrb azrbVar = (azrb) obj;
        ((bwap) this.a).a();
    }
}
