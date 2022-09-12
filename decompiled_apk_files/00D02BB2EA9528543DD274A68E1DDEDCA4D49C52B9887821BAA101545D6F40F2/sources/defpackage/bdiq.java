package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: bdiq  reason: default package */
/* loaded from: classes3.dex */
final class bdiq implements ckqd {
    private final int a;
    private final int b;

    public bdiq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ckqd
    public final String a(String str, int i, int i2, @dzsi ImageView.ScaleType scaleType) {
        return ckqc.FIFE.a(str, this.a, this.b, ImageView.ScaleType.CENTER_CROP);
    }
}
