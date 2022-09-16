package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: PG */
@Deprecated
/* renamed from: eu  reason: default package */
/* loaded from: classes3.dex */
public abstract class eu extends bpg {
    private final eo b;
    private ex c = null;
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private dp f = null;
    private boolean g;

    @Deprecated
    public eu(eo eoVar) {
        this.b = eoVar;
    }

    @Override // defpackage.bpg
    public final Parcelable a() {
        Bundle bundle;
        if (this.d.size() > 0) {
            bundle = new Bundle();
            Fragment$SavedState[] fragment$SavedStateArr = new Fragment$SavedState[this.d.size()];
            this.d.toArray(fragment$SavedStateArr);
            bundle.putParcelableArray("states", fragment$SavedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.e.size(); i++) {
            dp dpVar = (dp) this.e.get(i);
            if (dpVar != null && dpVar.ap()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.b.M(bundle, "f" + i, dpVar);
            }
        }
        return bundle;
    }

    public abstract dp b(int i);

    @Override // defpackage.bpg
    public Object c(ViewGroup viewGroup, int i) {
        Fragment$SavedState fragment$SavedState;
        dp dpVar;
        if (this.e.size() <= i || (dpVar = (dp) this.e.get(i)) == null) {
            if (this.c == null) {
                this.c = this.b.l();
            }
            dp b = b(i);
            if (this.d.size() > i && (fragment$SavedState = (Fragment$SavedState) this.d.get(i)) != null) {
                b.ag(fragment$SavedState);
            }
            while (this.e.size() <= i) {
                this.e.add(null);
            }
            b.ah(false);
            b.al(false);
            this.e.set(i, b);
            this.c.p(viewGroup.getId(), b);
            return b;
        }
        return dpVar;
    }

    @Override // defpackage.bpg
    public void d(ViewGroup viewGroup, int i, Object obj) {
        dp dpVar = (dp) obj;
        if (this.c == null) {
            this.c = this.b.l();
        }
        while (this.d.size() <= i) {
            this.d.add(null);
        }
        this.d.set(i, dpVar.ap() ? this.b.c(dpVar) : null);
        this.e.set(i, null);
        this.c.m(dpVar);
        if (dpVar.equals(this.f)) {
            this.f = null;
        }
    }

    @Override // defpackage.bpg
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.d.clear();
            this.e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.d.add((Fragment$SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    dp g = this.b.g(bundle, str);
                    if (g != null) {
                        while (this.e.size() <= parseInt) {
                            this.e.add(null);
                        }
                        g.ah(false);
                        this.e.set(parseInt, g);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // defpackage.bpg
    public final void f(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // defpackage.bpg
    public final boolean g(View view, Object obj) {
        return ((dp) obj).O == view;
    }

    @Override // defpackage.bpg
    public final void h() {
        ex exVar = this.c;
        if (exVar != null) {
            if (!this.g) {
                try {
                    this.g = true;
                    exVar.e();
                } finally {
                    this.g = false;
                }
            }
            this.c = null;
        }
    }

    @Override // defpackage.bpg
    public final void i(Object obj) {
        dp dpVar = (dp) obj;
        dp dpVar2 = this.f;
        if (dpVar != dpVar2) {
            if (dpVar2 != null) {
                dpVar2.ah(false);
                this.f.al(false);
            }
            dpVar.ah(true);
            dpVar.al(true);
            this.f = dpVar;
        }
    }
}
