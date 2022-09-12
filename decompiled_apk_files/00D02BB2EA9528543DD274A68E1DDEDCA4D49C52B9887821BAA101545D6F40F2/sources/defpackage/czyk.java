package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: czyk  reason: default package */
/* loaded from: classes5.dex */
final class czyk extends aah {
    public czyk(Context context) {
        super(context);
    }

    @Override // defpackage.aah
    protected final float b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
