package defpackage;
/* compiled from: PG */
/* renamed from: yuv  reason: default package */
/* loaded from: classes7.dex */
public final class yuv extends aler {
    private static final int[] c = {1, 1, 1, 2};
    private static final int[] d = {2, 2, 2, 3};
    private static final bntp e = bntp.POLYLINE_DIMMED;

    public yuv(akpm akpmVar) {
        super(akpmVar);
    }

    @Override // defpackage.aler
    protected final akuh a(int i) {
        return this.b.c(albu.d(i, e, c, d, albu.a));
    }
}
