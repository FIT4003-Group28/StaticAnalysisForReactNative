package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cmzx  reason: default package */
/* loaded from: classes5.dex */
public final class cmzx implements ViewTreeObserver.OnTouchModeChangeListener {
    final /* synthetic */ View a;

    public cmzx(View view) {
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.a.getViewTreeObserver().removeOnTouchModeChangeListener(this);
        this.a.getViewTreeObserver().addOnPreDrawListener(new cmzw(this));
    }
}
