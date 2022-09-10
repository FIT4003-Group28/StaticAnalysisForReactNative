package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationMenuView extends RecyclerView implements vv {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // defpackage.vv
    public final void a(vf vfVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new aag(1, false));
    }
}
