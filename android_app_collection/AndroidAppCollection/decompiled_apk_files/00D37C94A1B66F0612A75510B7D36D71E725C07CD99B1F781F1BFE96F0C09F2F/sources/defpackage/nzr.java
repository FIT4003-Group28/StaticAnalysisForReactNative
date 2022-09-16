package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.youtube.R;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: nzr  reason: default package */
/* loaded from: classes3.dex */
public final class nzr {
    public final Drawable a;
    public final Drawable b;
    public final /* synthetic */ NextGenWatchLayout c;

    public nzr(NextGenWatchLayout nextGenWatchLayout, Context context) {
        this.c = nextGenWatchLayout;
        Drawable a = akf.a(context, R.drawable.floaty_scrim);
        a.getClass();
        this.b = a;
        Drawable a2 = akf.a(context, 2131231248);
        a2.getClass();
        this.a = a2;
    }

    public final void a(float f) {
        float exp = (float) (Math.exp(f * 25.0f) / Math.expm1(25.0d));
        this.b.setAlpha(exp <= 0.0f ? 0 : exp >= 1.0f ? PrivateKeyType.INVALID : (int) (exp * 255.0f));
    }
}
