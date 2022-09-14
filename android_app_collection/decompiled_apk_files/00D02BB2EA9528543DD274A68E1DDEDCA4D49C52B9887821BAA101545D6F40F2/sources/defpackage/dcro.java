package defpackage;
/* compiled from: PG */
/* renamed from: dcro  reason: default package */
/* loaded from: classes.dex */
public final class dcro extends dcrp {
    public static final dcro a = new dcro();

    private dcro() {
    }

    @Override // defpackage.dcrp
    public final int a() {
        return 0;
    }

    @Override // defpackage.dcrp
    public final dcqy<?> b(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // defpackage.dcrp
    public final Object c(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // defpackage.dcrp
    public final <T> T e(dcqy<T> dcqyVar) {
        return null;
    }
}
