package defpackage;

import android.graphics.Color;
/* compiled from: PG */
/* renamed from: alen  reason: default package */
/* loaded from: classes2.dex */
public final class alen extends aler {
    private static final int[] c = {1, 2, 3, 5};
    private static final int[] d = {2, 3, 5, 7};
    private static final bntp e = bntp.POLYLINE_DIMMED;

    public alen(akpm akpmVar) {
        super(akpmVar);
    }

    public static int b(int i) {
        return Color.argb(Color.alpha(i), (int) (255.0f - ((255 - Color.red(i)) * 0.3f)), (int) (255.0f - ((255 - Color.green(i)) * 0.3f)), (int) (255.0f - ((255 - Color.blue(i)) * 0.3f)));
    }

    @Override // defpackage.aler
    protected final akuh a(int i) {
        return this.b.c(albu.d(b(i), e, c, d, albu.a));
    }
}
