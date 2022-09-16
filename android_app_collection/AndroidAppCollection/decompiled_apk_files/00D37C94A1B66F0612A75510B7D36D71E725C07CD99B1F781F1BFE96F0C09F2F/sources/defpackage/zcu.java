package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
/* compiled from: PG */
/* renamed from: zcu  reason: default package */
/* loaded from: classes4.dex */
public final class zcu implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ zcx b;
    final /* synthetic */ float c;
    final /* synthetic */ SwipeLayout d;

    public zcu(SwipeLayout swipeLayout, View view, zcx zcxVar, float f) {
        this.d = swipeLayout;
        this.a = view;
        this.b = zcxVar;
        this.c = f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.a.getParent() != null) {
            this.d.m(((Integer) this.b.a()).intValue(), this.c);
        }
    }
}
