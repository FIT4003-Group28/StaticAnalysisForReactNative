package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ackd  reason: default package */
/* loaded from: classes.dex */
public final class ackd implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;

    public ackd(View view) {
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zgd.t(this.a, zgd.f(acke.a), ajf.class);
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
