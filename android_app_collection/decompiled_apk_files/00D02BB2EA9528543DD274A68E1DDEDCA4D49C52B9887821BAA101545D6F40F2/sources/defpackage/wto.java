package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wto  reason: default package */
/* loaded from: classes7.dex */
public class wto {
    public final Executor a;
    @dzsi
    wtl b;
    @dzsi
    public Map<String, bxzt> c;
    @dzsi
    public dehn<Map<String, bxzt>> d;
    private final dxio<akfa> e;
    private final bxzw f;
    @dzsi
    private dehn<bxzs> g;
    private final Set<wtn> h = new HashSet();

    public wto(Executor executor, dxio<akfa> dxioVar, bxzw bxzwVar) {
        this.a = executor;
        this.e = dxioVar;
        this.f = bxzwVar;
    }

    public final void a() {
        b(true);
    }

    public final void b(boolean z) {
        bvrj.UI_THREAD.c();
        dehn<Map<String, bxzt>> dehnVar = this.d;
        if (dehnVar != null && !dehnVar.isDone()) {
            dehnVar.cancel(false);
        }
        this.d = null;
        this.c = null;
        if (z) {
            f(wtl.INVALIDATED);
            return;
        }
        synchronized (this) {
            this.b = wtl.INVALIDATED;
        }
    }

    public final dehn<Map<String, bxzt>> c() {
        bvrj.UI_THREAD.c();
        btlu j = this.e.a().j();
        if (j == null || !j.m()) {
            Map<String, bxzt> map = this.c;
            if (map != null) {
                return deha.a(map);
            }
            dehn<Map<String, bxzt>> dehnVar = this.d;
            if (dehnVar != null) {
                return dehnVar;
            }
            this.c = null;
            dehn<List<bxzt>> a = this.f.a();
            deig d = deig.d();
            deha.q(a, new wtj(this, d), this.a);
            this.d = d;
            f(wtl.LOADING_STARTED);
            return d;
        }
        return deha.a(dcmn.a);
    }

    public final dbsg<Collection<bxzt>> d() {
        dehn<Map<String, bxzt>> c = c();
        if (c.isDone()) {
            try {
                return dbsg.i(c.get().values());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return dbpy.a;
    }

    public final void e(final wtm wtmVar) {
        synchronized (this.h) {
            this.h.add(new wtn(wtmVar));
            final wtl wtlVar = this.b;
            if (wtlVar != null) {
                this.a.execute(new Runnable(wtmVar, wtlVar) { // from class: wth
                    private final wtm a;
                    private final wtl b;

                    {
                        this.a = wtmVar;
                        this.b = wtlVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.Rh(this.b);
                    }
                });
            }
        }
    }

    public final void f(final wtl wtlVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.h) {
            Iterator<wtn> it = this.h.iterator();
            while (it.hasNext()) {
                wtm wtmVar = (wtm) it.next().get();
                if (wtmVar == null) {
                    it.remove();
                } else {
                    arrayList.add(wtmVar);
                }
            }
            this.b = wtlVar;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            final wtm wtmVar2 = (wtm) arrayList.get(i);
            this.a.execute(new Runnable(wtmVar2, wtlVar) { // from class: wti
                private final wtm a;
                private final wtl b;

                {
                    this.a = wtmVar2;
                    this.b = wtlVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.Rh(this.b);
                }
            });
        }
    }

    @dzsi
    public final void h(String str, boolean z) {
        bvrj.UI_THREAD.c();
        Map<String, bxzt> map = this.c;
        if (this.g != null || map == null || map.get(str) == null) {
            return;
        }
        dehn<bxzs> b = this.f.b(str, z);
        this.g = b;
        deha.q(b, new wtk(this, map, str), this.a);
        f(wtl.UPDATE_STARTED);
    }
}
