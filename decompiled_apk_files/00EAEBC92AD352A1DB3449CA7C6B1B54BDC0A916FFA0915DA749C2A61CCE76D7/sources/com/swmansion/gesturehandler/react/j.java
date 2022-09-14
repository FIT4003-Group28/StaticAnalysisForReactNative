package com.swmansion.gesturehandler.react;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import c.f.a.l;
import c.f.a.p;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.x;
/* loaded from: classes.dex */
public class j implements p {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9936a = new int[r.values().length];

        static {
            try {
                f9936a[r.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9936a[r.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9936a[r.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // c.f.a.p
    public View a(ViewGroup viewGroup, int i) {
        return viewGroup instanceof com.facebook.react.views.view.f ? viewGroup.getChildAt(((com.facebook.react.views.view.f) viewGroup).getZIndexMappedChildIndex(i)) : viewGroup.getChildAt(i);
    }

    @Override // c.f.a.p
    public l a(View view) {
        r pointerEvents = view instanceof x ? ((x) view).getPointerEvents() : r.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == r.AUTO) {
                return l.BOX_NONE;
            }
            if (pointerEvents == r.BOX_ONLY) {
                return l.NONE;
            }
        }
        int i = a.f9936a[pointerEvents.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? l.AUTO : l.NONE : l.BOX_NONE : l.BOX_ONLY;
    }

    @Override // c.f.a.p
    public boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT < 18 || viewGroup.getClipChildren()) {
            return true;
        }
        if (!(viewGroup instanceof com.facebook.react.views.view.f)) {
            return false;
        }
        return "hidden".equals(((com.facebook.react.views.view.f) viewGroup).getOverflow());
    }
}
