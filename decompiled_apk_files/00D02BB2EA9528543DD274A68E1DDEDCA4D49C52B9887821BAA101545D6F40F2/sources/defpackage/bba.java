package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: bba  reason: default package */
/* loaded from: classes3.dex */
public final class bba extends ne {
    final /* synthetic */ ViewPager b;

    public bba(ViewPager viewPager) {
        this.b = viewPager;
    }

    private final boolean k() {
        bas basVar = this.b.b;
        return basVar != null && basVar.OV() > 1;
    }

    @Override // defpackage.ne
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        bas basVar;
        super.e(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(k());
        if (accessibilityEvent.getEventType() != 4096 || (basVar = this.b.b) == null) {
            return;
        }
        accessibilityEvent.setItemCount(basVar.OV());
        accessibilityEvent.setFromIndex(this.b.c);
        accessibilityEvent.setToIndex(this.b.c);
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        super.f(view, pcVar);
        pcVar.B("androidx.viewpager.widget.ViewPager");
        pcVar.y(k());
        if (this.b.canScrollHorizontally(1)) {
            pcVar.f(4096);
        }
        if (this.b.canScrollHorizontally(-1)) {
            pcVar.f(8192);
        }
    }

    @Override // defpackage.ne
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.b.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager = this.b;
            viewPager.setCurrentItem(viewPager.c - 1);
            return true;
        } else if (!this.b.canScrollHorizontally(1)) {
            return false;
        } else {
            ViewPager viewPager2 = this.b;
            viewPager2.setCurrentItem(viewPager2.c + 1);
            return true;
        }
    }
}
