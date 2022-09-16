package defpackage;

import android.view.View;
import android.view.WindowInsets;
/* compiled from: PG */
/* renamed from: ipv  reason: default package */
/* loaded from: classes3.dex */
final class ipv implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ iqa a;

    public ipv(iqa iqaVar) {
        this.a = iqaVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.ag = windowInsets.getSystemWindowInsetTop();
        return windowInsets;
    }
}
