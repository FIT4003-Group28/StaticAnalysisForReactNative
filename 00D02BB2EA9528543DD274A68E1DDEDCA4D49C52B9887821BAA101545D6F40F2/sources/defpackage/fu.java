package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fu  reason: default package */
/* loaded from: classes.dex */
public final class fu {
    public final CopyOnWriteArrayList<ft> a = new CopyOnWriteArrayList<>();
    private final gn b;

    public fu(gn gnVar) {
        this.b = gnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(fd fdVar, boolean z) {
        gn gnVar = this.b;
        Context context = gnVar.k.c;
        fd fdVar2 = gnVar.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.a(fdVar, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                gh ghVar = next.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(fd fdVar, boolean z) {
        gn gnVar = this.b;
        Context context = gnVar.k.c;
        fd fdVar2 = gnVar.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.b(fdVar, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                gh ghVar = next.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(fd fdVar, Bundle bundle, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.c(fdVar, bundle, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                gh ghVar = next.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(fd fdVar, Bundle bundle, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.d(fdVar, bundle, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                next.a.c(fdVar, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(fd fdVar, Bundle bundle, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.e(fdVar, bundle, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                next.a.b(fdVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(fd fdVar, View view, Bundle bundle, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.f(fdVar, view, bundle, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                gh ghVar = next.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(fd fdVar, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.g(fdVar, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                next.a.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(fd fdVar, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.h(fdVar, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                next.a.f(fdVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(fd fdVar, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.i(fdVar, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                next.a.e(fdVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(fd fdVar, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.j(fdVar, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                gh ghVar = next.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(fd fdVar, Bundle bundle, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.k(fdVar, bundle, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                next.a.g(fdVar, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(fd fdVar, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.l(fdVar, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                next.a.i(fdVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(fd fdVar, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.m(fdVar, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                next.a.a(this.b, fdVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(fd fdVar, boolean z) {
        fd fdVar2 = this.b.m;
        if (fdVar2 != null) {
            fdVar2.Q().h.n(fdVar, true);
        }
        Iterator<ft> it = this.a.iterator();
        while (it.hasNext()) {
            ft next = it.next();
            if (!z || next.b) {
                next.a.d(fdVar);
            }
        }
    }
}
