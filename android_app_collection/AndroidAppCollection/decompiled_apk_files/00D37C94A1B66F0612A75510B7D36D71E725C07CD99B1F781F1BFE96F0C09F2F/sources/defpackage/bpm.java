package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: bpm  reason: default package */
/* loaded from: classes2.dex */
public final class bpm extends jo {
    final /* synthetic */ ViewPager b;

    public bpm(ViewPager viewPager) {
        this.b = viewPager;
    }

    private final boolean k() {
        bpg bpgVar = this.b.b;
        return bpgVar != null && bpgVar.j() > 1;
    }

    @Override // defpackage.jo
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        bpg bpgVar;
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(k());
        if (accessibilityEvent.getEventType() != 4096 || (bpgVar = this.b.b) == null) {
            return;
        }
        accessibilityEvent.setItemCount(bpgVar.j());
        accessibilityEvent.setFromIndex(this.b.c);
        accessibilityEvent.setToIndex(this.b.c);
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        mhVar.r("androidx.viewpager.widget.ViewPager");
        mhVar.C(k());
        if (this.b.canScrollHorizontally(1)) {
            mhVar.h(4096);
        }
        if (this.b.canScrollHorizontally(-1)) {
            mhVar.h(8192);
        }
    }

    @Override // defpackage.jo
    public final boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.b.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager = this.b;
            viewPager.l(viewPager.c - 1);
            return true;
        } else if (!this.b.canScrollHorizontally(1)) {
            return false;
        } else {
            ViewPager viewPager2 = this.b;
            viewPager2.l(viewPager2.c + 1);
            return true;
        }
    }
}
