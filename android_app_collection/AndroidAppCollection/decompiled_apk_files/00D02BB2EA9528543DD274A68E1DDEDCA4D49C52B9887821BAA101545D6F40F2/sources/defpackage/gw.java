package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentState;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gw  reason: default package */
/* loaded from: classes.dex */
public final class gw {
    public final fd a;
    private final fu c;
    private final gx d;
    private akq f;
    private akq g;
    private boolean e = false;
    public int b = -1;

    public gw(fu fuVar, gx gxVar, fd fdVar) {
        this.c = fuVar;
        this.d = gxVar;
        this.a = fdVar;
    }

    public gw(fu fuVar, gx gxVar, fd fdVar, FragmentState fragmentState) {
        this.c = fuVar;
        this.d = gxVar;
        this.a = fdVar;
        fdVar.k = null;
        fdVar.l = null;
        fdVar.z = 0;
        fdVar.w = false;
        fdVar.t = false;
        fd fdVar2 = fdVar.p;
        fdVar.q = fdVar2 != null ? fdVar2.n : null;
        fdVar.p = null;
        Bundle bundle = fragmentState.m;
        if (bundle != null) {
            fdVar.j = bundle;
        } else {
            fdVar.j = new Bundle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        fd fdVar = this.a;
        if (fdVar.A == null) {
            return fdVar.i;
        }
        int i = this.b;
        if (fdVar.v) {
            if (fdVar.w) {
                i = Math.max(i, 2);
            } else {
                i = i < 4 ? Math.min(i, fdVar.i) : Math.min(i, 1);
            }
        }
        if (!this.a.t) {
            i = Math.min(i, 1);
        }
        fd fdVar2 = this.a;
        if (fdVar2.u) {
            i = fdVar2.A() ? Math.min(i, 1) : Math.min(i, -1);
        }
        fd fdVar3 = this.a;
        if (fdVar3.Q && fdVar3.i < 5) {
            i = Math.min(i, 4);
        }
        j jVar = j.DESTROYED;
        int ordinal = this.a.Y.ordinal();
        return ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? Math.min(i, -1) : i : Math.min(i, 5) : Math.min(i, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.e) {
            if (!gn.a(2)) {
                return;
            }
            String str = "Ignoring re-entrant call to moveToExpectedState() for " + this.a;
            return;
        }
        try {
            this.e = true;
            while (true) {
                int a = a();
                int i = this.a.i;
                if (a == i) {
                    return;
                }
                if (a <= i) {
                    int i2 = i - 1;
                    akq akqVar = this.f;
                    if (akqVar != null) {
                        akqVar.b();
                    }
                    switch (i2) {
                        case -1:
                            q();
                            continue;
                        case 0:
                            p();
                            continue;
                        case 1:
                            this.a.i = 1;
                            continue;
                        case 2:
                            o();
                            this.a.i = 2;
                            continue;
                        case 3:
                            if (gn.a(3)) {
                                String str2 = "movefrom ACTIVITY_CREATED: " + this.a;
                            }
                            fd fdVar = this.a;
                            if (fdVar.P != null && fdVar.k == null) {
                                n();
                            }
                            fd fdVar2 = this.a;
                            if (fdVar2.P != null && (viewGroup2 = fdVar2.O) != null && this.b >= 0) {
                                iu a2 = iu.a(viewGroup2, fdVar2.Q());
                                akq akqVar2 = new akq();
                                this.g = akqVar2;
                                a2.b(2, this, akqVar2);
                            }
                            this.a.i = 3;
                            continue;
                        case 4:
                            l();
                            continue;
                        case 5:
                            this.a.i = 5;
                            continue;
                        case 6:
                            k();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    int i3 = i + 1;
                    akq akqVar3 = this.g;
                    if (akqVar3 != null) {
                        akqVar3.b();
                    }
                    switch (i3) {
                        case 0:
                            e();
                            continue;
                        case 1:
                            f();
                            continue;
                        case 2:
                            c();
                            g();
                            continue;
                        case 3:
                            h();
                            continue;
                        case 4:
                            fd fdVar3 = this.a;
                            if (fdVar3.P != null && (viewGroup = fdVar3.O) != null) {
                                iu a3 = iu.a(viewGroup, fdVar3.Q());
                                akq akqVar4 = new akq();
                                this.f = akqVar4;
                                a3.b(1, this, akqVar4);
                            }
                            this.a.i = 4;
                            continue;
                        case 5:
                            i();
                            continue;
                        case 6:
                            this.a.i = 6;
                            continue;
                        case 7:
                            j();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.e = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        fd fdVar = this.a;
        if (!fdVar.v || !fdVar.w || fdVar.y) {
            return;
        }
        if (gn.a(3)) {
            String str = "moveto CREATE_VIEW: " + this.a;
        }
        fd fdVar2 = this.a;
        fdVar2.NB(fdVar2.ad(fdVar2.j), null, this.a.j);
        View view = this.a.P;
        if (view == null) {
            return;
        }
        view.setSaveFromParentEnabled(false);
        fd fdVar3 = this.a;
        fdVar3.P.setTag(R.id.fragment_container_view_tag, fdVar3);
        fd fdVar4 = this.a;
        if (fdVar4.H) {
            fdVar4.P.setVisibility(8);
        }
        this.a.ar();
        fu fuVar = this.c;
        fd fdVar5 = this.a;
        fuVar.f(fdVar5, fdVar5.P, fdVar5.j, false);
        this.a.i = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(ClassLoader classLoader) {
        Bundle bundle = this.a.j;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fd fdVar = this.a;
        fdVar.k = fdVar.j.getSparseParcelableArray("android:view_state");
        fd fdVar2 = this.a;
        fdVar2.l = fdVar2.j.getBundle("android:view_registry_state");
        fd fdVar3 = this.a;
        fdVar3.q = fdVar3.j.getString("android:target_state");
        fd fdVar4 = this.a;
        if (fdVar4.q != null) {
            fdVar4.r = fdVar4.j.getInt("android:target_req_state", 0);
        }
        fd fdVar5 = this.a;
        Boolean bool = fdVar5.m;
        if (bool != null) {
            fdVar5.R = bool.booleanValue();
            this.a.m = null;
        } else {
            fdVar5.R = fdVar5.j.getBoolean("android:user_visible_hint", true);
        }
        fd fdVar6 = this.a;
        if (fdVar6.R) {
            return;
        }
        fdVar6.Q = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (gn.a(3)) {
            String str = "moveto ATTACHED: " + this.a;
        }
        fd fdVar = this.a;
        fd fdVar2 = fdVar.p;
        gw gwVar = null;
        if (fdVar2 != null) {
            gw j = this.d.j(fdVar2.n);
            if (j != null) {
                fd fdVar3 = this.a;
                fdVar3.q = fdVar3.p.n;
                fdVar3.p = null;
                gwVar = j;
            } else {
                throw new IllegalStateException("Fragment " + this.a + " declared target fragment " + this.a.p + " that does not belong to this FragmentManager!");
            }
        } else {
            String str2 = fdVar.q;
            if (str2 != null && (gwVar = this.d.j(str2)) == null) {
                throw new IllegalStateException("Fragment " + this.a + " declared target fragment " + this.a.q + " that does not belong to this FragmentManager!");
            }
        }
        if (gwVar != null && gwVar.a.i <= 0) {
            gwVar.b();
        }
        fd fdVar4 = this.a;
        gn gnVar = fdVar4.A;
        fdVar4.B = gnVar.k;
        fdVar4.D = gnVar.m;
        this.c.a(fdVar4, false);
        fd fdVar5 = this.a;
        fdVar5.C.P(fdVar5.B, fdVar5.PW(), fdVar5);
        fdVar5.i = 0;
        fdVar5.N = false;
        fdVar5.Qi(fdVar5.B.c);
        if (!fdVar5.N) {
            throw new iv("Fragment " + fdVar5 + " did not call through to super.onAttach()");
        }
        Iterator<gs> it = fdVar5.A.i.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
        gn gnVar2 = fdVar5.C;
        gnVar2.s = false;
        gnVar2.t = false;
        gnVar2.v.i = false;
        gnVar2.Y(0);
        this.c.b(this.a, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (gn.a(3)) {
            String str = "moveto CREATED: " + this.a;
        }
        fd fdVar = this.a;
        if (!fdVar.X) {
            this.c.c(fdVar, fdVar.j, false);
            final fd fdVar2 = this.a;
            Bundle bundle = fdVar2.j;
            fdVar2.C.Q();
            fdVar2.i = 1;
            fdVar2.N = false;
            fdVar2.Z.a(new l() { // from class: android.support.v4.app.Fragment$4
                @Override // defpackage.l
                public final void MV(m mVar, i iVar) {
                    View view;
                    if (iVar != i.ON_STOP || (view = fd.this.P) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
            fdVar2.ac.a(bundle);
            fdVar2.l(bundle);
            fdVar2.X = true;
            if (!fdVar2.N) {
                throw new iv("Fragment " + fdVar2 + " did not call through to super.onCreate()");
            }
            fdVar2.Z.e(i.ON_CREATE);
            fu fuVar = this.c;
            fd fdVar3 = this.a;
            fuVar.d(fdVar3, fdVar3.j, false);
            return;
        }
        fdVar.af(fdVar.j);
        this.a.i = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        View view;
        View view2;
        String str;
        if (this.a.v) {
            return;
        }
        if (gn.a(3)) {
            String str2 = "moveto CREATE_VIEW: " + this.a;
        }
        fd fdVar = this.a;
        LayoutInflater ad = fdVar.ad(fdVar.j);
        fd fdVar2 = this.a;
        ViewGroup viewGroup = fdVar2.O;
        int i = -1;
        if (viewGroup == null) {
            int i2 = fdVar2.F;
            if (i2 == 0) {
                viewGroup = null;
            } else if (i2 == -1) {
                throw new IllegalArgumentException("Cannot create fragment " + this.a + " for a container view with no id");
            } else {
                viewGroup = (ViewGroup) fdVar2.A.l.a(i2);
                if (viewGroup == null) {
                    fd fdVar3 = this.a;
                    if (!fdVar3.x) {
                        try {
                            str = fdVar3.Rn().getResourceName(this.a.F);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.a.F) + " (" + str + ") for fragment " + this.a);
                    }
                }
            }
        }
        fd fdVar4 = this.a;
        fdVar4.O = viewGroup;
        fdVar4.NB(ad, viewGroup, fdVar4.j);
        View view3 = this.a.P;
        if (view3 != null) {
            boolean z = false;
            view3.setSaveFromParentEnabled(false);
            fd fdVar5 = this.a;
            fdVar5.P.setTag(R.id.fragment_container_view_tag, fdVar5);
            if (viewGroup != null) {
                gx gxVar = this.d;
                fd fdVar6 = this.a;
                ViewGroup viewGroup2 = fdVar6.O;
                if (viewGroup2 != null) {
                    int indexOf = gxVar.a.indexOf(fdVar6);
                    int i3 = indexOf - 1;
                    while (true) {
                        if (i3 < 0) {
                            int i4 = indexOf + 1;
                            while (true) {
                                if (i4 >= gxVar.a.size()) {
                                    break;
                                }
                                fd fdVar7 = gxVar.a.get(i4);
                                if (fdVar7.O == viewGroup2 && (view = fdVar7.P) != null) {
                                    i = viewGroup2.indexOfChild(view);
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            fd fdVar8 = gxVar.a.get(i3);
                            if (fdVar8.O == viewGroup2 && (view2 = fdVar8.P) != null) {
                                i = viewGroup2.indexOfChild(view2) + 1;
                                break;
                            }
                            i3--;
                        }
                    }
                }
                viewGroup.addView(this.a.P, i);
            }
            fd fdVar9 = this.a;
            if (fdVar9.H) {
                fdVar9.P.setVisibility(8);
            }
            if (od.ak(this.a.P)) {
                od.L(this.a.P);
            } else {
                View view4 = this.a.P;
                view4.addOnAttachStateChangeListener(new gv(view4));
            }
            this.a.ar();
            fu fuVar = this.c;
            fd fdVar10 = this.a;
            fuVar.f(fdVar10, fdVar10.P, fdVar10.j, false);
            fd fdVar11 = this.a;
            if (fdVar11.P.getVisibility() == 0 && this.a.O != null) {
                z = true;
            }
            fdVar11.T = z;
        }
        this.a.i = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (gn.a(3)) {
            String str = "moveto ACTIVITY_CREATED: " + this.a;
        }
        fd fdVar = this.a;
        Bundle bundle = fdVar.j;
        fdVar.C.Q();
        fdVar.i = 3;
        fdVar.N = false;
        fdVar.aj(bundle);
        if (!fdVar.N) {
            throw new iv("Fragment " + fdVar + " did not call through to super.onActivityCreated()");
        }
        if (gn.a(3)) {
            String str2 = "moveto RESTORE_VIEW_STATE: " + fdVar;
        }
        View view = fdVar.P;
        if (view != null) {
            Bundle bundle2 = fdVar.j;
            SparseArray<Parcelable> sparseArray = fdVar.k;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                fdVar.k = null;
            }
            if (fdVar.P != null) {
                fdVar.aa.b.a(fdVar.l);
                fdVar.l = null;
            }
            fdVar.N = false;
            fdVar.Qj(bundle2);
            if (!fdVar.N) {
                throw new iv("Fragment " + fdVar + " did not call through to super.onViewStateRestored()");
            } else if (fdVar.P != null) {
                fdVar.aa.c(i.ON_CREATE);
            }
        }
        fdVar.j = null;
        fdVar.C.S();
        fu fuVar = this.c;
        fd fdVar2 = this.a;
        fuVar.e(fdVar2, fdVar2.j, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        if (gn.a(3)) {
            String str = "moveto STARTED: " + this.a;
        }
        fd fdVar = this.a;
        fdVar.C.Q();
        fdVar.C.at(true);
        fdVar.i = 5;
        fdVar.N = false;
        fdVar.s();
        if (!fdVar.N) {
            throw new iv("Fragment " + fdVar + " did not call through to super.onStart()");
        }
        fdVar.Z.e(i.ON_START);
        if (fdVar.P != null) {
            fdVar.aa.c(i.ON_START);
        }
        fdVar.C.T();
        this.c.g(this.a, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        if (gn.a(3)) {
            String str = "moveto RESUMED: " + this.a;
        }
        fd fdVar = this.a;
        fdVar.C.Q();
        fdVar.C.at(true);
        fdVar.i = 7;
        fdVar.N = false;
        fdVar.ak();
        if (!fdVar.N) {
            throw new iv("Fragment " + fdVar + " did not call through to super.onResume()");
        }
        fdVar.Z.e(i.ON_RESUME);
        if (fdVar.P != null) {
            fdVar.aa.c(i.ON_RESUME);
        }
        fdVar.C.U();
        this.c.h(this.a, false);
        fd fdVar2 = this.a;
        fdVar2.j = null;
        fdVar2.k = null;
        fdVar2.l = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        if (gn.a(3)) {
            String str = "movefrom RESUMED: " + this.a;
        }
        fd fdVar = this.a;
        fdVar.C.V();
        if (fdVar.P != null) {
            fdVar.aa.c(i.ON_PAUSE);
        }
        fdVar.Z.e(i.ON_PAUSE);
        fdVar.i = 6;
        fdVar.N = false;
        fdVar.al();
        if (fdVar.N) {
            this.c.i(this.a, false);
            return;
        }
        throw new iv("Fragment " + fdVar + " did not call through to super.onPause()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        if (gn.a(3)) {
            String str = "movefrom STARTED: " + this.a;
        }
        fd fdVar = this.a;
        fdVar.C.W();
        if (fdVar.P != null) {
            fdVar.aa.c(i.ON_STOP);
        }
        fdVar.Z.e(i.ON_STOP);
        fdVar.i = 4;
        fdVar.N = false;
        fdVar.u();
        if (fdVar.N) {
            this.c.j(this.a, false);
            return;
        }
        throw new iv("Fragment " + fdVar + " did not call through to super.onStop()");
    }

    public final Bundle m() {
        Bundle bundle = new Bundle();
        fd fdVar = this.a;
        fdVar.t(bundle);
        fdVar.ac.b(bundle);
        Parcelable N = fdVar.C.N();
        if (N != null) {
            bundle.putParcelable("android:support:fragments", N);
        }
        this.c.k(this.a, bundle, false);
        if (true == bundle.isEmpty()) {
            bundle = null;
        }
        if (this.a.P != null) {
            n();
        }
        if (this.a.k != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.a.k);
        }
        if (this.a.l != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.a.l);
        }
        if (!this.a.R) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.a.R);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        if (this.a.P == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.a.P.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.a.k = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.a.aa.b.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.a.l = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        this.a.as();
        this.c.l(this.a, false);
        fd fdVar = this.a;
        fdVar.O = null;
        fdVar.P = null;
        fdVar.aa = null;
        fdVar.ab.g(null);
        this.a.w = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        fd l;
        if (gn.a(3)) {
            String str = "movefrom CREATED: " + this.a;
        }
        fd fdVar = this.a;
        boolean z = true;
        boolean z2 = fdVar.u && !fdVar.A();
        if (z2 || this.d.c.d(this.a)) {
            fr<?> frVar = this.a.B;
            if (frVar instanceof ax) {
                z = this.d.c.h;
            } else {
                Context context = frVar.c;
                if (context instanceof Activity) {
                    z = true ^ ((Activity) context).isChangingConfigurations();
                }
            }
            if (z2 || z) {
                gr grVar = this.d.c;
                fd fdVar2 = this.a;
                if (gn.a(3)) {
                    String str2 = "Clearing non-config state for " + fdVar2;
                }
                gr grVar2 = grVar.e.get(fdVar2.n);
                if (grVar2 != null) {
                    grVar2.a();
                    grVar.e.remove(fdVar2.n);
                }
                aw awVar = grVar.f.get(fdVar2.n);
                if (awVar != null) {
                    awVar.c();
                    grVar.f.remove(fdVar2.n);
                }
            }
            fd fdVar3 = this.a;
            fdVar3.C.X();
            fdVar3.Z.e(i.ON_DESTROY);
            fdVar3.i = 0;
            fdVar3.N = false;
            fdVar3.X = false;
            fdVar3.am();
            if (fdVar3.N) {
                this.c.m(this.a, false);
                for (gw gwVar : this.d.f()) {
                    if (gwVar != null) {
                        fd fdVar4 = gwVar.a;
                        if (this.a.n.equals(fdVar4.q)) {
                            fdVar4.p = this.a;
                            fdVar4.q = null;
                        }
                    }
                }
                fd fdVar5 = this.a;
                String str3 = fdVar5.q;
                if (str3 != null) {
                    fdVar5.p = this.d.l(str3);
                }
                this.d.d(this);
                return;
            }
            throw new iv("Fragment " + fdVar3 + " did not call through to super.onDestroy()");
        }
        String str4 = this.a.q;
        if (str4 != null && (l = this.d.l(str4)) != null && l.J) {
            this.a.p = l;
        }
        this.a.i = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        if (gn.a(3)) {
            String str = "movefrom ATTACHED: " + this.a;
        }
        fd fdVar = this.a;
        fdVar.i = -1;
        fdVar.N = false;
        fdVar.Qd();
        fdVar.W = null;
        if (fdVar.N) {
            gn gnVar = fdVar.C;
            if (!gnVar.u) {
                gnVar.X();
                fdVar.C = new go();
            }
            this.c.n(this.a, false);
            fd fdVar2 = this.a;
            fdVar2.i = -1;
            fdVar2.B = null;
            fdVar2.D = null;
            fdVar2.A = null;
            if ((!fdVar2.u || fdVar2.A()) && !this.d.c.d(this.a)) {
                return;
            }
            if (gn.a(3)) {
                String str2 = "initState called for fragment: " + this.a;
            }
            fd fdVar3 = this.a;
            fdVar3.z();
            fdVar3.n = UUID.randomUUID().toString();
            fdVar3.t = false;
            fdVar3.u = false;
            fdVar3.v = false;
            fdVar3.w = false;
            fdVar3.x = false;
            fdVar3.z = 0;
            fdVar3.A = null;
            fdVar3.C = new go();
            fdVar3.B = null;
            fdVar3.E = 0;
            fdVar3.F = 0;
            fdVar3.G = null;
            fdVar3.H = false;
            fdVar3.I = false;
            return;
        }
        throw new iv("Fragment " + fdVar + " did not call through to super.onDetach()");
    }

    public gw(fu fuVar, gx gxVar, ClassLoader classLoader, fq fqVar, FragmentState fragmentState) {
        this.c = fuVar;
        this.d = gxVar;
        fd c = fqVar.c(classLoader, fragmentState.a);
        this.a = c;
        Bundle bundle = fragmentState.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        c.B(fragmentState.j);
        c.n = fragmentState.b;
        c.v = fragmentState.c;
        c.x = true;
        c.E = fragmentState.d;
        c.F = fragmentState.e;
        c.G = fragmentState.f;
        c.J = fragmentState.g;
        c.u = fragmentState.h;
        c.I = fragmentState.i;
        c.H = fragmentState.k;
        c.Y = j.values()[fragmentState.l];
        Bundle bundle2 = fragmentState.m;
        if (bundle2 != null) {
            c.j = bundle2;
        } else {
            c.j = new Bundle();
        }
        if (gn.a(2)) {
            String str = "Instantiated fragment " + c;
        }
    }
}
