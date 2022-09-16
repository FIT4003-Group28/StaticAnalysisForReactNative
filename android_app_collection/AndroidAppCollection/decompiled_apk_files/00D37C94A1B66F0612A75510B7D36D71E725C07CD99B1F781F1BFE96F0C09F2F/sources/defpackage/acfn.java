package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: acfn  reason: default package */
/* loaded from: classes.dex */
final class acfn extends yk {
    public acfn(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final float a(DisplayMetrics displayMetrics) {
        return 200.0f / displayMetrics.densityDpi;
    }
}
