package defpackage;

import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: dbg  reason: default package */
/* loaded from: classes3.dex */
public final class dbg extends bpp {
    public final WeakReference a;
    public final WeakReference b;

    public dbg(ComponentTree componentTree, ViewPager viewPager) {
        this.a = new WeakReference(componentTree);
        this.b = new WeakReference(viewPager);
    }

    @Override // defpackage.bpp, defpackage.bpn
    public final void b(int i, float f, int i2) {
        ComponentTree componentTree = (ComponentTree) this.a.get();
        if (componentTree != null) {
            componentTree.l();
        }
    }
}
