package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ky  reason: default package */
/* loaded from: classes3.dex */
public final class ky implements View.OnApplyWindowInsetsListener {
    mb a = null;
    final /* synthetic */ View b;
    final /* synthetic */ kj c;

    public ky(View view, kj kjVar) {
        this.b = view;
        this.c = kjVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        mb r = mb.r(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            kz.h(windowInsets, this.b);
            if (r.equals(this.a)) {
                return this.c.a(view, r).s();
            }
        }
        this.a = r;
        mb a = this.c.a(view, r);
        if (Build.VERSION.SDK_INT >= 30) {
            return a.s();
        }
        lj.K(view);
        return a.s();
    }
}
