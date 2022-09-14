package com.google.firebase.crashlytics.c.h;

import android.content.Context;
import com.google.firebase.crashlytics.c.j.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h0 implements o {

    /* renamed from: a  reason: collision with root package name */
    private final p f8642a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.m.g f8643b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.p.c f8644c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.i.b f8645d;

    /* renamed from: e  reason: collision with root package name */
    private final j0 f8646e;

    /* renamed from: f  reason: collision with root package name */
    private String f8647f;

    h0(p pVar, com.google.firebase.crashlytics.c.m.g gVar, com.google.firebase.crashlytics.c.p.c cVar, com.google.firebase.crashlytics.c.i.b bVar, j0 j0Var) {
        this.f8642a = pVar;
        this.f8643b = gVar;
        this.f8644c = cVar;
        this.f8645d = bVar;
        this.f8646e = j0Var;
    }

    public static h0 a(Context context, y yVar, com.google.firebase.crashlytics.c.m.h hVar, b bVar, com.google.firebase.crashlytics.c.i.b bVar2, j0 j0Var, com.google.firebase.crashlytics.c.r.d dVar, com.google.firebase.crashlytics.c.q.e eVar) {
        return new h0(new p(context, yVar, bVar, dVar), new com.google.firebase.crashlytics.c.m.g(new File(hVar.a()), eVar), com.google.firebase.crashlytics.c.p.c.a(context), bVar2, j0Var);
    }

    private static List<v.b> a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            v.b.a c2 = v.b.c();
            c2.a(entry.getKey());
            c2.b(entry.getValue());
            arrayList.add(c2.a());
        }
        Collections.sort(arrayList, g0.a());
        return arrayList;
    }

    private void a(Throwable th, Thread thread, String str, long j, boolean z) {
        String str2 = this.f8647f;
        if (str2 == null) {
            com.google.firebase.crashlytics.c.b.a().a("Cannot persist event, no currently open session");
            return;
        }
        boolean equals = str.equals("crash");
        v.d.AbstractC0171d a2 = this.f8642a.a(th, thread, str, j, 4, 8, z);
        v.d.AbstractC0171d.b f2 = a2.f();
        String c2 = this.f8645d.c();
        if (c2 != null) {
            v.d.AbstractC0171d.AbstractC0182d.a b2 = v.d.AbstractC0171d.AbstractC0182d.b();
            b2.a(c2);
            f2.a(b2.a());
        } else {
            com.google.firebase.crashlytics.c.b.a().a("No log data to include with this event.");
        }
        List<v.b> a3 = a(this.f8646e.a());
        if (!a3.isEmpty()) {
            v.d.AbstractC0171d.a.AbstractC0172a e2 = a2.a().e();
            e2.a(com.google.firebase.crashlytics.c.j.w.a(a3));
            f2.a(e2.a());
        }
        this.f8643b.a(f2.a(), str2, equals);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(c.e.a.b.g.h<q> hVar) {
        if (!hVar.e()) {
            com.google.firebase.crashlytics.c.b.a().a("Crashlytics report could not be enqueued to DataTransport", hVar.a());
            return false;
        }
        q b2 = hVar.b();
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        a2.a("Crashlytics report successfully enqueued to DataTransport: " + b2.b());
        this.f8643b.a(b2.b());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> a(Executor executor, u uVar) {
        if (uVar == u.NONE) {
            com.google.firebase.crashlytics.c.b.a().a("Send via DataTransport disabled. Removing DataTransport reports.");
            this.f8643b.a();
            return c.e.a.b.g.k.a((Object) null);
        }
        List<q> b2 = this.f8643b.b();
        ArrayList arrayList = new ArrayList();
        for (q qVar : b2) {
            if (qVar.a().i() != v.e.NATIVE || uVar == u.ALL) {
                arrayList.add(this.f8644c.a(qVar).a(executor, f0.a(this)));
            } else {
                com.google.firebase.crashlytics.c.b.a().a("Send native reports via DataTransport disabled. Removing DataTransport reports.");
                this.f8643b.a(qVar.b());
            }
        }
        return c.e.a.b.g.k.a((Collection<? extends c.e.a.b.g.h<?>>) arrayList);
    }

    public void a() {
        this.f8647f = null;
    }

    public void a(long j) {
        this.f8643b.a(this.f8647f, j);
    }

    public void a(String str, long j) {
        this.f8647f = str;
        this.f8643b.a(this.f8642a.a(str, j));
    }

    public void a(String str, List<c0> list) {
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : list) {
            v.c.b c2 = c0Var.c();
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        com.google.firebase.crashlytics.c.m.g gVar = this.f8643b;
        v.c.a c3 = v.c.c();
        c3.a(com.google.firebase.crashlytics.c.j.w.a(arrayList));
        gVar.a(str, c3.a());
    }

    public void a(Throwable th, Thread thread, long j) {
        a(th, thread, "crash", j, true);
    }

    public void b() {
        String str = this.f8647f;
        if (str == null) {
            com.google.firebase.crashlytics.c.b.a().a("Could not persist user ID; no current session");
            return;
        }
        String b2 = this.f8646e.b();
        if (b2 == null) {
            com.google.firebase.crashlytics.c.b.a().a("Could not persist user ID; no user ID available");
        } else {
            this.f8643b.a(b2, str);
        }
    }

    public void b(Throwable th, Thread thread, long j) {
        a(th, thread, "error", j, false);
    }

    public void c() {
        this.f8643b.a();
    }
}
