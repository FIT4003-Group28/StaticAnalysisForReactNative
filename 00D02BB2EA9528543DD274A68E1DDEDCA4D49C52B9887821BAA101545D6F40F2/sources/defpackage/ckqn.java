package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ckqn  reason: default package */
/* loaded from: classes4.dex */
public final class ckqn implements ckqd {
    private final ckqd a;

    public ckqn(ckqd ckqdVar) {
        this.a = ckqdVar;
    }

    @Override // defpackage.ckqd
    public final String a(String str, int i, int i2, @dzsi ImageView.ScaleType scaleType) {
        dsnh b = ckqj.b(this.a.a(str, i, i2, scaleType));
        b.j();
        b.a.d(dsne.BACKGROUND_COLOR, 16777215);
        b.a.c(dsne.BACKGROUND_COLOR);
        return ckqj.a(b, str);
    }
}
