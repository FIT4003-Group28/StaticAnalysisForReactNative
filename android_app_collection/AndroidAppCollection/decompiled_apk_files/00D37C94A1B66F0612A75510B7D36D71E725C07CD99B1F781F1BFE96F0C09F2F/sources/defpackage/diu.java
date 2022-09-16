package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: diu  reason: default package */
/* loaded from: classes3.dex */
public final class diu extends yk {
    public diu(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.yk
    public final int g(int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
