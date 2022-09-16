package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: lbw  reason: default package */
/* loaded from: classes3.dex */
public final class lbw implements LayoutTransition.TransitionListener {
    private final /* synthetic */ int a;

    public lbw() {
    }

    public lbw(int i) {
        this.a = i;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        if (this.a == 0) {
            viewGroup.setLayoutTransition(null);
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }
}
