package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6754a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.e f6755b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.i.w.j.c f6756c;

    /* renamed from: d  reason: collision with root package name */
    private final s f6757d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f6758e;

    /* renamed from: f  reason: collision with root package name */
    private final c.e.a.a.i.x.b f6759f;

    /* renamed from: g  reason: collision with root package name */
    private final c.e.a.a.i.y.a f6760g;

    public m(Context context, com.google.android.datatransport.runtime.backends.e eVar, c.e.a.a.i.w.j.c cVar, s sVar, Executor executor, c.e.a.a.i.x.b bVar, c.e.a.a.i.y.a aVar) {
        this.f6754a = context;
        this.f6755b = eVar;
        this.f6756c = cVar;
        this.f6757d = sVar;
        this.f6758e = executor;
        this.f6759f = bVar;
        this.f6760g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(m mVar, com.google.android.datatransport.runtime.backends.g gVar, Iterable iterable, c.e.a.a.i.m mVar2, int i) {
        if (gVar.b() == g.a.TRANSIENT_ERROR) {
            mVar.f6756c.b(iterable);
            mVar.f6757d.a(mVar2, i + 1);
            return null;
        }
        mVar.f6756c.a(iterable);
        if (gVar.b() == g.a.OK) {
            mVar.f6756c.a(mVar2, mVar.f6760g.a() + gVar.a());
        }
        if (!mVar.f6756c.c(mVar2)) {
            return null;
        }
        mVar.f6757d.a(mVar2, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(m mVar, c.e.a.a.i.m mVar2, int i, Runnable runnable) {
        try {
            try {
                c.e.a.a.i.x.b bVar = mVar.f6759f;
                c.e.a.a.i.w.j.c cVar = mVar.f6756c;
                cVar.getClass();
                bVar.a(k.a(cVar));
                if (!mVar.a()) {
                    mVar.f6759f.a(l.a(mVar, mVar2, i));
                } else {
                    mVar.a(mVar2, i);
                }
            } catch (c.e.a.a.i.x.a unused) {
                mVar.f6757d.a(mVar2, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    void a(c.e.a.a.i.m mVar, int i) {
        com.google.android.datatransport.runtime.backends.g a2;
        com.google.android.datatransport.runtime.backends.m a3 = this.f6755b.a(mVar.a());
        Iterable<c.e.a.a.i.w.j.i> iterable = (Iterable) this.f6759f.a(i.a(this, mVar));
        if (!iterable.iterator().hasNext()) {
            return;
        }
        if (a3 == null) {
            c.e.a.a.i.u.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", mVar);
            a2 = com.google.android.datatransport.runtime.backends.g.c();
        } else {
            ArrayList arrayList = new ArrayList();
            for (c.e.a.a.i.w.j.i iVar : iterable) {
                arrayList.add(iVar.a());
            }
            f.a c2 = com.google.android.datatransport.runtime.backends.f.c();
            c2.a(arrayList);
            c2.a(mVar.b());
            a2 = a3.a(c2.a());
        }
        this.f6759f.a(j.a(this, a2, iterable, mVar, i));
    }

    public void a(c.e.a.a.i.m mVar, int i, Runnable runnable) {
        this.f6758e.execute(h.a(this, mVar, i, runnable));
    }

    boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f6754a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
