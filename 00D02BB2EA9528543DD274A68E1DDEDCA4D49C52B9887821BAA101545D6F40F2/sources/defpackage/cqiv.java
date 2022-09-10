package defpackage;

import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqiv  reason: default package */
/* loaded from: classes.dex */
public final class cqiv {
    public final List<cqix<?>> a = new ArrayList();

    public final <T extends cqkp> void a(cqiw<T> cqiwVar, T t) {
        dbsk.t(cqiwVar, "Null layout provided");
        dbsk.t(t, "Null viewModel provided");
        e(cqgr.fT(cqiwVar, t));
    }

    public final <T extends cqkp> void b(cqiw<T> cqiwVar, T t, boolean z) {
        dbsk.t(t, "Null viewModel provided");
        e(cqix.d(cqiwVar, t, z));
    }

    public final void c(cqiw<cqkp> cqiwVar) {
        a(cqiwVar, cqkp.T);
    }

    public final void d(cqiw<cqkp> cqiwVar, boolean z) {
        b(cqiwVar, cqkp.T, z);
    }

    public final void e(cqix<?> cqixVar) {
        dbsk.t(cqixVar, "Null item provided");
        this.a.add(cqixVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqiv) {
            return ((cqiv) obj).a.equals(this.a);
        }
        return false;
    }

    public final <T extends cqkp> void f(cqiw<T> cqiwVar, Iterable<? extends T> iterable) {
        dbsk.m(!cqnw.a(iterable), "A Proxy of the ViewModel can't be used to iterate over list. Please use viewModel argument in createListAdapter instead of ModelProxy().");
        for (T t : iterable) {
            a(cqiwVar, t);
        }
    }

    public final void g(Iterable<cqix<?>> iterable) {
        dbsk.m(!cqnw.a(iterable), "A Proxy of the ViewModel can't be used to iterate over list. Please use viewModel argument in createListAdapter instead of ModelProxy().");
        for (cqix<?> cqixVar : iterable) {
            e(cqixVar);
        }
    }

    public final ListAdapter h(cqkj cqkjVar) {
        cqlm cqlmVar = new cqlm(cqkjVar);
        for (cqix<?> cqixVar : this.a) {
            cqlmVar.a(cqixVar);
        }
        return cqlmVar;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return this.a.size();
    }
}
