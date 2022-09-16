package defpackage;
/* compiled from: PG */
/* renamed from: amwc  reason: default package */
/* loaded from: classes.dex */
final class amwc extends amzt {
    static final amzt a = new amwc(new Object[0]);
    private final Object[] b;

    public amwc(Object[] objArr) {
        super(0, 0);
        this.b = objArr;
    }

    @Override // defpackage.amzt
    protected final Object a(int i) {
        return this.b[i];
    }
}
