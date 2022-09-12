package defpackage;

import android.view.View;
import android.view.WindowInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nt  reason: default package */
/* loaded from: classes.dex */
public final class nt implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ nq a;

    public nt(nq nqVar) {
        this.a = nqVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.a.a(view, ow.b(windowInsets, view)).p();
    }
}
