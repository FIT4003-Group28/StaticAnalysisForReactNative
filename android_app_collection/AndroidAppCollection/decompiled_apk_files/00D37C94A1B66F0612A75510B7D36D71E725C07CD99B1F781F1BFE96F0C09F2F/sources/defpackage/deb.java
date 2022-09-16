package defpackage;

import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: deb  reason: default package */
/* loaded from: classes3.dex */
public final class deb implements dec {
    final int a;
    final Interpolator b;

    public deb(int i, Interpolator interpolator) {
        this.a = i;
        this.b = interpolator;
    }

    @Override // defpackage.dec
    public final dfr a(dfm dfmVar) {
        return new dfp(this.a, dfmVar, this.b);
    }
}
