package defpackage;

import android.util.Pair;
import android.view.View;
import com.google.android.youtube.R;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akfw  reason: default package */
/* loaded from: classes.dex */
public final class akfw implements ajsj, ajyy {
    private final akge a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final ReferenceQueue d = new ReferenceQueue();

    public akfw(akge akgeVar, ajsk ajskVar, ajyz ajyzVar) {
        this.a = akgeVar;
        ajskVar.a.add(this);
        ajyzVar.a.add(this);
        akfu akfuVar = new akfu(this);
        akgeVar.a.add(akfuVar);
        akfq akfqVar = akgeVar.d;
        if (akfqVar != null) {
            akfuVar.lf(akfqVar);
        }
    }

    public static String c(View view) {
        if (view == null) {
            return null;
        }
        return (String) view.getTag(R.id.tooltip_registry_id);
    }

    private final void h(avjf avjfVar, View view) {
        if (avjfVar == null || view == null) {
            return;
        }
        akge akgeVar = this.a;
        akfp k = akgeVar.k(avjfVar);
        k.a = view;
        k.l();
        akgeVar.c(k.a());
    }

    private final void i() {
        akfv akfvVar = (akfv) this.d.poll();
        while (akfvVar != null) {
            akfv akfvVar2 = (akfv) this.c.get(akfvVar.a);
            if (akfvVar2 != null && akfvVar2.get() == null) {
                this.c.remove(akfvVar.a);
            }
            akfvVar = (akfv) this.d.poll();
        }
    }

    @Override // defpackage.ajsj
    public final void a(Object obj, View view) {
        String j = ggs.j(obj);
        if (j == null || j.isEmpty()) {
            return;
        }
        d(j, view);
    }

    @Override // defpackage.ajyy
    public final void b(Object obj, View view) {
        String j = ggs.j(obj);
        if (j == null || j.isEmpty()) {
            return;
        }
        d(j, view);
    }

    public final void d(String str, View view) {
        avjf avjfVar;
        akfv akfvVar;
        String c = c(view);
        if (c != null && !c.equals(str) && (akfvVar = (akfv) this.c.get(c)) != null && view.equals(akfvVar.get())) {
            this.c.remove(c);
        }
        view.setTag(R.id.tooltip_registry_id, str);
        if (str != null && !str.isEmpty()) {
            this.c.put(str, new akfv(view, this.d, str));
            Pair pair = (Pair) this.b.get(str);
            if (pair == null || !((ampt) pair.second).a((avjf) pair.first)) {
                this.b.remove(str);
                avjfVar = null;
            } else {
                avjfVar = (avjf) pair.first;
            }
            h(avjfVar, view);
        }
        i();
    }

    public final void e(avjf avjfVar, ampt amptVar) {
        f(avjfVar, amptVar, true);
    }

    public final void f(avjf avjfVar, ampt amptVar, boolean z) {
        String str = avjfVar.d;
        WeakReference weakReference = (WeakReference) this.c.get(str);
        View view = null;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            if (view2 == null || !str.equals(c(view2))) {
                this.c.remove(str);
            } else if (lj.aj(view2)) {
                view = view2;
            }
        }
        if (!z || view == null || view.isDirty() || !amptVar.a(avjfVar)) {
            this.b.put(avjfVar.d, new Pair(avjfVar, amptVar));
        } else {
            h(avjfVar, view);
        }
        i();
    }

    public final void g(String str) {
        this.b.remove(str);
        i();
    }
}
