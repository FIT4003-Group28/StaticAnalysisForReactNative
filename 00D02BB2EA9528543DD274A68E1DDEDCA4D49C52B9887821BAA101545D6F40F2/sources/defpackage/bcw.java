package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bcw  reason: default package */
/* loaded from: classes3.dex */
public final class bcw implements bct, bfh {
    private final Context e;
    private final bbj f;
    private final WorkDatabase g;
    private final List<bcx> h;
    private final bif j;
    public final Map<String, bdr> b = new HashMap();
    public final Map<String, bdr> a = new HashMap();
    public final Set<String> c = new HashSet();
    private final List<bct> i = new ArrayList();
    public final Object d = new Object();

    static {
        bbz.f("Processor");
    }

    public bcw(Context context, bbj bbjVar, bif bifVar, WorkDatabase workDatabase, List list) {
        this.e = context;
        this.f = bbjVar;
        this.j = bifVar;
        this.g = workDatabase;
        this.h = list;
    }

    public static void g(bdr bdrVar) {
        boolean z;
        if (bdrVar != null) {
            bdrVar.g = true;
            bdrVar.b();
            dehn<bbx> dehnVar = bdrVar.f;
            if (dehnVar != null) {
                z = dehnVar.isDone();
                bdrVar.f.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = bdrVar.c;
            if (listenableWorker == null || z) {
                bbz.e().a(new Throwable[0]);
            } else {
                listenableWorker.d();
            }
            bbz.e().a(new Throwable[0]);
            return;
        }
        bbz.e().a(new Throwable[0]);
    }

    @Override // defpackage.bct
    public final void a(String str, boolean z) {
        synchronized (this.d) {
            this.b.remove(str);
            bbz.e().a(new Throwable[0]);
            for (bct bctVar : this.i) {
                bctVar.a(str, z);
            }
        }
    }

    public final boolean b(String str, bcr bcrVar) {
        synchronized (this.d) {
            if (c(str)) {
                bbz.e().a(new Throwable[0]);
                return false;
            }
            bdq bdqVar = new bdq(this.e, this.f, this.j, this, this.g, str);
            bdqVar.f = this.h;
            if (bcrVar != null) {
                bdqVar.g = bcrVar;
            }
            bdr bdrVar = new bdr(bdqVar);
            bid<Boolean> bidVar = bdrVar.e;
            bidVar.Pk(new bcv(this, str, bidVar), this.j.c);
            this.b.put(str, bdrVar);
            this.j.a.execute(bdrVar);
            bbz.e().a(new Throwable[0]);
            return true;
        }
    }

    public final boolean c(String str) {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.containsKey(str) && !this.a.containsKey(str)) {
                z = false;
            }
        }
        return z;
    }

    public final void d(bct bctVar) {
        synchronized (this.d) {
            this.i.add(bctVar);
        }
    }

    public final void e(bct bctVar) {
        synchronized (this.d) {
            this.i.remove(bctVar);
        }
    }

    public final void f() {
        synchronized (this.d) {
            if (this.a.isEmpty()) {
                this.e.startService(bfk.d(this.e));
            }
        }
    }
}
