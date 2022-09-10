package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.lang.reflect.Array;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqhr  reason: default package */
/* loaded from: classes.dex */
public final class cqhr {
    public final cqhw a;
    private final List<cqhp> b = dchl.a();
    private final cqkv c;
    private final cqkd d;
    private final cqho e;

    public cqhr(cqho cqhoVar, cqhw cqhwVar, cqkv cqkvVar, cqkd cqkdVar) {
        dbsk.s(cqhoVar);
        this.e = cqhoVar;
        dbsk.s(cqkvVar);
        this.c = cqkvVar;
        dbsk.s(cqkdVar);
        this.d = cqkdVar;
        this.a = cqhwVar;
    }

    private final void b(cqhp cqhpVar) {
        cqhpVar.k = null;
        cqhpVar.a.a();
        cqhpVar.b = null;
        cqhpVar.c.a();
        cqhpVar.d.clear();
        cqhpVar.e = 0;
        cqhpVar.f = null;
        cqhpVar.g = null;
        cqhpVar.h = 0;
        cqhpVar.i = 0;
        cqhpVar.j = null;
        synchronized (this.b) {
            this.b.add(cqhpVar);
        }
    }

    private final void c(cqhq cqhqVar, cqjz<?> cqjzVar) {
        for (cqnf<?> cqnfVar : cqhqVar.a) {
            if (cqnfVar != null && cqnfVar.c()) {
                cqnfVar.d(this.c, cqjzVar);
            }
        }
    }

    private static final <V extends cqkp> cqja<V> d(cqhq cqhqVar) {
        int i = cqhqVar.e;
        return new cqja<>(i > 0 ? new cqiz[i] : cqiz.a);
    }

    private static final <V extends cqkp> void e(List<cqnf<V>> list, cqja<V> cqjaVar, cqjz<V> cqjzVar) {
        int i = 0;
        for (cqnf<V> cqnfVar : list) {
            if (cqnfVar != null) {
                if (cqnfVar.c()) {
                    cqiz<V>[] cqizVarArr = cqjaVar.c;
                } else {
                    cqjaVar.b[i] = cqnfVar.e(cqjzVar);
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [cqmp<T>[], cqmp[]] */
    /* JADX WARN: Type inference failed for: r1v42, types: [cqmp<T>[], cqmp[]] */
    /* JADX WARN: Type inference failed for: r26v0, types: [cqhr] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object[], java.lang.Object] */
    public final <V extends cqkp> cqjz<V> a(cqiw<V> cqiwVar, cqmj<V> cqmjVar, @dzsi ViewGroup viewGroup, boolean z, @dzsi View view, cqic<V> cqicVar, boolean z2, @dzsi cqmm<?, V> cqmmVar) {
        List<cqhp> list;
        cqhp remove;
        cqjz<V> cqjzVar;
        int i;
        View view2;
        cqjz<V> a;
        synchronized (this.b) {
            if (this.b.isEmpty()) {
                remove = new cqhp();
            } else {
                remove = this.b.remove(list.size() - 1);
            }
        }
        cqhp cqhpVar = remove;
        cqhpVar.k = cqmjVar;
        cqhpVar.e = cqmjVar.b();
        cqhpVar.b = cqmmVar == null ? null : (cqjb<?, V>) cqmmVar.b;
        cqhpVar.b(cqmjVar.c, false);
        boolean z3 = true;
        if (cqmmVar != null) {
            cqhpVar.b(cqmmVar.c, true);
        }
        if (cqhpVar.j != null) {
            cqhpVar.a.b();
            if (cqhpVar.a()) {
                cqhpVar.c.b();
            }
        }
        try {
            cqnj<?> cqnjVar = cqhpVar.j;
            if (view != null || cqicVar != null || (cqmjVar instanceof cqmk) || cqnjVar == null) {
                boolean z4 = view == null;
                View a2 = view != null ? view : cqmjVar.a(this.d, cqhpVar.h, cqhpVar.i, cqhpVar.g, viewGroup, z);
                boolean z5 = !z4;
                if (cqjz.g(a2) != null) {
                    z3 = false;
                }
                dbsk.l(z3);
                cqja d = d(cqhpVar.a);
                cqjb<?, ?> cqjbVar = cqhpVar.b;
                if (cqjbVar != null) {
                    cqhe cqheVar = new cqhe(a2, this.e, d(cqhpVar.c), cqjbVar, d, cqhpVar.c(), cqiwVar, cqhpVar.e, z5);
                    e(cqhpVar.c.a, cqheVar.a, cqheVar);
                    cqjzVar = cqheVar;
                } else if (!z2) {
                    cqho cqhoVar = this.e;
                    cqjg c = cqhpVar.c();
                    int i2 = cqhpVar.e;
                    cqjzVar = new cqjz<>(a2, cqhoVar, d, c, cqiwVar, z5);
                } else {
                    cqjzVar = new cqjf<>(a2, this.e, d, cqhpVar.c(), cqiwVar, cqhpVar.e, z5);
                }
                e(cqhpVar.a.a, cqjzVar.d, cqjzVar);
                a2.setTag(R.id.view_properties, cqjzVar);
                c(cqhpVar.a, cqjzVar);
                if (cqhpVar.a()) {
                    c(cqhpVar.c, cqjzVar);
                }
                if (a2.getId() == -1 && cqhpVar.f == null) {
                    a2.setId(cqicVar == null ? cqir.a() : cqicVar.getId());
                    a2.setSaveEnabled(false);
                }
                int size = cqhpVar.d.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    cqnm<?> cqnmVar = cqhpVar.d.get(i4);
                    if (cqnmVar instanceof cqmm) {
                        cqmm cqmmVar2 = (cqmm) cqnmVar;
                        a = this.e.g().f(cqmmVar2.a, (ViewGroup) a2, true, false, cqmmVar2);
                    } else if (cqnmVar instanceof cqmj) {
                        if (view != null) {
                            view2 = ((ViewGroup) view).getChildAt(i3);
                            i = i3 + 1;
                        } else {
                            i = i3;
                            view2 = null;
                        }
                        a = a(cqiwVar, (cqmj) cqnmVar, (ViewGroup) a2, true, view2, null, false, null);
                        i3 = i;
                    } else {
                        String valueOf = String.valueOf(cqnmVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
                        sb.append("Internal error, child type not supported: ");
                        sb.append(valueOf);
                        throw new RuntimeException(sb.toString());
                    }
                    if (a.c.getParent() == null && !(a2 instanceof ViewGroup)) {
                        String name = a2.getClass().getName();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 156);
                        sb2.append("Could not add child View to View of type ");
                        sb2.append(name);
                        sb2.append(" - this is not a ViewGroup. Check your brackets. You may be including a member of a ViewGroup in a previous member.");
                        throw new cqlx(sb2.toString());
                    }
                }
                return cqjzVar;
            }
            List<cqnf<?>> list2 = cqhpVar.a.c;
            cqmp<?>[] cqmpVarArr = cqnjVar.c;
            int size2 = list2.size();
            if (size2 != 0) {
                int length = cqmpVarArr.length;
                ?? r2 = (Object[]) Array.newInstance(cqmp.class, size2 + length);
                list2.toArray(r2);
                if (length > 0) {
                    System.arraycopy(cqmpVarArr, 0, r2, size2, length);
                }
                cqmpVarArr = r2;
            }
            cqjb<?, Boolean> cqjbVar2 = cqnjVar.a;
            cqmk cqmkVar = new cqmk(cqmjVar, z2, cqmmVar, cqmpVarArr);
            cqmkVar.g(cqjv.d(cqfe.VIEW_STUB_STUB_IF, cqjbVar2));
            return a(cqiwVar, cqmkVar, viewGroup, z, null, null, z2, cqmmVar);
        } finally {
            b(cqhpVar);
        }
    }
}
