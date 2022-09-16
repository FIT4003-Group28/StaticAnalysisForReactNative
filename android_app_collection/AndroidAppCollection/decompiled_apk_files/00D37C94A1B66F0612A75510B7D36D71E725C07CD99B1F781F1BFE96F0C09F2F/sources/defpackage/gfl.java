package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* compiled from: PG */
/* renamed from: gfl  reason: default package */
/* loaded from: classes3.dex */
final class gfl extends yk {
    public int a;

    public gfl(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yk
    public final float a(DisplayMetrics displayMetrics) {
        return 250.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.yk
    public final int i(View view, int i) {
        return super.i(view, i) + this.a;
    }

    @Override // defpackage.yk
    protected final int l() {
        return -1;
    }
}
