package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioSwapTabsBar extends DefaultTabsBar {
    public ViewPager a;

    public AudioSwapTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.yyd
    public final void m(int i, boolean z) {
        super.m(i, z);
        ViewPager viewPager = this.a;
        if (viewPager == null || !z) {
            return;
        }
        viewPager.m(i, true);
    }
}
