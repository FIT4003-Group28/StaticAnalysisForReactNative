package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackRecordState;
import android.support.v4.app.BackStackState;
import android.support.v4.app.Fragment$SavedState;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: eo  reason: default package */
/* loaded from: classes3.dex */
public final class eo {
    private boolean A;
    private ArrayList B;
    private boolean E;
    private ArrayList F;
    private ArrayList G;
    private ArrayList H;
    ArrayList b;
    public abs d;
    public ArrayList i;
    public dz m;
    public dw n;
    public dp o;
    dp p;
    public aby q;
    public aby r;
    public aby s;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ep y;
    private final ArrayList z = new ArrayList();
    public final ev a = new ev();
    public final eb c = new eb(this);
    public final abq e = new ef(this);
    public final AtomicInteger f = new AtomicInteger();
    private final Map C = DesugarCollections.synchronizedMap(new HashMap());
    public final Map g = DesugarCollections.synchronizedMap(new HashMap());
    public final Map h = DesugarCollections.synchronizedMap(new HashMap());
    public final ed j = new ed(this);
    public final CopyOnWriteArrayList k = new CopyOnWriteArrayList();
    int l = -1;
    private final dy D = new eg(this);

    /* renamed from: J  reason: collision with root package name */
    private final ft f204J = new ft();
    ArrayDeque t = new ArrayDeque();
    private final Runnable I = new eh(this);

    public static boolean X(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static final boolean ac(dp dpVar) {
        if (!dpVar.K || !dpVar.L) {
            ev evVar = dpVar.B.a;
            ArrayList<dp> arrayList = new ArrayList();
            for (et etVar : evVar.b.values()) {
                if (etVar != null) {
                    arrayList.add(etVar.b);
                } else {
                    arrayList.add(null);
                }
            }
            boolean z = false;
            for (dp dpVar2 : arrayList) {
                if (dpVar2 != null) {
                    z = ac(dpVar2);
                    continue;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    static final boolean ad(dp dpVar) {
        if (dpVar == null) {
            return true;
        }
        return dpVar.L && (dpVar.z == null || ad(dpVar.C));
    }

    static final void ah(dp dpVar) {
        if (X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(dpVar);
        }
        if (dpVar.G) {
            dpVar.G = false;
            dpVar.S = !dpVar.S;
        }
    }

    private final ViewGroup al(dp dpVar) {
        ViewGroup viewGroup = dpVar.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (dpVar.E > 0 && this.n.b()) {
            View a = this.n.a(dpVar.E);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
        }
        return null;
    }

    private final Set am() {
        HashSet hashSet = new HashSet();
        for (et etVar : this.a.e()) {
            ViewGroup viewGroup = etVar.b.N;
            if (viewGroup != null) {
                aj();
                hashSet.add(fy.g(viewGroup));
            }
        }
        return hashSet;
    }

    private final void an() {
        if (!Z()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private final void ao() {
        this.A = false;
        this.G.clear();
        this.F.clear();
    }

    private final void ap() {
        if (this.E) {
            this.E = false;
            aw();
        }
    }

    private final void aq() {
        for (fy fyVar : am()) {
            fyVar.c();
        }
    }

    private final void ar(boolean z) {
        if (!this.A) {
            if (this.m == null) {
                if (this.x) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() != this.m.d.getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            } else {
                if (!z) {
                    an();
                }
                if (this.F != null) {
                    return;
                }
                this.F = new ArrayList();
                this.G = new ArrayList();
                return;
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0590, code lost:
        if (r14 == r12) goto L304;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void as(java.util.ArrayList r29, java.util.ArrayList r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 2098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.as(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void at() {
        for (fy fyVar : am()) {
        }
    }

    private final void au(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((cr) arrayList.get(i)).s) {
                if (i2 != i) {
                    as(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((cr) arrayList.get(i2)).s) {
                        i2++;
                    }
                }
                as(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 == size) {
            return;
        }
        as(arrayList, arrayList2, i2, size);
    }

    private final void av(dp dpVar) {
        ViewGroup al = al(dpVar);
        if (al == null || dpVar.rc() + dpVar.rd() + dpVar.re() + dpVar.rf() <= 0) {
            return;
        }
        if (al.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            al.setTag(R.id.visible_removing_fragment_view_tag, dpVar);
        }
        ((dp) al.getTag(R.id.visible_removing_fragment_view_tag)).aj(dpVar.ao());
    }

    private final void aw() {
        for (et etVar : this.a.e()) {
            K(etVar);
        }
    }

    private final void ax(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new fc());
        dz dzVar = this.m;
        if (dzVar != null) {
            try {
                ((ds) dzVar).a.dump("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                F("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public static dp h(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof dp) {
            return (dp) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(boolean z) {
        for (dp dpVar : this.a.f()) {
            if (dpVar != null) {
                dpVar.aB();
                dpVar.B.A(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        this.v = false;
        this.w = false;
        this.y.i = false;
        D(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C() {
        this.v = false;
        this.w = false;
        this.y.i = false;
        D(5);
    }

    public final void D(int i) {
        try {
            this.A = true;
            for (et etVar : this.a.b.values()) {
                if (etVar != null) {
                    etVar.c = i;
                }
            }
            J(i, false);
            for (fy fyVar : am()) {
                fyVar.c();
            }
            this.A = false;
            ai(true);
        } catch (Throwable th) {
            this.A = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E() {
        this.w = true;
        this.y.i = true;
        D(4);
    }

    public final void F(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        ev evVar = this.a;
        String str3 = str + "    ";
        if (!evVar.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (et etVar : evVar.b.values()) {
                printWriter.print(str);
                if (etVar != null) {
                    dp dpVar = etVar.b;
                    printWriter.println(dpVar);
                    dpVar.P(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = evVar.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((dp) evVar.a.get(i)).toString());
            }
        }
        ArrayList arrayList = this.B;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((dp) this.B.get(i2)).toString());
            }
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                cr crVar = (cr) this.b.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(crVar.toString());
                crVar.g(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f.get());
        synchronized (this.z) {
            int size4 = this.z.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println((em) this.z.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.n);
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(em emVar, boolean z) {
        if (!z) {
            if (this.m == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            an();
        }
        synchronized (this.z) {
            if (this.m == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.z.add(emVar);
            synchronized (this.z) {
                if (this.z.size() == 1) {
                    this.m.d.removeCallbacks(this.I);
                    this.m.d.post(this.I);
                    S();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(em emVar, boolean z) {
        if (!z || (this.m != null && !this.x)) {
            ar(z);
            emVar.i(this.F, this.G);
            this.A = true;
            try {
                au(this.F, this.G);
                ao();
                S();
                ap();
                this.a.h();
            } catch (Throwable th) {
                ao();
                throw th;
            }
        }
    }

    final void I(dp dpVar) {
        if (X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(dpVar);
        }
        if (!dpVar.G) {
            dpVar.G = true;
            dpVar.S = true ^ dpVar.S;
            av(dpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K(et etVar) {
        dp dpVar = etVar.b;
        if (dpVar.P) {
            if (this.A) {
                this.E = true;
                return;
            }
            dpVar.P = false;
            etVar.e();
        }
    }

    public final void L() {
        G(new en(this, -1, 0), false);
    }

    public final void M(Bundle bundle, String str, dp dpVar) {
        if (dpVar.z != this) {
            ax(new IllegalStateException("Fragment " + dpVar + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, dpVar.l);
    }

    final void N(dp dpVar) {
        if (X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(dpVar);
            sb.append(" nesting=");
            sb.append(dpVar.y);
        }
        boolean z = !dpVar.aq();
        if (!dpVar.H || z) {
            this.a.k(dpVar);
            if (ac(dpVar)) {
                this.u = true;
            }
            dpVar.s = true;
            av(dpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(Parcelable parcelable) {
        FragmentManagerState fragmentManagerState;
        ArrayList arrayList;
        et etVar;
        if (parcelable == null || (arrayList = (fragmentManagerState = (FragmentManagerState) parcelable).a) == null) {
            return;
        }
        ev evVar = this.a;
        evVar.c.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentState fragmentState = (FragmentState) arrayList.get(i);
            evVar.c.put(fragmentState.b, fragmentState);
        }
        this.a.b.clear();
        ArrayList arrayList2 = fragmentManagerState.b;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            FragmentState c = this.a.c((String) arrayList2.get(i2), null);
            if (c != null) {
                dp dpVar = (dp) this.y.d.get(c.b);
                if (dpVar != null) {
                    if (X(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(dpVar);
                    }
                    etVar = new et(this.j, this.a, dpVar, c);
                } else {
                    etVar = new et(this.j, this.a, this.m.c.getClassLoader(), i(), c);
                }
                dp dpVar2 = etVar.b;
                dpVar2.z = this;
                if (X(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(dpVar2.l);
                    sb2.append("): ");
                    sb2.append(dpVar2);
                }
                etVar.f(this.m.c.getClassLoader());
                this.a.i(etVar);
                etVar.c = this.l;
            }
        }
        for (dp dpVar3 : new ArrayList(this.y.d.values())) {
            if (!this.a.l(dpVar3.l)) {
                if (X(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(dpVar3);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(fragmentManagerState.b);
                }
                this.y.f(dpVar3);
                dpVar3.z = this;
                et etVar2 = new et(this.j, this.a, dpVar3);
                etVar2.c = 1;
                etVar2.e();
                dpVar3.s = true;
                etVar2.e();
            }
        }
        ev evVar2 = this.a;
        ArrayList<String> arrayList3 = fragmentManagerState.c;
        evVar2.a.clear();
        if (arrayList3 != null) {
            for (String str : arrayList3) {
                dp a = evVar2.a(str);
                if (a == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (X(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreSaveState: added (");
                    sb4.append(str);
                    sb4.append("): ");
                    sb4.append(a);
                }
                evVar2.g(a);
            }
        }
        BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.d;
        if (backStackRecordStateArr != null) {
            this.b = new ArrayList(backStackRecordStateArr.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr2 = fragmentManagerState.d;
                if (i3 >= backStackRecordStateArr2.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr2[i3];
                cr crVar = new cr(this);
                int i4 = 0;
                int i5 = 0;
                while (i4 < backStackRecordState.a.length) {
                    ew ewVar = new ew();
                    int i6 = i4 + 1;
                    ewVar.a = backStackRecordState.a[i4];
                    if (X(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Instantiate ");
                        sb5.append(crVar);
                        sb5.append(" op #");
                        sb5.append(i5);
                        sb5.append(" base fragment #");
                        sb5.append(backStackRecordState.a[i6]);
                    }
                    ewVar.h = apt.values()[backStackRecordState.c[i5]];
                    ewVar.i = apt.values()[backStackRecordState.d[i5]];
                    int[] iArr = backStackRecordState.a;
                    int i7 = i6 + 1;
                    ewVar.c = iArr[i6] != 0;
                    int i8 = i7 + 1;
                    int i9 = iArr[i7];
                    ewVar.d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr[i8];
                    ewVar.e = i11;
                    int i12 = i10 + 1;
                    int i13 = iArr[i10];
                    ewVar.f = i13;
                    int i14 = iArr[i12];
                    ewVar.g = i14;
                    crVar.e = i9;
                    crVar.f = i11;
                    crVar.g = i13;
                    crVar.h = i14;
                    crVar.o(ewVar);
                    i5++;
                    i4 = i12 + 1;
                }
                crVar.i = backStackRecordState.e;
                crVar.l = backStackRecordState.f;
                crVar.j = true;
                crVar.m = backStackRecordState.h;
                crVar.n = backStackRecordState.i;
                crVar.o = backStackRecordState.j;
                crVar.p = backStackRecordState.k;
                crVar.q = backStackRecordState.l;
                crVar.r = backStackRecordState.m;
                crVar.s = backStackRecordState.n;
                crVar.c = backStackRecordState.g;
                for (int i15 = 0; i15 < backStackRecordState.b.size(); i15++) {
                    String str2 = (String) backStackRecordState.b.get(i15);
                    if (str2 != null) {
                        ((ew) crVar.d.get(i15)).b = d(str2);
                    }
                }
                crVar.c(1);
                if (X(2)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("restoreAllState: back stack #");
                    sb6.append(i3);
                    sb6.append(" (index ");
                    sb6.append(crVar.c);
                    sb6.append("): ");
                    sb6.append(crVar);
                    PrintWriter printWriter = new PrintWriter(new fc());
                    crVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.b.add(crVar);
                i3++;
            }
        } else {
            this.b = null;
        }
        this.f.set(fragmentManagerState.e);
        String str3 = fragmentManagerState.f;
        if (str3 != null) {
            dp d = d(str3);
            this.p = d;
            y(d);
        }
        ArrayList arrayList4 = fragmentManagerState.g;
        if (arrayList4 != null) {
            for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                this.C.put((String) arrayList4.get(i16), (BackStackState) fragmentManagerState.h.get(i16));
            }
        }
        ArrayList arrayList5 = fragmentManagerState.i;
        if (arrayList5 != null) {
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                Bundle bundle = (Bundle) fragmentManagerState.j.get(i17);
                bundle.setClassLoader(this.m.c.getClassLoader());
                this.g.put((String) arrayList5.get(i17), bundle);
            }
        }
        this.t = new ArrayDeque(fragmentManagerState.k);
    }

    final void P(dp dpVar, boolean z) {
        ViewGroup al = al(dpVar);
        if (al == null || !(al instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) al).a = !z;
    }

    final void Q(dp dpVar, apt aptVar) {
        if (dpVar.equals(d(dpVar.l)) && (dpVar.A == null || dpVar.z == this)) {
            dpVar.W = aptVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + dpVar + " is not an active fragment of FragmentManager " + this);
    }

    final void R(dp dpVar) {
        if (dpVar == null || (dpVar.equals(d(dpVar.l)) && (dpVar.A == null || dpVar.z == this))) {
            dp dpVar2 = this.p;
            this.p = dpVar;
            y(dpVar2);
            y(this.p);
            return;
        }
        throw new IllegalArgumentException("Fragment " + dpVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void S() {
        synchronized (this.z) {
            boolean z = true;
            if (!this.z.isEmpty()) {
                this.e.b = true;
                return;
            }
            abq abqVar = this.e;
            if (a() <= 0 || !Y(this.o)) {
                z = false;
            }
            abqVar.b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean T(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (dp dpVar : this.a.f()) {
            if (dpVar != null && !dpVar.G && dpVar.B.T(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean U(Menu menu, MenuInflater menuInflater) {
        if (this.l <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (dp dpVar : this.a.f()) {
            if (dpVar != null && ad(dpVar) && !dpVar.G) {
                if ((dpVar.K && dpVar.L) | dpVar.B.U(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(dpVar);
                    z = true;
                }
            }
        }
        if (this.B != null) {
            for (int i = 0; i < this.B.size(); i++) {
                dp dpVar2 = (dp) this.B.get(i);
                if (arrayList != null) {
                    arrayList.contains(dpVar2);
                }
            }
        }
        this.B = arrayList;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean V(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (dp dpVar : this.a.f()) {
            if (dpVar != null && !dpVar.G && dpVar.B.V(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean W(Menu menu) {
        if (this.l <= 0) {
            return false;
        }
        boolean z = false;
        for (dp dpVar : this.a.f()) {
            if (dpVar != null && ad(dpVar) && !dpVar.G) {
                if (dpVar.B.W(menu) | (dpVar.K && dpVar.L)) {
                    z = true;
                }
            }
        }
        return z;
    }

    final boolean Y(dp dpVar) {
        if (dpVar == null) {
            return true;
        }
        eo eoVar = dpVar.z;
        return dpVar.equals(eoVar.p) && Y(eoVar.o);
    }

    public final boolean Z() {
        return this.v || this.w;
    }

    public final int a() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final boolean aa() {
        return af(0);
    }

    public final void ab() {
        ai(true);
        at();
    }

    public final void ae(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        G(new en(this, i, 1), z);
    }

    public final boolean af(int i) {
        ai(false);
        ar(true);
        dp dpVar = this.p;
        if (dpVar == null || !dpVar.mL().aa()) {
            boolean ag = ag(this.F, this.G, -1, i);
            if (ag) {
                this.A = true;
                try {
                    au(this.F, this.G);
                } finally {
                    ao();
                }
            }
            S();
            ap();
            this.a.h();
            return ag;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ag(java.util.ArrayList r5, java.util.ArrayList r6, int r7, int r8) {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.b
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L59
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L59
        Ld:
            if (r7 >= 0) goto L1b
            if (r8 == 0) goto L13
            r7 = 0
            goto L5a
        L13:
            java.util.ArrayList r7 = r4.b
            int r7 = r7.size()
            int r7 = r7 + r2
            goto L5a
        L1b:
            java.util.ArrayList r0 = r4.b
            int r0 = r0.size()
            int r0 = r0 + r2
        L22:
            if (r0 < 0) goto L34
            java.util.ArrayList r3 = r4.b
            java.lang.Object r3 = r3.get(r0)
            cr r3 = (defpackage.cr) r3
            int r3 = r3.c
            if (r7 != r3) goto L31
            goto L34
        L31:
            int r0 = r0 + (-1)
            goto L22
        L34:
            if (r0 >= 0) goto L38
        L36:
            r7 = r0
            goto L5a
        L38:
            if (r8 == 0) goto L4c
        L3a:
            if (r0 <= 0) goto L36
            int r8 = r0 + (-1)
            java.util.ArrayList r3 = r4.b
            java.lang.Object r3 = r3.get(r8)
            cr r3 = (defpackage.cr) r3
            int r3 = r3.c
            if (r7 != r3) goto L36
            r0 = r8
            goto L3a
        L4c:
            java.util.ArrayList r7 = r4.b
            int r7 = r7.size()
            int r7 = r7 + r2
            if (r0 != r7) goto L56
            goto L59
        L56:
            int r7 = r0 + 1
            goto L5a
        L59:
            r7 = -1
        L5a:
            if (r7 >= 0) goto L5d
            return r1
        L5d:
            java.util.ArrayList r8 = r4.b
            int r8 = r8.size()
            int r8 = r8 + r2
        L64:
            r0 = 1
            if (r8 < r7) goto L7c
            java.util.ArrayList r1 = r4.b
            java.lang.Object r1 = r1.remove(r8)
            cr r1 = (defpackage.cr) r1
            r5.add(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.add(r0)
            int r8 = r8 + (-1)
            goto L64
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.ag(java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ai(boolean z) {
        ar(z);
        while (true) {
            ArrayList arrayList = this.F;
            ArrayList arrayList2 = this.G;
            synchronized (this.z) {
                if (this.z.isEmpty()) {
                    break;
                }
                int size = this.z.size();
                boolean z2 = false;
                for (int i = 0; i < size; i++) {
                    z2 |= ((em) this.z.get(i)).i(arrayList, arrayList2);
                }
                this.z.clear();
                this.m.d.removeCallbacks(this.I);
                if (!z2) {
                    break;
                }
                this.A = true;
                try {
                    au(this.F, this.G);
                } finally {
                    ao();
                }
            }
        }
        S();
        ap();
        this.a.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ft aj() {
        dp dpVar = this.o;
        return dpVar != null ? dpVar.z.aj() : this.f204J;
    }

    public final void ak(iy iyVar, boolean z) {
        this.j.a.add(new ec(iyVar, z, null, null, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable b() {
        ArrayList arrayList;
        int size;
        at();
        aq();
        ai(true);
        this.v = true;
        this.y.i = true;
        ev evVar = this.a;
        ArrayList arrayList2 = new ArrayList(evVar.b.size());
        for (et etVar : evVar.b.values()) {
            if (etVar != null) {
                dp dpVar = etVar.b;
                FragmentState fragmentState = new FragmentState(dpVar);
                dp dpVar2 = etVar.b;
                if (dpVar2.g < 0 || fragmentState.m != null) {
                    fragmentState.m = dpVar2.h;
                } else {
                    fragmentState.m = etVar.a();
                    if (etVar.b.o != null) {
                        if (fragmentState.m == null) {
                            fragmentState.m = new Bundle();
                        }
                        fragmentState.m.putString("android:target_state", etVar.b.o);
                        int i = etVar.b.p;
                        if (i != 0) {
                            fragmentState.m.putInt("android:target_req_state", i);
                        }
                    }
                }
                etVar.a.c(etVar.b.l, fragmentState);
                arrayList2.add(dpVar.l);
                if (X(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(dpVar);
                    sb.append(": ");
                    sb.append(dpVar.h);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(this.a.c.values());
        BackStackRecordState[] backStackRecordStateArr = null;
        if (arrayList3.isEmpty()) {
            return null;
        }
        ev evVar2 = this.a;
        synchronized (evVar2.a) {
            if (evVar2.a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(evVar2.a.size());
                Iterator it = evVar2.a.iterator();
                while (it.hasNext()) {
                    dp dpVar3 = (dp) it.next();
                    arrayList.add(dpVar3.l);
                    if (X(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("saveAllState: adding fragment (");
                        sb2.append(dpVar3.l);
                        sb2.append("): ");
                        sb2.append(dpVar3);
                    }
                }
            }
        }
        ArrayList arrayList4 = this.b;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackRecordStateArr[i2] = new BackStackRecordState((cr) this.b.get(i2));
                if (X(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("saveAllState: adding back stack #");
                    sb3.append(i2);
                    sb3.append(": ");
                    sb3.append(this.b.get(i2));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.a = arrayList3;
        fragmentManagerState.b = arrayList2;
        fragmentManagerState.c = arrayList;
        fragmentManagerState.d = backStackRecordStateArr;
        fragmentManagerState.e = this.f.get();
        dp dpVar4 = this.p;
        if (dpVar4 != null) {
            fragmentManagerState.f = dpVar4.l;
        }
        fragmentManagerState.g.addAll(this.C.keySet());
        fragmentManagerState.h.addAll(this.C.values());
        fragmentManagerState.i.addAll(this.g.keySet());
        fragmentManagerState.j.addAll(this.g.values());
        fragmentManagerState.k = new ArrayList(this.t);
        return fragmentManagerState;
    }

    public final Fragment$SavedState c(dp dpVar) {
        Bundle a;
        et d = this.a.d(dpVar.l);
        if (d == null || !d.b.equals(dpVar)) {
            ax(new IllegalStateException("Fragment " + dpVar + " is not currently in the FragmentManager"));
        }
        if (d.b.g < 0 || (a = d.a()) == null) {
            return null;
        }
        return new Fragment$SavedState(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dp d(String str) {
        return this.a.a(str);
    }

    public final dp e(int i) {
        ev evVar = this.a;
        int size = evVar.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                dp dpVar = (dp) evVar.a.get(size);
                if (dpVar != null && dpVar.D == i) {
                    return dpVar;
                }
            } else {
                for (et etVar : evVar.b.values()) {
                    if (etVar != null) {
                        dp dpVar2 = etVar.b;
                        if (dpVar2.D == i) {
                            return dpVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final dp f(String str) {
        ev evVar = this.a;
        if (str != null) {
            int size = evVar.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                dp dpVar = (dp) evVar.a.get(size);
                if (dpVar != null && str.equals(dpVar.F)) {
                    return dpVar;
                }
            }
        }
        if (str != null) {
            for (et etVar : evVar.b.values()) {
                if (etVar != null) {
                    dp dpVar2 = etVar.b;
                    if (str.equals(dpVar2.F)) {
                        return dpVar2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final dp g(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        dp d = d(string);
        if (d == null) {
            ax(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return d;
    }

    public final dy i() {
        dp dpVar = this.o;
        return dpVar != null ? dpVar.z.i() : this.D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final et j(dp dpVar) {
        String str = dpVar.V;
        if (str != null) {
            ape.a(dpVar, str);
        }
        if (X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(dpVar);
        }
        et k = k(dpVar);
        dpVar.z = this;
        this.a.i(k);
        if (!dpVar.H) {
            this.a.g(dpVar);
            dpVar.s = false;
            if (dpVar.O == null) {
                dpVar.S = false;
            }
            if (ac(dpVar)) {
                this.u = true;
            }
        }
        return k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final et k(dp dpVar) {
        et d = this.a.d(dpVar.l);
        if (d != null) {
            return d;
        }
        et etVar = new et(this.j, this.a, dpVar);
        etVar.f(this.m.c.getClassLoader());
        etVar.c = this.l;
        return etVar;
    }

    public final ex l() {
        return new cr(this);
    }

    public final List m() {
        return this.a.f();
    }

    public final void n(eq eqVar) {
        this.k.add(eqVar);
    }

    public void noteStateNotSaved() {
        if (this.m == null) {
            return;
        }
        this.v = false;
        this.w = false;
        this.y.i = false;
        for (dp dpVar : this.a.f()) {
            if (dpVar != null) {
                dpVar.B.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [bll, dz] */
    public final void o(dz dzVar, dw dwVar, dp dpVar) {
        String str;
        if (this.m == null) {
            this.m = dzVar;
            this.n = dwVar;
            this.o = dpVar;
            if (dpVar != null) {
                n(new ei());
            } else if (dzVar instanceof eq) {
                n(dzVar);
            }
            if (this.o != null) {
                S();
            }
            if (dzVar instanceof abt) {
                abs onBackPressedDispatcher = ((ds) dzVar).a.getOnBackPressedDispatcher();
                this.d = onBackPressedDispatcher;
                onBackPressedDispatcher.b(dpVar != null ? dpVar : dzVar, this.e);
            }
            if (dpVar != null) {
                ep epVar = dpVar.z.y;
                ep epVar2 = (ep) epVar.e.get(dpVar.l);
                if (epVar2 == null) {
                    epVar2 = new ep(epVar.g);
                    epVar.e.put(dpVar.l, epVar2);
                }
                this.y = epVar2;
            } else if (dzVar instanceof ak) {
                this.y = (ep) new ai(dzVar.getViewModelStore(), ep.a).a(ep.class);
            } else {
                this.y = new ep(false);
            }
            this.y.i = Z();
            this.a.d = this.y;
            ?? r4 = this.m;
            if ((r4 instanceof bll) && dpVar == null) {
                blj savedStateRegistry = r4.getSavedStateRegistry();
                savedStateRegistry.b("android:support:fragments", new bli() { // from class: ee
                    @Override // defpackage.bli
                    public final Bundle a() {
                        eo eoVar = eo.this;
                        Bundle bundle = new Bundle();
                        Parcelable b = eoVar.b();
                        if (b != null) {
                            bundle.putParcelable("android:support:fragments", b);
                        }
                        return bundle;
                    }
                });
                Bundle a = savedStateRegistry.a("android:support:fragments");
                if (a != null) {
                    O(a.getParcelable("android:support:fragments"));
                }
            }
            dz dzVar2 = this.m;
            if (!(dzVar2 instanceof ace)) {
                return;
            }
            acd activityResultRegistry = ((ds) dzVar2).a.getActivityResultRegistry();
            if (dpVar != null) {
                str = dpVar.l + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.q = activityResultRegistry.a(str2 + "StartActivityForResult", new acj(), new ej(this, 1));
            this.r = activityResultRegistry.a(str2 + "StartIntentSenderForResult", new ek(), new ej(this));
            this.s = activityResultRegistry.a(str2 + "RequestPermissions", new aci(), new ej(this, 2));
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    final void p(dp dpVar) {
        if (X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(dpVar);
        }
        if (dpVar.H) {
            dpVar.H = false;
            if (dpVar.r) {
                return;
            }
            this.a.g(dpVar);
            if (X(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("add from attach: ");
                sb2.append(dpVar);
            }
            if (!ac(dpVar)) {
                return;
            }
            this.u = true;
        }
    }

    final void q(dp dpVar) {
        if (X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(dpVar);
        }
        if (!dpVar.H) {
            dpVar.H = true;
            if (!dpVar.r) {
                return;
            }
            if (X(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove from detach: ");
                sb2.append(dpVar);
            }
            this.a.k(dpVar);
            if (ac(dpVar)) {
                this.u = true;
            }
            av(dpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        this.v = false;
        this.w = false;
        this.y.i = false;
        D(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(Configuration configuration) {
        for (dp dpVar : this.a.f()) {
            if (dpVar != null) {
                dpVar.onConfigurationChanged(configuration);
                dpVar.B.s(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        this.v = false;
        this.w = false;
        this.y.i = false;
        D(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        dp dpVar = this.o;
        if (dpVar != null) {
            sb.append(dpVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.o)));
            sb.append("}");
        } else {
            dz dzVar = this.m;
            if (dzVar != null) {
                sb.append(dzVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.m)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        this.x = true;
        ai(true);
        aq();
        dz dzVar = this.m;
        if (dzVar instanceof ak ? this.a.d.h : true ^ ((Activity) dzVar.c).isChangingConfigurations()) {
            for (BackStackState backStackState : this.C.values()) {
                for (String str : backStackState.a) {
                    this.a.d.e(str);
                }
            }
        }
        D(-1);
        this.m = null;
        this.n = null;
        this.o = null;
        if (this.d != null) {
            this.e.c();
            this.d = null;
        }
        aby abyVar = this.q;
        if (abyVar != null) {
            abyVar.a();
            this.r.a();
            this.s.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        for (dp dpVar : this.a.f()) {
            if (dpVar != null) {
                dpVar.onLowMemory();
                dpVar.B.v();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(boolean z) {
        for (dp dpVar : this.a.f()) {
            if (dpVar != null) {
                dpVar.B.w(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(Menu menu) {
        if (this.l <= 0) {
            return;
        }
        for (dp dpVar : this.a.f()) {
            if (dpVar != null && !dpVar.G) {
                dpVar.B.x(menu);
            }
        }
    }

    public final void y(dp dpVar) {
        if (dpVar == null || !dpVar.equals(d(dpVar.l))) {
            return;
        }
        boolean Y = dpVar.z.Y(dpVar);
        Boolean bool = dpVar.q;
        if (bool != null && bool.booleanValue() == Y) {
            return;
        }
        dpVar.q = Boolean.valueOf(Y);
        eo eoVar = dpVar.B;
        eoVar.S();
        eoVar.y(eoVar.p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z() {
        D(5);
    }

    final void J(int i, boolean z) {
        dz dzVar;
        if (this.m != null || i == -1) {
            if (!z && i == this.l) {
                return;
            }
            this.l = i;
            ev evVar = this.a;
            ArrayList arrayList = evVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                et etVar = (et) evVar.b.get(((dp) arrayList.get(i2)).l);
                if (etVar != null) {
                    etVar.e();
                }
            }
            for (et etVar2 : evVar.b.values()) {
                if (etVar2 != null) {
                    etVar2.e();
                    dp dpVar = etVar2.b;
                    if (dpVar.s && !dpVar.aq()) {
                        boolean z2 = dpVar.t;
                        evVar.j(etVar2);
                    }
                }
            }
            aw();
            if (!this.u || (dzVar = this.m) == null || this.l != 7) {
                return;
            }
            dzVar.c();
            this.u = false;
            return;
        }
        throw new IllegalStateException("No activity");
    }
}
