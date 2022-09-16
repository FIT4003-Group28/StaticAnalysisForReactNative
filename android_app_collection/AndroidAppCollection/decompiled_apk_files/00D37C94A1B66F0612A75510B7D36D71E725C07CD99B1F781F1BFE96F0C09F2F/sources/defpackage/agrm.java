package defpackage;

import android.app.Notification;
import android.text.TextUtils;
import android.util.Pair;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: agrm  reason: default package */
/* loaded from: classes.dex */
public final class agrm {
    private final agyr b;
    private final ahdf c;
    private final agro d;
    private String e;
    private int f;
    public boolean a = false;
    private final Set g = new HashSet();

    public agrm(agro agroVar, agyr agyrVar, ahdf ahdfVar) {
        this.d = agroVar;
        this.b = agyrVar;
        this.c = ahdfVar;
    }

    private final void f() {
        if (this.c.f() || !this.c.b()) {
            this.b.g();
            this.a = false;
        }
    }

    private final void g(String str, int i) {
        if (!this.a || this.f != i || !TextUtils.equals(str, this.e)) {
            return;
        }
        f();
    }

    public final synchronized void a(String str, int i) {
        g(str, i);
        Set set = this.g;
        Integer valueOf = Integer.valueOf(i);
        set.remove(new Pair(str, valueOf));
        agro agroVar = this.d;
        synchronized (agroVar.b) {
            agroVar.b.remove(new Pair(str, valueOf));
        }
        agroVar.a.cancel(str, i);
    }

    public final synchronized void b() {
        f();
        this.g.clear();
        this.d.c();
    }

    public final synchronized void c(String str, int i, Notification notification) {
        g(str, i);
        this.d.d(str, i, notification);
    }

    public final synchronized void d(String str, int i, Notification notification) {
        e(str, i, notification, false);
    }

    public final synchronized void e(String str, int i, Notification notification, boolean z) {
        if (this.c.f() || !this.c.b()) {
            if (this.b.n(i, notification)) {
                zep.g("[Offline] ForegroundServiceNotifier: Starting foreground notification.");
                this.f = i;
                this.e = str;
                this.a = true;
                this.g.add(new Pair(str, Integer.valueOf(i)));
                return;
            }
            zep.l("[Offline] ForegroundServiceNotifier: Failed to start foreground notification due to null binder.");
        }
        if (!z) {
            this.d.d(str, i, notification);
        }
    }
}
