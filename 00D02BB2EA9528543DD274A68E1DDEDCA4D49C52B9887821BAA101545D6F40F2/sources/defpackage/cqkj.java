package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqkj  reason: default package */
/* loaded from: classes.dex */
public class cqkj {
    public final cqkd a;
    public final cqhr b;
    public final cqhw c;
    public final Context d;
    public final dbyy<cqiw<?>, Integer> e = dccf.a();

    public cqkj(Context context, cqkd cqkdVar, cqhr cqhrVar, cqhw cqhwVar) {
        dbsk.s(context);
        this.d = context;
        dbsk.s(cqkdVar);
        this.a = cqkdVar;
        dbsk.s(cqhrVar);
        this.b = cqhrVar;
        this.c = cqhwVar;
    }

    public final <T extends cqkp> cqkf<T> a(cqiw<T> cqiwVar, View view) {
        dbsk.s(view);
        return cqkg.k(this.b.a(cqiwVar, this.c.f(cqiwVar), null, false, view, null, true, null));
    }

    public final void b(final List<Pair<cqiw<?>, Integer>> list, final int i, final deig<Void> deigVar, final ViewGroup viewGroup) {
        if (deigVar.isCancelled()) {
            return;
        }
        Pair<cqiw<?>, Integer> pair = list.get(i);
        ArrayList arrayList = new ArrayList(((Integer) pair.second).intValue());
        for (int i2 = 0; i2 < ((Integer) pair.second).intValue(); i2++) {
            arrayList.add(c((cqiw) pair.first, viewGroup));
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((cqkf) arrayList.get(i3)).i();
        }
        if (i == list.size() - 1) {
            deigVar.j(null);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(this, list, i, deigVar, viewGroup) { // from class: cqki
                private final cqkj a;
                private final List b;
                private final int c;
                private final deig d;
                private final ViewGroup e;

                {
                    this.a = this;
                    this.b = list;
                    this.c = i;
                    this.d = deigVar;
                    this.e = viewGroup;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(this.b, this.c + 1, this.d, this.e);
                }
            });
        }
    }

    public final <T extends cqkp> cqkf<T> c(cqiw<T> cqiwVar, @dzsi ViewGroup viewGroup) {
        return d(cqiwVar, viewGroup, true);
    }

    public final <T extends cqkp> cqkf<T> d(cqiw<T> cqiwVar, @dzsi ViewGroup viewGroup, boolean z) {
        cqkf<T> g = g(cqiwVar, viewGroup, z);
        return g != null ? g : cqkg.k(f(cqiwVar, viewGroup, z, true, null));
    }

    public final <T extends cqkp> cqkf<T> e(cqiw<T> cqiwVar) {
        return c(cqiwVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <V extends cqkp> cqjz<V> f(cqiw<V> cqiwVar, @dzsi ViewGroup viewGroup, boolean z, boolean z2, @dzsi cqmm<?, V> cqmmVar) {
        cqhr cqhrVar = this.b;
        return cqhrVar.a(cqiwVar, cqhrVar.a.f(cqiwVar), viewGroup, z, null, null, z2, cqmmVar);
    }

    @dzsi
    public final <T extends cqkp> cqkf<T> g(cqiw<T> cqiwVar, ViewGroup viewGroup, boolean z) {
        cqkf<T> d = this.c.d(cqiwVar);
        if (d != null) {
            this.a.d(viewGroup, d.c(), z);
        }
        return d;
    }

    @Deprecated
    public final void h(View view) {
        this.c.h(view);
    }
}
