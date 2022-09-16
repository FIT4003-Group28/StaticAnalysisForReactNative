package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cr  reason: default package */
/* loaded from: classes3.dex */
public final class cr extends ex implements em {
    final eo a;
    boolean b;
    public int c;

    public cr(eo eoVar) {
        eoVar.i();
        dz dzVar = eoVar.m;
        if (dzVar != null) {
            dzVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = eoVar;
    }

    @Override // defpackage.ex
    public final int a() {
        return b(false);
    }

    final int b(boolean z) {
        if (!this.b) {
            if (eo.X(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                PrintWriter printWriter = new PrintWriter(new fc());
                g("  ", printWriter);
                printWriter.close();
            }
            this.b = true;
            if (this.j) {
                this.c = this.a.f.getAndIncrement();
            } else {
                this.c = -1;
            }
            this.a.G(this, z);
            return this.c;
        }
        throw new IllegalStateException("commit already called");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        if (!this.j) {
            return;
        }
        if (eo.X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bump nesting in ");
            sb.append(this);
            sb.append(" by ");
            sb.append(i);
        }
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            ew ewVar = (ew) this.d.get(i2);
            dp dpVar = ewVar.b;
            if (dpVar != null) {
                dpVar.y += i;
                if (eo.X(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bump nesting of ");
                    sb2.append(ewVar.b);
                    sb2.append(" to ");
                    sb2.append(ewVar.b.y);
                }
            }
        }
    }

    @Override // defpackage.ex
    public final void d() {
        t();
        this.a.H(this, false);
    }

    @Override // defpackage.ex
    public final void e() {
        t();
        this.a.H(this, true);
    }

    @Override // defpackage.ex
    public final void f(int i, dp dpVar, String str, int i2) {
        String str2 = dpVar.V;
        if (str2 != null) {
            ape.a(dpVar, str2);
        }
        Class<?> cls = dpVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = dpVar.F;
                if (str3 == null || str.equals(str3)) {
                    dpVar.F = str;
                } else {
                    throw new IllegalStateException("Can't change tag of fragment " + dpVar + ": was " + dpVar.F + " now " + str);
                }
            }
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Can't add fragment " + dpVar + " with tag " + str + " to container view with no id");
                }
                int i3 = dpVar.D;
                if (i3 == 0 || i3 == i) {
                    dpVar.D = i;
                    dpVar.E = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + dpVar + ": was " + dpVar.D + " now " + i);
                }
            }
            o(new ew(i2, dpVar));
            dpVar.z = this.a;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void g(String str, PrintWriter printWriter) {
        h(str, printWriter, true);
    }

    public final void h(String str, PrintWriter printWriter, boolean z) {
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
                ew ewVar = (ew) this.d.get(i);
                switch (ewVar.a) {
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
                        str2 = "cmd=" + ewVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(ewVar.b);
                if (z) {
                    if (ewVar.d != 0 || ewVar.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(ewVar.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(ewVar.e));
                    }
                    if (ewVar.f != 0 || ewVar.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(ewVar.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(ewVar.g));
                    }
                }
            }
        }
    }

    @Override // defpackage.em
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        if (eo.X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (this.j) {
            eo eoVar = this.a;
            if (eoVar.b == null) {
                eoVar.b = new ArrayList();
            }
            eoVar.b.add(this);
            return true;
        }
        return true;
    }

    @Override // defpackage.ex
    public final boolean j() {
        return this.d.isEmpty();
    }

    @Override // defpackage.ex
    public final void k() {
        b(true);
    }

    @Override // defpackage.ex
    public final void l(dp dpVar) {
        eo eoVar = dpVar.z;
        if (eoVar == null || eoVar == this.a) {
            o(new ew(4, dpVar));
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + dpVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.ex
    public final void m(dp dpVar) {
        eo eoVar = dpVar.z;
        if (eoVar == null || eoVar == this.a) {
            o(new ew(3, dpVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + dpVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.ex
    public final void n(dp dpVar) {
        eo eoVar = dpVar.z;
        if (eoVar == null || eoVar == this.a) {
            o(new ew(5, dpVar));
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + dpVar.toString() + " is already attached to a FragmentManager.");
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
}
