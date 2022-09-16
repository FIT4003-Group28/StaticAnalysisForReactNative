package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: izf  reason: default package */
/* loaded from: classes3.dex */
public final class izf extends izh {
    public izf(View view, int i, int i2, float f, float f2) {
        super(view, i, i2, f, f2);
        boolean z = true;
        aqxo.y(f >= 0.0f && f <= 1.0f);
        aqxo.y((f2 < 0.0f || f2 > 1.0f) ? false : z);
    }

    @Override // defpackage.izh
    protected final void a(float f) {
        this.g.setAlpha(f);
    }
}
