package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: b  reason: collision with root package name */
    int f1748b;

    /* renamed from: c  reason: collision with root package name */
    int f1749c;

    /* renamed from: d  reason: collision with root package name */
    int f1750d;

    /* renamed from: e  reason: collision with root package name */
    int f1751e;

    /* renamed from: f  reason: collision with root package name */
    int f1752f;

    /* renamed from: g  reason: collision with root package name */
    boolean f1753g;
    String i;
    int j;
    CharSequence k;
    int l;
    CharSequence m;
    ArrayList<String> n;
    ArrayList<String> o;
    ArrayList<Runnable> q;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<a> f1747a = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    boolean f1754h = true;
    boolean p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f1755a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f1756b;

        /* renamed from: c  reason: collision with root package name */
        int f1757c;

        /* renamed from: d  reason: collision with root package name */
        int f1758d;

        /* renamed from: e  reason: collision with root package name */
        int f1759e;

        /* renamed from: f  reason: collision with root package name */
        int f1760f;

        /* renamed from: g  reason: collision with root package name */
        f.b f1761g;

        /* renamed from: h  reason: collision with root package name */
        f.b f1762h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i, Fragment fragment) {
            this.f1755a = i;
            this.f1756b = fragment;
            f.b bVar = f.b.RESUMED;
            this.f1761g = bVar;
            this.f1762h = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(h hVar, ClassLoader classLoader) {
    }

    public abstract int a();

    public s a(int i) {
        this.f1752f = i;
        return this;
    }

    public s a(int i, Fragment fragment) {
        a(i, fragment, null, 1);
        return this;
    }

    public s a(int i, Fragment fragment, String str) {
        a(i, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s a(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.G = viewGroup;
        a(viewGroup.getId(), fragment, str);
        return this;
    }

    public s a(Fragment fragment) {
        a(new a(3, fragment));
        return this;
    }

    public s a(Fragment fragment, String str) {
        a(0, fragment, str, 1);
        return this;
    }

    public s a(Runnable runnable) {
        e();
        if (this.q == null) {
            this.q = new ArrayList<>();
        }
        this.q.add(runnable);
        return this;
    }

    public s a(String str) {
        if (this.f1754h) {
            this.f1753g = true;
            this.i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public s a(boolean z) {
        this.p = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.y;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.y + " now " + str);
            }
            fragment.y = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.w;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.w + " now " + i);
            }
            fragment.w = i;
            fragment.x = i;
        }
        a(new a(i2, fragment));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f1747a.add(aVar);
        aVar.f1757c = this.f1748b;
        aVar.f1758d = this.f1749c;
        aVar.f1759e = this.f1750d;
        aVar.f1760f = this.f1751e;
    }

    public abstract int b();

    public s b(int i, Fragment fragment) {
        b(i, fragment, null);
        return this;
    }

    public s b(int i, Fragment fragment, String str) {
        if (i != 0) {
            a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public s b(Fragment fragment) {
        a(new a(8, fragment));
        return this;
    }

    public s c(Fragment fragment) {
        a(new a(5, fragment));
        return this;
    }

    public abstract void c();

    public abstract void d();

    public s e() {
        if (!this.f1753g) {
            this.f1754h = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
}
