package android.support.v4.app;

import android.support.v4.app.i;
import android.support.v4.app.o;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class c extends s implements o.g {

    /* renamed from: a  reason: collision with root package name */
    final o f210a;

    /* renamed from: c  reason: collision with root package name */
    int f212c;

    /* renamed from: d  reason: collision with root package name */
    int f213d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    String k;
    boolean l;
    int n;
    CharSequence o;
    int p;
    CharSequence q;
    ArrayList<String> r;
    ArrayList<String> s;
    ArrayList<Runnable> u;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<a> f211b = new ArrayList<>();
    boolean j = true;
    int m = -1;
    boolean t = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackStackRecord.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f214a;

        /* renamed from: b  reason: collision with root package name */
        i f215b;

        /* renamed from: c  reason: collision with root package name */
        int f216c;

        /* renamed from: d  reason: collision with root package name */
        int f217d;
        int e;
        int f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        a(int i, i iVar) {
            this.f214a = i;
            this.f215b = iVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.m >= 0) {
            sb.append(" #");
            sb.append(this.m);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.l);
            if (this.g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.f212c != 0 || this.f213d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f212c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f213d));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.o);
            }
            if (this.p != 0 || this.q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.q);
            }
        }
        if (!this.f211b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int size = this.f211b.size();
            for (int i = 0; i < size; i++) {
                a aVar = this.f211b.get(i);
                switch (aVar.f214a) {
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
                    default:
                        str2 = "cmd=" + aVar.f214a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f215b);
                if (z) {
                    if (aVar.f216c != 0 || aVar.f217d != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f216c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f217d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    public c(o oVar) {
        this.f210a = oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f211b.add(aVar);
        aVar.f216c = this.f212c;
        aVar.f217d = this.f213d;
        aVar.e = this.e;
        aVar.f = this.f;
    }

    @Override // android.support.v4.app.s
    public s a(i iVar, String str) {
        a(0, iVar, str, 1);
        return this;
    }

    private void a(int i, i iVar, String str, int i2) {
        Class<?> cls = iVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        iVar.mFragmentManager = this.f210a;
        if (str != null) {
            if (iVar.mTag != null && !str.equals(iVar.mTag)) {
                throw new IllegalStateException("Can't change tag of fragment " + iVar + ": was " + iVar.mTag + " now " + str);
            }
            iVar.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + iVar + " with tag " + str + " to container view with no id");
            } else if (iVar.mFragmentId != 0 && iVar.mFragmentId != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + iVar + ": was " + iVar.mFragmentId + " now " + i);
            } else {
                iVar.mFragmentId = i;
                iVar.mContainerId = i;
            }
        }
        a(new a(i2, iVar));
    }

    @Override // android.support.v4.app.s
    public s a(i iVar) {
        a(new a(3, iVar));
        return this;
    }

    public s a() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if (!this.i) {
            return;
        }
        if (o.f245a) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
        }
        int size = this.f211b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f211b.get(i2);
            if (aVar.f215b != null) {
                aVar.f215b.mBackStackNesting += i;
                if (o.f245a) {
                    Log.v("FragmentManager", "Bump nesting of " + aVar.f215b + " to " + aVar.f215b.mBackStackNesting);
                }
            }
        }
    }

    public void b() {
        if (this.u != null) {
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                this.u.get(i).run();
            }
            this.u = null;
        }
    }

    @Override // android.support.v4.app.s
    public int c() {
        return a(false);
    }

    @Override // android.support.v4.app.s
    public int d() {
        return a(true);
    }

    @Override // android.support.v4.app.s
    public void e() {
        a();
        this.f210a.b((o.g) this, false);
    }

    int a(boolean z) {
        if (this.l) {
            throw new IllegalStateException("commit already called");
        }
        if (o.f245a) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new android.support.v4.i.e("FragmentManager"));
            a("  ", (FileDescriptor) null, printWriter, (String[]) null);
            printWriter.close();
        }
        this.l = true;
        if (this.i) {
            this.m = this.f210a.a(this);
        } else {
            this.m = -1;
        }
        this.f210a.a(this, z);
        return this.m;
    }

    @Override // android.support.v4.app.o.g
    public boolean a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2) {
        if (o.f245a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (this.i) {
            this.f210a.b(this);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i) {
        int size = this.f211b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f211b.get(i2);
            int i3 = aVar.f215b != null ? aVar.f215b.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(ArrayList<c> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f211b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = this.f211b.get(i4);
            int i5 = aVar.f215b != null ? aVar.f215b.mContainerId : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    c cVar = arrayList.get(i6);
                    int size2 = cVar.f211b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        a aVar2 = cVar.f211b.get(i7);
                        if ((aVar2.f215b != null ? aVar2.f215b.mContainerId : 0) == i5) {
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
    public void f() {
        int size = this.f211b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f211b.get(i);
            i iVar = aVar.f215b;
            if (iVar != null) {
                iVar.setNextTransition(this.g, this.h);
            }
            int i2 = aVar.f214a;
            if (i2 == 1) {
                iVar.setNextAnim(aVar.f216c);
                this.f210a.a(iVar, false);
            } else {
                switch (i2) {
                    case 3:
                        iVar.setNextAnim(aVar.f217d);
                        this.f210a.h(iVar);
                        break;
                    case 4:
                        iVar.setNextAnim(aVar.f217d);
                        this.f210a.i(iVar);
                        break;
                    case 5:
                        iVar.setNextAnim(aVar.f216c);
                        this.f210a.j(iVar);
                        break;
                    case 6:
                        iVar.setNextAnim(aVar.f217d);
                        this.f210a.k(iVar);
                        break;
                    case 7:
                        iVar.setNextAnim(aVar.f216c);
                        this.f210a.l(iVar);
                        break;
                    case 8:
                        this.f210a.o(iVar);
                        break;
                    case 9:
                        this.f210a.o(null);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + aVar.f214a);
                }
            }
            if (!this.t && aVar.f214a != 1 && iVar != null) {
                this.f210a.e(iVar);
            }
        }
        if (!this.t) {
            this.f210a.a(this.f210a.l, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        for (int size = this.f211b.size() - 1; size >= 0; size--) {
            a aVar = this.f211b.get(size);
            i iVar = aVar.f215b;
            if (iVar != null) {
                iVar.setNextTransition(o.d(this.g), this.h);
            }
            int i = aVar.f214a;
            if (i == 1) {
                iVar.setNextAnim(aVar.f);
                this.f210a.h(iVar);
            } else {
                switch (i) {
                    case 3:
                        iVar.setNextAnim(aVar.e);
                        this.f210a.a(iVar, false);
                        break;
                    case 4:
                        iVar.setNextAnim(aVar.e);
                        this.f210a.j(iVar);
                        break;
                    case 5:
                        iVar.setNextAnim(aVar.f);
                        this.f210a.i(iVar);
                        break;
                    case 6:
                        iVar.setNextAnim(aVar.e);
                        this.f210a.l(iVar);
                        break;
                    case 7:
                        iVar.setNextAnim(aVar.f);
                        this.f210a.k(iVar);
                        break;
                    case 8:
                        this.f210a.o(null);
                        break;
                    case 9:
                        this.f210a.o(iVar);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + aVar.f214a);
                }
            }
            if (!this.t && aVar.f214a != 3 && iVar != null) {
                this.f210a.e(iVar);
            }
        }
        if (this.t || !z) {
            return;
        }
        this.f210a.a(this.f210a.l, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i a(ArrayList<i> arrayList, i iVar) {
        i iVar2 = iVar;
        int i = 0;
        while (i < this.f211b.size()) {
            a aVar = this.f211b.get(i);
            switch (aVar.f214a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f215b);
                    break;
                case 2:
                    i iVar3 = aVar.f215b;
                    int i2 = iVar3.mContainerId;
                    i iVar4 = iVar2;
                    int i3 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        i iVar5 = arrayList.get(size);
                        if (iVar5.mContainerId == i2) {
                            if (iVar5 == iVar3) {
                                z = true;
                            } else {
                                if (iVar5 == iVar4) {
                                    this.f211b.add(i3, new a(9, iVar5));
                                    i3++;
                                    iVar4 = null;
                                }
                                a aVar2 = new a(3, iVar5);
                                aVar2.f216c = aVar.f216c;
                                aVar2.e = aVar.e;
                                aVar2.f217d = aVar.f217d;
                                aVar2.f = aVar.f;
                                this.f211b.add(i3, aVar2);
                                arrayList.remove(iVar5);
                                i3++;
                            }
                        }
                    }
                    if (z) {
                        this.f211b.remove(i3);
                        i3--;
                    } else {
                        aVar.f214a = 1;
                        arrayList.add(iVar3);
                    }
                    i = i3;
                    iVar2 = iVar4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f215b);
                    if (aVar.f215b == iVar2) {
                        this.f211b.add(i, new a(9, aVar.f215b));
                        i++;
                        iVar2 = null;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    this.f211b.add(i, new a(9, iVar2));
                    i++;
                    iVar2 = aVar.f215b;
                    break;
            }
            i++;
        }
        return iVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i b(ArrayList<i> arrayList, i iVar) {
        for (int i = 0; i < this.f211b.size(); i++) {
            a aVar = this.f211b.get(i);
            int i2 = aVar.f214a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            iVar = null;
                            break;
                        case 9:
                            iVar = aVar.f215b;
                            break;
                    }
                }
                arrayList.add(aVar.f215b);
            }
            arrayList.remove(aVar.f215b);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        for (int i = 0; i < this.f211b.size(); i++) {
            if (b(this.f211b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(i.c cVar) {
        for (int i = 0; i < this.f211b.size(); i++) {
            a aVar = this.f211b.get(i);
            if (b(aVar)) {
                aVar.f215b.setOnStartEnterTransitionListener(cVar);
            }
        }
    }

    private static boolean b(a aVar) {
        i iVar = aVar.f215b;
        return iVar != null && iVar.mAdded && iVar.mView != null && !iVar.mDetached && !iVar.mHidden && iVar.isPostponed();
    }

    public String h() {
        return this.k;
    }
}
