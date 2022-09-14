package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ep  reason: default package */
/* loaded from: classes.dex */
public final class ep extends gz implements gf, gk {
    final gn a;
    boolean b;
    public int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ep(defpackage.gn r3) {
        /*
            r2 = this;
            fq r0 = r3.al()
            fr<?> r1 = r3.k
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L10
        Lf:
            r1 = 0
        L10:
            r2.<init>(r0, r1)
            r0 = -1
            r2.c = r0
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep.<init>(gn):void");
    }

    public static boolean o(gy gyVar) {
        fd fdVar = gyVar.b;
        return false;
    }

    public final void a(String str, PrintWriter printWriter) {
        b(str, printWriter, true);
    }

    public final void b(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (!this.d.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                gy gyVar = this.d.get(i);
                switch (gyVar.a) {
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
                        str2 = "cmd=" + gyVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(gyVar.b);
                if (z) {
                    if (gyVar.c != 0 || gyVar.d != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(gyVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(gyVar.d));
                    }
                    if (gyVar.e != 0 || gyVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(gyVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(gyVar.f));
                    }
                }
            }
        }
    }

    @Override // defpackage.gf
    public final int c() {
        return this.c;
    }

    @Override // defpackage.gz
    public final void d(int i, fd fdVar, String str, int i2) {
        Class<?> cls = fdVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fdVar.G;
                if (str2 == null || str.equals(str2)) {
                    fdVar.G = str;
                } else {
                    throw new IllegalStateException("Can't change tag of fragment " + fdVar + ": was " + fdVar.G + " now " + str);
                }
            }
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Can't add fragment " + fdVar + " with tag " + str + " to container view with no id");
                }
                int i3 = fdVar.E;
                if (i3 == 0 || i3 == i) {
                    fdVar.E = i;
                    fdVar.F = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fdVar + ": was " + fdVar.E + " now " + i);
                }
            }
            v(new gy(i2, fdVar));
            fdVar.A = this.a;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i) {
        gy gyVar;
        if (!this.j) {
            return;
        }
        if (gn.a(2)) {
            String str = "Bump nesting in " + this + " by " + i;
        }
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            fd fdVar = this.d.get(i2).b;
            if (fdVar != null) {
                fdVar.z += i;
                if (gn.a(2)) {
                    String str2 = "Bump nesting of " + gyVar.b + " to " + gyVar.b.z;
                }
            }
        }
    }

    @Override // defpackage.gz
    public final int f() {
        return i(false);
    }

    @Override // defpackage.gz
    public final void g() {
        B();
        this.a.L(this, false);
    }

    @Override // defpackage.gz
    public final void h() {
        B();
        this.a.L(this, true);
    }

    final int i(boolean z) {
        if (!this.b) {
            if (gn.a(2)) {
                String str = "Commit: " + this;
                PrintWriter printWriter = new PrintWriter(new hu());
                a("  ", printWriter);
                printWriter.close();
            }
            this.b = true;
            if (this.j) {
                this.c = this.a.f.getAndIncrement();
            } else {
                this.c = -1;
            }
            this.a.K(this, z);
            return this.c;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // defpackage.gk
    public final boolean j(ArrayList<ep> arrayList, ArrayList<Boolean> arrayList2) {
        if (gn.a(2)) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (this.j) {
            gn gnVar = this.a;
            if (gnVar.b == null) {
                gnVar.b = new ArrayList<>();
            }
            gnVar.b.add(this);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            fd fdVar = this.d.get(i2).b;
            int i3 = fdVar != null ? fdVar.F : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l(ArrayList<ep> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.d.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            fd fdVar = this.d.get(i4).b;
            int i5 = fdVar != null ? fdVar.F : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    ep epVar = arrayList.get(i6);
                    int size2 = epVar.d.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        fd fdVar2 = epVar.d.get(i7).b;
                        if ((fdVar2 != null ? fdVar2.F : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            gy gyVar = this.d.get(i);
            fd fdVar = gyVar.b;
            if (fdVar != null) {
                fdVar.aw(this.i);
                fdVar.ax(this.q, this.r);
            }
            switch (gyVar.a) {
                case 1:
                    fdVar.av(gyVar.c);
                    this.a.v(fdVar, false);
                    this.a.B(fdVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + gyVar.a);
                case 3:
                    fdVar.av(gyVar.d);
                    this.a.C(fdVar);
                    break;
                case 4:
                    fdVar.av(gyVar.d);
                    this.a.D(fdVar);
                    break;
                case 5:
                    fdVar.av(gyVar.c);
                    this.a.v(fdVar, false);
                    gn.as(fdVar);
                    break;
                case 6:
                    fdVar.av(gyVar.d);
                    this.a.E(fdVar);
                    break;
                case 7:
                    fdVar.av(gyVar.c);
                    this.a.v(fdVar, false);
                    this.a.F(fdVar);
                    break;
                case 8:
                    this.a.ai(fdVar);
                    break;
                case 9:
                    this.a.ai(null);
                    break;
                case 10:
                    this.a.ak(fdVar, gyVar.h);
                    break;
            }
            if (!this.s && gyVar.a != 1 && fdVar != null) {
                this.a.y(fdVar);
            }
        }
        if (!this.s) {
            gn gnVar = this.a;
            gnVar.z(gnVar.j, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z) {
        int size = this.d.size();
        while (true) {
            size--;
            if (size >= 0) {
                gy gyVar = this.d.get(size);
                fd fdVar = gyVar.b;
                if (fdVar != null) {
                    int i = this.i;
                    int i2 = 8194;
                    if (i != 4097) {
                        i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                    }
                    fdVar.aw(i2);
                    fdVar.ax(this.r, this.q);
                }
                switch (gyVar.a) {
                    case 1:
                        fdVar.av(gyVar.f);
                        this.a.v(fdVar, true);
                        this.a.C(fdVar);
                        break;
                    case 2:
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + gyVar.a);
                    case 3:
                        fdVar.av(gyVar.e);
                        this.a.B(fdVar);
                        break;
                    case 4:
                        fdVar.av(gyVar.e);
                        gn.as(fdVar);
                        break;
                    case 5:
                        fdVar.av(gyVar.f);
                        this.a.v(fdVar, true);
                        this.a.D(fdVar);
                        break;
                    case 6:
                        fdVar.av(gyVar.e);
                        this.a.F(fdVar);
                        break;
                    case 7:
                        fdVar.av(gyVar.f);
                        this.a.v(fdVar, true);
                        this.a.E(fdVar);
                        break;
                    case 8:
                        this.a.ai(null);
                        break;
                    case 9:
                        this.a.ai(fdVar);
                        break;
                    case 10:
                        this.a.ak(fdVar, gyVar.g);
                        break;
                }
                if (!this.s && gyVar.a != 3 && fdVar != null) {
                    this.a.y(fdVar);
                }
            } else if (this.s || !z) {
                return;
            } else {
                gn gnVar = this.a;
                gnVar.z(gnVar.j, true);
                return;
            }
        }
    }

    @Override // defpackage.gf
    public final String p() {
        return this.l;
    }

    @Override // defpackage.gz
    public final boolean q() {
        return this.d.isEmpty();
    }

    @Override // defpackage.gz
    public final void r() {
        i(true);
    }

    @Override // defpackage.gz
    public final void s(fd fdVar) {
        gn gnVar = fdVar.A;
        if (gnVar == null || gnVar == this.a) {
            v(new gy(5, fdVar));
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fdVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.gz
    public final void t(fd fdVar) {
        gn gnVar = fdVar.A;
        if (gnVar == null || gnVar == this.a) {
            v(new gy(6, fdVar));
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fdVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.gz
    public final void u(fd fdVar) {
        gn gnVar = fdVar.A;
        if (gnVar == null || gnVar == this.a) {
            v(new gy(3, fdVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fdVar.toString() + " is already attached to a FragmentManager.");
    }
}
