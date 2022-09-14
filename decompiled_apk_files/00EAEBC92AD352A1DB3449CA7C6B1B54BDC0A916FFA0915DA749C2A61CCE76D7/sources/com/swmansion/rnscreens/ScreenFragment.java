package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
/* loaded from: classes.dex */
public class ScreenFragment extends Fragment {
    protected b X;

    public ScreenFragment() {
        throw new IllegalStateException("Screen fragments should never be restored");
    }

    @SuppressLint({"ValidFragment"})
    public ScreenFragment(b bVar) {
        this.X = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static View b(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.endViewTransition(view);
            viewGroup.removeView(view);
        }
        view.setVisibility(0);
        return view;
    }

    private void o0() {
        ((UIManagerModule) ((ReactContext) this.X.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new c(this.X.getId()));
    }

    @Override // androidx.fragment.app.Fragment
    public void Q() {
        super.Q();
        d container = this.X.getContainer();
        if (container == null || !container.a(this)) {
            ((UIManagerModule) ((ReactContext) this.X.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new e(this.X.getId()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(n());
        this.X.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        b bVar = this.X;
        b(bVar);
        frameLayout.addView(bVar);
        return frameLayout;
    }

    public b m0() {
        return this.X;
    }

    public void n0() {
        o0();
    }
}
