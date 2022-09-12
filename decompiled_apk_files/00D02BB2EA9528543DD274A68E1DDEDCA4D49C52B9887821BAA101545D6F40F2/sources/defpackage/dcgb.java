package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcgb  reason: default package */
/* loaded from: classes.dex */
public final class dcgb<T> extends dbxh<T> {
    static final dcpe<Object> a = new dcgb(new Object[0], 0);
    private final T[] b;

    public dcgb(T[] tArr, int i) {
        super(i, 0);
        this.b = tArr;
    }

    @Override // defpackage.dbxh
    protected final T a(int i) {
        return this.b[i];
    }
}
