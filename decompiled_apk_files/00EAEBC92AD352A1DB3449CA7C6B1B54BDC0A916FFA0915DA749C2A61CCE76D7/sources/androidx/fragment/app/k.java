package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f1696a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final l f1697b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final l.g f1698a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f1699b;

        a(l.g gVar, boolean z) {
            this.f1698a = gVar;
            this.f1699b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(l lVar) {
        this.f1697b = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment, Context context, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().a(fragment, context, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.a(this.f1697b, fragment, context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.a(this.f1697b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().a(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.a(this.f1697b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().a(fragment, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.a(this.f1697b, fragment);
            }
        }
    }

    public void a(l.g gVar) {
        synchronized (this.f1696a) {
            int i = 0;
            int size = this.f1696a.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f1696a.get(i).f1698a == gVar) {
                    this.f1696a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public void a(l.g gVar, boolean z) {
        this.f1696a.add(new a(gVar, z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Fragment fragment, Context context, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().b(fragment, context, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.b(this.f1697b, fragment, context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().b(fragment, bundle, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.b(this.f1697b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Fragment fragment, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().b(fragment, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.b(this.f1697b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.c(this.f1697b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Fragment fragment, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().c(fragment, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.c(this.f1697b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().d(fragment, bundle, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.d(this.f1697b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().d(fragment, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.d(this.f1697b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().e(fragment, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.e(this.f1697b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().f(fragment, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.f(this.f1697b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment, boolean z) {
        Fragment t = this.f1697b.t();
        if (t != null) {
            t.w().s().g(fragment, true);
        }
        Iterator<a> it = this.f1696a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.f1699b) {
                next.f1698a.g(this.f1697b, fragment);
            }
        }
    }
}
