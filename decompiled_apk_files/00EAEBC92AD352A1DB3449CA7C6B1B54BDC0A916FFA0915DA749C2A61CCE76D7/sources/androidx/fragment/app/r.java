package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Fragment> f1745a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, q> f1746b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f1746b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Iterator<Fragment> it = this.f1745a.iterator();
        while (it.hasNext()) {
            q qVar = this.f1746b.get(it.next().f1642f);
            if (qVar != null) {
                qVar.a(i);
            }
        }
        for (q qVar2 : this.f1746b.values()) {
            if (qVar2 != null) {
                qVar2.a(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (this.f1745a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1745a) {
            this.f1745a.add(fragment);
        }
        fragment.l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(q qVar) {
        this.f1746b.put(qVar.e().f1642f, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f1746b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (q qVar : this.f1746b.values()) {
                printWriter.print(str);
                if (qVar != null) {
                    Fragment e2 = qVar.e();
                    printWriter.println(e2);
                    e2.a(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f1745a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f1745a.get(i).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<String> list) {
        this.f1745a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment b2 = b(str);
                if (b2 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (l.d(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + b2);
                }
                a(b2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        return this.f1746b.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment b(int i) {
        for (int size = this.f1745a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1745a.get(size);
            if (fragment != null && fragment.w == i) {
                return fragment;
            }
        }
        for (q qVar : this.f1746b.values()) {
            if (qVar != null) {
                Fragment e2 = qVar.e();
                if (e2.w == i) {
                    return e2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment b(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        View view = fragment.H;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f1745a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f1745a.get(indexOf);
                if (fragment2.G == viewGroup && fragment2.H != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment b(String str) {
        q qVar = this.f1746b.get(str);
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> b() {
        ArrayList arrayList = new ArrayList();
        Iterator<q> it = this.f1746b.values().iterator();
        while (it.hasNext()) {
            q next = it.next();
            arrayList.add(next != null ? next.e() : null);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(q qVar) {
        Fragment e2 = qVar.e();
        for (q qVar2 : this.f1746b.values()) {
            if (qVar2 != null) {
                Fragment e3 = qVar2.e();
                if (e2.f1642f.equals(e3.i)) {
                    e3.f1644h = e2;
                    e3.i = null;
                }
            }
        }
        this.f1746b.put(e2.f1642f, null);
        String str = e2.i;
        if (str != null) {
            e2.f1644h = b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment c(String str) {
        if (str != null) {
            for (int size = this.f1745a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1745a.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (q qVar : this.f1746b.values()) {
                if (qVar != null) {
                    Fragment e2 = qVar.e();
                    if (str.equals(e2.y)) {
                        return e2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> c() {
        ArrayList arrayList;
        if (this.f1745a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1745a) {
            arrayList = new ArrayList(this.f1745a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Fragment fragment) {
        synchronized (this.f1745a) {
            this.f1745a.remove(fragment);
        }
        fragment.l = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment d(String str) {
        Fragment a2;
        for (q qVar : this.f1746b.values()) {
            if (qVar != null && (a2 = qVar.e().a(str)) != null) {
                return a2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f1746b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q e(String str) {
        return this.f1746b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<p> e() {
        ArrayList<p> arrayList = new ArrayList<>(this.f1746b.size());
        for (q qVar : this.f1746b.values()) {
            if (qVar != null) {
                Fragment e2 = qVar.e();
                p i = qVar.i();
                arrayList.add(i);
                if (l.d(2)) {
                    Log.v("FragmentManager", "Saved state of " + e2 + ": " + i.n);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> f() {
        synchronized (this.f1745a) {
            if (this.f1745a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f1745a.size());
            Iterator<Fragment> it = this.f1745a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f1642f);
                if (l.d(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f1642f + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
