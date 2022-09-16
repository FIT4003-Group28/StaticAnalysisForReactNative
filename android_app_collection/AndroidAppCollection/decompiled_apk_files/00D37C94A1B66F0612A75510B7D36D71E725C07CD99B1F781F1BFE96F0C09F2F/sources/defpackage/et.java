package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.FragmentState;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: et  reason: default package */
/* loaded from: classes3.dex */
public final class et {
    public final ev a;
    public final dp b;
    private final ed d;
    private boolean e = false;
    public int c = -1;

    public et(ed edVar, ev evVar, dp dpVar) {
        this.d = edVar;
        this.a = evVar;
        this.b = dpVar;
    }

    public et(ed edVar, ev evVar, dp dpVar, FragmentState fragmentState) {
        this.d = edVar;
        this.a = evVar;
        this.b = dpVar;
        dpVar.i = null;
        dpVar.j = null;
        dpVar.y = 0;
        dpVar.v = false;
        dpVar.r = false;
        dp dpVar2 = dpVar.n;
        dpVar.o = dpVar2 != null ? dpVar2.l : null;
        dpVar.n = null;
        Bundle bundle = fragmentState.m;
        if (bundle != null) {
            dpVar.h = bundle;
        } else {
            dpVar.h = new Bundle();
        }
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        dp dpVar = this.b;
        dpVar.oz(bundle);
        dpVar.ab.c(bundle);
        Parcelable b = dpVar.B.b();
        if (b != null) {
            bundle.putParcelable("android:support:fragments", b);
        }
        this.d.j(this.b, bundle, false);
        if (true == bundle.isEmpty()) {
            bundle = null;
        }
        if (this.b.O != null) {
            g();
        }
        if (this.b.i != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.b.i);
        }
        if (this.b.j != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.b.j);
        }
        if (!this.b.Q) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.b.Q);
        }
        return bundle;
    }

    public final void b() {
        View view;
        View view2;
        ev evVar = this.a;
        dp dpVar = this.b;
        ViewGroup viewGroup = dpVar.N;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = evVar.a.indexOf(dpVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= evVar.a.size()) {
                            break;
                        }
                        dp dpVar2 = (dp) evVar.a.get(indexOf);
                        if (dpVar2.N == viewGroup && (view = dpVar2.O) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    dp dpVar3 = (dp) evVar.a.get(i2);
                    if (dpVar3.N == viewGroup && (view2 = dpVar3.O) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        dp dpVar4 = this.b;
        dpVar4.N.addView(dpVar4.O, i);
    }

    final void c() {
        String str;
        if (this.b.u) {
            return;
        }
        if (eo.X(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.b);
        }
        dp dpVar = this.b;
        LayoutInflater mb = dpVar.mb(dpVar.h);
        dp dpVar2 = this.b;
        ViewGroup viewGroup = dpVar2.N;
        if (viewGroup == null) {
            int i = dpVar2.E;
            if (i == 0) {
                viewGroup = null;
            } else if (i == -1) {
                throw new IllegalArgumentException("Cannot create fragment " + this.b + " for a container view with no id");
            } else {
                viewGroup = (ViewGroup) dpVar2.z.n.a(i);
                if (viewGroup == null) {
                    dp dpVar3 = this.b;
                    if (!dpVar3.w) {
                        try {
                            str = dpVar3.rh().getResourceName(this.b.E);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.b.E) + " (" + str + ") for fragment " + this.b);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    ape.f(this.b, viewGroup);
                }
            }
        }
        dp dpVar4 = this.b;
        dpVar4.N = viewGroup;
        dpVar4.lK(mb, viewGroup, dpVar4.h);
        View view = this.b.O;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            dp dpVar5 = this.b;
            dpVar5.O.setTag(R.id.fragment_container_view_tag, dpVar5);
            if (viewGroup != null) {
                b();
            }
            dp dpVar6 = this.b;
            if (dpVar6.G) {
                dpVar6.O.setVisibility(8);
            }
            if (lj.aj(this.b.O)) {
                lj.K(this.b.O);
            } else {
                View view2 = this.b.O;
                view2.addOnAttachStateChangeListener(new es(view2));
            }
            this.b.aa();
            ed edVar = this.d;
            dp dpVar7 = this.b;
            edVar.m(dpVar7, dpVar7.O, dpVar7.h, false);
            int visibility = this.b.O.getVisibility();
            this.b.ri().l = this.b.O.getAlpha();
            dp dpVar8 = this.b;
            if (dpVar8.N != null && visibility == 0) {
                View findFocus = dpVar8.O.findFocus();
                if (findFocus != null) {
                    this.b.af(findFocus);
                    if (eo.X(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("requestFocus: Saved focused view ");
                        sb2.append(findFocus);
                        sb2.append(" for Fragment ");
                        sb2.append(this.b);
                    }
                }
                this.b.O.setAlpha(0.0f);
            }
        }
        this.b.g = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        dp dpVar = this.b;
        if (!dpVar.u || !dpVar.v || dpVar.x) {
            return;
        }
        if (eo.X(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.b);
        }
        dp dpVar2 = this.b;
        dpVar2.lK(dpVar2.mb(dpVar2.h), null, this.b.h);
        View view = this.b.O;
        if (view == null) {
            return;
        }
        view.setSaveFromParentEnabled(false);
        dp dpVar3 = this.b;
        dpVar3.O.setTag(R.id.fragment_container_view_tag, dpVar3);
        dp dpVar4 = this.b;
        if (dpVar4.G) {
            dpVar4.O.setVisibility(8);
        }
        this.b.aa();
        ed edVar = this.d;
        dp dpVar5 = this.b;
        edVar.m(dpVar5, dpVar5.O, dpVar5.h, false);
        this.b.g = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x076a, code lost:
        if (r5 != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0526, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0526, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 2418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et.e():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(ClassLoader classLoader) {
        Bundle bundle = this.b.h;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        dp dpVar = this.b;
        dpVar.i = dpVar.h.getSparseParcelableArray("android:view_state");
        dp dpVar2 = this.b;
        dpVar2.j = dpVar2.h.getBundle("android:view_registry_state");
        dp dpVar3 = this.b;
        dpVar3.o = dpVar3.h.getString("android:target_state");
        dp dpVar4 = this.b;
        if (dpVar4.o != null) {
            dpVar4.p = dpVar4.h.getInt("android:target_req_state", 0);
        }
        dp dpVar5 = this.b;
        Boolean bool = dpVar5.k;
        if (bool != null) {
            dpVar5.Q = bool.booleanValue();
            this.b.k = null;
        } else {
            dpVar5.Q = dpVar5.h.getBoolean("android:user_visible_hint", true);
        }
        dp dpVar6 = this.b;
        if (dpVar6.Q) {
            return;
        }
        dpVar6.P = true;
    }

    final void g() {
        if (this.b.O == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.b.O.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.b.i = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.b.Y.b.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.b.j = bundle;
    }

    public et(ed edVar, ev evVar, ClassLoader classLoader, dy dyVar, FragmentState fragmentState) {
        this.d = edVar;
        this.a = evVar;
        dp c = dyVar.c(fragmentState.a);
        Bundle bundle = fragmentState.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        c.ae(fragmentState.j);
        c.l = fragmentState.b;
        c.u = fragmentState.c;
        c.w = true;
        c.D = fragmentState.d;
        c.E = fragmentState.e;
        c.F = fragmentState.f;
        c.I = fragmentState.g;
        c.s = fragmentState.h;
        c.H = fragmentState.i;
        c.G = fragmentState.k;
        c.W = apt.values()[fragmentState.l];
        Bundle bundle2 = fragmentState.m;
        if (bundle2 != null) {
            c.h = bundle2;
        } else {
            c.h = new Bundle();
        }
        this.b = c;
        if (eo.X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(c);
        }
    }
}
