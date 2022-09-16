package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.fragment.app.s;
import java.io.PrintWriter;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends s implements l.f, l.i {
    final l r;
    boolean s;
    int t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(androidx.fragment.app.l r3) {
        /*
            r2 = this;
            androidx.fragment.app.h r0 = r3.p()
            androidx.fragment.app.i<?> r1 = r3.o
            if (r1 == 0) goto L11
            android.content.Context r1 = r1.f()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L12
        L11:
            r1 = 0
        L12:
            r2.<init>(r0, r1)
            r0 = -1
            r2.t = r0
            r2.r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.l):void");
    }

    private static boolean b(s.a aVar) {
        Fragment fragment = aVar.f1756b;
        return fragment != null && fragment.l && fragment.H != null && !fragment.A && !fragment.z && fragment.K();
    }

    @Override // androidx.fragment.app.s
    public int a() {
        return b(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f1747a.size()) {
            s.a aVar = this.f1747a.get(i);
            int i2 = aVar.f1755a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f1756b;
                    int i3 = fragment3.x;
                    Fragment fragment4 = fragment2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = arrayList.get(size);
                        if (fragment5.x == i3) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f1747a.add(i4, new s.a(9, fragment5));
                                    i4++;
                                    fragment4 = null;
                                }
                                s.a aVar2 = new s.a(3, fragment5);
                                aVar2.f1757c = aVar.f1757c;
                                aVar2.f1759e = aVar.f1759e;
                                aVar2.f1758d = aVar.f1758d;
                                aVar2.f1760f = aVar.f1760f;
                                this.f1747a.add(i4, aVar2);
                                arrayList.remove(fragment5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f1747a.remove(i4);
                        i4--;
                    } else {
                        aVar.f1755a = 1;
                        arrayList.add(fragment3);
                    }
                    i = i4;
                    fragment2 = fragment4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f1756b);
                    Fragment fragment6 = aVar.f1756b;
                    if (fragment6 == fragment2) {
                        this.f1747a.add(i, new s.a(9, fragment6));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f1747a.add(i, new s.a(9, fragment2));
                        i++;
                        fragment2 = aVar.f1756b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f1756b);
            i++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.s
    public s a(Fragment fragment) {
        l lVar = fragment.s;
        if (lVar == null || lVar == this.r) {
            super.a(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.s
    void a(int i, Fragment fragment, String str, int i2) {
        super.a(i, fragment, str, i2);
        fragment.s = this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment.f fVar) {
        for (int i = 0; i < this.f1747a.size(); i++) {
            s.a aVar = this.f1747a.get(i);
            if (b(aVar)) {
                aVar.f1756b.a(fVar);
            }
        }
    }

    public void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f1752f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1752f));
            }
            if (this.f1748b != 0 || this.f1749c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1748b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1749c));
            }
            if (this.f1750d != 0 || this.f1751e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1750d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1751e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (!this.f1747a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f1747a.size();
            for (int i = 0; i < size; i++) {
                s.a aVar = this.f1747a.get(i);
                switch (aVar.f1755a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f1755a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1756b);
                if (z) {
                    if (aVar.f1757c != 0 || aVar.f1758d != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1757c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1758d));
                    }
                    if (aVar.f1759e != 0 || aVar.f1760f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1759e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1760f));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1747a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f1747a.get(i4).f1756b;
            int i5 = fragment != null ? fragment.x : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f1747a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f1747a.get(i7).f1756b;
                        if ((fragment2 != null ? fragment2.x : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.l.i
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (l.d(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (this.f1753g) {
            this.r.a(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.s
    public int b() {
        return b(true);
    }

    int b(boolean z) {
        if (!this.s) {
            if (l.d(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new androidx.core.util.b("FragmentManager"));
                a("  ", printWriter);
                printWriter.close();
            }
            this.s = true;
            this.t = this.f1753g ? this.r.a() : -1;
            this.r.a(this, z);
            return this.t;
        }
        throw new IllegalStateException("commit already called");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f1747a.size() - 1; size >= 0; size--) {
            s.a aVar = this.f1747a.get(size);
            int i = aVar.f1755a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1756b;
                            break;
                        case 10:
                            aVar.f1762h = aVar.f1761g;
                            break;
                    }
                }
                arrayList.add(aVar.f1756b);
            }
            arrayList.remove(aVar.f1756b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.s
    public s b(Fragment fragment) {
        l lVar;
        if (fragment == null || (lVar = fragment.s) == null || lVar == this.r) {
            super.b(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        s.a aVar;
        if (!this.f1753g) {
            return;
        }
        if (l.d(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
        }
        int size = this.f1747a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1747a.get(i2).f1756b;
            if (fragment != null) {
                fragment.r += i;
                if (l.d(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + aVar.f1756b + " to " + aVar.f1756b.r);
                }
            }
        }
    }

    @Override // androidx.fragment.app.s
    public s c(Fragment fragment) {
        l lVar = fragment.s;
        if (lVar == null || lVar == this.r) {
            super.c(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.s
    public void c() {
        e();
        this.r.b((l.i) this, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z) {
        for (int size = this.f1747a.size() - 1; size >= 0; size--) {
            s.a aVar = this.f1747a.get(size);
            Fragment fragment = aVar.f1756b;
            if (fragment != null) {
                fragment.c(l.e(this.f1752f));
            }
            switch (aVar.f1755a) {
                case 1:
                    fragment.b(aVar.f1760f);
                    this.r.a(fragment, true);
                    this.r.l(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1755a);
                case 3:
                    fragment.b(aVar.f1759e);
                    this.r.a(fragment);
                    break;
                case 4:
                    fragment.b(aVar.f1759e);
                    this.r.o(fragment);
                    break;
                case 5:
                    fragment.b(aVar.f1760f);
                    this.r.a(fragment, true);
                    this.r.f(fragment);
                    break;
                case 6:
                    fragment.b(aVar.f1759e);
                    this.r.c(fragment);
                    break;
                case 7:
                    fragment.b(aVar.f1760f);
                    this.r.a(fragment, true);
                    this.r.d(fragment);
                    break;
                case 8:
                    this.r.n(null);
                    break;
                case 9:
                    this.r.n(fragment);
                    break;
                case 10:
                    this.r.a(fragment, aVar.f1761g);
                    break;
            }
            if (!this.p && aVar.f1755a != 3 && fragment != null) {
                this.r.i(fragment);
            }
        }
        if (this.p || !z) {
            return;
        }
        l lVar = this.r;
        lVar.a(lVar.n, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(int i) {
        int size = this.f1747a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1747a.get(i2).f1756b;
            int i3 = fragment != null ? fragment.x : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.s
    public void d() {
        e();
        this.r.b((l.i) this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        int size = this.f1747a.size();
        for (int i = 0; i < size; i++) {
            s.a aVar = this.f1747a.get(i);
            Fragment fragment = aVar.f1756b;
            if (fragment != null) {
                fragment.c(this.f1752f);
            }
            switch (aVar.f1755a) {
                case 1:
                    fragment.b(aVar.f1757c);
                    this.r.a(fragment, false);
                    this.r.a(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1755a);
                case 3:
                    fragment.b(aVar.f1758d);
                    this.r.l(fragment);
                    break;
                case 4:
                    fragment.b(aVar.f1758d);
                    this.r.f(fragment);
                    break;
                case 5:
                    fragment.b(aVar.f1757c);
                    this.r.a(fragment, false);
                    this.r.o(fragment);
                    break;
                case 6:
                    fragment.b(aVar.f1758d);
                    this.r.d(fragment);
                    break;
                case 7:
                    fragment.b(aVar.f1757c);
                    this.r.a(fragment, false);
                    this.r.c(fragment);
                    break;
                case 8:
                    this.r.n(fragment);
                    break;
                case 9:
                    this.r.n(null);
                    break;
                case 10:
                    this.r.a(fragment, aVar.f1762h);
                    break;
            }
            if (!this.p && aVar.f1755a != 1 && fragment != null) {
                this.r.i(fragment);
            }
        }
        if (!this.p) {
            l lVar = this.r;
            lVar.a(lVar.n, true);
        }
    }

    public String g() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        for (int i = 0; i < this.f1747a.size(); i++) {
            if (b(this.f1747a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                this.q.get(i).run();
            }
            this.q = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
