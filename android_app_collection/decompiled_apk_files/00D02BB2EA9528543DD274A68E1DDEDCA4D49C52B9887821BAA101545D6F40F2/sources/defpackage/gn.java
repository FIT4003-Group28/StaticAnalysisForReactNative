package defpackage;

import android.animation.Animator;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackState;
import android.support.v4.app.Fragment$SavedState;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.apps.maps.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: gn  reason: default package */
/* loaded from: classes.dex */
public abstract class gn {
    private ArrayList<gj> A;
    private fq B;
    private boolean C;
    private boolean D;
    private ArrayList<ep> E;
    private ArrayList<Boolean> F;
    private ArrayList<fd> G;
    private ArrayList<gm> H;
    private Runnable I;
    private final fy J;
    private ga K;
    ArrayList<ep> b;
    public agl d;
    public ConcurrentHashMap<fd, HashSet<akq>> g;
    public final fu h;
    public final CopyOnWriteArrayList<gs> i;
    int j;
    public fr<?> k;
    public fn l;
    public fd m;
    fd n;
    public agq<Intent> o;
    public agq<IntentSenderRequest> p;
    public agq<String[]> q;
    public ArrayDeque<FragmentManager$LaunchedFragmentInfo> r;
    public boolean s;
    public boolean t;
    public boolean u;
    public gr v;
    private boolean x;
    private ArrayList<fd> y;
    private final ArrayList<gk> w = new ArrayList<>();
    public final gx a = new gx();
    public final fs c = new fs(this);
    public final agj e = new fx(this);
    public final AtomicInteger f = new AtomicInteger();
    private final ConcurrentHashMap<String, Bundle> z = new ConcurrentHashMap<>();

    public gn() {
        new ConcurrentHashMap();
        this.g = new ConcurrentHashMap<>();
        this.J = new fy(this);
        this.h = new fu(this);
        this.i = new CopyOnWriteArrayList<>();
        this.j = -1;
        this.B = new fz(this);
        this.K = new ga();
        this.r = new ArrayDeque<>();
        this.I = new gb(this);
    }

    public static boolean a(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    private final void aA(ArrayList<ep> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<gm> arrayList3 = this.H;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            gm gmVar = this.H.get(i);
            if (arrayList == null || gmVar.a || (indexOf2 = arrayList.indexOf(gmVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (gmVar.c == 0 || (arrayList != null && gmVar.b.l(arrayList, 0, arrayList.size()))) {
                    this.H.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || gmVar.a || (indexOf = arrayList.indexOf(gmVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        gmVar.a();
                    } else {
                        gmVar.b();
                    }
                }
            } else {
                this.H.remove(i);
                i--;
                size--;
                gmVar.b();
            }
            i++;
        }
    }

    private final void aB(ArrayList<ep> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        aA(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).s) {
                if (i2 != i) {
                    aC(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).s) {
                        i2++;
                    }
                }
                aC(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 == size) {
            return;
        }
        aC(arrayList, arrayList2, i2, size);
    }

    private final void aC(ArrayList<ep> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z = arrayList.get(i).s;
        ArrayList<fd> arrayList4 = this.G;
        if (arrayList4 == null) {
            this.G = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.G.addAll(this.a.g());
        fd fdVar = this.n;
        int i7 = i;
        boolean z2 = false;
        while (true) {
            int i8 = 1;
            if (i7 < i2) {
                ep epVar = arrayList.get(i7);
                int i9 = 3;
                if (!arrayList3.get(i7).booleanValue()) {
                    ArrayList<fd> arrayList5 = this.G;
                    int i10 = 0;
                    while (i10 < epVar.d.size()) {
                        gy gyVar = epVar.d.get(i10);
                        int i11 = gyVar.a;
                        if (i11 != i8) {
                            if (i11 == 2) {
                                fd fdVar2 = gyVar.b;
                                int i12 = fdVar2.F;
                                int size = arrayList5.size() - 1;
                                boolean z3 = false;
                                while (size >= 0) {
                                    fd fdVar3 = arrayList5.get(size);
                                    if (fdVar3.F != i12) {
                                        i6 = i12;
                                    } else if (fdVar3 == fdVar2) {
                                        i6 = i12;
                                        z3 = true;
                                    } else {
                                        if (fdVar3 == fdVar) {
                                            i6 = i12;
                                            epVar.d.add(i10, new gy(9, fdVar3));
                                            i10++;
                                            fdVar = null;
                                        } else {
                                            i6 = i12;
                                        }
                                        gy gyVar2 = new gy(3, fdVar3);
                                        gyVar2.c = gyVar.c;
                                        gyVar2.e = gyVar.e;
                                        gyVar2.d = gyVar.d;
                                        gyVar2.f = gyVar.f;
                                        epVar.d.add(i10, gyVar2);
                                        arrayList5.remove(fdVar3);
                                        i10++;
                                    }
                                    size--;
                                    i12 = i6;
                                }
                                if (z3) {
                                    epVar.d.remove(i10);
                                    i10--;
                                } else {
                                    i5 = 1;
                                    gyVar.a = 1;
                                    arrayList5.add(fdVar2);
                                    i10 += i5;
                                    i9 = 3;
                                    i8 = 1;
                                }
                            } else if (i11 == i9 || i11 == 6) {
                                arrayList5.remove(gyVar.b);
                                fd fdVar4 = gyVar.b;
                                if (fdVar4 == fdVar) {
                                    epVar.d.add(i10, new gy(9, fdVar4));
                                    i10++;
                                    fdVar = null;
                                }
                            } else if (i11 != 7) {
                                if (i11 == 8) {
                                    epVar.d.add(i10, new gy(9, fdVar));
                                    i10++;
                                    fdVar = gyVar.b;
                                }
                            }
                            i5 = 1;
                            i10 += i5;
                            i9 = 3;
                            i8 = 1;
                        }
                        i5 = 1;
                        arrayList5.add(gyVar.b);
                        i10 += i5;
                        i9 = 3;
                        i8 = 1;
                    }
                } else {
                    ArrayList<fd> arrayList6 = this.G;
                    for (int size2 = epVar.d.size() - 1; size2 >= 0; size2--) {
                        gy gyVar3 = epVar.d.get(size2);
                        int i13 = gyVar3.a;
                        if (i13 != 1) {
                            if (i13 != 3) {
                                switch (i13) {
                                    case 8:
                                        fdVar = null;
                                        break;
                                    case 9:
                                        fdVar = gyVar3.b;
                                        break;
                                    case 10:
                                        gyVar3.h = gyVar3.g;
                                        break;
                                }
                            }
                            arrayList6.add(gyVar3.b);
                        }
                        arrayList6.remove(gyVar3.b);
                    }
                }
                z2 = z2 || epVar.j;
                i7++;
                arrayList3 = arrayList2;
            } else {
                this.G.clear();
                if (z || this.j <= 0) {
                    i3 = -1;
                } else {
                    i3 = -1;
                    hh.e(this.k.c, this.l, arrayList, arrayList2, i, i2, false, this.J);
                }
                int i14 = i;
                while (i14 < i2) {
                    ep epVar2 = arrayList.get(i14);
                    if (arrayList2.get(i14).booleanValue()) {
                        epVar2.e(i3);
                        epVar2.n(i14 == i2 + (-1));
                    } else {
                        epVar2.e(1);
                        epVar2.m();
                    }
                    i14++;
                }
                if (z) {
                    aih<fd> aihVar = new aih<>();
                    aF(aihVar);
                    i4 = i;
                    for (int i15 = i2 - 1; i15 >= i4; i15--) {
                        ep epVar3 = arrayList.get(i15);
                        arrayList2.get(i15).booleanValue();
                        for (int i16 = 0; i16 < epVar3.d.size(); i16++) {
                            ep.o(epVar3.d.get(i16));
                        }
                    }
                    int i17 = aihVar.b;
                    for (int i18 = 0; i18 < i17; i18++) {
                        fd b = aihVar.b(i18);
                        if (!b.t) {
                            View ai = b.ai();
                            b.V = ai.getAlpha();
                            ai.setAlpha(0.0f);
                        }
                    }
                } else {
                    i4 = i;
                }
                if (i2 != i4 && z) {
                    if (this.j > 0) {
                        hh.e(this.k.c, this.l, arrayList, arrayList2, i, i2, true, this.J);
                    }
                    z(this.j, true);
                }
                for (int i19 = i; i19 < i2; i19++) {
                    ep epVar4 = arrayList.get(i19);
                    if (arrayList2.get(i19).booleanValue() && epVar4.c >= 0) {
                        epVar4.c = i3;
                    }
                }
                if (!z2 || this.A == null) {
                    return;
                }
                for (int i20 = 0; i20 < this.A.size(); i20++) {
                    this.A.get(i20).a();
                }
                return;
            }
        }
    }

    private final void aD(fd fdVar) {
        ViewGroup aE = aE(fdVar);
        if (aE != null) {
            if (aE.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                aE.setTag(R.id.visible_removing_fragment_view_tag, fdVar);
            }
            ((fd) aE.getTag(R.id.visible_removing_fragment_view_tag)).av(fdVar.au());
        }
    }

    private final ViewGroup aE(fd fdVar) {
        ViewGroup viewGroup = fdVar.O;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fdVar.F > 0 && this.l.MW()) {
            View a = this.l.a(fdVar.F);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
        }
        return null;
    }

    private final void aF(aih<fd> aihVar) {
        int i = this.j;
        if (i <= 0) {
            return;
        }
        int min = Math.min(i, 5);
        for (fd fdVar : this.a.g()) {
            if (fdVar.i < min) {
                u(fdVar, min);
                if (fdVar.P != null && !fdVar.H && fdVar.T) {
                    aihVar.add(fdVar);
                }
            }
        }
    }

    private final void aG() {
        if (this.H != null) {
            while (!this.H.isEmpty()) {
                this.H.remove(0).a();
            }
        }
    }

    private final void aH() {
        if (!this.g.isEmpty()) {
            for (fd fdVar : this.g.keySet()) {
                av(fdVar);
                x(fdVar);
            }
        }
    }

    private final void aI() {
        if (this.D) {
            this.D = false;
            aw();
        }
    }

    private static final boolean aJ(fd fdVar) {
        boolean z = fdVar.L;
        boolean z2 = false;
        for (fd fdVar2 : fdVar.C.a.h()) {
            if (fdVar2 != null) {
                z2 = aJ(fdVar2);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    static final boolean ar(fd fdVar) {
        if (fdVar == null) {
            return true;
        }
        return fdVar.M && (fdVar.A == null || ar(fdVar.D));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void as(fd fdVar) {
        if (a(2)) {
            String str = "show: " + fdVar;
        }
        if (fdVar.H) {
            fdVar.H = false;
            fdVar.U = !fdVar.U;
        }
    }

    private final void au(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new hu());
        fr<?> frVar = this.k;
        try {
            if (frVar != null) {
                frVar.k(printWriter, new String[0]);
            } else {
                s("  ", null, printWriter, new String[0]);
            }
        } catch (Exception unused) {
        }
        throw runtimeException;
    }

    private final void av(fd fdVar) {
        HashSet<akq> hashSet = this.g.get(fdVar);
        if (hashSet != null) {
            Iterator<akq> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            hashSet.clear();
            w(fdVar);
            this.g.remove(fdVar);
        }
    }

    private final void aw() {
        for (gw gwVar : this.a.f()) {
            t(gwVar);
        }
    }

    private final void ax() {
        if (!J()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private final void ay(boolean z) {
        if (!this.x) {
            if (this.k == null) {
                if (this.u) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() != this.k.d.getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            } else {
                if (!z) {
                    ax();
                }
                if (this.E == null) {
                    this.E = new ArrayList<>();
                    this.F = new ArrayList<>();
                }
                this.x = true;
                try {
                    aA(null, null);
                    return;
                } finally {
                    this.x = false;
                }
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private final void az() {
        this.x = false;
        this.F.clear();
        this.E.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fd p(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof fd) {
            return (fd) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final gw A(fd fdVar) {
        gw j = this.a.j(fdVar.n);
        if (j != null) {
            return j;
        }
        gw gwVar = new gw(this.h, this.a, fdVar);
        gwVar.d(this.k.c.getClassLoader());
        gwVar.b = this.j;
        return gwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(fd fdVar) {
        if (a(2)) {
            String str = "add: " + fdVar;
        }
        this.a.a(A(fdVar));
        if (!fdVar.I) {
            this.a.b(fdVar);
            fdVar.u = false;
            if (fdVar.P == null) {
                fdVar.U = false;
            }
            if (!aJ(fdVar)) {
                return;
            }
            this.C = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(fd fdVar) {
        if (a(2)) {
            String str = "remove: " + fdVar + " nesting=" + fdVar.z;
        }
        boolean z = !fdVar.A();
        if (!fdVar.I || z) {
            this.a.c(fdVar);
            if (aJ(fdVar)) {
                this.C = true;
            }
            fdVar.u = true;
            aD(fdVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(fd fdVar) {
        if (a(2)) {
            String str = "hide: " + fdVar;
        }
        if (!fdVar.H) {
            fdVar.H = true;
            fdVar.U = true ^ fdVar.U;
            aD(fdVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(fd fdVar) {
        if (a(2)) {
            String str = "detach: " + fdVar;
        }
        if (!fdVar.I) {
            fdVar.I = true;
            if (!fdVar.t) {
                return;
            }
            if (a(2)) {
                String str2 = "remove from detach: " + fdVar;
            }
            this.a.c(fdVar);
            if (aJ(fdVar)) {
                this.C = true;
            }
            aD(fdVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(fd fdVar) {
        if (a(2)) {
            String str = "attach: " + fdVar;
        }
        if (fdVar.I) {
            fdVar.I = false;
            if (fdVar.t) {
                return;
            }
            this.a.b(fdVar);
            if (a(2)) {
                String str2 = "add from attach: " + fdVar;
            }
            if (!aJ(fdVar)) {
                return;
            }
            this.C = true;
        }
    }

    public final fd G(int i) {
        gx gxVar = this.a;
        int size = gxVar.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                fd fdVar = gxVar.a.get(size);
                if (fdVar != null && fdVar.E == i) {
                    return fdVar;
                }
            } else {
                for (gw gwVar : gxVar.b.values()) {
                    if (gwVar != null) {
                        fd fdVar2 = gwVar.a;
                        if (fdVar2.E == i) {
                            return fdVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final fd H(String str) {
        gx gxVar = this.a;
        if (str != null) {
            int size = gxVar.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                fd fdVar = gxVar.a.get(size);
                if (fdVar != null && str.equals(fdVar.G)) {
                    return fdVar;
                }
            }
        }
        if (str != null) {
            for (gw gwVar : gxVar.b.values()) {
                if (gwVar != null) {
                    fd fdVar2 = gwVar.a;
                    if (str.equals(fdVar2.G)) {
                        return fdVar2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fd I(String str) {
        return this.a.l(str);
    }

    public final boolean J() {
        return this.s || this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K(gk gkVar, boolean z) {
        if (!z) {
            if (this.k == null) {
                if (!this.u) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            ax();
        }
        synchronized (this.w) {
            if (this.k == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.w.add(gkVar);
            synchronized (this.w) {
                ArrayList<gm> arrayList = this.H;
                boolean z2 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    z2 = true;
                }
                int size = this.w.size();
                if (z2 || size == 1) {
                    this.k.d.removeCallbacks(this.I);
                    this.k.d.post(this.I);
                    c();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(gk gkVar, boolean z) {
        if (!z || (this.k != null && !this.u)) {
            ay(z);
            if (gkVar.j(this.E, this.F)) {
                this.x = true;
                try {
                    aB(this.E, this.F);
                } finally {
                    az();
                }
            }
            c();
            aI();
            this.a.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable N() {
        ArrayList<String> arrayList;
        int size;
        aG();
        aH();
        at(true);
        this.s = true;
        this.v.i = true;
        gx gxVar = this.a;
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(gxVar.b.size());
        for (gw gwVar : gxVar.b.values()) {
            if (gwVar != null) {
                fd fdVar = gwVar.a;
                FragmentState fragmentState = new FragmentState(fdVar);
                fd fdVar2 = gwVar.a;
                if (fdVar2.i < 0 || fragmentState.m != null) {
                    fragmentState.m = fdVar2.j;
                } else {
                    fragmentState.m = gwVar.m();
                    if (gwVar.a.q != null) {
                        if (fragmentState.m == null) {
                            fragmentState.m = new Bundle();
                        }
                        fragmentState.m.putString("android:target_state", gwVar.a.q);
                        int i = gwVar.a.r;
                        if (i != 0) {
                            fragmentState.m.putInt("android:target_req_state", i);
                        }
                    }
                }
                arrayList2.add(fragmentState);
                if (a(2)) {
                    String str = "Saved state of " + fdVar + ": " + fragmentState.m;
                }
            }
        }
        BackStackState[] backStackStateArr = null;
        if (arrayList2.isEmpty()) {
            return null;
        }
        gx gxVar2 = this.a;
        synchronized (gxVar2.a) {
            if (gxVar2.a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(gxVar2.a.size());
                Iterator<fd> it = gxVar2.a.iterator();
                while (it.hasNext()) {
                    fd next = it.next();
                    arrayList.add(next.n);
                    if (a(2)) {
                        String str2 = "saveAllState: adding fragment (" + next.n + "): " + next;
                    }
                }
            }
        }
        ArrayList<ep> arrayList3 = this.b;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.b.get(i2));
                if (a(2)) {
                    String str3 = "saveAllState: adding back stack #" + i2 + ": " + this.b.get(i2);
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.a = arrayList2;
        fragmentManagerState.b = arrayList;
        fragmentManagerState.c = backStackStateArr;
        fragmentManagerState.d = this.f.get();
        fd fdVar3 = this.n;
        if (fdVar3 != null) {
            fragmentManagerState.e = fdVar3.n;
        }
        fragmentManagerState.f.addAll(this.z.keySet());
        fragmentManagerState.g.addAll(this.z.values());
        fragmentManagerState.h = new ArrayList<>(this.r);
        return fragmentManagerState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(Parcelable parcelable) {
        gw gwVar;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.a == null) {
            return;
        }
        this.a.b.clear();
        ArrayList<FragmentState> arrayList = fragmentManagerState.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = arrayList.get(i);
            if (fragmentState != null) {
                fd fdVar = this.v.d.get(fragmentState.b);
                if (fdVar != null) {
                    if (a(2)) {
                        String str = "restoreSaveState: re-attaching retained " + fdVar;
                    }
                    gwVar = new gw(this.h, this.a, fdVar, fragmentState);
                } else {
                    gwVar = new gw(this.h, this.a, this.k.c.getClassLoader(), al(), fragmentState);
                }
                fd fdVar2 = gwVar.a;
                fdVar2.A = this;
                if (a(2)) {
                    String str2 = "restoreSaveState: active (" + fdVar2.n + "): " + fdVar2;
                }
                gwVar.d(this.k.c.getClassLoader());
                this.a.a(gwVar);
                gwVar.b = this.j;
            }
        }
        for (fd fdVar3 : new ArrayList(this.v.d.values())) {
            if (!this.a.i(fdVar3.n)) {
                if (a(2)) {
                    String str3 = "Discarding retained Fragment " + fdVar3 + " that was not found in the set of active Fragments " + fragmentManagerState.a;
                }
                this.v.e(fdVar3);
                fdVar3.A = this;
                gw gwVar2 = new gw(this.h, this.a, fdVar3);
                gwVar2.b = 1;
                gwVar2.b();
                fdVar3.u = true;
                gwVar2.b();
            }
        }
        gx gxVar = this.a;
        ArrayList<String> arrayList2 = fragmentManagerState.b;
        gxVar.a.clear();
        if (arrayList2 != null) {
            for (String str4 : arrayList2) {
                fd l = gxVar.l(str4);
                if (l == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str4 + ")");
                }
                if (a(2)) {
                    String str5 = "restoreSaveState: added (" + str4 + "): " + l;
                }
                gxVar.b(l);
            }
        }
        BackStackState[] backStackStateArr = fragmentManagerState.c;
        if (backStackStateArr != null) {
            this.b = new ArrayList<>(backStackStateArr.length);
            int i2 = 0;
            while (true) {
                BackStackState[] backStackStateArr2 = fragmentManagerState.c;
                if (i2 >= backStackStateArr2.length) {
                    break;
                }
                BackStackState backStackState = backStackStateArr2[i2];
                ep epVar = new ep(this);
                int i3 = 0;
                int i4 = 0;
                while (i3 < backStackState.a.length) {
                    gy gyVar = new gy();
                    int i5 = i3 + 1;
                    gyVar.a = backStackState.a[i3];
                    if (a(2)) {
                        String str6 = "Instantiate " + epVar + " op #" + i4 + " base fragment #" + backStackState.a[i5];
                    }
                    String str7 = backStackState.b.get(i4);
                    if (str7 != null) {
                        gyVar.b = I(str7);
                    } else {
                        gyVar.b = null;
                    }
                    gyVar.g = j.values()[backStackState.c[i4]];
                    gyVar.h = j.values()[backStackState.d[i4]];
                    int[] iArr = backStackState.a;
                    int i6 = i5 + 1;
                    int i7 = iArr[i5];
                    gyVar.c = i7;
                    int i8 = i6 + 1;
                    int i9 = iArr[i6];
                    gyVar.d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr[i8];
                    gyVar.e = i11;
                    int i12 = iArr[i10];
                    gyVar.f = i12;
                    epVar.e = i7;
                    epVar.f = i9;
                    epVar.g = i11;
                    epVar.h = i12;
                    epVar.v(gyVar);
                    i4++;
                    i3 = i10 + 1;
                }
                epVar.i = backStackState.e;
                epVar.l = backStackState.f;
                epVar.c = backStackState.g;
                epVar.j = true;
                epVar.m = backStackState.h;
                epVar.n = backStackState.i;
                epVar.o = backStackState.j;
                epVar.p = backStackState.k;
                epVar.q = backStackState.l;
                epVar.r = backStackState.m;
                epVar.s = backStackState.n;
                epVar.e(1);
                if (a(2)) {
                    String str8 = "restoreAllState: back stack #" + i2 + " (index " + epVar.c + "): " + epVar;
                    PrintWriter printWriter = new PrintWriter(new hu());
                    epVar.b("  ", printWriter, false);
                    printWriter.close();
                }
                this.b.add(epVar);
                i2++;
            }
        } else {
            this.b = null;
        }
        this.f.set(fragmentManagerState.d);
        String str9 = fragmentManagerState.e;
        if (str9 != null) {
            fd I = I(str9);
            this.n = I;
            aj(I);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.f;
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                this.z.put(arrayList3.get(i13), fragmentManagerState.g.get(i13));
            }
        }
        this.r = new ArrayDeque<>(fragmentManagerState.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void P(fr<?> frVar, fn fnVar, fd fdVar) {
        String str;
        if (this.k == null) {
            this.k = frVar;
            this.l = fnVar;
            this.m = fdVar;
            if (fdVar != null) {
                ao(new gd());
            } else if (frVar instanceof gs) {
                ao((gs) frVar);
            }
            if (this.m != null) {
                c();
            }
            if (frVar instanceof agm) {
                agm agmVar = (agm) frVar;
                agl Oj = agmVar.Oj();
                this.d = Oj;
                fd fdVar2 = agmVar;
                if (fdVar != null) {
                    fdVar2 = fdVar;
                }
                agj agjVar = this.e;
                k Nh = fdVar2.Nh();
                if (Nh.c() != j.DESTROYED) {
                    agjVar.b(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(Oj, Nh, agjVar));
                }
            }
            if (fdVar != null) {
                gr grVar = fdVar.A.v;
                gr grVar2 = grVar.e.get(fdVar.n);
                if (grVar2 == null) {
                    grVar2 = new gr(grVar.g);
                    grVar.e.put(fdVar.n, grVar2);
                }
                this.v = grVar2;
            } else if (frVar instanceof ax) {
                this.v = (gr) new au(((ax) frVar).NA(), gr.a).a(gr.class);
            } else {
                this.v = new gr(false);
            }
            this.v.i = J();
            this.a.c = this.v;
            fr<?> frVar2 = this.k;
            if (!(frVar2 instanceof agv)) {
                return;
            }
            agu Oq = ((agv) frVar2).Oq();
            if (fdVar != null) {
                str = fdVar.n + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.o = Oq.b(str2 + "StartActivityForResult", new ahb(), new ge(this));
            this.p = Oq.b(str2 + "StartIntentSenderForResult", new gg(), new fv(this));
            this.q = Oq.b(str2 + "RequestPermissions", new aha(), new fw(this));
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q() {
        if (this.k == null) {
            return;
        }
        this.s = false;
        this.t = false;
        this.v.i = false;
        for (fd fdVar : this.a.g()) {
            if (fdVar != null) {
                fdVar.C.Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R() {
        this.s = false;
        this.t = false;
        this.v.i = false;
        Y(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S() {
        this.s = false;
        this.t = false;
        this.v.i = false;
        Y(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T() {
        this.s = false;
        this.t = false;
        this.v.i = false;
        Y(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U() {
        this.s = false;
        this.t = false;
        this.v.i = false;
        Y(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V() {
        Y(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W() {
        this.t = true;
        this.v.i = true;
        Y(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X() {
        this.u = true;
        at(true);
        aH();
        Y(-1);
        this.k = null;
        this.l = null;
        this.m = null;
        if (this.d != null) {
            Iterator<agc> it = this.e.c.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.d = null;
        }
        agq<Intent> agqVar = this.o;
        if (agqVar != null) {
            agqVar.a();
            this.p.a();
            this.q.a();
        }
    }

    public final void Y(int i) {
        try {
            this.x = true;
            for (gw gwVar : this.a.b.values()) {
                if (gwVar != null) {
                    gwVar.b = i;
                }
            }
            z(i, false);
            this.x = false;
            at(true);
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z(boolean z) {
        for (fd fdVar : this.a.g()) {
            if (fdVar != null) {
                fdVar.C.Z(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aa(boolean z) {
        for (fd fdVar : this.a.g()) {
            if (fdVar != null) {
                fdVar.C.aa(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ab(Configuration configuration) {
        for (fd fdVar : this.a.g()) {
            if (fdVar != null) {
                fdVar.onConfigurationChanged(configuration);
                fdVar.C.ab(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ac() {
        for (fd fdVar : this.a.g()) {
            if (fdVar != null) {
                fdVar.onLowMemory();
                fdVar.C.ac();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ad(Menu menu, MenuInflater menuInflater) {
        if (this.j <= 0) {
            return false;
        }
        ArrayList<fd> arrayList = null;
        boolean z = false;
        for (fd fdVar : this.a.g()) {
            if (fdVar != null && ar(fdVar) && !fdVar.H && fdVar.C.ad(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fdVar);
                z = true;
            }
        }
        if (this.y != null) {
            for (int i = 0; i < this.y.size(); i++) {
                fd fdVar2 = this.y.get(i);
                if (arrayList != null) {
                    arrayList.contains(fdVar2);
                }
            }
        }
        this.y = arrayList;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ae(Menu menu) {
        boolean z = false;
        if (this.j <= 0) {
            return false;
        }
        for (fd fdVar : this.a.g()) {
            if (fdVar != null && !fdVar.H && fdVar.C.ae(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean af(MenuItem menuItem) {
        if (this.j <= 0) {
            return false;
        }
        for (fd fdVar : this.a.g()) {
            if (fdVar != null && !fdVar.H && fdVar.C.af(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ag(MenuItem menuItem) {
        if (this.j <= 0) {
            return false;
        }
        for (fd fdVar : this.a.g()) {
            if (fdVar != null && !fdVar.H && fdVar.C.ag(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ah(Menu menu) {
        if (this.j <= 0) {
            return;
        }
        for (fd fdVar : this.a.g()) {
            if (fdVar != null && !fdVar.H) {
                fdVar.C.ah(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ai(fd fdVar) {
        if (fdVar == null || (fdVar.equals(I(fdVar.n)) && (fdVar.B == null || fdVar.A == this))) {
            fd fdVar2 = this.n;
            this.n = fdVar;
            aj(fdVar2);
            aj(this.n);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fdVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void aj(fd fdVar) {
        if (fdVar == null || !fdVar.equals(I(fdVar.n))) {
            return;
        }
        boolean d = fdVar.A.d(fdVar);
        Boolean bool = fdVar.s;
        if (bool != null && bool.booleanValue() == d) {
            return;
        }
        fdVar.s = Boolean.valueOf(d);
        gn gnVar = fdVar.C;
        gnVar.c();
        gnVar.aj(gnVar.n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ak(fd fdVar, j jVar) {
        if (!fdVar.equals(I(fdVar.n)) || (fdVar.B != null && fdVar.A != this)) {
            throw new IllegalArgumentException("Fragment " + fdVar + " is not an active fragment of FragmentManager " + this);
        }
        fdVar.Y = jVar;
    }

    public final fq al() {
        fd fdVar = this.m;
        return fdVar != null ? fdVar.A.al() : this.B;
    }

    public final void am(gh ghVar, boolean z) {
        this.h.a.add(new ft(ghVar, z));
    }

    public final void an(gh ghVar) {
        fu fuVar = this.h;
        synchronized (fuVar.a) {
            int size = fuVar.a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (fuVar.a.get(i).a == ghVar) {
                    fuVar.a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public final void ao(gs gsVar) {
        this.i.add(gsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ga ap() {
        fd fdVar = this.m;
        return fdVar != null ? fdVar.A.ap() : this.K;
    }

    public final void aq() {
        at(true);
        aG();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void at(boolean z) {
        ay(z);
        while (true) {
            ArrayList<ep> arrayList = this.E;
            ArrayList<Boolean> arrayList2 = this.F;
            synchronized (this.w) {
                if (this.w.isEmpty()) {
                    break;
                }
                int size = this.w.size();
                boolean z2 = false;
                for (int i = 0; i < size; i++) {
                    z2 |= this.w.get(i).j(arrayList, arrayList2);
                }
                this.w.clear();
                this.k.d.removeCallbacks(this.I);
                if (!z2) {
                    break;
                }
                this.x = true;
                try {
                    aB(this.E, this.F);
                } finally {
                    az();
                }
            }
        }
        c();
        aI();
        this.a.e();
    }

    public final gz b() {
        return new ep(this);
    }

    public final void c() {
        synchronized (this.w) {
            boolean z = true;
            if (!this.w.isEmpty()) {
                this.e.b = true;
                return;
            }
            agj agjVar = this.e;
            if (j() <= 0 || !d(this.m)) {
                z = false;
            }
            agjVar.b = z;
        }
    }

    final boolean d(fd fdVar) {
        if (fdVar == null) {
            return true;
        }
        gn gnVar = fdVar.A;
        return fdVar.equals(gnVar.n) && d(gnVar.m);
    }

    public final void e() {
        K(new gl(this, null, -1, 0), false);
    }

    public final boolean f() {
        return i(null, -1, 0);
    }

    public final void g(String str, int i) {
        K(new gl(this, str, -1, i), false);
    }

    public final boolean h(String str, int i) {
        return i(str, -1, i);
    }

    public final boolean i(String str, int i, int i2) {
        at(false);
        ay(true);
        fd fdVar = this.n;
        if (fdVar == null || i >= 0 || str != null || !fdVar.R().f()) {
            boolean M = M(this.E, this.F, str, i, i2);
            if (M) {
                this.x = true;
                try {
                    aB(this.E, this.F);
                } finally {
                    az();
                }
            }
            c();
            aI();
            this.a.e();
            return M;
        }
        return true;
    }

    public final int j() {
        ArrayList<ep> arrayList = this.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final gf k(int i) {
        return this.b.get(i);
    }

    public final void l(gj gjVar) {
        if (this.A == null) {
            this.A = new ArrayList<>();
        }
        this.A.add(gjVar);
    }

    public final void m(gj gjVar) {
        ArrayList<gj> arrayList = this.A;
        if (arrayList != null) {
            arrayList.remove(gjVar);
        }
    }

    public final void n(Bundle bundle, String str, fd fdVar) {
        if (fdVar.A != this) {
            au(new IllegalStateException("Fragment " + fdVar + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fdVar.n);
    }

    public final fd o(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        fd I = I(string);
        if (I == null) {
            au(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return I;
    }

    public final List<fd> q() {
        return this.a.g();
    }

    public final Fragment$SavedState r(fd fdVar) {
        Bundle m;
        gw j = this.a.j(fdVar.n);
        if (j == null || !j.a.equals(fdVar)) {
            au(new IllegalStateException("Fragment " + fdVar + " is not currently in the FragmentManager"));
        }
        if (j.a.i < 0 || (m = j.m()) == null) {
            return null;
        }
        return new Fragment$SavedState(m);
    }

    public final void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        gx gxVar = this.a;
        String str3 = str + "    ";
        if (!gxVar.b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (gw gwVar : gxVar.b.values()) {
                printWriter.print(str);
                if (gwVar != null) {
                    fd fdVar = gwVar.a;
                    printWriter.println(fdVar);
                    fdVar.aq(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = gxVar.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(gxVar.a.get(i).toString());
            }
        }
        ArrayList<fd> arrayList = this.y;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.y.get(i2).toString());
            }
        }
        ArrayList<ep> arrayList2 = this.b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                ep epVar = this.b.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(epVar.toString());
                epVar.a(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f.get());
        synchronized (this.w) {
            int size4 = this.w.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println((gk) this.w.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.k);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.l);
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.m);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.j);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mStopped=");
        printWriter.print(this.t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.u);
        if (this.C) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.C);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(gw gwVar) {
        fd fdVar = gwVar.a;
        if (fdVar.Q) {
            if (this.x) {
                this.D = true;
                return;
            }
            fdVar.Q = false;
            x(fdVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        fd fdVar = this.m;
        if (fdVar != null) {
            sb.append(fdVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.m)));
            sb.append("}");
        } else {
            fr<?> frVar = this.k;
            if (frVar != null) {
                sb.append(frVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.k)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void u(defpackage.fd r14, int r15) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn.u(fd, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(fd fdVar, boolean z) {
        ViewGroup aE = aE(fdVar);
        if (aE == null || !(aE instanceof fo)) {
            return;
        }
        ((fo) aE).a = !z;
    }

    public final void w(fd fdVar) {
        fdVar.as();
        this.h.l(fdVar, false);
        fdVar.O = null;
        fdVar.P = null;
        fdVar.aa = null;
        fdVar.ab.g(null);
        fdVar.w = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(fd fdVar) {
        u(fdVar, this.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(fd fdVar) {
        Animator animator;
        if (!this.a.i(fdVar.n)) {
            if (!a(3)) {
                return;
            }
            String str = "Ignoring moving " + fdVar + " to state " + this.j + "since it is not added to " + this;
            return;
        }
        x(fdVar);
        View view = fdVar.P;
        if (view != null && fdVar.T && fdVar.O != null) {
            float f = fdVar.V;
            if (f > 0.0f) {
                view.setAlpha(f);
            }
            fdVar.V = 0.0f;
            fdVar.T = false;
            fk a = fm.a(this.k.c, fdVar, true);
            if (a != null) {
                Animation animation = a.a;
                if (animation != null) {
                    fdVar.P.startAnimation(animation);
                } else {
                    a.b.setTarget(fdVar.P);
                    a.b.start();
                }
            }
        }
        if (!fdVar.U) {
            return;
        }
        if (fdVar.P != null) {
            fk a2 = fm.a(this.k.c, fdVar, !fdVar.H);
            if (a2 == null || (animator = a2.b) == null) {
                if (a2 != null) {
                    fdVar.P.startAnimation(a2.a);
                    a2.a.start();
                }
                fdVar.P.setVisibility((!fdVar.H || fdVar.aB()) ? 0 : 8);
                if (fdVar.aB()) {
                    fdVar.aC(false);
                }
            } else {
                animator.setTarget(fdVar.P);
                if (fdVar.H) {
                    if (fdVar.aB()) {
                        fdVar.aC(false);
                    } else {
                        ViewGroup viewGroup = fdVar.O;
                        View view2 = fdVar.P;
                        viewGroup.startViewTransition(view2);
                        a2.b.addListener(new gc(viewGroup, view2, fdVar));
                    }
                } else {
                    fdVar.P.setVisibility(0);
                }
                a2.b.start();
            }
        }
        if (fdVar.t && aJ(fdVar)) {
            this.C = true;
        }
        fdVar.U = false;
        boolean z = fdVar.H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(int i, boolean z) {
        fr<?> frVar;
        if (this.k != null || i == -1) {
            if (!z && i == this.j) {
                return;
            }
            this.j = i;
            for (fd fdVar : this.a.g()) {
                y(fdVar);
            }
            for (gw gwVar : this.a.f()) {
                fd fdVar2 = gwVar.a;
                if (!fdVar2.T) {
                    y(fdVar2);
                }
                if (fdVar2.u && !fdVar2.A()) {
                    this.a.d(gwVar);
                }
            }
            aw();
            if (!this.C || (frVar = this.k) == null || this.j != 7) {
                return;
            }
            frVar.f();
            this.C = false;
            return;
        }
        throw new IllegalStateException("No activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M(ArrayList<ep> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int size;
        ArrayList<ep> arrayList3 = this.b;
        if (arrayList3 == null) {
            return false;
        }
        if (str != null || i >= 0 || i2 != 0) {
            if (str != null || i >= 0) {
                size = arrayList3.size() - 1;
                while (size >= 0) {
                    ep epVar = this.b.get(size);
                    if ((str != null && str.equals(epVar.l)) || (i >= 0 && i == epVar.c)) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if (i2 != 0) {
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ep epVar2 = this.b.get(size);
                        if (str == null || !str.equals(epVar2.l)) {
                            if (i < 0 || i != epVar2.c) {
                                break;
                            }
                        }
                    }
                }
            } else {
                size = -1;
            }
            if (size == this.b.size() - 1) {
                return false;
            }
            for (int size2 = this.b.size() - 1; size2 > size; size2--) {
                arrayList.add(this.b.remove(size2));
                arrayList2.add(true);
            }
        } else {
            int size3 = arrayList3.size() - 1;
            if (size3 < 0) {
                return false;
            }
            arrayList.add(this.b.remove(size3));
            arrayList2.add(true);
        }
        return true;
    }
}
