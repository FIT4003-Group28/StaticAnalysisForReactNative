package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: beq  reason: default package */
/* loaded from: classes3.dex */
public abstract class beq<T> implements bej<T> {
    public final List<String> a = new ArrayList();
    public T b;
    public final bfb<T> c;
    public bep d;

    public beq(bfb<T> bfbVar) {
        this.c = bfbVar;
    }

    @Override // defpackage.bej
    public final void a(T t) {
        this.b = t;
        e(this.d, t);
    }

    public abstract boolean b(bgh bghVar);

    public abstract boolean c(T t);

    public final void d(bep bepVar) {
        if (this.d != bepVar) {
            this.d = bepVar;
            e(bepVar, this.b);
        }
    }

    public final void e(bep bepVar, T t) {
        if (this.a.isEmpty() || bepVar == null) {
            return;
        }
        if (t == null || c(t)) {
            List<String> list = this.a;
            synchronized (((bem) bepVar).b) {
                bel belVar = ((bem) bepVar).a;
                if (belVar != null) {
                    belVar.Nj(list);
                }
            }
            return;
        }
        List<String> list2 = this.a;
        synchronized (((bem) bepVar).b) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                if (((bem) bepVar).c(str)) {
                    bbz.e().a(new Throwable[0]);
                    arrayList.add(str);
                }
            }
            bel belVar2 = ((bem) bepVar).a;
            if (belVar2 != null) {
                belVar2.Ni(arrayList);
            }
        }
    }
}
