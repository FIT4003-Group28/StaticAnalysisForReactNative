package defpackage;

import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
/* compiled from: PG */
/* renamed from: dbh  reason: default package */
/* loaded from: classes3.dex */
public final class dbh {
    public final List a = new ArrayList(2);
    private final ComponentTree b;

    public dbh(ComponentTree componentTree) {
        this.b = componentTree;
    }

    public final void a(dci dciVar) {
        if (!this.b.j) {
            return;
        }
        for (ViewParent parent = dciVar.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewPager) {
                ViewPager viewPager = (ViewPager) parent;
                dbg dbgVar = new dbg(this.b, viewPager);
                try {
                    viewPager.e(dbgVar);
                } catch (ConcurrentModificationException unused) {
                    lj.H(viewPager, new dbf(viewPager, dbgVar, 1));
                }
                this.a.add(dbgVar);
            }
        }
    }
}
